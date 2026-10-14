#!/bin/bash
# ==========================================
# ⚠️ MODE BELI MANUAL: pembelian hanya lewat tombol web Tab 4.
# Cron otomatis hanya memeriksa TP/SL; posisi lain dijual lewat tombol JUAL sore.
# ==========================================
exec 200>/tmp/bot_simulator_ws.lock
flock -n 200 || { echo "⏳ Siklus dilewati: bot sebelumnya masih berjalan."; exit 0; }

# 🏖️ AKHIR PEKAN: Sabtu(6)/Minggu(0→7) tidak menyedot data sama sekali
HARI=$(date +%u)  # 1=Senin ... 5=Jumat, 6=Sabtu, 7=Minggu
if [ "$HARI" -ge 6 ]; then
    echo "🏖️ Akhir pekan (Sabtu/Minggu) — tidak menyedot data. Keluar."
    exit 0
fi

cd /home/kaltaraid/Documents/WEB-SCREENING/ || exit 1

git rebase --abort >/dev/null 2>&1
git merge --abort >/dev/null 2>&1
git pull --rebase codespace main || git rebase --abort

# ==========================================
# 📡 CONSUMER: tarik data dari DATA-CENTER feed (BUKAN dari Yahoo)
# Producer tunggal di /home/kaltaraid/Documents/DATA-CENTER
# ==========================================
FEED="/home/kaltaraid/Documents/DATA-CENTER/feed"
echo "📡 Menarik data dari DATA-CENTER feed..."
if [ -f "$FEED/hasil_screener.csv" ]; then
    mkdir -p Database Arsip_Data_Harian
    cp "$FEED/hasil_screener.csv" Database/hasil_screener.csv.tmp && mv Database/hasil_screener.csv.tmp Database/hasil_screener.csv
    [ -f "$FEED/fundamental_exodus.csv" ] && cp "$FEED/fundamental_exodus.csv" Database/fundamental_exodus.csv
    HARI_INI=$(date +%F)
    [ -f "$FEED/arsip/screener_${HARI_INI}.csv" ] && cp "$FEED/arsip/screener_${HARI_INI}.csv" "Arsip_Data_Harian/screener_${HARI_INI}.csv"
    echo "✅ Feed masuk ke Database/ ($(stat -c %s Database/hasil_screener.csv) bytes)"
else
    echo "⚠️ Feed DATA-CENTER belum tersedia — pakai data lokal terakhir."
fi

JAM_SEKARANG=$(date +%H%M)
FLAG_PAGI="/tmp/bsjp_pagi_ws_$(date +%F)"
FLAG_SORE="/tmp/bsjp_sore_ws_$(date +%F)"

if [ "$JAM_SEKARANG" -ge "1520" ] && [ "$JAM_SEKARANG" -le "1535" ]; then
    if [ ! -f "$FLAG_PAGI" ]; then
        echo "🧠 [15:20-15:35] Sidang jadwal (hanya bikin sinyal — TIDAK membeli)..."
        if ./.venv/bin/python sidang_jadwal.py; then
            touch "$FLAG_PAGI"
        else
            echo "❌ Sidang jadwal gagal — dicoba lagi siklus berikutnya."
        fi
    else
        echo "⏭️ Sidang pagi sudah jalan hari ini, dilewati."
    fi
elif [ "$JAM_SEKARANG" -ge "1600" ] && [ "$JAM_SEKARANG" -le "1610" ]; then
    if [ ! -f "$FLAG_SORE" ]; then
        echo "🌆 [16:00-16:10] Sidang sore (referensi)..."
        if ./.venv/bin/python sidang_sore.py; then
            touch "$FLAG_SORE"
        else
            echo "❌ Sidang sore gagal — dicoba lagi siklus berikutnya."
        fi
    fi
else
    echo "🎯 Auto TP/SL: memeriksa posisi yang menyentuh Target_TP/Target_CL..."
    ./.venv/bin/python bot_simulator.py --tp-sl-only
fi

./.venv/bin/python bangun_buku_besar.py

# Pembersih arsip diupdate_data.py sudah menjaga maksimal 5 hari (hapus ke-6+)

echo "📤 Mengupload ke GitHub..."
git add -A Database/
git commit -m "Auto-update data dan bot simulator (arsip via git)" || echo "Tidak ada perubahan"
git pull --rebase codespace main || git rebase --abort
git push codespace main || { git rebase --abort >/dev/null 2>&1; git pull --rebase codespace main; git push codespace main; }

echo "✅ Proses 100% Selesai!"
