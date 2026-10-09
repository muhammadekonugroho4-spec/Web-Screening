package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f164333a;

    public j(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164333a = r2;
    }

    public final String a() {
        return this.f164333a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164333a, ((j) r4).f164333a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164333a.hashCode();
    }

    public String toString() {
        return "OTPLimit(message=" + this.f164333a + ')';
    }
}
