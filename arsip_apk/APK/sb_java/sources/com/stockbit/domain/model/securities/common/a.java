package com.stockbit.domain.model.securities.common;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85065a;

    public a(String r2) {
        p.l(r2, "availableCashOnHand");
        this.f85065a = r2;
    }

    public final String a() {
        return this.f85065a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f85065a, ((a) r4).f85065a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f85065a.hashCode();
    }

    public String toString() {
        return "BalanceCashEntity(availableCashOnHand=" + this.f85065a + ")";
    }
}
