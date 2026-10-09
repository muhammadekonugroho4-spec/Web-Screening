package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f158366a;

    public l(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f158366a = r2;
    }

    public final String a() {
        return this.f158366a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof l) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f158366a, ((l) r4).f158366a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158366a.hashCode();
    }

    public String toString() {
        return "OTPLimit(message=" + this.f158366a + ')';
    }
}
