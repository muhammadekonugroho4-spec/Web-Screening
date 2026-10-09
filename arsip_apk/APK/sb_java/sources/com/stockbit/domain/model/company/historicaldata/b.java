package com.stockbit.domain.model.company.historicaldata;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f81535a;

    public b(int r1) {
        this.f81535a = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (this.f81535a == ((b) r4).f81535a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f81535a);
    }

    public String toString() {
        return "HistoricalDataPaginationEntity(nextPage=" + this.f81535a + ")";
    }
}
