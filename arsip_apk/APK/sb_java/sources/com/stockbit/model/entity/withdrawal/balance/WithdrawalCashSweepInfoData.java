package com.stockbit.model.entity.withdrawal.balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalCashSweepInfoData;", "Landroid/os/Parcelable;", TransactionResult.STATUS_PENDING, "", "pendingRedemption", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getPending", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPendingRedemption", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalCashSweepInfoData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WithdrawalCashSweepInfoData implements Parcelable {
    public static final Parcelable.Creator<WithdrawalCashSweepInfoData> CREATOR = null;

    @SerializedName(TransactionResult.STATUS_PENDING)
    private final Double pending;

    @SerializedName("pending_redemption")
    private final Double pendingRedemption;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WithdrawalCashSweepInfoData a(Parcel r6) {
            p.l(r6, "parcel");
            Double r2 = null;
            if (r6.readInt() != 0) goto L5;
            Double r1 = null;
        L7:
            if (r6.readInt() == 0) goto L11;
            r2 = Double.valueOf(r6.readDouble());
        L11:
            return new WithdrawalCashSweepInfoData(r1, r2);
        L5:
            r1 = Double.valueOf(r6.readDouble());
            goto L7
        }

        public final WithdrawalCashSweepInfoData[] b(int r1) {
            return new WithdrawalCashSweepInfoData[r1];
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

    public WithdrawalCashSweepInfoData(Double r1, Double r2) {
        this.pending = r1;
        this.pendingRedemption = r2;
    }

    public final Double a() {
        return this.pending;
    }

    public final Double b() {
        return this.pendingRedemption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WithdrawalCashSweepInfoData) == true) goto L8;
        return false;
    L8:
        WithdrawalCashSweepInfoData r52 = (WithdrawalCashSweepInfoData) r5;
        if (p.g(this.pending, r52.pending) == true) goto L12;
        return false;
    L12:
        if (p.g(this.pendingRedemption, r52.pendingRedemption) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Double r02 = this.pending;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.pendingRedemption;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "WithdrawalCashSweepInfoData(pending=" + this.pending + ", pendingRedemption=" + this.pendingRedemption + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        Double r62 = this.pending;
        if (r62 != null) goto L5;
        r5.writeInt(0);
    L6:
        Double r63 = this.pendingRedemption;
        if (r63 != null) goto L10;
        r5.writeInt(0);
        return;
    L10:
        r5.writeInt(1);
        r5.writeDouble(r63.doubleValue());
        return;
    L5:
        r5.writeInt(1);
        r5.writeDouble(r62.doubleValue());
        goto L6
    }
}
