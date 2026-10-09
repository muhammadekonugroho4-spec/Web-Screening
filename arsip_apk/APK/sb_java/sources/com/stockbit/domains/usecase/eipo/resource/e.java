package com.stockbit.domains.usecase.eipo.resource;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f88291a;

    public e(List r2) {
        p.l(r2, "uiStates");
        this.f88291a = r2;
    }

    public final List a() {
        return this.f88291a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f88291a, ((e) r4).f88291a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f88291a.hashCode();
    }

    public String toString() {
        return "CompanyStatus(uiStates=" + this.f88291a + ")";
    }
}
