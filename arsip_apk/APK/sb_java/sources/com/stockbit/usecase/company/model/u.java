package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f156677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156678b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156679c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156680e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156681f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156682g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f156683h;

    public u(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "companyId");
        kotlin.jvm.internal.p.l(r3, "bonusRatio");
        kotlin.jvm.internal.p.l(r4, "factor");
        kotlin.jvm.internal.p.l(r5, "cumDate");
        kotlin.jvm.internal.p.l(r6, "exDate");
        kotlin.jvm.internal.p.l(r7, "recDate");
        kotlin.jvm.internal.p.l(r8, "paymentDate");
        this.f156677a = r2;
        this.f156678b = r3;
        this.f156679c = r4;
        this.d = r5;
        this.f156680e = r6;
        this.f156681f = r7;
        this.f156682g = r8;
        this.f156683h = r9;
    }

    public final String a() {
        return this.f156678b;
    }

    public final String b() {
        return this.f156677a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f156680e;
    }

    public final String e() {
        return this.f156679c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f156677a, r52.f156677a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156678b, r52.f156678b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156679c, r52.f156679c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156680e, r52.f156680e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156681f, r52.f156681f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156682g, r52.f156682g) == true) goto L30;
        return false;
    L30:
        if (this.f156683h == r52.f156683h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f156682g;
    }

    public final String g() {
        return this.f156681f;
    }

    public final boolean h() {
        return this.f156683h;
    }

    public int hashCode() {
        return (((((((((((((this.f156677a.hashCode() * 31) + this.f156678b.hashCode()) * 31) + this.f156679c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156680e.hashCode()) * 31) + this.f156681f.hashCode()) * 31) + this.f156682g.hashCode()) * 31) + Boolean.hashCode(this.f156683h);
    }

    public String toString() {
        return "CorpActionBonusUIState(companyId=" + this.f156677a + ", bonusRatio=" + this.f156678b + ", factor=" + this.f156679c + ", cumDate=" + this.d + ", exDate=" + this.f156680e + ", recDate=" + this.f156681f + ", paymentDate=" + this.f156682g + ", isActive=" + this.f156683h + ")";
    }

    public /* synthetic */ u(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, int r10, kotlin.jvm.internal.i r11) {
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
