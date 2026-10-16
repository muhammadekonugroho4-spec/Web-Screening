from fastapi import APIRouter, Depends, Header
import os
import urllib.request

from backend.auth import get_current_user

router = APIRouter(prefix="/admin", tags=["admin"])

REPO_RAW = "https://raw.githubusercontent.com/muhammadekonugroho4-spec/Web-Screening/main/Database"
SEED_FLAG = os.path.join(os.getcwd(), "Database", ".seeded")


SEED_FILES = [
    "hasil_screener.csv",
    "data_akuisisi.csv",
    "fundamental_exodus.csv",
    "cache_autopilot.json",
    "radar_snapshot.json",
    "radar_snapshot_sore.json",
]


def seed_jika_perlu():
    """Seed otomatis sekali: jalankan saat startup bila Database kosong total
    (volume baru dipasang). File .seeded menandai sudah pernah seed."""
    db = os.path.join(os.getcwd(), "Database")
    os.makedirs(db, exist_ok=True)
    marker = os.path.join(db, "hasil_screener.csv")
    if os.path.exists(marker) and os.path.getsize(marker) > 100:
        return {"status": "data sudah ada — skip"}
    if os.path.exists(os.path.join(db, ".seeded")):
        return {"status": "seed pernah dijalankan — skip"}
    hasil = {}
    for nama in SEED_FILES:
        dst = os.path.join(db, nama)
        try:
            urllib.request.urlretrieve(f"{REPO_RAW}/{nama}", dst)
            hasil[nama] = f"OK ({os.path.getsize(dst):,} bytes)"
        except Exception as e:
            hasil[nama] = f"GAGAL: {str(e)[:60]}"
    open(os.path.join(db, ".seeded"), "w").write("seeded")
    return {"status": "seed selesai", "hasil": hasil}

# Daftar file data yang di-seed dari GitHub repo (raw) ke /app/Database
@router.post("/seed-data")
async def seed_data(user: str = Depends(get_current_user), x_admin_token: str = Header(default="")):
    """Fase C3-seed: tarik file data dari GitHub repo ke Database/ (volume).
    Dipakai SEKALI setelah Volume pertama dipasang (volume mulai kosong).
    Proteksi: butuh login + header X-Admin-Token = ADMIN_TOKEN (env)."""
    admin = os.environ.get("ADMIN_TOKEN", "")
    if not admin or x_admin_token != admin:
        return {"error": "X-Admin-Token salah/kosong"}

    db = os.path.join(os.getcwd(), "Database")
    os.makedirs(db, exist_ok=True)
    hasil = {}
    for nama in SEED_FILES:
        dst = os.path.join(db, nama)
        if os.path.exists(dst) and os.path.getsize(dst) > 0:
            hasil[nama] = "sudah ada (dilewati)"
            continue
        try:
            urllib.request.urlretrieve(f"{REPO_RAW}/{nama}", dst)
            ukuran = os.path.getsize(dst)
            hasil[nama] = f"OK ({ukuran:,} bytes)"
        except Exception as e:
            hasil[nama] = f"GAGAL: {str(e)[:80]}"
    return {"hasil": hasil}


@router.post("/seed-manual")
async def seed_manual(user: str = Depends(get_current_user), x_admin_token: str = Header(default="")):
    admin = os.environ.get("ADMIN_TOKEN", "")
    if not admin or x_admin_token != admin:
        return {"error": "X-Admin-Token salah/kosong"}
    return seed_jika_perlu()
