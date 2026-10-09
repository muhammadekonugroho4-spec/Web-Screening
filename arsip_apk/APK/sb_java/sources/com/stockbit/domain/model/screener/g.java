package com.stockbit.domain.model.screener;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f84889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84890b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84891c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84892e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84893f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84894g;

    public g(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, "type");
        p.l(r3, "operator");
        p.l(r4, "multiplier");
        p.l(r5, "item1");
        p.l(r6, "item1name");
        p.l(r7, "item2");
        p.l(r8, "item2name");
        this.f84889a = r2;
        this.f84890b = r3;
        this.f84891c = r4;
        this.d = r5;
        this.f84892e = r6;
        this.f84893f = r7;
        this.f84894g = r8;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f84892e;
    }

    public final String c() {
        return this.f84893f;
    }

    public final String d() {
        return this.f84894g;
    }

    public final String e() {
        return this.f84891c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f84889a, r52.f84889a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84890b, r52.f84890b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84891c, r52.f84891c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84892e, r52.f84892e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84893f, r52.f84893f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84894g, r52.f84894g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f84890b;
    }

    public final String g() {
        return this.f84889a;
    }

    public int hashCode() {
        return (((((((((((this.f84889a.hashCode() * 31) + this.f84890b.hashCode()) * 31) + this.f84891c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84892e.hashCode()) * 31) + this.f84893f.hashCode()) * 31) + this.f84894g.hashCode();
    }

    public String toString() {
        return "ScreenerRulesEntity(type=" + this.f84889a + ", operator=" + this.f84890b + ", multiplier=" + this.f84891c + ", item1=" + this.d + ", item1name=" + this.f84892e + ", item2=" + this.f84893f + ", item2name=" + this.f84894g + ")";
    }
}
