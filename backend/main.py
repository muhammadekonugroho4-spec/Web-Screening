import os, json, sqlite3
from datetime import datetime
from fastapi import FastAPI, Request, HTTPException
from fastapi.responses import FileResponse, HTMLResponse
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates
from fastapi.middleware.cors import CORSMiddleware
from pydantic import BaseModel

from backend.auth import pwd_ctx, create_access_token, DB_DIR, USERS_DB, get_current_user

BASE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(BASE)

# Logika murni hasil Langkah 2 (tanpa Streamlit) — siap dipakai endpoint nanti
from backend.core import (
    load_data_saham_raw, _muat_fundamental_exodus_raw, muat_sinyal_arena_raw,
    muat_keranjang_radar_raw, format_skor, format_pct, format_angka,
    muat_arsip, muat_buku_besar_raw,
)

app = FastAPI(
    title="WEB-SCREENING API",
    description="Backend FastAPI untuk migrasi dari Streamlit",
    version="0.1.0",
)
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

# Static files
app.mount("/static", StaticFiles(directory=os.path.join(BASE, "static")), name="static")

# Templates (Jinja2) — cache template dimatikan
# (cache Jinja2 bermasalah di Python 3.14: TypeError tuple-as-dict-key)
import jinja2
_env = jinja2.Environment(
    loader=jinja2.FileSystemLoader(os.path.join(BASE, "templates")),
    autoescape=True,
    cache_size=0,
)
templates = Jinja2Templates(env=_env)

def init_db():
    os.makedirs(DB_DIR, exist_ok=True)
    conn = sqlite3.connect(USERS_DB)
    conn.execute("""CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        username TEXT UNIQUE NOT NULL,
        pin_hash TEXT NOT NULL,
        created_at TEXT NOT NULL)""")
    conn.commit(); conn.close()
init_db()

def _get_user_dir(username):
    d = os.path.join(DB_DIR, "users", username)
    os.makedirs(d, exist_ok=True)
    return d

def _init_user_portfolio(username):
    udir = _get_user_dir(username)
    for i in range(1, 10):
        files = {
            f"portofolio_aktif_rumus_{i}.csv": "Tanggal_Beli,Ticker,Harga_Beli,Lot,Total_Modal,Target_TP,Target_CL",
            f"histori_transaksi_rumus_{i}.csv": "Tanggal_Beli,Tanggal_Jual,Ticker,Harga_Beli,Harga_Jual,Status,Total_Return_Rp,Return_%",
            f"sinyal_ai_rumus_{i}.csv": "Ticker,Target_TP,Target_CL,Stempel",
        }
        for fname, header in files.items():
            path = os.path.join(udir, fname)
            if not os.path.exists(path):
                with open(path, "w") as fp:
                    fp.write(header + "\n")

class UserCreate(BaseModel):
    username: str
    pin: str

class UserLogin(BaseModel):
    username: str
    pin: str

class TokenResponse(BaseModel):
    access_token: str
    token_type: str = "bearer"
    username: str

@app.post("/api/auth/register", response_model=TokenResponse)
def register(user: UserCreate):
    if len(user.username) < 3:
        raise HTTPException(400, "Username minimal 3 karakter")
    if len(user.pin) != 6 or not user.pin.isdigit():
        raise HTTPException(400, "PIN harus 6 digit angka")
    conn = sqlite3.connect(USERS_DB)
    try:
        conn.execute("INSERT INTO users (username, pin_hash, created_at) VALUES (?, ?, ?)",
                     (user.username, pwd_ctx.hash(user.pin), datetime.now().isoformat()))
        conn.commit()
    except sqlite3.IntegrityError:
        conn.close(); raise HTTPException(409, "Username sudah ada")
    conn.close()
    _init_user_portfolio(user.username)
    return TokenResponse(access_token=create_access_token({"sub": user.username}), username=user.username)

@app.post("/api/auth/login", response_model=TokenResponse)
def login(user: UserLogin):
    conn = sqlite3.connect(USERS_DB)
    row = conn.execute("SELECT pin_hash FROM users WHERE username = ?", (user.username,)).fetchone()
    conn.close()
    if not row or not pwd_ctx.verify(user.pin, row[0]):
        raise HTTPException(401, "Username/PIN salah")
    _init_user_portfolio(user.username)
    return TokenResponse(access_token=create_access_token({"sub": user.username}), username=user.username)

@app.get("/api/auth/me")
def me(username: str = __import__("fastapi").Depends(get_current_user)):
    return {"username": username}

from backend.routes.api import router as api_router
app.include_router(api_router)

# Grafik teknik & health (Fase E-final) — aman: jika import gagal, app tetap hidup
try:
    from backend.routes.health_ext import router as health_ext_router
    app.include_router(health_ext_router)
    from backend.routes.chart_data import router as chart_router
    app.include_router(chart_router)
    print("✅ chart/health router loaded")
except Exception as _router_err:
    print(f"⚠️ chart/health router GAGAL dimuat: {_router_err}")

# Seed data ke Volume (Fase C3) — proteksi ADMIN_TOKEN
from backend.routes.admin_seed import router as seed_router
app.include_router(seed_router)

# Seed otomatis saat startup bila Database kosong (volume baru) — sekali jalan
from backend.routes.admin_seed import seed_jika_perlu
import threading
threading.Thread(target=seed_jika_perlu, daemon=True).start()

# Pipeline data di Railway (Fase E): update 5-menit bursa + sidang AI di server
from backend import pipeline_runner
pipeline_runner.mulai_pipeline()


@app.get("/health")
async def health():
    """Health check endpoint."""
    return {"status": "ok", "version": "0.1.0"}

@app.get("/api/info")
async def info():
    """Info tentang migrasi."""
    return {
        "message": "FastAPI backend untuk WEB-SCREENING",
        "status": "development",
        "streamlit_port": 8501,
        "fastapi_port": 8100,
        "core_modules": ["ai_service", "data_loader", "formatter", "archive"],
        "next_steps": [
            "Pindahkan halaman Market Overview",
            "Pindahkan Screener",
            "Pindahkan AI features",
            "Pindahkan Portfolio"
        ]
    }

@app.get("/status", response_class=HTMLResponse)
async def status_page(request: Request):
    """Halaman status migrasi (Langkah 3) — Jinja2 + Tailwind."""
    df = load_data_saham_raw()
    return templates.TemplateResponse(request, "status.html", {
        "jumlah_saham": len(df),
        "jumlah_arsip": len(muat_arsip()),
        "waktu": datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
    })

@app.get("/market", response_class=HTMLResponse)
async def market_page(request: Request):
    """Halaman Market Overview (Langkah 4)."""
    return templates.TemplateResponse(request, "market.html", {})

@app.get("/screener", response_class=HTMLResponse)
async def screener_page(request: Request):
    """Halaman Screener Utama (Langkah 5)."""
    return templates.TemplateResponse(request, "screener.html", {})

@app.get("/ai", response_class=HTMLResponse)
async def ai_page(request: Request):
    """Halaman Asisten AI Spesial (Langkah 6) — wajib login via frontend guard."""
    return templates.TemplateResponse(request, "ai.html", {})

@app.get("/portfolio", response_class=HTMLResponse)
async def portfolio_page(request: Request):
    """Halaman Portofolio Bot (Langkah 6) — wajib login via frontend guard."""
    return templates.TemplateResponse(request, "portfolio.html", {})

@app.get("/detective", response_class=HTMLResponse)
async def detective_page(request: Request):
    """Halaman Detektif Ledakan (Langkah 7) — wajib login via frontend guard."""
    return templates.TemplateResponse(request, "detective.html", {})

@app.get("/chart", response_class=HTMLResponse)
async def chart_page(request: Request):
    """Halaman Grafik Teknikal candlestick (Fase E-final)."""
    return templates.TemplateResponse(request, "chart.html", {})

@app.get("/login", response_class=HTMLResponse)
async def login_page(request: Request):
    """Halaman Masuk / Daftar akun (Fase desain v2)."""
    return templates.TemplateResponse(request, "login.html", {})

@app.get("/")
def root():
    return FileResponse(os.path.join(BASE, "templates", "index.html"))
