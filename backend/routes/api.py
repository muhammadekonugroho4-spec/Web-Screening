from fastapi import APIRouter, Depends, Query, HTTPException
from backend.loader import muat_screener, muat_fundamental, ringkasan_market, data_portofolio, data_radar
from backend.auth import get_current_user
import pandas as pd, json

router = APIRouter(prefix="/api")

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
