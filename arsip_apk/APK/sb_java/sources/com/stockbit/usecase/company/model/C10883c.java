package com.stockbit.usecase.company.model;

/* renamed from: com.stockbit.usecase.company.model.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10883c {

    /* renamed from: a, reason: collision with root package name */
    public final String f156197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156199c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156200e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156201f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156202g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156203h;

    /* renamed from: i, reason: collision with root package name */
    public final String f156204i;

    public C10883c(String r2, int r3, int r4, int r5, int r6, String r7, String r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r7, "formattedTarget");
        kotlin.jvm.internal.p.l(r8, "formattedLow");
        kotlin.jvm.internal.p.l(r9, "formattedHigh");
        kotlin.jvm.internal.p.l(r10, "formattedCurrent");
        this.f156197a = r2;
        this.f156198b = r3;
        this.f156199c = r4;
        this.d = r5;
        this.f156200e = r6;
        this.f156201f = r7;
        this.f156202g = r8;
        this.f156203h = r9;
        this.f156204i = r10;
    }

    public final String a() {
        return this.f156197a;
    }

    public final int b() {
        return this.f156200e;
    }

    public final String c() {
        return this.f156204i;
    }

    public final String d() {
        return this.f156203h;
    }

    public final String e() {
        return this.f156202g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10883c) == true) goto L8;
        return false;
    L8:
        C10883c r52 = (C10883c) r5;
        if (kotlin.jvm.internal.p.g(this.f156197a, r52.f156197a) == true) goto L12;
        return false;
    L12:
        if (this.f156198b == r52.f156198b) goto L15;
        return false;
    L15:
        if (this.f156199c == r52.f156199c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f156200e == r52.f156200e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156201f, r52.f156201f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156202g, r52.f156202g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f156203h, r52.f156203h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f156204i, r52.f156204i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f156201f;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.f156199c;
    }

    public int hashCode() {
        return (((((((((((((((this.f156197a.hashCode() * 31) + Integer.hashCode(this.f156198b)) * 31) + Integer.hashCode(this.f156199c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f156200e)) * 31) + this.f156201f.hashCode()) * 31) + this.f156202g.hashCode()) * 31) + this.f156203h.hashCode()) * 31) + this.f156204i.hashCode();
    }

    public final int i() {
        return this.f156198b;
    }

    public String toString() {
        return "AnalystPriceTargetUIState(companySymbol=" + this.f156197a + ", target=" + this.f156198b + ", low=" + this.f156199c + ", high=" + this.d + ", current=" + this.f156200e + ", formattedTarget=" + this.f156201f + ", formattedLow=" + this.f156202g + ", formattedHigh=" + this.f156203h + ", formattedCurrent=" + this.f156204i + ")";
    }
}
