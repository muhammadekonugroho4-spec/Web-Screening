# PROMPT OPENCODE — LANGKAH 6: PINDAHKAN ASISTEN AI & PORTOFOLIO KE FASTAPI

## MISI
Buat 2 halaman kompleks di FastAPI:
1. **Tab 4 - Asisten AI Spesial** (route `/ai`): 9 rumus BSJP screener + Radar Live + AI sidang Top-5 per rumus
2. **Tab 5 - Portofolio Bot** (route `/portfolio`): 9 arena simulator + beli/jual/reset + histori transaksi

Kedua halaman WAJIB LOGIN (cek JWT token dari `/api/auth/me`).

## ATURAN KERAS
1. DILARANG mengubah `app.py` sama sekali.
2. Hanya boleh MEMBUAT/MODIFIKASI file di folder `backend/`.
3. Gunakan logika dari `backend.core.ai_service` dan `backend.core.data_loader`.
4. JANGAN menjalankan Streamlit.
5. JANGAN commit apa pun — user yang memutuskan.

## STRUKTUR YANG HARUS DIBUAT/DIMODIFIKASI

### 1. `backend/routes/api.py` (MODIFIKASI — tambah endpoint AI & Portfolio)

Tambahkan endpoint baru:

```python
from fastapi import Depends, HTTPException, status
from fastapi.security import HTTPBearer, HTTPAuthorizationCredentials
from backend.auth import get_current_user  # fungsi dari Opsi A

security = HTTPBearer()

# ========== TAB 4: ASISTEN AI SPESIAL ==========

@router.get("/ai/rumus")
async def get_ai_rumus(user=Depends(get_current_user)):
    """Return 9 rumus BSJP dengan data saham yang lolos."""
    from backend.core.data_loader import load_data_saham_raw
    
    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}
    
    # Hitung 9 rumus (mirror logika dari app.py PART 12)
    rumus = {}
    
    # RUMUS 1: Smart Money Menyelam
    vwap_kuat = (df.get('Posisi VWAP', '') == 'Di Atas VWAP (Kuat)')
    akumulasi_pro = (df.get('Kekuatan A/D', '') == 'Akumulasi Pro (Smart Money)')
    supply_banjir = df['Kondisi Supply'].astype(str).str.contains('Banjir', na=False) if 'Kondisi Supply' in df.columns else False
    
    rumus[1] = {
        "nama": "Smart Money Menyelam",
        "icon": "🕵️",
        "data": df[
            (akumulasi_pro &
             (df.get('Status Bandar', '') == 'Akumulasi Kuat') &
             vwap_kuat &
             ~supply_banjir)
        ].to_dict('records')
    }
    
    # RUMUS 2-9: (implementasi mirror dari app.py PART 12)
    # ... (opencode harus implementasi semua 9 rumus)
    
    return rumus

@router.post("/ai/sidang")
async def run_ai_sidang(user=Depends(get_current_user)):
    """Jalankan sidang AI Top-5 untuk semua rumus."""
    from backend.core.ai_service import jalankan_sidang_autopilot
    from backend.core.data_loader import load_data_saham_raw
    import os
    
    GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY")
    if not GEMINI_API_KEY:
        raise HTTPException(status_code=400, detail="GEMINI_API_KEY belum dipasang")
    
    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}
    
    # Hitung 9 rumus (sama seperti /ai/rumus)
    rumus_data = await get_ai_rumus(user)
    daftar_rumus = {i: pd.DataFrame(rumus_data[i]["data"]) for i in range(1, 10)}
    
    # Jalankan sidang (tanpa progress bar karena async)
    keranjang, error, laporan = jalankan_sidang_autopilot(
        daftar_rumus, df, GEMINI_API_KEY, 
        progress_bar=None, status_teks=None, tulis_sinyal=False
    )
    
    if error:
        return {"error": error}
    
    return {
        "keranjang": keranjang,
        "laporan": laporan
    }

@router.get("/ai/radar")
async def get_radar_live(user=Depends(get_current_user)):
    """Return data Radar Live dari cache_autopilot.json."""
    from backend.core.data_loader import muat_keranjang_radar_raw
    from datetime import datetime
    
    df = load_data_saham_raw()
    stempel = str(df["Terakhir Update"].iloc[0]) if "Terakhir Update" in df.columns else ""
    
    keranjang, status = muat_keranjang_radar_raw(stempel, "v5.2")
    
    return {
        "keranjang": keranjang,
        "status": status,
        "stempel": stempel
    }

# ========== TAB 5: PORTOFOLIO BOT ==========

@router.get("/portfolio/{rumus_id}")
async def get_portfolio(rumus_id: int, user=Depends(get_current_user)):
    """Return data portfolio untuk rumus tertentu."""
    import pandas as pd
    import os
    
    username = user["username"]
    user_dir = os.path.join("Database", "users", username)
    
    df_porto = pd.DataFrame()
    df_hist = pd.DataFrame()
    df_sinyal = pd.DataFrame()
    
    # Baca file portfolio user
    porto_file = os.path.join(user_dir, f"portofolio_aktif_rumus_{rumus_id}.csv")
    hist_file = os.path.join(user_dir, f"histori_transaksi_rumus_{rumus_id}.csv")
    sinyal_file = os.path.join(user_dir, f"sinyal_ai_rumus_{rumus_id}.csv")
    
    if os.path.exists(porto_file):
        df_porto = pd.read_csv(porto_file)
    if os.path.exists(hist_file):
        df_hist = pd.read_csv(hist_file)
    if os.path.exists(sinyal_file):
        df_sinyal = pd.read_csv(sinyal_file)
    
    # Hitung summary
    total_profit = df_hist["Total_Return_Rp"].sum() if not df_hist.empty and "Total_Return_Rp" in df_hist.columns else 0
    modal_terpakai = df_porto["Total_Modal"].sum() if not df_porto.empty and "Total_Modal" in df_porto.columns else 0
    saldo = 100000000 + total_profit - modal_terpakai
    total_aset = saldo + modal_terpakai
    
    return {
        "saldo": saldo,
        "modal_terpakai": modal_terpakai,
        "total_aset": total_aset,
        "total_profit": total_profit,
        "profit_pct": (total_profit / 100000000 * 100) if total_profit else 0,
        "sinyal": df_sinyal.to_dict('records'),
        "posisi_aktif": df_porto.to_dict('records'),
        "histori": df_hist.sort_values("Tanggal_Jual", ascending=False).to_dict('records') if not df_hist.empty else []
    }

@router.post("/portfolio/beli")
async def execute_beli(user=Depends(get_current_user)):
    """Eksekusi beli semua sinyal via bot_simulator.py."""
    import subprocess
    import sys
    
    username = user["username"]
    
    try:
        proses = subprocess.run(
            [sys.executable, "bot_simulator.py", "--beli-only", "--user", username],
            capture_output=True,
            text=True,
            timeout=1800
        )
        
        if proses.returncode != 0:
            return {"error": "Gagal eksekusi beli", "log": proses.stderr[-2000:]}
        
        return {"success": True, "log": proses.stdout[-2000:]}
    
    except subprocess.TimeoutExpired:
        return {"error": "Timeout (30 menit)"}
    except Exception as e:
        return {"error": str(e)}

@router.post("/portfolio/jual")
async def execute_jual(user=Depends(get_current_user)):
    """Eksekusi jual sore semua posisi via bot_simulator.py."""
    import subprocess
    import sys
    
    username = user["username"]
    
    try:
        proses = subprocess.run(
            [sys.executable, "bot_simulator.py", "--jual-only", "--user", username],
            capture_output=True,
            text=True,
            timeout=1800
        )
        
        if proses.returncode != 0:
            return {"error": "Gagal eksekusi jual", "log": proses.stderr[-2000:]}
        
        return {"success": True, "log": proses.stdout[-2000:]}
    
    except subprocess.TimeoutExpired:
        return {"error": "Timeout (30 menit)"}
    except Exception as e:
        return {"error": str(e)}

@router.post("/portfolio/reset")
async def reset_portfolio(user=Depends(get_current_user)):
    """Reset semua arena ke Rp 100 juta via reset_porto.py."""
    import subprocess
    import sys
    
    username = user["username"]
    
    try:
        proses = subprocess.run(
            [sys.executable, "reset_porto.py", "--yes", "--user", username],
            capture_output=True,
            text=True,
            timeout=120
        )
        
        if proses.returncode != 0:
            return {"error": "Gagal reset", "log": proses.stderr[-1500:]}
        
        return {"success": True, "log": proses.stdout[-1500:]}
    
    except subprocess.TimeoutExpired:
        return {"error": "Timeout (2 menit)"}
    except Exception as e:
        return {"error": str(e)}
```

### 2. `backend/templates/ai.html` (BUAT BARU)

Halaman Asisten AI dengan fitur:
- Login required (redirect ke `/login` jika belum login)
- 2 tab: "🎯 Screener Spesial" dan "🧠 Asisten AI"
- Tab Screener Spesial: dropdown pilih rumus 1-9, tabel saham yang lolos
- Tab Asisten AI: tombol "Sidang AI Top-5 Semua Rumus", progress bar, laporan sidang, tabel Top-5 per rumus
- Radar Live section: tampilkan keranjang radar dari `/api/radar`
- Tailwind dark theme
- Fetch data dari API endpoints

### 3. `backend/templates/portfolio.html` (BUAT BARU)

Halaman Portofolio dengan fitur:
- Login required
- Dropdown pilih arena (Rumus 1-9)
- 4 metric cards: Saldo Kas, Modal Terpakai, Total Aset, P/L Realized
- 3 tab: Sinyal Antrean, Posisi Aktif, Histori Transaksi
- 3 tombol aksi: EKSEKUSI BELI, JUAL SORE, Reset Semua Arena
- Konfirmasi 2x untuk reset
- Tailwind dark theme
- Fetch data dari `/api/portfolio/{rumus_id}`

### 4. `backend/main.py` (MODIFIKASI — tambah route /ai dan /portfolio)

Tambahkan route baru:

```python
@app.get("/ai", response_class=HTMLResponse)
async def ai_page(request: Request):
    """Halaman Asisten AI Spesial."""
    return templates.TemplateResponse(request, "ai.html", {})

@app.get("/portfolio", response_class=HTMLResponse)
async def portfolio_page(request: Request):
    """Halaman Portofolio Bot."""
    return templates.TemplateResponse(request, "portfolio.html", {})
```

### 5. `backend/templates/index.html` (MODIFIKASI — aktifkan link AI & Portfolio)

Ubah tombol Asisten AI dan Portofolio dari disabled menjadi aktif:

```html
<a href="/ai" class="bg-purple-600 hover:bg-purple-700 text-white font-bold py-3 px-4 rounded text-center">
    🤖 Asisten AI
</a>
<a href="/portfolio" class="bg-yellow-600 hover:bg-yellow-700 text-white font-bold py-3 px-4 rounded text-center">
    💼 Portofolio
</a>
```

### 6. `bot_simulator.py` dan `reset_porto.py` (MODIFIKASI — tambah parameter --user)

Tambahkan parameter `--user` untuk mendukung multi-user:
- Jika `--user` diberikan, baca/tulis file di `Database/users/{username}/`
- Jika tidak diberikan, gunakan path lama (backward compatibility)

## IMPLEMENTASI

1. **Baca file yang ada** di `backend/routes/api.py`, `backend/main.py`, `bot_simulator.py`, `reset_porto.py`.
2. **Modifikasi `backend/routes/api.py`** — tambahkan semua endpoint AI & Portfolio.
3. **Buat `backend/templates/ai.html`** dengan fitur lengkap.
4. **Buat `backend/templates/portfolio.html`** dengan fitur lengkap.
5. **Modifikasi `backend/main.py`** — tambahkan route `/ai` dan `/portfolio`.
6. **Modifikasi `backend/templates/index.html`** — aktifkan link AI & Portfolio.
7. **Modifikasi `bot_simulator.py`** — tambah parameter `--user`.
8. **Modifikasi `reset_porto.py`** — tambah parameter `--user`.
9. **Restart FastAPI** — matikan proses lama, jalankan ulang `bash run_backend.sh`.
10. **Verifikasi**:
    - Login dulu via `/api/auth/register` dan `/api/auth/login`
    - Test endpoint `/api/ai/rumus` → return 9 rumus dengan data
    - Test endpoint `/api/ai/sidang` → return keranjang + laporan (butuh GEMINI_API_KEY)
    - Test endpoint `/api/ai/radar` → return keranjang radar
    - Test endpoint `/api/portfolio/1` → return data portfolio rumus 1
    - Test endpoint `/api/portfolio/beli` → eksekusi beli (butuh sinyal)
    - Buka browser: `http://localhost:8100/ai` → halaman tampil (redirect ke login jika belum)
    - Buka browser: `http://localhost:8100/portfolio` → halaman tampil
    - Test fitur: pilih rumus, jalankan sidang AI, eksekusi beli/jual, reset

## OUTPUT
1. File yang dibuat/dimodifikasi:
   - `backend/routes/api.py` (modifikasi — tambah 7 endpoint)
   - `backend/templates/ai.html` (baru — ±400-500 baris)
   - `backend/templates/portfolio.html` (baru — ±300-400 baris)
   - `backend/main.py` (modifikasi — tambah 2 route)
   - `backend/templates/index.html` (modifikasi — aktifkan 2 link)
   - `bot_simulator.py` (modifikasi — tambah --user parameter)
   - `reset_porto.py` (modifikasi — tambah --user parameter)
2. Tampilkan ringkasan: hasil test API + fitur yang berhasil.
3. JANGAN commit apa pun — user yang memutuskan.

## CATATAN PENTING
- Kedua halaman WAJIB LOGIN — gunakan `Depends(get_current_user)` dari `backend.auth`.
- Gunakan `load_data_saham_raw()` dari `backend.core.data_loader`.
- Gunakan `jalankan_sidang_autopilot()` dari `backend.core.ai_service`.
- Portfolio data per-user di `Database/users/{username}/`.
- `bot_simulator.py` dan `reset_porto.py` harus backward compatible (tanpa --user tetap jalan).
- AI sidang butuh `GEMINI_API_KEY` di environment variable.
- Halaman harus responsive (mobile-friendly).
- Test login flow sebelum test fitur AI/Portfolio.