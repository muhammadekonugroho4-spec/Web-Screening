package com.stockbit.domain.model.securities.order;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85431b;

    public e(String r2, int r3) {
        p.l(r2, "orderId");
        this.f85430a = r2;
        this.f85431b = r3;
    }

    public final String a() {
        return this.f85430a;
    }

    public final int b() {
        return this.f85431b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f85430a, r52.f85430a) == true) goto L12;
        return false;
    L12:
        if (this.f85431b == r52.f85431b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85430a.hashCode() * 31) + Integer.hashCode(this.f85431b);
    }

    public String toString() {
        return "OrderBuyEntity(orderId=" + this.f85430a + ", orderLimitTodayCount=" + this.f85431b + ")";
    }
}
