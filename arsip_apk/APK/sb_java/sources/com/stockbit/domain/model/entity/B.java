package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82264a;

    public B(boolean r1) {
        this.f82264a = r1;
    }

    public final boolean a() {
        return this.f82264a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof B) == true) goto L9;
        return false;
    L9:
        if (this.f82264a == ((B) r4).f82264a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f82264a);
    }

    public String toString() {
        return "UserEmitten(isEmitten=" + this.f82264a + ')';
    }
}
