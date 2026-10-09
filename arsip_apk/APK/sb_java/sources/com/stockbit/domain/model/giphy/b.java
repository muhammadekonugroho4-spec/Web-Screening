package com.stockbit.domain.model.giphy;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84095c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84096e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84097f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84098g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84099h;

    public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "url");
        p.l(r3, "width");
        p.l(r4, "height");
        p.l(r5, "size");
        p.l(r6, "mp4");
        p.l(r7, "mp4Size");
        p.l(r8, "webp");
        p.l(r9, "webpSize");
        this.f84093a = r2;
        this.f84094b = r3;
        this.f84095c = r4;
        this.d = r5;
        this.f84096e = r6;
        this.f84097f = r7;
        this.f84098g = r8;
        this.f84099h = r9;
    }

    public final String a() {
        return this.f84095c;
    }

    public final String b() {
        return this.f84093a;
    }

    public final String c() {
        return this.f84094b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84093a, r52.f84093a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84094b, r52.f84094b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84095c, r52.f84095c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84096e, r52.f84096e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84097f, r52.f84097f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84098g, r52.f84098g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84099h, r52.f84099h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f84093a.hashCode() * 31) + this.f84094b.hashCode()) * 31) + this.f84095c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84096e.hashCode()) * 31) + this.f84097f.hashCode()) * 31) + this.f84098g.hashCode()) * 31) + this.f84099h.hashCode();
    }

    public String toString() {
        return "GiphyImageContentEntity(url=" + this.f84093a + ", width=" + this.f84094b + ", height=" + this.f84095c + ", size=" + this.d + ", mp4=" + this.f84096e + ", mp4Size=" + this.f84097f + ", webp=" + this.f84098g + ", webpSize=" + this.f84099h + ")";
    }
}
