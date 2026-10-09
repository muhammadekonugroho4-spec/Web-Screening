package com.stockbit.domain.model.topstock;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f85893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85894b;

    /* renamed from: c, reason: collision with root package name */
    public final a f85895c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final a f85896e;

    /* renamed from: f, reason: collision with root package name */
    public final a f85897f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85898g;

    /* renamed from: h, reason: collision with root package name */
    public final a f85899h;

    public e(a r2, String r3, a r4, String r5, a r6, a r7, int r8, a r9) {
        p.l(r2, "average");
        p.l(r3, "code");
        p.l(r4, "foreignValue");
        p.l(r5, "iconUrl");
        p.l(r6, "lot");
        p.l(r7, "freq");
        p.l(r9, "value");
        this.f85893a = r2;
        this.f85894b = r3;
        this.f85895c = r4;
        this.d = r5;
        this.f85896e = r6;
        this.f85897f = r7;
        this.f85898g = r8;
        this.f85899h = r9;
    }

    public final a a() {
        return this.f85893a;
    }

    public final String b() {
        return this.f85894b;
    }

    public final a c() {
        return this.f85895c;
    }

    public final a d() {
        return this.f85897f;
    }

    public final a e() {
        return this.f85896e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f85893a, r52.f85893a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85894b, r52.f85894b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85895c, r52.f85895c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85896e, r52.f85896e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85897f, r52.f85897f) == true) goto L27;
        return false;
    L27:
        if (this.f85898g == r52.f85898g) goto L30;
        return false;
    L30:
        if (p.g(this.f85899h, r52.f85899h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final int f() {
        return this.f85898g;
    }

    public final a g() {
        return this.f85899h;
    }

    public int hashCode() {
        return (((((((((((((this.f85893a.hashCode() * 31) + this.f85894b.hashCode()) * 31) + this.f85895c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85896e.hashCode()) * 31) + this.f85897f.hashCode()) * 31) + Integer.hashCode(this.f85898g)) * 31) + this.f85899h.hashCode();
    }

    public String toString() {
        return "TopStockItemEntity(average=" + this.f85893a + ", code=" + this.f85894b + ", foreignValue=" + this.f85895c + ", iconUrl=" + this.d + ", lot=" + this.f85896e + ", freq=" + this.f85897f + ", rank=" + this.f85898g + ", value=" + this.f85899h + ")";
    }
}
