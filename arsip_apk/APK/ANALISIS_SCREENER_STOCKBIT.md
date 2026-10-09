# 🔎 ANALISIS FITUR SCREENER — Stockbit Android v3.22.9 (com.stockbit.android)

> Sumber: dekompilasi `sb_java/` (jadx) + string pool dex. Mode: statik, offline.
> APK terverifikasi: package `com.stockbit.android`, versionName 3.22.9 (code 11390).

## 1. Fitur screener ADA di aplikasi (Observed)

Modul `com.stockbit.screener` (42 file) + `usecase/screener` + `dto/screener` +
`domain/model/entity/screener` + `repository/screener`. Sub-fitur UI:
- `ui/main` — layar utama screener
- `ui/createnew` — buat screener baru
- `ui/addrules` — tambah aturan/rule
- `ui/preset` — preset siap pakai
- `ui/favorites` + `ui/saved` — simpan favorit/template
- `ui/universe` — pilih universe (scope pasar, mis. IDX)

## 2. Endpoint backend screener (Observed dari string pool dex)

Host: `https://exodus.stockbit.com` (sama dengan yang dipakai `fetcher_exodus.py` kamu)

| Path | Fungsi |
|---|---|
| `screener/metric` | katalog metrik indikator |
| `screener/preset` | preset bawaan |
| `screener/templates` | daftar template (GET/POST) |
| `screener/templates/{id}` | detail/template by id |
| `screener/favorites` / `favorites/{id}` | favorit |
| `screener/universe` | daftar universe pasar |
| `screener/finitem-watchlist` | watchlist item keuangan |

Bentuk request template (dari `ScreenerTemplateRequest` / `ScreenerTemplateDataParam`):
`filters, limit, name, ordercol, ordertype, page, save, screenerid, sequence, type, universe`

Struktur rule (dari `ScreenerRulesDTO`):
`{ type, operator, multiplier, item1, item1_name, item2, item2_name }`
→ pola "item1 OPERATOR item2 × multiplier", persis alur "Add Rules" di UI.

Tipe template: `TEMPLATE_TYPE_GURU` (bawaan) & `TEMPLATE_TYPE_CUSTOM` (buatan user).
Sort: `asc / desc / remove_column / none`.

## 3. Endpoint penting lain di dalam APK (Observed)
`api.stockbit.com/v2.4 & v2.5` (API utama) · `api-sekuritas.stockbit.com` (trading) ·
`ws3.stockbit.com` (websocket) · `carina.stockbit.com` · `flipt.stockbit.com` (feature flag) ·
`ct.stockbit.com` (analytics) · `iplocation.stockbit.com`.

## 4. JAWABAN: bisa dipakai ulang oleh alat kita?

**Ya — dan kenyataannya sudah terbukti.** `fetcher_exodus.py` di project WEB-SCREENING
kamu sudah memakai host yang sama persis (`exodus.stockbit.com`) dengan endpoint
`screener/metric` + `screener/templates` untuk menarik data fundamental & hasil template —
memakai token Bearer milik akun sendiri.

Yang perlu dicatat:
1. Endpoint di atas butuh **token Bearer login** (umur ±24 jam, perpanjang manual via `ambil_token.py`).
2. Kredensial/kuota tetap milik akunmu sendiri; resiko ToS tetap tanggung jawab pengguna.
3. Tidak ada API screener "publik tanpa login" di APK — semua lewat host privat yang butuh sesi.
4. Versi APK memakai `api.stockbit.com/v2.5` untuk API utama (bukan exodus) — exodus khusus
   layanan screener/fundamental.
