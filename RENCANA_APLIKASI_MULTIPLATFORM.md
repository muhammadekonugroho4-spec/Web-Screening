# 📋 RENCANA MATANG — APLIKASI MULTI-PLATFORM WEB-SCREENING

> Status: **DRAFT / BLUEPRINT** — menunggu eksekusi.
> Tanggal: 2026-10-08
> Target: Konversi Streamlit web → aplikasi Windows + Android + iPhone (gratis, aman, auto-update).

---

## 0. RINGKASAN EKSEKUTIF

Mengubah aplikasi Streamlit `WEB-SCREENING` yang saat ini berjalan di browser menjadi
**aplikasi terinstall** di Windows, Android, dan iPhone — tanpa biaya, tanpa Apple/Google
developer fee, dan tanpa menghapus data yang sudah ada.

**Pendekatan teknologi:** PWA (Progressive Web App) + Streamlit Cloud/self-hosted.
Pengguna membuka aplikasi → langsung terhubung ke server Streamlit → data real-time.
Update kode di server → semua pengguna langsung lihat versi baru **tanpa download ulang**.

---

## 1. STRUKTUR APLIKASI (3 PLATFORM)

### 1.1 Android & iPhone → PWA

| Aspek | Detail |
|---|---|
| Teknologi | PWA (Progressive Web App) — Streamlit + meta tag + manifest.json |
| Install | "Add to Home Screen" dari browser Chrome/Safari — tanpa Play Store / App Store |
| Biaya | **Rp 0** — tidak perlu Google Play ($25) atau Apple Developer ($99/thn) |
| Icon | Custom icon aplikasi di home screen (Android & iOS) |
| Tampilan | Fullscreen, status bar tersembunyi, terlihat seperti app native |
| Notifikasi | Web Push API (opsional, butuh service worker) |

**Cara kerja install:**
- Android: buka URL → Chrome tawarkan "Install app" → icon muncul di home screen
- iPhone: buka URL di Safari → Share → "Add to Home Screen" → icon muncul
- Windows: buka URL di Edge/Chrome → "Install" → shortcut di Start Menu + Desktop

### 1.2 Windows → PWA Desktop / .BAT Launcher

| Aspek | Detail |
|---|---|
| Opsi A | PWA Desktop via Edge/Chrome (install dari browser → shortcut Start Menu) |
| Opsi B | `.bat` launcher yang buka browser ke URL aplikasi (paling simpel) |
| Opsi C | Electron wrapper (gratis tapi ~150MB, tidak direkomendasikan untuk MVP) |
| Rekomendasi | **Opsi A** (PWA Desktop) — paling ringan, auto-update, tanpa instalasi besar |

### 1.3 Server / Backend

| Aspek | Detail |
|---|---|
| Backend | Streamlit Cloud (gratis, 1 app) atau VPS mini (Rp 50-100rb/bln) |
| Database | Tetap `Database/*.csv` lokal di server (tidak berubah) |
| Cron | Tetap jalan di server/laptop pemilik (tidak berubah) |
| Update | Push ke GitHub → Streamlit Cloud auto-deploy → semua user langsung dapat versi baru |

---

## 2. KEAMANAN (TIDAK MERUGIKAN PEMILIK)

### 2.1 Repo GitHub → PRIVATE

- Repo `muhammadekonugroho4-spec/Web-Screening` di-set ke **Private**
- Hanya pemilik yang bisa lihat kode & data
- PAT GitHub yang tertanam di `.git/config` → **regenerate** dan simpan di password manager
- Token Stockbit, Gemini API key, telegram config → tetap di `.gitignore` / Streamlit secrets

### 2.2 Aplikasi pengguna ≠ akses penuh

| Lapisan | Pengguna biasa | Pemilik |
|---|---|---|
| Lihat screener/market/radar | ✅ | ✅ |
| Lihat portfolio simulator | ✅ (read-only) | ✅ |
| Jalankan beli/jual | ❌ | ✅ (butuh PIN/token admin) |
| Lihat token/secret | ❌ | ❌ (tidak pernah tampil di UI) |
| Akses Database/ file | ❌ | ❌ (hanya server-side) |
| Download data mentah | ❌ (hanya CSV hasil filter) | ✅ |

### 2.3 Kunci pintu masuk

- **PIN Lock Screen** (opsional): pengguna masukkan PIN 6 digit untuk membuka app
  - Tanpa PIN: bisa lihat Tab Beranda + Market + Screener (publik)
  - Dengan PIN: bisa lihat Portfolio + Rumus Manual (privat)
- PIN disimpan di `st.session_state` (sesi browser, tidak persisten)
- Tidak ada akun/registrasi — PIN tunggal yang dibagikan ke orang terpilih

### 2.4 Isolasi aplikasi (rumah masing-masing)

- PWA berjalan di **sandbox browser** — tidak akses file lokal pengguna
- Tidak menulis ke storage pengguna (kecuali cache PWA yang dikelola browser)
- Tidak menjalankan proses background di perangkat pengguna
- Tidak mengganggu aplikasi lain (WhatsApp, browser, game, dll)
- Cache data terpisah per-origin — tidak bercampur dengan situs lain
- Uninstall = hapus icon + cache, tidak ada jejak di sistem

### 2.5 Tidak ada kredensial di sisi klien

- Semua token/secret hanya ada di **server** (env var / Streamlit secrets)
- Klien (PWA) hanya menerima HTML/JSON dari Streamlit — tidak pernah menerima token
- `curl` ke URL app tidak membocorkan token (Streamlit render server-side)

---

## 3. UPDATE ONLINE (TANPA DOWNLOAD ULANG)

### 3.1 Update ringan (kode/logika/UI) → otomatis

| Skenario | Yang terjadi |
|---|---|
| Pemilik edit `app.py`, push ke GitHub | Streamlit Cloud auto-redeploy dalam ~30 detik |
| Semua pengguna | Buka/tutup app → langsung lihat versi baru, **tanpa download** |
| Data harian (cron) | Update otomatis di server, pengguna tinggal refresh |

**Tidak perlu:** download ulang, Play Store update, App Store review, notifikasi update.

### 3.2 Update berat (major version) → perlu install ulang

Hanya jika ada perubahan **struktur PWA** (icon, manifest, service worker):
- Pengguna hapus icon lama → buka URL → install ulang (30 detik)
- Major version: contoh v1.0 → v2.0 (jarang, mungkin 1-2x setahun)
- Versi minor/patch (v1.0 → v1.1): tetap otomatis, tanpa install ulang

### 3.3 Versioning

```
v1.0.0  =  Major (struktur PWA berubah, install ulang)
v1.0.1  =  Patch (bug fix, otomatis)
v1.1.0  =  Minor (fitur baru, otomatis)
```

Versi ditampilkan di footer app: `WEB-SCREENING v1.0.1`

---

## 4. STRUKTUR TAB BARU

### 4.1 Urutan tab setelah rombak

| Posisi | Nama Tab | Status | Isi |
|---|---|---|---|
| **Tab 1** | 🏠 **Beranda** | **BARU** | Penjelasan app, kekurangan, disclaimer, data sources |
| Tab 2 | 📊 Market Overview | Mundur dari posisi 1 | Ringkasan pasar (tidak berubah) |
| Tab 3 | 📌 Screener Utama | Mundur dari posisi 2 | Filter + Rule Screener (tidak berubah) |
| Tab 4 | 🤖 Asisten AI | Mundur dari posisi 3 | Sidang Top-5 + Rumus Manual (tidak berubah) |
| Tab 5 | 💼 **Portofolio Bot** | **KEMBALI** | 9 arena simulator (read-only untuk publik, aksi butuh PIN) |
| Tab 6 | 🕵️ Detektif Ledakan | Mundur dari posisi 5 | Analisis intraday (tidak berubah) |

### 4.2 Isi Tab 1 — Beranda

```
🏠 BERANDA — WEB-SCREENING
═══════════════════════════

📋 TENTANG APLIKASI INI
Aplikasi ini adalah screener saham IHSG berbasis data publik (Yahoo Finance)
dan indikator teknikal. Bukan rekomendasi investasi.

⚠️ KETERBATASAN YANG WAJIB KAMU TAHU:
1. Data harga DELAY ±15 menit dari harga real-time bursa (bukan data instan)
2. Volume & broker summary butuh token Stockbit yang diperbarui manual (~24 jam)
3. Fundamental Exodus hanya update sekali sehari (sekitar 16:15 WIB)
4. Data tidak berasal langsung dari BEI — sumber: Yahoo Finance (yfinance)
5. Tidak terhubung ke akun broker — semua portfolio adalah SIMULATOR (uang virtual)
6. Tidak ada eksekusi trade otomatis — semua beli/jual manual via tombol
7. Indikator teknikal dihitung dari data harian (daily candle), bukan intraday tick
8. Sentimen berita Google News saat ini dinonaktifkan (rumus 8 diganti momentum)
9. Machine Learning anomaly detection butuh library scikit-learn (opsional)
10. Saat hari Sabtu/Minggu, tidak ada update data (bursa tutup)

📊 SUMBER DATA:
- Harga, volume, OHLC: Yahoo Finance (yfinance) — gratis, delay 15 menit
- Broker summary: Stockbit Exodus (token akun sendiri, manual 24 jam)
- Fundamental: Stockbit Exodus screener (update harian)
- Tidak menggunakan API berbayar

🔒 KEAMANAN DATA KAMU:
- Aplikasi ini tidak menyimpan data pribadi pengguna
- Tidak ada login/registrasi
- Tidak ada cookie tracking (selain yang Streamlit butuhkan untuk sesi)
- Portfolio yang ditampilkan adalah SIMULATOR, bukan akun broker riil

⚡ FITUR UTAMA:
- Screener 835+ saham IHSG dengan 40+ filter
- 9 rumus radar AI (Gemini) untuk seleksi Top-5
- Rule Screener custom (buat rumus sendiri tanpa AI)
- Portfolio simulator 9 arena × Rp 100 juta
- Detektif ledakan volume & anomali bandar
- Artikel harian otomatis (GitHub Pages)

📱 APLIKASI MULTI-PLATFORM:
- Dapat di-install di Android, iPhone, dan Windows
- Update otomatis tanpa download ulang
- Mode offline terbatas (cache browser)

© 2026 WEB-SCREENING · v1.0.0 · Bukan rekomendasi investasi
```

### 4.3 Tab 5 — Portofolio Bot (kembali)

- **Publik (tanpa PIN):** lihat saldo, posisi aktif, histori, sinyal antrean (read-only)
- **Privat (dengan PIN):** tombol EKSEKUSI BELI & JUAL SORE (butuh admin token)
- Reset portfolio & backup tetap butuh PIN admin
- Tidak ada auto-buy — cron hanya jual TP/SL otomatis

---

## 5. DATA TIDAK DIHAPUS

| Item | Perlakuan |
|---|---|
| `Database/*.csv` (835 saham, portfolio, sinyal, histori) | Tetap utuh, tidak dihapus |
| `Arsip_Data_Harian/` (5 hari) | Tetap utuh |
| `docs/` (artikel harian) | Tetap utuh |
| `Konfigurasi/saham.txt` (961 ticker) | Tetap utuh |
| Cron `jalankan_bot.sh` | Tetap jalan di server/laptop pemilik |
| Token Stockbit | Tetap manual (perpanjang ±24 jam) |
| Gemini API key | Tetap di Streamlit secrets |

**Prinsip:** rombak UI/struktur tab saja, pipeline data tidak disentuh.

---

## 6. FILE YANG PERLU DIBUAT/DIUBAH

### 6.1 File baru

| File | Fungsi |
|---|---|
| `static/manifest.json` | PWA manifest (nama, icon, theme color, display mode) |
| `static/service_worker.js` | Cache offline shell (opsional, MVP bisa tanpa ini) |
| `static/icon-192.png` | Icon app Android (192×192) |
| `static/icon-512.png` | Icon app Android/iOS (512×512) |
| `static/apple-touch-icon.png` | Icon home screen iOS (180×180) |
| `static/favicon.ico` | Favicon browser |
| `app.py` (edit) | Tambah Tab 1 Beranda + Tab 5 Portofolio kembali + PWA meta tag |
| `RENCANA_APLIKASI_MULTIPLATFORM.md` | Dokumen ini |

### 6.2 Edit `app.py`

1. Tambah meta tag PWA di `st.set_page_config()` atau `st.markdown()` injection
2. Tambah **Tab 1 Beranda** di posisi pertama `st.tabs()`
3. Geser tab existing: Market→2, Screener→3, AI→4, Detektif→6
4. Kembalikan **Tab 5 Portofolio** (kode lama masih ada di git history)
5. Tambah PIN lock untuk aksi portfolio
6. Tambah footer versi app

### 6.3 Edit `jalankan_bot.sh` (tidak berubah)

Cron tetap jalan di server. Tidak perlu dirombak.

---

## 7. IDE TAMBAHAN DARI ANALISIS

### 7.1 Dark/Light Mode Toggle
- Streamlit sudah dark mode by default
- Tambah toggle di sidebar untuk switch dark/light
- Preferensi disimpan di `st.session_state`

### 7.2 Watchlist Pengguna
- Pengguna bisa tandai saham favorit (disimpan di browser localStorage via Streamlit component)
- Tampil di sidebar atau tab khusus
- Tidak butuh server-side storage (client-side saja)

### 7.3 Price Alert (opsional, masa depan)
- Pengguna set alert: "notifikasi jika BBCA > 9000"
- Implementasi: cron cek harga → Web Push API kirim notifikasi ke PWA
- Butuh service worker + push server (bisa pakai OneSignal gratis)

### 7.4 Share Hasil Screener
- Tombol "Share" di tabel hasil → generate link dengan filter encoded di URL
- Pengguna lain buka link → langsung lihat hasil filter yang sama
- Implementasi: query parameter → `st.query_params`

### 7.5 Mode Offline Terbatas
- Service worker cache halaman shell (UI tanpa data)
- Saat offline: tampilkan "Data tidak tersedia offline" + data terakhir yang ter-cache
- Data tetap butuh server (Streamlit render server-side)

### 7.6 Cache Data 5 Menit di Browser
- Hindari reload berat setiap buka tab
- Streamlit `@st.cache_data(ttl=300)` sudah ada
- Tambah indikator "Data diperbarui X menit lalu"

### 7.7 Indikator Status Data
- Badge di header: 🟢 LIVE (jam bursa) / 📴 DELAY (di luar jam)
- Timestamp update terakhir di sidebar
- Peringatan jika data > 30 menit belum update

### 7.8 QR Code Install
- Di Tab Beranda: tampilkan QR code URL aplikasi
- Pengguna scan → buka di HP → install PWA
- Implementasi: `qrcode` library Python → render di Streamlit

### 7.9 Multi-bahasa (masa depan)
- Toggle ID/EN di sidebar
- String dipisah ke file `locale_id.json` / `locale_en.json`

### 7.10 Rate Limiting Pengguna
- Jika di-host publik, batasi request per IP (cegah abuse)
- Streamlit Cloud sudah punya built-in rate limit
- Self-hosted: tambah nginx rate limit atau middleware sederhana

---

## 8. ROADMAP EKSEKUSI

### Tahap 1 — Persiapan (½ hari)
- [ ] Set repo GitHub ke **Private**
- [ ] Regenerate PAT GitHub
- [ ] Buat icon aplikasi (192/512/apple-touch/favicon)
- [ ] Buat `manifest.json`
- [ ] Inject PWA meta tag ke `app.py`

### Tahap 2 — Restruktur Tab (1 hari)
- [ ] Buat Tab 1 Beranda (isi sesuai §4.2)
- [ ] Geser tab existing: Market→2, Screener→3, AI→4, Detektif→6
- [ ] Kembalikan Tab 5 Portofolio dari git history
- [ ] Tambah PIN lock untuk aksi portfolio
- [ ] Tambah footer versi + status data

### Tahap 3 — PWA Setup (½ hari)
- [ ] Deploy ke Streamlit Cloud (atau self-hosted)
- [ ] Tes install di Android (Chrome → Add to Home Screen)
- [ ] Tes install di iPhone (Safari → Add to Home Screen)
- [ ] Tes install di Windows (Edge → Install)
- [ ] Tes auto-update (push kode → cek semua platform dapat versi baru)

### Tahap 4 — Fitur Tambahan (opsional, bertahap)
- [ ] Dark/light toggle
- [ ] Watchlist (localStorage)
- [ ] QR code install di Beranda
- [ ] Share hasil filter via URL
- [ ] Indikator status data live/delay
- [ ] Price alert + push notification (butuh OneSignal)

### Tahap 5 — Hardening (½ hari)
- [ ] Rate limiting (jika publik)
- [ ] PIN lock screen
- [ ] Disclaimer & privacy policy di Beranda
- [ ] Test isolasi (pastikan tidak akses file lokal pengguna)

**Estimasi total MVP (Tahap 1-3): ± 2 hari kerja.**

---

## 9. RISIKO & MITIGASI

| Risiko | Dampak | Mitigasi |
|---|---|---|
| Streamlit Cloud gratis dibatasi (1 app, 1GB RAM) | App crash jika traffic tinggi | Pindah ke VPS kecil (Rp 50-100rb/bln) |
| Yahoo Finance rate limit | Data tidak update | Cron sudah ada retry + cache 5 menit |
| Token Stockbit kedaluwarsa saat akhir pekan | Broker summary "Token Mati" | Perpanjang Jumat sore sebelum pulang |
| PWA iOS terbatas (Apple batasi) | Notifikasi push tidak jalan di iOS < 16.4 | Cukup tampilkan data, push = bonus |
| Repo public bocor strategi | Orang lihat rumus/filter | Set repo **Private** |
| Pengguna abuse API Gemini | Kuota AI habis | Tombol AI butuh PIN, rate limit per sesi |

---

## 10. GARIS MERAH (TIDAK BOLEH DIUBAH)

1. **Pipeline data tidak disentuh:** `update_data.py`, `bot_simulator.py`, cron, `fetcher_exodus.py`
2. **Beli tetap manual:** tidak ada auto-buy untuk pengguna
3. **TP/SL otomatis tetap via cron:** tidak diekspos ke UI publik
4. **Token/secret tetap lokal:** tidak pernah di client-side
5. **Data portfolio simulator:** tetap virtual, jelas bukan akun riil
6. **Tanpa R2:** penyimpanan tetap lokal + GitHub (sesuai keputusan sebelumnya)
7. **Tanpa Telegram:** hanya di SAHAM-SCREENING (folder lama)

---

## 11. RINGKASAN SATU PARAGRAF

Aplikasi `WEB-SCREENING` dikonversi menjadi PWA cross-platform (Android/iPhone/Windows)
menggunakan Streamlit sebagai backend dan PWA manifest sebagai kemasan. Tab baru "Beranda"
ditambah di posisi pertama menjelaskan keterbatasan data (delay 15 menit, simulator, tidak
terhubung broker). Tab Portofolio dikembalikan dengan PIN lock untuk aksi beli/jual. Repo
GitHub di-set private, PAT diregenerate, dan semua secret tetap server-side. Update kode
otomatis terdistribusi tanpa download ulang (kecuali major version). Pipeline data, cron,
dan aturan "beli manual / TP-SL otomatis" tidak berubah.
