# PROMPT OPENCODE — LANGKAH 3: KERANGKA FASTAPI MINIMAL

## MISI
Buat struktur FastAPI minimal yang bisa jalan lokal, menggunakan logika murni yang sudah diekstrak di Langkah 2 (`backend/core/`).

## ATURAN KERAS
1. DILARANG mengubah `app.py` sama sekali.
2. Hanya boleh MEMBUAT/MODIFIKASI file di folder `backend/`.
3. FastAPI harus bisa jalan di port berbeda (8100) tanpa mengganggu Streamlit (port 8501).
4. JANGAN menjalankan Streamlit.
5. JANGAN commit apa pun — user yang memutuskan.

## STRUKTUR FILE YANG HARUS DIBUAT/DIMODIFIKASI

### 1. `backend/main.py` (MODIFIKASI — sudah ada tapi kosong/minimal)
Buat FastAPI app dengan:
- CORS middleware (allow all origins untuk development)
- Static files mount di `/static`
- Template engine Jinja2
- Health check endpoint
- Import dan gunakan fungsi dari `backend.core`

```python
from fastapi import FastAPI, Request
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates
from fastapi.middleware.cors import CORSMiddleware
from fastapi.responses import HTMLResponse
import os

app = FastAPI(
    title="WEB-SCREENING API",
    description="Backend FastAPI untuk migrasi dari Streamlit",
    version="0.1.0"
)

# CORS untuk development
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

# Static files
if os.path.exists("backend/static"):
    app.mount("/static", StaticFiles(directory="backend/static"), name="static")

# Templates
templates = Jinja2Templates(directory="backend/templates")

@app.get("/", response_class=HTMLResponse)
async def root(request: Request):
    """Halaman utama — sementara hanya info."""
    return templates.TemplateResponse("index.html", {"request": request})

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
        "next_steps": [
            "Pindahkan halaman Market Overview",
            "Pindahkan Screener",
            "Pindahkan AI features",
            "Pindahkan Portfolio"
        ]
    }
```

### 2. `backend/templates/index.html` (BUAT BARU)
```html
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WEB-SCREENING — FastAPI Backend</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-900 text-white min-h-screen flex items-center justify-center">
    <div class="max-w-2xl mx-auto p-8 text-center">
        <h1 class="text-4xl font-bold mb-4 text-blue-400">⚡ WEB-SCREENING</h1>
        <h2 class="text-2xl mb-6">FastAPI Backend (Development)</h2>
        
        <div class="bg-gray-800 rounded-lg p-6 mb-6">
            <h3 class="text-xl font-semibold mb-4">Status Migrasi</h3>
            <ul class="text-left space-y-2">
                <li>✅ Langkah 1: Inventaris & Backup</li>
                <li>✅ Langkah 2: Isolasi Logika Murni</li>
                <li class="text-green-400">🔄 Langkah 3: Kerangka FastAPI (sedang dikerjakan)</li>
                <li class="text-gray-500">⏳ Langkah 4: Pindahkan Market Overview</li>
                <li class="text-gray-500">⏳ Langkah 5: Pindahkan Screener</li>
                <li class="text-gray-500">⏳ Langkah 6: Pindahkan AI & Portfolio</li>
                <li class="text-gray-500">⏳ Langkah 7: Deploy & Smartlink</li>
            </ul>
        </div>

        <div class="bg-gray-800 rounded-lg p-6">
            <h3 class="text-xl font-semibold mb-4">API Endpoints</h3>
            <ul class="text-left space-y-2 text-sm">
                <li><code class="bg-gray-700 px-2 py-1 rounded">GET /health</code> — Health check</li>
                <li><code class="bg-gray-700 px-2 py-1 rounded">GET /api/info</code> — Info migrasi</li>
            </ul>
        </div>

        <p class="mt-6 text-gray-400 text-sm">
            Streamlit app tetap jalan di port 8501. FastAPI ini di port 8100.
        </p>
    </div>
</body>
</html>
```

### 3. `backend/static/` (BUAT FOLDER)
Buat folder kosong `backend/static/` untuk file CSS/JS/image nanti.

### 4. `run_backend.sh` (BUAT BARU di root project)
Script untuk menjalankan FastAPI:
```bash
#!/bin/bash
# Jalankan FastAPI backend di port 8100

echo "🚀 Memulai FastAPI backend..."
echo "📍 URL: http://localhost:8100"
echo "📚 API Docs: http://localhost:8100/docs"
echo ""

# Gunakan venv yang sama dengan Streamlit
.venv/bin/python -m uvicorn backend.main:app --host 0.0.0.0 --port 8100 --reload
```

### 5. `requirements.txt` (MODIFIKASI — tambahkan FastAPI dependencies)
Tambahkan (jika belum ada):
```
fastapi>=0.104.0
uvicorn[standard]>=0.24.0
jinja2>=3.1.2
python-multipart>=0.0.6
```

### 6. `backend/routes/api.py` (BUAT BARU — untuk nanti)
Buat file kosong dengan struktur dasar:
```python
from fastapi import APIRouter

router = APIRouter(prefix="/api", tags=["api"])

# Nanti akan diisi dengan endpoint-endpoint spesifik
# Contoh:
# @router.get("/market-overview")
# async def market_overview():
#     ...
```

## IMPLEMENTASI

1. **Baca file yang ada** di `backend/` untuk memahami struktur saat ini.
2. **Modifikasi `backend/main.py`** dengan kode di atas.
3. **Buat folder dan file baru**: `backend/templates/`, `backend/static/`, `backend/routes/api.py`.
4. **Buat `run_backend.sh`** di root project dan `chmod +x`.
5. **Modifikasi `requirements.txt`** untuk menambahkan FastAPI dependencies.
6. **Install dependencies baru** dengan pip (jika belum ada).
7. **Verifikasi**:
   - Jalankan `python -m py_compile backend/main.py`
   - Jalankan `python -m py_compile backend/routes/api.py`
   - Jalankan FastAPI: `bash run_backend.sh` (background)
   - Test endpoint: `curl http://localhost:8100/health`
   - Buka browser: `http://localhost:8100` dan `http://localhost:8100/docs`
   - Pastikan Streamlit app masih jalan normal di port 8501

## OUTPUT
1. File yang dibuat/dimodifikasi:
   - `backend/main.py` (modifikasi)
   - `backend/templates/index.html` (baru)
   - `backend/static/` (folder baru)
   - `backend/routes/api.py` (baru)
   - `run_backend.sh` (baru)
   - `requirements.txt` (modifikasi)
2. Tampilkan ringkasan: jumlah file, hasil test endpoint.
3. JANGAN commit apa pun — user yang memutuskan.

## CATATAN PENTING
- FastAPI harus jalan di port **8100** (bukan 8501 yang dipakai Streamlit).
- Jangan install package baru yang konflik dengan Streamlit.
- Jika `uvicorn` belum terinstall, install dengan `.venv/bin/pip install uvicorn[standard]`.
- Test bahwa Streamlit app masih jalan normal setelah FastAPI dijalankan.