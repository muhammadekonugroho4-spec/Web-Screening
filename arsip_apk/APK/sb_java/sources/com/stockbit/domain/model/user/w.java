package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f86696a;

    public w(String r1) {
        this.f86696a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof w) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f86696a, ((w) r4).f86696a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86696a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "ValidateIdentityEntity(token=" + this.f86696a + ")";
    }
}
