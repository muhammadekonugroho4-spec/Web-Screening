package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final d f158358a;

    public f(d r2) {
        kotlin.jvm.internal.p.l(r2, "uiState");
        this.f158358a = r2;
    }

    public final d a() {
        return this.f158358a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f158358a, ((f) r4).f158358a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158358a.hashCode();
    }

    public String toString() {
        return "DoubleOtpLogin(uiState=" + this.f158358a + ')';
    }
}
