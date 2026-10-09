package com.stockbit.usecase.verification.resource;

/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f164472a;

    public d(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164472a = r2;
    }

    public final String a() {
        return this.f164472a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164472a, ((d) r4).f164472a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164472a.hashCode();
    }

    public String toString() {
        return "ExceedLimit(message=" + this.f164472a + ')';
    }
}
