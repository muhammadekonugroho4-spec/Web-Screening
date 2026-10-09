package com.stockbit.domain.param.securities;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f87530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87532c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f87533e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87534f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87535g;

    public n(String r2, String r3, String r4, int r5, float r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "type");
        kotlin.jvm.internal.p.l(r4, "boardType");
        kotlin.jvm.internal.p.l(r7, "priceAlgorithm");
        kotlin.jvm.internal.p.l(r8, "orderType");
        this.f87530a = r2;
        this.f87531b = r3;
        this.f87532c = r4;
        this.d = r5;
        this.f87533e = r6;
        this.f87534f = r7;
        this.f87535g = r8;
    }

    public final String a() {
        return this.f87532c;
    }

    public final String b() {
        return this.f87535g;
    }

    public final String c() {
        return this.f87534f;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.f87530a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f87530a, r52.f87530a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87531b, r52.f87531b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87532c, r52.f87532c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (Float.compare(this.f87533e, r52.f87533e) == 0) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87534f, r52.f87534f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87535g, r52.f87535g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final float f() {
        return this.f87533e;
    }

    public final String g() {
        return this.f87531b;
    }

    public int hashCode() {
        return (((((((((((this.f87530a.hashCode() * 31) + this.f87531b.hashCode()) * 31) + this.f87532c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Float.hashCode(this.f87533e)) * 31) + this.f87534f.hashCode()) * 31) + this.f87535g.hashCode();
    }

    public String toString() {
        return "PostSellTrailingStopDomainParam(symbol=" + this.f87530a + ", type=" + this.f87531b + ", boardType=" + this.f87532c + ", shares=" + this.d + ", trailPercentage=" + this.f87533e + ", priceAlgorithm=" + this.f87534f + ", orderType=" + this.f87535g + ")";
    }
}
