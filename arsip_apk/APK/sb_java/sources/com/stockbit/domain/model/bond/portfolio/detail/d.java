package com.stockbit.domain.model.bond.portfolio.detail;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f80804a;

    /* renamed from: b, reason: collision with root package name */
    public final double f80805b;

    /* renamed from: c, reason: collision with root package name */
    public final double f80806c;
    public final String d;

    public d(double r2, double r4, double r6, String r8) {
        p.l(r8, Constants.KEY_DATE);
        this.f80804a = r2;
        this.f80805b = r4;
        this.f80806c = r6;
        this.d = r8;
    }

    public final double a() {
        return this.f80804a;
    }

    public final String b() {
        return this.d;
    }

    public final double c() {
        return this.f80805b;
    }

    public final double d() {
        return this.f80806c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (Double.compare(this.f80804a, r82.f80804a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f80805b, r82.f80805b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f80806c, r82.f80806c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f80804a) * 31) + Double.hashCode(this.f80805b)) * 31) + Double.hashCode(this.f80806c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BondsPortfolioDetailItemEntity(amount=" + this.f80804a + ", sellerCoupon=" + this.f80805b + ", userCoupon=" + this.f80806c + ", date=" + this.d + ")";
    }
}
