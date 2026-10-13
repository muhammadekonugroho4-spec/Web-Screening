#!/bin/bash
# Cek uptime produksi — bisa di-cron (mis. */15) atau dijalankan manual
BASE="https://web-screening-production.up.railway.app"
R=$(curl -s -m 15 "$BASE/health" 2>/dev/null)
TS=$(date "+%Y-%m-%d %H:%M:%S")
if echo "$R" | grep -q '"ok"'; then
    echo "[$TS] ✓ UP — $R"
else
    echo "[$TS] ✗ DOWN — respon: ${R:-kosong}"
    exit 1
fi
