package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f164353a;

    public v(String r2) {
        kotlin.jvm.internal.p.l(r2, "errorMessage");
        this.f164353a = r2;
    }

    public final String a() {
        return this.f164353a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof v) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164353a, ((v) r4).f164353a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164353a.hashCode();
    }

    public String toString() {
        return "FieldError(errorMessage=" + this.f164353a + ')';
    }
}
