package com.stockbit.domain.model.topstock;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f85881a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85882b;

    /* renamed from: c, reason: collision with root package name */
    public final List f85883c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final b f85884e;

    /* renamed from: f, reason: collision with root package name */
    public final g f85885f;

    public c(List r2, List r3, List r4, d r5, b r6, g r7) {
        p.l(r2, "topBuy");
        p.l(r3, "topSell");
        p.l(r4, "total");
        p.l(r5, "info");
        p.l(r6, "displayOption");
        p.l(r7, "summary");
        this.f85881a = r2;
        this.f85882b = r3;
        this.f85883c = r4;
        this.d = r5;
        this.f85884e = r6;
        this.f85885f = r7;
    }

    public final b a() {
        return this.f85884e;
    }

    public final d b() {
        return this.d;
    }

    public final g c() {
        return this.f85885f;
    }

    public final List d() {
        return this.f85881a;
    }

    public final List e() {
        return this.f85882b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85881a, r52.f85881a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85882b, r52.f85882b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85883c, r52.f85883c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85884e, r52.f85884e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85885f, r52.f85885f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.f85883c;
    }

    public int hashCode() {
        return (((((((((this.f85881a.hashCode() * 31) + this.f85882b.hashCode()) * 31) + this.f85883c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85884e.hashCode()) * 31) + this.f85885f.hashCode();
    }

    public String toString() {
        return "TopStockEntity(topBuy=" + this.f85881a + ", topSell=" + this.f85882b + ", total=" + this.f85883c + ", info=" + this.d + ", displayOption=" + this.f85884e + ", summary=" + this.f85885f + ")";
    }
}
