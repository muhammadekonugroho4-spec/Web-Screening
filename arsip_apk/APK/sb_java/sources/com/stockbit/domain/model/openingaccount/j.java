package com.stockbit.domain.model.openingaccount;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f84558a;

    public j(List r2) {
        p.l(r2, "options");
        this.f84558a = r2;
    }

    public final List a() {
        return this.f84558a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84558a, ((j) r4).f84558a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84558a.hashCode();
    }

    public String toString() {
        return "SecuritiesOADynamicOptionListEntity(options=" + this.f84558a + ")";
    }
}
