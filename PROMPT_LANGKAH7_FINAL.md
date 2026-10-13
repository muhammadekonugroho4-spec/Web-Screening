# PROMPT OPENCODE — STEP 7: DETECTIVE LEDAKAN + FINAL DEPLOYMENT

## MISSION
Complete the migration by:
1. Move Tab 6 - Detective Ledakan (AlphaScan Pro + Chat AI) to FastAPI
2. Setup production deployment (Railway/Render)
3. Create landing page with smartlink integration
4. Prepare migration plan for users

## STRICT RULES
1. DO NOT modify `app.py` at all.
2. Only CREATE/MODIFY files in `backend/` and root project folder.
3. Use logic from `backend.core.*` and `services/alpha_features.py`.
4. DO NOT run Streamlit.
5. DO NOT commit anything — user decides.

## STRUCTURE TO CREATE/MODIFY

### 1. `backend/routes/api.py` (MODIFY — add detective endpoints)

Add new endpoints:

```python
# ========== TAB 6: DETECTIVE LEDAKAN ==========

@router.get("/detective/alpha")
async def get_alpha_scan(user=Depends(get_current_user)):
    """Return AlphaScan Pro data (market breadth, sector rotation, etc)."""
    from services import alpha_features as af
    from backend.core.data_loader import load_data_saham_raw
    
    df = load_data_saham_raw()
    if df.empty:
        return {"error": "Data saham belum tersedia"}
    
    return {
        "market_breadth": af.market_breadth(df),
        "sector_rotation": af.sector_rotation(df),
        "premarket_gap": af.premarket_gap_scanner(df, 2.0),
    }

@router.post("/detective/chat")
async def detective_chat(request: dict, user=Depends(get_current_user)):
    """Chat with AI about detective data."""
    from backend.core.ai_service import panggil_ai_teks
    import os
    
    GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY")
    if not GEMINI_API_KEY:
        return {"error": "GEMINI_API_KEY belum dipasang"}
    
    pesan = request.get("pesan", "")
    konteks = request.get("konteks", "")
    
    prompt = f"""Kamu analis detektif pasar saham Indonesia. FAKTA hanya dari BLOK DATA di bawah; untuk edukasi/konsep gunakan pengetahuan umum. Jika fakta tidak ada, katakan jujur. Jawab Bahasa Indonesia, analitis, tanpa basa-basi.
BLOK DATA:
{konteks}
PERTANYAAN: {pesan}"""
    
    jawaban, model = panggil_ai_teks(prompt)
    return {"jawaban": jawaban, "model": model}

@router.get("/detective/otopsi/{ticker}/{tanggal}")
async def get_otopsi(ticker: str, tanggal: str, user=Depends(get_current_user)):
    """Return autopsy data for specific ticker and date."""
    from backend.core.archive import muat_arsip_harian_raw, muat_buku_besar_raw
    
    df_day = muat_arsip_harian_raw(tanggal)
    lb = muat_buku_besar_raw()
    
    # Calculate intraday anomalies
    ciri, ringkas = anomali_intraday(df_day, ticker) if not df_day.empty else ([], None)
    
    # Get last row
    row_h1 = None
    if not df_day.empty and not df_day[df_day["Ticker"] == ticker].empty:
        row_h1 = df_day[df_day["Ticker"] == ticker].iloc[-1]
    elif not lb.empty:
        lbb = lb[(lb["Ticker"] == ticker) & (lb["Tanggal"].astype(str) == tanggal)]
        if not lbb.empty:
            row_h1 = lbb.iloc[-1]
    
    # Get 50-day trend
    tren_data = tren_50h(ticker, lb) if not lb.empty else None
    
    return {
        "ticker": ticker,
        "tanggal": tanggal,
        "ringkas": ringkas,
        "ciri": ciri,
        "row_h1": row_h1.to_dict() if row_h1 is not None else None,
        "tren_50h": tren_data.to_dict('records') if tren_data is not None else None,
    }

def anomali_intraday(df_day, ticker):
    """Mirror logic from app.py PART 14."""
    # ... (opencode should copy from app.py PART 14)
    pass

def tren_50h(ticker, lb):
    """Mirror logic from app.py PART 14."""
    # ... (opencode should copy from app.py PART 14)
    pass
```

### 2. `backend/templates/detective.html` (CREATE NEW ±500-600 lines)

Create Detective page with:
- Login required (auth guard)
- AlphaScan Pro section (market breadth, sector rotation, premarket gap)
- Autopsy tools (ticker input, date selector, 8 template buttons)
- Chat interface (message input, response display)
- Tailwind dark theme
- Fetch data from `/api/detective/*` endpoints

### 3. `backend/main.py` (MODIFY — add route /detective)

Add route:
```python
@app.get("/detective", response_class=HTMLResponse)
async def detective_page(request: Request):
    """Halaman Detektif Ledakan."""
    return templates.TemplateResponse(request, "detective.html", {})
```

### 4. `backend/templates/index.html` (MODIFY — activate Detective link)

Change Detective button from disabled to active:
```html
<a href="/detective" class="bg-red-600 hover:bg-red-700 text-white font-bold py-3 px-4 rounded text-center">
    🕵️ Detektif
</a>
```

### 5. `LANDING_PAGE.html` (CREATE NEW — separate landing page with smartlink)

Create standalone landing page with:
- Hero section: "⚡ WEB-SCREENING — Screener Saham IHSG Ultimate"
- Feature highlights (6 cards: Market Overview, Screener, AI Assistant, Portfolio, Detective, Real-time Data)
- Smartlink gate: "Klik Untuk Masuk" button → opens smartlink in new tab → after 5 seconds, redirect to FastAPI app
- Tailwind CSS
- Mobile responsive
- Can be deployed separately (Netlify/Vercel/GitHub Pages)

### 6. `DEPLOYMENT_GUIDE.md` (CREATE NEW — production deployment instructions)

Create deployment guide covering:
- Railway/Render setup (step-by-step)
- Environment variables (GEMINI_API_KEY, OPENROUTER_API_KEY, ADMIN_TOKEN, JWT_SECRET)
- Database migration (copy Database/ folder to production)
- Domain setup (custom domain + SSL)
- Cron job setup (for update_data.py, bot_simulator.py)
- Monitoring & logging
- Backup strategy

### 7. `MIGRATION_PLAN.md` (CREATE NEW — user migration instructions)

Create migration plan for users:
- Announcement message (Streamlit app will be deprecated)
- Timeline (2 weeks transition period)
- New features in FastAPI version
- How to migrate account (login with same username/PIN)
- FAQ (what changes, what stays the same)
- Support contact

### 8. `requirements.txt` (MODIFY — add production dependencies)

Add:
```
gunicorn>=21.2.0
python-dotenv>=1.0.0
```

## IMPLEMENTATION

1. **Read existing files** in `backend/routes/api.py`, `backend/main.py`, `services/alpha_features.py`, `app.py` (PART 14 for detective logic).
2. **Modify `backend/routes/api.py`** — add detective endpoints.
3. **Create `backend/templates/detective.html`** with full features.
4. **Modify `backend/main.py`** — add `/detective` route.
5. **Modify `backend/templates/index.html`** — activate Detective link.
6. **Create `LANDING_PAGE.html`** — standalone landing with smartlink gate.
7. **Create `DEPLOYMENT_GUIDE.md`** — production deployment instructions.
8. **Create `MIGRATION_PLAN.md`** — user migration instructions.
9. **Modify `requirements.txt`** — add gunicorn, python-dotenv.
10. **Restart FastAPI** — kill old process, run `bash run_backend.sh`.
11. **Verify**:
    - Login first via `/api/auth/register` and `/api/auth/login`
    - Test `/api/detective/alpha` → return market breadth, sector rotation, premarket gap
    - Test `/api/detective/chat` → return AI response
    - Test `/api/detective/otopsi/{ticker}/{tanggal}` → return autopsy data
    - Open browser: `http://localhost:8100/detective` → page displays
    - Test AlphaScan Pro features
    - Test autopsy tools
    - Test chat interface
    - Open `LANDING_PAGE.html` in browser → smartlink gate works
    - Read `DEPLOYMENT_GUIDE.md` → instructions clear
    - Read `MIGRATION_PLAN.md` → migration plan clear

## OUTPUT
1. Files created/modified:
   - `backend/routes/api.py` (modify — add 3 endpoints)
   - `backend/templates/detective.html` (new — ±500-600 lines)
   - `backend/main.py` (modify — add route)
   - `backend/templates/index.html` (modify — activate link)
   - `LANDING_PAGE.html` (new — standalone landing)
   - `DEPLOYMENT_GUIDE.md` (new — deployment instructions)
   - `MIGRATION_PLAN.md` (new — user migration plan)
   - `requirements.txt` (modify — add production deps)
2. Display summary: test results + features completed.
3. DO NOT commit anything — user decides.

## IMPORTANT NOTES
- Detective page MUST require login — use `Depends(get_current_user)`.
- Use `muat_arsip_harian_raw()` and `muat_buku_besar_raw()` from `backend.core.archive`.
- Use `panggil_ai_teks()` from `backend.core.ai_service` for chat.
- Copy `anomali_intraday()` and `tren_50h()` logic from `app.py` PART 14.
- Landing page should be standalone HTML (can deploy to Netlify/Vercel separately).
- Smartlink gate: button opens smartlink in new tab, after 5 seconds redirect to FastAPI app URL.
- Deployment guide should cover Railway/Render setup, env vars, cron jobs, domain, SSL.
- Migration plan should be user-friendly, explain what changes and what stays the same.
- Test login flow before testing detective features.

## LANGUAGE REQUIREMENT
**IMPORTANT: All explanations, summaries, and output messages MUST be in Indonesian (Bahasa Indonesia), not English.**