package com.stockbit.dto.securities.order;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/securities/order/OpenOrderSummaryDTO;", "", "total", "", "buy", "sell", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBuy", "getSell", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/securities/order/OpenOrderSummaryDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenOrderSummaryDTO {

    @SerializedName("buy")
    private final Integer buy;

    @SerializedName("sell")
    private final Integer sell;

    @SerializedName("total")
    private final Integer total;

    public OpenOrderSummaryDTO(Integer r1, Integer r2, Integer r3) {
        this.total = r1;
        this.buy = r2;
        this.sell = r3;
    }

    public final Integer a() {
        return this.buy;
    }

    public final Integer b() {
        return this.sell;
    }

    public final Integer c() {
        return this.total;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OpenOrderSummaryDTO) == true) goto L8;
        return false;
    L8:
        OpenOrderSummaryDTO r52 = (OpenOrderSummaryDTO) r5;
        if (p.g(this.total, r52.total) == true) goto L12;
        return false;
    L12:
        if (p.g(this.buy, r52.buy) == true) goto L15;
        return false;
    L15:
        if (p.g(this.sell, r52.sell) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.total;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.buy;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.sell;
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
        return "OpenOrderSummaryDTO(total=" + this.total + ", buy=" + this.buy + ", sell=" + this.sell + ")";
    }
}
