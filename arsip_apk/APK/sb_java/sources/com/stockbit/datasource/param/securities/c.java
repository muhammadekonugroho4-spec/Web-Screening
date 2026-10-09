package com.stockbit.datasource.param.securities;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f80086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80088c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80089e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80090f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80091g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80092h;

    public c(String r2, int r3, int r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "period");
        p.l(r5, "start");
        p.l(r6, "end");
        this.f80086a = r2;
        this.f80087b = r3;
        this.f80088c = r4;
        this.d = r5;
        this.f80089e = r6;
        this.f80090f = r7;
        this.f80091g = r8;
        this.f80092h = r9;
    }

    public final String a() {
        return this.f80090f;
    }

    public final String b() {
        return this.f80089e;
    }

    public final String c() {
        return this.f80091g;
    }

    public final int d() {
        return this.f80087b;
    }

    public final int e() {
        return this.f80088c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f80086a, r52.f80086a) == true) goto L12;
        return false;
    L12:
        if (this.f80087b == r52.f80087b) goto L15;
        return false;
    L15:
        if (this.f80088c == r52.f80088c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80089e, r52.f80089e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80090f, r52.f80090f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80091g, r52.f80091g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80092h, r52.f80092h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f80086a;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f80092h;
    }

    public int hashCode() {
        int r02 = ((((((((this.f80086a.hashCode() * 31) + Integer.hashCode(this.f80087b)) * 31) + Integer.hashCode(this.f80088c)) * 31) + this.d.hashCode()) * 31) + this.f80089e.hashCode()) * 31;
        String r1 = this.f80090f;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f80091g;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f80092h;
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

    public String toString() {
        return "GetTradingHistoryParam(period=" + this.f80086a + ", limit=" + this.f80087b + ", page=" + this.f80088c + ", start=" + this.d + ", end=" + this.f80089e + ", action=" + this.f80090f + ", keyword=" + this.f80091g + ", stock=" + this.f80092h + ")";
    }
}
