package com.stockbit.domain.model.search;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f84940a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84941b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84942c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f84943e;

    public e(List r2, List r3, List r4, List r5, List r6) {
        p.l(r2, "companies");
        p.l(r3, "people");
        p.l(r4, "insiders");
        p.l(r5, "sectors");
        p.l(r6, "industries");
        this.f84940a = r2;
        this.f84941b = r3;
        this.f84942c = r4;
        this.d = r5;
        this.f84943e = r6;
    }

    public final List a() {
        return this.f84940a;
    }

    public final List b() {
        return this.f84943e;
    }

    public final List c() {
        return this.f84942c;
    }

    public final List d() {
        return this.f84941b;
    }

    public final List e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f84940a, r52.f84940a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84941b, r52.f84941b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84942c, r52.f84942c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84943e, r52.f84943e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f84940a.hashCode() * 31) + this.f84941b.hashCode()) * 31) + this.f84942c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84943e.hashCode();
    }

    public String toString() {
        return "SearchAllEntity(companies=" + this.f84940a + ", people=" + this.f84941b + ", insiders=" + this.f84942c + ", sectors=" + this.d + ", industries=" + this.f84943e + ")";
    }
}
