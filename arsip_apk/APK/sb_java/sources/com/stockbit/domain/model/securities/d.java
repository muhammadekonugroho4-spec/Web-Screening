package com.stockbit.domain.model.securities;

import java.util.List;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f85111a;

    /* renamed from: b, reason: collision with root package name */
    public final e f85112b;

    public d(List r2, e r3) {
        kotlin.jvm.internal.p.l(r2, "historyRealizedList");
        kotlin.jvm.internal.p.l(r3, "meta");
        this.f85111a = r2;
        this.f85112b = r3;
    }

    public final List a() {
        return this.f85111a;
    }

    public final e b() {
        return this.f85112b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f85111a, r52.f85111a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85112b, r52.f85112b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85111a.hashCode() * 31) + this.f85112b.hashCode();
    }

    public String toString() {
        return "HistoryEntity(historyRealizedList=" + this.f85111a + ", meta=" + this.f85112b + ")";
    }
}
