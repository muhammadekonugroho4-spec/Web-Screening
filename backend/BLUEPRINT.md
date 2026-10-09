# 🏗️ BLUEPRINT OPSI A — FastAPI + HTML/JS Multi-User

## Arsitektur

```
[Browser] ──fetch JSON──▶ [FastAPI backend :8000]
                              ├── /api/auth/*       (JWT login/register)
                              ├── /api/screener/*   (data publik)
                              ├── /api/portfolio/*  (per-user, butuh JWT)
                              ├── /api/radar/*      (AI, butuh JWT)
                              └── /api/detektif/*   (publik)

Database:
  ├── Database/hasil_screener.csv   (global, 835 saham)
  ├── Database/fundamental_exodus.csv
  ├── Database/users.db (SQLite)    (username, pin hash)
  └── Database/users/{username}/    (portfolio per-user)
```

## Tahap eksekusi

| Tahap | Isi |
|---|---|
| T0 | Buat struktur folder `backend/`, `website/`, database user |
| T1 | Backend auth (register/login JWT) + profil user |
| T2 | Frontend: login/register page, dashboard shell |
| T3 | Porting Tab Market + Screener (read-only, publik) |
| T4 | Porting Tab AI + Portfolio (butuh JWT, per-user) |
| T5 | Porting Tab Detektif + Finalisasi |
