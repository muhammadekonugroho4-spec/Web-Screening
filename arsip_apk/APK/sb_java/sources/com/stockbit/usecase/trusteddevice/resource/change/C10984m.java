package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10984m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f164286a;

    public C10984m(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164286a = r2;
    }

    public final String a() {
        return this.f164286a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10984m) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164286a, ((C10984m) r4).f164286a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164286a.hashCode();
    }

    public String toString() {
        return "OTPLimitError(message=" + this.f164286a + ')';
    }
}
