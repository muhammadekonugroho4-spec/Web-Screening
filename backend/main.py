import os, json, sqlite3
from datetime import datetime
from fastapi import FastAPI, HTTPException
from fastapi.responses import FileResponse
from fastapi.staticfiles import StaticFiles
from fastapi.middleware.cors import CORSMiddleware
from pydantic import BaseModel

from backend.auth import pwd_ctx, create_access_token, DB_DIR, USERS_DB, get_current_user

BASE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(BASE)

app = FastAPI(title="WEB-SCREENING API (Opsi A)", version="1.0.0")
app.add_middleware(CORSMiddleware, allow_origins=["*"], allow_methods=["*"], allow_headers=["*"])

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

app.mount("/static", StaticFiles(directory=os.path.join(BASE, "static")), name="static")

@app.get("/")
def root():
    return FileResponse(os.path.join(BASE, "templates", "index.html"))
