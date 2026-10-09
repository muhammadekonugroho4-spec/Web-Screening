#!/bin/bash
# Jalankan semua service WEB-SCREENING (FastAPI)
DIR="/home/kaltaraid/Documents/WEB-SCREENING"
LOG="$DIR/logs"

cd "$DIR" || exit 1

# Pastikan tidak ada duplikat
pkill -f "uvicorn backend.main:app" 2>/dev/null
sleep 1

# FastAPI backend (Opsi A multi-user)
nohup .venv/bin/uvicorn backend.main:app --host 0.0.0.0 --port 8100 > "$LOG/opsia.log" 2>&1 &

sleep 2
echo "✅ FastAPI backend: http://0.0.0.0:8100"
echo "📱 Akses dari luar: http://$(curl -s ifconfig.me):8100"
echo "⚠️  Buka port 8100 di modem untuk akses publik"
