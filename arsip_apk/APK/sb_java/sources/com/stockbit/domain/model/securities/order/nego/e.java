package com.stockbit.domain.model.securities.order.nego;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85571a;

    public e(String r2) {
        p.l(r2, "orderId");
        this.f85571a = r2;
    }

    public final String a() {
        return this.f85571a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f85571a, ((e) r4).f85571a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f85571a.hashCode();
    }

    public String toString() {
        return "OrderNegoEntity(orderId=" + this.f85571a + ")";
    }
}
