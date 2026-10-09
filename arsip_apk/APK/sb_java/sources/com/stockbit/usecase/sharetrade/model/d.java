package com.stockbit.usecase.sharetrade.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f162917a;

    public d(String r1) {
        this.f162917a = r1;
    }

    public final String a() {
        return this.f162917a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f162917a, ((d) r4).f162917a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f162917a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ShareTradeTargetPaginationUIState(nextCursor=" + this.f162917a + ")";
    }
}
