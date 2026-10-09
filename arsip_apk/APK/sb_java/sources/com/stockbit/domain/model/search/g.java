package com.stockbit.domain.model.search;

import com.stockbit.search.SearchEntryPoint;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f84962a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84963b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84964c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final j f84965e;

    public g(List r2, List r3, List r4, List r5, j r6) {
        p.l(r2, "company");
        p.l(r3, SearchEntryPoint.KEY_SECTOR);
        p.l(r4, "insider");
        p.l(r5, "people");
        p.l(r6, "pagination");
        this.f84962a = r2;
        this.f84963b = r3;
        this.f84964c = r4;
        this.d = r5;
        this.f84965e = r6;
    }

    public final List a() {
        return this.f84962a;
    }

    public final List b() {
        return this.f84964c;
    }

    public final j c() {
        return this.f84965e;
    }

    public final List d() {
        return this.d;
    }

    public final List e() {
        return this.f84963b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f84962a, r52.f84962a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84963b, r52.f84963b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84964c, r52.f84964c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84965e, r52.f84965e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f84962a.hashCode() * 31) + this.f84963b.hashCode()) * 31) + this.f84964c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84965e.hashCode();
    }

    public String toString() {
        return "SearchEntity(company=" + this.f84962a + ", sector=" + this.f84963b + ", insider=" + this.f84964c + ", people=" + this.d + ", pagination=" + this.f84965e + ")";
    }
}
