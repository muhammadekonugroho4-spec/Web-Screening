package com.stockbit.usecase.cryptodetail.contract.entity;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f157094a;

    public j(int r1) {
        this.f157094a = r1;
    }

    public final int a() {
        return this.f157094a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (this.f157094a == ((j) r4).f157094a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f157094a);
    }

    public String toString() {
        return "CryptoSeasonalityYearEntity(backYears=" + this.f157094a + ")";
    }
}
