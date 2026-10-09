package com.stockbit.domain.model.networkdiagnostic;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84474b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84475c;
    public final double d;

    public f(String r2, int r3, String r4, double r5) {
        p.l(r2, "host");
        p.l(r4, "ipAddress");
        this.f84473a = r2;
        this.f84474b = r3;
        this.f84475c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f84474b;
    }

    public final String b() {
        return this.f84475c;
    }

    public final double c() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f84473a, r82.f84473a) == true) goto L12;
        return false;
    L12:
        if (this.f84474b == r82.f84474b) goto L15;
        return false;
    L15:
        if (p.g(this.f84475c, r82.f84475c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84473a.hashCode() * 31) + Integer.hashCode(this.f84474b)) * 31) + this.f84475c.hashCode()) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "TraceRouteEntity(host=" + this.f84473a + ", hop=" + this.f84474b + ", ipAddress=" + this.f84475c + ", rttMs=" + this.d + ")";
    }
}
