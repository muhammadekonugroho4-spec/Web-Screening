package com.stockbit.domain.model.alert;

import java.util.List;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final List f80625a;

    public o(List r2) {
        kotlin.jvm.internal.p.l(r2, "and");
        this.f80625a = r2;
    }

    public final List a() {
        return this.f80625a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f80625a, ((o) r4).f80625a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f80625a.hashCode();
    }

    public String toString() {
        return "AlertRuleEntity(and=" + this.f80625a + ")";
    }
}
