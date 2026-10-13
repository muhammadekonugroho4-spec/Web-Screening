# 📋 INVENTARIS PRA-MIGRASI — Streamlit → FastAPI

> Dibuat: 2026-10-13 · READ-ONLY audit · Fondasi migrasi Opsi A (FastAPI + HTML/JS)
> Sumber: `app.py` (3.034 baris), `Database/`, crontab, venv

---

## A. Identitas & Deploy

| Item | Nilai |
|---|---|
| URL Streamlit Cloud | `https://web-screening-algo-trade.streamlit.app/` (status: **private**, perlu login) |
| Repo GitHub | `muhammadekonugroho4-spec/Web-Screening` (remote: `codespace`, HTTPS+PAT) |
| Branch aktif | `main` |
| 5 commit terakhir | lihat `git log` — terakhir: auto-update data cron + AD GATE v4 + e2e test |
| Python venv | **3.14.7** (`.venv/`) |
| Paket utama | streamlit 1.62.0, pandas 3.0.5, numpy 2.5.2, openai 3.3.1, google-generativeai 0.8.6, streamlit-autorefresh, fastapi 0.142.2, uvicorn 0.52.4, yfinance 1.6.0, plotly, matplotlib, boto3, groq |

## B. Peta File Kode

| File | Peran | Baris |
|---|---|---|
| `app.py` | Aplikasi Streamlit utama (14 PART, gate + login + 6 tab) | 3.034 |
| `bot_simulator.py` | Portfolio simulator 9 arena (beli/jual/TP-SL) | 446 |
| `update_data.py` | Pipeline data harian (962 ticker → hasil_screener.csv) | 650 |
| `fetcher_exodus.py` | Fundamental Stockbit (token Bearer, 24 jam) | 324 |
| `buat_artikel.py` | Generator artikel harian → docs/ | 267 |
| `buat_halaman_publik.py` | Generator halaman statis (market/screener/radar/detektif) | 161 |
| `sidang_lib.py` | Lib sidang AI headless (9 rumus + snapshot) | 188 |
| `services/alpha_features.py` | AlphaScan Pro (8 fitur analisis) | 186 |
| `jembatan_opencode.py` | (kosong/legacy) | — |
| `bangun_buku_besar.py` | Buku besar harian → gzip lokal | 66 |
| `reset_porto.py` | Reset 9 arena ke Rp 100 jt | 37 |
| `konfig_situs.py` | Konfig situs publik (URL, AdSense, SEO) | 31 |
| `sidang_sore.py` | Sidang sore (referensi) | 29 |
| `sidang_jadwal.py` | Sidang headless cron 15:20 | 30 |
| `generate_keywords.py` | (kosong/legacy) | — |
| `beli_jadwal.py` | (kosong/legacy) | — |
| `backend/` (Opsi A) | FastAPI multi-user + SPA | ~550 |

## C. Peta Fitur app.py per PART

| PART | Isi | Panggil st.* | Kategori migrasi |
|---|---|---|---|
| 01 | Impor modul + autorefresh flag | ❌ | langsung |
| 02 | Fungsi AI klasik (10 fungsi) | sebagian | **logika murni mudah dipindah**: ai_hakim_klasemen, ai_penyisihan_turnamen, ai_grand_final_top5, radar_model_gemini_cepat, ai_hakim_klasemen_cepat, ai_top5_dari_daftar, _parse_ticker_top5, jalankan_9_ronde_acak, jalankan_sidang_autopilot (semua 0× `st.`) |
| 03 | (gabung ke 02 di file ini) | — | — |
| 04 | Arsip cerdas: _muat_arsip_lokal, muat_arsip, get_historical_summary (1× st), get_forensic_data (2× st), muat_buku_besar (1× st), muat_arsip_harian (10× st) | sebagian | get_historical_summary & muat_arsip: pisahkan st dari logika |
| 05 | st.set_page_config + PWA meta + CSS dark theme | ✅ | Frontend — ganti dengan CSS file |
| **05B** | AD GATE v4 smartlink (3 tier) | ✅ | Frontend + backend logika gate |
| 06 | Load config_web.json (MASTER_FILTERS) | ❌ | langsung |
| 07 | load_data_saham + _muat_fundamental_exodus + muat_sinyal_arena + muat_keranjang_radar | cache saja | langsung (jadi API loader) |
| 08 | Header & sidebar (login/register user) | ✅ | Backend auth (JWT) + frontend form |
| 09 | Formatter + pewarnaan tabel + render_strategy_table | ✅ | Frontend JS (format & warna) — **format_angka, format_pct, dll = LOGIKA MURNI** |
| 10 | Tab 2 Market Overview | ✅ | Frontend (API sudah ada di Opsi A: /api/market) |
| 11 | Tab 3 Screener Utama (38 filter + Rule Screener + Rumus Manual) | ✅ | Frontend + API /api/screener + POST rule |
| 12 | Tab 4 Asisten AI (9 rumus v5.2 + Radar) | ✅ | API /api/radar + jalankan sidang via subprocess |
| 13 | (Tab 5 Portofolio — sudah dihapus, kembali via 05B-era) | — | API /api/portofolio (sudah ada di Opsi A) |
| 14 | Tab 6 Detektif Ledakan + AlphaScan Pro | ✅ | Frontend + API /api/detektif |

## D. Data & Konfigurasi

| File | Ukuran | Dibaca/ditulis oleh |
|---|---|---|
| `Database/hasil_screener.csv` | 584 KB | update_data (W), app PART 07/10/11/12/14 (R), backend loader (R) |
| `Database/data_akuisisi.csv` | 15 KB | update_data (W), app PART 07 merge (R) |
| `Database/fundamental_exodus.csv` | 89 KB | fetcher_exodus (W), app PART 07 join (R) |
| `Database/users.json` | **13 B** ⚠️ | app PART 08 (R/W) — **PIN plaintext, JANGAN push publik** |
| `Database/users/{username}/` | per-user dir | login/register buat dir (portfolio per-user, belum dipakai penuh di Streamlit) |
| `Database/sinyal_ai_rumus_*.csv` (1-9) | kecil | sidang_lib (W), bot_simulator (R), app tab3/5 (R) |
| `Database/portofolio_aktif_rumus_*.csv` (1-9) | kecil | bot_simulator (R/W), app tab5 (R) |
| `Database/histori_transaksi_rumus_*.csv` (1-9) | kecil | bot_simulator (R/W), app tab5 (R) |
| `Database/cache_autopilot.json` | 1,2 KB | app PART 12 (R/W) |
| `Database/radar_snapshot.json` + `_sore.json` | kecil | sidang_lib (W), app PART 12 + telegram (R) |
| `Database/kasus_ledakan.json` | kecil (kadang tak ada) | app PART 14 (W) |
| `Database/ringkasan_harian.csv.gz` | 182 KB | bangun_buku_besar (W), app PART 14 (R) |
| `Database/ad_gate_log.csv` | log klik | PART 05B (A) |
| `Database/ad_clicks.json` | (Tier 2 gate) | PART 05B (R/W) |
| `config_web.json` | 10,7 KB | app PART 06 (R) |
| `preset_kustom.json` | — (fitur preset sudah dihapus) | legacy |
| `Arsip_Data_Harian/screener_*.csv` | **132 MB** (5 hari) | update_data (W, purge >5), app PART 14 (R) |
| `token_stockbit.txt` | 0,9 KB ⚠️ | fetcher_exodus, update_data (R) — **secret** |
| `Database/users.db` (SQLite Opsi A) | kecil | backend/auth.py (R/W) |

## E. Cron & Proses Luar

**Crontab aktif (2 set):**
| Jadwal | Script | Keterangan |
|---|---|---|
| `*/5 9-17 * * 1-5` | `SAHAM-SCREENING/jalankan_bot.sh` | folder LAMA (tidak disentuh) |
| `10 17 * * 1-5` | `SAHAM-SCREENING/buat_artikel.py` + push origin | folder LAMA |
| `*/5 9-17 * * 1-5` | `WEB-SCREENING/jalankan_bot.sh` → `bot_ws.log` | folder BARU |
| `10 17 * * 1-5` | `WEB-SCREENING/buat_artikel.py` + push codespace | folder BARU |

**Subprocess dari app.py (Tab 5 Portofolio, setelah login):**
- `bot_simulator.py --beli-only` (timeout 1800 dtk)
- `bot_simulator.py --jual-only` (timeout 1800 dtk)
- `reset_porto.py --yes` (timeout 120 dtk, konfirmasi 2× klik)

**Subprocess dari cron (`jalankan_bot.sh`):** `update_data.py` → `sidang_jadwal.py` → `fetcher_exodus.py` → `bot_simulator.py --tp-sl-only` → `bangun_buku_besar.py` → git auto-commit/push `codespace`.

## F. Secrets & Layanan Eksternal

| Secret | Dipakai di | Layanan |
|---|---|---|
| `GEMINI_API_KEY` | PART 02 (ai_hakim_klasemen, ai_penyisihan_turnamen, ai_grand_final_top5, radar_model_gemini_cepat) + PART 12 (sidang autopilot) | Google Gemini API |
| `OPENROUTER_API_KEY` | PART 02 (analisa_bandar_ai_multisaham, analisa_forensik_ai, panggil_ai_teks) | OpenRouter (LLM proxy) |
| Token Stockbit (`token_stockbit.txt`) | fetcher_exodus, update_data (broker summary) | Stockbit Exodus |
| Smartlink | PART 05B: `https://asiafilm.org/4/19c04df950999a37cb5280a53380f182` | Ad network smartlink |
| Sumber data | `update_data.py` via yfinance | Yahoo Finance (delay ±15 mnt) |
| `ADMIN_TOKEN` (Opsi A backend) | backend/api_aksi.py | env var |

## G. Catatan Risiko

1. ⚠️ **`Database/users.json` = PIN plaintext** → jika repo public/ter-push, PIN semua user terbaca. Sebelum migrasi: hash PIN (bcrypt) + pindah ke SQLite (Opsi A sudah pakai ini).
2. ⚠️ **`Arsip_Data_Harian/` = 132 MB** → jangan masuk git (sudah di-gitignore, tapi file lama pernah ter-push ke riwayat repo lama).
3. ⚠️ **Token Stockbit** pernah ter-push di riwayat git lama → jika repo dibuat publik, rotasi token.
4. 🧹 **Kode mati:** `mesin_ai.py` sudah dihapus; `jembatan_opencode.py` kosong; `generate_keywords.py` & `beli_jadwal.py` legacy; `preset_kustom.json` legacy (fitur preset dihapus).
5. 🔁 **Duplikasi:** 2 fungsi `manual_override()` (baris 1282 & 1284 — hasil edit, satu stub pass); `history_trade.csv` vs `histori_transaksi_rumus_*.csv` (nama mirip, file pertama legacy).
6. 📦 **Impor tak terpakai di app.py:** `io` (dipakai Excel download — masih terpakai), `glob` (terpakai), `tempfile` (masih ada pemakaian minor).
7. ⚙️ **`st.stop()` di PART 05B** → saat gate aktif, CSS DESIGN SYSTEM tidak ter-load (halaman gate tanpa CSS app). Untuk FastAPI: bukan masalah (CSS selalu dimuat).
8. 📱 **`use_container_width` deprecated** di Streamlit 1.62 → warning di log, ganti `width='stretch'` saat migrasi.
9. 🔐 **Login PIN di session_state saja** → refresh browser = logout (by design, user memilih ini).

---

**Rekomendasi urutan migrasi (berdasarkan tabel C):**
1. PART 02/04/09 yang LOGIKA MURNI → pindah ke `backend/core/` tanpa perubahan
2. PART 06/07 → `backend/loader.py` (sudah ada di Opsi A, tinggal lengkapi)
3. PART 08 → backend/auth.py (sudah ada, tambah bcrypt — users.json plaintext jangan dibawa)
4. PART 10-14 → frontend HTML/JS + API endpoints
5. PART 05B gate → middleware FastAPI (redirect sebelum route)
