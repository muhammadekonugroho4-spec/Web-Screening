package com.stockbit.domain.model.company.fda;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81491a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81492b;

    public a(String r2, double r3) {
        p.l(r2, "formatted");
        this.f81491a = r2;
        this.f81492b = r3;
    }

    public final String a() {
        return this.f81491a;
    }

    public final double b() {
        return this.f81492b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f81491a, r82.f81491a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81492b, r82.f81492b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81491a.hashCode() * 31) + Double.hashCode(this.f81492b);
    }

    public String toString() {
        return "FDAFormattedRawEntity(formatted=" + this.f81491a + ", raw=" + this.f81492b + ")";
    }

    public /* synthetic */ a(String r1, double r2, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 0.0d;
    L8:
        this(r1, r2);
    }
}
