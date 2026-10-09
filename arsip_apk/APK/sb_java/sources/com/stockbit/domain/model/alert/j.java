package com.stockbit.domain.model.alert;

import java.util.List;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final AlertInitializationConditionType f80612a;

    /* renamed from: b, reason: collision with root package name */
    public final List f80613b;

    public j(AlertInitializationConditionType r2, List r3) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r3, "options");
        this.f80612a = r2;
        this.f80613b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f80612a == r52.f80612a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80613b, r52.f80613b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80612a.hashCode() * 31) + this.f80613b.hashCode();
    }

    public String toString() {
        return "AlertInitializationConditionEntity(type=" + this.f80612a + ", options=" + this.f80613b + ")";
    }
}
