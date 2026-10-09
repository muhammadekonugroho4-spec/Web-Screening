package com.stockbit.dto.company.analyst;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/stockbit/dto/company/analyst/AnalystPriceTargetDTO;", "", "bestTarget", "", "bestLowTarget", "bestHighTarget", "currentPrice", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBestTarget", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBestLowTarget", "getBestHighTarget", "getCurrentPrice", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/company/analyst/AnalystPriceTargetDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnalystPriceTargetDTO {

    @SerializedName("best_high_target")
    private final Integer bestHighTarget;

    @SerializedName("best_low_target")
    private final Integer bestLowTarget;

    @SerializedName("best_target")
    private final Integer bestTarget;

    @SerializedName("current_price")
    private final Integer currentPrice;

    public AnalystPriceTargetDTO(Integer r1, Integer r2, Integer r3, Integer r4) {
        this.bestTarget = r1;
        this.bestLowTarget = r2;
        this.bestHighTarget = r3;
        this.currentPrice = r4;
    }

    public final Integer a() {
        return this.bestHighTarget;
    }

    public final Integer b() {
        return this.bestLowTarget;
    }

    public final Integer c() {
        return this.bestTarget;
    }

    public final Integer d() {
        return this.currentPrice;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AnalystPriceTargetDTO) == true) goto L8;
        return false;
    L8:
        AnalystPriceTargetDTO r52 = (AnalystPriceTargetDTO) r5;
        if (p.g(this.bestTarget, r52.bestTarget) == true) goto L12;
        return false;
    L12:
        if (p.g(this.bestLowTarget, r52.bestLowTarget) == true) goto L15;
        return false;
    L15:
        if (p.g(this.bestHighTarget, r52.bestHighTarget) == true) goto L18;
        return false;
    L18:
        if (p.g(this.currentPrice, r52.currentPrice) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.bestTarget;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.bestLowTarget;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.bestHighTarget;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.currentPrice;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AnalystPriceTargetDTO(bestTarget=" + this.bestTarget + ", bestLowTarget=" + this.bestLowTarget + ", bestHighTarget=" + this.bestHighTarget + ", currentPrice=" + this.currentPrice + ")";
    }
}
