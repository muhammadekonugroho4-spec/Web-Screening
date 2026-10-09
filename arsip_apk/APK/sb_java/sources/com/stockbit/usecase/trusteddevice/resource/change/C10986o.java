package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10986o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f164288a;

    public C10986o(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164288a = r2;
    }

    public final String a() {
        return this.f164288a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10986o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164288a, ((C10986o) r4).f164288a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164288a.hashCode();
    }

    public String toString() {
        return "RequestSessionError(message=" + this.f164288a + ')';
    }
}
