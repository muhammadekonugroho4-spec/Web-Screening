package com.stockbit.domain.model.giphy;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f84100a;

    /* renamed from: b, reason: collision with root package name */
    public final b f84101b;

    /* renamed from: c, reason: collision with root package name */
    public final b f84102c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final b f84103e;

    /* renamed from: f, reason: collision with root package name */
    public final b f84104f;

    /* renamed from: g, reason: collision with root package name */
    public final b f84105g;

    public c(b r2, b r3, b r4, b r5, b r6, b r7, b r8) {
        p.l(r2, "previewWebp");
        p.l(r3, "previewGif");
        p.l(r4, "fixedHeight");
        p.l(r5, "fixedHeightSmall");
        p.l(r6, "fixedHeightSmallStill");
        p.l(r7, "fixedWidth");
        p.l(r8, "original");
        this.f84100a = r2;
        this.f84101b = r3;
        this.f84102c = r4;
        this.d = r5;
        this.f84103e = r6;
        this.f84104f = r7;
        this.f84105g = r8;
    }

    public final b a() {
        return this.f84102c;
    }

    public final b b() {
        return this.f84104f;
    }

    public final b c() {
        return this.f84101b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84100a, r52.f84100a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84101b, r52.f84101b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84102c, r52.f84102c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84103e, r52.f84103e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84104f, r52.f84104f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84105g, r52.f84105g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f84100a.hashCode() * 31) + this.f84101b.hashCode()) * 31) + this.f84102c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84103e.hashCode()) * 31) + this.f84104f.hashCode()) * 31) + this.f84105g.hashCode();
    }

    public String toString() {
        return "GiphyImageEntity(previewWebp=" + this.f84100a + ", previewGif=" + this.f84101b + ", fixedHeight=" + this.f84102c + ", fixedHeightSmall=" + this.d + ", fixedHeightSmallStill=" + this.f84103e + ", fixedWidth=" + this.f84104f + ", original=" + this.f84105g + ")";
    }
}
