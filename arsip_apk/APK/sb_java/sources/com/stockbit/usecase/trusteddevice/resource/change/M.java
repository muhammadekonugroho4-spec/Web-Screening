package com.stockbit.usecase.trusteddevice.resource.change;

/* loaded from: classes2.dex */
public final class M implements O {

    /* renamed from: a, reason: collision with root package name */
    public final String f164265a;

    public M(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164265a = r2;
    }

    public final String a() {
        return this.f164265a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof M) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164265a, ((M) r4).f164265a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164265a.hashCode();
    }

    public String toString() {
        return "RequestSessionError(message=" + this.f164265a + ')';
    }
}
