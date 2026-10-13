# PROMPT OPENCODE — LANGKAH 1: INVENTARIS PRA-MIGRASI (READ-ONLY)

## MISI
Buat file `INVENTARIS_MIGRASI.md` di `/home/kaltaraid/Documents/WEB-SCREENING/`
berisi audit lengkap proyek sebagai fondasi migrasi Streamlit → FastAPI.

## ATURAN KERAS
1. READ-ONLY: DILARANG mengubah/menambah/menghapus file apa pun, KECUALI membuat `INVENTARIS_MIGRASI.md`.
2. DILARANG menjalankan streamlit, bot, cron, atau script apa pun yang menulis data.
   Hanya perintah baca: ls, cat, head, grep, wc, git log, crontab -l, .venv/bin/python --version, .venv/bin/pip freeze.
3. JANGAN menampilkan isi API key/PIN di inventaris; catat NAMANYA saja.

## ISI INVENTARIS (SEKSI WAJIB)

### A. Identitas & Deploy
- URL Streamlit Cloud, remote git, branch aktif, 5 commit terakhir.
- Versi Python venv + daftar paket utama (streamlit, pandas, numpy, openai, google-generativeai, streamlit-autorefresh, dll).

### B. Peta File Kode
Tabel: nama file | peran | jumlah baris.
Minimal: app.py, bot_simulator.py, reset_porto.py, update_data.py, fetcher_exodus.py,
bangun_buku_besar.py, services/alpha_features.py, dan file .py lain yang ada.

### C. Peta Fitur app.py per PART (01–14)
Tabel: PART | isi singkat | apakah memanggil st.* | kategori migrasi.
Tandai fungsi di PART 02, 03, 04, dan 09 yang TIDAK memanggil `st.` sama sekali
sebagai "LOGIKA MURNI — mudah dipindah" (contoh: ai_hakim_klasemen, get_historical_summary, format_angka).

### D. Data & Konfigurasi
Tabel: file | lokasi | ukuran | dibaca/ditulis oleh PART mana.
Wajib tercakup: Database/hasil_screener.csv, data_akuisisi.csv, fundamental_exodus.csv,
users.json, sinyal_ai_rumus_*.csv, portofolio_aktif_rumus_*.csv, histori_transaksi_rumus_*.csv,
cache_autopilot.json, radar_snapshot.json, kasus_ledakan.json, ringkasan_harian.csv.gz,
config_web.json, preset_kustom.json, Arsip_Data_Harian/screener_*.csv.

### E. Cron & Proses Luar
- Ringkasan `crontab -l`: jadwal + script yang dijalankan.
- Daftar pemanggilan subprocess dari app.py (bot_simulator.py --beli-only/--jual-only, reset_porto.py --yes).

### F. Secrets & Layanan Eksternal
- Nama saja: GEMINI_API_KEY, OPENROUTER_API_KEY (sebutkan dipakai di PART mana).
- Layanan: Google Gemini, OpenRouter, sumber data saham, smartlink asiafilm.org (PART 05B).

### G. Catatan Risiko
- File berisi data pribadi (users.json = PIN plaintext) → tandai "JANGAN push ke repo publik".
- File besar yang tidak boleh masuk git.
- Temuan lain: kode mati, duplikasi, impor yang tidak terpakai.

## OUTPUT
1. Tulis semua temuan ke `INVENTARIS_MIGRASI.md` (markdown dengan tabel rapi).
2. Tampilkan ringkasan maksimal 15 baris di chat.
3. JANGAN commit apa pun — user yang memutuskan.