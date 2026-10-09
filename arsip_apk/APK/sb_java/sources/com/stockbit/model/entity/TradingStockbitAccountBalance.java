package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006$"}, d2 = {"Lcom/stockbit/model/entity/TradingStockbitAccountBalance;", "Landroid/os/Parcelable;", "accountNumber", "", "balance", "", "portfolioName", "totalBalance", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "getAccountNumber", "()Ljava/lang/String;", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPortfolioName", "getTotalBalance", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/stockbit/model/entity/TradingStockbitAccountBalance;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TradingStockbitAccountBalance implements Parcelable {
    public static final Parcelable.Creator<TradingStockbitAccountBalance> CREATOR = null;

    @SerializedName("account_number")
    private final String accountNumber;

    @SerializedName("balance")
    private final Double balance;

    @SerializedName("portfolio_name")
    private final String portfolioName;

    @SerializedName("total_balance")
    private final Double totalBalance;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingStockbitAccountBalance a(Parcel r8) {
            p.l(r8, "parcel");
            String r1 = r8.readString();
            Double r3 = null;
            if (r8.readInt() != 0) goto L5;
            Double r2 = null;
        L6:
            String r4 = r8.readString();
            if (r8.readInt() == 0) goto L11;
            r3 = Double.valueOf(r8.readDouble());
        L11:
            return new TradingStockbitAccountBalance(r1, r2, r4, r3);
        L5:
            r2 = Double.valueOf(r8.readDouble());
            goto L6
        }

        public final TradingStockbitAccountBalance[] b(int r1) {
            return new TradingStockbitAccountBalance[r1];
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

    public TradingStockbitAccountBalance() {
        String r1 = null;
        Double r2 = null;
        String r3 = null;
        Double r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final String a() {
        return this.accountNumber;
    }

    public final Double b() {
        return this.balance;
    }

    public final String c() {
        return this.portfolioName;
    }

    public final Double d() {
        return this.totalBalance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingStockbitAccountBalance) == true) goto L8;
        return false;
    L8:
        TradingStockbitAccountBalance r52 = (TradingStockbitAccountBalance) r5;
        if (p.g(this.accountNumber, r52.accountNumber) == true) goto L12;
        return false;
    L12:
        if (p.g(this.balance, r52.balance) == true) goto L15;
        return false;
    L15:
        if (p.g(this.portfolioName, r52.portfolioName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.totalBalance, r52.totalBalance) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.accountNumber;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.balance;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.portfolioName;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.totalBalance;
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
        return "TradingStockbitAccountBalance(accountNumber=" + this.accountNumber + ", balance=" + this.balance + ", portfolioName=" + this.portfolioName + ", totalBalance=" + this.totalBalance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        r5.writeString(this.accountNumber);
        Double r62 = this.balance;
        if (r62 != null) goto L5;
        r5.writeInt(0);
    L6:
        r5.writeString(this.portfolioName);
        Double r63 = this.totalBalance;
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

    public TradingStockbitAccountBalance(String r1, Double r2, String r3, Double r4) {
        this.accountNumber = r1;
        this.balance = r2;
        this.portfolioName = r3;
        this.totalBalance = r4;
    }

    public /* synthetic */ TradingStockbitAccountBalance(String r2, Double r3, String r4, Double r5, int r6, i r7) {
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
