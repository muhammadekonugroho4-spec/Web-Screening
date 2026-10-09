package com.stockbit.usecase.runningtrade.model.pagination;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f159642a;

    public b(Object r1) {
        this.f159642a = r1;
    }

    public final Object a() {
        return this.f159642a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f159642a, ((b) r4).f159642a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f159642a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "RequestPageUIState(requestKey=" + this.f159642a + ")";
    }
}
