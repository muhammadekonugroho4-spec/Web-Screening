package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f81845a;

    public r(List r2) {
        kotlin.jvm.internal.p.l(r2, "reverses");
        this.f81845a = r2;
    }

    public final List a() {
        return this.f81845a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof r) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81845a, ((r) r4).f81845a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81845a.hashCode();
    }

    public String toString() {
        return "CorpActionReverseSplitEntity(reverses=" + this.f81845a + ")";
    }
}
