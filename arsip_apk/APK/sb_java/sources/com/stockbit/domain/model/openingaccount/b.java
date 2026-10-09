package com.stockbit.domain.model.openingaccount;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84520a;

    public b(boolean r1) {
        this.f84520a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (this.f84520a == ((b) r4).f84520a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f84520a);
    }

    public String toString() {
        return "BibitAccountValidationEntity(status=" + this.f84520a + ")";
    }
}
