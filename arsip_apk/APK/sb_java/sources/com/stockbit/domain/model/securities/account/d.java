package com.stockbit.domain.model.securities.account;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f85018a;

    public d(String r2) {
        p.l(r2, "number");
        this.f85018a = r2;
    }

    public final String a() {
        return this.f85018a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f85018a, ((d) r4).f85018a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f85018a.hashCode();
    }

    public String toString() {
        return "MainAuthTokenAccountEntity(number=" + this.f85018a + ")";
    }

    public /* synthetic */ d(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
