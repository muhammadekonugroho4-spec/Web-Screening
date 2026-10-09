package com.stockbit.domain.model.entity.virtual;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83845a;

    public b(String r1) {
        this.f83845a = r1;
    }

    public final String a() {
        return this.f83845a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f83845a, ((b) r4).f83845a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83845a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TradingBuy(orderid=" + this.f83845a + ')';
    }
}
