package com.stockbit.usecase.insider.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f158131a;

    /* renamed from: b, reason: collision with root package name */
    public final long f158132b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158133c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158134e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158135f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158136g;

    public h(String r2, long r3, String r5, double r6, String r8, String r9, String r10) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r5, "shareFormatted");
        p.l(r8, "percentageFormatted");
        p.l(r9, "colorLight");
        p.l(r10, "colorDark");
        this.f158131a = r2;
        this.f158132b = r3;
        this.f158133c = r5;
        this.d = r6;
        this.f158134e = r8;
        this.f158135f = r9;
        this.f158136g = r10;
    }

    public final String a() {
        return this.f158136g;
    }

    public final String b() {
        return this.f158135f;
    }

    public final String c() {
        return this.f158131a;
    }

    public final String d() {
        return this.f158134e;
    }

    public final double e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f158131a, r82.f158131a) == true) goto L12;
        return false;
    L12:
        if (this.f158132b == r82.f158132b) goto L15;
        return false;
    L15:
        if (p.g(this.f158133c, r82.f158133c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f158134e, r82.f158134e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158135f, r82.f158135f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158136g, r82.f158136g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f158133c;
    }

    public int hashCode() {
        return (((((((((((this.f158131a.hashCode() * 31) + Long.hashCode(this.f158132b)) * 31) + this.f158133c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f158134e.hashCode()) * 31) + this.f158135f.hashCode()) * 31) + this.f158136g.hashCode();
    }

    public String toString() {
        return "ShareholderCompositionItemUIData(label=" + this.f158131a + ", shareRaw=" + this.f158132b + ", shareFormatted=" + this.f158133c + ", percentageRaw=" + this.d + ", percentageFormatted=" + this.f158134e + ", colorLight=" + this.f158135f + ", colorDark=" + this.f158136g + ")";
    }
}
