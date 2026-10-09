package com.stockbit.usecase.company.model;

import java.util.List;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public String f156155a;

    /* renamed from: b, reason: collision with root package name */
    public List f156156b;

    public E(String r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "metricGroupName");
        kotlin.jvm.internal.p.l(r3, "metrics");
        this.f156155a = r2;
        this.f156156b = r3;
    }

    public final String a() {
        return this.f156155a;
    }

    public final List b() {
        return this.f156156b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof E) == true) goto L8;
        return false;
    L8:
        E r52 = (E) r5;
        if (kotlin.jvm.internal.p.g(this.f156155a, r52.f156155a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156156b, r52.f156156b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156155a.hashCode() * 31) + this.f156156b.hashCode();
    }

    public String toString() {
        return "MetricGroupItemUIState(metricGroupName=" + this.f156155a + ", metrics=" + this.f156156b + ")";
    }
}
