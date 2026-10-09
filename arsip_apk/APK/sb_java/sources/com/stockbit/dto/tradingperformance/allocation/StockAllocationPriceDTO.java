package com.stockbit.dto.tradingperformance.allocation;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationPriceDTO;", "", "latest", "", "average", "Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationPriceAverageDTO;", "<init>", "(Ljava/lang/Double;Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationPriceAverageDTO;)V", "getLatest", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAverage", "()Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationPriceAverageDTO;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Double;Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationPriceAverageDTO;)Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationPriceDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StockAllocationPriceDTO {

    @SerializedName("average")
    private final StockAllocationPriceAverageDTO average;

    @SerializedName("latest")
    private final Double latest;

    public StockAllocationPriceDTO(Double r1, StockAllocationPriceAverageDTO r2) {
        this.latest = r1;
        this.average = r2;
    }

    public final StockAllocationPriceAverageDTO a() {
        return this.average;
    }

    public final Double b() {
        return this.latest;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockAllocationPriceDTO) == true) goto L8;
        return false;
    L8:
        StockAllocationPriceDTO r52 = (StockAllocationPriceDTO) r5;
        if (p.g(this.latest, r52.latest) == true) goto L12;
        return false;
    L12:
        if (p.g(this.average, r52.average) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Double r02 = this.latest;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        StockAllocationPriceAverageDTO r2 = this.average;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StockAllocationPriceDTO(latest=" + this.latest + ", average=" + this.average + ")";
    }
}
