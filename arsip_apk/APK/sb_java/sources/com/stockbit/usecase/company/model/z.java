package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f156712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156713b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156714c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156715e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156716f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156717g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f156718h;

    public z(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "ratiosFormatted");
        kotlin.jvm.internal.p.l(r4, "cumDate");
        kotlin.jvm.internal.p.l(r5, "exDate");
        kotlin.jvm.internal.p.l(r6, "recDate");
        kotlin.jvm.internal.p.l(r7, "payDate");
        kotlin.jvm.internal.p.l(r8, "factor");
        this.f156712a = r2;
        this.f156713b = r3;
        this.f156714c = r4;
        this.d = r5;
        this.f156715e = r6;
        this.f156716f = r7;
        this.f156717g = r8;
        this.f156718h = r9;
    }

    public final String a() {
        return this.f156712a;
    }

    public final String b() {
        return this.f156714c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f156717g;
    }

    public final String e() {
        return this.f156716f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (kotlin.jvm.internal.p.g(this.f156712a, r52.f156712a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156713b, r52.f156713b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156714c, r52.f156714c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156715e, r52.f156715e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156716f, r52.f156716f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156717g, r52.f156717g) == true) goto L30;
        return false;
    L30:
        if (this.f156718h == r52.f156718h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f156713b;
    }

    public final String g() {
        return this.f156715e;
    }

    public final boolean h() {
        return this.f156718h;
    }

    public int hashCode() {
        return (((((((((((((this.f156712a.hashCode() * 31) + this.f156713b.hashCode()) * 31) + this.f156714c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156715e.hashCode()) * 31) + this.f156716f.hashCode()) * 31) + this.f156717g.hashCode()) * 31) + Boolean.hashCode(this.f156718h);
    }

    public String toString() {
        return "CorpActionStockDividendUIState(companySymbol=" + this.f156712a + ", ratiosFormatted=" + this.f156713b + ", cumDate=" + this.f156714c + ", exDate=" + this.d + ", recDate=" + this.f156715e + ", payDate=" + this.f156716f + ", factor=" + this.f156717g + ", isActive=" + this.f156718h + ")";
    }

    public /* synthetic */ z(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, int r10, kotlin.jvm.internal.i r11) {
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
        if ((r10 & 128) == 0) goto L26;
        r9 = false;
    L26:
        boolean r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
    }
}
