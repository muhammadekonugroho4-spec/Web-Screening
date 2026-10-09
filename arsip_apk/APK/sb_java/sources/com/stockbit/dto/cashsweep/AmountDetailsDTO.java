package com.stockbit.dto.cashsweep;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/cashsweep/AmountDetailsDTO;", "", "withdrawBalance", "", "cashSweep", "fee", "total", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getWithdrawBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCashSweep", "getFee", "getTotal", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/cashsweep/AmountDetailsDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AmountDetailsDTO {

    @SerializedName("cash_sweep")
    private final Double cashSweep;

    @SerializedName("fee")
    private final Double fee;

    @SerializedName("total")
    private final Double total;

    @SerializedName("withdraw_balance")
    private final Double withdrawBalance;

    public AmountDetailsDTO() {
        Double r1 = null;
        Double r2 = null;
        Double r3 = null;
        Double r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Double a() {
        return this.cashSweep;
    }

    public final Double b() {
        return this.fee;
    }

    public final Double c() {
        return this.total;
    }

    public final Double d() {
        return this.withdrawBalance;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AmountDetailsDTO) == true) goto L8;
        return false;
    L8:
        AmountDetailsDTO r52 = (AmountDetailsDTO) r5;
        if (p.g(this.withdrawBalance, r52.withdrawBalance) == true) goto L12;
        return false;
    L12:
        if (p.g(this.cashSweep, r52.cashSweep) == true) goto L15;
        return false;
    L15:
        if (p.g(this.fee, r52.fee) == true) goto L18;
        return false;
    L18:
        if (p.g(this.total, r52.total) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Double r02 = this.withdrawBalance;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.cashSweep;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.fee;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.total;
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
        return "AmountDetailsDTO(withdrawBalance=" + this.withdrawBalance + ", cashSweep=" + this.cashSweep + ", fee=" + this.fee + ", total=" + this.total + ")";
    }

    public AmountDetailsDTO(Double r1, Double r2, Double r3, Double r4) {
        this.withdrawBalance = r1;
        this.cashSweep = r2;
        this.fee = r3;
        this.total = r4;
    }

    public /* synthetic */ AmountDetailsDTO(Double r2, Double r3, Double r4, Double r5, int r6, i r7) {
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
