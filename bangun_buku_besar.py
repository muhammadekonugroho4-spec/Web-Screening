# ==========================================
# 📖 BUKU BESAR HARIAN — ringkasan 1 baris/saham/hari
# Disimpan LOKAL: Database/ringkasan_harian.csv.gz (gzip, ringan)
# Mode malam: cron | Mode pertama: --backfill (dari arsip lokal)
# ==========================================
import pandas as pd, os, glob, sys

KEY_LEDGER = os.path.join("Database", "ringkasan_harian.csv.gz")
KOLOM = ["Tanggal","Ticker","Open","High","Low","Close","Volume","Swing_%","Puncak_Change_%",
         "Tekanan","Siklus","Supply","AD","BB","RVOL","Score","Rekomendasi"]

def muat_ledger():
    if os.path.exists(KEY_LEDGER):
        try: return pd.read_csv(KEY_LEDGER)
        except Exception: pass
    return pd.DataFrame(columns=KOLOM)

def ringkas_hari(file_csv, tanggal):
    df = pd.read_csv(file_csv)
    if df.empty or "Ticker" not in df.columns: return []
    for k in ["Harga (Rp)", "Volume", "Change (%)"]:
        if k in df.columns: df[k] = pd.to_numeric(df[k], errors="coerce")
    baris = []
    for t, g in df.groupby("Ticker"):
        g = g.dropna(subset=["Harga (Rp)"]) if "Harga (Rp)" in g else g
        if g.empty: continue
        low, high = g["Harga (Rp)"].min(), g["Harga (Rp)"].max()
        last = g.iloc[-1]
        swing = (high - low) / low * 100 if low else 0.0
        puncak = g["Change (%)"].max() if "Change (%)" in g.columns else 0.0
        baris.append({"Tanggal": tanggal, "Ticker": t,
            "Open": g["Harga (Rp)"].iloc[0], "High": high, "Low": low, "Close": last["Harga (Rp)"],
            "Volume": last.get("Volume", 0), "Swing_%": round(swing, 2), "Puncak_Change_%": round(puncak, 2),
            "Tekanan": last.get("Tekanan Bandar", "Normal"), "Siklus": last.get("Fase Siklus Bandar", "Normal"),
            "Supply": last.get("Kondisi Supply", "Normal"), "AD": last.get("Kekuatan A/D", "Normal"),
            "BB": last.get("Status BB", "Normal"), "RVOL": last.get("RVOL (Anomali Vol)", "Normal"),
            "Score": last.get("Total Score", 0), "Rekomendasi": last.get("Rekomendasi", "WAIT & SEE")})
    return baris

def main():
    ledger = muat_ledger()
    punya = set(ledger["Tanggal"].astype(str)) if not ledger.empty else set()
    sumber = []
    for f in glob.glob("Arsip_Data_Harian/screener_*.csv"):
        tgl = f.split("_")[-1].replace(".csv", "")
        if tgl not in punya: sumber.append((tgl, f))
    if not sumber:
        print("📖 Buku besar sudah mutakhir.")
        return
    sumber.sort()
    tambahan = []
    for tgl, src in sumber:
        tambahan += ringkas_hari(src, tgl)
        print(f"📖 {tgl} diringkas (total sementara +{len(tambahan)} baris)")
    if tambahan:
        df_baru = pd.DataFrame(tambahan, columns=KOLOM)
        ledger = pd.concat([ledger, df_baru], ignore_index=True) if not ledger.empty else df_baru
        ledger = ledger.drop_duplicates(subset=["Tanggal", "Ticker"], keep="last")
        tgl_unik = sorted(ledger["Tanggal"].astype(str).unique())
        if len(tgl_unik) > 60:
            ledger = ledger[~ledger["Tanggal"].astype(str).isin(tgl_unik[:-60])]
        ledger.to_csv(KEY_LEDGER, index=False, compression="gzip")
        print(f"✅ Buku besar lokal: {len(ledger)} baris / {ledger['Tanggal'].nunique()} hari.")

if __name__ == "__main__":
    main()
