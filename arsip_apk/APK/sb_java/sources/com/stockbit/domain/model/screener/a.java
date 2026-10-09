package com.stockbit.domain.model.screener;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84868a;

    public a(boolean r1) {
        this.f84868a = r1;
    }

    public final boolean a() {
        return this.f84868a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (this.f84868a == ((a) r4).f84868a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f84868a);
    }

    public String toString() {
        return "ScreenerBadgesEntity(isNew=" + this.f84868a + ")";
    }
}
