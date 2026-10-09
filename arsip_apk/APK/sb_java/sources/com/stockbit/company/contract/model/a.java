package com.stockbit.company.contract.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f62495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f62497c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f62498e;

    /* renamed from: f, reason: collision with root package name */
    public final String f62499f;

    /* renamed from: g, reason: collision with root package name */
    public final String f62500g;

    /* renamed from: h, reason: collision with root package name */
    public final String f62501h;

    /* renamed from: i, reason: collision with root package name */
    public final String f62502i;

    /* renamed from: j, reason: collision with root package name */
    public final String f62503j;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        p.l(r4, "companyType");
        p.l(r5, "iconUrl");
        p.l(r6, "sortType");
        p.l(r7, "investorType");
        p.l(r8, "marketBoardType");
        this.f62495a = r2;
        this.f62496b = r3;
        this.f62497c = r4;
        this.d = r5;
        this.f62498e = r6;
        this.f62499f = r7;
        this.f62500g = r8;
        this.f62501h = r9;
        this.f62502i = r10;
        this.f62503j = r11;
    }

    public final String a() {
        return this.f62496b;
    }

    public final String b() {
        return this.f62497c;
    }

    public final String c() {
        return this.f62503j;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f62499f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f62495a, r52.f62495a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f62496b, r52.f62496b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f62497c, r52.f62497c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f62498e, r52.f62498e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f62499f, r52.f62499f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f62500g, r52.f62500g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f62501h, r52.f62501h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f62502i, r52.f62502i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f62503j, r52.f62503j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f62500g;
    }

    public final String g() {
        return this.f62501h;
    }

    public final String h() {
        return this.f62498e;
    }

    public int hashCode() {
        int r02 = ((((((((((((this.f62495a.hashCode() * 31) + this.f62496b.hashCode()) * 31) + this.f62497c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f62498e.hashCode()) * 31) + this.f62499f.hashCode()) * 31) + this.f62500g.hashCode()) * 31;
        String r1 = this.f62501h;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f62502i;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f62503j;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f62502i;
    }

    public final String j() {
        return this.f62495a;
    }

    public String toString() {
        return "BrokerDistributionDetailNavParam(symbol=" + this.f62495a + ", companyName=" + this.f62496b + ", companyType=" + this.f62497c + ", iconUrl=" + this.d + ", sortType=" + this.f62498e + ", investorType=" + this.f62499f + ", marketBoardType=" + this.f62500g + ", periodType=" + this.f62501h + ", startDate=" + this.f62502i + ", endDate=" + this.f62503j + ')';
    }
}
