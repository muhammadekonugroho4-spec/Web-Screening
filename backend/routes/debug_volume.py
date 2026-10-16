from fastapi import APIRouter, Depends
import os
from backend.auth import get_current_user

router = APIRouter(prefix="/debug", tags=["debug"])

@router.get("/volume")
async def debug_volume(user: str = Depends(get_current_user)):
    """Fase C3 verifikasi: apakah /app/Database adalah volume mount?
    Sementara dipakai untuk memastikan persistensi users.db. Hapus setelah mantap."""
    path = os.path.join(os.getcwd(), "Database")
    info = {
        "cwd": os.getcwd(),
        "database_path": path,
        "ada": os.path.isdir(path),
        "mountpoint": os.path.ismount(path),
        "users_db_ada": os.path.exists(os.path.join(path, "users.db")),
        "jumlah_file": len(os.listdir(path)) if os.path.isdir(path) else 0,
        "users_daftar": [],
    }
    if os.path.exists(os.path.join(path, "users.db")):
        import sqlite3
        try:
            conn = sqlite3.connect(os.path.join(path, "users.db"))
            info["users_daftar"] = [r[0] for r in conn.execute("SELECT username FROM users").fetchall()]
            conn.close()
        except Exception as e:
            info["users_daftar"] = f"error: {e}"
    # cek semua mount point yang mengandung 'Database'
    mounts = []
    try:
        with open("/proc/mounts") as f:
            for line in f:
                if "Database" in line or "railway" in line.lower():
                    mounts.append(line.split()[1])
    except Exception:
        pass
    info["mounts_terkait"] = mounts
    return info
