package com.stockbit.domain.model.topstock;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85875a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85876b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85877c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85878e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85879f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85880g;

    public b(boolean r2, boolean r3, boolean r4, String r5, boolean r6, boolean r7, boolean r8) {
        p.l(r5, "bannerMessage");
        this.f85875a = r2;
        this.f85876b = r3;
        this.f85877c = r4;
        this.d = r5;
        this.f85878e = r6;
        this.f85879f = r7;
        this.f85880g = r8;
    }

    public final String a() {
        return this.d;
    }

    public final boolean b() {
        return this.f85878e;
    }

    public final boolean c() {
        return this.f85875a;
    }

    public final boolean d() {
        return this.f85876b;
    }

    public final boolean e() {
        return this.f85877c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f85875a == r52.f85875a) goto L12;
        return false;
    L12:
        if (this.f85876b == r52.f85876b) goto L15;
        return false;
    L15:
        if (this.f85877c == r52.f85877c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f85878e == r52.f85878e) goto L24;
        return false;
    L24:
        if (this.f85879f == r52.f85879f) goto L27;
        return false;
    L27:
        if (this.f85880g == r52.f85880g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f85879f;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f85875a) * 31) + Boolean.hashCode(this.f85876b)) * 31) + Boolean.hashCode(this.f85877c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f85878e)) * 31) + Boolean.hashCode(this.f85879f)) * 31) + Boolean.hashCode(this.f85880g);
    }

    public String toString() {
        return "TopStockDisplayOptionEntity(grossEnabled=" + this.f85875a + ", netEnabled=" + this.f85876b + ", totalEnabled=" + this.f85877c + ", bannerMessage=" + this.d + ", foreignValueColumn=" + this.f85878e + ", isMidDay=" + this.f85879f + ", isBreakTime=" + this.f85880g + ")";
    }
}
