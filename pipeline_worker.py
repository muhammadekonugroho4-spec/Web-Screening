"""Pipeline worker mandiri — untuk dijalankan sebagai service kedua di Northflank.
Loop WIB: update data 5-menit saat bursa + sidang AI + TP/SL + buku besar.
Tanpa FastAPI — murni worker. Aktivasi: env PIPELINE_ENABLED=1 (wajib)."""
import os
import sys
import time

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))

if os.environ.get("PIPELINE_ENABLED", "0") != "1":
    print("🚄 worker: PIPELINE_ENABLED != 1 — keluar.")
    sys.exit(0)

# samakan key/token bridging dgn pipeline_runner
from backend.pipeline_runner import siapkan_key_dan_token, siklus_pipeline, _state  # noqa: E402

def main():
    siapkan_key_dan_token()
    print("🚄 worker: mulai loop pipeline (WIB)…")
    while True:
        now = time.time()
        try:
            hasil = siklus_pipeline()
            _state["hasil_terakhir"] = f"[{time.strftime('%H:%M')}] {hasil}"
            _state["terakhir"] = time.strftime("%Y-%m-%d %H:%M:%S")
            print(f"🚄 worker: {_state['hasil_terakhir']}", flush=True)
        except Exception as e:
            print(f"⚠️ worker error: {e}", flush=True)
        # tidur sampai menit genap-5 berikutnya
        time.sleep(60)

if __name__ == "__main__":
    main()
