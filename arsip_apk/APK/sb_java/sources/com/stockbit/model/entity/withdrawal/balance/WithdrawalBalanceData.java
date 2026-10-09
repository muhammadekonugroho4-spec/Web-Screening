package com.stockbit.model.entity.withdrawal.balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalBalanceData;", "Landroid/os/Parcelable;", "transaction", "", TransactionResult.STATUS_PENDING, "withdrawable", "leverageLiability", "netWithdrawable", "cashSweepInfo", "Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalCashSweepInfoData;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalCashSweepInfoData;)V", "getTransaction", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPending", "getWithdrawable", "getLeverageLiability", "getNetWithdrawable", "getCashSweepInfo", "()Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalCashSweepInfoData;", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalCashSweepInfoData;)Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalBalanceData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WithdrawalBalanceData implements Parcelable {
    public static final Parcelable.Creator<WithdrawalBalanceData> CREATOR = null;

    @SerializedName("cash_sweep_info")
    private final WithdrawalCashSweepInfoData cashSweepInfo;

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

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WithdrawalBalanceData a(Parcel r9) {
            p.l(r9, "parcel");
            WithdrawalCashSweepInfoData r2 = null;
            if (r9.readInt() != 0) goto L5;
            Double r02 = null;
        L7:
            if (r9.readInt() != 0) goto L9;
            Double r3 = null;
        L11:
            if (r9.readInt() != 0) goto L13;
            Double r4 = null;
        L15:
            if (r9.readInt() != 0) goto L17;
            Double r5 = null;
        L19:
            if (r9.readInt() != 0) goto L21;
            Double r6 = null;
        L23:
            if (r9.readInt() == 0) goto L27;
            r2 = WithdrawalCashSweepInfoData.CREATOR.createFromParcel(r9);
        L27:
            return new WithdrawalBalanceData(r02, r3, r4, r5, r6, r2);
        L21:
            r6 = Double.valueOf(r9.readDouble());
            goto L23
        L17:
            r5 = Double.valueOf(r9.readDouble());
            goto L19
        L13:
            r4 = Double.valueOf(r9.readDouble());
            goto L15
        L9:
            r3 = Double.valueOf(r9.readDouble());
            goto L11
        L5:
            r02 = Double.valueOf(r9.readDouble());
            goto L7
        }

        public final WithdrawalBalanceData[] b(int r1) {
            return new WithdrawalBalanceData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public WithdrawalBalanceData(Double r1, Double r2, Double r3, Double r4, Double r5, WithdrawalCashSweepInfoData r6) {
        this.transaction = r1;
        this.pending = r2;
        this.withdrawable = r3;
        this.leverageLiability = r4;
        this.netWithdrawable = r5;
        this.cashSweepInfo = r6;
    }

    public final WithdrawalCashSweepInfoData a() {
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Double e() {
        return this.transaction;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WithdrawalBalanceData) == true) goto L8;
        return false;
    L8:
        WithdrawalBalanceData r52 = (WithdrawalBalanceData) r5;
        if (p.g(this.transaction, r52.transaction) == true) goto L12;
        return false;
    L12:
        if (p.g(this.pending, r52.pending) == true) goto L15;
        return false;
    L15:
        if (p.g(this.withdrawable, r52.withdrawable) == true) goto L18;
        return false;
    L18:
        if (p.g(this.leverageLiability, r52.leverageLiability) == true) goto L21;
        return false;
    L21:
        if (p.g(this.netWithdrawable, r52.netWithdrawable) == true) goto L24;
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
        Double r02 = this.transaction;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.pending;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.withdrawable;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.leverageLiability;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Double r27 = this.netWithdrawable;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        WithdrawalCashSweepInfoData r29 = this.cashSweepInfo;
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
        return "WithdrawalBalanceData(transaction=" + this.transaction + ", pending=" + this.pending + ", withdrawable=" + this.withdrawable + ", leverageLiability=" + this.leverageLiability + ", netWithdrawable=" + this.netWithdrawable + ", cashSweepInfo=" + this.cashSweepInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        p.l(r6, "dest");
        Double r02 = this.transaction;
        if (r02 != null) goto L5;
        r6.writeInt(0);
    L6:
        Double r03 = this.pending;
        if (r03 != null) goto L9;
        r6.writeInt(0);
    L10:
        Double r04 = this.withdrawable;
        if (r04 != null) goto L13;
        r6.writeInt(0);
    L14:
        Double r05 = this.leverageLiability;
        if (r05 != null) goto L17;
        r6.writeInt(0);
    L18:
        Double r06 = this.netWithdrawable;
        if (r06 != null) goto L21;
        r6.writeInt(0);
    L22:
        WithdrawalCashSweepInfoData r07 = this.cashSweepInfo;
        if (r07 != null) goto L26;
        r6.writeInt(0);
        return;
    L26:
        r6.writeInt(1);
        r07.writeToParcel(r6, r7);
        return;
    L21:
        r6.writeInt(1);
        r6.writeDouble(r06.doubleValue());
        goto L22
    L17:
        r6.writeInt(1);
        r6.writeDouble(r05.doubleValue());
        goto L18
    L13:
        r6.writeInt(1);
        r6.writeDouble(r04.doubleValue());
        goto L14
    L9:
        r6.writeInt(1);
        r6.writeDouble(r03.doubleValue());
        goto L10
    L5:
        r6.writeInt(1);
        r6.writeDouble(r02.doubleValue());
        goto L6
    }
}
