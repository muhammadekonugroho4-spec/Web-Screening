# backend/loader.py — shared data loading (sama dengan Opsi C sebelumnya)
import os, json, glob, tempfile, time, pandas as pd
BASE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
DB = os.path.join(BASE, "Database")

FILE_HASIL = os.path.join(DB, "hasil_screener.csv")
FILE_FUND = os.path.join(DB, "fundamental_exodus.csv")
FILE_RADAR = os.path.join(DB, "radar_snapshot.json")
FILE_RADAR_SORE = os.path.join(DB, "radar_snapshot_sore.json")

NAMA_RUMUS = {1: "Smart Money Menyelam", 2: "Pantulan Jarum Bawah", 3: "Tutup Kuat Bandar Hajar",
              4: "Golden Cross Muda", 5: "Momentum Likuid Sehat", 6: "Ledakan Volume Senyap",
              7: "Anomali ML", 8: "Momentum Tembus MA20", 9: "MACD Momentum Terukur"}

_CACHE = {}
_TTL = 45

def _cache_get(k):
    e = _CACHE.get(k)
    if e and (time.time() - e[0]) < _TTL: return e[1]
    return None

def _cache_set(k, v):
    _CACHE[k] = (time.time(), v); return v

def muat_screener():
    df = _cache_get("screener")
    if df is not None: return df
    df = pd.read_csv(FILE_HASIL) if os.path.exists(FILE_HASIL) else pd.DataFrame()
    return _cache_set("screener", df)

def muat_fundamental():
    df = _cache_get("fundamental")
    if df is not None: return df
    df = pd.read_csv(FILE_FUND) if os.path.exists(FILE_FUND) else pd.DataFrame()
    return _cache_set("fundamental", df)

def ringkasan_market():
    df = muat_screener()
    if df.empty: return {"jumlah_saham": 0}
    chg = pd.to_numeric(df.get("Change (%)"), errors="coerce")
    vol = pd.to_numeric(df.get("Volume"), errors="coerce").fillna(0)
    hrg = pd.to_numeric(df.get("Harga (Rp)"), errors="coerce").fillna(0)
    return {
        "jumlah_saham": len(df),
        "naik": int((chg > 0).sum()), "turun": int((chg < 0).sum()), "stagnan": int((chg == 0).sum()),
        "stempel": str(df["Terakhir Update"].dropna().iloc[-1]) if "Terakhir Update" in df.columns else None
    }

def data_portofolio(username):
    udir = os.path.join(DB, "users", username)
    hasil = []
    for i in range(1, 10):
        p = os.path.join(udir, f"portofolio_aktif_rumus_{i}.csv")
        h = os.path.join(udir, f"histori_transaksi_rumus_{i}.csv")
        s = os.path.join(udir, f"sinyal_ai_rumus_{i}.csv")
        dfp = pd.read_csv(p) if os.path.exists(p) else pd.DataFrame()
        dfh = pd.read_csv(h) if os.path.exists(h) else pd.DataFrame()
        dfs = pd.read_csv(s) if os.path.exists(s) else pd.DataFrame()
        modal = dfp["Total_Modal"].sum() if not dfp.empty and "Total_Modal" in dfp.columns else 0
        profit = dfh["Total_Return_Rp"].sum() if not dfh.empty and "Total_Return_Rp" in dfh.columns else 0
        hasil.append({"rumus": i, "nama": NAMA_RUMUS[i], "modal_terpasang": float(modal),
                      "realized_pnl": float(profit), "saldo": 100000000 + float(profit) - float(modal),
                      "posisi": len(dfp), "sinyal": len(dfs)})
    return {"arena": hasil}

def data_radar(mode="pagi"):
    path = FILE_RADAR if mode == "pagi" else FILE_RADAR_SORE
    if not os.path.exists(path):
        return {"ada": False}
    snap = json.load(open(path))
    keranjang = []
    for i in range(1, 10):
        daftar = [t for t in snap.get("keranjang", {}).get(f"RUMUS {i}", []) if t]
        keranjang.append({"rumus": i, "nama": NAMA_RUMUS[i], "ticker": daftar})
    return {"ada": True, "mode": snap.get("mode"), "keranjang": keranjang,
            "stempel": snap.get("stempel_data"), "waktu": snap.get("waktu")}
