package com.stockbit.usecase.company.model.historicaldata;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f156251a;

    public d(boolean r1) {
        this.f156251a = r1;
    }

    public final boolean a() {
        return this.f156251a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (this.f156251a == ((d) r4).f156251a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f156251a);
    }

    public String toString() {
        return "PaginationInfoUIState(isLastPage=" + this.f156251a + ")";
    }
}
