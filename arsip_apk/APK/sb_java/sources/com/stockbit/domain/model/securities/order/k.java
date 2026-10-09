package com.stockbit.domain.model.securities.order;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f85551a;

    public k(String r2) {
        p.l(r2, "orderId");
        this.f85551a = r2;
    }

    public final String a() {
        return this.f85551a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f85551a, ((k) r4).f85551a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f85551a.hashCode();
    }

    public String toString() {
        return "OrderSellEntity(orderId=" + this.f85551a + ")";
    }
}
