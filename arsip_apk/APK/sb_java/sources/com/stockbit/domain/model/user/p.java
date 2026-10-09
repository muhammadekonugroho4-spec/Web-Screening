package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f86669a;

    public p(String r2) {
        kotlin.jvm.internal.p.l(r2, "changePassword");
        this.f86669a = r2;
    }

    public final String a() {
        return this.f86669a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof p) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f86669a, ((p) r4).f86669a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f86669a.hashCode();
    }

    public String toString() {
        return "UserCredentialStatusEntity(changePassword=" + this.f86669a + ")";
    }
}
