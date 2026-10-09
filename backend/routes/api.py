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
