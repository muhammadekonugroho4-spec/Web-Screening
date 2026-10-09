package com.stockbit.domain.model.entity.securities;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f83488a;

    public d(String r1) {
        this.f83488a = r1;
    }

    public final String a() {
        return this.f83488a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f83488a, ((d) r4).f83488a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f83488a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "CashOnHand(availableCashOnHand=" + this.f83488a + ')';
    }
}
