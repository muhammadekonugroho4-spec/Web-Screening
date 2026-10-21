# ==========================================
# 🚄 PIPELINE RUNNER — Fase E (pipeline jalan di Railway)
# Scheduler WIB sebagai background thread di dalam FastAPI.
# Meniru jalankan_bot.sh: update data 5-menit bursa + sidang AI + TP/SL
# + fundamental + buku besar — semua output ke /app/Database (Volume).
# Aktif bila env PIPELINE_ENABLED=1 (default: aktif di produksi).
# ==========================================
import os
import sys
import threading
import subprocess
import time
from datetime import datetime, timedelta, timezone

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
PY = sys.executable

# Gemini key: sidang_jadwal membaca file ~/.config/bsjp/gemini.key →
# di Railway kita tulis file itu dari env GEMINI_API_KEY saat inisialisasi.
GEMINI_KEY_PATH = os.path.expanduser("~/.config/bsjp/gemini.key")

_lock = threading.Lock()
_state = {"sedang_jalan": False, "terakhir": None, "hasil_terakhir": "", "log_detail": ""}


def _wib_now():
    return datetime.now(timezone.utc).replace(tzinfo=None) + timedelta(hours=7)


def siapkan_key_dan_token():
    """Tulis key/token dari env ke file yang dibaca script lama (sekali saat startup)."""
    try:
        gk = os.environ.get("GEMINI_API_KEY", "")
        if gk and not os.path.exists(GEMINI_KEY_PATH):
            os.makedirs(os.path.dirname(GEMINI_KEY_PATH), exist_ok=True)
            with open(GEMINI_KEY_PATH, "w") as f:
                f.write(gk.strip())
    except Exception as e:
        print(f"⚠️ pipeline: gagal tulis gemini key file: {e}")

    try:
        tok = os.environ.get("TOKEN_STOCKBIT", "")
        tok_file = os.path.join(ROOT, "token_stockbit.txt")
        if tok and not os.path.exists(tok_file):
            with open(tok_file, "w") as f:
                f.write(tok.strip())
    except Exception as e:
        print(f"⚠️ pipeline: gagal tulis token stockbit: {e}")


def _jalankan(args, timeout):
    """Jalankan subproses python di ROOT; return (ok, output)."""
    try:
        p = subprocess.run([PY] + args, capture_output=True, text=True,
                           timeout=timeout, cwd=ROOT)
        out = (p.stdout or "") + (("\nSTDERR: " + p.stderr[-800:]) if p.returncode != 0 else "")
        return p.returncode == 0, out[-2500:]
    except subprocess.TimeoutExpired:
        return False, f"timeout {args[0]}"
    except Exception as e:
        return False, str(e)[:200]


def siklus_pipeline(kali_per_hari=True):
    """Satu siklus lengkap — mirror jalankan_bot.sh tanpa git-push."""
    now = _wib_now()
    jam = now.strftime("%H%M")
    hari = now.weekday()  # 0=Senin .. 6=Minggu
    tanggal = now.strftime("%Y-%m-%d")

    if hari >= 5:
        return "🏖️ Akhir pekan — pipeline libur."

    langkah = []

    # 1) Update data (selalu, tiap siklus)
    ok, out = _jalankan(["update_data.py"], 900)
    langkah.append(f"update_data: {'OK' if ok else 'GAGAL'}")
    _state["log_detail"] = f"[update_data]\n{out[-2000:]}"

    # 2) Sidang jadwal 15:20-15:35 (sekali/hari) — butuh GEMINI key
    flag_pagi = f"/tmp/bsjp_pagi_{tanggal}"
    if "1520" <= jam <= "1535" and not os.path.exists(flag_pagi):
        if os.path.exists(GEMINI_KEY_PATH):
            ok, out = _jalankan(["sidang_jadwal.py"], 1200)
            langkah.append(f"sidang_jadwal: {'OK' if ok else 'GAGAL'}")
            if ok:
                open(flag_pagi, "w").write("1")
        else:
            langkah.append("sidang_jadwal: dilewati (GEMINI_API_KEY kosong)")

    # 3) Sidang sore 16:00-16:10
    flag_sore = f"/tmp/bsjp_sore_{tanggal}"
    if "1600" <= jam <= "1610" and not os.path.exists(flag_sore):
        if os.path.exists(GEMINI_KEY_PATH):
            ok, out = _jalankan(["sidang_sore.py"], 900)
            langkah.append(f"sidang_sore: {'OK' if ok else 'GAGAL'}")
            if ok:
                open(flag_sore, "w").write("1")

    # 4) Fundamental exodus 16:15-16:45 (sekali/hari, butuh TOKEN_STOCKBIT)
    flag_fund = f"/tmp/exodus_fund_{tanggal}"
    if "1615" <= jam <= "1645" and not os.path.exists(flag_fund):
        if os.path.exists(os.path.join(ROOT, "token_stockbit.txt")):
            ok, out = _jalankan(["fetcher_exodus.py", "fundamental"], 900)
            langkah.append(f"fetcher_exodus: {'OK' if ok else 'GAGAL'}")
            if ok:
                open(flag_fund, "w").write("1")
        else:
            langkah.append("fetcher_exodus: dilewati (TOKEN_STOCKBIT kosong)")

    # 5) Auto TP/SL (di luar jendela sidang)
    if not ("1520" <= jam <= "1535"):
        ok, out = _jalankan(["bot_simulator.py", "--tp-sl-only"], 600)
        langkah.append(f"tp_sl: {'OK' if ok else 'GAGAL'}")

    # 6) Buku besar
    ok, out = _jalankan(["bangun_buku_besar.py"], 300)
    langkah.append(f"buku_besar: {'OK' if ok else 'GAGAL'}")

    return " | ".join(langkah)


def _loop():
    while True:
        now = _wib_now()
        hari = now.weekday()
        jam = now.strftime("%H%M")
        # Bursa: Sen-Jum 08:55-16:45, tiap 5 menit
        if hari < 5 and "0855" <= jam <= "1645" and (int(now.minute) % 5 == 0):
            if not _state["sedang_jalan"]:
                _state["sedang_jalan"] = True
                try:
                    hasil = siklus_pipeline()
                    _state["hasil_terakhir"] = f"[{now.strftime('%H:%M')}] {hasil}"
                    _state["terakhir"] = now.strftime("%Y-%m-%d %H:%M:%S")
                    print(f"🚄 pipeline: {_state['hasil_terakhir']}")
                finally:
                    _state["sedang_jalan"] = False
        time.sleep(20)


def mulai_pipeline():
    """Panggil sekali dari main.py saat startup (thread daemon)."""
    if os.environ.get("PIPELINE_ENABLED", "0") != "1":
        print("🚄 pipeline: NONAKTIF (PIPELINE_ENABLED != 1)")
        return
    if not os.path.ismount(os.path.join(os.getcwd(), "Database")) and \
       not os.environ.get("PIPELINE_FORCE", "") == "1":
        print("🚄 pipeline: Database bukan mount point — pipeline OFF (aman)")
        return
    siapkan_key_dan_token()
    t = threading.Thread(target=_loop, daemon=True, name="pipeline-runner")
    t.start()
    print("🚄 pipeline: AKTIF — update 5-menit bursa + sidang AI jalan di server ini")


def status():
    """Untuk endpoint /api/pipeline/status."""
    return {
        "aktif": os.environ.get("PIPELINE_ENABLED", "0") == "1",
        "sedang_jalan": _state["sedang_jalan"],
        "update_terakhir": _state["terakhir"],
        "hasil_terakhir": _state["hasil_terakhir"],
        "wib_sekarang": _wib_now().strftime("%Y-%m-%d %H:%M:%S"),
    }
