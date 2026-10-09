package com.stockbit.usecase.securities.usecase.portfolio;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f162616a;

    /* renamed from: b, reason: collision with root package name */
    public final List f162617b;

    /* renamed from: c, reason: collision with root package name */
    public final List f162618c;
    public final List d;

    public b(List r2, List r3, List r4, List r5) {
        p.l(r2, "margin");
        p.l(r3, "dayTrade");
        p.l(r4, "regular");
        p.l(r5, "bonds");
        this.f162616a = r2;
        this.f162617b = r3;
        this.f162618c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.d;
    }

    public final List b() {
        return this.f162617b;
    }

    public final List c() {
        return this.f162616a;
    }

    public final List d() {
        return this.f162618c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f162616a, r52.f162616a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162617b, r52.f162617b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f162618c, r52.f162618c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f162616a.hashCode() * 31) + this.f162617b.hashCode()) * 31) + this.f162618c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SortStock(margin=" + this.f162616a + ", dayTrade=" + this.f162617b + ", regular=" + this.f162618c + ", bonds=" + this.d + ")";
    }
}
