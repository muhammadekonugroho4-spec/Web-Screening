# 🚀 DEPLOYMENT_GUIDE — Panduan Deploy Produksi WEB-SCREENING (FastAPI)

> Panduan lengkap memindahkan backend FastAPI dari lokal (port 8100) ke produksi (Railway/Render).

---

## 1. Persiapan Repository

Pastikan semua file penting ter-commit ke Git:
```
backend/                  # seluruh backend FastAPI
bot_simulator.py          # simulator 9 arena (dukung --user)
reset_porto.py            # reset per-user
update_data.py            # pipeline data harian
fetcher_exodus.py         # fundamental Stockbit
sidang_jadwal.py          # sidang AI headless cron
bangun_buku_besar.py      # buku besar harian
config_web.json           # MASTER_FILTERS
requirements.txt
run_backend.sh
```

**JANGAN** commit: `token_stockbit.txt`, `Database/users.json`, `.venv/`, `Arsip_Data_Harian/` (sudah di `.gitignore`).

---

## 2. Deploy ke Railway

1. Login [railway.app](https://railway.app) → **New Project** → **Deploy from GitHub repo** → pilih repo.
2. Railway mendeteksi Python. Tambahkan **Start Command**:
   ```
   uvicorn backend.main:app --host 0.0.0.0 --port $PORT
   ```
3. Set **Environment Variables** (tab Variables) — lihat seksi 4.
4. Setelah jalan, klik service → **Settings** → **Networking** → **Generate Domain** → dapat URL `xxx.up.railway.app`.

## 3. Deploy ke Render (alternatif)

1. Login [render.com](https://render.com) → **New** → **Web Service** → hubungkan repo.
2. Konfigurasi:
   - **Runtime**: Python 3
   - **Build Command**: `pip install -r requirements.txt`
   - **Start Command**: `uvicorn backend.main:app --host 0.0.0.0 --port $PORT`
   - **Instance Type**: Free (untuk uji) / Starter (produksi)
3. Set environment variables di tab **Environment**.
4. Deploy → dapat URL `xxx.onrender.com`.

---

## 4. Environment Variables (WAJIB)

| Variabel | Wajib? | Keterangan |
|---|---|---|
| `GEMINI_API_KEY` | untuk fitur AI | Google Gemini (sidang AI, chat detektif, narasi) |
| `OPENROUTER_API_KEY` | fallback AI | OpenRouter — fallback narasi bila Gemini limit |
| `WS_SECRET_KEY` | **WAJIB** | Kunci JWT. Isi string acak panjang (mis. hasil `python -c "import secrets; print(secrets.token_urlsafe(48))"`) |
| `ADMIN_TOKEN` | opsional | Token admin untuk endpoint aksi khusus |
| `TOKEN_STOCKBIT` | untuk pipeline | Token Bearer Stockbit (biasanya di-set ulang tiap 24 jam oleh fetcher) |

> ⚠️ Jangan pernah menaruh API key di file yang ter-commit. Semua lewat environment variables platform.

---

## 5. Migrasi Database / Data

Data yang perlu disalin ke produksi:

| Data | Sumber lokal | Catatan |
|---|---|---|
| `Database/hasil_screener.csv` | dari cron lokal | wajib ada agar halaman tidak kosong |
| `Database/data_akuisisi.csv` | idem | merge akuisisi |
| `Database/fundamental_exodus.csv` | idem | 11 kolom fundamental |
| `Database/users.db` | SQLite auth | **isi semua akun user ikut pindah** |
| `Database/ringkasan_harian.csv.gz` | buku besar | untuk otopsi/tren 50H |
| `Arsip_Data_Harian/` | 5 hari terakhir | otopsi intraday (±132 MB — upload sekali) |
| `Database/radar_snapshot*.json` | sidang | opsional |
| `config_web.json` | repo | sudah ikut Git |

Cara paling mudah: buat **release sekali jalan** (script `setup_data.py` atau via Railway shell) yang menarik file dari GitHub Releases / R2 / rsync dari laptop.

> Catatan: SQLite di platform gratis bersifat **ephemeral di beberapa konfigurasi** — pasang **volume persisten** (Railway Volumes / Render Disk) yang di-mount ke `/app/Database`, atau pindahkan auth ke Postgres nanti.

---

## 6. Domain + SSL

1. **Railway**: Settings → Networking → **Custom Domain** → tambah `www.domainanda.com` → buat CNAME ke `xxx.up.railway.app`. SSL otomatis (Let's Encrypt).
2. **Render**: Settings → **Custom Domains** → Add Domain → CNAME/ALIAS sesuai petunjuk. SSL otomatis.
3. Update `APP_URL` di `LANDING_PAGE.html` ke URL/domain produksi.

---

## 7. Cron Job (pipeline data)

Platform seperti Railway/Render tidak punya cron native yang matang. Pilihan:

**Opsi A — Cron di laptop/VPS lama (paling mudah, tetap jalan):**
```cron
*/5 9-17 * * 1-5  /path/WEB-SCREENING/jalankan_bot.sh
10 17 * * 1-5     /path/WEB-SCREENING/.venv/bin/python /path/WEB-SCREENING/buat_artikel.py
```
Pipeline menulis CSV → push Git → platform redeploy/menarik data. (Cara kerja saat ini.)

**Opsi B — Railway Cron / GitHub Actions:**
```yaml
# .github/workflows/update_data.yml
on:
  schedule:
    - cron: "*/5 2-10 * * 1-5"   # 9-17 WIB = 2-10 UTC
jobs:
  update:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-python@v5
        with: { python-version: "3.12" }
      - run: pip install -r requirements.txt
      - run: python update_data.py
        env:
          TOKEN_STOCKBIT: ${{ secrets.TOKEN_STOCKBIT }}
```
Hasil CSV di-commit → Railway/Render redeploy otomatis (aktifkan **Auto-Deploy on Push**).

---

## 8. Monitoring & Logging

- **Railway**: tab **Deployments** → log real-time; tambah integrasi **Sentry** (opsional) untuk error tracking.
- **Render**: tab **Logs**; aktifkan **Log Stream** ke Logtail/Datadog.
- Endpoint kesehatan: monitor `GET /health` (HTTP 200 + `{"status":"ok"}`) dengan UptimeRobot/BetterStack tiap 5 menit.
- Log aplikasi tidak boleh menampilkan token/secret — sudah dijaga di kode (token hanya lewat header Authorization).

---

## 9. Strategi Backup

| Data | Frekuensi | Cara |
|---|---|---|
| `Database/` (CSV + users.db) | harian | commit Git otomatis (sudah berjalan via `auto_save_github`) + tarik ke platform |
| Volume persisten platform | mingguan | snapshot Railway Volume / Render Disk |
| `Arsip_Data_Harian/` | rotate 5 hari | purge otomatis oleh `update_data.py` (jangan backup penuh, besar) |
| `token_stockbit.txt` | saat rotasi token | simpan di secret manager platform, bukan Git |

---

## 10. Checklist Go-Live

- [ ] Repo bersih (tidak ada secret ter-commit)
- [ ] Railway/Render jalan → `/health` = 200
- [ ] Env vars terisi (khususnya `WS_SECRET_KEY` **berbeda** dari default)
- [ ] Database + users.db tersalin → login lama bisa masuk
- [ ] Custom domain + SSL aktif
- [ ] Cron pipeline berjalan → `hasil_screener.csv` ter-update
- [ ] `LANDING_PAGE.html` → `APP_URL` menunjuk domain produksi
- [ ] Uptime monitor aktif pada `/health`
- [ ] Uji end-to-end: register → login → screener → AI → portfolio → detective

---

## 11. Railway Volume (Persistensi Database) — Fase E

Tanpa Volume, `Database/` (termasuk `users.db` akun) ter-reset tiap deploy. Dengan Volume, data tersimpan permanen di server Railway.

### Langkah setup (±5 menit, di dashboard Railway)

1. Buka project → service **Web-Screening** → tab **Volumes** → **+ New Volume**
2. **Mount path**: `/app/Database` ← persis seperti ini (folder data aplikasi)
3. **Size**: 1 GB (cukup bertahun-tahun untuk CSV + SQLite)
4. Klik **Add Volume** → Railway akan **redeploy** sekali
5. **Seed data awal** (sekali saja): setelah deploy naik, data CSV dari repo TIDAK otomatis masuk volume.
   Salin dari repo ke volume lewat salah satu cara:
   - **Railway Shell** (tab service → Shell): `cp -n /app/Database.bak/* /app/Database/ 2>/dev/null || true` (jika Anda membuat image dengan salan awal), atau
   - **Download-upload**: unduh `hasil_screener.csv`, `data_akuisisi.csv`, `fundamental_exodus.csv`, `cache_autopilot.json`, `radar_snapshot*.json` dari repo → upload lewat Railway Shell `cat > file` / curl, atau
   - **Terima kosong** lalu jalankan cron laptop sore hari → push → redeploy 17:30 → data terisi.

   > Cara paling gampang: biarkan kosong, lalu tunggu **deploy trigger 17:30 pertama** — tapi trigger hanya mengubah 1 file trigger... maka untuk seed pertama, jalankan sekali manual:
   > Railway Shell: `python -c "import urllib.request; [urllib.request.urlretrieve(f'https://raw.githubusercontent.com/muhammadekonugroho4-spec/Web-Screening/main/Database/{f}', f'Database/{f}') for f in ['hasil_screener.csv','data_akuisisi.csv','fundamental_exodus.csv','cache_autopilot.json','radar_snapshot.json']]"`

### Dampak setelah Volume aktif

| Hal | Sebelum | Sesudah |
|---|---|---|
| Akun user | reset tiap deploy | **permanen** |
| Data CSV | ikut commit Git | **stabil di server** (cron laptop opsional sebagai cadangan) |
| Deploy | build membawa data | build hanya kode |

### Penyesuaian cron laptop setelah Volume aktif (opsional)

Pipeline data bisa dipindah ke Railway (Railway Cron) atau tetap di laptop. Jika tetap di laptop:
- `jalankan_bot.sh` tak perlu lagi `git push` data (data hidup di volume) — cukup dipakai sebagai *backup* harian.

---

## 12. Domain Kustom + SSL — Fase E

### Railway (SSL otomatis Let's Encrypt)

1. Beli domain (mis. di Namecheap/Cloudflare: `webscreening.id`)
2. Railway → service → **Settings → Networking → Custom Domain** → masukkan `app.domainanda.com`
3. Railway menampilkan **CNAME target** (mis. `xxx.up.railway.app`)
4. Di DNS provider: buat record `CNAME` → `app` → `xxx.up.railway.app` (proxied **OFF** dulu untuk verifikasi pertama)
5. Tunggu DNS propagate (5–30 menit) → Railway otomatis menerbitkan sertifikat SSL
6. Update `APP_URL` di `LANDING_PAGE.html` → `https://app.domainanda.com/`
7. (Opsional) redirect domain root → subdomain app

### Checklist pasca-domain

- [ ] `https://app.domainanda.com/health` → 200
- [ ] Ganti `APP_URL` di LANDING_PAGE
- [ ] Uptime monitor arahkan ke domain baru
- [ ] MIGRATION_PLAN.md: sebar domain baru ke user
