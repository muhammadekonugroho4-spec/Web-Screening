# PROMPT OPENCODE — LANGKAH 5: PINDAHKAN SCREENER UTAMA KE FASTAPI

## MISI
Buat halaman Screener Utama di FastAPI dengan fitur lengkap:
- 38 filter dropdown (dari MASTER_FILTERS di config_web.json)
- Pencarian ticker & broker
- Filter numerik (PER, PBV, Volume, Change %, Market Cap, dll)
- Filter fundamental Exodus (11 filter)
- 5 mode tampilan tabel (Ringkasan, Bandarmologi, Teknikal, Fundamental, Semua Kolom)
- Pagination (20/50/100 per halaman)
- Download CSV

## ATURAN KERAS
1. DILARANG mengubah `app.py` sama sekali.
2. Hanya boleh MEMBUAT/MODIFIKASI file di folder `backend/`.
3. Gunakan data dari `backend.core.data_loader` dan config dari `config_web.json`.
4. JANGAN menjalankan Streamlit.
5. JANGAN commit apa pun — user yang memutuskan.

## STRUKTUR YANG HARUS DIBUAT/DIMODIFIKASI

### 1. `backend/routes/api.py` (MODIFIKASI — tambah endpoint screener)

Tambahkan endpoint baru:

```python
from pydantic import BaseModel
from typing import Dict, List, Optional

class ScreenerRequest(BaseModel):
    filters: Dict[str, str]  # {"Kategori": "Big Cap (Lapis 1)", "RSI (14D)": "> 50 (Bullish)"}
    numeric_filters: Dict[str, Dict[str, float]]  # {"PER (x)": {"min": 0, "max": 20}}
    search_ticker: Optional[str] = ""
    search_broker: Optional[str] = ""
    price_min: Optional[float] = 0
    price_max: Optional[float] = 0
    per_page: Optional[int] = 50
    page: Optional[int] = 1

@router.post("/screener")
async def screener(request: ScreenerRequest):
    """Filter saham dengan berbagai kriteria."""
    from backend.core.data_loader import load_data_saham_raw
    from backend.core.formatter import format_angka, format_pct, format_singkat_rp, format_singkat_vol
    
    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia", "data": [], "total": 0}
    
    # Load config
    import json
    with open("config_web.json") as f:
        config = json.load(f)
    MASTER_FILTERS = config["MASTER_FILTERS"]
    
    # Apply filters
    df_filtered = df.copy()
    
    # 1. Filter dropdown
    for key, value in request.filters.items():
        if value == "Semua" or not value:
            continue
        
        if key == "RSI (14D)":
            if "RSI (14D)" in df_filtered.columns:
                if "Bullish" in value:
                    df_filtered = df_filtered[pd.to_numeric(df_filtered["RSI (14D)"], errors="coerce") > 50]
                else:
                    df_filtered = df_filtered[pd.to_numeric(df_filtered["RSI (14D)"], errors="coerce") <= 50]
        elif key == "Total Score":
            if "Total Score" in df_filtered.columns:
                df_filtered = df_filtered[df_filtered["Total Score"] == int(value)]
        elif key == "Kategori" and value == "Mid Cap (Lapis 2) + Small Cap (Lapis 3)":
            if "Kategori" in df_filtered.columns:
                df_filtered = df_filtered[df_filtered["Kategori"].isin(["Mid Cap (Lapis 2)", "Small Cap (Lapis 3)"])]
        elif key == "Kelas Perubahan":
            if "Change (%)" in df_filtered.columns:
                chg = pd.to_numeric(df_filtered["Change (%)"], errors="coerce")
                if "ARA" in value:
                    df_filtered = df_filtered[chg > 10]
                elif "Naik Kuat" in value:
                    df_filtered = df_filtered[(chg >= 5) & (chg <= 10)]
                elif "Naik Tipis" in value:
                    df_filtered = df_filtered[(chg > 0) & (chg < 5)]
                elif "Stagnan" in value:
                    df_filtered = df_filtered[chg == 0]
                elif "Turun Tipis" in value:
                    df_filtered = df_filtered[(chg <= 0) & (chg >= -5)]
                elif "Turun Tajam" in value:
                    df_filtered = df_filtered[chg < -5]
        elif key in df_filtered.columns:
            df_filtered = df_filtered[df_filtered[key] == value]
    
    # 2. Filter numerik
    for col, range_filter in request.numeric_filters.items():
        if col not in df_filtered.columns:
            continue
        col_numeric = pd.to_numeric(df_filtered[col], errors="coerce")
        if range_filter.get("min") is not None:
            df_filtered = df_filtered[col_numeric >= range_filter["min"]]
        if range_filter.get("max") is not None:
            df_filtered = df_filtered[col_numeric <= range_filter["max"]]
    
    # 3. Search ticker & broker
    if request.search_ticker:
        df_filtered = df_filtered[df_filtered["Ticker"].astype(str).str.contains(request.search_ticker.upper(), na=False)]
    if request.search_broker and "Broksum" in df_filtered.columns:
        df_filtered = df_filtered[df_filtered["Broksum"].astype(str).str.contains(request.search_broker.upper(), na=False)]
    
    # 4. Filter harga
    if request.price_min > 0:
        df_filtered = df_filtered[pd.to_numeric(df_filtered["Harga (Rp)"], errors="coerce") >= request.price_min]
    if request.price_max > 0:
        df_filtered = df_filtered[pd.to_numeric(df_filtered["Harga (Rp)"], errors="coerce") <= request.price_max]
    
    # Pagination
    total = len(df_filtered)
    per_page = request.per_page or 50
    page = request.page or 1
    start_idx = (page - 1) * per_page
    end_idx = start_idx + per_page
    df_page = df_filtered.iloc[start_idx:end_idx]
    
    # Convert to dict
    data = df_page.to_dict("records")
    
    return {
        "data": data,
        "total": total,
        "page": page,
        "per_page": per_page,
        "total_pages": (total + per_page - 1) // per_page,
    }

@router.get("/screener/config")
async def screener_config():
    """Return MASTER_FILTERS untuk dropdown."""
    import json
    with open("config_web.json") as f:
        config = json.load(f)
    return config["MASTER_FILTERS"]
```

### 2. `backend/templates/screener.html` (BUAT BARU)

Buat halaman Screener dengan fitur lengkap:
- Panel filter (38 dropdown dikelompokkan)
- Filter numerik (PER, PBV, Volume, Change %, Market Cap, dll)
- Pencarian ticker & broker
- Filter harga
- 5 mode tampilan tabel
- Pagination
- Download CSV
- Responsive design

HTML harus:
- Gunakan Tailwind CSS dark theme (#0f172a)
- Fetch `/api/screener/config` untuk load dropdown options
- Fetch `/api/screener` dengan POST saat filter berubah
- Debounce input (tunggu 500ms sebelum fetch)
- Format angka/persen/rupiah di JavaScript
- Download CSV via Blob

### 3. `backend/main.py` (MODIFIKASI — tambah route /screener)

Tambahkan route baru:

```python
@app.get("/screener", response_class=HTMLResponse)
async def screener_page(request: Request):
    """Halaman Screener Utama."""
    return templates.TemplateResponse(request, "screener.html", {})
```

### 4. `backend/templates/index.html` (MODIFIKASI — aktifkan link Screener)

Ubah tombol Screener dari disabled menjadi aktif:

```html
<a href="/screener" class="bg-green-600 hover:bg-green-700 text-white font-bold py-3 px-4 rounded text-center">
    📌 Screener
</a>
```

## IMPLEMENTASI

1. **Baca file yang ada** di `backend/routes/api.py` dan `backend/main.py`.
2. **Modifikasi `backend/routes/api.py`** — tambahkan endpoint `/screener` dan `/screener/config`.
3. **Buat `backend/templates/screener.html`** dengan fitur lengkap.
4. **Modifikasi `backend/main.py`** — tambahkan route `/screener`.
5. **Modifikasi `backend/templates/index.html`** — aktifkan link Screener.
6. **Restart FastAPI** — matikan proses lama, jalankan ulang `bash run_backend.sh`.
7. **Verifikasi**:
   - `curl -X POST http://localhost:8100/api/screener -H "Content-Type: application/json" -d '{"filters": {"Kategori": "Big Cap (Lapis 1)"}}'` → return data
   - `curl http://localhost:8100/api/screener/config` → return MASTER_FILTERS
   - Buka browser: `http://localhost:8100/screener` → halaman tampil
   - Test filter dropdown (Kategori, RSI, dll)
   - Test filter numerik (PER, PBV, Volume)
   - Test pencarian ticker
   - Test pagination
   - Test download CSV
   - Test 5 mode tampilan tabel

## OUTPUT
1. File yang dibuat/dimodifikasi:
   - `backend/routes/api.py` (modifikasi — tambah 2 endpoint)
   - `backend/templates/screener.html` (baru — ±400-500 baris)
   - `backend/main.py` (modifikasi — tambah route)
   - `backend/templates/index.html` (modifikasi — aktifkan link)
2. Tampilkan ringkasan: hasil test API + fitur yang berhasil.
3. JANGAN commit apa pun — user yang memutuskan.

## CATATAN PENTING
- Gunakan `load_data_saham_raw()` dari `backend.core.data_loader`.
- Load `MASTER_FILTERS` dari `config_web.json` (bukan dari Streamlit session_state).
- Debounce input filter (tunggu 500ms sebelum fetch API) untuk performa.
- Pagination harus akurat (total, page, per_page, total_pages).
- Download CSV harus include semua kolom yang ditampilkan.
- Halaman harus responsive (mobile-friendly).