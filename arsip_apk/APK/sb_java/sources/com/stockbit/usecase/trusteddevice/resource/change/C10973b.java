package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10973b implements InterfaceC10978g {

    /* renamed from: a, reason: collision with root package name */
    public final String f164273a;

    public C10973b(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164273a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10973b) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164273a, ((C10973b) r4).f164273a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164273a.hashCode();
    }

    public String toString() {
        return "InvalidDeviceError(message=" + this.f164273a + ')';
    }
}
