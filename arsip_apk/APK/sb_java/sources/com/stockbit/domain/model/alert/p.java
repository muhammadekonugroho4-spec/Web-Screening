package com.stockbit.domain.model.alert;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final d f80626a;

    public p(d r2) {
        kotlin.jvm.internal.p.l(r2, "condition");
        this.f80626a = r2;
    }

    public final d a() {
        return this.f80626a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f80626a, ((p) r4).f80626a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f80626a.hashCode();
    }

    public String toString() {
        return "AlertRuleNodeEntity(condition=" + this.f80626a + ")";
    }
}
