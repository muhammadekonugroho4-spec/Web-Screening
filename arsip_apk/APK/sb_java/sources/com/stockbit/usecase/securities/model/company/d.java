package com.stockbit.usecase.securities.model.company;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f160506a;

    /* renamed from: b, reason: collision with root package name */
    public final double f160507b;

    /* renamed from: c, reason: collision with root package name */
    public final double f160508c;
    public final String d;

    public d(double r2, double r4, double r6, String r8) {
        p.l(r8, "period");
        this.f160506a = r2;
        this.f160507b = r4;
        this.f160508c = r6;
        this.d = r8;
    }

    public final double a() {
        return this.f160507b;
    }

    public final String b() {
        return this.d;
    }

    public final double c() {
        return this.f160506a;
    }

    public final double d() {
        return this.f160508c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (Double.compare(this.f160506a, r82.f160506a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f160507b, r82.f160507b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f160508c, r82.f160508c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f160506a) * 31) + Double.hashCode(this.f160507b)) * 31) + Double.hashCode(this.f160508c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SentimentUIState(startValue=" + this.f160506a + ", endValue=" + this.f160507b + ", value=" + this.f160508c + ", period=" + this.d + ")";
    }

    public /* synthetic */ d(double r3, double r5, double r7, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r7 = 0.0d;
    L12:
        if ((r10 & 8) == 0) goto L14;
        r9 = "";
    L14:
        double r6 = r5;
        double r4 = r3;
        this(r4, r6, r7, r9);
    }
}
