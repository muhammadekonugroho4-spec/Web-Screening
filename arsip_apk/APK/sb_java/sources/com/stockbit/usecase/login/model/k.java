package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f158365a;

    public k(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f158365a = r2;
    }

    public final String a() {
        return this.f158365a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f158365a, ((k) r4).f158365a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158365a.hashCode();
    }

    public String toString() {
        return "OTPError(message=" + this.f158365a + ')';
    }
}
