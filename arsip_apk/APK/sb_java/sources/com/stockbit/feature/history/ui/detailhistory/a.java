package com.stockbit.feature.history.ui.detailhistory;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f97338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f97339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97340c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f97341e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97342f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97343g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f97344h;

    static {
    }

    public a(String r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "tradingHistoryTitle");
        kotlin.jvm.internal.p.l(r4, "companySymbol");
        this.f97338a = r2;
        this.f97339b = r3;
        this.f97340c = r4;
        this.d = r5;
        this.f97341e = r6;
        this.f97342f = r7;
        this.f97343g = r8;
        this.f97344h = r9;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f97339b;
    }

    public final String c() {
        return this.f97340c;
    }

    public final String d() {
        return this.f97341e;
    }

    public final String e() {
        return this.f97338a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f97338a, r52.f97338a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f97339b, r52.f97339b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f97340c, r52.f97340c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f97341e, r52.f97341e) == true) goto L24;
        return false;
    L24:
        if (this.f97342f == r52.f97342f) goto L27;
        return false;
    L27:
        if (this.f97343g == r52.f97343g) goto L30;
        return false;
    L30:
        if (this.f97344h == r52.f97344h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f97344h;
    }

    public final boolean g() {
        return this.f97343g;
    }

    public final boolean h() {
        return this.f97342f;
    }

    public int hashCode() {
        int r02 = this.f97338a.hashCode() * 31;
        String r1 = this.f97339b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((r02 + r12) * 31) + this.f97340c.hashCode()) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f97341e;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((((((r04 + r2) * 31) + Boolean.hashCode(this.f97342f)) * 31) + Boolean.hashCode(this.f97343g)) * 31) + Boolean.hashCode(this.f97344h);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "DetailHistoryCompanyEntity(tradingHistoryTitle=" + this.f97338a + ", companyLogoUrl=" + this.f97339b + ", companySymbol=" + this.f97340c + ", badgeText=" + this.d + ", dayTradeMultiplier=" + this.f97341e + ", isShowDayTradeMultiplier=" + this.f97342f + ", isHistoryStockbitDetailDescVisible=" + this.f97343g + ", isHistoryDetailAccelerationVisible=" + this.f97344h + ')';
    }
}
