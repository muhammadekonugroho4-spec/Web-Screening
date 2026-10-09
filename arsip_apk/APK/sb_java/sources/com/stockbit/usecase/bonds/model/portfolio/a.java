package com.stockbit.usecase.bonds.model.portfolio;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f154670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154671b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154672c;
    public final String d;

    public a(String r2, String r3, String r4, String r5) {
        p.l(r2, "amount");
        p.l(r3, "sellerCoupon");
        p.l(r4, "userCoupon");
        p.l(r5, Constants.KEY_DATE);
        this.f154670a = r2;
        this.f154671b = r3;
        this.f154672c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f154670a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f154671b;
    }

    public final String d() {
        return this.f154672c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f154670a, r52.f154670a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154671b, r52.f154671b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154672c, r52.f154672c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154670a.hashCode() * 31) + this.f154671b.hashCode()) * 31) + this.f154672c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BondPortfolioDetailCouponHistoryItemUIState(amount=" + this.f154670a + ", sellerCoupon=" + this.f154671b + ", userCoupon=" + this.f154672c + ", date=" + this.d + ")";
    }

    public /* synthetic */ a(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
