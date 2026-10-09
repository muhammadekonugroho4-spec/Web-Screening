package com.stockbit.dto.tradingperformance.allocation;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetDTO;", "", "unrealised", "Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetUnrealisedDTO;", "amountInvested", "", "<init>", "(Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetUnrealisedDTO;Ljava/lang/Double;)V", "getUnrealised", "()Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetUnrealisedDTO;", "getAmountInvested", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", Constants.COPY_TYPE, "(Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetUnrealisedDTO;Ljava/lang/Double;)Lcom/stockbit/dto/tradingperformance/allocation/StockAllocationAssetDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StockAllocationAssetDTO {

    @SerializedName("amount_invested")
    private final Double amountInvested;

    @SerializedName("unrealised")
    private final StockAllocationAssetUnrealisedDTO unrealised;

    public StockAllocationAssetDTO(StockAllocationAssetUnrealisedDTO r1, Double r2) {
        this.unrealised = r1;
        this.amountInvested = r2;
    }

    public final Double a() {
        return this.amountInvested;
    }

    public final StockAllocationAssetUnrealisedDTO b() {
        return this.unrealised;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockAllocationAssetDTO) == true) goto L8;
        return false;
    L8:
        StockAllocationAssetDTO r52 = (StockAllocationAssetDTO) r5;
        if (p.g(this.unrealised, r52.unrealised) == true) goto L12;
        return false;
    L12:
        if (p.g(this.amountInvested, r52.amountInvested) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        StockAllocationAssetUnrealisedDTO r02 = this.unrealised;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.amountInvested;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StockAllocationAssetDTO(unrealised=" + this.unrealised + ", amountInvested=" + this.amountInvested + ")";
    }
}
