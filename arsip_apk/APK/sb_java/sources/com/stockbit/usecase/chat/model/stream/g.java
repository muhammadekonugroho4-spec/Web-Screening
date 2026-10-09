package com.stockbit.usecase.chat.model.stream;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f155692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155694c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155695e;

    /* renamed from: f, reason: collision with root package name */
    public final double f155696f;

    /* renamed from: g, reason: collision with root package name */
    public final double f155697g;

    /* renamed from: h, reason: collision with root package name */
    public final double f155698h;

    /* renamed from: i, reason: collision with root package name */
    public final int f155699i;

    /* renamed from: j, reason: collision with root package name */
    public final int f155700j;

    /* renamed from: k, reason: collision with root package name */
    public final double f155701k;

    /* renamed from: l, reason: collision with root package name */
    public final double f155702l;

    /* renamed from: m, reason: collision with root package name */
    public final int f155703m;

    /* renamed from: n, reason: collision with root package name */
    public final int f155704n;

    public g(long r2, String r4, String r5, String r6, String r7, double r8, double r10, double r12, int r14, int r15, double r16, double r18, int r20, int r21) {
        p.l(r4, "voted");
        p.l(r5, "symbol");
        p.l(r6, "symbol2");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f155692a = r2;
        this.f155693b = r4;
        this.f155694c = r5;
        this.d = r6;
        this.f155695e = r7;
        this.f155696f = r8;
        this.f155697g = r10;
        this.f155698h = r12;
        this.f155699i = r14;
        this.f155700j = r15;
        this.f155701k = r16;
        this.f155702l = r18;
        this.f155703m = r20;
        this.f155704n = r21;
    }

    public final double a() {
        return this.f155701k;
    }

    public final double b() {
        return this.f155697g;
    }

    public final int c() {
        return this.f155700j;
    }

    public final double d() {
        return this.f155702l;
    }

    public final int e() {
        return this.f155699i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (this.f155692a == r82.f155692a) goto L12;
        return false;
    L12:
        if (p.g(this.f155693b, r82.f155693b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155694c, r82.f155694c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f155695e, r82.f155695e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f155696f, r82.f155696f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f155697g, r82.f155697g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f155698h, r82.f155698h) == 0) goto L33;
        return false;
    L33:
        if (this.f155699i == r82.f155699i) goto L36;
        return false;
    L36:
        if (this.f155700j == r82.f155700j) goto L39;
        return false;
    L39:
        if (Double.compare(this.f155701k, r82.f155701k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f155702l, r82.f155702l) == 0) goto L45;
        return false;
    L45:
        if (this.f155703m == r82.f155703m) goto L48;
        return false;
    L48:
        if (this.f155704n == r82.f155704n) goto L50;
        return false;
    L50:
        return true;
    }

    public final int f() {
        return this.f155703m;
    }

    public final long g() {
        return this.f155692a;
    }

    public final double h() {
        return this.f155696f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.f155692a) * 31) + this.f155693b.hashCode()) * 31) + this.f155694c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f155695e.hashCode()) * 31) + Double.hashCode(this.f155696f)) * 31) + Double.hashCode(this.f155697g)) * 31) + Double.hashCode(this.f155698h)) * 31) + Integer.hashCode(this.f155699i)) * 31) + Integer.hashCode(this.f155700j)) * 31) + Double.hashCode(this.f155701k)) * 31) + Double.hashCode(this.f155702l)) * 31) + Integer.hashCode(this.f155703m)) * 31) + Integer.hashCode(this.f155704n);
    }

    public final String i() {
        return this.f155695e;
    }

    public final String j() {
        return this.f155694c;
    }

    public final String k() {
        return this.d;
    }

    public final double l() {
        return this.f155698h;
    }

    public final int m() {
        return this.f155704n;
    }

    public final String n() {
        return this.f155693b;
    }

    public String toString() {
        return "TargetPriceUIState(id=" + this.f155692a + ", voted=" + this.f155693b + ", symbol=" + this.f155694c + ", symbol2=" + this.d + ", name=" + this.f155695e + ", lastPrice=" + this.f155696f + ", currentPrice=" + this.f155697g + ", targetPrice=" + this.f155698h + ", duration=" + this.f155699i + ", dayLeft=" + this.f155700j + ", agree=" + this.f155701k + ", disagree=" + this.f155702l + ", hit=" + this.f155703m + ", tradeable=" + this.f155704n + ")";
    }
}
