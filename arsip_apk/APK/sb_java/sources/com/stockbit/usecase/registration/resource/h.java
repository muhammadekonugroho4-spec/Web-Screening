package com.stockbit.usecase.registration.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f159541a;

    public h(String r2) {
        p.l(r2, "message");
        this.f159541a = r2;
    }

    public final String a() {
        return this.f159541a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f159541a, ((h) r4).f159541a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f159541a.hashCode();
    }

    public String toString() {
        return "WithoutAuthToken(message=" + this.f159541a + ")";
    }
}
