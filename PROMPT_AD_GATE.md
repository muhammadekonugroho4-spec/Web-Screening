# PROMPT OPENCODE — PASANG GERBANG IKLAN (SMARTLINK) DI app.py

## 0. KONTEKS PROYEK
- Aplikasi: Streamlit (satu file utama `app.py`).
- Lokasi lokal: `/home/kaltaraid/Documents/WEB-SCREENING/app.py`
- Deploy: `https://web-screening-algo-trade.streamlit.app/`
- Struktur `app.py` saat ini (JANGAN diubah urutannya):
  - PART 01: Impor modul (+ `streamlit_autorefresh` opsional, flag `AUTOREFRESH_OK`)
  - PART 02: Fungsi AI klasik
  - PART 03: Mesin auto-pilot + 9 ronde
  - PART 04: Sistem arsip cerdas
  - PART 05: `st.set_page_config` + PWA meta + CSS dark theme
  - PART 06: Load `config_web.json` (MASTER_FILTERS)
  - PART 07: Load data saham (`df_hasil`)
  - PART 08: Header & sidebar (login/register)
  - PART 09–14: Formatter, tab Market Overview, Screener, Asisten AI, Portofolio, Detektif

## 1. ATURAN KERAS (WAJIB)
1. **DILARANG menghapus, memindah, menamai ulang, atau mengubah satu baris pun kode yang sudah ada.**
2. Perubahan hanya boleh berupa:
   - MENYISIPKAN satu blok baru bernama `PART 05B` di lokasi yang ditentukan (lihat §3).
   - MENAMBAH file baru di luar `app.py` (komponen kustom / log), bila perlu.
3. Jangan refactor, jangan rapikan kode lama, jangan ubah indentasi kode lama.
4. Jangan memakai cara-cara yang sudah pasti gagal di Streamlit (lihat §6 LARANGAN).

## 2. TUJUAN FITUR
1. Setiap pengunjung baru (session baru) melihat **halaman gerbang (gate)** lebih dulu, sebelum sidebar, login, dan semua tab muncul.
2. Di gate ada tombol besar bertuliskan: **`Klik Untuk Masuk`**
3. Tombol itu membuka smartlink berikut **di tab baru**:
   `https://asiafilm.org/4/19c04df950999a37cb5280a53380f182`
4. Pengguna baru boleh masuk aplikasi setelah klik iklan + menunggu hitungan mundur selesai.
5. Setelah lolos, gate tidak muncul lagi selama session yang sama. Session baru / mode incognito → gate muncul lagi.

## 3. TITIK SISIP (PRESISI)
Sisipkan blok `PART 05B`:
- **TEPAT SETELAH** akhir blok CSS PART 05 (yaitu setelah `st.markdown(""" <style> ... </style> """, unsafe_allow_html=True)` penutup),
- **TEPAT SEBELUM** baris komentar `# >>> PART 06 : LOAD KONFIGURASI JSON (MASTER FILTERS) <<<`.
Alasan: gate harus berjalan sebelum load config/data/sidebar agar cepat dan semua konten terkunci; gunakan `st.stop()` di akhir gate.

## 4. IMPLEMENTASI UTAMA (MODE A — PALING ANDAL, WAJIB DEFAULT)
Gunakan pola dua langkah yang anti-popup-blocker:
1. Tombol iklan = tag `<a target="_blank">` yang dirender lewat `st.markdown(..., unsafe_allow_html=True)` di dokumen utama (BUKAN di dalam iframe/components, BUKAN `window.open`).
2. Tombol kedua = `st.button("✅ MASUK APLIKASI")` yang men-set `st.session_state.gate_passed = True` lalu `st.rerun()`.
3. Hitungan mundur server-side: simpan `gate_shown_at = time.time()`; tombol MASUK `disabled` sampai `DETIK_MINIMUM_TUNGGU` terlampaui. Gunakan `st_autorefresh(interval=1000, key="gate_autorefresh")` HANYA saat gate tampil dan HANYA jika `AUTOREFRESH_OK == True`. Jika `AUTOREFRESH_OK == False`, paksa `sisa = 0` supaya tidak macet.
4. Log setiap keberhasilan masuk ke `Database/ad_gate_log.csv` (kolom: `waktu_wib,sid`), `sid` = id acak per session yang disimpan di `st.session_state`. Bungkus try/except, gagal log jangan menggagalkan masuk.
5. Akhiri blok gate dengan `st.stop()`.
6. Tampilan gate: tengah layar, tema gelap mengikuti CSS yang sudah ada (warna `#0f172a`, aksen merah gradasi `#ef4444 → #b91c1c`), tombol besar membulat, ada caption penjelasan: "Iklan terbuka di tab baru. Kembali ke tab ini lalu tekan MASUK APLIKASI."

Referensi kode Mode A (boleh dirapikan secukupnya, perilaku wajib sama):

```python
# =====================================================================
# >>> PART 05B : AD GATE SMARTLINK — GERBANG IKLAN SEBELUM MASUK APP <<<
# =====================================================================
SMARTLINK_URL = "https://asiafilm.org/4/19c04df950999a37cb5280a53380f182"
TEKS_TOMBOL_IKLAN = "Klik Untuk Masuk"
DETIK_MINIMUM_TUNGGU = 5
GATE_LOG_CSV = os.path.join("Database", "ad_gate_log.csv")

if "gate_passed" not in st.session_state:
    st.session_state.gate_passed = False
if "gate_shown_at" not in st.session_state:
    st.session_state.gate_shown_at = time.time()
if "gate_sid" not in st.session_state:
    st.session_state.gate_sid = f"{random.getrandbits(32):08x}"

if not st.session_state.gate_passed:
    if AUTOREFRESH_OK:
        st_autorefresh(interval=1000, key="gate_autorefresh")

    if AUTOREFRESH_OK:
        sisa = max(0, DETIK_MINIMUM_TUNGGU - int(time.time() - st.session_state.gate_shown_at))
    else:
        sisa = 0

    st.markdown(
        f"""
        <div style="display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:70vh;text-align:center;">
          <h1 style="margin-bottom:4px;">⚡ WEB-SCREENING</h1>
          <p style="color:#94a3b8;margin-bottom:28px;">
            Untuk masuk, klik tombol di bawah ini.<br>
            Iklan terbuka di <b>tab baru</b>. Kembali ke tab ini, lalu tekan <b>MASUK APLIKASI</b>.
          </p>
          <a href="{SMARTLINK_URL}" target="_blank" rel="noopener noreferrer"
             style="display:inline-block;padding:16px 42px;border-radius:12px;
                    background:linear-gradient(135deg,#ef4444,#b91c1c);
                    color:#ffffff;font-weight:800;font-size:1.15rem;text-decoration:none;
                    box-shadow:0 6px 18px rgba(239,68,68,.35);">
             📺 {TEKS_TOMBOL_IKLAN}
          </a>
          <p style="color:#64748b;font-size:.8rem;margin-top:26px;">
            Dukungan iklan Anda menjaga server ini tetap gratis. 🙏
          </p>
        </div>
        """,
        unsafe_allow_html=True,
    )

    label_masuk = "✅ MASUK APLIKASI" if sisa == 0 else f"⏳ Tunggu {sisa} detik lagi..."
    if st.button(label_masuk, type="primary", disabled=(sisa != 0), key="gate_btn_masuk"):
        st.session_state.gate_passed = True
        try:
            os.makedirs("Database", exist_ok=True)
            baru = not os.path.exists(GATE_LOG_CSV)
            with open(GATE_LOG_CSV, "a") as f:
                if baru:
                    f.write("waktu_wib,sid\n")
                f.write(f"{datetime.now().strftime('%Y-%m-%d %H:%M:%S')},{st.session_state.gate_sid}\n")
        except Exception:
            pass
        st.rerun()
    st.stop()
# <<< AKHIR PART 05B >>>
```

## 5. MODE B (OPSIONAL — SEKALI KLIK MURNI, komponen kustom)
Hanya dikerjakan SETELAH Mode A terbukti jalan. Tambahkan flag `GATE_MODE = "A"` di awal PART 05B; Mode B aktif bila `GATE_MODE = "B"`.
1. Buat folder baru `components/ad_gate/` berisi `index.html` (komponen kustom Streamlit plain HTML+JS, pakai `streamlit-component-lib` via CDN atau bundle sendiri — pilih yang paling stabil).
2. Perilaku komponen: satu tombol besar; saat diklik (user gesture):
   - `window.open(SMARTLINK_URL, "_blank")` (atau `<a target="_blank">` bila `window.open` diblokir),
   - lalu kirim nilai ke Python: `Streamlit.setComponentValue("clicked")`.
3. Di Python: `declare_component("ad_gate", path=os.path.join(os.path.dirname(os.path.abspath(__file__)), "components", "ad_gate"))`; bila nilai kembali `"clicked"` → set `gate_passed = True` + `st.rerun()`.
4. UJI: jika popup/tab baru tetap diblokir sandbox iframe di lingkungan deploy, JANGAN memaksakan Mode B; kembalikan `GATE_MODE = "A"` dan catat alasannya di komentar kode.
5. Ingat: folder `components/` wajib ikut di-commit ke Git agar tersedia di Streamlit Cloud.

## 6. LARANGAN (PENYEBAB GAGAL SEBELUMNYA — JANGAN DIULANGI)
- JANGAN memanggil `window.open()` / `webbrowser.open()` dari callback `st.button` (jalan di server / diblokir browser).
- JANGAN menaruh tag `<script>` di `st.markdown` (akan disanitasi Streamlit, tidak pernah jalan).
- JANGAN mencoba mengakses/menutup DOM induk dari `st.components.v1.html` deklaratif (iframe terisolasi).
- JANGAN menaruh gate SETELAH sidebar/login/tab (konten akan sempat ter-render).
- JANGAN menghapus `st.stop()` di akhir gate.
- JANGAN menyimpan status gate di file global untuk semua user (harus per-session via `st.session_state`).

## 7. IDE TAMBAHAN (SERTAKAN BILA MUDAH, SEMUA OPSIONAL & DI BALIK FLAG)
- `GATE_SETIAP_KUNJUNGAN = True` (default): gate per session baru. Bila `False`, ingat lolos gate lebih lama (mis. simpan tanggal di `st.session_state`).
- Tampilkan penghitung statistik sederhana di sidebar bagian bawah (hanya untuk owner yang login sebagai admin bila mudah): jumlah baris `ad_gate_log.csv` hari ini.
- Tambahkan komentar header di PART 05B berisi tanggal pemasangan dan tujuan fitur.
- Pastikan gate tetap rapi di layar HP (PWA): gunakan lebar responsif, jangan fixed pixel besar.

## 8. CHECKLIST VERIFIKASI (WAJIB DILAPORKAN OPENCODE)
1. `cd /home/kaltaraid/Documents/WEB-SCREENING && streamlit run app.py` berjalan tanpa error.
2. Session baru → hanya gate yang tampil; sidebar/login/tab TIDAK muncul.
3. Klik "Klik Untuk Masuk" → smartlink terbuka di tab baru; tab gate tidak navigasi pergi.
4. Tombol MASUK disabled selama hitungan mundur, aktif setelahnya.
5. Klik MASUK → seluruh aplikasi normal (login, tab, screener, AI) seperti sebelum pemasangan.
6. Pindah tab / interaksi apa pun tidak memunculkan gate lagi di session sama.
7. Jendela incognito baru → gate muncul lagi.
8. `Database/ad_gate_log.csv` bertambah satu baris per keberhasilan masuk.
9. `git diff` menunjukkan HANYA penambahan blok PART 05B (+ file baru opsional), tanpa penghapusan baris lama.

## 9. DEPLOY
1. Commit: `git add app.py components Database/.gitkeep` (sesuaikan) → `git commit -m "feat: ad gate smartlink sebelum masuk app (PART 05B)"` → push.
2. Streamlit Cloud auto-redeploy; uji ulang checklist §8 di URL deploy.
3. Catatan kepatuhan: pastikan pemakaian smartlink/iklan model gerbang ini sesuai ketentuan jaringan iklan terkait dan kebijakan Streamlit Community Cloud. Bila nanti ditegur platform, cukup set flag untuk mematikan gate tanpa menghapus kode.