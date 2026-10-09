package com.stockbit.usecase.securities.model.fasttrade;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List f160565a;

    public b(List r2) {
        p.l(r2, "list");
        this.f160565a = r2;
    }

    public final List a() {
        return this.f160565a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f160565a, ((b) r4).f160565a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f160565a.hashCode();
    }

    public String toString() {
        return "FastTradeOrderListUIState(list=" + this.f160565a + ")";
    }
}
