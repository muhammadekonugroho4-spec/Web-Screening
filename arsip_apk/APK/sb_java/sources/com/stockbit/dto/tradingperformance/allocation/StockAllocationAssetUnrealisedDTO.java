package com.stockbit.dto.tradingperformance.allocation;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetUnrealisedDTO;", "", "marketValue", "", "profitLoss", "gain", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getMarketValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProfitLoss", "getGain", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetUnrealisedDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StockAllocationAssetUnrealisedDTO {

    @SerializedName("gain")
    private final Double gain;

    @SerializedName("market_value")
    private final Double marketValue;

    @SerializedName("profit_loss")
    private final Double profitLoss;

    public StockAllocationAssetUnrealisedDTO(Double r1, Double r2, Double r3) {
        this.marketValue = r1;
        this.profitLoss = r2;
        this.gain = r3;
    }

    public final Double a() {
        return this.gain;
    }

    public final Double b() {
        return this.marketValue;
    }

    public final Double c() {
        return this.profitLoss;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockAllocationAssetUnrealisedDTO) == true) goto L8;
        return false;
    L8:
        StockAllocationAssetUnrealisedDTO r52 = (StockAllocationAssetUnrealisedDTO) r5;
        if (p.g(this.marketValue, r52.marketValue) == true) goto L12;
        return false;
    L12:
        if (p.g(this.profitLoss, r52.profitLoss) == true) goto L15;
        return false;
    L15:
        if (p.g(this.gain, r52.gain) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Double r02 = this.marketValue;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.profitLoss;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.gain;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StockAllocationAssetUnrealisedDTO(marketValue=" + this.marketValue + ", profitLoss=" + this.profitLoss + ", gain=" + this.gain + ")";
    }
}
