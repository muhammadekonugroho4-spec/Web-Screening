package com.stockbit.domain.param.securities;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f87468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87470c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87471e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87472f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87473g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87474h;

    public d(String r2, int r3, int r4, String r5, String r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "period");
        kotlin.jvm.internal.p.l(r5, "start");
        kotlin.jvm.internal.p.l(r6, "end");
        this.f87468a = r2;
        this.f87469b = r3;
        this.f87470c = r4;
        this.d = r5;
        this.f87471e = r6;
        this.f87472f = r7;
        this.f87473g = r8;
        this.f87474h = r9;
    }

    public final String a() {
        return this.f87472f;
    }

    public final String b() {
        return this.f87471e;
    }

    public final String c() {
        return this.f87473g;
    }

    public final int d() {
        return this.f87469b;
    }

    public final int e() {
        return this.f87470c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f87468a, r52.f87468a) == true) goto L12;
        return false;
    L12:
        if (this.f87469b == r52.f87469b) goto L15;
        return false;
    L15:
        if (this.f87470c == r52.f87470c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87471e, r52.f87471e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87472f, r52.f87472f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87473g, r52.f87473g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87474h, r52.f87474h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f87468a;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f87474h;
    }

    public int hashCode() {
        int r02 = ((((((((this.f87468a.hashCode() * 31) + Integer.hashCode(this.f87469b)) * 31) + Integer.hashCode(this.f87470c)) * 31) + this.d.hashCode()) * 31) + this.f87471e.hashCode()) * 31;
        String r1 = this.f87472f;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f87473g;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f87474h;
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
        return "GetTradingHistoryDomainParam(period=" + this.f87468a + ", limit=" + this.f87469b + ", page=" + this.f87470c + ", start=" + this.d + ", end=" + this.f87471e + ", action=" + this.f87472f + ", keyword=" + this.f87473g + ", stock=" + this.f87474h + ")";
    }
}
