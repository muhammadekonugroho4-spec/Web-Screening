package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f81247a;

    public r(int r1) {
        this.f81247a = r1;
    }

    public final int a() {
        return this.f81247a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof r) == true) goto L9;
        return false;
    L9:
        if (this.f81247a == ((r) r4).f81247a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f81247a);
    }

    public String toString() {
        return "PrivateGroupAttributeEntity(id=" + this.f81247a + ")";
    }
}
