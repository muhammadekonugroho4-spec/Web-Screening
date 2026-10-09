package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f164343a;

    public p(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164343a = r2;
    }

    public final String a() {
        return this.f164343a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164343a, ((p) r4).f164343a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164343a.hashCode();
    }

    public String toString() {
        return "FieldError(message=" + this.f164343a + ')';
    }
}
