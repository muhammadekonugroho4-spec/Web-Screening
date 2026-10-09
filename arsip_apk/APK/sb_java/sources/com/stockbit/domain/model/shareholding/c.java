package com.stockbit.domain.model.shareholding;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f85754a;

    /* renamed from: b, reason: collision with root package name */
    public final d f85755b;

    /* renamed from: c, reason: collision with root package name */
    public final d f85756c;
    public final l d;

    public c(d r2, d r3, d r4, l r5) {
        p.l(r2, "scripless");
        p.l(r3, "scrip");
        p.l(r4, "totalShares");
        p.l(r5, "percentage");
        this.f85754a = r2;
        this.f85755b = r3;
        this.f85756c = r4;
        this.d = r5;
    }

    public final l a() {
        return this.d;
    }

    public final d b() {
        return this.f85756c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85754a, r52.f85754a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85755b, r52.f85755b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85756c, r52.f85756c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85754a.hashCode() * 31) + this.f85755b.hashCode()) * 31) + this.f85756c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ShareholdingDetailEntity(scripless=" + this.f85754a + ", scrip=" + this.f85755b + ", totalShares=" + this.f85756c + ", percentage=" + this.d + ")";
    }
}
