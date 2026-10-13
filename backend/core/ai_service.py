# =====================================================================
# backend/core/ai_service.py
# ---------------------------------------------------------------------
# Ekstraksi LOGIKA MURNI dari app.py PART 02-03 (Streamlit -> backend).
# FILE BARU (Langkah 2 migrasi). app.py TIDAK diubah sama sekali.
#
# Adaptasi untuk backend:
#   - `st.secrets.get("KEY", os.environ.get("KEY"))` -> `os.environ.get("KEY")`
#   - Parameter `progress_bar` / `status_teks` (objek Streamlit) tetap
#     opsional (default None); di backend cukup biarkan None.
#   - Tidak ada pemanggilan `st.*` di file ini.
# =====================================================================
import os
import re
import json
import time
import random

import pandas as pd
from openai import OpenAI
import google.generativeai as genai


def ai_hakim_klasemen(data_top15, api_key):
    """Asal: app.py PART 02 (baris 50-97). Tanpa adaptasi (0x st.)."""
    import google.generativeai as genai
    import time
    genai.configure(api_key=api_key)

    prompt = f"""
    Select EXACTLY 5 Tickers that have the highest combination of 'Score' and 'Volume' from the data below.
    Calculate 'Target_TP' (+5% from Harga) and 'Target_CL' (-3% from Harga).
    
    DATA:
    {data_top15}
    
    Output a JSON array containing objects with EXACTLY 3 keys: "Ticker", "Target_TP", "Target_CL".
    """

    daftar_model_aktif = []
    try:
        for m in genai.list_models():
            if 'generateContent' in m.supported_generation_methods:
                nama_bersih = m.name.replace("models/", "")
                if "1.5" in nama_bersih:
                    daftar_model_aktif.insert(0, nama_bersih)
                else:
                    daftar_model_aktif.append(nama_bersih)
    except Exception as e:
        return f"Error_AI (Gagal menyalakan radar): {e}"

    if not daftar_model_aktif:
        return "Error_AI: Tidak ada satupun model Gemini yang online untuk API Key ini."

    pesan_error_terakhir = ""
    for nama_model in daftar_model_aktif:
        try:
            model = genai.GenerativeModel(
                nama_model,
                generation_config=genai.types.GenerationConfig(
                    temperature=0.0,
                    response_mime_type="application/json"
                )
            )
            response = model.generate_content(prompt)
            return response.text
        except Exception as e:
            pesan_error_terakhir = str(e)
            time.sleep(1)
            continue

    return f"Error_AI (Semua model aktif gagal eksekusi): {pesan_error_terakhir}"


def analisa_bandar_ai_multisaham(data_saham_dict, pilihan_ai):
    """Asal: app.py PART 02 'AI BANDAR (V6)' (baris 100-154).
    Adaptasi: `st.secrets.get("OPENROUTER_API_KEY", os.environ.get(...))`
    diganti `os.environ.get("OPENROUTER_API_KEY")` (tanpa try/except)."""
    OPENROUTER_API_KEY = os.environ.get("OPENROUTER_API_KEY")
    if not OPENROUTER_API_KEY: return "❌ Kunci API OpenRouter belum dipasang!"

    model_andalan = "openrouter/free"

    try:
        client = OpenAI(base_url="https://openrouter.ai/api/v1", api_key=OPENROUTER_API_KEY)

        payload_text = ""
        for ticker, data in data_saham_dict.items():
            payload_text += f"\n--- STOCK: {ticker} ---\n"
            payload_text += f"Current Price: Rp {data['harga']}\n"
            payload_text += f"Today's Change: {data['change']}%\n"
            payload_text += f"Broker Summary: {data['broksum']}\n"
            payload_text += f"Wyckoff Phase: {data['status']}\n"
            payload_text += f"Technical Score: {data['skor']}/10\n"
            payload_text += f"Historical Trace (Daily):\n{data['histori']}\n"

        prompt = f"""
        You are the mastermind of an elite Indonesian stock market syndicate (Mega Bandar). 
        Your specialty is 'Gorengan' (highly volatile) stocks. You DO NOT buy stocks that have already pumped today. You look for "Stealth Accumulation"—stocks that are currently sideways or slightly up (Change is <= 5%), but have massive hidden accumulation in the historical intraday data, indicating they are ready to EXPLODE to top gainers tomorrow.

        I have filtered and provided {len(data_saham_dict)} candidate stocks that haven't pumped yet today.

        YOUR TASK:
        Analyze the 'Historical Trace' and 'Broker Summary' carefully. Select ONLY THE TOP 5 STOCKS that have completed their stealth accumulation phase today (by 15:00) and are 100% ready for a massive Mark-Up tomorrow morning (BSJP strategy).

        STOCK DATA TO ANALYZE:
        {payload_text}

        STRICT RULES:
        1. OUTPUT LANGUAGE: MUST be in Indonesian.
        2. DO NOT list all stocks. ONLY output your Top 5 selections.
        3. Create a Markdown table: [Peringkat, Ticker, Skor Ledakan (0-100%), Status Saat Ini].
        4. Below the table, provide a brutally analytical explanation for each stock. Prove why the pump is imminent by citing specific anomalies from the 'Historical Trace' and 'Broker Summary'.
        5. Provide a realistic Trading Plan (Buy Area near Current Price, Target Price for a massive pump >10%, and a tight Cut Loss). 
        6. Act like a ruthless market maker. No pleasantries. Start immediately with the table.
        """
        completion = client.chat.completions.create(
            model=model_andalan, messages=[{"role": "user", "content": prompt}],
            temperature=0.3, max_tokens=3000, top_p=1, stream=False,
        )

        hasil_mentah = completion.choices[0].message.content
        model_terpakai = completion.model

        if not hasil_mentah:
            return f"⚠️ Server AI (Model: {model_terpakai}) gagal memberikan jawaban. Silakan coba lagi."

        return hasil_mentah + f"\n\n---\n⚡ *Dianalisa otomatis menggunakan mesin: **{model_terpakai}** via OpenRouter*"
    except Exception as e: return f"❌ Gagal memproses data dengan OpenRouter menggunakan auto-model. Error: {e}"


def analisa_forensik_ai(data_saham_dict, master_filters_keys):
    """Asal: app.py PART 02 'AI FORENSIK BANDAR (V7)' (baris 157-209).
    Adaptasi: `st.secrets.get(...)` diganti `os.environ.get("OPENROUTER_API_KEY")`."""
    OPENROUTER_API_KEY = os.environ.get("OPENROUTER_API_KEY")
    if not OPENROUTER_API_KEY: return "❌ Kunci API OpenRouter belum dipasang!"

    model_andalan = "openrouter/free"

    try:
        client = OpenAI(base_url="https://openrouter.ai/api/v1", api_key=OPENROUTER_API_KEY)
        payload_text = ""
        for ticker, data in data_saham_dict.items():
            payload_text += f"\n--- STOCK: {ticker} ---\n"
            payload_text += f"Broker Summary (Hari H): {data['broksum']}\n"
            payload_text += f"{data['histori']}\n"

        prompt = f"""
        You are a legendary Quantitative Analyst and Stock Market Forensic Expert in Indonesia.
        I am giving you the historical data of {len(data_saham_dict)} stocks from EXACTLY 1 TO 3 DAYS BEFORE they skyrocketed to Top Gainers / ARA (>10%). This is their condition BEFORE the pump.

        YOUR OBJECTIVE:
        1. Reverse engineer the 'Bandar' strategy. Find the exact common "DNA" or hidden patterns that occurred in these stocks during the 3 days BEFORE they exploded, including their Broker Summary activity.
        2. Cross-reference your findings with the EXISTING WEB FILTERS in my application.
        3. Suggest new metrics if my existing filters are missing the secret sauce.

        DATA STOCKS (H-3 to H-1 before pump):
        {payload_text}

        MY EXISTING WEB FILTERS (Categories you can use):
        {master_filters_keys}

        STRICT RULES:
        1. OUTPUT LANGUAGE: MUST be in Indonesian.
        2. Format your response into 3 sections using Markdown:
           - "### 🧬 DNA & Pola Tersembunyi Sebelum Ledakan": Explain exactly what similarities these stocks shared (e.g., "Ketiga saham ini mengalami penurunan harga, namun OBV terus naik dan volume ditahan...").
           - "### 🎛️ Resep Filter Web Saat Ini": Tell me EXACTLY how to set my existing filters (based on the provided list) to catch this pattern tomorrow.
           - "### 💡 Rekomendasi Rumus/Kategori Baru": If there is a pattern not covered by my filters, explicitly suggest what new filter/indicator I should code into my web application.
        3. Be highly analytical, specific, and brutally honest. Do not hallucinate.
        """
        completion = client.chat.completions.create(
            model=model_andalan, messages=[{"role": "user", "content": prompt}],
            temperature=0.2, max_tokens=3000, top_p=1, stream=False,
        )

        hasil_mentah = completion.choices[0].message.content
        model_terpakai = completion.model

        if not hasil_mentah:
            return f"⚠️ Server AI (Model: {model_terpakai}) gagal memberikan jawaban. Silakan coba lagi."

        return hasil_mentah + f"\n\n---\n🔬 *Lab Forensik AI menggunakan: **{model_terpakai}** via OpenRouter*"
    except Exception as e: return f"❌ Gagal memproses data dengan OpenRouter. Error: {e}"


def ai_penyisihan_turnamen(data_grup_dict, api_key):
    """Asal: app.py PART 02 (baris 211-259). Tanpa adaptasi (0x st.)."""
    saham_grup_ini = list(data_grup_dict.keys())
    daftar_model_estafet = [
        'gemini-3.7-flash',
        'gemini-3.6-flash',
        'gemini-3.5-flash',
        'gemini-flash-latest',
        'gemini-3.5-flash-lite',
        'gemini-3.1-flash-lite',
        'gemini-flash-lite-latest'
    ]
    genai.configure(api_key=api_key)
    payload_text = ""
    for ticker, data in data_grup_dict.items():
        payload_text += f"\n- {ticker}: Harga {data['harga']}, Vol {data['volume']}, Tekanan {data['tekanan_bandar']}, Supply {data['supply']}"

    prompt = f"""
    Act as a simple data sorter for a mathematical simulation.
    Here is a list of items and their stats:
    {payload_text}
    
    Your ONLY task is to pick the 3 best items based on Volume and Tekanan. 
    Even if all data is bad, you MUST pick exactly 3.
    Output ONLY a comma-separated list of the 3 items (e.g., BBCA,GOTO,PANI).
    DO NOT add any conversational text or markdown.
    """

    for nama_model in daftar_model_estafet:
        try:
            model = genai.GenerativeModel(nama_model)
            response = model.generate_content(prompt)
            raw_content = response.text.upper()

            semua_kata = re.findall(r'[A-Z]+', raw_content)
            lolos = []
            for kata in semua_kata:
                if kata in saham_grup_ini and kata not in lolos:
                    lolos.append(kata)

            if len(lolos) == 0:
                lolos = saham_grup_ini[:3]
            lolos_final = lolos[:3]
            return ",".join(lolos_final)

        except Exception as e:
            time.sleep(2)
            continue

    return ",".join(saham_grup_ini[:3])


def ai_grand_final_top5(data_saham_dict, api_key):
    """Asal: app.py PART 02 (baris 262-314). Tanpa adaptasi (0x st.).
    Return: tuple (json_string, model_name)."""
    import json
    daftar_model_estafet = [
        'gemini-3.7-flash',
        'gemini-3.6-flash',
        'gemini-3.5-flash',
        'gemini-flash-latest',
        'gemini-3.5-flash-lite',
        'gemini-3.1-flash-lite',
        'gemini-flash-lite-latest'
    ]
    genai.configure(api_key=api_key)

    payload_text = ""
    for ticker, data in data_saham_dict.items():
        payload_text += f"\n--- {ticker} ---\n Harga: {data['harga']} | Vol: {data['volume']} | Broksum: {data['broksum']} | Tekanan: {data['tekanan_bandar']} | Supply: {data['supply']} | OBV: {data['obv']} | Fibo: {data['fibo']} | VWAP: {data['vwap']} | Candle: {data['pola_candle']}\n"

    prompt = f"""
    Act as an objective data formatting tool for a hypothetical academic simulation. THIS DOES NOT CONSTITUTE FINANCIAL ADVICE.
    Evaluate these fictionalized mathematical metrics:
    
    {payload_text}
    
    MISSION: Select EXACTLY 5 items that show the strongest theoretical accumulation score. Provide a theoretical 'Target_TP' and 'Target_CL' purely for simulation testing.
    
    CRITICAL INSTRUCTION: You are an automated JSON API endpoint. 
    You MUST output ONLY a raw, valid JSON array.
    DO NOT output any safety warnings, disclaimers, explanations, or conversational text.
    DO NOT wrap your response in markdown code blocks (DO NOT use ```json or ```).
    Your response must start exactly with '[' and end exactly with ']'.
    
    VERY IMPORTANT: The text inside the "Alasan" key MUST be written in fluent Bahasa Indonesia.
    
    Format EXACTLY like this:
    [
      {{"Peringkat": 1, "Ticker": "GOTO", "Alasan": "Akumulasi volume sangat tinggi dengan tekanan beli dominan", "Target_TP": 60, "Target_CL": 50}}
    ]
    """

    for nama_model in daftar_model_estafet:
        try:
            model = genai.GenerativeModel(nama_model)
            response = model.generate_content(prompt)
            raw_content = response.text or ""

            clean_content = raw_content.replace('```json', '').replace('```', '').strip()
            return clean_content, nama_model

        except Exception as e:
            time.sleep(3)
            continue

    raise Exception("🚨 KRITIS: Semua 7 model AI Gemini sedang mengalami limit maksimal atau server sibuk. Mohon jeda turnamen 1-2 menit sebelum mencoba lagi.")


_DAFTAR_MODEL_GEMINI_STATIS = [
    # Estafet flash/lite dulu (cepat & rate-limit rendah), lalu pro sebagai cadangan.
    # (Fase E1: menggantikan genai.list_models() yang membuat container Railway free
    #  512MB crash saat sidang — chat tanpa list_models terbukti aman.)
    "gemini-2.0-flash",
    "gemini-2.0-flash-lite",
    "gemini-1.5-flash-latest",
    "gemini-1.5-flash",
    "gemini-1.5-flash-8b",
    "gemini-1.5-pro-latest",
    "gemini-1.0-pro",
]


def radar_model_gemini_cepat(api_key):
    """Asal: app.py PART 03 (baris 320-333).
    Fase E1 adaptasi: TIDAK memanggil genai.list_models() (penyebab crash
    container 512MB) — return daftar model statis terurut cepat→cadangan."""
    return list(_DAFTAR_MODEL_GEMINI_STATIS)


def panggil_ai_teks(prompt):
    """Asal: app.py PART 03 (baris 335-358). Return: tuple (text, model_name).
    Adaptasi: `st.secrets.get("GEMINI_API_KEY"/"OPENROUTER_API_KEY", ...)
    diganti `os.environ.get(...)`."""
    """Mesin narasi gratis: Gemini flash dulu, fallback OpenRouter free."""
    try:
        GK = os.environ.get("GEMINI_API_KEY")
        if GK:
            genai.configure(api_key=GK)
            for mn in ["gemini-1.5-flash-latest", "gemini-1.5-flash", "gemini-1.0-pro"]:
                try:
                    r = genai.GenerativeModel(mn).generate_content(prompt)
                    if r.text: return r.text, f"Gemini ({mn})"
                except Exception:
                    continue
    except Exception:
        pass
    try:
        OK_ = os.environ.get("OPENROUTER_API_KEY")
        if OK_:
            cp = OpenAI(base_url="https://openrouter.ai/api/v1", api_key=OK_).chat.completions.create(
                model="openrouter/free", messages=[{"role": "user", "content": prompt}], temperature=0.4, max_tokens=1200)
            isi = cp.choices[0].message.content
            if isi: return isi, "OpenRouter"
    except Exception as e:
        return f"❌ AI gagal: {e}", "error"
    return "❌ Tidak ada mesin AI gratis tersedia.", "error"


def ai_hakim_klasemen_cepat(data_top15, api_key, daftar_model):
    """Asal: app.py PART 03 (baris 360-395). Tanpa adaptasi (0x st.)."""
    genai.configure(api_key=api_key)
    prompt = f"""
    Select EXACTLY 5 Tickers that have the highest combination of 'Score' and 'Volume' from the data below.

    DATA:
    {data_top15}

    CRITICAL: Output ONLY a raw JSON array with EXACTLY 5 objects, each with EXACTLY 1 key: "Ticker".
    DO NOT add explanations, markdown, or any other text. Keep the output as short as possible.
    """
    pesan_error_terakhir = ""
    for nama_model in daftar_model:
        try:
            model = genai.GenerativeModel(
                nama_model,
                generation_config=genai.types.GenerationConfig(
                    temperature=0.0,
                    response_mime_type="application/json",
                    max_output_tokens=1024,
                )
            )
            response = model.generate_content(prompt)
            teks = response.text or ""
            if not teks.strip():
                pesan_error_terakhir = "Respons kosong dari model"
                continue
            return teks
        except Exception as e:
            pesan_error_terakhir = str(e)
            if any(k in str(e) for k in ["429", "503", "RESOURCE_EXHAUSTED", "UNAVAILABLE"]):
                time.sleep(5)
            else:
                time.sleep(1)
            continue
    return f"Error_AI (Semua model aktif gagal eksekusi): {pesan_error_terakhir}"


def ai_top5_dari_daftar(data_dict, api_key, daftar_model, suhu=0.4):
    """Asal: app.py PART 03 (baris 400-437). Tanpa adaptasi (0x st.).
    AI memilih Top 5 dari daftar saham dengan JSON murni (tanpa penjelasan)."""
    genai.configure(api_key=api_key)
    payload_text = ""
    for ticker, d in data_dict.items():
        payload_text += (f"\n- {ticker}: Harga {d['harga']} | Change {d['change']}% | Vol {d['volume']} | Score {d['skor']} | "
                         f"Tekanan {d['tekanan']} | A/D {d['ad']} | VWAP {d['vwap']} | Supply {d['supply']} | Siklus {d['siklus']} | RVOL {d['rvol']}")
    prompt = f"""
    You are an elite Indonesian stock analyst for BSJP strategy (buy at close, sell at morning gap).
    Candidate stocks with today's metrics (list order is RANDOMIZED; judge purely by data quality):
    {payload_text}

    MISSION: Select EXACTLY 5 DIFFERENT tickers (NO duplicates, NO repeats) from the candidate list above, with the strongest accumulation & readiness for tomorrow morning's upward move.
    CRITICAL: Output ONLY a raw JSON array of 5 objects, each with EXACTLY 1 key: "Ticker".
    DO NOT add explanations, markdown, or any other text.
    """
    pesan_terakhir = ""
    for nama_model in daftar_model:
        try:
            model = genai.GenerativeModel(
                nama_model,
                generation_config=genai.types.GenerationConfig(
                    temperature=suhu,
                    response_mime_type="application/json",
                    max_output_tokens=512,
                )
            )
            response = model.generate_content(prompt)
            teks = response.text or ""
            if not teks.strip():
                pesan_terakhir = "Respons kosong"
                continue
            return teks
        except Exception as e:
            pesan_terakhir = str(e)
            time.sleep(2)
            continue
    return f"Error_AI: {pesan_terakhir}"


def _parse_ticker_top5(mentah, valid_set):
    """Asal: app.py PART 03 (baris 439-460). Tanpa adaptasi (0x st.)."""
    hasil = []
    # Lapis 1: parse blok JSON
    for blok in re.findall(r'\[.*\]', mentah, re.DOTALL):
        try:
            calon = json.loads(blok.replace("'", '"'))
            if isinstance(calon, list):
                for item in calon:
                    t = (item.get("Ticker", "") if isinstance(item, dict) else str(item)).strip().upper()
                    if t in valid_set and t not in hasil:
                        hasil.append(t)
        except Exception:
            continue
    # Lapis 2: penyelamat regex jika masih <5 (menyelamatkan ticker dari respons terpotong)
    if len(hasil) < 5:
        for m in re.finditer(r'\b([A-Z]{4})\b', mentah):
            t = m.group(1)
            if t in valid_set and t not in hasil:
                hasil.append(t)
            if len(hasil) >= 5:
                break
    return hasil[:5]


def jalankan_9_ronde_acak(df_data, daftar_ticker, api_key, progress_bar=None, status_teks=None):
    """Asal: app.py PART 03 (baris 462-512). Return: tuple (dict, error).
    Adaptasi backend: `progress_bar` dan `status_teks` adalah objek Streamlit
    yang dibuat OPSIONAL (default None) — di backend biarkan None, di
    Streamlit boleh dilempar apa adanya. Body sudah menjaga `if progress_bar:`
    dan `if status_teks:` sebelum dipanggil.
    Menjalankan 9 ronde pemilihan Top 5 dengan urutan acak setiap ronde."""
    df_seleksi = df_data[df_data['Ticker'].isin(daftar_ticker)].copy()
    if df_seleksi.empty:
        return None, "❌ Tidak ada ticker valid di database hari ini."
    # Batasi max 50 saham untuk mencegah konteks AI overflow
    if len(df_seleksi) > 50:
        df_seleksi['Score_Num'] = pd.to_numeric(df_seleksi['Total Score'], errors='coerce').fillna(0)
        df_seleksi = df_seleksi.sort_values('Score_Num', ascending=False).head(50)
    daftar_model = radar_model_gemini_cepat(api_key)
    if not daftar_model:
        return None, "❌ Tidak ada model Gemini yang online untuk API Key ini."

    hasil_ronde = {}
    urutan_sebelumnya = []
    for ronde in range(1, 10):
        if status_teks: status_teks.info(f"🎲 Ronde {ronde}/9: mengacak urutan & menggelar sidang AI...")
        acak = df_seleksi['Ticker'].tolist()
        # Jaminan urutan berbeda dari ronde sebelumnya
        while acak == urutan_sebelumnya and len(acak) > 1:
            random.shuffle(acak)
        urutan_sebelumnya = acak

        data_dict = {}
        for t in acak:
            row = df_seleksi[df_seleksi['Ticker'] == t].iloc[0]
            data_dict[t] = {
                'harga': row.get('Harga (Rp)', 0), 'change': row.get('Change (%)', 0),
                'volume': row.get('Volume', 0), 'skor': row.get('Total Score', 0),
                'tekanan': row.get('Tekanan Bandar', 'Normal'), 'ad': row.get('Kekuatan A/D', 'Normal'),
                'vwap': row.get('Posisi VWAP', 'Normal'), 'supply': row.get('Kondisi Supply', 'Normal'),
                'siklus': row.get('Fase Siklus Bandar', 'Normal'), 'rvol': row.get('RVOL (Anomali Vol)', 'Normal'),
            }
        top5 = []
        pesan_terakhir = ""
        for percobaan in range(1, 3):  # maksimal 2x percobaan per ronde
            mentah = ai_top5_dari_daftar(data_dict, api_key, daftar_model)
            if "Error_AI" in mentah:
                pesan_terakhir = mentah
                continue
            top5 = _parse_ticker_top5(mentah, set(acak))
            if len(top5) >= 5 or len(acak) < 5:
                break
        if not top5:
            hasil_ronde[ronde] = []
            if status_teks: status_teks.warning(f"⚠️ Ronde {ronde} gagal: {pesan_terakhir[:80] if pesan_terakhir else 'kurang dari 5 setelah 2 percobaan'}")
        else:
            hasil_ronde[ronde] = top5
            if status_teks: status_teks.success(f"✅ Ronde {ronde} selesai: {', '.join(top5)}")
        if progress_bar: progress_bar.progress(ronde / 9.0)
    return hasil_ronde, None


def jalankan_sidang_autopilot(daftar_rumus, df_data, api_key, progress_bar=None, status_teks=None, tulis_sinyal=True):
    """Asal: app.py PART 03 (baris 515-628). Return: tuple (dict, error, laporan).
    Adaptasi backend: sama seperti `jalankan_9_ronde_acak`, `progress_bar` dan
    `status_teks` (objek Streamlit) opsional (default None). Body sudah menjaga
    `if progress_bar:` / `if status_teks:` sebelum dipanggil."""
    import concurrent.futures

    keranjang = {f"RUMUS {i}": ["", "", "", "", ""] for i in range(1, 10)}
    laporan = {i: {"status": "⏭️ Kosong", "detail": "Tidak ada saham yang lolos rumus ini"} for i in range(1, 10)}

    if status_teks: status_teks.info("📡 Radar model: menarik daftar model Gemini online (cukup sekali)...")
    daftar_model = radar_model_gemini_cepat(api_key)
    if not daftar_model:
        return keranjang, "❌ Tidak ada model Gemini yang online untuk API Key ini.", laporan

    def sidang_satu_rumus(i):
        try:
            df_target = daftar_rumus[i]
            n_kandidat = len(df_target)
            saham_valid = df_target['Ticker'].tolist()
            df_seleksi = df_data[df_data['Ticker'].isin(saham_valid)].copy()
            df_seleksi['Score_Num'] = pd.to_numeric(df_seleksi['Total Score'], errors='coerce').fillna(0)
            df_sorted = df_seleksi.sort_values(by=['Score_Num', 'Volume', 'Change (%)'], ascending=[False, False, False])

            if n_kandidat <= 5:
                tickers_ai = df_sorted['Ticker'].tolist()[:5]
            else:
                top_15 = df_sorted.head(15)
                data_kirim_ai = {}
                for _, row in top_15.iterrows():
                    data_kirim_ai[row['Ticker']] = {
                        'Harga': row.get('Harga (Rp)', 0),
                        'Volume': row.get('Volume', 0),
                        'Score': row.get('Score_Num', 0),
                        'Change_Pct': row.get('Change (%)', 0),
                        'Tekanan_Bandar': row.get('Tekanan Bandar', 'Normal'),
                        'Broksum': row.get('Broksum', 'Normal')
                    }

                hasil_mentah = ai_hakim_klasemen_cepat(data_kirim_ai, api_key, daftar_model)
                if "Error_AI" in hasil_mentah:
                    return i, n_kandidat, None, hasil_mentah

                hasil_json = None
                semua_blok_kurung = re.findall(r'\[.*\]', hasil_mentah, re.DOTALL)
                for blok in reversed(semua_blok_kurung):
                    try:
                        blok_bersih = blok.replace("'", '"')
                        blok_bersih = re.sub(r',\s*\]', ']', blok_bersih)
                        calon = json.loads(blok_bersih)
                        if isinstance(calon, list):
                            hasil_json = calon
                            break
                    except:
                        continue

                tickers_ai = []
                if hasil_json is not None:
                    for item in hasil_json:
                        t = (item.get("Ticker", "") if isinstance(item, dict) else str(item)).strip().upper()
                        if t and t in data_kirim_ai and t not in tickers_ai:
                            tickers_ai.append(t)
                else:
                    for m in re.finditer(r'Ticker"\s*:\s*"([A-Za-z0-9]+)', hasil_mentah):
                        t = m.group(1).strip().upper()
                        if t and t in data_kirim_ai and t not in tickers_ai:
                            tickers_ai.append(t)
                tickers_ai = tickers_ai[:5]

                if not tickers_ai:
                    return i, n_kandidat, None, f"AI tidak mengembalikan ticker valid. Respons: {hasil_mentah[:120]}"

            baris_sinyal = []
            for t in tickers_ai:
                row = df_sorted[df_sorted['Ticker'] == t]
                if row.empty: continue
                harga = float(row.iloc[0]['Harga (Rp)'])
                baris_sinyal.append({
                    "Ticker": t,
                    "Target_TP": int(round(harga * 1.05)),
                    "Target_CL": int(round(harga * 0.97)),
                })
            if baris_sinyal and tulis_sinyal:
                pd.DataFrame(baris_sinyal).to_csv(f"Database/sinyal_ai_rumus_{i}.csv", index=False)

            jawara = [b["Ticker"] for b in baris_sinyal]
            return i, n_kandidat, (jawara + ["", "", "", "", ""])[:5], None
        except Exception as e:
            return i, len(daftar_rumus[i]), None, str(e)

    rumus_aktif = [i for i in range(1, 10) if len(daftar_rumus[i]) > 0]
    for i in range(1, 10):
        if len(daftar_rumus[i]) == 0 and status_teks:
            status_teks.warning(f"⏭️ Rumus {i} kosong. Dilewati.")

    if status_teks: status_teks.info(f"🚀 Sidang paralel dimulai: {len(rumus_aktif)} rumus aktif, 2 hakim bekerja bersamaan...")

    selesai = 0
    with concurrent.futures.ThreadPoolExecutor(max_workers=2) as executor:
        futures = [executor.submit(sidang_satu_rumus, i) for i in rumus_aktif]
        for fut in concurrent.futures.as_completed(futures):
            i, n_kandidat, jawara, err = fut.result()
            selesai += 1
            if progress_bar: progress_bar.progress(min(selesai / 9.0, 1.0))
            if err:
                laporan[i] = {"status": "❌ Gagal", "detail": f"{n_kandidat} kandidat | {err[:120]}"}
                keranjang[f"RUMUS {i}"] = ["", "", "", "", ""]
                if status_teks: status_teks.error(f"❌ Rumus {i} gagal: {err[:120]}")
            else:
                n_jawara = len([t for t in jawara if t])
                catatan = "≤5 kandidat: urut skor (tanpa AI)" if n_kandidat <= 5 else f"{n_kandidat} kandidat → sidang AI"
                laporan[i] = {"status": "✅ Sukses", "detail": f"{catatan} → {n_jawara} jawara"}
                keranjang[f"RUMUS {i}"] = jawara
                if status_teks: status_teks.success(f"✅ Rumus {i} selesai ({selesai}/{len(rumus_aktif)}).")

    if progress_bar: progress_bar.progress(1.0)

    return keranjang, None, laporan
