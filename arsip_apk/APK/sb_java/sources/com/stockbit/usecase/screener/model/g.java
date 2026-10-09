package com.stockbit.usecase.screener.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f159737a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159738b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159739c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159740e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159741f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159742g;

    /* renamed from: h, reason: collision with root package name */
    public final String f159743h;

    public g(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "type");
        p.l(r3, "operator");
        p.l(r4, "multiplier");
        p.l(r5, "item1");
        p.l(r6, "item1name");
        p.l(r7, "item2");
        p.l(r8, "item2name");
        p.l(r9, "ruleName");
        this.f159737a = r2;
        this.f159738b = r3;
        this.f159739c = r4;
        this.d = r5;
        this.f159740e = r6;
        this.f159741f = r7;
        this.f159742g = r8;
        this.f159743h = r9;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f159740e;
    }

    public final String c() {
        return this.f159741f;
    }

    public final String d() {
        return this.f159742g;
    }

    public final String e() {
        return this.f159739c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f159737a, r52.f159737a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159738b, r52.f159738b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159739c, r52.f159739c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159740e, r52.f159740e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f159741f, r52.f159741f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f159742g, r52.f159742g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f159743h, r52.f159743h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f159738b;
    }

    public final String g() {
        return this.f159743h;
    }

    public final String h() {
        return this.f159737a;
    }

    public int hashCode() {
        return (((((((((((((this.f159737a.hashCode() * 31) + this.f159738b.hashCode()) * 31) + this.f159739c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159740e.hashCode()) * 31) + this.f159741f.hashCode()) * 31) + this.f159742g.hashCode()) * 31) + this.f159743h.hashCode();
    }

    public String toString() {
        return "ScreenerRulesUIState(type=" + this.f159737a + ", operator=" + this.f159738b + ", multiplier=" + this.f159739c + ", item1=" + this.d + ", item1name=" + this.f159740e + ", item2=" + this.f159741f + ", item2name=" + this.f159742g + ", ruleName=" + this.f159743h + ")";
    }
}
