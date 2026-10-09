package com.stockbit.domain.model.sharetrade;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f85794a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f85795b;

    public b(Boolean r1, Integer r2) {
        this.f85794a = r1;
        this.f85795b = r2;
    }

    public final Boolean a() {
        return this.f85794a;
    }

    public final Integer b() {
        return this.f85795b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85794a, r52.f85794a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85795b, r52.f85795b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f85794a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f85795b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AutoShareTradeStatusEntity(status=" + this.f85794a + ", totalActiveTargets=" + this.f85795b + ")";
    }
}
