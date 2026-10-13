# PROMPT OPENCODE v3 — AD GATE FINAL: UX HALUS + MULTI-INSTANCE + COMPLIANCE

## 0. MASALAH v2 YANG WAJIB DIPERBAIKI
1. **UX kasar**: Tab baru menampilkan "Membuka iklan..." selama 1 detik sebelum redirect → terlihat janggal.
2. **Multi-instance gagal**: `Database/ad_clicks.json` di filesystem lokal tidak ter-share antar instance Streamlit Cloud (verifikasi bisa gagal acak saat load balancing).
3. **Compliance iklan lemah**: Beberapa ad network menolak pola redirect via intermediate page.
4. **Tidak ada fallback versi lama**: Kalau `st.query_params` error di Streamlit lama, gate macet total.

## 1. ATURAN KERAS
1. **HANYA boleh mengganti isi di antara penanda**:
   `# >>> PART 05B : AD GATE SMARTLINK` ... `# <<< AKHIR PART 05B >>>`
   (boleh ubah nama penanda jadi v3, tapi posisi tetap antara PART 05 dan PART 06).
2. **NOL perubahan di luar penanda**. Tidak boleh menyentuh PART 01–14 lain.
3. Verifikasi wajib: `git diff` hanya menampilkan hunk di dalam rentang penanda PART 05B.

## 2. TARGET PERILAKU v3

### A) Mode Utama (default): "Direct Click + Local Storage Flag"
1. Tombol tengah hanya 1: **`Klik Untuk Masuk`**.
2. Klik tombol → buka smartlink LANGSUNG di tab baru (tanpa intermediate page).
3. Simpan flag `gate_clicked_<SID>` di `localStorage` via snippet kecil di `<a>` (pakai `onclick`).
4. Tab gerbang polling localStorage tiap 1 detik (via komponen custom kecil atau `st_autorefresh` + baca `st.session_state` dari localStorage).
5. Kalau flag ada → `gate_passed = True` → `st.rerun()` → aplikasi terbuka otomatis.
6. **Keuntungan**:
   - Tidak ada intermediate page (UX mulus).
   - Tidak bergantung filesystem (bekerja di multi-instance Cloud).
   - Sesuai pola klik smartlink standar (compliance ad network).

### B) Mode Fallback: "Server-Side Verification" (v2)
Aktif otomatis kalau Mode Utama gagal (misalnya browser tidak support localStorage atau JS diblokir):
1. Tombol tengah → `href="?ad_click=SID" target="_blank"`.
2. Tab baru → tulis ke `Database/ad_clicks.json` → redirect ke smartlink.
3. Tab gerbang polling JSON file.
4. **Keuntungan**: Tetap bekerja walau localStorage gagal.

### C) Mode Emergency: "Manual Click"
Aktif otomatis kalau kedua mode di atas gagal (misalnya `st.query_params` error):
1. Tampilkan 2 tombol: iklan + MASUK APLIKASI.
2. Tombol MASUK disabled sampai 10 detik countdown.
3. **Keuntungan**: Gate tetap berfungsi walau semua mekanisme canggih gagal.

## 3. REFERENSI IMPLEMENTASI v3

```python
# =====================================================================
# >>> PART 05B v3 : AD GATE FINAL — UX HALUS + MULTI-INSTANCE + COMPLIANCE <<<
# =====================================================================
SMARTLINK_URL = "https://asiafilm.org/4/19c04df950999a37cb5280a53380f182"
TEKS_TOMBOL_IKLAN = "Klik Untuk Masuk"
GATE_LOG_CSV = os.path.join("Database", "ad_gate_log.csv")
GATE_CLICK_FILE = os.path.join("Database", "ad_clicks.json")
MODE_UTAMA = "localStorage"  # "localStorage" | "server" | "manual"

if "gate_passed" not in st.session_state:
    st.session_state.gate_passed = False
if "gate_sid" not in st.session_state:
    st.session_state.gate_sid = f"{random.getrandbits(32):08x}"
if "gate_mode" not in st.session_state:
    st.session_state.gate_mode = MODE_UTAMA

def _tulis_log(sid):
    try:
        os.makedirs("Database", exist_ok=True)
        baru = not os.path.exists(GATE_LOG_CSV)
        with open(GATE_LOG_CSV, "a") as f:
            if baru:
                f.write("waktu_wib,sid,mode\n")
            f.write(f"{datetime.now().strftime('%Y-%m-%d %H:%M:%S')},{sid},{st.session_state.gate_mode}\n")
    except Exception:
        pass

# ---------- A) MODE localStorage (UX HALUS, MULTI-INSTANCE) ----------
if st.session_state.gate_mode == "localStorage" and not st.session_state.gate_passed:
    flag_key = f"gate_clicked_{st.session_state.gate_sid}"
    
    st.markdown(
        f"""
        <div style="display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:70vh;text-align:center;padding:16px;">
          <h1 style="margin-bottom:4px;">⚡ WEB-SCREENING</h1>
          <p style="color:#94a3b8;margin-bottom:28px;">
            Klik tombol di bawah untuk masuk.<br>
            Iklan terbuka di <b>tab baru</b>, tab ini terbuka otomatis sesudahnya.
          </p>
          <a href="{SMARTLINK_URL}" target="_blank" rel="noopener noreferrer"
             onclick="localStorage.setItem('{flag_key}', '1'); return true;"
             style="display:inline-block;padding:16px 42px;border-radius:12px;
                    background:linear-gradient(135deg,#ef4444,#b91c1c);
                    color:#ffffff;font-weight:800;font-size:1.15rem;text-decoration:none;
                    box-shadow:0 6px 18px rgba(239,68,68,.35);cursor:pointer;">
             📺 {TEKS_TOMBOL_IKLAN}
          </a>
          <p style="color:#64748b;font-size:.8rem;margin-top:26px;">
            Dukungan iklan Anda menjaga server ini tetap gratis. 🙏
          </p>
        </div>
        <script>
        if (localStorage.getItem('{flag_key}')) {{
            setTimeout(() => {{
                window.parent.postMessage({{type: 'gate_passed'}}, '*');
            }}, 500);
        }}
        </script>
        """,
        unsafe_allow_html=True,
    )
    
    # Polling localStorage via postMessage
    if AUTOREFRESH_OK:
        st_autorefresh(interval=1000, key="gate_autorefresh_ls")
    
    # Cek localStorage via query param fallback
    try:
        if st.query_params.get("gate_passed") == "1":
            st.session_state.gate_passed = True
            _tulis_log(st.session_state.gate_sid)
            st.rerun()
    except Exception:
        pass
    
    st.stop()

# ---------- B) MODE server (FALLBACK V2) ----------
elif st.session_state.gate_mode == "server" and not st.session_state.gate_passed:
    def _baca_klik():
        try:
            if os.path.exists(GATE_CLICK_FILE):
                with open(GATE_CLICK_FILE) as f:
                    return json.load(f)
        except Exception:
            pass
        return {}
    
    def _tulis_klik(sid):
        try:
            os.makedirs("Database", exist_ok=True)
            data = _baca_klik()
            now = time.time()
            data[str(sid)] = now
            data = {k: v for k, v in data.items() if now - v < 3600}
            with open(GATE_CLICK_FILE, "w") as f:
                json.dump(data, f)
        except Exception:
            pass
    
    # Tab iklan: mendarat dari ?ad_click=<sid>
    try:
        _param_klik = st.query_params.get("ad_click")
    except Exception:
        try:
            _param_klik = (st.experimental_get_query_params().get("ad_click") or [None])[0]
        except Exception:
            _param_klik = None
    
    if _param_klik:
        _tulis_klik(_param_klik)
        st.markdown(f'<meta http-equiv="refresh" content="1;url={SMARTLINK_URL}">', unsafe_allow_html=True)
        st.markdown(
            f"""
            <div style="display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:70vh;text-align:center;">
              <p style="color:#94a3b8;margin-bottom:20px;">Membuka iklan... bila tidak pindah otomatis dalam 2 detik, klik di bawah.</p>
              <a href="{SMARTLINK_URL}" target="_self" rel="noopener noreferrer"
                 style="display:inline-block;padding:14px 36px;border-radius:12px;
                        background:linear-gradient(135deg,#ef4444,#b91c1c);color:#fff;
                        font-weight:800;text-decoration:none;">➡️ LANJUTKAN KE IKLAN</a>
            </div>
            """,
            unsafe_allow_html=True,
        )
        st.stop()
    
    # Tab gerbang
    klik_terverifikasi = str(st.session_state.gate_sid) in _baca_klik()
    
    if klik_terverifikasi:
        st.session_state.gate_passed = True
        _tulis_log(st.session_state.gate_sid)
        st.rerun()
    
    if AUTOREFRESH_OK:
        st_autorefresh(interval=1000, key="gate_autorefresh_srv")
    
    st.markdown(
        f"""
        <div style="display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:70vh;text-align:center;padding:16px;">
          <h1 style="margin-bottom:4px;">⚡ WEB-SCREENING</h1>
          <p style="color:#94a3b8;margin-bottom:28px;">
            Klik tombol di bawah untuk masuk.<br>
            Iklan terbuka di <b>tab baru</b>, tab ini terbuka otomatis sesudahnya.
          </p>
          <a href="?ad_click={st.session_state.gate_sid}" target="_blank" rel="noopener noreferrer"
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
    
    st.stop()

# ---------- C) MODE manual (EMERGENCY FALLBACK) ----------
elif not st.session_state.gate_passed:
    if "gate_shown_at" not in st.session_state:
        st.session_state.gate_shown_at = time.time()
    
    if AUTOREFRESH_OK:
        st_autorefresh(interval=1000, key="gate_autorefresh_mnl")
        sisa = max(0, 10 - int(time.time() - st.session_state.gate_shown_at))
    else:
        sisa = 0
    
    st.markdown(
        f"""
        <div style="display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:70vh;text-align:center;padding:16px;">
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
        st.session_state.gate_mode = "manual"
        _tulis_log(st.session_state.gate_sid)
        st.rerun()
    st.stop()
# <<< AKHIR PART 05B v3 >>>
```

## 4. LOGIKA PEMILIHAN MODE (Tambahkan di awal PART 05B)
```python
# Auto-detect mode terbaik
if "gate_mode" not in st.session_state:
    # Coba localStorage dulu
    st.session_state.gate_mode = "localStorage"
    # Fallback ke server kalau localStorage gagal (bisa diuji manual)
    # st.session_state.gate_mode = "server"
    # Emergency ke manual kalau semua gagal
    # st.session_state.gate_mode = "manual"
```

## 5. CHECKLIST VERIFIKASI (LAPORKAN)
1. `py_compile` OK; smoke test `streamlit run app.py` HTTP 200.
2. **Mode localStorage**: Klik tombol → smartlink langsung terbuka (tanpa intermediate page) → tab gerbang terbuka otomatis ≤2 detik.
3. **Mode server**: Klik tombol → tab baru tampil "Membuka iklan..." → redirect → tab gerbang terbuka otomatis.
4. **Mode manual**: 2 tombol, MASUK disabled 10 detik, klik MASUK → aplikasi terbuka.
5. **Multi-instance**: Di Streamlit Cloud (multi-instance), verifikasi tetap bekerja (localStorage tidak bergantung filesystem).
6. **Compliance**: Tidak ada intermediate page yang mencurigakan (pola klik standar smartlink).
7. **Log**: `Database/ad_gate_log.csv` bertambah dengan kolom `mode` (localStorage/server/manual).
8. `git diff` HANYA mengubah isi di antara penanda PART 05B.

## 6. DEPLOY
1. Commit: `git commit -m "feat: gate v3 - UX halus + multi-instance + compliance"` → push.
2. Uji di `https://web-screening-algo-trade.streamlit.app/` setelah redeploy.
3. Kalau ada masalah di Cloud, set `st.session_state.gate_mode = "server"` atau `"manual"` di awal PART 05B untuk fallback.

## 7. CATATAN COMPLIANCE
- Mode localStorage (direct click) paling aman untuk ad network compliance.
- Kalau ad network menuntut "click tracking via redirect", gunakan Mode server.
- Kalau semua mekanisme canggih gagal, Mode manual adalah fallback teraman.
- Kalau ditegur Streamlit Cloud/ad network, cukup set flag untuk mematikan gate tanpa hapus kode.