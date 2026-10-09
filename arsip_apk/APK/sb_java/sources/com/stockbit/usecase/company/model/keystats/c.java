package com.stockbit.usecase.company.model.keystats;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f156304a;

    /* renamed from: b, reason: collision with root package name */
    public final double f156305b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156306c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f156307e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156308f;

    /* renamed from: g, reason: collision with root package name */
    public final double f156309g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156310h;

    /* renamed from: i, reason: collision with root package name */
    public final double f156311i;

    public c(String r2, double r3, String r5, String r6, double r7, String r9, double r10, String r12, double r13) {
        p.l(r2, "timeFrame");
        p.l(r5, "percentageFormatted");
        p.l(r6, "closePriceFormatted");
        p.l(r9, "highFormatted");
        p.l(r12, "lowFormatted");
        this.f156304a = r2;
        this.f156305b = r3;
        this.f156306c = r5;
        this.d = r6;
        this.f156307e = r7;
        this.f156308f = r9;
        this.f156309g = r10;
        this.f156310h = r12;
        this.f156311i = r13;
    }

    public final double a() {
        return this.f156307e;
    }

    public final String b() {
        return this.f156308f;
    }

    public final double c() {
        return this.f156309g;
    }

    public final String d() {
        return this.f156310h;
    }

    public final double e() {
        return this.f156311i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f156304a, r82.f156304a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f156305b, r82.f156305b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f156306c, r82.f156306c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f156307e, r82.f156307e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f156308f, r82.f156308f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f156309g, r82.f156309g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f156310h, r82.f156310h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f156311i, r82.f156311i) == 0) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f156306c;
    }

    public final double g() {
        return this.f156305b;
    }

    public final String h() {
        return this.f156304a;
    }

    public int hashCode() {
        return (((((((((((((((this.f156304a.hashCode() * 31) + Double.hashCode(this.f156305b)) * 31) + this.f156306c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f156307e)) * 31) + this.f156308f.hashCode()) * 31) + Double.hashCode(this.f156309g)) * 31) + this.f156310h.hashCode()) * 31) + Double.hashCode(this.f156311i);
    }

    public String toString() {
        return "PricePerformanceUIState(timeFrame=" + this.f156304a + ", percentageRaw=" + this.f156305b + ", percentageFormatted=" + this.f156306c + ", closePriceFormatted=" + this.d + ", closePriceRaw=" + this.f156307e + ", highFormatted=" + this.f156308f + ", highRaw=" + this.f156309g + ", lowFormatted=" + this.f156310h + ", lowRaw=" + this.f156311i + ")";
    }
}
