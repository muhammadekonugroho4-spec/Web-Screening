# ==========================================
# 🔄 RESET PORTOFOLIO KE KONDISI AWAL (dengan ARSIP aman)
# Pindah porto/histori/sinyal lama ke Database/ARSIP_RESET_<tanggal>/
# Buat ulang file kosong (modal 100jt/arena) + mirror ke R2.
# Jalankan: ./.venv/bin/python reset_porto.py [--yes]
# ==========================================
import os, sys, shutil
import pandas as pd
from datetime import datetime, timedelta, timezone

now = datetime.now(timezone.utc).replace(tzinfo=None) + timedelta(hours=7)
tag = now.strftime("%Y-%m-%d_%H%M")

# Langkah 6: dukung multi-user via --user <username> (backward compatible)
args = sys.argv[1:]
username = None
if "--user" in args:
    idx = args.index("--user")
    if idx + 1 < len(args):
        username = args[idx + 1]
DIR_DB = os.path.join("Database", "users", username) if username else "Database"

folder = os.path.join(DIR_DB, f"ARSIP_RESET_{tag}")
os.makedirs(folder, exist_ok=True)

KOLOM_PORTO = ['Tanggal_Beli', 'Ticker', 'Harga_Beli', 'Lot', 'Total_Modal', 'Target_TP', 'Target_CL', 'Mode_Beli', 'Change_Beli']
KOLOM_HIST = ['Tanggal_Beli', 'Tanggal_Jual', 'Ticker', 'Harga_Beli', 'Harga_Jual', 'Status', 'Total_Return_Rp', 'Return_%', 'Mode_Beli', 'Change_Beli']

dipindah = 0
for i in range(1, 10):
    for jenis in ["portofolio_aktif", "histori_transaksi", "sinyal_ai"]:
        src = os.path.join(DIR_DB, f"{jenis}_rumus_{i}.csv")
        if os.path.exists(src):
            shutil.move(src, os.path.join(folder, f"{jenis}_rumus_{i}.csv"))
            dipindah += 1

# Buat ulang file kosong (header sesuai skema bot) — modal 100jt per arena dihitung otomatis
for i in range(1, 10):
    pd.DataFrame(columns=KOLOM_PORTO).to_csv(os.path.join(DIR_DB, f"portofolio_aktif_rumus_{i}.csv"), index=False)
    pd.DataFrame(columns=KOLOM_HIST).to_csv(os.path.join(DIR_DB, f"histori_transaksi_rumus_{i}.csv"), index=False)

print(f"✅ {dipindah} file lama diarsipkan ke {folder}")
print(f"✅ 9 arena dibuat ulang kosong di {DIR_DB} (modal awal Rp 100.000.000/arena, profit 0)")

if "--yes" not in sys.argv:
    print("\nLangkah push GitHub (atau biarkan cron yang push):")
    print('  git add -A Database/ && git commit -m "Reset portofolio: arsip lama, mulai lembar baru" && git push codespace main')
