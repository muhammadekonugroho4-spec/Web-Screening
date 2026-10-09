package com.stockbit.domain.model.company.seasonality;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f81925a;

    public d(List r2) {
        p.l(r2, "columns");
        this.f81925a = r2;
    }

    public final List a() {
        return this.f81925a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81925a, ((d) r4).f81925a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81925a.hashCode();
    }

    public String toString() {
        return "ProbabilityEntity(columns=" + this.f81925a + ")";
    }
}
