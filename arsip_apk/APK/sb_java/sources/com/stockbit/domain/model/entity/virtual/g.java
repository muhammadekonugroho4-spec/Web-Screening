package com.stockbit.domain.model.entity.virtual;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f83868a;

    public g(String r1) {
        this.f83868a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f83868a, ((g) r4).f83868a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83868a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TradingSwitchToVirtual(security=" + this.f83868a + ')';
    }
}
