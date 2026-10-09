package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public String f156160a;

    /* renamed from: b, reason: collision with root package name */
    public String f156161b;

    public G(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "value");
        this.f156160a = r2;
        this.f156161b = r3;
    }

    public final String a() {
        return this.f156161b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof G) == true) goto L8;
        return false;
    L8:
        G r52 = (G) r5;
        if (kotlin.jvm.internal.p.g(this.f156160a, r52.f156160a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156161b, r52.f156161b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156160a.hashCode() * 31) + this.f156161b.hashCode();
    }

    public String toString() {
        return "MetricRatioItemUIState(symbol=" + this.f156160a + ", value=" + this.f156161b + ")";
    }
}
