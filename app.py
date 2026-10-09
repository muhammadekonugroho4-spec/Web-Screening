# =====================================================================
# 🗺️  PETA PART app.py v5.0
# ---------------------------------------------------------------------
# PART 01 : IMPOR MODUL (+ autorefresh)
# PART 02 : FUNGSI AI KLASIK
# PART 03 : MESIN AUTO-PILOT CEPAT + narasi bersama
# PART 04 : SISTEM ARSIP CERDAS
# PART 05 : PENGATURAN UI/UX & CSS
# PART 06 : LOAD KONFIGURASI JSON
# PART 07 : PRESET & LOAD DATA SAHAM
# PART 08 : HEADER & SIDEBAR
# PART 09 : FORMATTER & PEWARNAAN TABEL
# PART 10 : TAB 2 - MARKET OVERVIEW
# PART 11 : TAB 3 - SCREENER UTAMA
# PART 12 : TAB 4 - ASISTEN AI (RUMUS v5.2 + RADAR LIVE)
# PART 14 : TAB 6 - DETEKTIF LEDAKAN
# =====================================================================


# =====================================================================
# >>> PART 01 : IMPOR MODUL <<<
# =====================================================================
import io
import streamlit as st
import pandas as pd
import numpy as np
import os
import json
import glob
import time
import re
import random
from datetime import datetime

# IMPORT UNTUK AI OPENROUTER & GOOGLE
from openai import OpenAI
import google.generativeai as genai

# REFRESH OTOMATIS UNTUK RADAR LIVE (TAB 3)
try:
    from streamlit_autorefresh import st_autorefresh
    AUTOREFRESH_OK = True
except Exception:
    AUTOREFRESH_OK = False


# =====================================================================
# >>> PART 02 : FUNGSI AI KLASIK (Hakim, OpenRouter, Turnamen) <<<
# =====================================================================
def ai_hakim_klasemen(data_top15, api_key):
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

# AI BANDAR (V6)
def analisa_bandar_ai_multisaham(data_saham_dict, pilihan_ai):
    try:
        OPENROUTER_API_KEY = st.secrets.get("OPENROUTER_API_KEY", os.environ.get("OPENROUTER_API_KEY"))
    except:
        OPENROUTER_API_KEY = None
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

# AI FORENSIK BANDAR (V7)
def analisa_forensik_ai(data_saham_dict, master_filters_keys):
    try:
        OPENROUTER_API_KEY = st.secrets.get("OPENROUTER_API_KEY", os.environ.get("OPENROUTER_API_KEY"))
    except:
        OPENROUTER_API_KEY = None
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


# =====================================================================
# >>> PART 03 : MESIN AUTO-PILOT CEPAT & PARALEL (+ REM CERDAS) + 9 RONDE <<<
# =====================================================================
def radar_model_gemini_cepat(api_key):
    genai.configure(api_key=api_key)
    cepat, cadangan = [], []
    try:
        for m in genai.list_models():
            if 'generateContent' in m.supported_generation_methods:
                nama = m.name.replace("models/", "")
                if ("flash" in nama.lower()) or ("lite" in nama.lower()):
                    cepat.append(nama)
                else:
                    cadangan.append(nama)
    except Exception:
        pass
    return cepat + cadangan

def panggil_ai_teks(prompt):
    """Mesin narasi gratis: Gemini flash dulu, fallback OpenRouter free."""
    try:
        GK = st.secrets.get("GEMINI_API_KEY", os.environ.get("GEMINI_API_KEY"))
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
        OK_ = st.secrets.get("OPENROUTER_API_KEY", os.environ.get("OPENROUTER_API_KEY"))
        if OK_:
            cp = OpenAI(base_url="https://openrouter.ai/api/v1", api_key=OK_).chat.completions.create(
                model="openrouter/free", messages=[{"role": "user", "content": prompt}], temperature=0.4, max_tokens=1200)
            isi = cp.choices[0].message.content
            if isi: return isi, "OpenRouter"
    except Exception as e:
        return f"❌ AI gagal: {e}", "error"
    return "❌ Tidak ada mesin AI gratis tersedia.", "error"

def ai_hakim_klasemen_cepat(data_top15, api_key, daftar_model):
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

# =====================================================================
# 🎲 FUNGSI UNTUK UJI KONSISTENSI 9 RONDE (BARU)
# =====================================================================
def ai_top5_dari_daftar(data_dict, api_key, daftar_model, suhu=0.4):
    """AI memilih Top 5 dari daftar saham dengan JSON murni (tanpa penjelasan)."""
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
    """Menjalankan 9 ronde pemilihan Top 5 dengan urutan acak setiap ronde."""
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
# =====================================================================

def jalankan_sidang_autopilot(daftar_rumus, df_data, api_key, progress_bar=None, status_teks=None, tulis_sinyal=True):
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


# =====================================================================
# >>> PART 04 : SISTEM ARSIP CERDAS (DATA HARIAN) — LOKAL <<<
# =====================================================================
import tempfile

def _muat_arsip_lokal():
    arsip_files = glob.glob("Arsip_Data_Harian/screener_*.csv")
    arsip_files.sort(reverse=True)
    hasil = []
    for file in arsip_files[:5]:
        date_str = file.split("_")[-1].replace(".csv", "")
        try:
            hasil.append((date_str, pd.read_csv(file)))
        except Exception:
            pass
    return hasil

def muat_arsip():
    return _muat_arsip_lokal()

def get_historical_summary(ticker):
    cols = ["Waktu Update", "Ticker", "Harga (Rp)", "Volume", "Posisi VWAP", "OBV Trend", "Tekanan Bandar", "Fase Siklus Bandar", "Trend MA (5,20,50)"]
    df_list = []
    for date_str, df in muat_arsip():
        try:
            ada_cols = [c for c in cols if c in df.columns]
            temp_df = df[ada_cols]
            temp_df = temp_df[temp_df["Ticker"] == ticker]
            if not temp_df.empty:
                temp_df = temp_df.copy()
                temp_df["Tanggal"] = date_str
                df_list.append(temp_df)
        except Exception:
            pass
    
    if not df_list: return None
    df_history = pd.concat(df_list, ignore_index=True)
    df_history = df_history.sort_values(by=["Tanggal", "Waktu Update"])
    
    summary_text = f"REKAM JEJAK ARSIP HARIAN SAHAM {ticker}:\n\n"
    for date, group in df_history.groupby("Tanggal"):
        open_price = group.iloc[0]["Harga (Rp)"]
        close_price = group.iloc[-1]["Harga (Rp)"]
        max_vol = group["Volume"].max()
        tekanan_akhir = group.iloc[-1]["Tekanan Bandar"]
        siklus = group.iloc[-1]["Fase Siklus Bandar"]
        summary_text += f"📅 {date} | Buka: {open_price} | Tutup: {close_price} | Max Vol Harian: {max_vol} | Tekanan Akhir: {tekanan_akhir} | Siklus Wyckoff: {siklus}\n"
    return summary_text

def get_forensic_data(ticker):
    cols = ["Waktu Update", "Ticker", "Harga (Rp)", "Volume", "Posisi VWAP", "OBV Trend", "Tekanan Bandar", "Fase Siklus Bandar", "Trend MA (5,20,50)", "Status BB", "RVOL (Anomali Vol)"]
    df_list = []
    for date_str, df in muat_arsip():
        try:
            ada_cols = [c for c in cols if c in df.columns]
            temp_df = df[ada_cols]
            temp_df = temp_df[temp_df["Ticker"] == ticker]
            if not temp_df.empty:
                temp_df = temp_df.copy()
                temp_df["Tanggal"] = date_str
                df_list.append(temp_df)
        except Exception:
            pass
    
    if not df_list: return None
    df_history = pd.concat(df_list, ignore_index=True)
    df_history = df_history.sort_values(by=["Tanggal", "Waktu Update"])
    
    tanggal_unik = sorted(df_history["Tanggal"].unique())
    if len(tanggal_unik) > 1:
        tanggal_unik = tanggal_unik[:-1] 
        tanggal_unik = tanggal_unik[-3:] 
    else:
        return "Data historis sebelum hari ini belum tersedia di arsip."
        
    df_history = df_history[df_history["Tanggal"].isin(tanggal_unik)]
    
    summary_text = f"REKAM JEJAK H-3 SEBELUM MELEDAK SAHAM {ticker}:\n"
    for date, group in df_history.groupby("Tanggal"):
        close_price = group.iloc[-1]["Harga (Rp)"]
        max_vol = group["Volume"].max()
        tekanan_akhir = group.iloc[-1]["Tekanan Bandar"]
        siklus = group.iloc[-1]["Fase Siklus Bandar"]
        obv = group.iloc[-1]["OBV Trend"] if "OBV Trend" in group.columns else "N/A"
        rvol = group.iloc[-1]["RVOL (Anomali Vol)"] if "RVOL (Anomali Vol)" in group.columns else "N/A"
        bb = group.iloc[-1]["Status BB"] if "Status BB" in group.columns else "N/A"
        
        summary_text += f"📅 {date} | Tutup: {close_price} | Vol: {max_vol} | Tekanan: {tekanan_akhir} | Siklus: {siklus} | OBV: {obv} | RVOL: {rvol} | BB: {bb}\n"
    return summary_text

# ==========================================
# 📖 HELPER BUKU BESAR & ARSIP HARIAN (TAB 5)
# ==========================================
KEY_LEDGER = os.path.join("Database", "ringkasan_harian.csv.gz")

@st.cache_data(ttl=3600)
def muat_buku_besar():
    # Tanpa R2: buku besar hanya ada lokal jika pernah dibangun (fitur pelengkap)
    try:
        path = os.path.join("Database", "ringkasan_harian.csv.gz")
        if os.path.exists(path):
            return pd.read_csv(path)
    except Exception:
        pass
    return pd.DataFrame()

@st.cache_data(ttl=3600)
def muat_arsip_harian(tanggal):
    try:
        path = os.path.join("Arsip_Data_Harian", f"screener_{tanggal}.csv")
        if os.path.exists(path):
            return pd.read_csv(path)
    except Exception:
        pass
    return pd.DataFrame()

# =====================================================================
# >>> PART 05 : PENGATURAN UI/UX & CSS <<<
# =====================================================================
st.set_page_config(page_title="WEB-SCREENING — AlgoTrade IHSG", layout="wide", initial_sidebar_state="expanded")

st.markdown("""
    <link rel="manifest" href="/static/manifest.json">
    <link rel="apple-touch-icon" href="/static/apple-touch-icon.png">
    <link rel="icon" type="image/x-icon" href="/static/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <meta name="apple-mobile-web-app-title" content="WS Screener">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="theme-color" content="#0f172a">
    <meta name="application-name" content="WEB-SCREENING">
    <script>
      if ("serviceWorker" in navigator) {
        navigator.serviceWorker.register("/static/service-worker.js");
      }
    </script>
""", unsafe_allow_html=True)

st.markdown("""
    <style>
    /* ==========================================
       DESIGN SYSTEM — AlgoTrade Screener
       Konsisten, lega, modern
       ========================================== */
    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap');

    :root {
        --bg-primary: #0f172a;
        --bg-secondary: #1e293b;
        --bg-tertiary: #334155;
        --border-color: #334155;
        --text-primary: #f8fafc;
        --text-secondary: #cbd5e1;
        --text-muted: #94a3b8;
        --accent-blue: #38bdf8;
        --accent-indigo: #3b82f6;
        --success: #22c55e;
        --danger: #ef4444;
        --warning: #eab308;
        --radius-sm: 6px;
        --radius-md: 10px;
        --radius-lg: 14px;
        --shadow-sm: 0 2px 6px rgba(0,0,0,0.2);
        --shadow-md: 0 4px 14px rgba(0,0,0,0.25);
    }

    html, body, [class*="css"] {
        font-family: 'Inter', system-ui, sans-serif;
        color: var(--text-secondary);
    }

    /* ===== TYPOGRAPHY HIERARCHY ===== */
    h1 {
        font-weight: 800;
        font-size: 2.1rem;
        background: linear-gradient(135deg, #38bdf8 0%, #818cf8 100%);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        background-clip: text;
        padding-bottom: 8px;
        margin-bottom: 8px;
        letter-spacing: -0.02em;
    }
    h2, h3 { color: var(--text-primary); font-weight: 700; letter-spacing: -0.01em; }
    h4 { color: var(--text-primary); font-weight: 600; margin-top: 4px; }
    .stMarkdown p { color: var(--text-secondary); line-height: 1.55; }

    /* ===== DATAFRAME (TABEL) — LEGA & MODERN ===== */
    .stDataFrame {
        border-radius: var(--radius-lg);
        overflow: hidden;
        box-shadow: var(--shadow-md);
        border: 1px solid var(--border-color);
    }
    /* Header tabel: tebal, uppercase, accent */
    .stDataFrame thead tr th {
        font-weight: 700 !important;
        font-size: 0.78rem !important;
        text-transform: uppercase;
        letter-spacing: 0.04em;
        background-color: #1e293b !important;
        color: var(--text-primary) !important;
        padding: 12px 14px !important;
        border-bottom: 2px solid var(--accent-blue) !important;
    }
    /* Cell body: lega vertikal & horizontal */
    .stDataFrame tbody td {
        padding: 10px 14px !important;
        font-size: 0.9rem !important;
        border-bottom: 1px solid #2d3b54 !important;
    }
    /* Zebra striping lembut */
    .stDataFrame tbody tr:nth-child(even) { background-color: rgba(30, 41, 59, 0.35); }
    .stDataFrame tbody tr:hover { background-color: rgba(56, 189, 248, 0.08); transition: background 0.15s ease; }
    /* Angka rata kanan */
    .stDataFrame tbody td[data-col="Harga (Rp)"],
    .stDataFrame tbody td[data-col="Volume"],
    .stDataFrame tbody td[data-col="Change (%)"] { text-align: right !important; }

    /* ===== METRIC CONTAINER (Top Gainer/Loser dll) ===== */
    .metric-container {
        border-radius: var(--radius-md);
        padding: 18px 14px;
        text-align: center;
        border: 1px solid var(--border-color);
        background: linear-gradient(145deg, #1e293b 0%, #0f172a 100%);
        color: var(--text-primary);
        margin-bottom: 18px;
        box-shadow: var(--shadow-sm);
        transition: transform 0.2s ease, box-shadow 0.2s ease;
    }
    .metric-container:hover { transform: translateY(-2px); box-shadow: var(--shadow-md); }

    /* ===== CALL-OUT BOXES ===== */
    .bandar-box {
        border-left: 5px solid var(--danger);
        background: linear-gradient(90deg, rgba(239,68,68,0.08) 0%, transparent 100%);
        padding: 14px 16px;
        border-radius: var(--radius-sm);
        margin-bottom: 14px;
        color: var(--text-secondary);
    }
    .bandar-box-green {
        border-left: 5px solid var(--success);
        background: linear-gradient(90deg, rgba(34,197,94,0.08) 0%, transparent 100%);
        padding: 14px 16px;
        border-radius: var(--radius-sm);
        margin-bottom: 14px;
        color: var(--text-secondary);
    }

    /* ===== TABS — KONSISTEN & CLEAR ACTIVE STATE ===== */
    .stTabs [data-baseweb="tab-list"] { gap: 8px; border-bottom: 2px solid var(--bg-tertiary); }
    .stTabs [data-baseweb="tab"] {
        height: 46px;
        font-weight: 600;
        font-size: 0.92rem;
        padding: 0 18px;
        border-radius: var(--radius-sm) var(--radius-sm) 0 0;
        transition: all 0.18s ease;
    }
    .stTabs [aria-selected="true"] {
        background-color: rgba(56, 189, 248, 0.12) !important;
        border-bottom: 3px solid var(--accent-blue) !important;
        color: var(--text-primary) !important;
    }

    /* ===== VIEW MODE CONTAINER ===== */
    .view-mode-container {
        background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);
        padding: 12px 18px;
        border-radius: var(--radius-md);
        margin-bottom: 14px;
        border: 1px solid var(--border-color);
    }

    /* ===== SIDEBAR ===== */
    section[data-testid="stSidebar"] {
        background-color: #0b1426;
        border-right: 1px solid var(--border-color);
    }
    section[data-testid="stSidebar"] .stMarkdown h1 { font-size: 1.1rem; color: var(--accent-blue); }

    /* ===== BUTTONS — SERAGAM ===== */
    .stButton > button {
        border-radius: var(--radius-sm);
        font-weight: 600;
        font-size: 0.88rem;
        transition: all 0.15s ease;
        border: 1px solid var(--border-color);
    }
    .stButton > button:hover {
        border-color: var(--accent-blue);
        background-color: rgba(56, 189, 248, 0.08);
        transform: translateY(-1px);
    }

    /* ===== SELECTBOX & INPUT ===== */
    .stSelectbox, .stNumberInput, .stTextInput {
        margin-bottom: 8px;
    }

    /* ===== EXPANDER ===== */
    .streamlit-expander {
        border-radius: var(--radius-md) !important;
        border: 1px solid var(--border-color) !important;
        overflow: hidden;
    }

    /* ===== SPACING UNIFORM ANTAR SEKSI ===== */
    .stMarkdown hr { margin: 18px 0; border-color: var(--bg-tertiary); }
    .stVerticalBlock > div { gap: 0.6rem; }

    /* ===== ALERT/INFO/WARNING KONSISTEN ===== */
    .stAlert { border-radius: var(--radius-md) !important; }

    /* ===== DOWNLOAD BUTTON ===== */
    .stDownloadButton > button {
        background: linear-gradient(135deg, #1e293b 0%, #0f172a 100%);
        border: 1px solid var(--accent-blue);
        color: var(--accent-blue);
    }
    </style>
""", unsafe_allow_html=True)


# =====================================================================
# >>> PART 06 : LOAD KONFIGURASI JSON (MASTER FILTERS) <<<
# =====================================================================
FILE_CONFIG = "config_web.json"
FILE_PRESET = "preset_kustom.json"
FILE_HASIL = "Database/hasil_screener.csv"
FILE_AKUISISI = "Database/data_akuisisi.csv"

DEFAULT_CONFIG = {
    "MASTER_FILTERS": {
        "Kategori": {"label": "🏢 Kategori Saham", "options": ["Semua", "Big Cap (Lapis 1)", "Mid Cap (Lapis 2)", "Small Cap (Lapis 3)", "Mid Cap (Lapis 2) + Small Cap (Lapis 3)"]},
        "Status Open": {"label": "🌅 Sinyal Open", "options": ["Semua", "Open = Low (Bullish Kuat)", "Open = High (Tekanan Jual)", "Normal"]},
        "Risk/Reward Ratio": {"label": "⚖️ Risk/Reward", "options": ["Semua", "Sangat Menarik (> 1:3)", "Ideal (1:2)", "Menengah (1:1)", "Tidak Ideal (< 1:1)", "Di Area Support"]},
        "Kelas Transaksi": {"label": "💸 Kelas Transaksi", "options": ["Semua", "Sultan (> 50M/hari)", "Ritel Aktif (5M - 50M)", "Gorengan Sepi (< 5M)"]},
        "Sinyal Cuci Barang": {"label": "🧹 Sinyal Shakeout", "options": ["Semua", "Jarum Bawah (Sinyal Pantulan Kuat)", "Normal"]},
        "Valuasi": {"label": "💎 Valuasi Fundamental", "options": ["Semua", "Undervalued (Murah)", "Fair Value (Wajar)", "Overvalued (Mahal)"]},
        "Posisi VWAP": {"label": "⚖️ Posisi thd VWAP", "options": ["Semua", "Di Atas VWAP (Kuat)", "Di Bawah VWAP (Lemah)", "Persis di VWAP"]},
        "Fase Siklus Bandar": {"label": "🔄 Siklus Wyckoff", "options": ["Semua", "Accumulation (Kumpul Barang)", "Mark-Up (Fase Pesta)", "Distribution (Fase Jualan)", "Mark-Down (Fase Runtuh)", "Sideways"]},
        "RVOL (Anomali Vol)": {"label": "🌋 Ledakan Volume", "options": ["Semua", "Ledakan Ekstrem (> 300%)", "Anomali Tinggi (150-300%)", "Normal (50-150%)", "Sepi (< 50%)"]},
        "Karakter Gorengan": {"label": "🕵️ Karakter Saham", "options": ["Semua", "Spesialis Tiang Jemuran (Banting Pucuk)", "Solid (Jarang Dibanting)", "Normal"]},
        "Status Bandar": {"label": "🕵️ Status Bandar", "options": ["Semua", "Akumulasi Kuat", "Distribusi Kuat", "Normal"]},
        "Tekanan Bandar": {"label": "⚔️ Tekanan Harian", "options": ["Semua", "Dominan Beli (Hajar Kanan)", "Dominan Jual (Guyur)", "Seimbang / Adu Mekanik"]},
        "Kekuatan A/D": {"label": "🧠 Smart Money (A/D)", "options": ["Semua", "Akumulasi Pro (Smart Money)", "Distribusi Pro (Guyuran)", "Netral"]},
        "OBV Trend": {"label": "🌊 Tren Uang (OBV)", "options": ["Semua", "Akumulasi (Naik)", "Distribusi (Turun)", "Netral"]},
        "Pola Candle": {"label": "🕯️ Price Action", "options": ["Semua", "Marubozu (Strong Bullish)", "Hammer (Potensi Reversal)", "Doji (Ragu-ragu)", "Normal"]},
        "Posisi Entry": {"label": "🎯 Jarak ke Support", "options": ["Semua", "Dekat Support (Low Risk)", "Area Tengah", "Rawan Pucuk (High Risk)"]},
        "Vol Breakout": {"label": "🔊 Volume", "options": ["Semua", "Tembus MA20", "Normal"]},
        "RSI (14D)": {"label": "📊 RSI (14D)", "options": ["Semua", "> 50 (Bullish)", "<= 50 (Bearish)"]},
        "MA Signal": {"label": "📈 Tren (MA20)", "options": ["Semua", "Uptrend", "Downtrend"]},
        "Momentum": {"label": "⚡ Momentum", "options": ["Semua", "Positif", "Negatif"]},
        "Total Score": {"label": "⭐ Total Score", "options": ["Semua", 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]},
        "Rekomendasi": {"label": "🎯 Rekomendasi", "options": ["Semua", "BELI", "WAIT & SEE"]},
        "Likuiditas": {"label": "💧 Likuiditas", "options": ["Semua", "> 1 Miliar", "< 1 Miliar"]},
        "Status BB": {"label": "🌐 Bollinger Bands", "options": ["Semua", "Squeeze", "Bottom Rebound", "Breakout Upper", "Normal"]},
        "MA Cross": {"label": "🔀 MA Cross (5/20)", "options": ["Semua", "Golden Cross", "Bullish", "Death Cross", "Bearish"]},
        "Risiko": {"label": "⚠️ Risiko Volatilitas", "options": ["Semua", "Tinggi", "Sedang", "Rendah"]},
        "Status Akuisisi": {"label": "🤝 Sentimen Akuisisi", "options": ["Semua", "TIDAK ADA", "RENCANA AKUISISI", "DALAM AKUISISI"]},
        "MACD": {"label": "📈 MACD", "options": ["Semua", "Strong Bullish", "Bullish MACD", "Strong Bearish", "Bearish MACD"]},
        "Status Stochastic": {"label": "🌊 Stochastic", "options": ["Semua", "Oversold (Jenuh Jual - Peluang)", "Golden Cross (Awal Bullish)", "Overbought (Jenuh Beli - Rawan)", "Death Cross (Awal Bearish)", "Netral / Sideways"]},
        "Status Sentimen": {"label": "📰 Sentimen Berita", "options": ["Semua", "Sentimen Positif 📰", "Sentimen Negatif ⚠️", "Netral / Sepi Berita"]},
        "Prediksi Machine Learning": {"label": "🧠 AI Machine Learning", "options": ["Semua", "🔥 ANOMALI BANDAR (Siap Ledakan)", "⚠️ Anomali (Sudah Terbang)", "Biasa / Mengikuti Pasar"]},
        "Kondisi Supply": {"label": "🏜️ Supply & Demand", "options": ["Semua", "Supply Kering (Siap Pump) 🏜️", "Supply Banjir (Distribusi) 🌊", "Normal / Sedang Transisi"]},
        "Status Fibonacci": {"label": "📏 Level Fibonacci", "options": ["Semua", "Golden Rebound Fibo 61.8% (Golden Ratio) 🎯", "Dekat Support Fibo 61.8% (Golden Ratio)", "Golden Rebound Fibo 50.0% 🎯", "Golden Rebound Fibo 38.2% 🎯", "Mengambang (Jauh dari Fibo)"]},
        "Trend MA (5,20,50)": {"label": "🛤️ Tren MA Trio", "options": ["Semua", "Perfect Uptrend (5>20>50)", "Awal Reversal (5>20)", "Strong Downtrend (5<20<50)", "Konsolidasi / Transisi"]},
        "Status Gap": {"label": "🌅 Status Gap", "options": ["Semua", "Gap Up", "Gap Down", "Normal"]},
        "Vol Breakout MA20": {"label": "🔊 Volume Breakout", "options": ["Semua", "Tembus MA20", "Normal"]},
        "Streak Harian": {"label": "🔥 Streak Harian", "options": ["Semua", "Naik Beruntun", "Turun Beruntun", "Sideways / Stagnan"]},
        "Kelas Perubahan": {"label": "📊 Kelas Perubahan", "options": ["Semua", "🚀 ARA (> +10%)", "📈 Naik Kuat (+5% s/d +10%)", "🌿 Naik Tipis (0 s/d +5%)", "💤 Stagnan (0%)", "🔻 Turun Tipis (-5% s/d 0%)", "🩸 Turun Tajam (< -5%)"]}
    }
}

if not os.path.exists(FILE_CONFIG):
    with open(FILE_CONFIG, "w") as f: json.dump(DEFAULT_CONFIG, f, indent=4)
else:
    with open(FILE_CONFIG, "r") as f: cek_config = json.load(f)
    if "Status Fibonacci" not in cek_config.get("MASTER_FILTERS", {}) or "Kelas Perubahan" not in cek_config.get("MASTER_FILTERS", {}):
        # Merge: pertahankan perubahan user, tambah entry baru jika belum ada
        master_lama = cek_config.get("MASTER_FILTERS", {})
        master_gabungan = dict(DEFAULT_CONFIG["MASTER_FILTERS"])
        # Override dengan custom user (label/options lama) bila ada
        for k, v in master_lama.items():
            if k in master_gabungan:
                master_gabungan[k] = v
        cek_config["MASTER_FILTERS"] = master_gabungan
        with open(FILE_CONFIG, "w") as f: json.dump(cek_config, f, indent=4)

with open(FILE_CONFIG, "r") as f: WEB_CONFIG = json.load(f)

if "Mid Cap (Lapis 2) + Small Cap (Lapis 3)" not in WEB_CONFIG["MASTER_FILTERS"]["Kategori"]["options"]:
    WEB_CONFIG["MASTER_FILTERS"]["Kategori"]["options"] = ["Semua", "Big Cap (Lapis 1)", "Mid Cap (Lapis 2)", "Small Cap (Lapis 3)", "Mid Cap (Lapis 2) + Small Cap (Lapis 3)"]
    with open(FILE_CONFIG, "w") as f: json.dump(WEB_CONFIG, f, indent=4)

MASTER_FILTERS = WEB_CONFIG["MASTER_FILTERS"]


# =====================================================================
# >>> PART 07 : LOAD DATA SAHAM (fitur preset dihapus) <<<
# =====================================================================
def manual_override(): pass

def manual_override(): st.session_state.preset_selector = "Matikan Preset (Manual)"

SUMBER_DATA = "❓"

@st.cache_data(ttl=300, show_spinner=False)
def load_data_saham():
    global SUMBER_DATA
    df = None
    SUMBER_DATA = "📁 Lokal"
    if not os.path.exists(FILE_HASIL): return pd.DataFrame()
    try:
        df = pd.read_csv(FILE_HASIL)
    except Exception:
        return pd.DataFrame()

    if os.path.exists(FILE_AKUISISI):
        df_akuisisi = pd.read_csv(FILE_AKUISISI)
        if "Status Akuisisi" in df.columns: df = df.drop(columns=["Status Akuisisi"])
        df = df.merge(df_akuisisi, on="Ticker", how="left")
        df["Status Akuisisi"] = df["Status Akuisisi"].fillna("TIDAK ADA")
    else: df["Status Akuisisi"] = "TIDAK ADA"
    return df

df_hasil = load_data_saham()

if not df_hasil.empty and 'Volume' in df_hasil.columns and 'Harga (Rp)' in df_hasil.columns:
    df_hasil['Value Transaksi'] = df_hasil['Harga (Rp)'] * df_hasil['Volume'] * 100

# ==========================================
# 🧪 MERGE FUNDAMENTAL EXODUS (Stockbit Screener — sesi sendiri, via fetcher_exodus.py)
# Kolom tambahan: Market Cap, PE (TTM), PBV, P/S, Earnings Yield, Dividend Yield,
#                 Piotroski F-Score, EPS Rating, RS Rating, BVPS, PEG
# Sumber: Database/fundamental_exodus.csv lokal.
# ==========================================
KOLOM_FUND_EXODUS = {
    "Market Cap": "Mkt Cap (Exodus)",
    "Current PE Ratio (TTM)": "PE TTM (Exodus)",
    "Current Price to Book Value": "PBV (Exodus)",
    "Current Price to Sales (TTM)": "P/S TTM (Exodus)",
    "Earnings Yield (TTM)": "Earnings Yield",
    "Dividend Yield": "Div Yield",
    "Piotroski F-Score": "F-Score",
    "EPS Rating": "EPS Rating",
    "Relative Strength Rating": "RS Rating",
    "Current Book Value Per Share": "BVPS (Exodus)",
    "PEG Ratio": "PEG",
}

@st.cache_data(ttl=1800, show_spinner=False)
def _muat_fundamental_exodus():
    """Muat CSV fundamental lokal. Return DataFrame (boleh kosong)."""
    fp = os.path.join("Database", "fundamental_exodus.csv")
    if os.path.exists(fp):
        try:
            return pd.read_csv(fp)
        except Exception:
            pass
    return pd.DataFrame()

SUMBER_FUND = ""
try:
    if not df_hasil.empty:
        df_fund = _muat_fundamental_exodus()
        if not df_fund.empty and "Ticker" in df_fund.columns:
            df_fund = df_fund.rename(columns=KOLOM_FUND_EXODUS)
            kolom_baru = [c for c in KOLOM_FUND_EXODUS.values() if c in df_fund.columns]
            df_fund = df_fund[["Ticker"] + kolom_baru].copy()
            df_fund["Ticker"] = df_fund["Ticker"].astype(str).str.upper().str.strip()
            df_hasil["Ticker"] = df_hasil["Ticker"].astype(str).str.upper().str.strip()
            # Numeric-kan agar filter/format web aman
            for c in kolom_baru:
                df_fund[c] = pd.to_numeric(df_fund[c], errors="coerce")
            df_hasil = df_hasil.merge(df_fund, on="Ticker", how="left")
            stempel_fund = df_fund["Diambil"].iloc[0] if "Diambil" in df_fund.columns else "?"
            SUMBER_FUND = f"🧪 Fundamental Exodus: {len(df_fund)} saham (per {stempel_fund})"
        else:
            SUMBER_FUND = "🧪 Fundamental Exodus: belum ada (jalankan fetcher_exodus.py fundamental)"
except Exception as e:
    SUMBER_FUND = f"🧪 Fundamental Exodus: gagal dimuat ({str(e)[:60]})"


# ==========================================
# 🗄️ LAPISAN CACHE 300 DETIK (satu fungsi per sumber)
# Pindah tab instan setelah muat pertama.
# ==========================================
@st.cache_data(ttl=300, show_spinner=False)
def muat_sinyal_arena(rumus_id):
    fs = os.path.join("Database", f"sinyal_ai_rumus_{rumus_id}.csv")
    if not os.path.exists(fs):
        return pd.DataFrame()
    try:
        return pd.read_csv(fs)
    except Exception:
        return pd.DataFrame()

@st.cache_data(ttl=300, show_spinner=False)
def muat_keranjang_radar(stempel_now, versi_sidang):
    """Baca cache_autopilot.json + sinyal per arena (Radar Live). Ter-cache ttl 300."""
    try:
        fp = os.path.join("Database", "cache_autopilot.json")
        if os.path.exists(fp):
            with open(fp) as f:
                cm = json.load(f)
            if cm.get("versi") == versi_sidang and cm.get("keranjang") and cm.get("stempel_data") == stempel_now:
                return cm["keranjang"], "cache_cocok"
    except Exception:
        pass
    ker, ada = {}, False
    for i in range(1, 10):
        fs = f"Database/sinyal_ai_rumus_{i}.csv"
        if os.path.exists(fs):
            try:
                ds = pd.read_csv(fs)
                ker[f"RUMUS {i}"] = (ds["Ticker"].tolist() + ["", "", "", "", ""])[:5]
                ada = True
            except Exception:
                ker[f"RUMUS {i}"] = ["", "", "", "", ""]
        else:
            ker[f"RUMUS {i}"] = ["", "", "", "", ""]
    return (ker if ada else None), "sinyal"


# =====================================================================
# >>> PART 08 : HEADER & SIDEBAR <<<
# =====================================================================
if not df_hasil.empty and "Terakhir Update" in df_hasil.columns:
    waktu_update = str(df_hasil["Terakhir Update"].iloc[0]) + " WIB"
    st.sidebar.markdown(f"""
        <div style="border: 2px solid #06b6d4; padding: 10px; border-radius: 4px; text-align: center; margin-bottom: 15px; background-color: #0f172a; box-shadow: 0 4px 6px rgba(0,0,0,0.3);">
            <span style="font-size: 12px; color: #94a3b8; font-weight: 600;">Waktu Terakhir Update:</span><br>
            <strong style="color: #06b6d4; font-size: 14px;">{waktu_update}</strong>
        </div>
    """, unsafe_allow_html=True)

st.sidebar.caption(f"📡 Sumber Data: {SUMBER_DATA}")
if SUMBER_FUND:
    st.sidebar.caption(SUMBER_FUND)
st.sidebar.caption("📱 WEB-SCREENING v1.0.0 · PWA ready")

# ==========================================
# USER LOGIN / REGISTER (pembeda antar pengguna)
# ==========================================
USER_DB = "Database/users.json"
if not os.path.exists(USER_DB):
    os.makedirs("Database", exist_ok=True)
    with open(USER_DB, "w") as f:
        json.dump({"users": {}}, f)

def _muat_users():
    try:
        with open(USER_DB) as f:
            return json.load(f).get("users", {})
    except:
        return {}

def _simpan_users(users):
    with open(USER_DB, "w") as f:
        json.dump({"users": users}, f, indent=2)

st.sidebar.markdown("---")
st.sidebar.markdown("### 👤 Akun")

if "username" not in st.session_state:
    st.session_state.username = None

if st.session_state.username is None:
    tab_login, tab_daftar = st.sidebar.tabs(["🔑 Login", "📝 Daftar"])
    with tab_login:
        u = st.text_input("Username", max_chars=20, key="login_user")
        p = st.text_input("PIN (6 digit)", type="password", max_chars=6, key="login_pin")
        if st.button("Login", key="btn_login", use_container_width=True):
            users = _muat_users()
            if u in users and users[u] == p:
                st.session_state.username = u
                st.rerun()
            else:
                st.error("Username/PIN salah")
    with tab_daftar:
        u2 = st.text_input("Username baru", max_chars=20, key="daftar_user")
        p2 = st.text_input("PIN baru (6 digit)", type="password", max_chars=6, key="daftar_pin")
        if st.button("Daftar", key="btn_daftar", use_container_width=True):
            users = _muat_users()
            if not u2 or len(u2) < 3:
                st.error("Username minimal 3 karakter")
            elif u2 in users:
                st.error("Username sudah ada")
            elif len(p2) != 6 or not p2.isdigit():
                st.error("PIN harus 6 digit angka")
            else:
                users[u2] = p2
                _simpan_users(users)
                st.session_state.username = u2
                st.rerun()
else:
    st.sidebar.success(f"👤 {st.session_state.username}")
    if st.sidebar.button("🔒 Logout", key="btn_logout", use_container_width=True):
        st.session_state.username = None
        st.rerun()
    with st.sidebar.expander("🔄 Ganti PIN", expanded=False):
        pin_lama = st.text_input("PIN Lama", type="password", max_chars=6, key="ganti_pin_lama")
        pin_baru = st.text_input("PIN Baru (6 digit)", type="password", max_chars=6, key="ganti_pin_baru")
        if st.button("Simpan", key="simpan_pin", use_container_width=True):
            users = _muat_users()
            u = st.session_state.username
            if pin_lama == users.get(u) and len(pin_baru) == 6 and pin_baru.isdigit():
                users[u] = pin_baru
                _simpan_users(users)
                st.success("PIN berhasil diganti!")
                st.rerun()
            else:
                st.error("PIN lama salah / format salah")

if st.sidebar.button("🔃 Sync & Muat Ulang Data Server", use_container_width=True):
    with st.spinner("Memuat data terbaru..."):
        time.sleep(1)
    st.cache_data.clear()
    st.rerun()

if st.sidebar.button("🔄 Refresh Sekarang", use_container_width=True, help="Bersihkan cache tampilan agar data terbaru termuat tanpa pindah tab."):
    st.cache_data.clear()
    st.rerun()

st.title("⚡ AlgoTrade Screener - IHSG Ultimate")
st.markdown("Detektor Jejak Bandar, Anomali Volume, & Strategi BSJP.")
st.markdown("---")


# =====================================================================
# >>> PART 09 : FORMATTER & PEWARNAAN TABEL + TABEL STRATEGI <<<
# =====================================================================
def format_skor(s): return "⭐" * int(s) if pd.notna(s) and int(s) > 0 else "-"
def format_pct(v): return f"{'▲ ' if v > 0 else '▼ '}{v:+.2f}%" if pd.notna(v) and v != 0 else "0.00%"
def format_mom(v): return "▲ Positif" if v == "Positif" else ("▼ Negatif" if v == "Negatif" else v)
def format_desimal(v): return f"{v:.2f}" if pd.notna(v) and v != 0 else "-"
def format_angka(v): return f"{int(v):,}".replace(",", ".") if pd.notna(v) else "-"

def format_singkat_vol(v):
    if pd.isna(v): return "-"
    if v >= 1_000_000: return f"{v/1_000_000:.2f} M Lot"
    elif v >= 1_000: return f"{v/1_000:.2f} K Lot"
    return f"{v:.0f} Lot"

def format_singkat_rp(v):
    if pd.isna(v) or v == 0: return "-"
    if v >= 1_000_000_000_000: return f"🔥 Rp {v/1_000_000_000_000:.2f} T"
    elif v >= 1_000_000_000: return f"💰 Rp {v/1_000_000_000:.2f} M"
    elif v >= 1_000_000: return f"🪙 Rp {v/1_000_000:.2f} Jt"
    return f"Rp {v:,.0f}".replace(",", ".")

def warna_tabel(val):
    if isinstance(val, (int, float)): 
        return 'color: #22c55e; font-weight: 600;' if val > 0 else ('color: #ef4444; font-weight: 600;' if val < 0 else '')
    elif isinstance(val, str):
        if any(x in val for x in ["Positif", "Uptrend", "BELI", "Breakout Upper", "Bottom Rebound", "DALAM AKUISISI", "Rendah", "▲", "Golden Cross", "Bullish", "Tembus MA20", "Akumulasi", "Big Cap", "Gap Up", "Dominan Beli", "Undervalued", "Marubozu", "Dekat Support", "Hammer", "Di Atas VWAP", "Sultan", "Ledakan Ekstrem", "Solid", "Mark-Up", "Jarum Bawah", "Naik", "Open = Low", "Sangat Menarik", "Perfect Uptrend", "Awal Reversal", "Acc"]): return 'color: #22c55e; font-weight: 600;'
        elif any(x in val for x in ["Negatif", "Downtrend", "WAIT & SEE", "Tinggi", "▼", "Death Cross", "Bearish", "Distribusi", "Small Cap", "Gap Down", "Dominan Jual", "Overvalued", "Rawan Pucuk", "Di Bawah VWAP", "Gorengan Sepi", "Sepi", "Tiang Jemuran", "Mark-Down", "Turun", "Open = High", "Tidak Ideal", "Strong Downtrend", "Dist", "Token Mati", "Gagal", "Timeout"]): return 'color: #ef4444; font-weight: 600;'
        elif val == "> 1 Miliar": return 'color: #3b82f6; font-weight: 600;'
        elif any(x in val for x in ["Squeeze", "RENCANA AKUISISI", "Sedang", "Mid Cap", "Seimbang", "Fair Value", "Area Tengah", "Doji", "Ritel Aktif", "Anomali", "Accumulation", "Sideways", "Ideal", "Menengah", "Konsolidasi / Transisi", "Neutral"]): return 'color: #eab308; font-weight: 600;'
        elif "⭐" in val: return 'color: #22c55e;' if len(val) >= 6 else 'color: #ef4444;'
    return ''

def render_strategy_table(df_subset, file_name):
    if not df_subset.empty:
        sort_cols = [c for c in ['Total Score', 'Volume'] if c in df_subset.columns]
        if sort_cols: df_subset = df_subset.sort_values(by=sort_cols, ascending=[False, False]).reset_index(drop=True)
        if "Total Score" in df_subset.columns: df_subset["Total Score"] = df_subset["Total Score"].apply(format_skor)

        kolom_utama = ["Ticker", "Harga (Rp)", "Change (%)", "Value Transaksi", "Volume", "Total Score", "Auto Trading Plan"]
        kolom_tambahan = ["Kelas Transaksi", "Broksum", "Trend MA (5,20,50)", "RVOL (Anomali Vol)", "Tekanan Bandar", "Status Bandar", "Kekuatan A/D", "Sinyal Cuci Barang", "Status BB", "MA Signal"]
        kolom_tampil = [c for c in kolom_utama + kolom_tambahan if c in df_subset.columns]

        styler = df_subset[kolom_tampil].style.format({
            "Harga (Rp)": format_angka, 
            "Volume": format_angka, 
            "Change (%)": format_pct,
            "Value Transaksi": format_singkat_rp
        })
        subset_warna = [c for c in kolom_tampil if c not in ["Ticker", "Auto Trading Plan"]]
        tabel_jadi = styler.map(warna_tabel, subset=subset_warna) if hasattr(styler, 'map') else styler.applymap(warna_tabel, subset=subset_warna)

        st.dataframe(tabel_jadi, use_container_width=True, hide_index=True)

        c1, c2 = st.columns([1, 1])
        buffer = io.BytesIO()
        with pd.ExcelWriter(buffer, engine='openpyxl') as writer: tabel_jadi.to_excel(writer, index=False, sheet_name='Screener')
        c1.download_button(label=f"📥 Download {file_name} (Excel)", data=buffer.getvalue(), file_name=f"{file_name}.xlsx", mime="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", key=f"dl_{file_name}")
        with c2:
            st.empty()
    else: st.info("🔍 Belum ada pergerakan saham yang memenuhi kriteria strategi ini pada sesi saat ini.")


# =====================================================================
# >>> PART 10 : TAB 2 - MARKET OVERVIEW <<<
# =====================================================================
if not df_hasil.empty:
    tab1, tab2, tab3, tab4, tab5, tab6 = st.tabs([
        "🏠 Beranda",
        "📊 Market Overview",
        "📌 Screener Utama",
        "🤖 Asisten AI Spesial",
        "💼 Portofolio Bot",
        "🕵️ Detektif Ledakan & Chat"
    ])
    
    with tab1:
        st.markdown("# 🏠 Beranda — WEB-SCREENING")
        st.caption(f"v1.0.0 · Data diperbarui setiap 5 menit (hari bursa)")

        col_intro, col_stat = st.columns([2, 1])
        with col_intro:
            st.markdown("""
### 📋 Tentang Aplikasi Ini
**WEB-SCREENING** adalah screener saham IHSG berbasis data publik & indikator teknikal.
Bukan rekomendasi investasi — semua portfolio adalah **simulator edukasi** (uang virtual).

### ⚠️ Keterbatasan yang Wajib Kamu Tahu
1. **Data delay ±15 menit** dari harga real-time bursa (sumber: Yahoo Finance)
2. **Volume & broker summary** butuh token Stockbit yang diperbarui manual (~24 jam)
3. **Fundamental Exodus** hanya update sekali sehari (~16:15 WIB)
4. **Tidak terhubung ke akun broker** — semua transaksi adalah simulasi
5. **Tidak ada eksekusi trade otomatis** — beli/jual manual via tombol
6. **Indikator teknikal** dihitung dari data harian (daily candle)
7. **Sabtu/Minggu** tidak ada update data (bursa tutup)

### 🔒 Keamanan
- Tidak menyimpan data pribadi pengguna
- Tidak ada login/registrasi
- Portfolio = simulator, bukan akun riil
- Tidak ada cookie tracking
            """)

        with col_stat:
            total = len(df_hasil) if hasattr(df_hasil, "__len__") else 0
            naik = len(df_hasil[df_hasil['Change (%)'] > 0]) if 'Change (%)' in df_hasil.columns and not df_hasil.empty else 0
            turun = len(df_hasil[df_hasil['Change (%)'] < 0]) if 'Change (%)' in df_hasil.columns and not df_hasil.empty else 0
            st.metric("📈 Saham Dipantau", total)
            st.metric("🚀 Naik", naik)
            st.metric("🔻 Turun", turun)
            st.caption("Update: " + (str(df_hasil["Terakhir Update"].iloc[0]) if not df_hasil.empty and "Terakhir Update" in df_hasil.columns else "-") + " WIB")

        st.markdown("---")
        st.markdown("### ⚡ Menu Cepat")
        c1, c2, c3, c4 = st.columns(4)
        with c1: st.markdown("📊 Market Overview → tab di atas")
        with c2: st.markdown("📌 Screener → tab di atas")
        with c3: st.markdown("🤖 Asisten AI → tab di atas")
        with c4: st.markdown("💼 Portofolio → tab di atas")

        st.markdown("---")
        with st.expander("📱 Install Aplikasi (PWA)", expanded=False):
            st.markdown("""
- **Android:** Chrome → ⋮ → Add to Home Screen
- **iPhone:** Safari → Share → Add to Home Screen
- **Windows:** Edge/Chrome → Install icon di address bar
- Update otomatis: cukup refresh app — tidak perlu download ulang
""")
    
    with tab2:
        st.markdown("### 📊 Ringkasan Pasar IHSG")
        
        total_saham = len(df_hasil)
        saham_naik = len(df_hasil[df_hasil['Change (%)'] > 0]) if 'Change (%)' in df_hasil.columns else 0
        saham_turun = len(df_hasil[df_hasil['Change (%)'] < 0]) if 'Change (%)' in df_hasil.columns else 0
        saham_stagnan = total_saham - saham_naik - saham_turun
        
        if 'Turnover' not in df_hasil.columns:
            if 'Volume' in df_hasil.columns and 'Harga (Rp)' in df_hasil.columns:
                df_hasil['Turnover'] = df_hasil['Harga (Rp)'] * df_hasil['Volume'] * 100
            else:
                df_hasil['Turnover'] = 0

        if saham_naik > (saham_turun * 1.5): sentimen_teks, warna_sentimen = "🔥 Sangat Bullish", "#4ade80"
        elif saham_turun > (saham_naik * 1.5): sentimen_teks, warna_sentimen = "🩸 Sangat Bearish", "#f87171"
        else: sentimen_teks, warna_sentimen = "⚖️ Konsolidasi (Ragu)", "#facc15"
                
        m1, m2, m3, m4, m5 = st.columns(5)
        m1.markdown(f"<div class='metric-container'><h3>🔍 Total Saham</h3><h2>{total_saham}</h2></div>", unsafe_allow_html=True)
        m2.markdown(f"<div class='metric-container'><h3>🟢 Menguat</h3><h2 style='color: #4ade80;'>{saham_naik}</h2></div>", unsafe_allow_html=True)
        m3.markdown(f"<div class='metric-container'><h3>🔴 Melemah</h3><h2 style='color: #f87171;'>{saham_turun}</h2></div>", unsafe_allow_html=True)
        m4.markdown(f"<div class='metric-container'><h3>⚪ Stagnan</h3><h2 style='color: #94a3b8;'>{saham_stagnan}</h2></div>", unsafe_allow_html=True)
        m5.markdown(f"<div class='metric-container'><h3>🧭 Sentimen Pasar</h3><h3 style='color: {warna_sentimen}; margin-top:5px;'>{sentimen_teks}</h3></div>", unsafe_allow_html=True)
        
        st.markdown("---")
        
        c1, c2 = st.columns(2)
        c3, c4 = st.columns(2)

        def render_top_table(df_top, cols, format_dict):
            styler = df_top[cols].style.format(format_dict)
            tabel_warna = styler.map(warna_tabel, subset=['Change (%)']) if hasattr(styler, 'map') else styler.applymap(warna_tabel, subset=['Change (%)'])
            st.dataframe(tabel_warna, use_container_width=True, hide_index=True)

        with c1:
            st.markdown("#### 🔥 Top Gainers")
            if 'Change (%)' in df_hasil.columns:
                df_gainer = df_hasil.nlargest(10, 'Change (%)')
                render_top_table(df_gainer, ['Ticker', 'Harga (Rp)', 'Change (%)'], {'Harga (Rp)': format_angka, 'Change (%)': format_pct})
            
        with c2:
            st.markdown("#### 🩸 Top Losers")
            if 'Change (%)' in df_hasil.columns:
                df_loser = df_hasil.nsmallest(10, 'Change (%)')
                render_top_table(df_loser, ['Ticker', 'Harga (Rp)', 'Change (%)'], {'Harga (Rp)': format_angka, 'Change (%)': format_pct})
            
        st.markdown("<br>", unsafe_allow_html=True)
            
        with c3:
            st.markdown("#### 🌊 Top Volume")
            if 'Volume' in df_hasil.columns:
                df_vol = df_hasil.nlargest(10, 'Volume')
                render_top_table(df_vol, ['Ticker', 'Harga (Rp)', 'Volume', 'Change (%)'], {'Harga (Rp)': format_angka, 'Volume': format_singkat_vol, 'Change (%)': format_pct})
            
        with c4:
            st.markdown("#### 💰 Top Value (Turnover)")
            if 'Turnover' in df_hasil.columns:
                df_val = df_hasil.nlargest(10, 'Turnover')
                render_top_table(df_val, ['Ticker', 'Harga (Rp)', 'Turnover', 'Change (%)'], {'Harga (Rp)': format_angka, 'Turnover': format_singkat_rp, 'Change (%)': format_pct})


# =====================================================================
# >>> PART 11 : TAB 3 - SCREENER UTAMA <<<
# =====================================================================
    with tab3:
        def reset_semua_filter():
            for k, info in MASTER_FILTERS.items():
                if f"main_{k}" in st.session_state:
                    st.session_state[f"main_{k}"] = info["options"][0]
            st.session_state["pencarian_ticker"] = ""
            st.session_state["pencarian_broker"] = ""
            st.session_state["batas_harga_min"] = 0
            st.session_state["batas_harga_max"] = 0

        # ==========================================
        # DEFINISI GRUP FILTER (untuk layout rapih)
        # ==========================================
        GRUP_FILTER = [
            ("🏢 Fundamental & Likuiditas", ["Kategori", "Valuasi", "Kelas Transaksi", "Likuiditas", "Status Akuisisi", "Status Sentimen"]),
            ("📈 Teknikal Klasik", ["RSI (14D)", "MA Signal", "Trend MA (5,20,50)", "MA Cross", "MACD", "Momentum", "Status Stochastic", "Status BB"]),
            ("🎯 Entry, Exit & Risiko", ["Risk/Reward Ratio", "Posisi Entry", "Status Open", "Status Gap", "Sinyal Cuci Barang", "Pola Candle", "Status Fibonacci", "Risiko"]),
            ("🕵️ Bandarmologi & Volume", ["Status Bandar", "Tekanan Bandar", "OBV Trend", "Kekuatan A/D", "Posisi VWAP", "RVOL (Anomali Vol)", "Karakter Gorengan", "Vol Breakout", "Vol Breakout MA20"]),
            ("🌊 Siklus & Behavior", ["Fase Siklus Bandar", "Kondisi Supply", "Streak Harian", "Kelas Perubahan", "Prediksi Machine Learning", "Total Score", "Rekomendasi"])
        ]

        with st.expander("🛠️ Buka Panel Filter Lengkap (Dikelompokkan)", expanded=False):
            st.button("🔄 Reset Semua Filter ke Bawaan (Semua)", on_click=reset_semua_filter, use_container_width=True)

            # Helper render 1 grup pakai 3 kolom
            def _render_grup(nama_grup, daftar_key, col_count=3):
                st.markdown(f"**{nama_grup}**")
                cols = st.columns(col_count)
                hasil = {}
                for idx, db_key in enumerate(daftar_key):
                    if db_key not in MASTER_FILTERS:
                        continue
                    info = MASTER_FILTERS[db_key]
                    with cols[idx % col_count]:
                        val_sekarang = st.session_state.get(f"main_{db_key}", info["options"][0])
                        idx_opsi = info["options"].index(val_sekarang) if val_sekarang in info["options"] else 0
                        hasil[db_key] = st.selectbox(info["label"], info["options"], index=idx_opsi, key=f"main_{db_key}", on_change=manual_override)
                return hasil

            st.markdown("---")
            filter_terpilih = {}
            for nama_grup, daftar_key in GRUP_FILTER:
                filter_terpilih.update(_render_grup(nama_grup, daftar_key, col_count=3))
                st.markdown("")

            # ==========================================
            # FILTER RANGE NUMERIK (PER, PBV, Volume, Change %)
            # ==========================================
            st.markdown("**🔢 Filter Numerik (Range)**")
            nr1, nr2, nr3, nr4 = st.columns(4)
            with nr1:
                per_min = st.number_input("PER Min", min_value=0.0, value=0.0, step=0.1, key="nr_per_min")
                per_max = st.number_input("PER Maks", min_value=0.0, value=0.0, step=0.1, key="nr_per_max")
            with nr2:
                pbv_min = st.number_input("PBV Min", min_value=0.0, value=0.0, step=0.1, key="nr_pbv_min")
                pbv_max = st.number_input("PBV Maks", min_value=0.0, value=0.0, step=0.1, key="nr_pbv_max")
            with nr3:
                vol_min = st.number_input("Volume Min", min_value=0, value=0, step=10000, key="nr_vol_min")
                vol_max = st.number_input("Volume Maks", min_value=0, value=0, step=100000, key="nr_vol_max")
            with nr4:
                chg_min = st.number_input("Change % Min", value=0.0, step=0.5, key="nr_chg_min")
                chg_max = st.number_input("Change % Maks", value=0.0, step=0.5, key="nr_chg_max")

            st.markdown("**💎 Fundamental Exodus (Range)**")
            fe1, fe2, fe3, fe4 = st.columns(4)
            with fe1:
                mktcap_min = st.number_input("Market Cap Min (T)", min_value=0.0, value=0.0, step=0.1, key="fe_mktcap_min", help="Dalam triliun rupiah")
                ps_min = st.number_input("P/S Min", min_value=0.0, value=0.0, step=0.1, key="fe_ps_min")
                ey_min = st.number_input("Earnings Yield Min (%)", min_value=0.0, value=0.0, step=0.5, key="fe_ey_min")
            with fe2:
                pettm_min = st.number_input("PE TTM Min", min_value=0.0, value=0.0, step=1.0, key="fe_pettm_min")
                ps_max = st.number_input("P/S Maks", min_value=0.0, value=0.0, step=0.1, key="fe_ps_max")
                div_min = st.number_input("Div Yield Min (%)", min_value=0.0, value=0.0, step=0.5, key="fe_div_min")
            with fe3:
                pbvex_min = st.number_input("PBV Exodus Min", min_value=0.0, value=0.0, step=0.1, key="fe_pbvex_min")
                peg_max = st.number_input("PEG Maks", min_value=0.0, value=0.0, step=0.1, key="fe_peg_max")
                bvps_min = st.number_input("BVPS Min", min_value=0.0, value=0.0, step=100.0, key="fe_bvps_min")
            with fe4:
                fscore_min = st.selectbox("F-Score Min", ["Semua","≥3","≥5","≥7","≥9"], key="fe_fscore")
                epsr_min = st.number_input("EPS Rating Min", min_value=0, value=0, step=1, key="fe_epsr_min")
                rsr_min = st.number_input("RS Rating Min", min_value=0, value=0, step=1, key="fe_rsr_min")
            st.markdown("")

        col_search, col_broker, col_min, col_max = st.columns([1.5, 1.5, 1, 1])
        with col_search: 
            search_ticker = st.text_input("🔍 Cari Kode Saham", "", placeholder="Contoh: BBCA", key="pencarian_ticker")
        with col_broker: 
            search_broker = st.text_input("👤 Cari Kode Broker", "", placeholder="Contoh: MG / YP", key="pencarian_broker")
        with col_min: 
            min_price = st.number_input("⬇️ Harga Minimal (Rp)", min_value=0, value=0, step=10, key="batas_harga_min")
        with col_max: 
            max_price = st.number_input("⬆️ Harga Maksimal (Rp)", min_value=0, value=0, step=10, key="batas_harga_max")

        df_filtered = df_hasil.copy()
        
        if search_ticker: 
            df_filtered = df_filtered[df_filtered["Ticker"].astype(str).str.contains(search_ticker.upper(), na=False)]
            
        if search_broker and "Broksum" in df_filtered.columns: 
            df_filtered = df_filtered[df_filtered["Broksum"].astype(str).str.contains(search_broker.upper(), na=False)]
            
        if min_price > 0:
            df_filtered = df_filtered[df_filtered["Harga (Rp)"] >= min_price]
        if max_price > 0:
            df_filtered = df_filtered[df_filtered["Harga (Rp)"] <= max_price]

        # ==========================================
        # APPLY FILTER RANGE NUMERIK
        # ==========================================
        if per_min > 0 and "PER (x)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PER (x)"], errors="coerce") >= per_min]
        if per_max > 0 and "PER (x)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PER (x)"], errors="coerce") <= per_max]
        if pbv_min > 0 and "PBV (x)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PBV (x)"], errors="coerce") >= pbv_min]
        if pbv_max > 0 and "PBV (x)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PBV (x)"], errors="coerce") <= pbv_max]
        if vol_min > 0 and "Volume" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Volume"], errors="coerce") >= vol_min]
        if vol_max > 0 and "Volume" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Volume"], errors="coerce") <= vol_max]
        if chg_min != 0 and "Change (%)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Change (%)"], errors="coerce") >= chg_min]
        if chg_max != 0 and "Change (%)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Change (%)"], errors="coerce") <= chg_max]

        # ==========================================
        # APPLY FUNDAMENTAL EXODUS RANGE
        # ==========================================
        if mktcap_min > 0 and "Mkt Cap (Exodus)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Mkt Cap (Exodus)"], errors="coerce") >= mktcap_min * 1e12]
        if pettm_min > 0 and "PE TTM (Exodus)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PE TTM (Exodus)"], errors="coerce") >= pettm_min]
        if pbvex_min > 0 and "PBV (Exodus)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PBV (Exodus)"], errors="coerce") >= pbvex_min]
        if ps_min > 0 and "P/S TTM (Exodus)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["P/S TTM (Exodus)"], errors="coerce") >= ps_min]
        if ps_max > 0 and "P/S TTM (Exodus)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["P/S TTM (Exodus)"], errors="coerce") <= ps_max]
        if ey_min > 0 and "Earnings Yield" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Earnings Yield"], errors="coerce") >= ey_min]
        if div_min > 0 and "Div Yield" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["Div Yield"], errors="coerce") >= div_min]
        if peg_max > 0 and "PEG" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["PEG"], errors="coerce") <= peg_max]
        if bvps_min > 0 and "BVPS (Exodus)" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["BVPS (Exodus)"], errors="coerce") >= bvps_min]
        if fscore_min != "Semua" and "F-Score" in df_filtered.columns:
            ambang = int(fscore_min.replace("≥", ""))
            df_filtered = df_filtered[pd.to_numeric(df_filtered["F-Score"], errors="coerce") >= ambang]
        if epsr_min > 0 and "EPS Rating" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["EPS Rating"], errors="coerce") >= epsr_min]
        if rsr_min > 0 and "RS Rating" in df_filtered.columns:
            df_filtered = df_filtered[pd.to_numeric(df_filtered["RS Rating"], errors="coerce") >= rsr_min]
        
        # ==========================================
        # APPLY FILTER (handle field baru = string match)
        # ==========================================
        # Daftar field yang pakai string match (bukan exact equality)
        MATCH_CONTAINS_FIELDS = {
            "Streak Harian": {"Naik Beruntun": "Naik", "Turun Beruntun": "Turun", "Sideways / Stagnan": "Sideways"},
            "Status Gap": {"Gap Up": "Gap Up", "Gap Down": "Gap Down", "Normal": "Normal"},
            "Kelas Perubahan": {
                "🚀 ARA (> +10%)": "ara_10",
                "📈 Naik Kuat (+5% s/d +10%)": "up_5_10",
                "🌿 Naik Tipis (0 s/d +5%)": "up_0_5",
                "💤 Stagnan (0%)": "stag",
                "🔻 Turun Tipis (-5% s/d 0%)": "dn_5_0",
                "🩸 Turun Tajam (< -5%)": "dn_lt5"
            }
        }
        
        for db_key, nilai in filter_terpilih.items():
            if nilai == "Semua":
                continue
            if db_key == "RSI (14D)":
                if "RSI (14D)" in df_filtered.columns:
                    df_filtered = df_filtered[df_filtered["RSI (14D)"] > 50] if "Bullish" in nilai else df_filtered[df_filtered["RSI (14D)"] <= 50]
                continue
            if db_key == "Total Score":
                if "Total Score" in df_filtered.columns:
                    df_filtered = df_filtered[df_filtered["Total Score"] == int(nilai)]
                continue
            if db_key == "Kategori" and nilai == "Mid Cap (Lapis 2) + Small Cap (Lapis 3)":
                if "Kategori" in df_filtered.columns:
                    df_filtered = df_filtered[df_filtered["Kategori"].isin(["Mid Cap (Lapis 2)", "Small Cap (Lapis 3)"])]
                continue
            if db_key == "Vol Breakout MA20":
                if "Vol Breakout" in df_filtered.columns:
                    df_filtered = df_filtered[df_filtered["Vol Breakout"] == nilai]
                continue
            if db_key == "Streak Harian":
                if "Streak Harian" in df_filtered.columns:
                    pola = MATCH_CONTAINS_FIELDS["Streak Harian"].get(nilai, "")
                    if pola:
                        df_filtered = df_filtered[df_filtered["Streak Harian"].astype(str).str.contains(pola, na=False, case=False)]
                continue
            if db_key == "Status Gap":
                if "Status Gap" in df_filtered.columns:
                    pola = MATCH_CONTAINS_FIELDS["Status Gap"].get(nilai, "")
                    if pola:
                        df_filtered = df_filtered[df_filtered["Status Gap"].astype(str).str.contains(pola, na=False, case=False)]
                continue
            if db_key == "Kelas Perubahan":
                if "Change (%)" in df_filtered.columns:
                    chg = pd.to_numeric(df_filtered["Change (%)"], errors="coerce")
                    if nilai == "🚀 ARA (> +10%)":
                        df_filtered = df_filtered[chg > 10]
                    elif nilai == "📈 Naik Kuat (+5% s/d +10%)":
                        df_filtered = df_filtered[(chg >= 5) & (chg <= 10)]
                    elif nilai == "🌿 Naik Tipis (0 s/d +5%)":
                        df_filtered = df_filtered[(chg > 0) & (chg < 5)]
                    elif nilai == "💤 Stagnan (0%)":
                        df_filtered = df_filtered[chg == 0]
                    elif nilai == "🔻 Turun Tipis (-5% s/d 0%)":
                        df_filtered = df_filtered[(chg <= 0) & (chg >= -5)]
                    elif nilai == "🩸 Turun Tajam (< -5%)":
                        df_filtered = df_filtered[chg < -5]
                continue
            if db_key in df_filtered.columns: 
                df_filtered = df_filtered[df_filtered[db_key] == nilai]

        if not df_filtered.empty:
            st.caption(f"Menampilkan **{len(df_filtered)}** saham yang lolos filter dari total **{len(df_hasil)}** saham.")
            st.markdown("<div class='view-mode-container'>", unsafe_allow_html=True)
            mode_tampilan = st.radio("👁️ Pilih Mode Tampilan Tabel:", ["🚀 Ringkasan Cepat", "👤 Bandarmologi & Wyckoff", "📈 Teknikal & Support", "💎 Fundamental & Likuiditas", "🌌 Tampilkan Semua Kolom"], horizontal=True)
            st.markdown("</div>", unsafe_allow_html=True)
            
            cp1, cp2, cp3 = st.columns([1, 1, 2])
            with cp1: per_hal = st.selectbox("Tampilkan baris:", [20, 50, 100])
            tot_hal = int(np.ceil(len(df_filtered) / per_hal))
            with cp2: hal_aktif = st.selectbox("Halaman:", range(1, tot_hal + 1)) if tot_hal > 0 else 1
                    
            idx_awal = (hal_aktif - 1) * per_hal
            df_tampil = df_filtered.iloc[idx_awal : idx_awal + per_hal].copy()
            if "Total Score" in df_tampil.columns: df_tampil["Total Score"] = df_tampil["Total Score"].apply(format_skor)
            
            kolom_ringkasan = ["Ticker", "Harga (Rp)", "Change (%)", "Value Transaksi", "Volume", "Broksum", "Rekomendasi", "Status Open", "Posisi VWAP", "Total Score", "Auto Trading Plan"]
            kolom_bandar = ["Ticker", "Harga (Rp)", "Change (%)", "Value Transaksi", "Broksum", "Fase Siklus Bandar", "Kekuatan A/D", "Status Bandar", "RVOL (Anomali Vol)", "Karakter Gorengan", "Tekanan Bandar", "OBV Trend", "Kondisi Supply", "Prediksi Machine Learning"]
            kolom_teknikal = ["Ticker", "Harga (Rp)", "Change (%)", "Value Transaksi", "Auto Trading Plan", "Risk/Reward Ratio", "Status Fibonacci", "Sinyal Cuci Barang", "Posisi Entry", "Pola Candle", "Trend MA (5,20,50)", "MA Signal", "Status BB", "RSI (14D)", "MACD", "Status Stochastic"]
            kolom_fundamental = ["Ticker", "Harga (Rp)", "Value Transaksi", "Kategori", "Valuasi", "PER (x)", "PBV (x)", "Kelas Transaksi", "Likuiditas", "Status Sentimen",
                                 "Mkt Cap (Exodus)", "PE TTM (Exodus)", "PBV (Exodus)", "P/S TTM (Exodus)", "Earnings Yield", "Div Yield", "F-Score", "EPS Rating", "RS Rating", "BVPS (Exodus)", "PEG"]
            kolom_semua = ["Ticker", "Value Transaksi", "Broksum", "Status Open", "Risk/Reward Ratio", "Status Fibonacci", "Auto Trading Plan", "Streak Harian", "Sinyal Cuci Barang", "Kategori", "Kelas Transaksi", "Valuasi", "Harga (Rp)", "PER (x)", "PBV (x)", "Harga MA20", "Posisi VWAP", "Support", "Resistance", "Posisi Entry", "Pola Candle", "Change (%)", "Volume", "RVOL (Anomali Vol)", "Vol Breakout", "Status Gap", "Fase Siklus Bandar", "Karakter Gorengan", "Tekanan Bandar", "Kekuatan A/D", "Status Bandar", "OBV Trend", "RSI (14D)", "Momentum", "Trend MA (5,20,50)", "MA Signal", "MA Cross", "MACD", "Status Stochastic", "Status BB", "Risiko", "Likuiditas", "Status Sentimen", "Prediksi Machine Learning", "Kondisi Supply", "Total Score", "Rekomendasi",
                             "Mkt Cap (Exodus)", "PE TTM (Exodus)", "PBV (Exodus)", "P/S TTM (Exodus)", "Earnings Yield", "Div Yield", "F-Score", "EPS Rating", "RS Rating", "BVPS (Exodus)", "PEG"]
            
            if "Ringkasan" in mode_tampilan: kolom_pilih = kolom_ringkasan
            elif "Bandarmologi" in mode_tampilan: kolom_pilih = kolom_bandar
            elif "Teknikal" in mode_tampilan: kolom_pilih = kolom_teknikal
            elif "Fundamental" in mode_tampilan: kolom_pilih = kolom_fundamental
            else: kolom_pilih = kolom_semua

            kolom_ada = [c for c in kolom_pilih if c in df_tampil.columns]
            format_dict = {}
            for col in ["Harga (Rp)", "Harga MA20", "Support", "Resistance", "Volume"]:
                if col in df_tampil.columns: format_dict[col] = format_angka
            if "Change (%)" in df_tampil.columns: format_dict["Change (%)"] = format_pct
            if "Momentum" in df_tampil.columns: format_dict["Momentum"] = format_mom
            if "Value Transaksi" in df_tampil.columns: format_dict["Value Transaksi"] = format_singkat_rp
            for col in ["PER (x)", "PBV (x)"]:
                if col in df_tampil.columns: format_dict[col] = format_desimal
            def _fund_num(v):
                # 0/NaN = data N/A di Stockbit → tampil "-", selain itu 2 desimal
                if pd.isna(v) or v == 0: return "-"
                return f"{v:,.2f}"

            def _fund_int(v):
                if pd.isna(v) or v == 0: return "-"
                return f"{v:.0f}"

            for col in ["PE TTM (Exodus)", "PBV (Exodus)", "P/S TTM (Exodus)", "Earnings Yield", "Div Yield", "BVPS (Exodus)", "PEG"]:
                if col in df_tampil.columns: format_dict[col] = _fund_num
            for col in ["F-Score", "EPS Rating", "RS Rating"]:
                if col in df_tampil.columns: format_dict[col] = _fund_int
            if "Mkt Cap (Exodus)" in df_tampil.columns: format_dict["Mkt Cap (Exodus)"] = format_singkat_rp
            if "RSI (14D)" in df_tampil.columns: format_dict["RSI (14D)"] = "{:.0f}"

            styler_obj = df_tampil[kolom_ada].style.format(format_dict)
            subset_warna = [c for c in kolom_ada if c not in ["Ticker", "Auto Trading Plan"]]
            tabel_akhir = styler_obj.map(warna_tabel, subset=subset_warna) if hasattr(styler_obj, 'map') else styler_obj.applymap(warna_tabel, subset=subset_warna)
            st.dataframe(tabel_akhir, use_container_width=True, hide_index=True)
            
            st.markdown("---")
            col_dl, col_wl = st.columns([1, 1])
            with col_dl:
                csv_filter = df_filtered[kolom_ada].to_csv(index=False).encode('utf-8')
                st.download_button(label=f"📥 Download Data Tabel CSV", data=csv_filter, file_name=f"Screener_View_{datetime.now().strftime('%Y%m%d_%H%M')}.csv", mime="text/csv", key="dl_tab2")
            with col_wl:
                st.empty()
        else: st.warning("Tidak ada data sesuai filter.")

        # ==========================================
        # 🧮 RULE SCREENER (Replikasi logika Stockbit Screener)
        # Pola: item1 OPERATOR item2 × multiplier
        # item1 & item2 = kolom data; operator = >, <, =, >=, <=, antara
        # multiplier = faktor skala opsional (mis. 1.05 untuk +5%)
        # Semua rule digabung AND. Tidak butuh token Stockbit — pakai data lokal.
        # ==========================================
        st.markdown("---")
        st.markdown("### 🧮 Rule Screener — Buat Aturan Sendiri (Tanpa Token)")

        KOLOM_NUMERIC = ["Harga (Rp)", "Change (%)", "Volume", "RSI (14D)", "PER (x)", "PBV (x)",
                         "Harga MA20", "Support", "Resistance", "Total Score"]
        OPERATOR_LIST = [">", "<", ">=", "<=", "==", "antara"]

        if "rule_screener" not in st.session_state:
            st.session_state.rule_screener = {}

        sub_tab_rules, sub_tab_hasil = st.tabs(["📝 Susun Rule", "📊 Hasil"])

        with sub_tab_rules:
            col_tambah, _ = st.columns([1, 4])
            with col_tambah:
                if st.button("➕ Tambah Rule", key="rs_tambah"):
                    n = str(max([int(k) for k in st.session_state.rule_screener.keys()] or [0]) + 1)
                    st.session_state.rule_screener[n] = {"item1": "Harga (Rp)", "op": ">", "item2_mode": "nilai", "item2_nilai": "0", "item2_kolom": "Support", "mult": "1.0"}
                    st.rerun()

            for kunci in sorted(st.session_state.rule_screener.keys(), key=int):
                r = st.session_state.rule_screener[kunci]
                c1, c2, c3, c4, c5, c6 = st.columns([2, 1, 1, 2, 1, 1])
                with c1:
                    r["item1"] = st.selectbox("Item 1 (kolom)", KOLOM_NUMERIC,
                                              index=KOLOM_NUMERIC.index(r.get("item1", "Harga (Rp)")),
                                              key=f"rs_i1_{kunci}")
                with c2:
                    r["op"] = st.selectbox("Operator", OPERATOR_LIST,
                                           index=OPERATOR_LIST.index(r.get("op", ">")),
                                           key=f"rs_op_{kunci}")
                with c3:
                    r["item2_mode"] = st.selectbox("Tipe", ["nilai", "kolom"],
                                                    index=0 if r.get("item2_mode") == "nilai" else 1,
                                                    key=f"rs_m2_{kunci}")
                with c4:
                    if r["item2_mode"] == "nilai":
                        r["item2_nilai"] = st.text_input("Nilai", value=r.get("item2_nilai", "0"),
                                                          key=f"rs_v2_{kunci}")
                    else:
                        r["item2_kolom"] = st.selectbox("Kolom", KOLOM_NUMERIC,
                                                         index=KOLOM_NUMERIC.index(r.get("item2_kolom", "Support")),
                                                         key=f"rs_k2_{kunci}")
                with c5:
                    r["mult"] = st.text_input("× Multiplier", value=r.get("mult", "1.0"),
                                               key=f"rs_mult_{kunci}", help="1.0 = tidak diubah. 1.05 = +5%.")
                with c6:
                    if st.button("🗑️", key=f"rs_h_{kunci}"):
                        del st.session_state.rule_screener[kunci]
                        st.rerun()

            if st.session_state.rule_screener:
                if st.button("📊 Jalankan Rule Screener", type="primary", key="rs_jalankan", use_container_width=True):
                    st.session_state["rs_hasil"] = "jalankan"

        def _eval_rule_screener(df_in, kamus_rule):
            mask = pd.Series(True, index=df_in.index)
            log = []
            for k, r in kamus_rule.items():
                col1 = r["item1"]
                if col1 not in df_in.columns:
                    log.append(f"Rule {k}: kolom '{col1}' tidak ada → dilewati")
                    continue
                v1 = pd.to_numeric(df_in[col1], errors="coerce")
                try:
                    mult = float(r.get("mult", "1.0"))
                except ValueError:
                    mult = 1.0
                v1 = v1 * mult

                if r["item2_mode"] == "nilai":
                    try:
                        v2 = float(r["item2_nilai"])
                    except ValueError:
                        log.append(f"Rule {k}: nilai '{r['item2_nilai']}' bukan angka → dilewati")
                        continue
                else:
                    col2 = r["item2_kolom"]
                    if col2 not in df_in.columns:
                        log.append(f"Rule {k}: kolom '{col2}' tidak ada → dilewati")
                        continue
                    v2 = pd.to_numeric(df_in[col2], errors="coerce")

                op = r["op"]
                if op == ">":
                    m = v1 > v2
                elif op == "<":
                    m = v1 < v2
                elif op == ">=":
                    m = v1 >= v2
                elif op == "<=":
                    m = v1 <= v2
                elif op == "==":
                    m = (v1 - v2).abs() < 0.01
                else:
                    m = (v1 >= v2) & (v1 <= v2 * 2)

                mask &= m.fillna(False)
                n_lo = int(m.fillna(False).sum())
                log.append(f"Rule {k}: {col1}({mult}×) {op} {r['item2_nilai'] if r['item2_mode']=='nilai' else r['item2_kolom']} → {n_lo} saham lolos")
            return df_in[mask.fillna(False)], log

        with sub_tab_hasil:
            if st.session_state.get("rs_hasil") == "jalankan" and st.session_state.rule_screener:
                df_rule, log_rule = _eval_rule_screener(df_hasil.copy(), st.session_state.rule_screener)
                for baris in log_rule:
                    st.text(baris)
                st.markdown(f"**✅ {len(df_rule)} saham lolos semua rule**")
                if not df_rule.empty:
                    render_strategy_table(df_rule, "Rule_Screener_Hasil")
                else:
                    st.warning("Tidak ada saham lolos. Longgarkan rule atau ganti operator.")
            else:
                st.info("Susun rule di tab 📝 lalu klik **Jalankan Rule Screener**.")


# =====================================================================
# >>> PART 12 : TAB 4 - ASISTEN AI SPESIAL (RUMUS v5.2 + RADAR LIVE) <<<
# =====================================================================
    VERSI_SIDANG = "v5.2"
    MAX_CHANGE_BELI = 20.0  # saringan keras BSJP (sinkron dengan sidang_lib.py)
    FILE_CACHE_AUTOPILOT = "Database/cache_autopilot.json"

    # S1 — Helper simpan snapshot sidang lokal (dipakai Radar Live web)
    def simpan_snapshot_radar(keranjang, stempel_data):
        try:
            snap = {"stempel_data": stempel_data, "versi": VERSI_SIDANG, "keranjang": keranjang,
                    "waktu": datetime.utcnow().strftime("%Y-%m-%d %H:%M:%S")}
            path = os.path.join("Database", "radar_snapshot.json")
            with open(path, "w") as f: json.dump(snap, f)
        except Exception:
            pass

    with tab4:
            st.markdown("## 🦅 Radar BSJP & Asisten AI")
            st.markdown("<div class='bandar-box-green'><b>💡 INFO:</b> Gunakan kotak pilihan (Dropdown) di bawah ini untuk beralih antar strategi atau mode AI agar tampilan lebih rapi.</div>", unsafe_allow_html=True)
        
            if 'Tekanan Bandar' not in df_hasil.columns:
                st.warning("⏳ **Fitur Radar belum menerima data terbaru.** Harap jalankan 'update_data.py'.")
            else:
                # --- SUSUNAN RUMUS v5.2: 1-5 remap, 6-9 rumus baru ---
                df_v1 = df_v2 = df_v3 = df_v4 = df_v5 = df_v6 = df_v7 = df_v8 = df_v9 = pd.DataFrame()
                if not df_hasil.empty:
                    vwap_ok = (df_hasil.get('Posisi VWAP', '') != 'Di Bawah VWAP (Lemah)')
                    vwap_kuat = (df_hasil.get('Posisi VWAP', '') == 'Di Atas VWAP (Kuat)')
                    akumulasi_pro = (df_hasil.get('Kekuatan A/D', '') == 'Akumulasi Pro (Smart Money)')
                    change_num = pd.to_numeric(df_hasil.get('Change (%)', 0), errors='coerce')
                    supply_banjir = df_hasil['Kondisi Supply'].astype(str).str.contains('Banjir', na=False) if 'Kondisi Supply' in df_hasil.columns else False

                    # RUMUS 1: Smart Money Menyelam
                    cond_v1 = (akumulasi_pro &
                               (df_hasil.get('Status Bandar', '') == 'Akumulasi Kuat') &
                               vwap_kuat &
                               ~supply_banjir)
                    df_v1 = df_hasil[cond_v1].copy()

                    # RUMUS 2: Pantulan Jarum Bawah (eks R3)
                    cond_v2 = (((df_hasil.get('Pola Candle', '') == 'Hammer (Potensi Reversal)') |
                                (df_hasil.get('Sinyal Cuci Barang', '') == 'Jarum Bawah (Sinyal Pantulan Kuat)')) &
                               vwap_kuat &
                               akumulasi_pro)
                    df_v2 = df_hasil[cond_v2].copy()

                    # RUMUS 3: Tutup Kuat, Bandar Hajar (eks R1)
                    cond_v3 = (vwap_kuat &
                               (df_hasil.get('Tekanan Bandar', '') == 'Dominan Beli (Hajar Kanan)') &
                               (df_hasil.get('Status Open', '') == 'Open = Low (Bullish Kuat)') &
                               (df_hasil.get('Rekomendasi', '') == 'BELI'))
                    df_v3 = df_hasil[cond_v3].copy()

                    # RUMUS 4: Golden Cross Muda (longgarkan v5.2)
                    cond_v4 = (((df_hasil.get('MA Cross', '') == 'Golden Cross') |
                                (df_hasil.get('MACD', '').isin(['Strong Bullish', 'Bullish MACD']))) &
                               (df_hasil.get('Vol Breakout', '') == 'Tembus MA20') &
                               (df_hasil.get('MA Signal', '') == 'Uptrend') &
                               vwap_kuat &
                               ((df_hasil.get('Tekanan Bandar', '') == 'Dominan Beli (Hajar Kanan)') | akumulasi_pro))
                    df_v4 = df_hasil[cond_v4].copy()

                    # RUMUS 5: Momentum Likuid Sehat (eks R6)
                    cond_v5 = ((df_hasil.get('Kelas Transaksi', '') == 'Ritel Aktif (5M - 50M)') &
                               (df_hasil.get('Vol Breakout', '') == 'Tembus MA20') &
                               vwap_kuat &
                               (df_hasil.get('MA Signal', '') == 'Uptrend') &
                               ((df_hasil.get('Tekanan Bandar', '') == 'Dominan Beli (Hajar Kanan)') | akumulasi_pro))
                    df_v5 = df_hasil[cond_v5].copy()

                    # RUMUS 6: BARU — Ledakan Volume Senyap
                    cond_v6 = ((df_hasil.get('RVOL (Anomali Vol)', '').isin(['Anomali Tinggi (150-300%)', 'Ledakan Ekstrem (> 300%)'])) &
                               (df_hasil.get('OBV Trend', '') == 'Akumulasi (Naik)') &
                               (change_num <= 5.0) &
                               (df_hasil.get('Tekanan Bandar', '') == 'Dominan Beli (Hajar Kanan)'))
                    df_v6 = df_hasil[cond_v6].copy()

    # RUMUS 7: BARU — Anomali Machine Learning (longgarkan v5.2)
                    cond_v7 = ((df_hasil.get('Prediksi Machine Learning', '') == '🔥 ANOMALI BANDAR (Siap Ledakan)') &
                               vwap_kuat &
                               ((df_hasil.get('Status Stochastic', '').isin(['Oversold (Jenuh Jual - Peluang)', 'Golden Cross (Awal Bullish)'])) |
                                (df_hasil.get('Tekanan Bandar', '') == 'Dominan Beli (Hajar Kanan)')))
                    df_v7 = df_hasil[cond_v7].copy()

                    # RUMUS 8: v5.3-WEB — Momentum Tembus MA20 (pengganti Katalis Sentimen,
                    # karena penyadap berita Google News dimatikan -> sentimen selalu Netral)
                    cond_v8 = ((df_hasil.get('Momentum', '') == 'Positif') &
                               (df_hasil.get('MA Signal', '') == 'Uptrend') &
                               (df_hasil.get('Vol Breakout', '') == 'Tembus MA20') &
                               vwap_ok &
                               (df_hasil.get('Rekomendasi', '') == 'BELI'))
                    df_v8 = df_hasil[cond_v8].copy()

    # RUMUS 9: BARU — MACD Momentum Terukur (longgarkan v5.2)
                    cond_v9 = ((df_hasil.get('MACD', '').isin(['Strong Bullish', 'Bullish MACD'])) &
                               (df_hasil.get('Momentum', '') == 'Positif') &
                               vwap_ok &
                               ((df_hasil.get('Risk/Reward Ratio', '').isin(['Sangat Menarik (> 1:3)', 'Ideal (1:2)'])) |
                                (df_hasil.get('Posisi Entry', '') == 'Dekat Support (Low Risk)')))
                    df_v9 = df_hasil[cond_v9].copy()

                tab_screener, tab_ai = st.tabs(["🎯 Screener Spesial", "🧠 Asisten AI"])
            
                with tab_screener:
                    pilihan_v = st.selectbox(
                        "Pilih Rumus Screener BSJP:",
                        [
                            "RUMUS 1 : Smart Money Menyelam 🕵️",
                            "RUMUS 2 : Pantulan Jarum Bawah 📌",
                            "RUMUS 3 : Tutup Kuat, Bandar Hajar ⚡",
                            "RUMUS 4 : Golden Cross Muda 🌱",
                            "RUMUS 5 : Momentum Likuid Sehat 💧",
                            "RUMUS 6 : Ledakan Volume Senyap 🌋",
                            "RUMUS 7 : Anomali Machine Learning 🧠",
                            "RUMUS 8 : Momentum Tembus MA20 🚀",
                            "RUMUS 9 : MACD Momentum Terukur 🎯"
                        ]
                    )
                
                    st.markdown("---")
                    if "RUMUS 1" in pilihan_v:
                        render_strategy_table(df_v1, "Screener_Rumus_1")
                    elif "RUMUS 2" in pilihan_v:
                        render_strategy_table(df_v2, "Screener_Rumus_2")
                    elif "RUMUS 3" in pilihan_v:
                        render_strategy_table(df_v3, "Screener_Rumus_3")
                    elif "RUMUS 4" in pilihan_v:
                        render_strategy_table(df_v4, "Screener_Rumus_4")
                    elif "RUMUS 5" in pilihan_v:
                        render_strategy_table(df_v5, "Screener_Rumus_5")
                    elif "RUMUS 6" in pilihan_v:
                        render_strategy_table(df_v6, "Screener_Rumus_6")
                    elif "RUMUS 7" in pilihan_v:
                        render_strategy_table(df_v7, "Screener_Rumus_7")
                    elif "RUMUS 8" in pilihan_v:
                        render_strategy_table(df_v8, "Screener_Rumus_8")
                    elif "RUMUS 9" in pilihan_v:
                        render_strategy_table(df_v9, "Screener_Rumus_9")

                    st.markdown("---")
                    st.markdown("### 🛠️ Rumus Manual — Buat Rumus Sendiri (Rumus 1–9)")

                    with st.expander("📖 Cara pakai", expanded=False):
                        st.markdown(
                            "1. Pilih **nomor rumus** yang mau kamu isi (1–9).\n"
                            "2. Susun **syarat filter** — minimal 1 syarat; saham harus lolos **semua** syarat (logika DAN).\n"
                            "3. Klik **👁️ Pratinjau** untuk melihat saham yang lolos.\n"
                            "4. Klik **💾 Simpan sebagai Kertas Belanja** → file `sinyal_ai_rumus_N.csv` ditulis\n"
                            "   (sinkron dengan Radar Live, Daftar Belanja & tombol beli manual).\n"
                            "5. Hapus rumus yang tersimpan lewat **🗑️ Hapus** bila tak dipakai.")
                        st.caption("🔒 Aturan tetap: ini hanya menulis kertas belanja — pembelian tetap manual, tidak ada auto-buy.")

                    OPSI_KOLOM = {
                        "Rekomendasi": "Rekomendasi",
                        "MA Signal": "MA Signal",
                        "MA Cross": "MA Cross",
                        "MACD": "MACD",
                        "Momentum": "Momentum",
                        "Tekanan Bandar": "Tekanan Bandar",
                        "Status Bandar": "Status Bandar",
                        "OBV Trend": "OBV Trend",
                        "Status Gap": "Status Gap",
                        "Status BB": "Status BB",
                        "Status Open": "Status Open",
                        "Status Stochastic": "Status Stochastic",
                        "Status Sentimen": "Status Sentimen",
                        "Status Akuisisi": "Status Akuisisi",
                        "Status Fibonacci": "Status Fibonacci",
                        "Vol Breakout": "Vol Breakout",
                        "Pola Candle": "Pola Candle",
                        "Posisi Entry": "Posisi Entry",
                        "Posisi VWAP": "Posisi VWAP",
                        "Kekuatan A/D": "Kekuatan A/D",
                        "Kelas Transaksi": "Kelas Transaksi",
                        "RVOL (Anomali Vol)": "RVOL (Anomali Vol)",
                        "Fase Siklus Bandar": "Fase Siklus Bandar",
                        "Risk/Reward Ratio": "Risk/Reward Ratio",
                        "Kondisi Supply": "Kondisi Supply",
                        "Kategori": "Kategori",
                        "Valuasi": "Valuasi",
                        "Risiko": "Risiko",
                        "Prediksi Machine Learning": "Prediksi Machine Learning",
                    }

                    def _nilai_unik(kolom):
                        if kolom in df_hasil.columns:
                            vals = [str(v) for v in df_hasil[kolom].dropna().unique() if str(v).strip()]
                            return sorted(vals)
                        return []

                    if "rumus_manual" not in st.session_state:
                        st.session_state.rumus_manual = {}

                    c_rn, c_aksi = st.columns([1, 3])
                    with c_rn:
                        nomor_manual = st.selectbox("Nomor rumus:", list(range(1, 10)),
                                                    index=7, key="rm_nomor",
                                                    help="Rumus 8 contoh default karena kosong dari sidang standar.")
                    with c_aksi:
                        st.markdown(f"#### 🧮 Rumus {nomor_manual} (manual)")

                    # --- Muat rumus tersimpan untuk nomor ini ---
                    FILE_RM = os.path.join("Database", f"rumus_manual_{nomor_manual}.json")
                    if st.button("📂 Muat rumus tersimpan", key=f"rm_muat_{nomor_manual}"):
                        if os.path.exists(FILE_RM):
                            try:
                                with open(FILE_RM) as f:
                                    st.session_state.rumus_manual = json.load(f)
                                st.success(f"Rumus {nomor_manual} dimuat ({len(st.session_state.rumus_manual)} syarat).")
                            except Exception as e:
                                st.error(f"Gagal muat: {e}")
                        else:
                            st.info(f"Belum ada rumus tersimpan untuk Rumus {nomor_manual}.")

                    syarat = st.session_state.rumus_manual

                    # --- Editor syarat ---
                    EDIT_BARU = "__syarat_baru__"
                    if not syarat:
                        st.session_state.setdefault(EDIT_BARU, True)

                    daftar_edit = sorted(syarat.keys())
                    tambah = st.button("➕ Tambah Syarat", key=f"rm_tambah_{nomor_manual}")
                    if tambah:
                        kunci_baru = str(max([int(k) for k in syarat.keys()] or [0]) + 1)
                        syarat[kunci_baru] = {"kolom": "Rekomendasi", "operator": "sama dengan", "nilai": "BELI"}
                        st.session_state.rumus_manual = syarat
                        st.rerun()

                    for kunci in daftar_edit:
                        s = syarat[kunci]
                        c1, c2, c3, c4 = st.columns([3, 2, 4, 1])
                        with c1:
                            s["kolom"] = st.selectbox("Kolom", list(OPSI_KOLOM.keys()),
                                                      index=list(OPSI_KOLOM.keys()).index(s.get("kolom", "Rekomendasi")),
                                                      key=f"rm_k_{nomor_manual}_{kunci}")
                        with c2:
                            s["operator"] = st.selectbox("Operator", ["sama dengan", "mengandung"],
                                                         index=0 if s.get("operator", "sama dengan") == "sama dengan" else 1,
                                                         key=f"rm_o_{nomor_manual}_{kunci}")
                        with c3:
                            opsi_nilai = _nilai_unik(s["kolom"]) or [s.get("nilai", "")]
                            idx = opsi_nilai.index(s.get("nilai", "")) if s.get("nilai", "") in opsi_nilai else 0
                            s["nilai"] = st.selectbox("Nilai", opsi_nilai, index=idx,
                                                      key=f"rm_v_{nomor_manual}_{kunci}")
                        with c4:
                            if st.button("🗑️", key=f"rm_h_{nomor_manual}_{kunci}", help="Hapus syarat ini"):
                                del syarat[kunci]
                                st.session_state.rumus_manual = syarat
                                st.rerun()

                    # --- Terapkan filter ke df_hasil ---
                    def _terapkan_rumus_manual(dfa, kamus_syarat):
                        mask = pd.Series(True, index=dfa.index)
                        for s in kamus_syarat.values():
                            kolom = s.get("kolom")
                            nilai = str(s.get("nilai", ""))
                            if kolom not in dfa.columns:
                                return dfa.iloc[0:0]
                            kolom_str = dfa[kolom].astype(str)
                            if s.get("operator") == "mengandung":
                                mask &= kolom_str.str.contains(nilai, case=False, na=False)
                            else:
                                mask &= (kolom_str == nilai)
                        return dfa[mask]

                    df_hasil_manual = _terapkan_rumus_manual(df_hasil, syarat) if syarat else df_hasil.iloc[0:0]

                    c_prev, c_sim, c_hps = st.columns(3)
                    with c_prev:
                        pratinjau = st.button("👁️ Pratinjau Hasil", key=f"rm_prev_{nomor_manual}",
                                              disabled=not syarat)
                    with c_sim:
                        simpan = st.button("💾 Simpan sebagai Kertas Belanja", type="primary",
                                           key=f"rm_sim_{nomor_manual}", disabled=not syarat)
                    with c_hps:
                        hapus_kertas = st.button("🗑️ Hapus Kertas Belanja Rumus Ini", key=f"rm_hps_{nomor_manual}")

                    if pratinjau:
                        n = len(df_hasil_manual)
                        if n:
                            st.success(f"✅ {n} saham lolos Rumus {nomor_manual} (manual).")
                            render_strategy_table(df_hasil_manual, f"RumusManual_{nomor_manual}")
                        else:
                            st.warning("Tidak ada saham yang lolos. Longgarkan syaratmu.")

                    if simpan:
                        if df_hasil_manual.empty:
                            st.error("Tidak ada saham yang lolos — kertas belanja tidak ditulis.")
                        else:
                            harga = pd.to_numeric(df_hasil_manual["Harga (Rp)"], errors="coerce")
                            stempel = datetime.utcnow().strftime("%Y-%m-%d")
                            kertas = pd.DataFrame({
                                "Ticker": df_hasil_manual["Ticker"].values,
                                "Target_TP": (harga * 1.05).round(0).astype(int).values,
                                "Target_CL": (harga * 0.97).round(0).astype(int).values,
                                "Stempel": stempel,
                            })
                            fs = os.path.join("Database", f"sinyal_ai_rumus_{nomor_manual}.csv")
                            kertas.to_csv(fs, index=False)
                            # simpan definisi rumusnya juga agar bisa dimuat ulang
                            with open(FILE_RM, "w") as f:
                                json.dump(syarat, f, indent=2)
                            st.success(f"💾 {len(kertas)} saham → {fs} (+ definisi rumus disimpan). "
                                       f"Kertas belanja Rumus {nomor_manual} siap dibeli manual via tombol EKSEKUSI BELI.")
                            muat_keranjang_radar.clear()
                            st.cache_data.clear()

                    if hapus_kertas:
                        fs = os.path.join("Database", f"sinyal_ai_rumus_{nomor_manual}.csv")
                        if os.path.exists(fs):
                            os.remove(fs)
                            st.success(f"Kertas belanja Rumus {nomor_manual} dihapus.")
                        else:
                            st.info("Tidak ada kertas belanja untuk rumus ini.")
                        muat_keranjang_radar.clear()

                    if os.path.exists(os.path.join("Database", f"sinyal_ai_rumus_{nomor_manual}.csv")):
                        ds = pd.read_csv(os.path.join("Database", f"sinyal_ai_rumus_{nomor_manual}.csv"))
                        st.caption(f"📄 Kertas belanja aktif Rumus {nomor_manual}: {len(ds)} saham "
                                   f"({', '.join(ds['Ticker'].astype(str).head(5))})")


                with tab_ai:
                    st.subheader("🧠 Asisten AI — Seleksi Top-5 per Rumus")
                    st.caption("Sidang AI memilih **Top 5 dari setiap rumus** (1–9). Hasilnya murni tampilan — tidak menulis kertas belanja.")

                    paksa_sidang = st.checkbox("🔄 Paksa Sidang Ulang (abaikan cache Mode Kilat)", key="paksa_sidang_ulang")

                    c_j, c_h = st.columns(2)
                    with c_j:
                        jalankan = st.button("🧠 Sidang AI Top-5 Semua Rumus", type="primary", key="autopilot_utama")
                    with c_h:
                        hapus_cache = st.button("🗑️ Hapus Cache Sidang", key="hapus_cache_sidang")

                    if hapus_cache:
                        try:
                            if os.path.exists(FILE_CACHE_AUTOPILOT):
                                os.remove(FILE_CACHE_AUTOPILOT)
                                st.success("✅ Cache sidang dihapus.")
                            else:
                                st.info("Tidak ada cache tersimpan.")
                        except Exception as e:
                            st.error(f"Gagal hapus cache: {e}")

                    if jalankan:
                        GEMINI_API_KEY = st.secrets.get("GEMINI_API_KEY", os.environ.get("GEMINI_API_KEY"))
                        if not GEMINI_API_KEY:
                            st.error("❌ Kunci API GEMINI belum dipasang!")
                        else:
                            daftar_rumus = {1: df_v1, 2: df_v2, 3: df_v3, 4: df_v4, 5: df_v5, 6: df_v6, 7: df_v7, 8: df_v8, 9: df_v9}
                            stempel_data = str(df_hasil["Terakhir Update"].iloc[0]) if "Terakhir Update" in df_hasil.columns else "tanpa_stempel"
                            keranjang_spreadsheet = None
                            if not paksa_sidang and os.path.exists(FILE_CACHE_AUTOPILOT):
                                try:
                                    with open(FILE_CACHE_AUTOPILOT, "r") as f: cache_muat = json.load(f)
                                    if cache_muat.get("stempel_data") == stempel_data and cache_muat.get("versi") == VERSI_SIDANG and cache_muat.get("keranjang"):
                                        ada_isi_cache = any(len([x for x in cache_muat["keranjang"].get(f"RUMUS {i}", []) if x]) > 0 for i in range(1, 10))
                                        if ada_isi_cache:
                                            keranjang_spreadsheet = cache_muat["keranjang"]
                                            st.info("⚡ **Mode Kilat:** hasil ditampilkan instan dari cache.")
                                except: pass
                            if keranjang_spreadsheet is None:
                                progress_bar = st.progress(0)
                                status_teks = st.empty()
                                # tulis_sinyal=False: murni seleksi Top-5, TIDAK menulis kertas belanja
                                keranjang_spreadsheet, err_global, laporan_sidang = jalankan_sidang_autopilot(
                                    daftar_rumus, df_hasil, GEMINI_API_KEY, progress_bar, status_teks, tulis_sinyal=False)
                                if err_global:
                                    st.error(err_global)
                                else:
                                    df_laporan = pd.DataFrame([{
                                        "Rumus": f"RUMUS {i}",
                                        "Status": laporan_sidang[i]["status"],
                                        "Keterangan": laporan_sidang[i]["detail"]
                                    } for i in range(1, 10)])
                                    st.markdown("#### 🧾 Laporan Sidang")
                                    st.dataframe(df_laporan, use_container_width=True, hide_index=True)
                                    ada_isi = any(laporan_sidang[i]["status"] == "✅ Sukses" for i in range(1, 10))
                                    if ada_isi:
                                        try:
                                            with open(FILE_CACHE_AUTOPILOT, "w") as f:
                                                json.dump({"stempel_data": stempel_data, "versi": VERSI_SIDANG, "keranjang": keranjang_spreadsheet}, f, indent=4)
                                        except: pass
                                        status_teks.success("🎉 Seleksi Top-5 selesai (tampilan saja — kertas belanja tidak diubah).")
                                    else:
                                        status_teks.warning("⚠️ Sidang selesai tetapi tidak ada jawara.")

                    if os.path.exists(FILE_CACHE_AUTOPILOT):
                        try:
                            with open(FILE_CACHE_AUTOPILOT, "r") as f: cm = json.load(f)
                            if cm.get("keranjang"):
                                df_hasil_sidang = pd.DataFrame({k: (v + ["", "", "", "", ""])[:5] for k, v in cm["keranjang"].items()})
                                st.markdown("### 🏆 Top-5 per Rumus (hasil sidang AI)")
                                st.dataframe(df_hasil_sidang, use_container_width=True, hide_index=True)
                        except Exception:
                            pass

# =====================================================================

    with tab5:
        logged_in = st.session_state.get("username") is not None

        st.markdown("## 💼 Portofolio Bot — 9 Arena Simulator")
        st.caption("Modal awal Rp 100 jt per rumus · fee beli 0,15% · fee jual 0,25% · Ini simulator, bukan akun broker riil.")

        if logged_in:
            col_beli, col_jual, col_reset = st.columns([2, 2, 3])
            with col_beli:
                if st.button("🛒 EKSEKUSI BELI Semua Sinyal!", type="primary", use_container_width=True):
                    import subprocess, sys
                    with st.spinner("Bot mengeksekusi pembelian..."):
                        try:
                            proses = subprocess.run([sys.executable, "bot_simulator.py", "--beli-only"], capture_output=True, text=True, timeout=1800)
                            if proses.returncode != 0:
                                st.error("❌ Gagal. Log:")
                                st.code(proses.stderr[-2000:], language="bash")
                            else:
                                st.success("✅ Pembelian selesai!")
                                st.code(proses.stdout[-2000:], language="bash")
                                st.cache_data.clear(); time.sleep(1); st.rerun()
                        except Exception as e:
                            st.error(f"Error: {e}")
            with col_jual:
                if st.button("💸 JUAL SORE Semua Posisi!", use_container_width=True):
                    import subprocess, sys
                    with st.spinner("Bot mengeksekusi penjualan..."):
                        try:
                            proses = subprocess.run([sys.executable, "bot_simulator.py", "--jual-only"], capture_output=True, text=True, timeout=1800)
                            if proses.returncode != 0:
                                st.error("❌ Gagal. Log:")
                                st.code(proses.stderr[-2000:], language="bash")
                            else:
                                st.success("✅ Jual sore selesai!")
                                st.code(proses.stdout[-2000:], language="bash")
                                st.cache_data.clear(); time.sleep(1); st.rerun()
                        except Exception as e:
                            st.error(f"Error: {e}")
            with col_reset:
                if st.button("🔄 Reset Semua Arena ke Rp 100 Juta", use_container_width=True, type="secondary"):
                    import subprocess, sys
                    if st.session_state.get("konf_reset"):
                        try:
                            hr = subprocess.run([sys.executable, "reset_porto.py", "--yes"], capture_output=True, text=True, timeout=120)
                            if hr.returncode == 0:
                                st.session_state["konf_reset"] = False
                                st.success("✅ Reset selesai! 9 arena kembali Rp 100 juta.")
                                st.code(hr.stdout[-1500:], language="bash")
                                st.cache_data.clear(); time.sleep(1); st.rerun()
                            else:
                                st.error("❌ Reset gagal.")
                        except Exception as e:
                            st.error(f"Error: {e}")
                    else:
                        st.session_state["konf_reset"] = True
                        st.warning("Klik sekali lagi untuk konfirmasi reset.")

            st.markdown("---")
            st.info("💡 Saham suspend otomatis dijual saat cron TP/SL (harga beli, fee only). Untuk jual manual, gunakan tombol JUAL SORE di atas.")
        else:
            st.info("🔐 Login dulu di sidebar untuk mengakses tombol beli/jual/reset.")

        # Load portfolio data
        ARENA_LABEL = {1: "Smart Money Menyelam", 2: "Pantulan Jarum Bawah", 3: "Tutup Kuat Bandar Hajar",
                       4: "Golden Cross Muda", 5: "Momentum Likuid Sehat", 6: "Ledakan Volume Senyap",
                       7: "Anomali ML", 8: "Momentum Tembus MA20", 9: "MACD Momentum Terukur"}

        pilihan_arena = st.selectbox("📂 Pilih Arena:", [f"Rumus {i} — {ARENA_LABEL[i]}" for i in range(1, 10)])
        rumus_id = pilihan_arena.split(" ")[1]

        def _baca_csv_safe(path, cols):
            if os.path.exists(path):
                try:
                    df = pd.read_csv(path)
                    return df
                except: pass
            return pd.DataFrame(columns=cols)

        df_porto = _baca_csv_safe(f"Database/portofolio_aktif_rumus_{rumus_id}.csv",
                                  ["Tanggal_Beli","Ticker","Harga_Beli","Lot","Total_Modal","Target_TP","Target_CL"])
        df_hist = _baca_csv_safe(f"Database/histori_transaksi_rumus_{rumus_id}.csv",
                                 ["Tanggal_Beli","Tanggal_Jual","Ticker","Harga_Beli","Harga_Jual","Status","Total_Return_Rp","Return_%"])
        df_sinyal = _baca_csv_safe(f"Database/sinyal_ai_rumus_{rumus_id}.csv",
                                   ["Ticker","Target_TP","Target_CL","Stempel"])

        total_profit = df_hist["Total_Return_Rp"].sum() if not df_hist.empty and "Total_Return_Rp" in df_hist.columns else 0
        modal_terpakai = df_porto["Total_Modal"].sum() if not df_porto.empty and "Total_Modal" in df_porto.columns else 0
        saldo = 100000000 + total_profit - modal_terpakai
        total_aset = saldo + modal_terpakai

        m1, m2, m3, m4 = st.columns(4)
        m1.metric("💵 Saldo Kas", f"Rp {saldo:,.0f}".replace(",","."))
        m2.metric("📦 Modal Terpakai", f"Rp {modal_terpakai:,.0f}".replace(",","."))
        m3.metric("💰 Total Aset", f"Rp {total_aset:,.0f}".replace(",","."))
        m4.metric("📊 P/L Realized", f"Rp {total_profit:,.0f}".replace(",","."),
                  delta=f"{total_profit/100000000*100:.1f}%", delta_color="normal")

        st.markdown("---")
        sub1, sub2, sub3 = st.tabs(["📝 Sinyal Antrean", "🟢 Posisi Aktif", "📚 Histori Transaksi"])

        with sub1:
            if not df_sinyal.empty:
                st.success(f"🔥 {len(df_sinyal)} sinyal siap dieksekusi.")
                st.dataframe(df_sinyal, use_container_width=True, hide_index=True)
            else:
                st.info("Kosong. Tidak ada sinyal.")

        with sub2:
            if not df_porto.empty:
                df_t = df_porto.copy()
                if "Harga_Beli" in df_t: df_t["Harga_Beli"] = df_t["Harga_Beli"].apply(lambda x: f"Rp {x:,.0f}".replace(",","."))
                if "Target_TP" in df_t: df_t["Target_TP"] = df_t["Target_TP"].apply(lambda x: f"Rp {x:,.0f}".replace(",","."))
                if "Target_CL" in df_t: df_t["Target_CL"] = df_t["Target_CL"].apply(lambda x: f"Rp {x:,.0f}".replace(",","."))
                st.dataframe(df_t, use_container_width=True, hide_index=True)
            else:
                st.info("📦 Gudang kosong. Belum ada posisi aktif.")

        with sub3:
            if not df_hist.empty:
                df_h = df_hist.sort_values("Tanggal_Jual", ascending=False) if "Tanggal_Jual" in df_hist.columns else df_hist
                st.dataframe(df_h, use_container_width=True, hide_index=True)
            else:
                st.info("📭 Belum ada riwayat penjualan.")

# =====================================================================
# >>> PART 14 : TAB 6 - DETEKTIF LEDAKAN (HANYA BACA) + CHAT AI <<<
# =====================================================================
    with tab6:
        st.markdown("## 🕵️ Detektif Ledakan & Ruang Obrolan AI")
        st.caption("Angka dihitung LOKAL dari arsip intraday (snapshot 5-menitan) + Buku Besar Harian (50 hari, gzip ±1MB). AI gratis hanya menyusun narasi — tidak berhitung.")
        st.caption("🔒 **Pagar keamanan:** Tab ini hanya MEMBACA & MENGANALISIS — tidak pernah membeli, menjual, atau mengubah portofolio/sinyal Anda.")

        # ==========================================
        # ALPHA SCAN PRO — 8 FITUR CANGGIH
        # ==========================================
        import sys as _sys
        _sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
        try:
            from services import alpha_features as af
            ALPHA_OK = True
        except Exception:
            ALPHA_OK = False
        if ALPHA_OK:
            with st.expander("🚀 AlphaScan Pro — Analisis Canggih", expanded=False):
                sub1, sub2 = st.tabs(["📊 Pasar", "🎯 Risiko & Performa"])

                # ---- SUB TAB: PASAR ----
                with sub1:
                    # 1. MARKET BREADTH
                    mb = af.market_breadth(df_hasil)
                    if mb:
                        c1, c2, c3, c4 = st.columns(4)
                        c1.metric("🟢 Advance", mb["advance"])
                        c2.metric("🔴 Decline", mb["decline"])
                        c3.metric("📈 A/D Line", mb["ad_line"])
                        c4.metric("🧭 Status", mb["status"])
                        st.caption(f"A/D Ratio (Adv/Dec): {mb['ratio']}")
                    st.markdown("---")
                    # 2. SECTOR ROTATION
                    sr = af.sector_rotation(df_hasil)
                    if sr:
                        st.markdown("#### 🌐 Arus Dana per Kategori")
                        for kat, pct in sr:
                            bar = "█" * int(pct/3)
                            st.markdown(f"`{kat}` **{pct}%** {bar}")
                        st.markdown("---")
                    # 3. PRE-MARKET GAP SCANNER
                    gs = af.premarket_gap_scanner(df_hasil, 2.0)
                    if gs:
                        gc1, gc2 = st.columns(2)
                        with gc1:
                            st.markdown("##### ⬆️ Gap Up >2%")
                            if not gs["gap_up"].empty: st.dataframe(gs["gap_up"], hide_index=True, use_container_width=True)
                            else: st.info("Tidak ada")
                        with gc2:
                            st.markdown("##### ⬇️ Gap Down >2%")
                            if not gs["gap_down"].empty: st.dataframe(gs["gap_down"], hide_index=True, use_container_width=True)
                            else: st.info("Tidak ada")

                # ---- SUB TAB: RISIKO & PERFORMA ----
                with sub2:
                    # 4. POSITION SIZING CALCULATOR
                    st.markdown("#### 🧮 Position Sizing Calculator")
                    ps_c1, ps_c2, ps_c3, ps_c4 = st.columns(4)
                    modal_ps = ps_c1.number_input("Modal (Rp)", value=100000000, step=10000000, key="ps_modal")
                    risk_ps = ps_c2.number_input("Risk %", value=2.0, step=0.5, key="ps_risk")
                    entry_ps = ps_c3.number_input("Entry Price", value=1000.0, step=50.0, key="ps_entry")
                    atr_ps = ps_c4.number_input("ATR", value=50.0, step=10.0, key="ps_atr")
                    hasil_ps = af.position_sizing(modal_ps, risk_ps, entry_ps, atr_ps)
                    if hasil_ps:
                        st.success(f"Lot optimal: **{hasil_ps['lot']}** | SL: Rp {hasil_ps['sl']:,.0f} | TP: Rp {hasil_ps['tp_atr15']:,.0f} | Modal keluar Rp Rp {hasil_ps['modal_keluar']:,.0f}")

                    st.markdown("---")
                    # 5. STRATEGY LEADERBOARD
                    st.markdown("#### 🏆 Leaderboard Rumus BSJP")
                    lb = af.strategy_leaderboard()
                    if lb is not None:
                        st.dataframe(lb, use_container_width=True, hide_index=True)
                    else:
                        st.info("Belum ada data histori transaksi.")

                    st.markdown("---")
                    # 6. DRAWDOWN ANALYSIS
                    st.markdown("#### 📉 Drawdown Analysis")
                    rd_c1, rd_c2 = st.columns([1, 3])
                    with rd_c1:
                        rumus_dd = st.selectbox("Pilih Rumus", [f"R{i}" for i in range(1, 10)], key="dd_rumus")
                    rumus_id = int(rumus_dd[1])
                    dd = af.drawdown_analysis(rumus_id)
                    if dd:
                        st.warning(f"Max Drawdown: **{dd['max_drawdown_pct']}%** | Equity sekarang: Rp {dd['equity_now']:,.0f} | Peak: Rp {dd['peak']:,.0f}")
                    else:
                        st.info(f"Belum ada histori untuk {rumus_dd}.")

        st.markdown("---")

        HARI_INI = (datetime.utcnow() + pd.Timedelta(hours=7)).strftime("%Y-%m-%d")
        lb = muat_buku_besar()
        tgl_opsi = sorted(lb["Tanggal"].astype(str).unique(), reverse=True) if not lb.empty else []
        arsip_hari_ini = muat_arsip_harian(HARI_INI)
        if not arsip_hari_ini.empty and HARI_INI not in tgl_opsi:
            tgl_opsi = [HARI_INI] + tgl_opsi

        def _set_otopsi(t, tgl):
            st.session_state["otopsi_ticker"] = t
            st.session_state["otopsi_tanggal"] = tgl

        # ---------- Mesin hitung lokal ----------
        def anomali_intraday(df_day, ticker):
            g = df_day[df_day["Ticker"] == ticker].copy()
            if g.empty: return [], None
            cw = next((c for c in ["Waktu Update", "Terakhir Update"] if c in g.columns), g.columns[0])
            g["_jam"] = g[cw].astype(str).str.split(" ").str[-1].str[:5]
            g = g.sort_values("_jam")
            h = pd.to_numeric(g["Harga (Rp)"], errors="coerce")
            v = pd.to_numeric(g["Volume"], errors="coerce")
            c = pd.to_numeric(g["Change (%)"], errors="coerce")
            swing = (h.max() - h.min()) / h.min() * 100 if h.min() else 0.0
            ringkas = {"Open": h.iloc[0], "High": h.max(), "Low": h.min(), "Close": h.iloc[-1],
                       "Swing_%": round(swing, 2), "Puncak_Change_%": round(c.max(), 2) if not c.isna().all() else 0.0,
                       "Slot": len(g)}
            ciri = []
            dv = v.diff().fillna(0)
            if len(dv) > 9:
                rata = dv.iloc[1:-6].mean()
                akhir = dv.tail(6).sum()
                if rata and rata > 0 and akhir / (rata * 6) >= 2.5:
                    ciri.append(f"🌋 Ledakan volume sesi akhir: 30 menit terakhir ≈{akhir / (rata * 6):.1f}x rata-rata slot")
            ta, tk = str(g.iloc[0].get("Tekanan Bandar", "")), str(g.iloc[-1].get("Tekanan Bandar", ""))
            if "Jual" in ta and "Beli" in tk:
                ciri.append(f"🔄 Pressure flip: {ta} → {tk}")
            bbs = g["Status BB"].astype(str).tolist() if "Status BB" in g.columns else []
            if "Squeeze" in bbs and any("Breakout" in b for b in bbs[bbs.index("Squeeze"):]):
                ciri.append("🌐 Squeeze → Breakout Upper dalam satu hari")
            if swing < 3 and "Beli" in tk and "Akumulasi" in str(g.iloc[-1].get("Kekuatan A/D", "")):
                ciri.append(f"🤫 Silent accumulation: harga flat (swing {swing:.1f}%) tapi {tk} + {g.iloc[-1].get('Kekuatan A/D')}")
            p15 = g[g["_jam"] >= "15:00"]
            if len(p15) > 0 and len(h) > len(p15):
                dasar = h.iloc[-len(p15) - 1]
                if dasar:
                    jump = (h.iloc[-1] - dasar) / dasar * 100
                    if jump >= 1.5: ciri.append(f"⏰ Closing jump: {jump:+.1f}% setelah 15:00")
            if not c.isna().all() and abs(c.iloc[0]) >= 2:
                ciri.append(f"🚪 Gap open: {c.iloc[0]:+.1f}% di snapshot pertama")
            if "Posisi VWAP" in g.columns:
                rk = (g["Posisi VWAP"].astype(str) == "Di Atas VWAP (Kuat)").mean()
                if rk >= 0.7: ciri.append(f"🛡️ Ditahan di atas VWAP {rk * 100:.0f}% waktu perdagangan")
            return ciri, ringkas

        def kenapa_lolos(r):
            get = lambda k: str(r.get(k, ""))
            vk = get("Posisi VWAP") == "Di Atas VWAP (Kuat)"
            vo = get("Posisi VWAP") != "Di Bawah VWAP (Lemah)"
            ap = get("Kekuatan A/D") == "Akumulasi Pro (Smart Money)"
            _ch = pd.to_numeric(r.get("Change (%)", 0), errors="coerce")
            _ch = 0.0 if pd.isna(_ch) else float(_ch)
            cek = {
                1: [("Smart Money A/D", ap), ("Bandar Akumulasi Kuat", get("Status Bandar") == "Akumulasi Kuat"), ("VWAP kuat", vk), ("Supply tidak banjir", "Banjir" not in get("Kondisi Supply"))],
                2: [("Hammer/Jarum Bawah", get("Pola Candle") == "Hammer (Potensi Reversal)" or get("Sinyal Cuci Barang") == "Jarum Bawah (Sinyal Pantulan Kuat)"), ("VWAP kuat", vk), ("Smart Money A/D", ap)],
                3: [("VWAP kuat", vk), ("Tekanan HAKA", get("Tekanan Bandar") == "Dominan Beli (Hajar Kanan)"), ("Open=Low", get("Status Open") == "Open = Low (Bullish Kuat)"), ("Rekomendasi BELI", get("Rekomendasi") == "BELI")],
                4: [("Golden Cross/MACD bullish", get("MA Cross") == "Golden Cross" or get("MACD") in ("Strong Bullish", "Bullish MACD")), ("Tembus MA20", get("Vol Breakout") == "Tembus MA20"), ("Uptrend", get("MA Signal") == "Uptrend"), ("VWAP kuat", vk), ("Tekanan HAKA / Smart Money", get("Tekanan Bandar") == "Dominan Beli (Hajar Kanan)" or ap)],
                5: [("Ritel Aktif", get("Kelas Transaksi") == "Ritel Aktif (5M - 50M)"), ("Tembus MA20", get("Vol Breakout") == "Tembus MA20"), ("VWAP kuat", vk), ("Uptrend", get("MA Signal") == "Uptrend"), ("Tekanan HAKA / Smart Money", get("Tekanan Bandar") == "Dominan Beli (Hajar Kanan)" or ap)],
                6: [("RVOL anomali tinggi", get("RVOL (Anomali Vol)") in ("Anomali Tinggi (150-300%)", "Ledakan Ekstrem (> 300%)")), ("OBV Akumulasi", get("OBV Trend") == "Akumulasi (Naik)"), ("Change ≤ 5%", _ch <= 5.0), ("Tekanan HAKA", get("Tekanan Bandar") == "Dominan Beli (Hajar Kanan)")],
                7: [("ML Anomali Bandar", get("Prediksi Machine Learning") == "🔥 ANOMALI BANDAR (Siap Ledakan)"), ("VWAP kuat", vk), ("Stochastic peluang / Tekanan HAKA", get("Status Stochastic") in ("Oversold (Jenuh Jual - Peluang)", "Golden Cross (Awal Bullish)") or get("Tekanan Bandar") == "Dominan Beli (Hajar Kanan)")],
                8: [("Katalis sentimen/akuisisi", get("Status Sentimen") == "Sentimen Positif 📰" or get("Status Akuisisi") in ("RENCANA AKUISISI", "DALAM AKUISISI")), ("Uptrend", get("MA Signal") == "Uptrend"), ("Rekomendasi BELI", get("Rekomendasi") == "BELI")],
                9: [("MACD bullish", get("MACD") in ("Strong Bullish", "Bullish MACD")), ("Momentum Positif", get("Momentum") == "Positif"), ("VWAP tidak lemah", vo), ("R/R menarik / Dekat Support", get("Risk/Reward Ratio") in ("Sangat Menarik (> 1:3)", "Ideal (1:2)") or get("Posisi Entry") == "Dekat Support (Low Risk)")],
            }
            return {i: [lab for lab, ok in pairs if not ok] for i, pairs in cek.items() if any(not ok for _, ok in pairs)}

        def tren_50h(ticker):
            if lb.empty: return None
            g = lb[lb["Ticker"] == ticker].sort_values("Tanggal").tail(50).copy()
            if g.empty: return None
            for kol in ["Volume", "Close"]:
                g[kol] = pd.to_numeric(g[kol], errors="coerce")
            g["MA5_vol"] = g["Volume"].rolling(5).mean()
            g["MA20_vol"] = g["Volume"].rolling(20).mean()
            g["MA50_vol"] = g["Volume"].rolling(50).mean()
            g["MA20_close"] = g["Close"].rolling(20).mean()
            return g

        def narasi_ai(konteks, pertanyaan):
            prompt = f"""Kamu analis detektif pasar saham Indonesia. FAKTA hanya dari BLOK DATA di bawah; untuk edukasi/konsep gunakan pengetahuan umum. Jika fakta tidak ada, katakan jujur. Jawab Bahasa Indonesia, analitis, tanpa basa-basi.
            BLOK DATA:
            {konteks}
            PERTANYAAN: {pertanyaan}"""
            
            error_log = []
            
            # 1. Coba Gemini (Langsung tembak model flash, skip list_models agar tidak kena rate limit)
            try:
                GK = st.secrets.get("GEMINI_API_KEY", os.environ.get("GEMINI_API_KEY"))
                if GK:
                    genai.configure(api_key=GK)
                    for model_nama in ["gemini-1.5-flash-latest", "gemini-1.5-flash", "gemini-1.0-pro"]:
                        try:
                            r = genai.GenerativeModel(model_nama).generate_content(prompt)
                            if r.text: return r.text, f"Gemini ({model_nama})"
                        except Exception:
                            continue
                    error_log.append("Gemini: Semua model flash/pro limit atau gagal.")
                else:
                    error_log.append("Gemini: API Key tidak ada di secrets.")
            except Exception as e:
                error_log.append(f"Gemini error: {str(e)[:80]}")

            # 2. Coba OpenRouter
            try:
                OK_ = st.secrets.get("OPENROUTER_API_KEY", os.environ.get("OPENROUTER_API_KEY"))
                if OK_:
                    client = OpenAI(base_url="https://openrouter.ai/api/v1", api_key=OK_)
                    cp = client.chat.completions.create(
                        model="openrouter/free", 
                        messages=[{"role": "user", "content": prompt}], 
                        temperature=0.4, 
                        max_tokens=1500
                    )
                    isi = cp.choices[0].message.content
                    if isi: return isi, "OpenRouter"
                    else: error_log.append("OpenRouter: Respons kosong dari server.")
                else:
                    error_log.append("OpenRouter: API Key tidak ada di secrets.")
            except Exception as e:
                error_log.append(f"OpenRouter error: {str(e)[:80]}")

            return f"❌ Kedua mesin AI gagal. Detail: {' | '.join(error_log)}", "error"

        def simpan_kasus(entry):
            try:
                path_kasus = os.path.join("Database", "kasus_ledakan.json")
                data = []
                if os.path.exists(path_kasus):
                    try: data = json.load(open(path_kasus))
                    except Exception: data = []
                data.append(entry); data = data[-200:]
                json.dump(data, open(path_kasus, "w"), indent=2)
            except Exception: pass

        # ---------- Panel kontrol ----------
        if not tgl_opsi:
            st.info("📖 Buku Besar belum ada. Jalankan sekali di laptop: `./.venv/bin/python bangun_buku_besar.py --backfill`")
        c1, c2 = st.columns([1, 1])
        with c1:
            ticker_inp = st.text_input("Kode saham:", placeholder="Contoh: LAPD", key="otopsi_ticker").strip().upper()
        with c2:
            tanggal_inp = st.selectbox("Tanggal otopsi:", tgl_opsi if tgl_opsi else [HARI_INI], key="otopsi_tanggal")

        # ---------- Chip ledakan (swing low→high ≥10%) ----------
        if not lb.empty and tgl_opsi:
            tgl_chip = HARI_INI if HARI_INI in tgl_opsi else tgl_opsi[0]
            dfx = lb[lb["Tanggal"].astype(str) == tgl_chip]
            df_ledakan = dfx[(pd.to_numeric(dfx["Swing_%"], errors="coerce") >= 10) | (pd.to_numeric(dfx["Puncak_Change_%"], errors="coerce") >= 10)]
            df_ledakan = df_ledakan.sort_values("Swing_%", ascending=False).head(12)
            if not df_ledakan.empty:
                st.markdown(f"**🔥 Terdeteksi swing low→high ≥10% pada {tgl_chip}** *(saham yang pagi terbang lalu sore turun TETAP tertangkap)*:")
                n_col = min(len(df_ledakan), 6)
                chips = st.columns(n_col)
                for i, (_, r) in enumerate(df_ledakan.head(n_col).iterrows()):
                    with chips[i]:
                        st.button(f"{r.Ticker} ⤴{float(r['Swing_%']):.0f}%", key=f"chip_{r.Ticker}_{tgl_chip}",
                                  on_click=_set_otopsi, args=(r.Ticker, tgl_chip))

        # ---------- Tombol template ----------
        st.markdown("---")
        tpl = st.columns(4)
        aksi = None
        with tpl[0]:
            if st.button("🩺 Otopsi H-1", use_container_width=True): aksi = "otopsi"
            if st.button("🚫 Kenapa lolos radar?", use_container_width=True): aksi = "lolos"
        with tpl[1]:
            if st.button("📈 Tren 50H (MA5/20/50)", use_container_width=True): aksi = "tren"
            if st.button("🎯 Checklist siap gap-up", use_container_width=True): aksi = "gapup"
        with tpl[2]:
            if st.button("🧬 Ciri ledakan (naratif)", use_container_width=True): aksi = "dna"
            if st.button("⏱️ Fokus sesi akhir 14:00+", use_container_width=True): aksi = "sesi"
        with tpl[3]:
            if st.button("💡 Usulan rumus baru", use_container_width=True): aksi = "rumus"
            if st.button("🗑️ Bersihkan chat", use_container_width=True):
                st.session_state["chat_detektif"] = []
                st.rerun()

        # ---------- Eksekusi template ----------
        if aksi and ticker_inp and tanggal_inp:
            df_day = muat_arsip_harian(tanggal_inp)
            ciri, ringkas = anomali_intraday(df_day, ticker_inp) if not df_day.empty else ([], None)
            row_h1 = None
            if not df_day.empty and not df_day[df_day["Ticker"] == ticker_inp].empty:
                row_h1 = df_day[df_day["Ticker"] == ticker_inp].iloc[-1]
            elif not lb.empty:
                lbb = lb[(lb["Ticker"] == ticker_inp) & (lb["Tanggal"].astype(str) == tanggal_inp)]
                if not lbb.empty: row_h1 = lbb.iloc[-1]
            if row_h1 is None:
                st.warning(f"❌ Tidak ada data {ticker_inp} pada {tanggal_inp}.")
            else:
                konteks = f"SAHAM {ticker_inp} TANGGAL {tanggal_inp}\n"
                if ringkas: konteks += f"OHLC intraday: Open {ringkas['Open']} High {ringkas['High']} Low {ringkas['Low']} Close {ringkas['Close']} | Swing {ringkas['Swing_%']}% | Puncak change {ringkas['Puncak_Change_%']}%\n"
                konteks += f"Baris penutup hari: Tekanan {row_h1.get('Tekanan Bandar', row_h1.get('Tekanan'))} | Siklus {row_h1.get('Fase Siklus Bandar', row_h1.get('Siklus'))} | A/D {row_h1.get('Kekuatan A/D', row_h1.get('AD'))} | BB {row_h1.get('Status BB', row_h1.get('BB'))} | RVOL {row_h1.get('RVOL (Anomali Vol)', row_h1.get('RVOL'))} | Supply {row_h1.get('Kondisi Supply', row_h1.get('Supply'))} | Score {row_h1.get('Total Score', row_h1.get('Score'))} | Rekomendasi {row_h1.get('Rekomendasi')}\n"
                if ciri: konteks += "ANOMALI TERDETEKSI:\n- " + "\n- ".join(ciri) + "\n"
                gt = tren_50h(ticker_inp)
                if gt is not None and len(gt) > 1:
                    l = gt.iloc[-1]
                    konteks += f"TREN 50H: hari ke-{len(gt)} | Close {l['Close']} vs MA20 {l['MA20_close']:.0f} | Vol terakhir {l['Volume']:.0f} vs MA5 {l['MA5_vol']:.0f} / MA20 {l['MA20_vol']:.0f} / MA50 {l['MA50_vol']:.0f}\n"

                if aksi == "otopsi":
                    st.markdown(f"### 🩺 Otopsi {ticker_inp} — {tanggal_inp}")
                    if ringkas:
                        st.dataframe(pd.DataFrame([ringkas]), use_container_width=True, hide_index=True)
                    st.markdown("**Ciri anomali yang terdeteksi mesin:**")
                    st.markdown("\n".join(f"- {x}" for x in ciri) if ciri else "- Tidak ada anomali besar; hari itu tenang.")
                    pertanyaan = f"Jelaskan secara naratif mengapa pergerakan {ticker_inp} pada {tanggal_inp} penting/tidak sebagai persiapan ledakan hari berikutnya."
                elif aksi == "lolos":
                    gagal = kenapa_lolos(row_h1)
                    st.markdown(f"### 🚫 Kenapa {ticker_inp} tidak masuk screener pada {tanggal_inp}?")
                    for i, buruk in gagal.items():
                        st.markdown(f"- **Rumus {i} gagal:** " + ", ".join(buruk))
                    konteks += f"SYARAT RUMUS YANG GAGAL: {gagal}\n"
                    pertanyaan = f"Berdasarkan syarat yang gagal ini, jelaskan kenapa radar melewatkan {ticker_inp} dan ciri mana yang sebenarnya sudah memberi petunjuk."
                elif aksi == "tren":
                    st.markdown(f"### 📈 Tren 50H {ticker_inp}")
                    if gt is None: st.warning("Buku Besar belum punya riwayat saham ini.")
                    else:
                        st.line_chart(gt.set_index("Tanggal")[["Close", "MA20_close"]])
                        st.bar_chart(gt.set_index("Tanggal")[["Volume"]])
                        pertanyaan = f"Interpretasikan tren 50 hari {ticker_inp}: ada build-up senyap atau tidak?"
                elif aksi == "gapup":
                    cek = [
                        ("Tutup dekat high intraday (≥98%)", ringkas and ringkas["Close"] >= 0.98 * ringkas["High"]),
                        ("Swing intraday ≥5%", ringkas and ringkas["Swing_%"] >= 5),
                        ("Volume >2x MA20 volume", gt is not None and len(gt) > 1 and gt['Volume'].iloc[-1] > 2 * gt['MA20_vol'].iloc[-1]),
                        ("Tekanan akhir Dominan Beli", "Beli" in str(row_h1.get("Tekanan Bandar", row_h1.get("Tekanan")))),
                        ("A/D Akumulasi", "Akumulasi" in str(row_h1.get("Kekuatan A/D", row_h1.get("AD")))),
                        ("Supply tidak banjir", "Banjir" not in str(row_h1.get("Kondisi Supply", row_h1.get("Supply")))),
                    ]
                    skor = sum(1 for _, ok in cek if ok)
                    st.markdown(f"### 🎯 Checklist siap gap-up {ticker_inp} — skor {skor}/{len(cek)}")
                    for lab, ok in cek: st.markdown(f"- {'✅' if ok else '❌'} {lab}")
                    st.markdown(f"**Kesimpulan mesin:** {'SIAP GAP-UP' if skor >= 4 else 'MERAGUKAN' if skor >= 2 else 'TIDAK SIAP'} (angka oleh mesin, bukan AI)")
                    konteks += f"CHECKLIST GAPUP: skor {skor}/{len(cek)}\n"
                    pertanyaan = "Beri opini singkat atas checklist gap-up ini."
                elif aksi == "dna":
                    pertanyaan = f"Sebut dan jelaskan ciri-ciri ledakan yang terlihat pada {ticker_inp} tanggal {tanggal_inp} berdasarkan BLOK DATA, dalam bentuk daftar ciri TERLIHAT vs TIDAK TERLIHAT. Jangan bergantung pada skor."
                elif aksi == "sesi":
                    if df_day.empty: st.warning("Arsip intraday tanggal itu tidak tersedia.")
                    else:
                        gs = df_day[df_day["Ticker"] == ticker_inp].copy()
                        cw = next((c for c in ["Waktu Update", "Terakhir Update"] if c in gs.columns), gs.columns[0])
                        gs["_jam"] = gs[cw].astype(str).str.split(" ").str[-1].str[:5]
                        gs = gs[gs["_jam"] >= "14:00"]
                        st.dataframe(gs[["_jam", "Harga (Rp)", "Volume", "Change (%)", "Tekanan Bandar"]].tail(20), use_container_width=True, hide_index=True)
                    pertanyaan = f"Analisis sesi akhir (14:00-tutup) {ticker_inp} pada {tanggal_inp}: ada persiapan mark-up apa?"
                else:  # rumus
                    pertanyaan = f"Berdasarkan kasus {ticker_inp} {tanggal_inp} yang lolos radar, usulkan 1 rumus/filter BARU yang konkret (sebutkan nama kolom dan nilainya) agar pola serupa tertangkap besok."

                with st.spinner("Mesin menghitung + AI menyusun narasi..."):
                    jawab, mesin = narasi_ai(konteks, pertanyaan)
                st.markdown(jawab)
                st.caption(f"⚡ Narasi via {mesin} | angka dihitung lokal.")
                simpan_kasus({"tanggal_otopsi": str(datetime.utcnow() + pd.Timedelta(hours=7))[:19],
                              "ticker": ticker_inp, "tanggal_data": tanggal_inp, "mode": aksi,
                              "ciri": ciri, "ringkas": ringkas})

        # ---------- Chat bebas ----------
        st.markdown("---")
        st.markdown("### 🗨️ Obrolan bebas (konteks: data lokal Anda)")
        if "chat_detektif" not in st.session_state: st.session_state["chat_detektif"] = []
        for m in st.session_state["chat_detektif"]:
            with st.chat_message(m["role"]): st.markdown(m["content"])
        if pesan := st.chat_input("Tanya apa saja: analisa, edukasi, atau lanjutan otopsi di atas..."):
            st.session_state["chat_detektif"].append({"role": "user", "content": pesan})
            with st.chat_message("user"): st.markdown(pesan)
            with st.chat_message("assistant"):
                with st.spinner("Berpikir..."):
                    ctx = ""
                    tk = re.findall(r"\b[A-Z]{4}\b", pesan.upper())
                    tk = [t for t in tk if not lb.empty and t in set(lb["Ticker"])] or (tk[:1] if tk else [])
                    for t in tk[:2]:
                        gt = tren_50h(t)
                        if gt is not None and len(gt):
                            l = gt.iloc[-1]
                            ctx += f"{t}: close {l['Close']} swing terakhir {l['Swing_%']}% vol {l['Volume']:.0f} (MA20 {l['MA20_vol']:.0f})\n"
                    jawab, mesin = narasi_ai(ctx or "(tidak ada data lokal relevan)", pesan)
                st.markdown(jawab)
                st.caption(f"⚡ via {mesin}")
            st.session_state["chat_detektif"].append({"role": "assistant", "content": jawab})
