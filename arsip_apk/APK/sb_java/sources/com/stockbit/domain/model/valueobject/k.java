package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public l f86850a;

    /* renamed from: b, reason: collision with root package name */
    public m f86851b;

    public k(l r1, m r2) {
        this.f86850a = r1;
        this.f86851b = r2;
    }

    public final l a() {
        return this.f86850a;
    }

    public final m b() {
        return this.f86851b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f86850a, r52.f86850a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86851b, r52.f86851b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        l r02 = this.f86850a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        m r2 = this.f86851b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ReferralListMeta(page=" + this.f86850a + ", record=" + this.f86851b + ')';
    }
}
