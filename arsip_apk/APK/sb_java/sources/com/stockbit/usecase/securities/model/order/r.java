package com.stockbit.usecase.securities.model.order;

import java.util.List;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f161428a;

    /* renamed from: b, reason: collision with root package name */
    public final List f161429b;

    public r(List r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "original");
        kotlin.jvm.internal.p.l(r3, "filtered");
        this.f161428a = r2;
        this.f161429b = r3;
    }

    public final List a() {
        return this.f161429b;
    }

    public final List b() {
        return this.f161428a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f161428a, r52.f161428a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161429b, r52.f161429b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f161428a.hashCode() * 31) + this.f161429b.hashCode();
    }

    public String toString() {
        return "OrderListUIState(original=" + this.f161428a + ", filtered=" + this.f161429b + ")";
    }
}
