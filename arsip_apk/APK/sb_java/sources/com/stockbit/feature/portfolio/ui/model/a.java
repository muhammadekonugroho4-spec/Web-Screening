package com.stockbit.feature.portfolio.ui.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f106378a;

    /* renamed from: b, reason: collision with root package name */
    public final b f106379b;

    /* renamed from: c, reason: collision with root package name */
    public final b f106380c;

    static {
    }

    public a(b r2, b r3, b r4) {
        p.l(r2, "stocks");
        p.l(r3, "bonds");
        p.l(r4, "portfolio");
        this.f106378a = r2;
        this.f106379b = r3;
        this.f106380c = r4;
    }

    public final a a(b r2, b r3, b r4) {
        p.l(r2, "stocks");
        p.l(r3, "bonds");
        p.l(r4, "portfolio");
        return new a(r2, r3, r4);
    }

    public final b b() {
        return this.f106379b;
    }

    public final b c() {
        return this.f106380c;
    }

    public final b d() {
        return this.f106378a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f106378a, r52.f106378a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f106379b, r52.f106379b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f106380c, r52.f106380c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f106378a.hashCode() * 31) + this.f106379b.hashCode()) * 31) + this.f106380c.hashCode();
    }

    public String toString() {
        return "PortfolioFilter(stocks=" + this.f106378a + ", bonds=" + this.f106379b + ", portfolio=" + this.f106380c + ')';
    }

    public /* synthetic */ a(b r4, b r5, b r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r4 = new b(null, false, 3, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r5 = new b(null, false, 3, null);
    L9:
        if ((r7 & 4) == 0) goto L11;
        r6 = new b(null, false, 3, null);
    L11:
        this(r4, r5, r6);
    }
}
