package com.stockbit.domain.model.valueobject.stream;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f87158a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87159b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87160c;

    public h(List r2, List r3, List r4) {
        p.l(r2, "mainCategories");
        p.l(r3, "streamSubCategories");
        p.l(r4, "reportSubCategories");
        this.f87158a = r2;
        this.f87159b = r3;
        this.f87160c = r4;
    }

    public final List a() {
        return this.f87158a;
    }

    public final List b() {
        return this.f87160c;
    }

    public final List c() {
        return this.f87159b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f87158a, r52.f87158a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87159b, r52.f87159b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87160c, r52.f87160c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87158a.hashCode() * 31) + this.f87159b.hashCode()) * 31) + this.f87160c.hashCode();
    }

    public String toString() {
        return "StreamFilterData(mainCategories=" + this.f87158a + ", streamSubCategories=" + this.f87159b + ", reportSubCategories=" + this.f87160c + ')';
    }
}
