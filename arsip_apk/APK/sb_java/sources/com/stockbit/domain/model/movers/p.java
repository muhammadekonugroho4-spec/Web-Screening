package com.stockbit.domain.model.movers;

import java.util.List;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final List f84396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84397b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84398c;

    public p(List r2, String r3, List r4) {
        kotlin.jvm.internal.p.l(r2, "availableMoverTypes");
        kotlin.jvm.internal.p.l(r3, "defaultMoverType");
        kotlin.jvm.internal.p.l(r4, "availableFilterStocks");
        this.f84396a = r2;
        this.f84397b = r3;
        this.f84398c = r4;
    }

    public final List a() {
        return this.f84398c;
    }

    public final List b() {
        return this.f84396a;
    }

    public final String c() {
        return this.f84397b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f84396a, r52.f84396a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84397b, r52.f84397b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84398c, r52.f84398c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84396a.hashCode() * 31) + this.f84397b.hashCode()) * 31) + this.f84398c.hashCode();
    }

    public String toString() {
        return "MoversOptionsEntity(availableMoverTypes=" + this.f84396a + ", defaultMoverType=" + this.f84397b + ", availableFilterStocks=" + this.f84398c + ")";
    }
}
