# PROMPT OPENCODE — LANGKAH 2: ISOLASI LOGIKA MURNI (READ-SAFE)

## MISI
Ekstrak fungsi Python murni (tidak memanggil `st.*`) dari `app.py` ke file terpisah di `backend/core/`, supaya siap dipindah ke FastAPI nanti.

## ATURAN KERAS
1. READ-SAFE: DILARANG mengubah `app.py` sama sekali (jangan cut/paste, jangan edit, jangan hapus).
2. Hanya boleh MEMBUAT file baru di `backend/core/`.
3. File yang dibuat harus bisa di-impor dari Python biasa (bukan Streamlit).
4. JANGAN menjalankan streamlit atau script apa pun.
5. JANGAN commit apa pun — user yang memutuskan.

## DAFTAR FUNGSI YANG HARUS DIEKSTRAK

Dari INVENTARIS_MIGRASI.md seksi C, berikut fungsi LOGIKA MURNI (0× `st.`):

### File: `backend/core/ai_service.py`
Semua fungsi AI klasik dari PART 02-03:
- `ai_hakim_klasemen(data_top15, api_key)` → return JSON string
- `analisa_bandar_ai_multisaham(data_saham_dict, pilihan_ai)` → return string (perlu adaptasi: ganti `st.secrets.get` dengan `os.environ.get`)
- `analisa_forensik_ai(data_saham_dict, master_filters_keys)` → return string (sama, adaptasi secrets)
- `ai_penyisihan_turnamen(data_grup_dict, api_key)` → return string
- `ai_grand_final_top5(data_saham_dict, api_key)` → return tuple (json_string, model_name)
- `radar_model_gemini_cepat(api_key)` → return list
- `panggil_ai_teks(prompt)` → return tuple (text, model_name) (adaptasi secrets)
- `ai_hakim_klasemen_cepat(data_top15, api_key, daftar_model)` → return string
- `ai_top5_dari_daftar(data_dict, api_key, daftar_model, suhu=0.4)` → return string
- `_parse_ticker_top5(mentah, valid_set)` → return list
- `jalankan_9_ronde_acak(df_data, daftar_ticker, api_key, progress_bar=None, status_teks=None)` → return tuple (dict, error)
  - **CATATAN:** `progress_bar` dan `status_teks` adalah Streamlit objects. Untuk backend, buat versi overload yang menerima callback function atau biarkan None.
- `jalankan_sidang_autopilot(daftar_rumus, df_data, api_key, progress_bar=None, status_teks=None, tulis_sinyal=True)` → return tuple (dict, error, laporan)

### File: `backend/core/data_loader.py`
Fungsi load data dari PART 07 (tanpa cache Streamlit):
- `load_data_saham_raw()` → return pd.DataFrame (baca CSV langsung, tanpa `@st.cache_data`)
- `_muat_fundamental_exodus_raw()` → return pd.DataFrame
- `muat_sinyal_arena_raw(rumus_id)` → return pd.DataFrame
- `muat_keranjang_radar_raw(stempel_now, versi_sidang)` → return tuple (dict, status)

### File: `backend/core/formatter.py`
Fungsi format dari PART 09 (logika murni):
- `format_skor(s)` → return string
- `format_pct(v)` → return string
- `format_mom(v)` → return string
- `format_desimal(v)` → return string
- `format_angka(v)` → return string
- `format_singkat_vol(v)` → return string
- `format_singkat_rp(v)` → return string
- `warna_tabel(val)` → return string (CSS)

### File: `backend/core/archive.py`
Fungsi arsip dari PART 04 (tanpa cache):
- `_muat_arsip_lokal()` → return list of (date_str, df)
- `muat_arsip()` → return list of (date_str, df)
- `get_historical_summary_raw(ticker)` → return string (versi tanpa `st.`)
- `get_forensic_data_raw(ticker)` → return string (versi tanpa `st.`)
- `muat_buku_besar_raw()` → return pd.DataFrame
- `muat_arsip_harian_raw(tanggal)` → return pd.DataFrame

## IMPLEMENTASI

### 1. Baca `app.py` dan ekstrak fungsi yang diminta
- Gunakan regex atau parser AST Python untuk menemukan definisi fungsi
- Copy body fungsi persis seperti di `app.py`
- Tambahkan docstring di awal setiap fungsi yang menjelaskan:
  - Asal dari `app.py` PART berapa
  - Adaptasi yang dilakukan (misalnya ganti `st.secrets.get` dengan `os.environ.get`)

### 2. Adaptasi untuk Backend
- Ganti semua `st.secrets.get("KEY", os.environ.get("KEY"))` menjadi `os.environ.get("KEY")`
- Ganti semua `@st.cache_data(ttl=300)` menjadi tidak ada (backend pakai cache sendiri nanti)
- Untuk `jalankan_9_ronde_acak` dan `jalankan_sidang_autopilot`:
  - Biarkan parameter `progress_bar` dan `status_teks` sebagai opsional (default None)
  - Di body fungsi, cek `if progress_bar:` dan `if status_teks:` sebelum panggil
  - Ini membuat fungsi bisa dipakai di Streamlit (dengan progress bar) atau di backend (tanpa progress bar)

### 3. Tambahkan `__init__.py` yang meng-export fungsi
Buat `backend/core/__init__.py` berisi:
```python
from .ai_service import *
from .data_loader import *
from .formatter import *
from .archive import *
```

### 4. Verifikasi
- Jalankan `python -m py_compile backend/core/ai_service.py` (dan file lain)
- Pastikan tidak ada SyntaxError
- Pastikan semua import di file tersebut tersedia (pandas, numpy, json, os, dll)

## OUTPUT
1. File yang dibuat:
   - `backend/core/ai_service.py` (±300-400 baris)
   - `backend/core/data_loader.py` (±100-150 baris)
   - `backend/core/formatter.py` (±50-80 baris)
   - `backend/core/archive.py` (±100-150 baris)
   - `backend/core/__init__.py` (export)
   - `backend/__init__.py` (kosong)
2. Tampilkan ringkasan: jumlah fungsi yang diekstrak per file, jumlah baris total.
3. JANGAN commit apa pun — user yang memutuskan.

## CATATAN PENTING
- File `app.py` TIDAK BOLEH DIUBAH sama sekali.
- Jika ada fungsi yang ternyata memanggil `st.*` (meskipun inventaris bilang tidak), skip fungsi itu dan catat di output.
- Fokus pada fungsi yang 100% murni Python (pandas, json, os, re, random, datetime, openai, genai).