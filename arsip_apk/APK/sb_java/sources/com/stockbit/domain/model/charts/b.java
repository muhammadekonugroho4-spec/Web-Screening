package com.stockbit.domain.model.charts;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f81183a;

    public b(List r2) {
        p.l(r2, "chartPoints");
        this.f81183a = r2;
    }

    public final List a() {
        return this.f81183a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81183a, ((b) r4).f81183a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81183a.hashCode();
    }

    public String toString() {
        return "ChartsEntity(chartPoints=" + this.f81183a + ")";
    }
}
