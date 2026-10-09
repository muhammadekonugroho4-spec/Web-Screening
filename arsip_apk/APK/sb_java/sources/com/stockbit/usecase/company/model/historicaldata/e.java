package com.stockbit.usecase.company.model.historicaldata;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f156252a;

    public e(int r1) {
        this.f156252a = r1;
    }

    public final int a() {
        return this.f156252a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (this.f156252a == ((e) r4).f156252a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f156252a);
    }

    public String toString() {
        return "RequestPageUIState(lastVisibleItemIndex=" + this.f156252a + ")";
    }
}
