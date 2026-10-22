FROM python:3.12-slim

WORKDIR /app

# System deps minimal (yfinance perlu gcc utk beberapa wheel lama; slim cukup + curl utk healthcheck opsional)
RUN apt-get update && apt-get install -y --no-install-recommends \
    gcc curl && rm -rf /var/lib/apt/lists/*

COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy seluruh kode
COPY . .

# Default: web app. Worker service override command: python pipeline_worker.py
ENV PORT=8080
EXPOSE 8080

CMD ["sh", "-c", "uvicorn backend.main:app --host 0.0.0.0 --port ${PORT}"]
