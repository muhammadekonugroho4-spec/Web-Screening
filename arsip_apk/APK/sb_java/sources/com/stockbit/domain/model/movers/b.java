package com.stockbit.domain.model.movers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84340c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84341e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84342f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84343g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84344h;

    /* renamed from: i, reason: collision with root package name */
    public final double f84345i;

    /* renamed from: j, reason: collision with root package name */
    public final double f84346j;

    /* renamed from: k, reason: collision with root package name */
    public final double f84347k;

    /* renamed from: l, reason: collision with root package name */
    public final long f84348l;

    /* renamed from: m, reason: collision with root package name */
    public final double f84349m;

    /* renamed from: n, reason: collision with root package name */
    public final a f84350n;

    public b(String r3, String r4, String r5, int r6, int r7, String r8, String r9, String r10, double r11, double r13, double r15, long r17, double r19, a r21) {
        kotlin.jvm.internal.p.l(r3, "code");
        kotlin.jvm.internal.p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r5, "iconUrl");
        kotlin.jvm.internal.p.l(r8, "value");
        kotlin.jvm.internal.p.l(r9, "volume");
        kotlin.jvm.internal.p.l(r10, "freq");
        kotlin.jvm.internal.p.l(r21, "stock");
        this.f84338a = r3;
        this.f84339b = r4;
        this.f84340c = r5;
        this.d = r6;
        this.f84341e = r7;
        this.f84342f = r8;
        this.f84343g = r9;
        this.f84344h = r10;
        this.f84345i = r11;
        this.f84346j = r13;
        this.f84347k = r15;
        this.f84348l = r17;
        this.f84349m = r19;
        this.f84350n = r21;
    }

    public final long a() {
        return this.f84348l;
    }

    public final String b() {
        return this.f84338a;
    }

    public final int c() {
        return this.f84341e;
    }

    public final String d() {
        return this.f84344h;
    }

    public final double e() {
        return this.f84347k;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (kotlin.jvm.internal.p.g(this.f84338a, r82.f84338a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84339b, r82.f84339b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84340c, r82.f84340c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f84341e == r82.f84341e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84342f, r82.f84342f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f84343g, r82.f84343g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f84344h, r82.f84344h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f84345i, r82.f84345i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f84346j, r82.f84346j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f84347k, r82.f84347k) == 0) goto L42;
        return false;
    L42:
        if (this.f84348l == r82.f84348l) goto L45;
        return false;
    L45:
        if (Double.compare(this.f84349m, r82.f84349m) == 0) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f84350n, r82.f84350n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f84340c;
    }

    public final double g() {
        return this.f84349m;
    }

    public final String h() {
        return this.f84339b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f84338a.hashCode() * 31) + this.f84339b.hashCode()) * 31) + this.f84340c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f84341e)) * 31) + this.f84342f.hashCode()) * 31) + this.f84343g.hashCode()) * 31) + this.f84344h.hashCode()) * 31) + Double.hashCode(this.f84345i)) * 31) + Double.hashCode(this.f84346j)) * 31) + Double.hashCode(this.f84347k)) * 31) + Long.hashCode(this.f84348l)) * 31) + Double.hashCode(this.f84349m)) * 31) + this.f84350n.hashCode();
    }

    public final a i() {
        return this.f84350n;
    }

    public final int j() {
        return this.d;
    }

    public final String k() {
        return this.f84342f;
    }

    public final double l() {
        return this.f84345i;
    }

    public final String m() {
        return this.f84343g;
    }

    public final double n() {
        return this.f84346j;
    }

    public String toString() {
        return "MoversCatalogDetailEntity(code=" + this.f84338a + ", name=" + this.f84339b + ", iconUrl=" + this.f84340c + ", upCount=" + this.d + ", downCount=" + this.f84341e + ", value=" + this.f84342f + ", volume=" + this.f84343g + ", freq=" + this.f84344h + ", valueRaw=" + this.f84345i + ", volumeRaw=" + this.f84346j + ", freqRaw=" + this.f84347k + ", catalogId=" + this.f84348l + ", marketCapPercentage=" + this.f84349m + ", stock=" + this.f84350n + ")";
    }
}
