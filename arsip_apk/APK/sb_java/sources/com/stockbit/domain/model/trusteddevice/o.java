package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f86159a;

    public o(String r2) {
        p.l(r2, "token");
        this.f86159a = r2;
    }

    public final String a() {
        return this.f86159a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f86159a, ((o) r4).f86159a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f86159a.hashCode();
    }

    public String toString() {
        return "TrustedDeviceTokenEntity(token=" + this.f86159a + ")";
    }
}
