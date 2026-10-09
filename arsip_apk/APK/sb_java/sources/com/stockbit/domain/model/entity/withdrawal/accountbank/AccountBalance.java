package com.stockbit.domain.model.entity.withdrawal.accountbank;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/accountbank/AccountBalance;", "Landroid/os/Parcelable;", "accountNumber", "", "balance", "", "totalBalance", "portfolioName", "ifaAllowWithdraw", "", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getBalance", "()D", "getTotalBalance", "getPortfolioName", "getIfaAllowWithdraw", "()Z", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccountBalance implements Parcelable {
    public static final Parcelable.Creator<AccountBalance> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83895a;

    /* renamed from: b, reason: collision with root package name */
    public final double f83896b;

    /* renamed from: c, reason: collision with root package name */
    public final double f83897c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83898e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AccountBalance a(Parcel r10) {
            p.l(r10, "parcel");
            String r2 = r10.readString();
            double r3 = r10.readDouble();
            double r5 = r10.readDouble();
            String r7 = r10.readString();
            if (r10.readInt() == 0) goto L6;
            boolean r102 = true;
        L8:
            return new AccountBalance(r2, r3, r5, r7, r102);
        L6:
            r102 = false;
            goto L8
        }

        public final AccountBalance[] b(int r1) {
            return new AccountBalance[r1];
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

    public AccountBalance(String r2, double r3, double r5, String r7, boolean r8) {
        p.l(r2, "accountNumber");
        p.l(r7, "portfolioName");
        this.f83895a = r2;
        this.f83896b = r3;
        this.f83897c = r5;
        this.d = r7;
        this.f83898e = r8;
    }

    public final String a() {
        return this.f83895a;
    }

    public final double b() {
        return this.f83896b;
    }

    public final boolean c() {
        return this.f83898e;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final double e() {
        return this.f83897c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AccountBalance) == true) goto L8;
        return false;
    L8:
        AccountBalance r82 = (AccountBalance) r8;
        if (p.g(this.f83895a, r82.f83895a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f83896b, r82.f83896b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f83897c, r82.f83897c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f83898e == r82.f83898e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f83895a.hashCode() * 31) + Double.hashCode(this.f83896b)) * 31) + Double.hashCode(this.f83897c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f83898e);
    }

    public String toString() {
        return "AccountBalance(accountNumber=" + this.f83895a + ", balance=" + this.f83896b + ", totalBalance=" + this.f83897c + ", portfolioName=" + this.d + ", ifaAllowWithdraw=" + this.f83898e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f83895a);
        r3.writeDouble(this.f83896b);
        r3.writeDouble(this.f83897c);
        r3.writeString(this.d);
        r3.writeInt(this.f83898e ? 1 : 0);
    }
}
