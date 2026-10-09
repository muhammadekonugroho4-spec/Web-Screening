package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final List f81982a;

    public t(List r2) {
        kotlin.jvm.internal.p.l(r2, "rups");
        this.f81982a = r2;
    }

    public final List a() {
        return this.f81982a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof t) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81982a, ((t) r4).f81982a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81982a.hashCode();
    }

    public String toString() {
        return "CorpActionRupsEntity(rups=" + this.f81982a + ")";
    }
}
