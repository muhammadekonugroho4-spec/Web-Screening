package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f86751a;

    public b(String r1) {
        this.f86751a = r1;
    }

    public final String a() {
        return this.f86751a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f86751a, ((b) r4).f86751a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86751a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "CouponListMeta(totalVoucher=" + this.f86751a + ')';
    }
}
