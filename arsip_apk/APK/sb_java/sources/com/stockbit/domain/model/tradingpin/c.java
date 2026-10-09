package com.stockbit.domain.model.tradingpin;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86089a;

    public c(String r1) {
        this.f86089a = r1;
    }

    public final String a() {
        return this.f86089a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f86089a, ((c) r4).f86089a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86089a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ChangePinFaceMatchingEntity(refId=" + this.f86089a + ")";
    }
}
