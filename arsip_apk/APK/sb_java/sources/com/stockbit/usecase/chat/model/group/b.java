package com.stockbit.usecase.chat.model.group;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f155540a;

    public b(int r1) {
        this.f155540a = r1;
    }

    public final int a() {
        return this.f155540a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (this.f155540a == ((b) r4).f155540a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f155540a);
    }

    public String toString() {
        return "GroupLoadMoreUIState(totalRemainingMembers=" + this.f155540a + ")";
    }
}
