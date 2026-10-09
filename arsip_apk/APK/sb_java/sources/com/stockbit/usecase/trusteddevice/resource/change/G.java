package com.stockbit.usecase.trusteddevice.resource.change;

/* loaded from: classes2.dex */
public final class G implements J {

    /* renamed from: a, reason: collision with root package name */
    public final String f164257a;

    public G(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164257a = r2;
    }

    public final String a() {
        return this.f164257a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof G) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164257a, ((G) r4).f164257a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164257a.hashCode();
    }

    public String toString() {
        return "InvalidParameterError(message=" + this.f164257a + ')';
    }
}
