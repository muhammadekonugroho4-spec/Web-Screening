# PROMPT OPENCODE — FIX: TRACK backend/core + HARDEN .gitignore (Railway import crash)

## CONTEXT
Railway deployment crashes with `ModuleNotFoundError: No module named 'backend.core'`.
Root cause: folder `backend/core/` was created in an earlier migration step but NEVER committed,
so it is absent from the GitHub repo that Railway deploys. Dependencies/start command/path are
already correct. The ONLY fix needed is to track the missing runtime files and push.

## STRICT RULES
1. DO NOT modify ANY source code file (app.py, backend/*.py, backend/core/*.py, services/*.py, templates).
2. The ONLY file you may EDIT is `.gitignore` (append missing security lines if absent).
3. NEVER run `git add .` or `git add Database/` — that would leak `Database/users.json` (plaintext PIN)
   and huge archive files. Always use EXPLICIT paths.
4. DO NOT start any server. DO NOT run streamlit/uvicorn.
5. Explain every step and the final report in BAHASA INDONESIA.

## WORKING DIR
/home/kaltaraid/Documents/WEB-SCREENING

## STEPS
1. Run `git status --porcelain` and report which paths are untracked (`??`). Confirm `backend/core/`
   appears there.

2. Ensure `.gitignore` protects secrets & heavy data. Append ONLY the lines that are missing
   (do not duplicate, do not remove existing lines):
   ```
   Database/users.json
   Database/users.db
   Database/users/
   token_stockbit.txt
   *.lock
   Arsip_Data_Harian/
   GAMBAR/
   __pycache__/
   *.pyc
   ```
   IMPORTANT: do NOT add `backend/`, `services/`, `config_web.json`, or `railway.json` to .gitignore.

3. Stage the missing runtime files with EXPLICIT paths only:
   ```
   git add backend services config_web.json railway.json .gitignore
   ```
   - If `git add backend/core` reports the path is ignored, re-run with `git add -f backend/core`
     and mention this in the report (means .gitignore had a wrong rule).
   - `services` and `config_web.json` are added defensively in case they are also untracked;
     if already tracked this is a no-op and harmless.

4. Commit:
   ```
   git commit -m "fix: track backend/core logic modules + harden .gitignore (resolve Railway ModuleNotFoundError)"
   ```

5. Push. If push is REJECTED (non-fast-forward, because the laptop cron may have pushed first),
   run `git pull --rebase codespace main` THEN `git push codespace main` again. Report which path
   you took.

6. VERIFY (paste the actual command output in the report):
   - `git ls-files backend/core`  → must list ai_service.py, data_loader.py, formatter.py, archive.py, __init__.py
   - `git ls-files services/alpha_features.py` → must print the path (proves detective module is tracked)
   - `git ls-files config_web.json railway.json` → both must print
   - `git status --porcelain` → must NO LONGER show `backend/core/`, and must NOT show
     `Database/users.json` / `Database/users.db` / `token_stockbit.txt` (now ignored)
   - `git log --oneline -2`

## OUTPUT (Bahasa Indonesia)
- List exactly which files became tracked by this commit.
- Paste the verification outputs from step 6.
- State the final commit hash and whether push succeeded directly or after rebase.
- One line reminder: "Sekarang memicu deploy ulang di Railway (auto-deploy sedang dimatikan)."