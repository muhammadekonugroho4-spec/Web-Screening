# =====================================================================
# backend/core/archive.py
# ---------------------------------------------------------------------
# Ekstraksi LOGIKA MURNI dari app.py PART 04 (Streamlit -> backend).
# FILE BARU (Langkah 2 migrasi). app.py TIDAK diubah sama sekali.
#
# Adaptasi untuk backend:
#   - `@st.cache_data(ttl=3600)` dihapus (backend pakai cache sendiri).
#   - `get_historical_summary_raw` / `get_forensic_data_raw` adalah versi
#     tanpa `st.*` dari `get_historical_summary` / `get_forensic_data`
#     (di app.py versi aslinya memanggil st.caption/st.warning di UI).
#   - Tidak ada pemanggilan `st.*` di file ini.
# =====================================================================
import os
import glob

import pandas as pd


def _muat_arsip_lokal():
    """Asal: app.py PART 04 (baris 636-646). Tanpa adaptasi (0x st.).
    Return: list of (date_str, df) — maksimal 5 arsip terbaru."""
    arsip_files = glob.glob("Arsip_Data_Harian/screener_*.csv")
    arsip_files.sort(reverse=True)
    hasil = []
    for file in arsip_files[:5]:
        date_str = file.split("_")[-1].replace(".csv", "")
        try:
            hasil.append((date_str, pd.read_csv(file)))
        except Exception:
            pass
    return hasil


def muat_arsip():
    """Asal: app.py PART 04 (baris 648-649). Tanpa adaptasi (0x st.).
    Return: list of (date_str, df)."""
    return _muat_arsip_lokal()


def get_historical_summary_raw(ticker):
    """Asal: app.py PART 04 `get_historical_summary` (baris 651-678).
    Versi RAW tanpa `st.*` (di app.py hasilnya hanya ditampilkan via UI).
    Return: string ringkasan rekam jejak harian, atau None jika kosong."""
    cols = ["Waktu Update", "Ticker", "Harga (Rp)", "Volume", "Posisi VWAP", "OBV Trend", "Tekanan Bandar", "Fase Siklus Bandar", "Trend MA (5,20,50)"]
    df_list = []
    for date_str, df in muat_arsip():
        try:
            ada_cols = [c for c in cols if c in df.columns]
            temp_df = df[ada_cols]
            temp_df = temp_df[temp_df["Ticker"] == ticker]
            if not temp_df.empty:
                temp_df = temp_df.copy()
                temp_df["Tanggal"] = date_str
                df_list.append(temp_df)
        except Exception:
            pass

    if not df_list: return None
    df_history = pd.concat(df_list, ignore_index=True)
    df_history = df_history.sort_values(by=["Tanggal", "Waktu Update"])

    summary_text = f"REKAM JEJAK ARSIP HARIAN SAHAM {ticker}:\n\n"
    for date, group in df_history.groupby("Tanggal"):
        open_price = group.iloc[0]["Harga (Rp)"]
        close_price = group.iloc[-1]["Harga (Rp)"]
        max_vol = group["Volume"].max()
        tekanan_akhir = group.iloc[-1]["Tekanan Bandar"]
        siklus = group.iloc[-1]["Fase Siklus Bandar"]
        summary_text += f"📅 {date} | Buka: {open_price} | Tutup: {close_price} | Max Vol Harian: {max_vol} | Tekanan Akhir: {tekanan_akhir} | Siklus Wyckoff: {siklus}\n"
    return summary_text


def get_forensic_data_raw(ticker):
    """Asal: app.py PART 04 `get_forensic_data` (baris 680-719).
    Versi RAW tanpa `st.*` (di app.py pemanggilnya yang menangani UI
    ketika return string pesan 'belum tersedia').
    Return: string rekam jejak H-3 sebelum ledakan."""
    cols = ["Waktu Update", "Ticker", "Harga (Rp)", "Volume", "Posisi VWAP", "OBV Trend", "Tekanan Bandar", "Fase Siklus Bandar", "Trend MA (5,20,50)", "Status BB", "RVOL (Anomali Vol)"]
    df_list = []
    for date_str, df in muat_arsip():
        try:
            ada_cols = [c for c in cols if c in df.columns]
            temp_df = df[ada_cols]
            temp_df = temp_df[temp_df["Ticker"] == ticker]
            if not temp_df.empty:
                temp_df = temp_df.copy()
                temp_df["Tanggal"] = date_str
                df_list.append(temp_df)
        except Exception:
            pass

    if not df_list: return None
    df_history = pd.concat(df_list, ignore_index=True)
    df_history = df_history.sort_values(by=["Tanggal", "Waktu Update"])

    tanggal_unik = sorted(df_history["Tanggal"].unique())
    if len(tanggal_unik) > 1:
        tanggal_unik = tanggal_unik[:-1]
        tanggal_unik = tanggal_unik[-3:]
    else:
        return "Data historis sebelum hari ini belum tersedia di arsip."

    df_history = df_history[df_history["Tanggal"].isin(tanggal_unik)]

    summary_text = f"REKAM JEJAK H-3 SEBELUM MELEDAK SAHAM {ticker}:\n"
    for date, group in df_history.groupby("Tanggal"):
        close_price = group.iloc[-1]["Harga (Rp)"]
        max_vol = group["Volume"].max()
        tekanan_akhir = group.iloc[-1]["Tekanan Bandar"]
        siklus = group.iloc[-1]["Fase Siklus Bandar"]
        obv = group.iloc[-1]["OBV Trend"] if "OBV Trend" in group.columns else "N/A"
        rvol = group.iloc[-1]["RVOL (Anomali Vol)"] if "RVOL (Anomali Vol)" in group.columns else "N/A"
        bb = group.iloc[-1]["Status BB"] if "Status BB" in group.columns else "N/A"

        summary_text += f"📅 {date} | Tutup: {close_price} | Vol: {max_vol} | Tekanan: {tekanan_akhir} | Siklus: {siklus} | OBV: {obv} | RVOL: {rvol} | BB: {bb}\n"
    return summary_text


def muat_buku_besar_raw():
    """Asal: app.py PART 04 `muat_buku_besar` (baris 726-735), tanpa
    `@st.cache_data(ttl=3600)`.
    Tanpa R2: buku besar hanya ada lokal jika pernah dibangun (fitur pelengkap).
    Return: pd.DataFrame."""
    try:
        path = os.path.join("Database", "ringkasan_harian.csv.gz")
        if os.path.exists(path):
            return pd.read_csv(path)
    except Exception:
        pass
    return pd.DataFrame()


def muat_arsip_harian_raw(tanggal):
    """Asal: app.py PART 04 `muat_arsip_harian` (baris 737-745), tanpa
    `@st.cache_data(ttl=3600)`.
    Return: pd.DataFrame dari Arsip_Data_Harian/screener_{tanggal}.csv."""
    try:
        path = os.path.join("Arsip_Data_Harian", f"screener_{tanggal}.csv")
        if os.path.exists(path):
            return pd.read_csv(path)
    except Exception:
        pass
    return pd.DataFrame()
