# PROMPT OPENCODE — LANGKAH 4: PINDAHKAN MARKET OVERVIEW KE FASTAPI

## MISI
Buat halaman Market Overview di FastAPI yang menampilkan data pasar IHSG (total saham, naik/turun/stagnan, sentimen, top gainers/losers/volume/value) menggunakan data dari `backend.core.data_loader`.

## ATURAN KERAS
1. DILARANG mengubah `app.py` sama sekali.
2. Hanya boleh MEMBUAT/MODIFIKASI file di folder `backend/`.
3. Gunakan data dari `backend.core.data_loader` (load_data_saham_raw, dll).
4. JANGAN menjalankan Streamlit.
5. JANGAN commit apa pun — user yang memutuskan.

## STRUKTUR YANG HARUS DIBUAT/DIMODIFIKASI

### 1. `backend/routes/api.py` (MODIFIKASI — tambah endpoint market overview)
Tambahkan endpoint baru:

```python
@router.get("/market-overview")
async def market_overview():
    """Data lengkap untuk halaman Market Overview."""
    from backend.core.data_loader import load_data_saham_raw
    from backend.core.formatter import format_angka, format_pct, format_singkat_rp, format_singkat_vol
    
    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}
    
    # Hitung statistik dasar
    total_saham = len(df)
    saham_naik = len(df[df['Change (%)'] > 0]) if 'Change (%)' in df.columns else 0
    saham_turun = len(df[df['Change (%)'] < 0]) if 'Change (%)' in df.columns else 0
    saham_stagnan = total_saham - saham_naik - saham_turun
    
    # Hitung Turnover jika belum ada
    if 'Turnover' not in df.columns:
        if 'Volume' in df.columns and 'Harga (Rp)' in df.columns:
            df['Turnover'] = df['Harga (Rp)'] * df['Volume'] * 100
        else:
            df['Turnover'] = 0
    
    # Sentimen pasar
    if saham_naik > (saham_turun * 1.5):
        sentimen_teks, warna_sentimen = "🔥 Sangat Bullish", "#4ade80"
    elif saham_turun > (saham_naik * 1.5):
        sentimen_teks, warna_sentimen = "🩸 Sangat Bearish", "#f87171"
    else:
        sentimen_teks, warna_sentimen = "⚖️ Konsolidasi (Ragu)", "#facc15"
    
    # Top tables
    def get_top(df, col, n=10, ascending=False):
        if col not in df.columns:
            return []
        top_df = df.nlargest(n, col) if not ascending else df.nsmallest(n, col)
        return top_df[['Ticker', 'Harga (Rp)', 'Change (%)', 'Volume', 'Turnover']].head(n).to_dict('records')
    
    top_gainers = get_top(df, 'Change (%)', 10, ascending=False)
    top_losers = get_top(df, 'Change (%)', 10, ascending=True)
    top_volume = get_top(df, 'Volume', 10, ascending=False)
    top_value = get_top(df, 'Turnover', 10, ascending=False)
    
    # Stempel waktu
    stempel = str(df["Terakhir Update"].iloc[0]) if "Terakhir Update" in df.columns else "N/A"
    
    return {
        "ringkasan": {
            "total_saham": total_saham,
            "naik": saham_naik,
            "turun": saham_turun,
            "stagnan": saham_stagnan,
            "sentimen_teks": sentimen_teks,
            "warna_sentimen": warna_sentimen,
            "stempel": stempel,
        },
        "top_gainers": top_gainers,
        "top_losers": top_losers,
        "top_volume": top_volume,
        "top_value": top_value,
    }
```

### 2. `backend/templates/market.html` (BUAT BARU)
Halaman Market Overview dengan Tailwind CSS dark theme:

```html
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Market Overview — WEB-SCREENING</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body { background: #0f172a; color: #f8fafc; }
        .metric-card {
            background: linear-gradient(145deg, #1e293b 0%, #0f172a 100%);
            border: 1px solid #334155;
            border-radius: 10px;
            padding: 18px 14px;
            text-align: center;
            margin-bottom: 18px;
        }
        .metric-card:hover { transform: translateY(-2px); }
        table { width: 100%; border-collapse: collapse; }
        th { background: #1e293b; padding: 12px 14px; text-align: left; font-weight: 700; font-size: 0.78rem; text-transform: uppercase; }
        td { padding: 10px 14px; border-bottom: 1px solid #2d3b54; }
        tr:nth-child(even) { background: rgba(30, 41, 59, 0.35); }
        tr:hover { background: rgba(56, 189, 248, 0.08); }
        .text-green { color: #22c55e; }
        .text-red { color: #ef4444; }
        .text-gray { color: #94a3b8; }
    </style>
</head>
<body class="min-h-screen">
    <div class="max-w-7xl mx-auto p-6">
        <!-- Header -->
        <div class="mb-6">
            <a href="/" class="text-blue-400 hover:text-blue-300 mb-4 inline-block">← Kembali ke Beranda</a>
            <h1 class="text-3xl font-bold mb-2">📊 Market Overview</h1>
            <p class="text-gray-400">Ringkasan Pasar IHSG — <span id="stempel">Loading...</span></p>
        </div>

        <!-- Metrics -->
        <div class="grid grid-cols-1 md:grid-cols-5 gap-4 mb-8" id="metrics">
            <div class="metric-card">
                <h3 class="text-sm text-gray-400 mb-1">🔍 Total Saham</h3>
                <h2 class="text-2xl font-bold" id="total_saham">-</h2>
            </div>
            <div class="metric-card">
                <h3 class="text-sm text-gray-400 mb-1">🟢 Menguat</h3>
                <h2 class="text-2xl font-bold text-green" id="naik">-</h2>
            </div>
            <div class="metric-card">
                <h3 class="text-sm text-gray-400 mb-1">🔴 Melemah</h3>
                <h2 class="text-2xl font-bold text-red" id="turun">-</h2>
            </div>
            <div class="metric-card">
                <h3 class="text-sm text-gray-400 mb-1">⚪ Stagnan</h3>
                <h2 class="text-2xl font-bold text-gray" id="stagnan">-</h2>
            </div>
            <div class="metric-card">
                <h3 class="text-sm text-gray-400 mb-1">🧭 Sentimen</h3>
                <h3 class="text-lg font-bold mt-1" id="sentimen">-</h3>
            </div>
        </div>

        <!-- Top Tables -->
        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
            <!-- Top Gainers -->
            <div>
                <h3 class="text-xl font-bold mb-3">🔥 Top Gainers</h3>
                <div class="overflow-x-auto">
                    <table id="table_gainers">
                        <thead>
                            <tr>
                                <th>Ticker</th>
                                <th>Harga</th>
                                <th>Change</th>
                            </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>

            <!-- Top Losers -->
            <div>
                <h3 class="text-xl font-bold mb-3">🩸 Top Losers</h3>
                <div class="overflow-x-auto">
                    <table id="table_losers">
                        <thead>
                            <tr>
                                <th>Ticker</th>
                                <th>Harga</th>
                                <th>Change</th>
                            </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>

            <!-- Top Volume -->
            <div>
                <h3 class="text-xl font-bold mb-3">🌊 Top Volume</h3>
                <div class="overflow-x-auto">
                    <table id="table_volume">
                        <thead>
                            <tr>
                                <th>Ticker</th>
                                <th>Harga</th>
                                <th>Volume</th>
                                <th>Change</th>
                            </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>

            <!-- Top Value -->
            <div>
                <h3 class="text-xl font-bold mb-3">💰 Top Value (Turnover)</h3>
                <div class="overflow-x-auto">
                    <table id="table_value">
                        <thead>
                            <tr>
                                <th>Ticker</th>
                                <th>Harga</th>
                                <th>Turnover</th>
                                <th>Change</th>
                            </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <script>
        // Format functions (mirror Python formatter.py)
        function formatAngka(v) {
            if (v == null || isNaN(v)) return '-';
            return Math.round(v).toLocaleString('id-ID');
        }
        function formatPct(v) {
            if (v == null || isNaN(v) || v === 0) return '0.00%';
            const sign = v > 0 ? '▲ ' : '▼ ';
            return sign + v.toFixed(2) + '%';
        }
        function formatSingkatRp(v) {
            if (v == null || isNaN(v) || v === 0) return '-';
            if (v >= 1e12) return '🔥 Rp ' + (v/1e12).toFixed(2) + ' T';
            if (v >= 1e9) return '💰 Rp ' + (v/1e9).toFixed(2) + ' M';
            if (v >= 1e6) return '🪙 Rp ' + (v/1e6).toFixed(2) + ' Jt';
            return 'Rp ' + Math.round(v).toLocaleString('id-ID');
        }
        function formatSingkatVol(v) {
            if (v == null || isNaN(v)) return '-';
            if (v >= 1e6) return (v/1e6).toFixed(2) + ' M Lot';
            if (v >= 1e3) return (v/1e3).toFixed(2) + ' K Lot';
            return Math.round(v) + ' Lot';
        }

        // Fetch data
        fetch('/api/market-overview')
            .then(r => r.json())
            .then(data => {
                if (data.error) {
                    document.body.innerHTML = '<div class="p-6 text-red-400">' + data.error + '</div>';
                    return;
                }

                // Metrics
                document.getElementById('stempel').textContent = data.ringkasan.stempel + ' WIB';
                document.getElementById('total_saham').textContent = data.ringkasan.total_saham;
                document.getElementById('naik').textContent = data.ringkasan.naik;
                document.getElementById('turun').textContent = data.ringkasan.turun;
                document.getElementById('stagnan').textContent = data.ringkasan.stagnan;
                const sentimenEl = document.getElementById('sentimen');
                sentimenEl.textContent = data.ringkasan.sentimen_teks;
                sentimenEl.style.color = data.ringkasan.warna_sentimen;

                // Top Gainers
                const gainersTbody = document.querySelector('#table_gainers tbody');
                data.top_gainers.forEach(row => {
                    const changeClass = row['Change (%)'] > 0 ? 'text-green' : (row['Change (%)'] < 0 ? 'text-red' : '');
                    gainersTbody.innerHTML += `
                        <tr>
                            <td><strong>${row.Ticker}</strong></td>
                            <td>${formatAngka(row['Harga (Rp)'])}</td>
                            <td class="${changeClass}">${formatPct(row['Change (%)'])}</td>
                        </tr>
                    `;
                });

                // Top Losers
                const losersTbody = document.querySelector('#table_losers tbody');
                data.top_losers.forEach(row => {
                    const changeClass = row['Change (%)'] > 0 ? 'text-green' : (row['Change (%)'] < 0 ? 'text-red' : '');
                    losersTbody.innerHTML += `
                        <tr>
                            <td><strong>${row.Ticker}</strong></td>
                            <td>${formatAngka(row['Harga (Rp)'])}</td>
                            <td class="${changeClass}">${formatPct(row['Change (%)'])}</td>
                        </tr>
                    `;
                });

                // Top Volume
                const volumeTbody = document.querySelector('#table_volume tbody');
                data.top_volume.forEach(row => {
                    const changeClass = row['Change (%)'] > 0 ? 'text-green' : (row['Change (%)'] < 0 ? 'text-red' : '');
                    volumeTbody.innerHTML += `
                        <tr>
                            <td><strong>${row.Ticker}</strong></td>
                            <td>${formatAngka(row['Harga (Rp)'])}</td>
                            <td>${formatSingkatVol(row.Volume)}</td>
                            <td class="${changeClass}">${formatPct(row['Change (%)'])}</td>
                        </tr>
                    `;
                });

                // Top Value
                const valueTbody = document.querySelector('#table_value tbody');
                data.top_value.forEach(row => {
                    const changeClass = row['Change (%)'] > 0 ? 'text-green' : (row['Change (%)'] < 0 ? 'text-red' : '');
                    valueTbody.innerHTML += `
                        <tr>
                            <td><strong>${row.Ticker}</strong></td>
                            <td>${formatAngka(row['Harga (Rp)'])}</td>
                            <td>${formatSingkatRp(row.Turnover)}</td>
                            <td class="${changeClass}">${formatPct(row['Change (%)'])}</td>
                        </tr>
                    `;
                });
            })
            .catch(err => {
                document.body.innerHTML = '<div class="p-6 text-red-400">Error loading data: ' + err + '</div>';
            });
    </script>
</body>
</html>
```

### 3. `backend/main.py` (MODIFIKASI — tambah route /market)
Tambahkan route baru:

```python
@app.get("/market", response_class=HTMLResponse)
async def market_page(request: Request):
    """Halaman Market Overview."""
    return templates.TemplateResponse(request, "market.html", {})
```

### 4. `backend/templates/index.html` (MODIFIKASI — tambah link ke /market)
Tambahkan di bagian atas (setelah header):

```html
<div class="max-w-7xl mx-auto p-6">
    <h1 class="text-3xl font-bold mb-4">⚡ WEB-SCREENING</h1>
    <div class="bg-gray-800 rounded-lg p-6 mb-6">
        <h2 class="text-xl font-semibold mb-4">Menu Cepat</h2>
        <div class="grid grid-cols-2 md:grid-cols-4 gap-4">
            <a href="/market" class="bg-blue-600 hover:bg-blue-700 text-white font-bold py-3 px-4 rounded text-center">
                📊 Market Overview
            </a>
            <a href="/screener" class="bg-gray-700 text-gray-400 font-bold py-3 px-4 rounded text-center cursor-not-allowed">
                📌 Screener (Segera)
            </a>
            <a href="/ai" class="bg-gray-700 text-gray-400 font-bold py-3 px-4 rounded text-center cursor-not-allowed">
                🤖 Asisten AI (Segera)
            </a>
            <a href="/portfolio" class="bg-gray-700 text-gray-400 font-bold py-3 px-4 rounded text-center cursor-not-allowed">
                💼 Portofolio (Segera)
            </a>
        </div>
    </div>
    <!-- ... sisa konten lama ... -->
</div>
```

## IMPLEMENTASI

1. **Baca file yang ada** di `backend/routes/api.py` dan `backend/main.py`.
2. **Modifikasi `backend/routes/api.py`** — tambahkan endpoint `/market-overview` seperti di atas.
3. **Buat `backend/templates/market.html`** dengan kode HTML di atas.
4. **Modifikasi `backend/main.py`** — tambahkan route `/market` dan import `backend.core` jika belum ada.
5. **Modifikasi `backend/templates/index.html`** — tambahkan link ke `/market` di menu cepat.
6. **Restart FastAPI** — matikan proses lama, jalankan ulang `bash run_backend.sh`.
7. **Verifikasi**:
   - `curl http://localhost:8100/api/market-overview` → harus return JSON lengkap
   - Buka browser: `http://localhost:8100/market` → halaman Market Overview harus tampil
   - Cek 4 tabel (gainers, losers, volume, value) terisi data
   - Cek metrics (total, naik, turun, stagnan, sentimen) tampil
   - Kembali ke `http://localhost:8100/` → link "Market Overview" muncul di menu cepat

## OUTPUT
1. File yang dibuat/dimodifikasi:
   - `backend/routes/api.py` (modifikasi — tambah endpoint)
   - `backend/templates/market.html` (baru)
   - `backend/main.py` (modifikasi — tambah route)
   - `backend/templates/index.html` (modifikasi — tambah link)
2. Tampilkan ringkasan: hasil test API + screenshot halaman.
3. JANGAN commit apa pun — user yang memutuskan.

## CATATAN PENTING
- Gunakan `load_data_saham_raw()` dari `backend.core.data_loader`, BUKAN `load_data_saham()` (yang pakai Streamlit cache).
- Formatter JavaScript harus mirror Python formatter (format_angka, format_pct, format_singkat_rp, format_singkat_vol).
- Halaman `/market` harus responsive (mobile-friendly).
- Jika data kosong, tampilkan pesan error yang jelas.