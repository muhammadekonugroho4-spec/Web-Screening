package com.stockbit.domain.model.websocket.financial;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f87262a;

    public f(List r2) {
        p.l(r2, "symbols");
        this.f87262a = r2;
    }

    public List a() {
        return this.f87262a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f87262a, ((f) r4).f87262a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f87262a.hashCode();
    }

    public String toString() {
        return "LivePriceV3(symbols=" + this.f87262a + ")";
    }
}
