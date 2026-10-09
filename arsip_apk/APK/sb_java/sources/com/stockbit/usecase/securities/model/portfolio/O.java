package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final String f161695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161696b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161697c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161698e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161699f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161700g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161701h;

    public O(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "availableLot");
        kotlin.jvm.internal.p.l(r3, "averagePrice");
        kotlin.jvm.internal.p.l(r4, "averagePriceFee");
        kotlin.jvm.internal.p.l(r5, "currentPrice");
        kotlin.jvm.internal.p.l(r6, "marketValue");
        kotlin.jvm.internal.p.l(r7, "gain");
        kotlin.jvm.internal.p.l(r8, "profitLoss");
        kotlin.jvm.internal.p.l(r9, "total");
        this.f161695a = r2;
        this.f161696b = r3;
        this.f161697c = r4;
        this.d = r5;
        this.f161698e = r6;
        this.f161699f = r7;
        this.f161700g = r8;
        this.f161701h = r9;
    }

    public final String a() {
        return this.f161695a;
    }

    public final String b() {
        return this.f161696b;
    }

    public final String c() {
        return this.f161697c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f161699f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof O) == true) goto L8;
        return false;
    L8:
        O r52 = (O) r5;
        if (kotlin.jvm.internal.p.g(this.f161695a, r52.f161695a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161696b, r52.f161696b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161697c, r52.f161697c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161698e, r52.f161698e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161699f, r52.f161699f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f161700g, r52.f161700g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f161701h, r52.f161701h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f161698e;
    }

    public int hashCode() {
        return (((((((((((((this.f161695a.hashCode() * 31) + this.f161696b.hashCode()) * 31) + this.f161697c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161698e.hashCode()) * 31) + this.f161699f.hashCode()) * 31) + this.f161700g.hashCode()) * 31) + this.f161701h.hashCode();
    }

    public String toString() {
        return "RawValuesUIState(availableLot=" + this.f161695a + ", averagePrice=" + this.f161696b + ", averagePriceFee=" + this.f161697c + ", currentPrice=" + this.d + ", marketValue=" + this.f161698e + ", gain=" + this.f161699f + ", profitLoss=" + this.f161700g + ", total=" + this.f161701h + ")";
    }

    public /* synthetic */ O(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = "";
    L26:
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
