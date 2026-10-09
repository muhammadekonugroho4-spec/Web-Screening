package com.stockbit.domain.model.company.shareholdercomposition;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81936a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81938c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81939e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81940f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81941g;

    public b(String r2, long r3, String r5, double r6, String r8, String r9, String r10) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r5, "shareFormatted");
        p.l(r8, "percentageFormatted");
        p.l(r9, "colorLight");
        p.l(r10, "colorDark");
        this.f81936a = r2;
        this.f81937b = r3;
        this.f81938c = r5;
        this.d = r6;
        this.f81939e = r8;
        this.f81940f = r9;
        this.f81941g = r10;
    }

    public final String a() {
        return this.f81941g;
    }

    public final String b() {
        return this.f81940f;
    }

    public final String c() {
        return this.f81936a;
    }

    public final String d() {
        return this.f81939e;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f81936a, r82.f81936a) == true) goto L12;
        return false;
    L12:
        if (this.f81937b == r82.f81937b) goto L15;
        return false;
    L15:
        if (p.g(this.f81938c, r82.f81938c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f81939e, r82.f81939e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81940f, r82.f81940f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81941g, r82.f81941g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f81938c;
    }

    public final long g() {
        return this.f81937b;
    }

    public int hashCode() {
        return (((((((((((this.f81936a.hashCode() * 31) + Long.hashCode(this.f81937b)) * 31) + this.f81938c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f81939e.hashCode()) * 31) + this.f81940f.hashCode()) * 31) + this.f81941g.hashCode();
    }

    public String toString() {
        return "ShareholderCompositionPeriodDataEntity(label=" + this.f81936a + ", shareRaw=" + this.f81937b + ", shareFormatted=" + this.f81938c + ", percentageRaw=" + this.d + ", percentageFormatted=" + this.f81939e + ", colorLight=" + this.f81940f + ", colorDark=" + this.f81941g + ")";
    }
}
