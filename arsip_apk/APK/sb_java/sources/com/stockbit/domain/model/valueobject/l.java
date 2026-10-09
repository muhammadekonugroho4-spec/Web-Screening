package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f86852a;

    /* renamed from: b, reason: collision with root package name */
    public String f86853b;

    public l(String r1, String r2) {
        this.f86852a = r1;
        this.f86853b = r2;
    }

    public final String a() {
        return this.f86853b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f86852a, r52.f86852a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86853b, r52.f86853b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86852a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86853b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ReferralListPage(current=" + this.f86852a + ", total=" + this.f86853b + ')';
    }
}
