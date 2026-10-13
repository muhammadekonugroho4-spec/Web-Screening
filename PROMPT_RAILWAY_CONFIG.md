# PROMPT OPENCODE — RAILWAY CONFIG FILE

## MISSION
Create file `railway.json` in repo root `/home/kaltaraid/Documents/WEB-SCREENING/`.

## FILE CONTENT (EXACT)
{
  "$schema": "https://railway.app/railway.schema.json",
  "build": {
    "builder": "NIXPACKS"
  },
  "deploy": {
    "startCommand": "uvicorn backend.main:app --host 0.0.0.0 --port $PORT",
    "healthcheckPath": "/health",
    "healthcheckTimeout": 300,
    "restartPolicyType": "ON_FAILURE",
    "restartPolicyMaxRetries": 3
  }
}

## STRICT RULES
1. DO NOT modify any other file.
2. DO NOT run any server.
3. After creating: validate JSON (`python -m json.tool railway.json`), then
   `git add railway.json && git commit -m "feat: railway.json - start command & healthcheck" && git push codespace main`.
4. Explain result in Bahasa Indonesia: file content + commit hash.