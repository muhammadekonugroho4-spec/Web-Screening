# =====================================================================
# backend/core/formatter.py
# ---------------------------------------------------------------------
# Ekstraksi LOGIKA MURNI dari app.py PART 09 (Streamlit -> backend).
# FILE BARU (Langkah 2 migrasi). app.py TIDAK diubah sama sekali.
#
# Semua fungsi di sini 0x `st.*` — murni manipulasi string/angka
# (pandas untuk cek notna/isna). Siap dipakai frontend/API mana pun.
# =====================================================================
import pandas as pd


def format_skor(s):
    """Asal: app.py PART 09 (baris 1516). Return: string bintang."""
    return "⭐" * int(s) if pd.notna(s) and int(s) > 0 else "-"


def format_pct(v):
    """Asal: app.py PART 09 (baris 1517). Return: string persen (+ panah)."""
    return f"{'▲ ' if v > 0 else '▼ '}{v:+.2f}%" if pd.notna(v) and v != 0 else "0.00%"


def format_mom(v):
    """Asal: app.py PART 09 (baris 1518). Return: string momen arah."""
    return "▲ Positif" if v == "Positif" else ("▼ Negatif" if v == "Negatif" else v)


def format_desimal(v):
    """Asal: app.py PART 09 (baris 1519). Return: string 2 desimal."""
    return f"{v:.2f}" if pd.notna(v) and v != 0 else "-"


def format_angka(v):
    """Asal: app.py PART 09 (baris 1520). Return: string angka pemisah titik."""
    return f"{int(v):,}".replace(",", ".") if pd.notna(v) else "-"


def format_singkat_vol(v):
    """Asal: app.py PART 09 (baris 1522-1526). Return: string volume singkat."""
    if pd.isna(v): return "-"
    if v >= 1_000_000: return f"{v/1_000_000:.2f} M Lot"
    elif v >= 1_000: return f"{v/1_000:.2f} K Lot"
    return f"{v:.0f} Lot"


def format_singkat_rp(v):
    """Asal: app.py PART 09 (baris 1528-1533). Return: string rupiah singkat."""
    if pd.isna(v) or v == 0: return "-"
    if v >= 1_000_000_000_000: return f"🔥 Rp {v/1_000_000_000_000:.2f} T"
    elif v >= 1_000_000_000: return f"💰 Rp {v/1_000_000_000:.2f} M"
    elif v >= 1_000_000: return f"🪙 Rp {v/1_000_000:.2f} Jt"
    return f"Rp {v:,.0f}".replace(",", ".")


def warna_tabel(val):
    """Asal: app.py PART 09 (baris 1535-1544). Return: string CSS warna."""
    if isinstance(val, (int, float)):
        return 'color: #22c55e; font-weight: 600;' if val > 0 else ('color: #ef4444; font-weight: 600;' if val < 0 else '')
    elif isinstance(val, str):
        if any(x in val for x in ["Positif", "Uptrend", "BELI", "Breakout Upper", "Bottom Rebound", "DALAM AKUISISI", "Rendah", "▲", "Golden Cross", "Bullish", "Tembus MA20", "Akumulasi", "Big Cap", "Gap Up", "Dominan Beli", "Undervalued", "Marubozu", "Dekat Support", "Hammer", "Di Atas VWAP", "Sultan", "Ledakan Ekstrem", "Solid", "Mark-Up", "Jarum Bawah", "Naik", "Open = Low", "Sangat Menarik", "Perfect Uptrend", "Awal Reversal", "Acc"]): return 'color: #22c55e; font-weight: 600;'
        elif any(x in val for x in ["Negatif", "Downtrend", "WAIT & SEE", "Tinggi", "▼", "Death Cross", "Bearish", "Distribusi", "Small Cap", "Gap Down", "Dominan Jual", "Overvalued", "Rawan Pucuk", "Di Bawah VWAP", "Gorengan Sepi", "Sepi", "Tiang Jemuran", "Mark-Down", "Turun", "Open = High", "Tidak Ideal", "Strong Downtrend", "Dist", "Token Mati", "Gagal", "Timeout"]): return 'color: #ef4444; font-weight: 600;'
        elif val == "> 1 Miliar": return 'color: #3b82f6; font-weight: 600;'
        elif any(x in val for x in ["Squeeze", "RENCANA AKUISISI", "Sedang", "Mid Cap", "Seimbang", "Fair Value", "Area Tengah", "Doji", "Ritel Aktif", "Anomali", "Accumulation", "Sideways", "Ideal", "Menengah", "Konsolidasi / Transisi", "Neutral"]): return 'color: #eab308; font-weight: 600;'
        elif "⭐" in val: return 'color: #22c55e;' if len(val) >= 6 else 'color: #ef4444;'
    return ''
