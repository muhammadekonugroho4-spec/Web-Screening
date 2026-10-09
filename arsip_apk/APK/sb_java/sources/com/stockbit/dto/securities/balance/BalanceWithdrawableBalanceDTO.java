package com.stockbit.dto.securities.balance;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/stockbit/dto/securities/balance/BalanceWithdrawableBalanceDTO;", "", "leverageLiability", "", "netWithdrawable", TransactionResult.STATUS_PENDING, "transaction", "withdrawable", "cashSweepInfo", "Lcom/stockbit/dto/securities/balance/BalanceWithdrawableCashSweepInfoDTO;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/dto/securities/balance/BalanceWithdrawableCashSweepInfoDTO;)V", "getLeverageLiability", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNetWithdrawable", "getPending", "getTransaction", "getWithdrawable", "getCashSweepInfo", "()Lcom/stockbit/dto/securities/balance/BalanceWithdrawableCashSweepInfoDTO;", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/dto/securities/balance/BalanceWithdrawableCashSweepInfoDTO;)Lcom/stockbit/dto/securities/balance/BalanceWithdrawableBalanceDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BalanceWithdrawableBalanceDTO {

    @SerializedName("cash_sweep_info")
    private final BalanceWithdrawableCashSweepInfoDTO cashSweepInfo;

    @SerializedName("leverage_liability")
    private final Double leverageLiability;

    @SerializedName("net_withdrawable")
    private final Double netWithdrawable;

    @SerializedName(TransactionResult.STATUS_PENDING)
    private final Double pending;

    @SerializedName("transaction")
    private final Double transaction;

    @SerializedName("withdrawable")
    private final Double withdrawable;

    public BalanceWithdrawableBalanceDTO(Double r1, Double r2, Double r3, Double r4, Double r5, BalanceWithdrawableCashSweepInfoDTO r6) {
        this.leverageLiability = r1;
        this.netWithdrawable = r2;
        this.pending = r3;
        this.transaction = r4;
        this.withdrawable = r5;
        this.cashSweepInfo = r6;
    }

    public final BalanceWithdrawableCashSweepInfoDTO a() {
        return this.cashSweepInfo;
    }

    public final Double b() {
        return this.leverageLiability;
    }

    public final Double c() {
        return this.netWithdrawable;
    }

    public final Double d() {
        return this.pending;
    }

    public final Double e() {
        return this.transaction;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BalanceWithdrawableBalanceDTO) == true) goto L8;
        return false;
    L8:
        BalanceWithdrawableBalanceDTO r52 = (BalanceWithdrawableBalanceDTO) r5;
        if (p.g(this.leverageLiability, r52.leverageLiability) == true) goto L12;
        return false;
    L12:
        if (p.g(this.netWithdrawable, r52.netWithdrawable) == true) goto L15;
        return false;
    L15:
        if (p.g(this.pending, r52.pending) == true) goto L18;
        return false;
    L18:
        if (p.g(this.transaction, r52.transaction) == true) goto L21;
        return false;
    L21:
        if (p.g(this.withdrawable, r52.withdrawable) == true) goto L24;
        return false;
    L24:
        if (p.g(this.cashSweepInfo, r52.cashSweepInfo) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final Double f() {
        return this.withdrawable;
    }

    public int hashCode() {
        Double r02 = this.leverageLiability;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.netWithdrawable;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.pending;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.transaction;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Double r27 = this.withdrawable;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        BalanceWithdrawableCashSweepInfoDTO r29 = this.cashSweepInfo;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
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
        return "BalanceWithdrawableBalanceDTO(leverageLiability=" + this.leverageLiability + ", netWithdrawable=" + this.netWithdrawable + ", pending=" + this.pending + ", transaction=" + this.transaction + ", withdrawable=" + this.withdrawable + ", cashSweepInfo=" + this.cashSweepInfo + ")";
    }

    public /* synthetic */ BalanceWithdrawableBalanceDTO(Double r2, Double r3, Double r4, Double r5, Double r6, BalanceWithdrawableCashSweepInfoDTO r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        BalanceWithdrawableCashSweepInfoDTO r82 = r7;
        Double r72 = null;
    L17:
        Double r62 = r5;
        Double r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L18:
        r82 = r7;
        r72 = r6;
        goto L17
    }
}
