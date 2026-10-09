package com.stockbit.usecase.search.model;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f160045a;

    public p(String r2) {
        kotlin.jvm.internal.p.l(r2, "notationCode");
        this.f160045a = r2;
    }

    public final String a() {
        return this.f160045a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f160045a, ((p) r4).f160045a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f160045a.hashCode();
    }

    public String toString() {
        return "NotationItemUIState(notationCode=" + this.f160045a + ")";
    }
}
