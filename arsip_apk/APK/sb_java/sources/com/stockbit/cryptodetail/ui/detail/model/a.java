package com.stockbit.cryptodetail.ui.detail.model;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f79667a;

    /* renamed from: b, reason: collision with root package name */
    public final double f79668b;

    /* renamed from: c, reason: collision with root package name */
    public final double f79669c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f79670e;

    /* renamed from: f, reason: collision with root package name */
    public final double f79671f;

    /* renamed from: g, reason: collision with root package name */
    public final String f79672g;

    /* renamed from: h, reason: collision with root package name */
    public final String f79673h;

    /* renamed from: i, reason: collision with root package name */
    public final String f79674i;

    /* renamed from: j, reason: collision with root package name */
    public final String f79675j;

    /* renamed from: k, reason: collision with root package name */
    public final String f79676k;

    /* renamed from: l, reason: collision with root package name */
    public final String f79677l;

    /* renamed from: m, reason: collision with root package name */
    public final String f79678m;

    /* renamed from: n, reason: collision with root package name */
    public final String f79679n;

    static {
    }

    public a(double r10, double r12, double r14, double r16, double r18, double r20, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29) {
        p.l(r22, "openFormatted");
        p.l(r23, "highFormatted");
        p.l(r24, "lowFormatted");
        p.l(r25, "closeFormatted");
        p.l(r26, "valueFormatted");
        p.l(r27, "changeFormatted");
        p.l(r28, "percentageFormatted");
        p.l(r29, "dateTimeFormatted");
        this.f79667a = r10;
        this.f79668b = r12;
        this.f79669c = r14;
        this.d = r16;
        this.f79670e = r18;
        this.f79671f = r20;
        this.f79672g = r22;
        this.f79673h = r23;
        this.f79674i = r24;
        this.f79675j = r25;
        this.f79676k = r26;
        this.f79677l = r27;
        this.f79678m = r28;
        this.f79679n = r29;
    }

    public final double a() {
        return this.f79668b;
    }

    public final String b() {
        return this.f79677l;
    }

    public final double c() {
        return this.f79671f;
    }

    public final String d() {
        return this.f79675j;
    }

    public final String e() {
        return this.f79679n;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f79667a, r82.f79667a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f79668b, r82.f79668b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f79669c, r82.f79669c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f79670e, r82.f79670e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f79671f, r82.f79671f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f79672g, r82.f79672g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f79673h, r82.f79673h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f79674i, r82.f79674i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f79675j, r82.f79675j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f79676k, r82.f79676k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f79677l, r82.f79677l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f79678m, r82.f79678m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f79679n, r82.f79679n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final double f() {
        return this.d;
    }

    public final String g() {
        return this.f79673h;
    }

    public final double h() {
        return this.f79670e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Double.hashCode(this.f79667a) * 31) + Double.hashCode(this.f79668b)) * 31) + Double.hashCode(this.f79669c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f79670e)) * 31) + Double.hashCode(this.f79671f)) * 31) + this.f79672g.hashCode()) * 31) + this.f79673h.hashCode()) * 31) + this.f79674i.hashCode()) * 31) + this.f79675j.hashCode()) * 31) + this.f79676k.hashCode()) * 31) + this.f79677l.hashCode()) * 31) + this.f79678m.hashCode()) * 31) + this.f79679n.hashCode();
    }

    public final String i() {
        return this.f79674i;
    }

    public final double j() {
        return this.f79669c;
    }

    public final String k() {
        return this.f79672g;
    }

    public final String l() {
        return this.f79678m;
    }

    public final double m() {
        return this.f79667a;
    }

    public final String n() {
        return this.f79676k;
    }

    public String toString() {
        return "CryptoChartPriceUIData(value=" + this.f79667a + ", change=" + this.f79668b + ", open=" + this.f79669c + ", high=" + this.d + ", low=" + this.f79670e + ", close=" + this.f79671f + ", openFormatted=" + this.f79672g + ", highFormatted=" + this.f79673h + ", lowFormatted=" + this.f79674i + ", closeFormatted=" + this.f79675j + ", valueFormatted=" + this.f79676k + ", changeFormatted=" + this.f79677l + ", percentageFormatted=" + this.f79678m + ", dateTimeFormatted=" + this.f79679n + ')';
    }
}
