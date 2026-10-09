package com.stockbit.usecase.securities.resource;

/* loaded from: classes2.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f162141a;

    public d0(String r2) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f162141a = r2;
    }

    public final String a() {
        return this.f162141a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d0) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f162141a, ((d0) r4).f162141a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f162141a.hashCode();
    }

    public String toString() {
        return "NotTradable(message=" + this.f162141a + ")";
    }
}
