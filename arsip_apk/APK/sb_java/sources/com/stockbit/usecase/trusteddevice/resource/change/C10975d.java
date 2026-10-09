package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10975d implements InterfaceC10978g {

    /* renamed from: a, reason: collision with root package name */
    public final String f164275a;

    public C10975d(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164275a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10975d) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164275a, ((C10975d) r4).f164275a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164275a.hashCode();
    }

    public String toString() {
        return "NoSecuritiesAccountError(message=" + this.f164275a + ')';
    }
}
