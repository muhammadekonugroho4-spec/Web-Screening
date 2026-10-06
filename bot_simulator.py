import pandas as pd
import os
import sys
from datetime import datetime, timedelta, timezone
import subprocess

# ==========================================
# ⚙️ KONFIGURASI BOT SIMULATOR BSJP (9 ARENA)
# ==========================================
MODAL_AWAL = 100000000.0  # Rp 100 Juta per Rumus
FEE_BELI = 0.0015         # 0.15%
FEE_JUAL = 0.0025         # 0.25%
FILE_MARKET = "Database/hasil_screener.csv"
DIR_DB = "Database"       
# ==========================================
def auto_save_github():
    print("\n🔄 Memulai pencadangan (Auto-Save) permanen ke GitHub...")
    try:
        subprocess.run(["git", "add", "-A", "Database/"], check=True)
        waktu_sekarang = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
        pesan_komit = f"🤖 Bot Update Portofolio: {waktu_sekarang}"
        commit_process = subprocess.run(["git", "commit", "-m", pesan_komit], capture_output=True, text=True)
        if "nothing to commit" in commit_process.stdout or "nothing to commit" in commit_process.stderr:
            print("✅ Data aman. Tidak ada transaksi baru.")
            return
        subprocess.run(["git", "pull", "--rebase", "codespace", "main"], capture_output=True, text=True)
        push_process = subprocess.run(["git", "push", "codespace", "main"], capture_output=True, text=True)
        if push_process.returncode != 0:
            subprocess.run(["git", "pull", "--rebase", "codespace", "main"], capture_output=True, text=True)
            subprocess.run(["git", "push", "codespace", "main"], check=True)
        print("🚀 Pencadangan berhasil! Data portofolio Anda abadi.")
    except Exception as e:
        print(f"❌ Gagal melakukan Auto-Save. Error: {e}")

# ==========================================
# 🛠️ FUNGSI INISIALISASI (BRANKAS 3 LAPIS)
# ==========================================
def inisialisasi_database(rumus_id):
    file_porto = os.path.join(DIR_DB, f"portofolio_aktif_rumus_{rumus_id}.csv")
    file_hist = os.path.join(DIR_DB, f"histori_transaksi_rumus_{rumus_id}.csv")
    
    if not os.path.exists(file_porto):
        pd.DataFrame(columns=['Tanggal_Beli', 'Ticker', 'Harga_Beli', 'Lot', 'Total_Modal', 'Target_TP', 'Target_CL', 'Mode_Beli', 'Change_Beli']).to_csv(file_porto, index=False)
        
    if not os.path.exists(file_hist):
        pd.DataFrame(columns=['Tanggal_Beli', 'Tanggal_Jual', 'Ticker', 'Harga_Beli', 'Harga_Jual', 'Status', 'Total_Return_Rp', 'Return_%']).to_csv(file_hist, index=False)
        
    return file_porto, file_hist

def cek_saldo_tersedia(df_porto, df_history=None):
    """Saldo = MODAL_AWAL + profit realized - modal terpasang.
    Profit ikut agar kas > 100jt bisa dideploy (BAGIAN 3.6)."""
    modal = MODAL_AWAL
    if df_history is not None and not df_history.empty and 'Total_Return_Rp' in df_history.columns:
        modal += pd.to_numeric(df_history['Total_Return_Rp'], errors='coerce').fillna(0).sum()
    if df_porto.empty:
        return modal
    return modal - pd.to_numeric(df_porto['Total_Modal'], errors='coerce').fillna(0).sum()

# ==========================================
# 🤖 MESIN EKSEKUSI UTAMA (MODE BSJP)
# ==========================================
def jalankan_bot():
    now = datetime.now(timezone.utc).replace(tzinfo=None) + timedelta(hours=7)  # WIB (UTC+7): laptop & Cloud pakai jam yang sama
    tanggal_hari_ini = now.strftime('%Y-%m-%d')
    jam_sekarang = now.time()
    jam_square_off = datetime.strptime("15:30", "%H:%M").time()
    
    print(f"[{now.strftime('%H:%M:%S')}] Membangunkan Bot Simulator AI...")

    # ----------------------------------------------------
    # 🔑 DETEKSI MODE: manual / cron / jadwal / beli-only / jual-only / tp-sl-only / liquidate
    # ----------------------------------------------------
    mode = "jadwal" if "--jadwal" in sys.argv[1:] else ("manual" if "--manual" in sys.argv[1:] else "cron")
    tp_sl_only = "--tp-sl-only" in sys.argv[1:]
    if tp_sl_only:
        mode = "cron"
        beli_only = False
    elif "--beli-only" in sys.argv[1:]:
        mode = "manual"
        beli_only = True
    elif "--jual-only" in sys.argv[1:]:
        mode = "manual"
        beli_only = False
    else:
        beli_only = None  # None = perilaku klasik (beli+jual sesuai mode)
    liquidate = "--liquidate" in sys.argv[1:]
    if liquidate:
        print("🧨 MODE LIQUIDATE: SEMUA posisi dijual paksa sekarang (aturan 'beli hari ini tahan' dilewati).")

    # ----------------------------------------------------
    # 😴 GEMBOK AKHIR PEKAN — cron libur total; mode manual tetap
    # boleh membeli karena harga penutupan tidak berubah saat akhir pekan
    # >>> LIQUIDATE BEBAS lewat kapan saja <<<
    # ----------------------------------------------------
    if now.weekday() >= 5 and mode == "cron" and not liquidate:
        print("😴 Akhir pekan terdeteksi. Cron libur — posisi aman sampai Senin.")
        return
    if now.weekday() >= 5 and not liquidate:
        print("🛒 Manual akhir pekan: pembelian harga penutupan terakhir dilayani; evaluasi jual libur sampai Senin.")

    # ----------------------------------------------------
    # 🕒 PEMBAGIAN PENULIS (anti-race): cron vs manual
    # ----------------------------------------------------
    jam_bursa_awal = datetime.strptime("08:45", "%H:%M").time()
    jam_bursa_akhir = datetime.strptime("16:05", "%H:%M").time()
    di_jam_bursa = (jam_bursa_awal <= jam_sekarang <= jam_bursa_akhir) and now.weekday() < 5
    if mode == "cron" and not di_jam_bursa and not liquidate:
        print("😴 Mode cron: di luar jam bursa. Penulis malam adalah tombol web — bot tidur.")
        return


    # ----------------------------------------------------
    # 🔒 GEMBOK PAGI: SISTEM PENGAMAN ANTI-HILANG DATA
    # ----------------------------------------------------
    if not os.path.exists(FILE_MARKET):
        print("🔒 GEMBOK AKTIF: File hasil_screener.csv tidak ditemukan. Bot menolak beroperasi agar portofolio aman!")
        return
        
    try:
        df_market = pd.read_csv(FILE_MARKET)
        if df_market.empty or 'Ticker' not in df_market.columns or 'Harga (Rp)' not in df_market.columns:
            print("🔒 GEMBOK AKTIF: Data market kosong atau cacat. Bot tidur kembali untuk melindungi data Anda.")
            return
    except Exception as e:
        print(f"🔒 GEMBOK AKTIF: Gagal membaca data market ({e}). Bot tidur kembali.")
        return
    # ----------------------------------------------------

    # ----------------------------------------------------
    # 🧓 GEMBOK DATA BASI: beli boleh malam hari (harga penutupan),
    # tetapi dilarang jika data market berusia > 3 hari
    # ----------------------------------------------------
    try:
        stempel_market = str(df_market['Terakhir Update'].iloc[0])[:10]
        usia_data = (now - datetime.strptime(stempel_market, '%Y-%m-%d')).days
    except Exception:
        usia_data = 0
    mode_beli_aktif = usia_data <= 3
    if not mode_beli_aktif:
        print(f"🔒 GEMBOK DATA BASI AKTIF: data market berusia {usia_data} hari — bot hanya evaluasi jual, tidak membeli.")

    # ----------------------------------------------------
    if is_square_off_time:
        print("🧹 WAKTU SQUARE OFF / SORE HARI! Evaluasi jual paksa diaktifkan.")

    # >>> MODE PENUH-MANUAL: --jual-only / --beli-only memutus semua otomatisasi.
    # Tidak dipakai cron; dipanggil dari tombol web Tab 4 (BELI/JUAL manual).
    if tp_sl_only:
        is_square_off_time = False
        print("🎯 MODE TP/SL-ONLY: hanya menjual posisi yang menyentuh Target_TP atau Target_CL.")
    elif beli_only is not None:
        is_square_off_time = bool(not beli_only)  # jual-only = square-off aktif; beli-only = mati
        if not beli_only:
            print("🔒 MODE JUAL-ONLY: evaluasi jual saja (TP/CL/square-off), TIDAK ada pembelian.")
        else:
            print("🛒 MODE BELI-ONLY: eksekusi sinyal saja, TIDAK ada penjualan.")

    # MENYAPU RUMUS 1 SAMPAI 9
    for i in range(1, 10):
        file_porto, file_hist = inisialisasi_database(i)
        file_sinyal = os.path.join(DIR_DB, f"sinyal_ai_rumus_{i}.csv")
        
        df_porto = pd.read_csv(file_porto)
        df_history = pd.read_csv(file_hist)
        
        porto_baru = []
        history_baru = []
        
# ==========================================
        # FASE A: MODE JUAL (CABUT SAHAM DARI GUDANG)
        # INVARIANT: TP/CL WAJIB menjual kapan pun tersentuh selama jam bursa,
        # meski posisi dibeli hari ini. Aturan "beli hari ini tahan" HANYA berlaku
        # untuk square-off (di bawah, via is_square_off_time).
        # ==========================================
        for idx, posisi in df_porto.iterrows():
            ticker = posisi['Ticker']
            tgl_beli_saham = str(posisi['Tanggal_Beli']).split()[0]

            # Cek apakah ticker masih ada di market
            try:
                harga_sekarang = df_market[df_market['Ticker'] == ticker]['Harga (Rp)'].values[0]
                ticker_ada = True
            except:
                # >>> SUSPEND_FORCE_EXIT: ticker tidak ditemukan = suspend/delisting
                ticker_ada = False
                harga_jual = posisi['Harga_Beli']  # jual di harga beli → loss hanya fee
                status_jual = "SUSPEND_FORCE_EXIT ⚠️"

                # Hitung profit (akan rugi sebesar fee beli+jual)
                nilai_jual_kotor = harga_jual * posisi['Lot'] * 100
                nilai_jual_bersih = nilai_jual_kotor - (nilai_jual_kotor * FEE_JUAL)
                profit_rp = nilai_jual_bersih - posisi['Total_Modal']
                profit_pct = (profit_rp / posisi['Total_Modal']) * 100

                # Anti-duplikasi histori
                sudah_ada = False
                if not df_history.empty:
                    sudah_ada = ((df_history['Ticker'] == ticker) & (df_history['Tanggal_Beli'] == posisi['Tanggal_Beli'])).any()
                if sudah_ada:
                    print(f"⚠️ [RUMUS {i}] {ticker} sudah ada di histori — duplikat SUSPEND dicegah.")
                    continue

                history_baru.append({
                    'Tanggal_Beli': posisi['Tanggal_Beli'],
                    'Tanggal_Jual': now.strftime("%Y-%m-%d %H:%M"),
                    'Ticker': ticker,
                    'Harga_Beli': posisi['Harga_Beli'],
                    'Harga_Jual': harga_jual,
                    'Status': status_jual,
                    'Total_Return_Rp': round(profit_rp, 2),
                    'Return_%': round(profit_pct, 2),
                    'Mode_Beli': posisi.get('Mode_Beli', 'MANUAL'),
                    'Change_Beli': posisi.get('Change_Beli', 0)
                })
                print(f"⚠️ [RUMUS {i}] SUSPEND_FORCE_EXIT: {ticker} | Jual paksa @ Rp {harga_jual} (harga beli) | {profit_pct:.2f}% (fee only)")
                continue  # skip evaluasi TP/CL/square-off/liquidate

            # >>> Flow normal: ticker ada → evaluasi TP/CL/square-off/liquidate
            terjual = False
            status_jual = ""
            harga_jual = 0

            # >>> BELI-ONLY: lewati seluruh evaluasi jual (posisi aman)
            if beli_only is True:
                porto_baru.append(posisi)
                continue

            # >>> TP/SL-ONLY: posisi yang belum menyentuh target tetap disimpan.
            # Penjualan sore untuk posisi tersebut dilakukan lewat tombol JUAL di web.
            if tp_sl_only:
                if harga_sekarang >= posisi['Target_TP']:
                    terjual = True
                    status_jual = "TAKE_PROFIT 🎯 (auto TP)"
                    harga_jual = harga_sekarang
                elif harga_sekarang <= posisi['Target_CL']:
                    terjual = True
                    status_jual = "CUT_LOSS ✂️ (auto SL)"
                    harga_jual = harga_sekarang
                else:
                    porto_baru.append(posisi)
                    continue

                sudah_ada = False
                if not df_history.empty:
                    sudah_ada = ((df_history['Ticker'] == ticker) & (df_history['Tanggal_Beli'] == posisi['Tanggal_Beli'])).any()
                if sudah_ada:
                    print(f"⚠️ [RUMUS {i}] {ticker} sudah ada di histori — duplikat TP/SL dicegah.")
                    continue

                nilai_jual_kotor = harga_jual * posisi['Lot'] * 100
                nilai_jual_bersih = nilai_jual_kotor - (nilai_jual_kotor * FEE_JUAL)
                profit_rp = nilai_jual_bersih - posisi['Total_Modal']
                profit_pct = (profit_rp / posisi['Total_Modal']) * 100
                history_baru.append({
                    'Tanggal_Beli': posisi['Tanggal_Beli'],
                    'Tanggal_Jual': now.strftime("%Y-%m-%d %H:%M"),
                    'Ticker': ticker,
                    'Harga_Beli': posisi['Harga_Beli'],
                    'Harga_Jual': harga_jual,
                    'Status': status_jual,
                    'Total_Return_Rp': round(profit_rp, 2),
                    'Return_%': round(profit_pct, 2),
                    'Mode_Beli': posisi.get('Mode_Beli', 'MANUAL'),
                    'Change_Beli': posisi.get('Change_Beli', 0)
                })
                print(f"💰 [RUMUS {i}] JUAL: {ticker} @ Rp {harga_jual} | {status_jual} | {profit_pct:.2f}%")
                continue

            # >>> JUAL-ONLY: tombol manual — aturan 'beli hari ini tahan' DILEWATI.
            # Semua posisi (termasuk yang dibeli hari ini) dievaluasi paksa:
            # TP/CL tersentuh → jual; sisanya square-off (sesuai tombol JUAL).
            if beli_only is False and not liquidate:
                if harga_sekarang >= posisi['Target_TP']:
                    terjual = True; status_jual = "TAKE_PROFIT 🎯 (manual)"; harga_jual = harga_sekarang
                elif harga_sekarang <= posisi['Target_CL']:
                    terjual = True; status_jual = "CUT_LOSS ✂️ (manual)"; harga_jual = harga_sekarang
                else:
                    terjual = True; status_jual = "AUTO_SQUARE_OFF 🧹 (manual)"; harga_jual = harga_sekarang
                if terjual:
                    sudah_ada = False
                    if not df_history.empty:
                        sudah_ada = ((df_history['Ticker'] == ticker) & (df_history['Tanggal_Beli'] == posisi['Tanggal_Beli'])).any()
                    if sudah_ada:
                        print(f"⚠️ [RUMUS {i}] {ticker} sudah ada di histori — duplikat penjualan dicegah.")
                        continue
                    nilai_jual_kotor = harga_jual * posisi['Lot'] * 100
                    nilai_jual_bersih = nilai_jual_kotor - (nilai_jual_kotor * FEE_JUAL)
                    profit_rp = nilai_jual_bersih - posisi['Total_Modal']
                    profit_pct = (profit_rp / posisi['Total_Modal']) * 100
                    history_baru.append({
                        'Tanggal_Beli': posisi['Tanggal_Beli'],
                        'Tanggal_Jual': now.strftime("%Y-%m-%d %H:%M"),
                        'Ticker': ticker, 'Harga_Beli': posisi['Harga_Beli'], 'Harga_Jual': harga_jual,
                        'Status': status_jual, 'Total_Return_Rp': round(profit_rp, 2),
                        'Return_%': round(profit_pct, 2),
                        'Mode_Beli': posisi.get('Mode_Beli', 'MANUAL'),
                        'Change_Beli': posisi.get('Change_Beli', 0)
                    })
                    print(f"💰 [RUMUS {i}] JUAL: {ticker} @ Rp {harga_jual} | {status_jual} | {profit_pct:.2f}%")
                continue

            # >>> LIQUIDATE: jual paksa semua posisi
            if liquidate:
                terjual = True
                status_jual = "LIQUIDATE MANUAL 🧨"
                harga_jual = harga_sekarang
            elif is_square_off_time and tgl_beli_saham != tanggal_hari_ini:
                terjual = True
                status_jual = "AUTO_SQUARE_OFF 🧹"
                harga_jual = harga_sekarang
            elif harga_sekarang >= posisi['Target_TP']:
                terjual = True
                status_jual = "TAKE_PROFIT 🎯"
                harga_jual = harga_sekarang
            elif harga_sekarang <= posisi['Target_CL']:
                terjual = True
                status_jual = "CUT_LOSS ✂️"
                harga_jual = harga_sekarang

            if terjual:
                # >>> ANTI-DUPLIKASI: posisi yang sudah tercatat di histori tidak dicatat lagi
                sudah_ada = False
                if not df_history.empty:
                    sudah_ada = ((df_history['Ticker'] == ticker) & (df_history['Tanggal_Beli'] == posisi['Tanggal_Beli'])).any()
                if sudah_ada:
                    print(f"⚠️ [RUMUS {i}] {ticker} sudah ada di histori — duplikat penjualan dicegah.")
                    continue

                nilai_jual_kotor = harga_jual * posisi['Lot'] * 100
                nilai_jual_bersih = nilai_jual_kotor - (nilai_jual_kotor * FEE_JUAL)
                profit_rp = nilai_jual_bersih - posisi['Total_Modal']
                profit_pct = (profit_rp / posisi['Total_Modal']) * 100
                
                history_baru.append({
                    'Tanggal_Beli': posisi['Tanggal_Beli'],
                    'Tanggal_Jual': now.strftime("%Y-%m-%d %H:%M"),
                    'Ticker': ticker,
                    'Harga_Beli': posisi['Harga_Beli'],
                    'Harga_Jual': harga_jual,
                    'Status': status_jual,
                    'Total_Return_Rp': round(profit_rp, 2),
                    'Return_%': round(profit_pct, 2),
                    'Mode_Beli': posisi.get('Mode_Beli', 'MANUAL'),
                    'Change_Beli': posisi.get('Change_Beli', 0)
                })
                print(f"💰 [RUMUS {i}] JUAL: {ticker} @ Rp {harga_jual} | {status_jual} | {profit_pct:.2f}%")
            else:
                porto_baru.append(posisi)

        df_porto = pd.DataFrame(porto_baru)
        if df_porto.empty:
            df_porto = pd.DataFrame(columns=['Tanggal_Beli', 'Ticker', 'Harga_Beli', 'Lot', 'Total_Modal', 'Target_TP', 'Target_CL'])
        
        if history_baru:
            df_history = pd.concat([df_history, pd.DataFrame(history_baru)], ignore_index=True)

        # ==========================================
        # FASE B: MODE BELI (MASUKKAN SAHAM KE GUDANG)
        # >>> LIQUIDATE: skip beli agar tidak langsung beli ulang sinyal lama
        # ==========================================
        if (mode == "manual" or mode == "jadwal") and not tp_sl_only and beli_only is not False and mode_beli_aktif and os.path.exists(file_sinyal) and not liquidate:
            saldo_sekarang = cek_saldo_tersedia(df_porto, df_history)
            saham_dimiliki = df_porto['Ticker'].tolist() if not df_porto.empty else []
            jumlah_beli = 0
            try:
                df_sinyal = pd.read_csv(file_sinyal)
                # Mode jadwal: hanya beli sinyal dengan stempel hari ini
                if mode == "jadwal" and 'Stempel' in df_sinyal.columns:
                    tgl_hari_ini = now.strftime('%Y-%m-%d')
                    df_sinyal = df_sinyal[df_sinyal['Stempel'] == tgl_hari_ini]
                    if df_sinyal.empty:
                        print(f"⏭️ [RUMUS {i}] Tidak ada sinyal jadwal hari ini — dilewati.")
                        continue
                # --- FASE B v5.1: alokasi beli dinamis (saldo / N sinyal valid) ---
                # Pass 1: kumpulkan sinyal valid (belum dimiliki, ada di market, harga > 0)
                sinyal_valid = []
                for _, sinyal in df_sinyal.iterrows():
                    ticker = str(sinyal['Ticker']).strip()
                    if ticker in saham_dimiliki:
                        print(f"   ↳ {ticker}: sudah dimiliki, lewati.")
                        continue
                    try:
                        harga_beli = float(df_market[df_market['Ticker'] == ticker]['Harga (Rp)'].values[0])
                    except Exception:
                        print(f"   ↳ {ticker}: TIDAK ADA di data market (suspend/delisting) — lewati.")
                        continue
                    if harga_beli <= 0:
                        print(f"   ↳ {ticker}: harga tidak valid (0) — lewati.")
                        continue
                    try:
                        change_beli = float(df_market[df_market['Ticker'] == ticker]['Change (%)'].values[0])
                    except Exception:
                        change_beli = 0.0
                    sinyal_valid.append((ticker, harga_beli, sinyal, change_beli))
                # Pass 2: alokasi dinamis saldo / N, dengan pagar saldo tersisa
                N = len(sinyal_valid)
                if N == 0:
                    print(f"⚠️ [RUMUS {i}] TIDAK ada pembelian — kertas belanja DIPERTAHANKAN.")
                else:
                    alokasi_rencana = saldo_sekarang / N
                    for ticker, harga_beli, sinyal, change_beli in sinyal_valid:
                        harga_1_lot_plus_fee = (harga_beli * 100) * (1 + FEE_BELI)
                        lot = int(alokasi_rencana // harga_1_lot_plus_fee)
                        lot = min(lot, int(saldo_sekarang // harga_1_lot_plus_fee))
                        if lot < 1:
                            print(f"   ↳ {ticker}: lot < 1 (alokasi Rp {alokasi_rencana:,.0f}/sinyal tak cukup) — lewati.")
                            continue
                        total_modal_dikeluarkan = lot * harga_1_lot_plus_fee
                        df_porto = pd.concat([df_porto, pd.DataFrame([{
                            'Tanggal_Beli': now.strftime("%Y-%m-%d %H:%M"),
                            'Ticker': ticker,
                            'Harga_Beli': harga_beli,
                            'Lot': lot,
                            'Total_Modal': total_modal_dikeluarkan,
                            'Target_TP': sinyal['Target_TP'],
                            'Target_CL': sinyal['Target_CL'],
                            'Mode_Beli': 'JADWAL' if mode == 'jadwal' else 'MANUAL',
                            'Change_Beli': change_beli
                        }])], ignore_index=True)
                        saldo_sekarang -= total_modal_dikeluarkan
                        jumlah_beli += 1
                        print(f"🛒 [RUMUS {i}] BELI: {ticker} @ Rp {harga_beli} | {lot} Lot (alokasi Rp {alokasi_rencana:,.0f}/sinyal)")
                        if change_beli >= 20:
                            print(f"🚀 [RUMUS {i}] BELI-SAAT-ARA: {ticker} change {change_beli:+.1f}% — simulasi beli di harga ARA")
                if jumlah_beli > 0:
                    os.remove(file_sinyal)
                    print(f"🔥 [RUMUS {i}] Kertas belanja dibakar ({jumlah_beli} saham dibeli).")
                else:
                    print(f"⚠️ [RUMUS {i}] TIDAK ada pembelian — kertas belanja DIPERTAHANKAN.")
            except Exception as e:
                print(f"⚠️ Gagal membaca sinyal Rumus {i}: {e}")
        elif os.path.exists(file_sinyal):
            if beli_only is False:
                print(f" 📝 [RUMUS {i}] Sinyal antre — mode jual-only, pembelian dilewati.")
            elif not mode_beli_aktif:
                print(f" [RUMUS {i}] Sinyal ditahan (data basi) — akan dieksekusi saat data segar.")

        df_porto.to_csv(file_porto, index=False)
        df_history.to_csv(file_hist, index=False)

    # EKSEKUSI AUTO-SAVE KE GITHUB
    auto_save_github()

if __name__ == "__main__":
    jalankan_bot()
