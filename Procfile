release: python -c "import backend.main" && echo "release check OK"
web: uvicorn backend.main:app --host 0.0.0.0 --port $PORT
worker: python pipeline_worker.py
EOF_MARKER_UNUSED=1
