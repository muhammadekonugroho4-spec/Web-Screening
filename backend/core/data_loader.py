# =====================================================================
# backend/core/data_loader.py
# ---------------------------------------------------------------------
# Ekstraksi LOGIKA MURNI dari app.py PART 07 (Streamlit -> backend).
# FILE BARU (Langkah 2 migrasi). app.py TIDAK diubah sama sekali.
#
# Adaptasi untuk backend:
#   - `@st.cache_data(ttl=300/1800)` dihapus (backend pakai cache
#     sendiri nanti, lihat backend/loader.py).
#   - Tidak ada pemanggilan `st.*` di file ini.
#   - Konstanta path (FILE_HASIL, FILE_AKUISISI) dan mapping kolom
#     fundamental disalin persis dari app.py PART 07 supaya perilaku
#     baca CSV identik.
# =====================================================================
import os
import json

import pandas as pd

# Path data (persis seperti app.py PART 07, baris 1209-1210)
FILE_HASIL = "Database/hasil_screener.csv"
FILE_AKUISISI = "Database/data_akuisisi.csv"

# Mapping kolom fundamental Exodus (persis seperti app.py, baris 1318-1330)
KOLOM_FUND_EXODUS = {
    "Market Cap": "Mkt Cap (Exodus)",
    "Current PE Ratio (TTM)": "PE TTM (Exodus)",
    "Current Price to Book Value": "PBV (Exodus)",
    "Current Price to Sales (TTM)": "P/S TTM (Exodus)",
    "Earnings Yield (TTM)": "Earnings Yield",
    "Dividend Yield": "Div Yield",
    "Piotroski F-Score": "F-Score",
    "EPS Rating": "EPS Rating",
    "Relative Strength Rating": "RS Rating",
    "Current Book Value Per Share": "BVPS (Exodus)",
    "PEG Ratio": "PEG",
}


def load_data_saham_raw():
    """Asal: app.py PART 07 `load_data_saham` (baris 1288-1305), tanpa
    `@st.cache_data(ttl=300)` dan tanpa `global SUMBER_DATA` (variabel UI).
    Return: pd.DataFrame (baca CSV langsung + merge data akuisisi)."""
    df = None
    if not os.path.exists(FILE_HASIL): return pd.DataFrame()
    try:
        df = pd.read_csv(FILE_HASIL)
    except Exception:
        return pd.DataFrame()

    if os.path.exists(FILE_AKUISISI):
        df_akuisisi = pd.read_csv(FILE_AKUISISI)
        if "Status Akuisisi" in df.columns: df = df.drop(columns=["Status Akuisisi"])
        df = df.merge(df_akuisisi, on="Ticker", how="left")
        df["Status Akuisisi"] = df["Status Akuisisi"].fillna("TIDAK ADA")
    else: df["Status Akuisisi"] = "TIDAK ADA"
    return df


def _muat_fundamental_exodus_raw():
    """Asal: app.py PART 07 `_muat_fundamental_exodus` (baris 1332-1341),
    tanpa `@st.cache_data(ttl=1800)`.
    Muat CSV fundamental lokal. Return: pd.DataFrame (boleh kosong)."""
    fp = os.path.join("Database", "fundamental_exodus.csv")
    if os.path.exists(fp):
        try:
            return pd.read_csv(fp)
        except Exception:
            pass
    return pd.DataFrame()


def muat_sinyal_arena_raw(rumus_id):
    """Asal: app.py PART 07 `muat_sinyal_arena` (baris 1369-1377), tanpa
    `@st.cache_data(ttl=300)`.
    Return: pd.DataFrame dari Database/sinyal_ai_rumus_{rumus_id}.csv."""
    fs = os.path.join("Database", f"sinyal_ai_rumus_{rumus_id}.csv")
    if not os.path.exists(fs):
        return pd.DataFrame()
    try:
        return pd.read_csv(fs)
    except Exception:
        return pd.DataFrame()


def muat_keranjang_radar_raw(stempel_now, versi_sidang):
    """Asal: app.py PART 07 `muat_keranjang_radar` (baris 1379-1403), tanpa
    `@st.cache_data(ttl=300)`.
    Baca cache_autopilot.json + sinyal per arena (Radar Live).
    Return: tuple (dict keranjang atau None, status string)."""
    try:
        fp = os.path.join("Database", "cache_autopilot.json")
        if os.path.exists(fp):
            with open(fp) as f:
                cm = json.load(f)
            if cm.get("versi") == versi_sidang and cm.get("keranjang") and cm.get("stempel_data") == stempel_now:
                return cm["keranjang"], "cache_cocok"
    except Exception:
        pass
    ker, ada = {}, False
    for i in range(1, 10):
        fs = f"Database/sinyal_ai_rumus_{i}.csv"
        if os.path.exists(fs):
            try:
                ds = pd.read_csv(fs)
                ker[f"RUMUS {i}"] = (ds["Ticker"].tolist() + ["", "", "", "", ""])[:5]
                ada = True
            except Exception:
                ker[f"RUMUS {i}"] = ["", "", "", "", ""]
        else:
            ker[f"RUMUS {i}"] = ["", "", "", "", ""]
    return (ker if ada else None), "sinyal"
