package com.stockbit.usecase.trusteddevice.resource.change;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10983l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f164285a;

    public C10983l(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f164285a = r2;
    }

    public final String a() {
        return this.f164285a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10983l) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164285a, ((C10983l) r4).f164285a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164285a.hashCode();
    }

    public String toString() {
        return "InvalidParameterError(message=" + this.f164285a + ')';
    }
}
