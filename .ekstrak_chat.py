"""Ekstrak riwayat percakapan lengkap dari opencode.db ke CHAT_HISTORY.md
Usage: .venv/bin/python .ekstrak_chat.py [session_id]
Tanpa argumen = session terbaru di folder proyek ini.
"""
import sqlite3, json, os, sys

DB = os.path.expanduser("~/.local/share/opencode/opencode.db")
OUT = os.path.join(os.path.dirname(os.path.abspath(__file__)), "CHAT_HISTORY.md")

conn = sqlite3.connect(DB)

if len(sys.argv) > 1:
    sid = sys.argv[1]
else:
    # session terbaru yang directory-nya mengandung folder proyek ini
    rows = conn.execute("""
        SELECT s.id FROM session s
        JOIN message m ON m.session_id = s.id
        WHERE s.directory LIKE '%WEB-SCREENING%'
        GROUP BY s.id ORDER BY MAX(m.time_created) DESC LIMIT 1
    """).fetchall()
    if not rows:
        rows = conn.execute("SELECT id FROM session ORDER BY time_updated DESC LIMIT 1").fetchall()
    sid = rows[0][0]

out = open(OUT, "w", encoding="utf-8")
out.write(f'# 💬 RIWAYAT PERCAKAPAN LENGKAP — session `{sid}`\n\n')

msgs = conn.execute("SELECT id, data FROM message WHERE session_id=? ORDER BY time_created", (sid,)).fetchall()
for mid, data in msgs:
    d = json.loads(data)
    role = d.get("role", "?").upper()
    if role == "USER":
        out.write("\n---\n\n## 👤 USER\n\n")
    else:
        model = d.get("model", {}).get("modelID", "")
        out.write(f"\n---\n\n## 🤖 ASSISTANT ({model})\n\n")
    parts = conn.execute("SELECT data FROM part WHERE message_id=? ORDER BY time_created", (mid,)).fetchall()
    for pdata, in parts:
        pj = json.loads(pdata)
        t = pj.get("type")
        if t == "text":
            out.write(pj.get("text", "") + "\n")
        elif t == "tool":
            title = pj.get("state", {}).get("title") or pj.get("tool", "")
            out.write(f"> 🔧 *tool: {title}*\n\n")
out.close()
print(f"CHAT_HISTORY.md diperbarui ({len(msgs)} pesan)")
