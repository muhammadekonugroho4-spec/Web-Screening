import os
import pandas as pd
from fastapi import APIRouter

from backend import pipeline_runner

router = APIRouter(prefix="/api", tags=["health"])


@router.get("/health")
async def api_health():
    """Health ala monitoring modern: status app + pipeline + data (Fase E-final)."""
    # data freshness
    stempel = None
    try:
        fp = os.path.join(os.getcwd(), "Database", "hasil_screener.csv")
        if os.path.exists(fp):
            df = pd.read_csv(fp, usecols=["Terakhir Update"])
            stempel = str(df["Terakhir Update"].iloc[0])
    except Exception:
        pass

    pipeline = pipeline_runner.status()

    # buku besar stats
    bb_stat = None
    try:
        fp_bb = os.path.join(os.getcwd(), "Database", "ringkasan_harian.csv.gz")
        if os.path.exists(fp_bb):
            bb = pd.read_csv(fp_bb, usecols=["Tanggal", "Ticker"])
            bb_stat = {
                "codes": int(bb["Ticker"].nunique()),
                "rows": int(len(bb)),
                "tanggal_terakhir": str(bb["Tanggal"].max()),
            }
    except Exception:
        pass

    return {
        "status": "ok",
        "version": "0.1.0",
        "jobs": {
            "pipeline": {
                "status": "ok" if pipeline.get("aktif") else "nonaktif",
                "sedang_jalan": pipeline.get("sedang_jalan"),
                "update_terakhir": pipeline.get("update_terakhir"),
                "hasil_terakhir": pipeline.get("hasil_terakhir"),
            },
            "screener": {
                "status": "ok" if stempel else "kosong",
                "stempel": stempel,
            },
            "buku_besar": bb_stat,
        },
    }
