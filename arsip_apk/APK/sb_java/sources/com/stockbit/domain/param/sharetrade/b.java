package com.stockbit.domain.param.sharetrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f87596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87598c;

    public b(int r2, String r3, boolean r4) {
        p.l(r3, "type");
        this.f87596a = r2;
        this.f87597b = r3;
        this.f87598c = r4;
    }

    public final int a() {
        return this.f87596a;
    }

    public final String b() {
        return this.f87597b;
    }

    public final boolean c() {
        return this.f87598c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f87596a == r52.f87596a) goto L12;
        return false;
    L12:
        if (p.g(this.f87597b, r52.f87597b) == true) goto L15;
        return false;
    L15:
        if (this.f87598c == r52.f87598c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f87596a) * 31) + this.f87597b.hashCode()) * 31) + Boolean.hashCode(this.f87598c);
    }

    public String toString() {
        return "ShareOrderTargetDomainParam(id=" + this.f87596a + ", type=" + this.f87597b + ", isShareValue=" + this.f87598c + ")";
    }
}
