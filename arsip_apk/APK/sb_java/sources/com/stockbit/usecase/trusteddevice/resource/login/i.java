package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f164332a;

    public i(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164332a = r2;
    }

    public final String a() {
        return this.f164332a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164332a, ((i) r4).f164332a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164332a.hashCode();
    }

    public String toString() {
        return "InvalidSession(message=" + this.f164332a + ')';
    }
}
