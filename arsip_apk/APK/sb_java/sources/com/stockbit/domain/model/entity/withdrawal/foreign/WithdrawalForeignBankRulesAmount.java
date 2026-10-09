package com.stockbit.domain.model.entity.withdrawal.foreign;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/foreign/WithdrawalForeignBankRulesAmount;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", Constants.PRIORITY_MAX, "", "min", "<init>", "(Ljava/lang/String;DD)V", "getCurrency", "()Ljava/lang/String;", "getMax", "()D", "getMin", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WithdrawalForeignBankRulesAmount implements Parcelable {
    public static final Parcelable.Creator<WithdrawalForeignBankRulesAmount> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83943a;

    /* renamed from: b, reason: collision with root package name */
    public final double f83944b;

    /* renamed from: c, reason: collision with root package name */
    public final double f83945c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WithdrawalForeignBankRulesAmount a(Parcel r8) {
            p.l(r8, "parcel");
            return new WithdrawalForeignBankRulesAmount(r8.readString(), r8.readDouble(), r8.readDouble());
        }

        public final WithdrawalForeignBankRulesAmount[] b(int r1) {
            return new WithdrawalForeignBankRulesAmount[r1];
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

    public WithdrawalForeignBankRulesAmount(String r2, double r3, double r5) {
        p.l(r2, FirebaseAnalytics.Param.CURRENCY);
        this.f83943a = r2;
        this.f83944b = r3;
        this.f83945c = r5;
    }

    public final double a() {
        return this.f83944b;
    }

    public final double b() {
        return this.f83945c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WithdrawalForeignBankRulesAmount) == true) goto L8;
        return false;
    L8:
        WithdrawalForeignBankRulesAmount r82 = (WithdrawalForeignBankRulesAmount) r8;
        if (p.g(this.f83943a, r82.f83943a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f83944b, r82.f83944b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f83945c, r82.f83945c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83943a.hashCode() * 31) + Double.hashCode(this.f83944b)) * 31) + Double.hashCode(this.f83945c);
    }

    public String toString() {
        return "WithdrawalForeignBankRulesAmount(currency=" + this.f83943a + ", max=" + this.f83944b + ", min=" + this.f83945c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f83943a);
        r3.writeDouble(this.f83944b);
        r3.writeDouble(this.f83945c);
    }

    public /* synthetic */ WithdrawalForeignBankRulesAmount(String r3, double r4, double r6, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = 0.0d;
    L9:
        if ((r8 & 4) == 0) goto L12;
        double r82 = 0.0d;
    L13:
        this(r3, r4, r82);
        return;
    L12:
        r82 = r6;
        goto L13
    }
}
