package com.stockbit.usecase.trusteddevice.resource.change;

/* loaded from: classes2.dex */
public final class N implements O {

    /* renamed from: a, reason: collision with root package name */
    public final String f164266a;

    public N(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164266a = r2;
    }

    public final String a() {
        return this.f164266a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof N) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164266a, ((N) r4).f164266a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164266a.hashCode();
    }

    public String toString() {
        return "ValidationLimitError(message=" + this.f164266a + ')';
    }
}
