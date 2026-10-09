package com.stockbit.usecase.trusteddevice.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f164307a;

    public d(String r2) {
        p.l(r2, "acknowledgeToken");
        this.f164307a = r2;
    }

    public final String a() {
        return this.f164307a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f164307a, ((d) r4).f164307a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164307a.hashCode();
    }

    public String toString() {
        return "Approved(acknowledgeToken=" + this.f164307a + ')';
    }
}
