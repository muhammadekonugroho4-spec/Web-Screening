package com.stockbit.domain.model.intraservice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84181a;

    public a(String r2) {
        p.l(r2, "message");
        this.f84181a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84181a, ((a) r4).f84181a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f84181a.hashCode();
    }

    public String toString() {
        return "MoveCashEntity(message=" + this.f84181a + ")";
    }
}
