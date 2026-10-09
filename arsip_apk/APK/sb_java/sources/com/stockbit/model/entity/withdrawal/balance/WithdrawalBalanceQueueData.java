package com.stockbit.model.entity.withdrawal.balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalBalanceQueueData;", "Landroid/os/Parcelable;", Constants.KEY_TITLE, "", Constants.KEY_DATE, "balance", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getTitle", "()Ljava/lang/String;", "getDate", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/stockbit/model/entity/withdrawal/balance/WithdrawalBalanceQueueData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WithdrawalBalanceQueueData implements Parcelable {
    public static final Parcelable.Creator<WithdrawalBalanceQueueData> CREATOR = null;

    @SerializedName("balance")
    private final Double balance;

    @SerializedName("formatted_date")
    private final String date;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WithdrawalBalanceQueueData a(Parcel r6) {
            p.l(r6, "parcel");
            String r1 = r6.readString();
            String r2 = r6.readString();
            if (r6.readInt() != 0) goto L5;
            Double r62 = null;
        L7:
            return new WithdrawalBalanceQueueData(r1, r2, r62);
        L5:
            r62 = Double.valueOf(r6.readDouble());
            goto L7
        }

        public final WithdrawalBalanceQueueData[] b(int r1) {
            return new WithdrawalBalanceQueueData[r1];
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

    public WithdrawalBalanceQueueData(String r1, String r2, Double r3) {
        this.title = r1;
        this.date = r2;
        this.balance = r3;
    }

    public final Double a() {
        return this.balance;
    }

    public final String b() {
        return this.date;
    }

    public final String c() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WithdrawalBalanceQueueData) == true) goto L8;
        return false;
    L8:
        WithdrawalBalanceQueueData r52 = (WithdrawalBalanceQueueData) r5;
        if (p.g(this.title, r52.title) == true) goto L12;
        return false;
    L12:
        if (p.g(this.date, r52.date) == true) goto L15;
        return false;
    L15:
        if (p.g(this.balance, r52.balance) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.title;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.date;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.balance;
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
        return "WithdrawalBalanceQueueData(title=" + this.title + ", date=" + this.date + ", balance=" + this.balance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.title);
        r3.writeString(this.date);
        Double r42 = this.balance;
        if (r42 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r3.writeDouble(r42.doubleValue());
    }
}
