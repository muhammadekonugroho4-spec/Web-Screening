#!/bin/bash
# ==========================================
# 🚀 DEPLOY TRIGGER — Fase C2 otomatis
# Update stempel DEPLOY_TRIGGER.txt + push → Railway auto-deploy 1x
# (railway.json watchPaths hanya memantau file trigger + folder kode)
# Cron: 55 8 * * 1-5  dan  30 17 * * 1-5
# ==========================================
exec 201>/tmp/deploy_trigger_ws.lock
flock -n 201 || { echo "⏳ Trigger lain masih berjalan."; exit 0; }

HARI=$(date +%u)  # 1=Senin ... 7=Minggu
if [ "$HARI" -ge 6 ]; then
    echo "🏖️ Akhir pekan — tidak ada deploy trigger."
    exit 0
fi

cd /home/kaltaraid/Documents/WEB-SCREENING/ || exit 1

# Pastikan sinkron dengan remote dulu
git pull --rebase codespace main >/dev/null 2>&1 || true

STempel="$(date '+%Y-%m-%d %H:%M:%S') WIB (auto)"
printf '# Deploy Trigger\n# File ini HANYA penanda agar Railway auto-deploy (watchPaths di railway.json).\n# Diupdate otomatis oleh deploy_trigger.sh (cron 08:55 & 17:30 hari bursa).\nstempel: %s\n' "$STempel" > DEPLOY_TRIGGER.txt

git add DEPLOY_TRIGGER.txt
if git diff --cached --quiet; then
    echo "⏭️ Tidak ada perubahan trigger."
    exit 0
fi

git commit -m "chore(deploy): trigger deploy harian $(date +%F_%H%M)" --quiet
git push codespace main && echo "🚀 Deploy trigger terkirim ($(date +%H:%M:%S)) — Railway sedang build dengan data terbaru."
