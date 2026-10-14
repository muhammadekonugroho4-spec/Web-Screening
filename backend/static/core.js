/* ============================================================
   WEB-SCREENING — core.js (global)
   1. Gate smartlink kecil (sekali per sesi, sebelum layar utama)
   2. Status login di topbar (Login / @username + keluar)
   ============================================================ */

/* ---------- 1. GATE SMARTLINK ---------- */
const WS_SMARTLINK = "https://asiafilm.org/4/19c04df950999a37cb5280a53380f182";
const WS_JEDA = 5; // detik

(function pasangGate() {
    // Skip gate di halaman login & landing
    if (location.pathname === "/login") return;
    // Sekali per sesi browser (tab/tab baru dalam sesi sama = skip)
    try {
        if (sessionStorage.getItem("ws_gate_ok")) return;
    } catch (e) { /* private mode — tetap tampilkan */ }

    const overlay = document.createElement("div");
    overlay.id = "ws-gate";
    overlay.style.cssText = "position:fixed;inset:0;background:rgba(4,8,16,.93);backdrop-filter:blur(10px);z-index:9999;display:flex;align-items:center;justify-content:center;";
    overlay.innerHTML = `
        <div style="text-align:center;max-width:360px;padding:36px 28px;">
            <div style="font-size:34px;margin-bottom:14px;">🚪</div>
            <h2 style="font-size:17px;font-weight:800;margin:0 0 8px;">Gerbang Masuk</h2>
            <p style="color:#9aa8c7;font-size:12.5px;line-height:1.65;margin:0 0 22px;">
                Klik tombol di bawah untuk membuka halaman sponsor di tab baru.
                Mendukung pengembang — kembali otomatis dalam <b style="color:#f5b942;">${WS_JEDA} detik</b>.
            </p>
            <button id="ws-gate-btn"
                style="background:#f5b942;color:#291a03;font-weight:800;font-size:13.5px;
                       padding:12px 34px;border-radius:10px;border:none;cursor:pointer;
                       font-family:inherit;box-shadow:0 4px 20px rgba(245,185,66,.3);">
                🚀 Masuk Lewat Sponsor
            </button>
            <div style="margin-top:18px;">
                <button id="ws-gate-skip" style="background:none;border:none;color:#5c6b8f;font-size:11.5px;
                        cursor:pointer;text-decoration:underline;font-family:inherit;">Lewati tanpa sponsor →</button>
            </div>
            <div id="ws-gate-hitung" style="margin-top:16px;font-size:12px;color:#2dd4bf;display:none;"></div>
        </div>`;
    document.body.appendChild(overlay);

    let sisa = WS_JEDA;
    const hitung = document.getElementById("ws-gate-hitung");

    function mulaiHitung() {
        sessionStorage.setItem("ws_gate_ok", "1");
        hitung.style.display = "block";
        hitung.textContent = `Kembali ke aplikasi dalam ${sisa} detik…`;
        const iv = setInterval(() => {
            sisa--;
            if (sisa <= 0) { clearInterval(iv); location.reload(); }
            else hitung.textContent = `Kembali ke aplikasi dalam ${sisa} detik…`;
        }, 1000);
    }

    document.getElementById("ws-gate-btn").addEventListener("click", () => {
        window.open(WS_SMARTLINK, "_blank", "noopener");
        document.getElementById("ws-gate-btn").disabled = true;
        document.getElementById("ws-gate-btn").textContent = "✓ Terbuka di tab baru";
        mulaiHitung();
    });
    document.getElementById("ws-gate-skip").addEventListener("click", () => {
        sessionStorage.setItem("ws_gate_ok", "1");
        overlay.remove();
    });
})();

/* ---------- 2. STATUS LOGIN DI TOPBAR ---------- */
(function pasangUser() {
    const slot = document.querySelector(".ws-user");
    if (!slot) return;
    const token = localStorage.getItem("ws_token");
    const user = localStorage.getItem("ws_user");

    if (!token) {
        slot.innerHTML = `<a href="/login" style="color:#2dd4bf;text-decoration:none;font-weight:700;">🔐 Login / Daftar</a>`;
        return;
    }
    // Validasi token
    fetch("/api/auth/me", { headers: { Authorization: "Bearer " + token } })
        .then(r => {
            if (!r.ok) throw 0;
            slot.innerHTML = `👤 <b>${(user || "user").replace(/</g, "&lt;")}</b>
                <a href="#" id="ws-keluar" style="color:#5c6b8f;margin-left:8px;text-decoration:none;font-size:11px;"
                   onclick="localStorage.removeItem('ws_token');localStorage.removeItem('ws_user');location.reload();return false;">keluar</a>`;
        })
        .catch(() => {
            localStorage.removeItem("ws_token");
            localStorage.removeItem("ws_user");
            slot.innerHTML = `<a href="/login" style="color:#2dd4bf;text-decoration:none;font-weight:700;">🔐 Login / Daftar</a>`;
        });
})();
