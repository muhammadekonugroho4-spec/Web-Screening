package com.stockbit.dto.securities.common;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010¨\u0006!"}, d2 = {"Lcom/stockbit/dto/securities/common/MarginTradingDTO;", "", "atRiskRatioThreshold", "", "forceSellRatioThreshold", "marginCallConsecutiveDays", "", "marginCallRatioThreshold", "activeMarginCallCounter", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAtRiskRatioThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getForceSellRatioThreshold", "getMarginCallConsecutiveDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginCallRatioThreshold", "getActiveMarginCallCounter", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/stockbit/dto/securities/common/MarginTradingDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarginTradingDTO {

    @SerializedName("active_margin_call_counter")
    private final Integer activeMarginCallCounter;

    @SerializedName("at_risk_ratio_threshold")
    private final Double atRiskRatioThreshold;

    @SerializedName("force_sell_ratio_threshold")
    private final Double forceSellRatioThreshold;

    @SerializedName("margin_call_consecutive_days")
    private final Integer marginCallConsecutiveDays;

    @SerializedName("margin_call_ratio_threshold")
    private final Double marginCallRatioThreshold;

    public MarginTradingDTO() {
        Double r1 = null;
        Double r2 = null;
        Integer r3 = null;
        Double r4 = null;
        Integer r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final Integer a() {
        return this.activeMarginCallCounter;
    }

    public final Double b() {
        return this.atRiskRatioThreshold;
    }

    public final Double c() {
        return this.forceSellRatioThreshold;
    }

    public final Double d() {
        return this.marginCallRatioThreshold;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MarginTradingDTO) == true) goto L8;
        return false;
    L8:
        MarginTradingDTO r52 = (MarginTradingDTO) r5;
        if (p.g(this.atRiskRatioThreshold, r52.atRiskRatioThreshold) == true) goto L12;
        return false;
    L12:
        if (p.g(this.forceSellRatioThreshold, r52.forceSellRatioThreshold) == true) goto L15;
        return false;
    L15:
        if (p.g(this.marginCallConsecutiveDays, r52.marginCallConsecutiveDays) == true) goto L18;
        return false;
    L18:
        if (p.g(this.marginCallRatioThreshold, r52.marginCallRatioThreshold) == true) goto L21;
        return false;
    L21:
        if (p.g(this.activeMarginCallCounter, r52.activeMarginCallCounter) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Double r02 = this.atRiskRatioThreshold;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.forceSellRatioThreshold;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.marginCallConsecutiveDays;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.marginCallRatioThreshold;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.activeMarginCallCounter;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
    L17:
        r26 = r25.hashCode();
        goto L18
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
        return "MarginTradingDTO(atRiskRatioThreshold=" + this.atRiskRatioThreshold + ", forceSellRatioThreshold=" + this.forceSellRatioThreshold + ", marginCallConsecutiveDays=" + this.marginCallConsecutiveDays + ", marginCallRatioThreshold=" + this.marginCallRatioThreshold + ", activeMarginCallCounter=" + this.activeMarginCallCounter + ")";
    }

    public MarginTradingDTO(Double r1, Double r2, Integer r3, Double r4, Integer r5) {
        this.atRiskRatioThreshold = r1;
        this.forceSellRatioThreshold = r2;
        this.marginCallConsecutiveDays = r3;
        this.marginCallRatioThreshold = r4;
        this.activeMarginCallCounter = r5;
    }

    public /* synthetic */ MarginTradingDTO(Double r2, Double r3, Integer r4, Double r5, Integer r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        Integer r72 = null;
    L17:
        Double r62 = r5;
        Integer r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
