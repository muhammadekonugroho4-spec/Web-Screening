package com.stockbit.usecase.securities.resource;

import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public final class D implements H {

    /* renamed from: a, reason: collision with root package name */
    public final DomainExodusException f162050a;

    public D(DomainExodusException r2) {
        kotlin.jvm.internal.p.l(r2, "errorDetails");
        this.f162050a = r2;
    }

    public final DomainExodusException a() {
        return this.f162050a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof D) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f162050a, ((D) r4).f162050a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f162050a.hashCode();
    }

    public String toString() {
        return "CompanyDetails(errorDetails=" + this.f162050a + ")";
    }
}
