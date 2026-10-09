package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81202a;

    public b(boolean r1) {
        this.f81202a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (this.f81202a == ((b) r4).f81202a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f81202a);
    }

    public String toString() {
        return "AssignUnassignAdminEntity(isAdmin=" + this.f81202a + ")";
    }
}
