package com.stockbit.usecase.search.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f159999a;

    /* renamed from: b, reason: collision with root package name */
    public final List f160000b;

    public d(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "main");
        kotlin.jvm.internal.p.l(r3, "all");
        this.f159999a = r2;
        this.f160000b = r3;
    }

    public final List a() {
        return this.f160000b;
    }

    public final List b() {
        return this.f159999a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f159999a, r52.f159999a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160000b, r52.f160000b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f159999a.hashCode() * 31) + this.f160000b.hashCode();
    }

    public String toString() {
        return "EmittenIndexUIState(main=" + this.f159999a + ", all=" + this.f160000b + ")";
    }
}
