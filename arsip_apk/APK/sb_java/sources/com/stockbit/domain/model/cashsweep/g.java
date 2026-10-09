package com.stockbit.domain.model.cashsweep;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81134a;

    public g(String r2) {
        p.l(r2, "webviewUrl");
        this.f81134a = r2;
    }

    public final String a() {
        return this.f81134a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81134a, ((g) r4).f81134a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81134a.hashCode();
    }

    public String toString() {
        return "CashSweepRedemptionEntity(webviewUrl=" + this.f81134a + ")";
    }
}
