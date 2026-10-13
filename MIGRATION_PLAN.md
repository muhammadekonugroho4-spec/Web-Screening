# 📣 MIGRATION_PLAN — Rencana Migrasi User: Streamlit → FastAPI

> Komunikasi resmi ke seluruh pengguna mengenai perpindahan platform.

---

## 1. Pesan Pengumuman (siap kirim)

```
📢 PENTING: WEB-SCREENING Pindah ke Mesin Baru!

Mulai [TANGGAL], aplikasi WEB-SCREENING berpindah dari Streamlit ke
FastAPI — lebih cepat, lebih ringan, dan tampilan baru yang responsif
(aman dibuka di HP).

Yang perlu Anda lakukan: TIDAK ADA. Login pakai username & PIN yang sama,
semua data portofolio Anda ikut pindah.

Streamlit versi lama akan dimatikan pada [TANGGAL + 2 MINGGU].
Simpan bookmark baru: https://domainanda.com
```

---

## 2. Timeline Transisi (2 minggu)

| Periode | Kegiatan |
|---|---|
| **Hari 1-2** | Pengumuman di aplikasi lama (banner), grup, dan email |
| **Hari 3-7** | Versi FastAPI live di domain baru; keduanya jalan paralel; data tetap sinkron dari cron yang sama |
| **Hari 8-11** | Periode feedback; perbaikan bug prioritas; reminder 1 |
| **Hari 12-13** | Reminder terakhir + tombol di Streamlit lama mengarah ke domain baru |
| **Hari 14** | Streamlit lama dimatikan (Sleep/Stop app). Domain lama redirect ke domain baru |

---

## 3. Fitur Baru di Versi FastAPI

- 🚀 **Jauh lebih cepat** — API JSON + halaman ringan (Tailwind), bukan render penuh per klik seperti Streamlit.
- 📱 **Responsif penuh** — nyaman dibuka di HP (PWA-ready).
- 📌 **Screener baru** — 38 filter + filter numerik (PER, PBV, harga) + pencarian broker + 5 mode tampilan + download CSV.
- 💼 **Portofolio multi-user** — setiap akun punya 9 arena sendiri (terisolasi per user, bukan bersama).
- 🕵️ **Detektif Ledakan** — otopsi intraday, tren 50H, checklist gap-up, chat AI.
- 🔐 **Login lebih aman** — PIN di-hash (bcrypt) + token JWT, bukan plaintext.

## 4. Cara Migrasi Akun

1. Buka domain baru: `https://domainanda.com`
2. **Login dengan username & PIN yang sama persis** — database akun sudah dipindahkan utuh.
3. Tidak perlu daftar ulang. Tidak perlu instal apa pun.
4. (Khusus pengguna portofolio) data posisi & histori per-user otomatis muncul di arena masing-masing.

> Jika lupa PIN: gunakan fitur daftar ulang dengan username lain, atau hubungi dukungan.

---

## 5. FAQ

**Q: Apakah data portofolio saya hilang?**
A: Tidak. Histori transaksi, posisi aktif, dan saldo tiap arena ikut dipindahkan.

**Q: Apakah cara pakai berubah?**
A: Menu sama (Market, Screener, AI, Portofolio, Detektif). Alur tombol beli/jual/reset identik — hanya tampilan lebih modern.

**Q: Apakah aplikasi HP (PWA) lama masih jalan?**
A: Update bookmark ke domain baru; manifest PWA sudah tersedia di versi baru.

**Q: Apakah gratis?**
A: Ya, tetap gratis. Halaman sponsor (smartlink) membantu menutup biaya server.

**Q: Kenapa pindah dari Streamlit?**
A: Streamlit meng-render ulang seluruh halaman setiap aksi dan sulit multi-user. FastAPI memisahkan API dan tampilan — lebih cepat, stabil, dan bisa dikembangkan jauh (aplikasi mobile, API publik, dll).

**Q: Saya menemukan bug di versi baru — lapor ke mana?**
A: Kanal dukungan di seksi 7. Sertakan screenshot + username (jangan kirim PIN).

**Q: Apa yang TIDAK berubah?**
A: Sumber data (screener harian IHSG), 9 rumus BSJP, aturan simulator (modal Rp 100 jt/arena, fee beli 0,15% / jual 0,25%), jadwal update, dan semuanya gratis.

---

## 6. Perbandingan Singkat

| Aspek | Streamlit (lama) | FastAPI (baru) |
|---|---|---|
| Kecepatan berpindah tab | render ulang penuh | instan (SPA/API) |
| Multi-user portofolio | bersama (1 set file) | terisolasi per akun |
| Login | PIN plaintext | bcrypt + JWT |
| Mobile | terbatas | responsif penuh |
| Keamanan akun | rendah | standar industri |

---

## 7. Kontak Dukungan

- Email: `dukungan@domainanda.com`
- Grup/kanal komunitas: (isi sesuai kanal Anda — Telegram/Discord/WhatsApp)
- Jam respons: 1×24 jam pada hari kerja bursa

> Catatan internal (bukan untuk user): sebelum hari ke-14, pastikan `users.db` produksi sudah sinkron terakhir dan cron pipeline berjalan di platform. Setelah Streamlit lama dimatikan, arsipkan `app.py` (jangan dihapus) untuk referensi.
