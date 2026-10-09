package com.stockbit.usecase.bonds.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f154585a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154586b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154587c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f154588e;

    /* renamed from: f, reason: collision with root package name */
    public final String f154589f;

    /* renamed from: g, reason: collision with root package name */
    public final String f154590g;

    /* renamed from: h, reason: collision with root package name */
    public final String f154591h;

    /* renamed from: i, reason: collision with root package name */
    public final String f154592i;

    /* renamed from: j, reason: collision with root package name */
    public final String f154593j;

    public g(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        p.l(r2, "annualCouponRate");
        p.l(r3, "couponDistribution");
        p.l(r4, "dueDate");
        p.l(r5, "issuedDate");
        p.l(r6, "minimumOrder");
        p.l(r7, "nextCouponDate");
        p.l(r8, "buyPrice");
        p.l(r9, "sellPrice");
        p.l(r10, "performance");
        p.l(r11, "yield");
        this.f154585a = r2;
        this.f154586b = r3;
        this.f154587c = r4;
        this.d = r5;
        this.f154588e = r6;
        this.f154589f = r7;
        this.f154590g = r8;
        this.f154591h = r9;
        this.f154592i = r10;
        this.f154593j = r11;
    }

    public final String a() {
        return this.f154585a;
    }

    public final String b() {
        return this.f154590g;
    }

    public final String c() {
        return this.f154586b;
    }

    public final String d() {
        return this.f154587c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f154585a, r52.f154585a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154586b, r52.f154586b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154587c, r52.f154587c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f154588e, r52.f154588e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f154589f, r52.f154589f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f154590g, r52.f154590g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f154591h, r52.f154591h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f154592i, r52.f154592i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f154593j, r52.f154593j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f154588e;
    }

    public final String g() {
        return this.f154589f;
    }

    public final String h() {
        return this.f154591h;
    }

    public int hashCode() {
        return (((((((((((((((((this.f154585a.hashCode() * 31) + this.f154586b.hashCode()) * 31) + this.f154587c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154588e.hashCode()) * 31) + this.f154589f.hashCode()) * 31) + this.f154590g.hashCode()) * 31) + this.f154591h.hashCode()) * 31) + this.f154592i.hashCode()) * 31) + this.f154593j.hashCode();
    }

    public final String i() {
        return this.f154593j;
    }

    public String toString() {
        return "BondFinItemsUIState(annualCouponRate=" + this.f154585a + ", couponDistribution=" + this.f154586b + ", dueDate=" + this.f154587c + ", issuedDate=" + this.d + ", minimumOrder=" + this.f154588e + ", nextCouponDate=" + this.f154589f + ", buyPrice=" + this.f154590g + ", sellPrice=" + this.f154591h + ", performance=" + this.f154592i + ", yield=" + this.f154593j + ")";
    }
}
