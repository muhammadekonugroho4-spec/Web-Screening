package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f81201a;

    public a(int r1) {
        this.f81201a = r1;
    }

    public final int a() {
        return this.f81201a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (this.f81201a == ((a) r4).f81201a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f81201a);
    }

    public String toString() {
        return "AdminStatsEntity(total=" + this.f81201a + ")";
    }
}
