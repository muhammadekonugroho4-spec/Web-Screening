package com.stockbit.domain.model.eipo;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f82133a;

    public e(List r2) {
        p.l(r2, "details");
        this.f82133a = r2;
    }

    public final List a() {
        return this.f82133a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f82133a, ((e) r4).f82133a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f82133a.hashCode();
    }

    public String toString() {
        return "EIpoCompanyStatusEntity(details=" + this.f82133a + ")";
    }
}
