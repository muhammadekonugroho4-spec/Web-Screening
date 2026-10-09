package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10931m {

    /* renamed from: a, reason: collision with root package name */
    public final String f161769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161770b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161771c;
    public final boolean d;

    public C10931m(String r2, String r3, String r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "invested");
        kotlin.jvm.internal.p.l(r3, "marketPrice");
        kotlin.jvm.internal.p.l(r4, "gain");
        this.f161769a = r2;
        this.f161770b = r3;
        this.f161771c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f161771c;
    }

    public final String b() {
        return this.f161769a;
    }

    public final String c() {
        return this.f161770b;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10931m) == true) goto L8;
        return false;
    L8:
        C10931m r52 = (C10931m) r5;
        if (kotlin.jvm.internal.p.g(this.f161769a, r52.f161769a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161770b, r52.f161770b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161771c, r52.f161771c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f161769a.hashCode() * 31) + this.f161770b.hashCode()) * 31) + this.f161771c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "MarginDelistedTotalUIData(invested=" + this.f161769a + ", marketPrice=" + this.f161770b + ", gain=" + this.f161771c + ", isProfit=" + this.d + ")";
    }

    public /* synthetic */ C10931m(String r2, String r3, String r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
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
        r5 = false;
    L14:
        this(r2, r3, r4, r5);
    }
}
