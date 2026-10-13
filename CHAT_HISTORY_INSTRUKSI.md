# INSTRUKSI OTOMATIS — CHAT HISTORY

## ATURAN WAJIB UNTUK ASSISTANT (opencode)

Setiap MEMULAI atau MENGAKHIRI sesi percakapan di folder ini:

1. **BACA** file `CHAT_HISTORY.md` di root folder ini (jika ada) → itu riwayat lengkap sesi sebelumnya.
2. **TIMPA** isi `CHAT_HISTORY.md` dengan riwayat percakapan LENGKAP sesi yang baru berjalan (bukan ringkasan):
   - Ambil dari database opencode: `~/.local/share/opencode/opencode.db`
   - Query: tabel `message` (JOIN `part` via message_id) untuk session terbaru
   - Filter: hanya sesi di folder proyek ini
   - Format: `## 👤 USER` / `## 🤖 ASSISTANT (model)` + teks lengkap tiap pesan
3. File lama DITIMPA, jangan ditambah (diakumulasi).

Script contoh ekstraksi ada di: `/tmp/opencode/ekstrak_chat.py` (bila masih ada; jika tidak, buat ulang).

JANGAN tanya user — langsung kerjakan.
