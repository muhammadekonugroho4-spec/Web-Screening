#!/bin/bash
# Jalankan FastAPI backend di port 8100 (Streamlit tetap di 8501)

echo "🚀 Memulai FastAPI backend..."
echo "📍 URL: http://localhost:8100"
echo "📚 API Docs: http://localhost:8100/docs"
echo ""

# Gunakan venv yang sama dengan Streamlit
.venv/bin/python -m uvicorn backend.main:app --host 0.0.0.0 --port 8100 --reload
