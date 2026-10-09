package com.stockbit.domain.model.company.seasonality;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f81932a;

    public g(List r2) {
        p.l(r2, "columns");
        this.f81932a = r2;
    }

    public final List a() {
        return this.f81932a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81932a, ((g) r4).f81932a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81932a.hashCode();
    }

    public String toString() {
        return "TotalMonthsEntity(columns=" + this.f81932a + ")";
    }
}
