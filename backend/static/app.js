/* === WEB-SCREENING Opsi A — SPA === */
const API = "";
let TOKEN = localStorage.getItem("ws_token") || null;
let USER = localStorage.getItem("ws_user") || null;

const $ = (id) => document.getElementById(id);
const esc = (s) => String(s ?? "-").replace(/[&<>"']/g, c => ({"&":"&amp;","<":"&lt;",">":"&gt;",'"':"&quot;","'":"&#39;"}[c]));
const rp = (v) => (v==null||v==="-") ? "-" : "Rp " + Number(v).toLocaleString("id-ID");
const pct = (v) => (v==null||v==="-") ? "-" : (Number(v)>0?"▲ +":Number(v)<0?"▼ ":"")+Number(v).toFixed(2)+"%";
const tagChg = (v) => `<span class="${Number(v)>0?"up":Number(v)<0?"dn":""}">${pct(v)}</span>`;

async function api(path, opts={}) {
  const headers = Object.assign({"Content-Type":"application/json"}, opts.headers||{});
  if (TOKEN) headers["Authorization"] = "Bearer " + TOKEN;
  const r = await fetch(API+path, Object.assign({}, opts, {headers}));
  if (!r.ok) { let d="HTTP "+r.status; try{d=(await r.json()).detail||d;}catch(_){} throw new Error(d); }
  return r.json();
}

function logout(){ TOKEN=null; USER=null; localStorage.removeItem("ws_token"); localStorage.removeItem("ws_user"); render(); }

// ---------- LOGIN / REGISTER ----------
function halamanAuth(){
  $("app").innerHTML = `
  <div class="wrap"><div class="kartu" style="max-width:400px;margin:60px auto">
    <h1 style="text-align:center">⚡ WEB-SCREENING</h1>
    <p style="text-align:center;color:var(--muted)">Screener saham IHSG — multi-user</p>
    <div id="auth-msg"></div>
    <div style="display:flex;gap:8px;margin-bottom:14px">
      <button class="tombol" style="flex:1" onclick="formLogin()">🔑 Login</button>
      <button class="tombol" style="flex:1;background:#334155;color:#cbd5e1" onclick="formDaftar()">📝 Daftar</button>
    </div>
    <div id="auth-form"></div>
    <p style="font-size:.8rem;color:var(--muted);text-align:center">Data portfolio terpisah per akun · bukan rekomendasi investasi</p>
  </div></div>`;
  formLogin();
}
function formLogin(){
  $("auth-form").innerHTML = `
    <form onsubmit="doLogin(event)">
      <input id="f-user" placeholder="Username" required>
      <input id="f-pin" type="password" placeholder="PIN 6 digit" maxlength="6" required>
      <button class="tombol" type="submit">Masuk</button>
    </form>`;
}
function formDaftar(){
  $("auth-form").innerHTML = `
    <form onsubmit="doDaftar(event)">
      <input id="f-user" placeholder="Username (min 3 huruf)" required>
      <input id="f-pin" type="password" placeholder="PIN 6 digit angka" maxlength="6" required>
      <button class="tombol" type="submit">Daftar & Masuk</button>
    </form>`;
}
async function doLogin(e){
  e.preventDefault();
  try {
    const d = await api("/api/auth/login", {method:"POST", body:JSON.stringify({username:$("f-user").value.trim(), pin:$("f-pin").value})});
    TOKEN=d.access_token; USER=d.username;
    localStorage.setItem("ws_token",TOKEN); localStorage.setItem("ws_user",USER);
    render();
  } catch(err){ $("auth-msg").innerHTML = `<div class="error">${esc(err.message)}</div>`; }
}
async function doDaftar(e){
  e.preventDefault();
  try {
    const d = await api("/api/auth/register", {method:"POST", body:JSON.stringify({username:$("f-user").value.trim(), pin:$("f-pin").value})});
    TOKEN=d.access_token; USER=d.username;
    localStorage.setItem("ws_token",TOKEN); localStorage.setItem("ws_user",USER);
    render();
  } catch(err){ $("auth-msg").innerHTML = `<div class="error">${esc(err.message)}</div>`; }
}

// ---------- DASHBOARD ----------
let HALAMAN = "beranda";
function shell(){
  $("app").innerHTML = `
  <div class="wrap">
    <nav>
      <a onclick="nav('beranda')" id="n-beranda">🏠 Beranda</a>
      <a onclick="nav('market')" id="n-market">📊 Market</a>
      <a onclick="nav('screener')" id="n-screener">📌 Screener</a>
      <a onclick="nav('radar')" id="n-radar">🤖 Radar AI</a>
      <a onclick="nav('portofolio')" id="n-portofolio">💼 Portofolio</a>
      <a onclick="nav('detektif')" id="n-detektif">🕵️ Detektif</a>
      <span id="user-info">👤 ${esc(USER)} <a onclick="logout()" style="cursor:pointer;color:var(--dn)">[logout]</a></span>
    </nav>
    <div id="konten"><div class="loading">⏳ Memuat…</div></div>
  </div>`;
}
function nav(h){ HALAMAN=h; render(); }

function render(){
  if (!TOKEN || !USER) { halamanAuth(); return; }
  shell();
  document.querySelectorAll("nav a").forEach(a=>a.classList.remove("aktif"));
  const n = $("n-"+HALAMAN); if(n) n.classList.add("aktif");
  const fn = {beranda:pageBeranda, market:pageMarket, screener:pageScreener, radar:pageRadar, portofolio:pagePortofolio, detektif:pageDetektif}[HALAMAN];
  fn();
}

// ---------- HALAMAN ----------
async function pageBeranda(){
  try {
    const m = await api("/api/market");
    const r = m.ringkasan || {};
    $("konten").innerHTML = `
      <div class="kartu">
        <h1>🏠 Beranda</h1>
        <p>Selamat datang, <strong>${esc(USER)}</strong>! Ini screener saham IHSG berbasis data publik.</p>
        <p style="color:var(--muted);font-size:.85rem">⚠️ Data delay ±15 menit dari bursa · portfolio adalah simulator · bukan rekomendasi investasi</p>
      </div>
      <div class="grid">
        <div class="kartu"><div style="color:var(--muted)">Saham Naik</div><div class="besar up">${r.naik??"-"}</div></div>
        <div class="kartu"><div style="color:var(--muted)">Saham Turun</div><div class="besar dn">${r.turun??"-"}</div></div>
        <div class="kartu"><div style="color:var(--muted)">Stagnan</div><div class="besar">${r.stagnan??"-"}</div></div>
        <div class="kartu"><div style="color:var(--muted)">Universe</div><div class="besar">${r.jumlah_saham??"-"}</div></div>
      </div>`;
  } catch(e){ $("konten").innerHTML = `<div class="error">${esc(e.message)}</div>`; }
}

async function pageMarket(){
  try {
    const m = await api("/api/market");
    const t = (judul, rows) => `<div class="kartu"><h3>${judul}</h3>${tabel(rows,["Ticker","Harga (Rp)","Change (%)","Volume","Total Score"])}</div>`;
    $("konten").innerHTML = t("🚀 Top Gainers", m.top_gainers)+t("🔻 Top Losers", m.top_losers)+t("📦 Top Volume", m.top_volume);
  } catch(e){ $("konten").innerHTML = `<div class="error">${esc(e.message)}</div>`; }
}

async function pageScreener(){
  $("konten").innerHTML = `
    <div class="kartu">
      <h3>📌 Screener</h3>
      <input id="s-q" placeholder="Cari ticker..." oninput="muatScreener()" style="max-width:200px;display:inline-block">
      <input id="s-score" type="number" placeholder="Min Score" min="0" max="10" oninput="muatScreener()" style="max-width:120px;display:inline-block">
    </div>
    <div id="s-hasil" class="loading">⏳ Memuat…</div>`;
  muatScreener();
}
async function muatScreener(){
  try {
    const q = $("s-q")?.value||"", sc = $("s-score")?.value||"";
    const d = await api(`/api/screener?q=${encodeURIComponent(q)}&min_score=${sc}&limit=100`);
    $("s-hasil").innerHTML = `<div class="kartu"><p style="color:var(--muted)">${d.total} saham cocok</p>${tabel(d.data,["Ticker","Harga (Rp)","Change (%)","Volume","RSI (14D)","Total Score","Rekomendasi"])}</div>`;
  } catch(e){ $("s-hasil").innerHTML = `<div class="error">${esc(e.message)}</div>`; }
}

async function pageRadar(){
  try {
    const d = await api("/api/radar?mode=pagi");
    if (!d.ada){ $("konten").innerHTML = '<div class="kartu"><p>Belum ada snapshot radar. Sidang AI jalan ~15:20 WIB.</p></div>'; return; }
    $("konten").innerHTML = `<div class="kartu"><h3>🤖 Radar AI — ${esc(d.stempel||"")}</h3></div>` +
      d.keranjang.map(k=>`<div class="kartu"><strong>Rumus ${k.rumus} — ${esc(k.nama)}</strong><br>${k.ticker.map(t=>`<span class="tag">${esc(t)}</span>`).join(" ")||'<span style="color:var(--muted)">kosong</span>'}</div>`).join("");
  } catch(e){ $("konten").innerHTML = `<div class="error">${esc(e.message)}</div>`; }
}

async function pagePortofolio(){
  try {
    const d = await api("/api/portofolio");
    $("konten").innerHTML = `<div class="kartu"><h3>💼 Portofolio — ${esc(USER)}</h3><p style="color:var(--muted);font-size:.85rem">Simulator Rp 100 jt/arena · data terpisah per akun</p></div>` +
      `<div class="grid">` + d.arena.map(a=>`
        <div class="kartu"><strong>Rumus ${a.rumus} — ${esc(a.nama)}</strong>
        <table class="data"><tr><td>Saldo</td><td class="num">${rp(a.saldo)}</td></tr>
        <tr><td>Modal Terpasang</td><td class="num">${rp(a.modal_terpasang)}</td></tr>
        <tr><td>Realized P/L</td><td class="num ${a.realized_pnl>=0?'up':'dn'}">${rp(a.realized_pnl)}</td></tr>
        <tr><td>Posisi/Sinyal</td><td class="num">${a.posisi} / ${a.sinyal}</td></tr></table></div>`).join("") + `</div>`;
  } catch(e){ $("konten").innerHTML = `<div class="error">${esc(e.message)}</div>`; }
}

async function pageDetektif(){
  try {
    const d = await api("/api/detektif");
    if (!d.ada){ $("konten").innerHTML = '<div class="kartu"><p>Belum ada data.</p></div>'; return; }
    $("konten").innerHTML = `<div class="kartu"><h3>🕵️ Detektif Ledakan (|change| ≥ 5%)</h3>${tabel(d.ledakan,["Ticker","Harga (Rp)","Change (%)","Volume","Status Bandar"])}</div>`;
  } catch(e){ $("konten").innerHTML = `<div class="error">${esc(e.message)}</div>`; }
}

function tabel(rows, cols){
  if (!rows || !rows.length) return '<p style="color:var(--muted)">Tidak ada data.</p>';
  const head = cols.map(c=>`<th>${esc(c)}</th>`).join("");
  const body = rows.map(r=>`<tr>${cols.map(c=>{
    let v = r[c];
    if (c==="Change (%)") return `<td class="num">${tagChg(v)}</td>`;
    if (c==="Ticker") return `<td><strong>${esc(v)}</strong></td>`;
    if (c==="Rekomendasi") return `<td><span class="tag ${/BELI/i.test(v)?'beli':''}">${esc(v)}</span></td>`;
    return `<td class="${typeof v==='number'?'num':''}">${esc(v)}</td>`;
  }).join("")}</tr>`).join("");
  return `<table class="data"><thead><tr>${head}</tr></thead><tbody>${body}</tbody></table>`;
}

render();
