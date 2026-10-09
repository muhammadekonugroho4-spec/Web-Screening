package com.stockbit.usecase.registration.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f159529a;

    public b(String r2) {
        p.l(r2, "completionToken");
        this.f159529a = r2;
    }

    public final String a() {
        return this.f159529a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f159529a, ((b) r4).f159529a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f159529a.hashCode();
    }

    public String toString() {
        return "Completed(completionToken=" + this.f159529a + ")";
    }
}
