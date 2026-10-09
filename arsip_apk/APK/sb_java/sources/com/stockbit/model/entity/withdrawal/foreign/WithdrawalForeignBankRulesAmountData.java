package com.stockbit.model.entity.withdrawal.foreign;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006%"}, d2 = {"Lcom/stockbit/model/entity/withdrawal/foreign/WithdrawalForeignBankRulesAmountData;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "Lcom/stockbit/model/entity/withdrawal/foreign/WithdrawalForeignBankRulesCurrencyData;", Constants.PRIORITY_MAX, "", "min", "<init>", "(Lcom/stockbit/model/entity/withdrawal/foreign/WithdrawalForeignBankRulesCurrencyData;DD)V", "getCurrency", "()Lcom/stockbit/model/entity/withdrawal/foreign/WithdrawalForeignBankRulesCurrencyData;", "setCurrency", "(Lcom/stockbit/model/entity/withdrawal/foreign/WithdrawalForeignBankRulesCurrencyData;)V", "getMax", "()D", "setMax", "(D)V", "getMin", "setMin", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WithdrawalForeignBankRulesAmountData implements Parcelable {
    public static final Parcelable.Creator<WithdrawalForeignBankRulesAmountData> CREATOR = null;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    private WithdrawalForeignBankRulesCurrencyData currency;

    @SerializedName(Constants.PRIORITY_MAX)
    private double max;

    @SerializedName("min")
    private double min;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WithdrawalForeignBankRulesAmountData a(Parcel r8) {
            p.l(r8, "parcel");
            return new WithdrawalForeignBankRulesAmountData(WithdrawalForeignBankRulesCurrencyData.CREATOR.createFromParcel(r8), r8.readDouble(), r8.readDouble());
        }

        public final WithdrawalForeignBankRulesAmountData[] b(int r1) {
            return new WithdrawalForeignBankRulesAmountData[r1];
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

    public WithdrawalForeignBankRulesAmountData(WithdrawalForeignBankRulesCurrencyData r2, double r3, double r5) {
        p.l(r2, FirebaseAnalytics.Param.CURRENCY);
        this.currency = r2;
        this.max = r3;
        this.min = r5;
    }

    public final WithdrawalForeignBankRulesCurrencyData a() {
        return this.currency;
    }

    public final double b() {
        return this.max;
    }

    public final double c() {
        return this.min;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WithdrawalForeignBankRulesAmountData) == true) goto L8;
        return false;
    L8:
        WithdrawalForeignBankRulesAmountData r82 = (WithdrawalForeignBankRulesAmountData) r8;
        if (p.g(this.currency, r82.currency) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.max, r82.max) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.min, r82.min) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.currency.hashCode() * 31) + Double.hashCode(this.max)) * 31) + Double.hashCode(this.min);
    }

    public String toString() {
        return "WithdrawalForeignBankRulesAmountData(currency=" + this.currency + ", max=" + this.max + ", min=" + this.min + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        this.currency.writeToParcel(r3, r4);
        r3.writeDouble(this.max);
        r3.writeDouble(this.min);
    }
}
