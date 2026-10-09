package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f84737a;

    public r(String r2) {
        kotlin.jvm.internal.p.l(r2, "orderBookInfo");
        this.f84737a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof r) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f84737a, ((r) r4).f84737a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84737a.hashCode();
    }

    public String toString() {
        return "SecuritiesEntity(orderBookInfo=" + this.f84737a + ")";
    }

    public /* synthetic */ r(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
