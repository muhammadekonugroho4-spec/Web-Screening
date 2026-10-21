from fastapi import APIRouter, Depends
import os

import pandas as pd

from backend.auth import get_current_user

router = APIRouter(prefix="/api", tags=["chart"])


def _buku_besar():
    fp = os.path.join(os.getcwd(), "Database", "ringkasan_harian.csv.gz")
    if not os.path.exists(fp):
        return pd.DataFrame()
    return pd.read_csv(fp)


@router.get("/chart/tickers")
async def chart_tickers(user: str = Depends(get_current_user)):
    """Daftar ticker yang punya data OHLCV di buku besar (untuk autocomplete)."""
    bb = _buku_besar()
    if bb.empty:
        return {"tickers": []}
    g = bb.groupby("Ticker").agg(
        nama_hari=("Tanggal", "nunique"),
        terakhir=("Tanggal", "max"),
    ).reset_index().sort_values("Ticker")
    return {
        "tickers": g.to_dict("records"),
        "total": len(g),
    }


@router.get("/chart/{ticker}")
async def chart_data(ticker: str, user: str = Depends(get_current_user)):
    """OHLCV harian 1 saham dari buku besar + MA5/MA20 + indikator bandarmologi
    terakhir per hari (untuk chart overlay). Return diurut naik tanggal."""
    ticker = ticker.strip().upper()
    bb = _buku_besar()
    if bb.empty:
        return {"error": "Buku besar kosong — jalankan bangun_buku_besar.py"}
    g = bb[bb["Ticker"] == ticker].sort_values("Tanggal").copy()
    if g.empty:
        return {"error": f"Ticker {ticker} tidak ditemukan di buku besar", "ticker": ticker}

    for c in ["Open", "High", "Low", "Close", "Volume"]:
        g[c] = pd.to_numeric(g[c], errors="coerce")
    g["MA5_close"] = g["Close"].rolling(5).mean()
    g["MA20_close"] = g["Close"].rolling(20).mean()
    g["MA5_vol"] = g["Volume"].rolling(5).mean()
    g["MA20_vol"] = g["Volume"].rolling(20).mean()

    # baris indikator bandarmologi per hari (untuk tabel di bawah chart)
    kolom_ind = ["Tanggal", "Tekanan", "Siklus", "Supply", "AD", "BB", "RVOL", "Score", "Rekomendasi"]
    kolom_ada = [c for c in kolom_ind if c in g.columns]
    indikator = g[kolom_ada].fillna("-").to_dict("records") if kolom_ada else []

    # fallback nama saham dari screener
    nama = ""
    try:
        fp = os.path.join(os.getcwd(), "Database", "hasil_screener.csv")
        if os.path.exists(fp):
            hs = pd.read_csv(fp, usecols=["Ticker", "Nama"], on_bad_lines="skip")
            baris = hs[hs["Ticker"] == ticker]
            if not baris.empty:
                nama = str(baris.iloc[0]["Nama"])
    except Exception:
        pass

    return {
        "ticker": ticker,
        "nama": nama,
        "jumlah_hari": len(g),
        "bars": g[["Tanggal", "Open", "High", "Low", "Close", "Volume",
                   "MA5_close", "MA20_close", "MA5_vol", "MA20_vol"]].fillna(0).to_dict("records"),
        "indikator": indikator,
    }
