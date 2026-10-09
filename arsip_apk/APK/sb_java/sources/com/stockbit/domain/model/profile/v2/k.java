package com.stockbit.domain.model.profile.v2;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f84854a;

    public k(String r2) {
        p.l(r2, "orderBookInfo");
        this.f84854a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84854a, ((k) r4).f84854a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84854a.hashCode();
    }

    public String toString() {
        return "MyProfileSecuritiesPreferencesEntity(orderBookInfo=" + this.f84854a + ")";
    }

    public /* synthetic */ k(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
