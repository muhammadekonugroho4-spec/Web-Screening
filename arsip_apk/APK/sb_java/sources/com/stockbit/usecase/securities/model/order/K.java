package com.stockbit.usecase.securities.model.order;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final String f161159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161160b;

    public K(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "trailingPercentage");
        kotlin.jvm.internal.p.l(r3, "stopPrice");
        this.f161159a = r2;
        this.f161160b = r3;
    }

    public final String a() {
        return this.f161160b;
    }

    public final String b() {
        return this.f161159a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof K) == true) goto L8;
        return false;
    L8:
        K r52 = (K) r5;
        if (kotlin.jvm.internal.p.g(this.f161159a, r52.f161159a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161160b, r52.f161160b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f161159a.hashCode() * 31) + this.f161160b.hashCode();
    }

    public String toString() {
        return "TrailingStopUIState(trailingPercentage=" + this.f161159a + ", stopPrice=" + this.f161160b + ")";
    }
}
