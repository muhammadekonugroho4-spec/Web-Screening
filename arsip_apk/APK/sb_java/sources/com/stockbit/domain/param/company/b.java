package com.stockbit.domain.param.company;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87401c;
    public final int d;

    public b(String r2, String r3, int r4, int r5) {
        p.l(r2, "rootId");
        p.l(r3, "rootType");
        this.f87399a = r2;
        this.f87400b = r3;
        this.f87401c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f87401c;
    }

    public final int b() {
        return this.d;
    }

    public final String c() {
        return this.f87399a;
    }

    public final String d() {
        return this.f87400b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87399a, r52.f87399a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87400b, r52.f87400b) == true) goto L15;
        return false;
    L15:
        if (this.f87401c == r52.f87401c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f87399a.hashCode() * 31) + this.f87400b.hashCode()) * 31) + Integer.hashCode(this.f87401c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ShareholdingNetworkDomainParam(rootId=" + this.f87399a + ", rootType=" + this.f87400b + ", maxDepth=" + this.f87401c + ", maxEdgePerNode=" + this.d + ")";
    }
}
