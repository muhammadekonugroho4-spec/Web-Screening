package com.stockbit.domain.model.topstock;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f85900a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85901b;

    public f(long r2, String r4) {
        p.l(r4, "formatted");
        this.f85900a = r2;
        this.f85901b = r4;
    }

    public final String a() {
        return this.f85901b;
    }

    public final long b() {
        return this.f85900a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (this.f85900a == r82.f85900a) goto L12;
        return false;
    L12:
        if (p.g(this.f85901b, r82.f85901b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.f85900a) * 31) + this.f85901b.hashCode();
    }

    public String toString() {
        return "TopStockSummaryDetailEntity(raw=" + this.f85900a + ", formatted=" + this.f85901b + ")";
    }
}
