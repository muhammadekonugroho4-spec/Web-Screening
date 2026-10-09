package com.stockbit.usecase.screener.model;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f159715a;

    public a(boolean r1) {
        this.f159715a = r1;
    }

    public final boolean a() {
        return this.f159715a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (this.f159715a == ((a) r4).f159715a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f159715a);
    }

    public String toString() {
        return "ScreenerBadgesUIState(isNew=" + this.f159715a + ")";
    }
}
