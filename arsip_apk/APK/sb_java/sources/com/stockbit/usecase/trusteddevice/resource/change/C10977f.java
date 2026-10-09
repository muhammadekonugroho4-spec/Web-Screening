package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10977f implements InterfaceC10978g {

    /* renamed from: a, reason: collision with root package name */
    public final String f164277a;

    public C10977f(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164277a = r2;
    }

    public final String a() {
        return this.f164277a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10977f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164277a, ((C10977f) r4).f164277a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164277a.hashCode();
    }

    public String toString() {
        return "ValidationLimitError(message=" + this.f164277a + ')';
    }
}
