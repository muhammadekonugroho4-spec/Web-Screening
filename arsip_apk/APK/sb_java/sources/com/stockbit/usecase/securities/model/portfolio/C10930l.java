package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10930l {

    /* renamed from: a, reason: collision with root package name */
    public final String f161765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161767c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f161768e;

    public C10930l(String r2, String r3, String r4, String r5, boolean r6) {
        kotlin.jvm.internal.p.l(r2, "currentMarginRatio");
        kotlin.jvm.internal.p.l(r3, "potentialMarginRatio");
        kotlin.jvm.internal.p.l(r4, "asOfDate");
        kotlin.jvm.internal.p.l(r5, "potentialAction");
        this.f161765a = r2;
        this.f161766b = r3;
        this.f161767c = r4;
        this.d = r5;
        this.f161768e = r6;
    }

    public final String a() {
        return this.f161767c;
    }

    public final String b() {
        return this.f161765a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f161766b;
    }

    public final boolean e() {
        return this.f161768e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10930l) == true) goto L8;
        return false;
    L8:
        C10930l r52 = (C10930l) r5;
        if (kotlin.jvm.internal.p.g(this.f161765a, r52.f161765a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161766b, r52.f161766b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161767c, r52.f161767c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f161768e == r52.f161768e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f161765a.hashCode() * 31) + this.f161766b.hashCode()) * 31) + this.f161767c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f161768e);
    }

    public String toString() {
        return "MarginDelistedRatioUIData(currentMarginRatio=" + this.f161765a + ", potentialMarginRatio=" + this.f161766b + ", asOfDate=" + this.f161767c + ", potentialAction=" + this.d + ", isPotentialForceSell=" + this.f161768e + ")";
    }

    public /* synthetic */ C10930l(String r2, String r3, String r4, String r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = false;
    L17:
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}
