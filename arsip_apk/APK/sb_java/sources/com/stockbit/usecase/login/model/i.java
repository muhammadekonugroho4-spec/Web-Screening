package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final o f158361a;

    public i(o r2) {
        kotlin.jvm.internal.p.l(r2, "uiState");
        this.f158361a = r2;
    }

    public final o a() {
        return this.f158361a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f158361a, ((i) r4).f158361a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158361a.hashCode();
    }

    public String toString() {
        return "UnfreezeAccountVerification(uiState=" + this.f158361a + ')';
    }
}
