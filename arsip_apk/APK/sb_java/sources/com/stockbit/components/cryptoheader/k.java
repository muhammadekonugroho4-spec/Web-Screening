package com.stockbit.components.cryptoheader;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f78281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78283c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78284e;

    /* renamed from: f, reason: collision with root package name */
    public final String f78285f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78286g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78287h;

    static {
    }

    public k(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "coinSymbol");
        kotlin.jvm.internal.p.l(r3, "coinName");
        kotlin.jvm.internal.p.l(r4, "coinLogo");
        kotlin.jvm.internal.p.l(r5, "currentPrice");
        kotlin.jvm.internal.p.l(r6, "changeAmount");
        kotlin.jvm.internal.p.l(r7, "changePct");
        kotlin.jvm.internal.p.l(r8, "usdPrice");
        this.f78281a = r2;
        this.f78282b = r3;
        this.f78283c = r4;
        this.d = r5;
        this.f78284e = r6;
        this.f78285f = r7;
        this.f78286g = r8;
        this.f78287h = r9;
    }

    public final String a() {
        return this.f78284e;
    }

    public final String b() {
        return this.f78285f;
    }

    public final String c() {
        return this.f78283c;
    }

    public final String d() {
        return this.f78282b;
    }

    public final String e() {
        return this.f78281a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f78281a, r52.f78281a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f78282b, r52.f78282b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f78283c, r52.f78283c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f78284e, r52.f78284e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f78285f, r52.f78285f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f78286g, r52.f78286g) == true) goto L30;
        return false;
    L30:
        if (this.f78287h == r52.f78287h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f78286g;
    }

    public final boolean h() {
        return this.f78287h;
    }

    public int hashCode() {
        return (((((((((((((this.f78281a.hashCode() * 31) + this.f78282b.hashCode()) * 31) + this.f78283c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f78284e.hashCode()) * 31) + this.f78285f.hashCode()) * 31) + this.f78286g.hashCode()) * 31) + Boolean.hashCode(this.f78287h);
    }

    public String toString() {
        return "CryptoHeaderUIData(coinSymbol=" + this.f78281a + ", coinName=" + this.f78282b + ", coinLogo=" + this.f78283c + ", currentPrice=" + this.d + ", changeAmount=" + this.f78284e + ", changePct=" + this.f78285f + ", usdPrice=" + this.f78286g + ", isPositive=" + this.f78287h + ')';
    }
}
