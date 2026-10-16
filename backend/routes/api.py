from fastapi import APIRouter, Depends, Query, HTTPException
from pydantic import BaseModel
from typing import Dict, List, Optional
from backend.loader import muat_screener, muat_fundamental, ringkasan_market, data_portofolio, data_radar
from backend.auth import get_current_user
import pandas as pd, json, os, sys

router = APIRouter(prefix="/api")

# Path config (relatif ke root project — sama seperti dipakai app.py PART 06)
CONFIG_PATH = "config_web.json"

# Context username untuk subprocess (bot_simulator/reset_porto) — diisi sebelum eksekusi
_USER_CTX = {"username": ""}


def _muat_master_filters():
    """Load MASTER_FILTERS dari config_web.json (tanpa Streamlit session_state)."""
    with open(CONFIG_PATH) as f:
        config = json.load(f)
    return config["MASTER_FILTERS"]

@router.get("/market")
def market():
    df = muat_screener()
    if df.empty: return {"total": 0, "data": []}
    chg = pd.to_numeric(df.get("Change (%)"), errors="coerce")
    vol = pd.to_numeric(df.get("Volume"), errors="coerce").fillna(0)
    hrg = pd.to_numeric(df.get("Harga (Rp)"), errors="coerce").fillna(0)
    top = lambda col, asc: df.nlargest if not asc else df.nsmallest
    return {
        "ringkasan": ringkasan_market(),
        "top_gainers": df.nlargest(15, "Change (%)")[["Ticker","Harga (Rp)","Change (%)","Volume","Total Score"]].fillna("-").to_dict("records"),
        "top_losers": df.nsmallest(15, "Change (%)")[["Ticker","Harga (Rp)","Change (%)","Volume","Total Score"]].fillna("-").to_dict("records"),
        "top_volume": df.nlargest(15, "Volume")[["Ticker","Harga (Rp)","Change (%)","Volume","Total Score"]].fillna("-").to_dict("records"),
    }

@router.get("/screener")
def screener(q: str = "", kategori: str = "", rekomendasi: str = "", min_score: float = 0,
             sort: str = "score", limit: int = 100, offset: int = 0):
    df = muat_screener()
    if df.empty: return {"total": 0, "data": []}
    if q: df = df[df["Ticker"].astype(str).str.contains(q.upper(), na=False)]
    if kategori: df = df[df["Kategori"] == kategori]
    if rekomendasi: df = df[df["Rekomendasi"] == rekomendasi]
    if min_score: df = df[pd.to_numeric(df["Total Score"], errors="coerce") >= min_score]
    peta = {"score":"Total Score","change":"Change (%)","volume":"Volume","harga":"Harga (Rp)"}
    sk = peta.get(sort, "Total Score")
    if sk in df.columns: df = df.sort_values(sk, ascending=False)
    total = len(df)
    data = df.iloc[offset:offset+limit].fillna("-").to_dict("records")
    return {"total": total, "data": data}

@router.get("/fundamental")
def fundamental(ticker: str = ""):
    df = muat_fundamental()
    if ticker: df = df[df["Ticker"].astype(str).str.upper() == ticker.upper()]
    return {"data": df.fillna("-").to_dict("records")}

@router.get("/radar")
def radar(mode: str = "pagi"):
    return data_radar(mode)

@router.get("/portofolio")
def portofolio(username: str = Depends(get_current_user)):
    return data_portofolio(username)

@router.get("/detektif")
def detektif():
    df = muat_screener()
    if df.empty: return {"ada": False}
    chg = pd.to_numeric(df["Change (%)"], errors="coerce")
    ledakan = df[chg.abs() >= 5].nlargest(20, "Volume")[["Ticker","Harga (Rp)","Change (%)","Volume","Status Bandar"]].fillna("-").to_dict("records")
    return {"ada": True, "ledakan": ledakan}

@router.get("/market-overview")
async def market_overview():
    """Data lengkap untuk halaman Market Overview (Langkah 4).
    Sumber: backend.core.data_loader.load_data_saham_raw (tanpa Streamlit)."""
    from backend.core.data_loader import load_data_saham_raw
    from backend.core.formatter import format_angka, format_pct, format_singkat_rp, format_singkat_vol

    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}

    # Hitung statistik dasar (numeric-kan agar aman dari nilai teks/kosong)
    total_saham = len(df)
    chg = pd.to_numeric(df.get('Change (%)'), errors='coerce') if 'Change (%)' in df.columns else pd.Series(dtype=float)
    saham_naik = int((chg > 0).sum()) if not chg.empty else 0
    saham_turun = int((chg < 0).sum()) if not chg.empty else 0
    saham_stagnan = total_saham - saham_naik - saham_turun

    # Hitung Turnover jika belum ada
    if 'Turnover' not in df.columns:
        if 'Volume' in df.columns and 'Harga (Rp)' in df.columns:
            df = df.copy()
            df['Turnover'] = pd.to_numeric(df['Harga (Rp)'], errors='coerce').fillna(0) * pd.to_numeric(df['Volume'], errors='coerce').fillna(0) * 100
        else:
            df = df.copy()
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


# =====================================================================
# SCREENER UTAMA (Langkah 5)
# =====================================================================
class ScreenerRequest(BaseModel):
    filters: Dict[str, str]  # {"Kategori": "Big Cap (Lapis 1)", "RSI (14D)": "> 50 (Bullish)"}
    numeric_filters: Dict[str, Dict[str, float]]  # {"PER (x)": {"min": 0, "max": 20}}
    search_ticker: Optional[str] = ""
    search_broker: Optional[str] = ""
    price_min: Optional[float] = 0
    price_max: Optional[float] = 0
    per_page: Optional[int] = 50
    page: Optional[int] = 1


@router.get("/screener/config")
async def screener_config():
    """Return MASTER_FILTERS untuk dropdown (Langkah 5)."""
    return _muat_master_filters()


@router.post("/screener")
async def screener(request: ScreenerRequest):
    """Filter saham dengan berbagai kriteria (Langkah 5).
    Sumber: backend.core.data_loader.load_data_saham_raw + config_web.json."""
    from backend.core.data_loader import load_data_saham_raw

    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia", "data": [], "total": 0}

    # 1. Filter dropdown
    df_filtered = df.copy()
    for key, value in request.filters.items():
        if value == "Semua" or not value:
            continue

        if key == "RSI (14D)":
            if "RSI (14D)" in df_filtered.columns:
                rsi = pd.to_numeric(df_filtered["RSI (14D)"], errors="coerce")
                if "Bullish" in value:
                    df_filtered = df_filtered[rsi > 50]
                else:
                    df_filtered = df_filtered[rsi <= 50]
        elif key == "Total Score":
            if "Total Score" in df_filtered.columns:
                df_filtered = df_filtered[pd.to_numeric(df_filtered["Total Score"], errors="coerce") == int(value)]
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
    if request.price_min and request.price_min > 0:
        df_filtered = df_filtered[pd.to_numeric(df_filtered["Harga (Rp)"], errors="coerce") >= request.price_min]
    if request.price_max and request.price_max > 0:
        df_filtered = df_filtered[pd.to_numeric(df_filtered["Harga (Rp)"], errors="coerce") <= request.price_max]

    # Pagination
    total = len(df_filtered)
    per_page = request.per_page or 50
    page = request.page or 1
    start_idx = (page - 1) * per_page
    end_idx = start_idx + per_page
    df_page = df_filtered.iloc[start_idx:end_idx]

    data = df_page.to_dict("records")

    return {
        "data": data,
        "total": total,
        "page": page,
        "per_page": per_page,
        "total_pages": (total + per_page - 1) // per_page,
    }


# =====================================================================
# TAB 4: ASISTEN AI SPESIAL (Langkah 6)
# =====================================================================
def _hitung_9_rumus(df):
    """Hitung 9 rumus BSJP (mirror logika preset dari app.py PART 12).
    Return: dict {int rumus_id: {"nama": str, "icon": str, "df": DataFrame}}."""
    def kolom(nama):
        return df[nama] if nama in df.columns else pd.Series([""] * len(df), index=df.index)

    chg = pd.to_numeric(kolom('Change (%)'), errors='coerce').fillna(0)
    vol = pd.to_numeric(kolom('Volume'), errors='coerce').fillna(0)
    skor = pd.to_numeric(kolom('Total Score'), errors='coerce').fillna(0)
    rsi = pd.to_numeric(kolom('RSI (14D)'), errors='coerce')
    harga = pd.to_numeric(kolom('Harga (Rp)'), errors='coerce').fillna(0)
    streak = pd.to_numeric(kolom('Streak Harian'), errors='coerce').fillna(0)

    vwap = kolom('Posisi VWAP')
    ad = kolom('Kekuatan A/D')
    supply = kolom('Kondisi Supply')
    bandar = kolom('Status Bandar')
    tekanan = kolom('Tekanan Bandar')
    rvol = kolom('RVOL (Anomali Vol)')
    gorengan = kolom('Karakter Gorengan')
    candle = kolom('Pola Candle')
    ma_sig = kolom('MA Signal')
    ma_cross = kolom('MA Cross')
    macd = kolom('MACD')
    trend_ma = kolom('Trend MA (5,20,50)')
    bb = kolom('Status BB')
    likuid = kolom('Likuiditas')
    vwap_kuat = vwap == 'Di Atas VWAP (Kuat)'
    akumulasi_pro = ad == 'Akumulasi Pro (Smart Money)'
    supply_banjir = supply.astype(str).str.contains('Banjir', na=False)
    supply_kering = supply.astype(str).str.contains('Kering', na=False)

    peta = {
        1: ("Smart Money Menyelam", "🕵️",
            akumulasi_pro & (bandar == 'Akumulasi Kuat') & vwap_kuat & ~supply_banjir),
        2: ("Pantulan Jarum Bawah", "🪡",
            candle.astype(str).str.contains('Hammer', na=False) & (chg < 0) & (rsi < 40) & supply_kering),
        3: ("Tutup Kuat Bandar Hajar", "🔨",
            (tekanan == 'Dominan Beli (Hajar Kanan)') & (chg > 0) & (chg < 10) & vwap_kuat & ~supply_banjir),
        4: ("Golden Cross Muda", "✨",
            ma_cross.astype(str).str.contains('Golden', na=False) & akumulasi_pro & vwap_kuat),
        5: ("Momentum Likuid Sehat", "🌊",
            (likuid == '> 1 Miliar') & (chg >= 1) & (chg <= 7) & (skor >= 7) & ~supply_banjir),
        6: ("Ledakan Volume Senyap", "💥",
            rvol.astype(str).str.contains('Ekstrem', na=False) & (chg.abs() < 3) & akumulasi_pro),
        7: ("Anomali ML", "🤖",
            kolom('Prediksi Machine Learning').astype(str).str.contains('Naik|Beli|Strong', case=False, na=False) & (skor >= 6)),
        8: ("Momentum Tembus MA20", "🚀",
            ma_sig == 'Uptrend' & False if False else ma_sig.eq('Uptrend') & (harga > pd.to_numeric(kolom('Harga MA20'), errors='coerce').fillna(0)) & (harga > 0) & vwap_kuat),
        9: ("MACD Momentum Terukur", "📐",
            macd.astype(str).str.contains('Bullish|Golden|Positif', case=False, na=False) & (streak <= 2) & akumulasi_pro),
    }
    out = {}
    for i, (nama, icon, mask) in peta.items():
        out[i] = {"nama": nama, "icon": icon, "df": df[mask]}
    return out


@router.get("/ai/rumus")
async def get_ai_rumus(user: str = Depends(get_current_user)):
    """Return 9 rumus BSJP dengan data saham yang lolos (Langkah 6)."""
    from backend.core.data_loader import load_data_saham_raw

    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}

    rumus = _hitung_9_rumus(df)
    return {
        str(i): {
            "nama": r["nama"],
            "icon": r["icon"],
            "jumlah": len(r["df"]),
            "data": r["df"].fillna("-").to_dict('records'),
        }
        for i, r in rumus.items()
    }


@router.post("/ai/sidang")
async def run_ai_sidang(rumus: Optional[int] = None, user: str = Depends(get_current_user)):
    """Jalankan sidang AI Top-5 untuk SATU rumus (Langkah 6 + Fase E1).
    Query param `rumus` (1-9): sidang rumus itu saja — hemat memori, aman dari
    OOM crash container Railway free (512MB). Frontend memanggil 9x bertahap.
    Tanpa param `rumus`: seluruh 9 rumus (perilaku lama — rawan OOM di free tier)."""
    from backend.core.ai_service import jalankan_sidang_autopilot
    from backend.core.data_loader import load_data_saham_raw
    import asyncio

    GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY")
    if not GEMINI_API_KEY:
        raise HTTPException(status_code=400, detail="GEMINI_API_KEY belum dipasang")

    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}

    rumus_data = _hitung_9_rumus(df)

    if rumus is not None:
        # --- MODE PER-RUMUS (hemat memori, max_workers=1) ---
        if rumus not in range(1, 10):
            return {"error": f"Rumus {rumus} tidak valid (harus 1-9)"}
        daftar_rumus = {i: (rumus_data[i]["df"] if i == rumus else pd.DataFrame()) for i in range(1, 10)}
        keranjang, error, laporan = await asyncio.to_thread(
            jalankan_sidang_autopilot,
            daftar_rumus, df, GEMINI_API_KEY,
            None, None, False
        )
        if error:
            return {"error": error}
        return {
            "keranjang": {f"RUMUS {rumus}": keranjang[f"RUMUS {rumus}"]},
            "laporan": {rumus: laporan[rumus]},
        }

    # --- MODE SEMUA RUMUS (perilaku lama) ---
    daftar_rumus = {i: rumus_data[i]["df"] for i in range(1, 10)}
    keranjang, error, laporan = jalankan_sidang_autopilot(
        daftar_rumus, df, GEMINI_API_KEY,
        progress_bar=None, status_teks=None, tulis_sinyal=False
    )

    if error:
        return {"error": error}

    return {
        "keranjang": keranjang,
        "laporan": laporan,
    }


@router.get("/pipeline/status")
async def pipeline_status():
    """Status pipeline data di server (Fase E) — tanpa login (hanya info)."""
    from backend import pipeline_runner
    return pipeline_runner.status()


@router.get("/ai/diagnose")
async def diagnose_gemini(user: str = Depends(get_current_user)):
    """Fase E-diagnose: daftar model Gemini yang AKTIF untuk API key ini
    (via SDK baru google-genai — ringan, bukan library deprecated)."""
    import os
    GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY")
    if not GEMINI_API_KEY:
        raise HTTPException(status_code=400, detail="GEMINI_API_KEY belum dipasang")

    def _list():
        from google import genai as ggenai
        client = ggenai.Client(api_key=GEMINI_API_KEY)
        hasil = []
        for m in client.models.list():
            if "generateContent" in (m.supported_actions or []):
                hasil.append(m.name.replace("models/", ""))
        return hasil

    import asyncio
    try:
        models = await asyncio.to_thread(_list)
        return {"total": len(models), "models": sorted(models)}
    except Exception as e:
        return {"error": f"{type(e).__name__}: {str(e)[:300]}"}


@router.get("/ai/radar")
async def get_radar_live(user: str = Depends(get_current_user)):
    """Return data Radar Live dari cache_autopilot.json (Langkah 6)."""
    from backend.core.data_loader import muat_keranjang_radar_raw, load_data_saham_raw

    df = load_data_saham_raw()
    stempel = str(df["Terakhir Update"].iloc[0]) if "Terakhir Update" in df.columns else ""

    keranjang, status = muat_keranjang_radar_raw(stempel, "v5.2")

    return {
        "keranjang": keranjang,
        "status": status,
        "stempel": stempel,
    }


# =====================================================================
# TAB 5: PORTOFOLIO BOT (Langkah 6)
# =====================================================================
MODAL_AWAL_PORTO = 100000000  # Rp 100 juta per arena


def _user_dir(username):
    d = os.path.join("Database", "users", username)
    os.makedirs(d, exist_ok=True)
    return d


@router.get("/portfolio/{rumus_id}")
async def get_portfolio(rumus_id: int, user: str = Depends(get_current_user)):
    """Return data portfolio untuk rumus tertentu (Langkah 6).
    Data per-user di Database/users/{username}/."""
    username = user
    udir = _user_dir(username)

    df_porto = pd.DataFrame()
    df_hist = pd.DataFrame()
    df_sinyal = pd.DataFrame()

    porto_file = os.path.join(udir, f"portofolio_aktif_rumus_{rumus_id}.csv")
    hist_file = os.path.join(udir, f"histori_transaksi_rumus_{rumus_id}.csv")
    sinyal_file = os.path.join(udir, f"sinyal_ai_rumus_{rumus_id}.csv")

    if os.path.exists(porto_file):
        df_porto = pd.read_csv(porto_file)
    if os.path.exists(hist_file):
        df_hist = pd.read_csv(hist_file)
    if os.path.exists(sinyal_file):
        df_sinyal = pd.read_csv(sinyal_file)

    total_profit = float(df_hist["Total_Return_Rp"].sum()) if not df_hist.empty and "Total_Return_Rp" in df_hist.columns else 0
    modal_terpakai = float(df_porto["Total_Modal"].sum()) if not df_porto.empty and "Total_Modal" in df_porto.columns else 0
    saldo = MODAL_AWAL_PORTO + total_profit - modal_terpakai
    total_aset = saldo + modal_terpakai

    return {
        "saldo": saldo,
        "modal_terpakai": modal_terpakai,
        "total_aset": total_aset,
        "total_profit": total_profit,
        "profit_pct": (total_profit / MODAL_AWAL_PORTO * 100) if total_profit else 0,
        "sinyal": df_sinyal.fillna("-").to_dict('records'),
        "posisi_aktif": df_porto.fillna("-").to_dict('records'),
        "histori": df_hist.sort_values("Tanggal_Jual", ascending=False).fillna("-").to_dict('records') if not df_hist.empty else [],
    }


def _jalankan_skrip(args, timeout):
    """Jalankan script Python (bot_simulator/reset_porto) dengan --user."""
    import subprocess
    username = _USER_CTX.get("username", "")
    cmd = [sys.executable] + args + (["--user", username] if username else [])
    try:
        proses = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout)
        if proses.returncode != 0:
            return {"error": f"Gagal eksekusi {args[0]}", "log": (proses.stderr or "")[-2000:]}
        return {"success": True, "log": (proses.stdout or "")[-2000:]}
    except subprocess.TimeoutExpired:
        return {"error": f"Timeout ({timeout // 60} menit)"}
    except Exception as e:
        return {"error": str(e)}


@router.post("/portfolio/beli")
async def execute_beli(user: str = Depends(get_current_user)):
    """Eksekusi beli semua sinyal via bot_simulator.py --beli-only --user (Langkah 6)."""
    _USER_CTX["username"] = user
    return _jalankan_skrip(["bot_simulator.py", "--beli-only"], 1800)


@router.post("/portfolio/jual")
async def execute_jual(user: str = Depends(get_current_user)):
    """Eksekusi jual sore semua posisi via bot_simulator.py --jual-only --user (Langkah 6)."""
    _USER_CTX["username"] = user
    return _jalankan_skrip(["bot_simulator.py", "--jual-only"], 1800)


@router.post("/portfolio/reset")
async def reset_portfolio(user: str = Depends(get_current_user)):
    """Reset semua arena ke Rp 100 juta via reset_porto.py --yes --user (Langkah 6)."""
    _USER_CTX["username"] = user
    return _jalankan_skrip(["reset_porto.py", "--yes"], 120)


# =====================================================================
# TAB 6: DETEKTIF LEDAKAN (Langkah 7)
# =====================================================================
def anomali_intraday(df_day, ticker):
    """Mirror logika anomali intraday dari app.py PART 14 (baris 2759-2798).
    Return: (list ciri anomali, dict ringkasan OHLC) untuk 1 saham 1 hari."""
    g = df_day[df_day["Ticker"] == ticker].copy()
    if g.empty: return [], None
    cw = next((c for c in ["Waktu Update", "Terakhir Update"] if c in g.columns), g.columns[0])
    g["_jam"] = g[cw].astype(str).str.split(" ").str[-1].str[:5]
    g = g.sort_values("_jam")
    h = pd.to_numeric(g["Harga (Rp)"], errors="coerce")
    v = pd.to_numeric(g["Volume"], errors="coerce")
    c = pd.to_numeric(g["Change (%)"], errors="coerce")
    swing = (h.max() - h.min()) / h.min() * 100 if h.min() else 0.0
    ringkas = {"Open": h.iloc[0], "High": h.max(), "Low": h.min(), "Close": h.iloc[-1],
               "Swing_%": round(swing, 2), "Puncak_Change_%": round(c.max(), 2) if not c.isna().all() else 0.0,
               "Slot": len(g)}
    ciri = []
    dv = v.diff().fillna(0)
    if len(dv) > 9:
        rata = dv.iloc[1:-6].mean()
        akhir = dv.tail(6).sum()
        if rata and rata > 0 and akhir / (rata * 6) >= 2.5:
            ciri.append(f"🌋 Ledakan volume sesi akhir: 30 menit terakhir ≈{akhir / (rata * 6):.1f}x rata-rata slot")
    ta, tk = str(g.iloc[0].get("Tekanan Bandar", "")), str(g.iloc[-1].get("Tekanan Bandar", ""))
    if "Jual" in ta and "Beli" in tk:
        ciri.append(f"🔄 Pressure flip: {ta} → {tk}")
    bbs = g["Status BB"].astype(str).tolist() if "Status BB" in g.columns else []
    if "Squeeze" in bbs and any("Breakout" in b for b in bbs[bbs.index("Squeeze"):]):
        ciri.append("🌐 Squeeze → Breakout Upper dalam satu hari")
    if swing < 3 and "Beli" in tk and "Akumulasi" in str(g.iloc[-1].get("Kekuatan A/D", "")):
        ciri.append(f"🤫 Silent accumulation: harga flat (swing {swing:.1f}%) tapi {tk} + {g.iloc[-1].get('Kekuatan A/D')}")
    p15 = g[g["_jam"] >= "15:00"]
    if len(p15) > 0 and len(h) > len(p15):
        dasar = h.iloc[-len(p15) - 1]
        if dasar:
            jump = (h.iloc[-1] - dasar) / dasar * 100
            if jump >= 1.5: ciri.append(f"⏰ Closing jump: {jump:+.1f}% setelah 15:00")
    if not c.isna().all() and abs(c.iloc[0]) >= 2:
        ciri.append(f"🚪 Gap open: {c.iloc[0]:+.1f}% di snapshot pertama")
    if "Posisi VWAP" in g.columns:
        rk = (g["Posisi VWAP"].astype(str) == "Di Atas VWAP (Kuat)").mean()
        if rk >= 0.7: ciri.append(f"🛡️ Ditahan di atas VWAP {rk * 100:.0f}% waktu perdagangan")
    return ciri, ringkas


def tren_50h(ticker, lb):
    """Mirror logika tren 50 hari dari app.py PART 14 (baris 2820-2830).
    Buku besar kolom wajib: Ticker, Tanggal, Volume, Close (+ Swing_% opsional)."""
    if lb.empty: return None
    g = lb[lb["Ticker"] == ticker].sort_values("Tanggal").tail(50).copy()
    if g.empty: return None
    for kol in ["Volume", "Close"]:
        g[kol] = pd.to_numeric(g[kol], errors="coerce")
    g["MA5_vol"] = g["Volume"].rolling(5).mean()
    g["MA20_vol"] = g["Volume"].rolling(20).mean()
    g["MA50_vol"] = g["Volume"].rolling(50).mean()
    g["MA20_close"] = g["Close"].rolling(20).mean()
    return g


@router.get("/detective/alpha")
async def get_alpha_scan(user: str = Depends(get_current_user)):
    """Return AlphaScan Pro: market breadth, sector rotation, premarket gap (Langkah 7).
    Logika murni dari services/alpha_features.py (tanpa Streamlit)."""
    from services import alpha_features as af
    from backend.core.data_loader import load_data_saham_raw

    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}

    breadth = af.market_breadth(df)
    rotasi = af.sector_rotation(df)
    gap = af.premarket_gap_scanner(df, 2.0)

    # gap_up/gap_down berupa DataFrame → ubah ke records
    return {
        "market_breadth": breadth,
        "sector_rotation": rotasi,
        "premarket_gap": {
            "gap_up": gap["gap_up"].to_dict('records') if gap is not None and isinstance(gap.get("gap_up"), pd.DataFrame) else (gap.get("gap_up") if gap else None),
            "gap_down": gap["gap_down"].to_dict('records') if gap is not None and isinstance(gap.get("gap_down"), pd.DataFrame) else (gap.get("gap_down") if gap else None),
        },
    }


@router.post("/detective/chat")
async def detective_chat(request: dict, user: str = Depends(get_current_user)):
    """Chat AI detektif (Langkah 7). Narasi via panggil_ai_teks (Gemini → OpenRouter)."""
    from backend.core.ai_service import panggil_ai_teks

    pesan = request.get("pesan", "")
    konteks = request.get("konteks", "")
    if not pesan:
        return {"error": "Pesan kosong"}

    prompt = f"""Kamu analis detektif pasar saham Indonesia. FAKTA hanya dari BLOK DATA di bawah; untuk edukasi/konsep gunakan pengetahuan umum. Jika fakta tidak ada, katakan jujur. Jawab Bahasa Indonesia, analitis, tanpa basa-basi.
BLOK DATA:
{konteks}
PERTANYAAN: {pesan}"""

    jawaban, model = panggil_ai_teks(prompt)
    return {"jawaban": jawaban, "model": model}


@router.get("/detective/otopsi/{ticker}/{tanggal}")
async def get_otopsi(ticker: str, tanggal: str, user: str = Depends(get_current_user)):
    """Return data otopsi untuk 1 saham 1 tanggal (Langkah 7).
    Sumber: arsip intraday + buku besar (backend.core.archive)."""
    from backend.core.archive import muat_arsip_harian_raw, muat_buku_besar_raw

    ticker = ticker.strip().upper()
    df_day = muat_arsip_harian_raw(tanggal)
    lb = muat_buku_besar_raw()

    # Anomali intraday (hanya jika arsip hari itu tersedia)
    ciri, ringkas = anomali_intraday(df_day, ticker) if not df_day.empty else ([], None)

    # Baris penutup hari (H-1)
    row_h1 = None
    if not df_day.empty and not df_day[df_day["Ticker"] == ticker].empty:
        row_h1 = df_day[df_day["Ticker"] == ticker].iloc[-1]
    elif not lb.empty:
        lbb = lb[(lb["Ticker"] == ticker) & (lb["Tanggal"].astype(str) == tanggal)]
        if not lbb.empty:
            row_h1 = lbb.iloc[-1]

    # Tren 50 hari dari buku besar
    tren_data = tren_50h(ticker, lb) if not lb.empty else None

    return {
        "ticker": ticker,
        "tanggal": tanggal,
        "ringkas": ringkas,
        "ciri": ciri,
        "row_h1": row_h1.to_dict() if row_h1 is not None else None,
        "tren_50h": tren_data.fillna("").to_dict('records') if tren_data is not None else None,
    }


@router.get("/detective/ledakan")
async def get_ledakan_chips(user: str = Depends(get_current_user)):
    """Chip saham yang swing low→high ≥10% (mirror app.py PART 14 baris 2899-2911)."""
    from backend.core.archive import muat_buku_besar_raw

    lb = muat_buku_besar_raw()
    if lb.empty:
        return {"chips": [], "tanggal": None}
    tgl_chip = str(sorted(lb["Tanggal"].astype(str).unique())[-1])
    dfx = lb[lb["Tanggal"].astype(str) == tgl_chip]
    df_ledakan = dfx[(pd.to_numeric(dfx["Swing_%"], errors="coerce") >= 10) | (pd.to_numeric(dfx["Puncak_Change_%"], errors="coerce") >= 10)]
    df_ledakan = df_ledakan.sort_values("Swing_%", ascending=False).head(12)
    chips = [{"Ticker": r["Ticker"], "Swing_%": round(float(r["Swing_%"]), 1)}
             for _, r in df_ledakan.iterrows()]
    return {"chips": chips, "tanggal": tgl_chip}


@router.get("/detective/tanggal")
async def get_tanggal_opsi(user: str = Depends(get_current_user)):
    """Daftar tanggal arsip yang tersedia untuk dropdown otopsi."""
    from backend.core.archive import _muat_arsip_lokal

    tgl = [d for d, _ in _muat_arsip_lokal()]
    return {"tanggal": tgl}
