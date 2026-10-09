package com.stockbit.dto.tradingperformance.totalequityreturn;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/tradingperformance/totalequityreturn/TotalEquityReturnFilterDTO;", "", "totalEquityReturnInterval", "", "totalEquityReturnPeriod", "totalEquityReturnPeriodStart", "totalEquityReturnPeriodEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotalEquityReturnInterval", "()Ljava/lang/String;", "getTotalEquityReturnPeriod", "getTotalEquityReturnPeriodStart", "getTotalEquityReturnPeriodEnd", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TotalEquityReturnFilterDTO {

    @SerializedName("total_equity_return_interval")
    private final String totalEquityReturnInterval;

    @SerializedName("total_equity_return_period")
    private final String totalEquityReturnPeriod;

    @SerializedName("total_equity_return_period_end")
    private final String totalEquityReturnPeriodEnd;

    @SerializedName("total_equity_return_period_start")
    private final String totalEquityReturnPeriodStart;

    public TotalEquityReturnFilterDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final String a() {
        return this.totalEquityReturnInterval;
    }

    public final String b() {
        return this.totalEquityReturnPeriod;
    }

    public final String c() {
        return this.totalEquityReturnPeriodEnd;
    }

    public final String d() {
        return this.totalEquityReturnPeriodStart;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TotalEquityReturnFilterDTO) == true) goto L8;
        return false;
    L8:
        TotalEquityReturnFilterDTO r52 = (TotalEquityReturnFilterDTO) r5;
        if (p.g(this.totalEquityReturnInterval, r52.totalEquityReturnInterval) == true) goto L12;
        return false;
    L12:
        if (p.g(this.totalEquityReturnPeriod, r52.totalEquityReturnPeriod) == true) goto L15;
        return false;
    L15:
        if (p.g(this.totalEquityReturnPeriodStart, r52.totalEquityReturnPeriodStart) == true) goto L18;
        return false;
    L18:
        if (p.g(this.totalEquityReturnPeriodEnd, r52.totalEquityReturnPeriodEnd) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.totalEquityReturnInterval;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.totalEquityReturnPeriod;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.totalEquityReturnPeriodStart;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.totalEquityReturnPeriodEnd;
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
        return "TotalEquityReturnFilterDTO(totalEquityReturnInterval=" + this.totalEquityReturnInterval + ", totalEquityReturnPeriod=" + this.totalEquityReturnPeriod + ", totalEquityReturnPeriodStart=" + this.totalEquityReturnPeriodStart + ", totalEquityReturnPeriodEnd=" + this.totalEquityReturnPeriodEnd + ")";
    }

    public TotalEquityReturnFilterDTO(String r1, String r2, String r3, String r4) {
        this.totalEquityReturnInterval = r1;
        this.totalEquityReturnPeriod = r2;
        this.totalEquityReturnPeriodStart = r3;
        this.totalEquityReturnPeriodEnd = r4;
    }

    public /* synthetic */ TotalEquityReturnFilterDTO(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
