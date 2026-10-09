package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public Integer f86920a;

    /* renamed from: b, reason: collision with root package name */
    public String f86921b;

    public p(Integer r1, String r2) {
        this.f86920a = r1;
        this.f86921b = r2;
    }

    public final Integer a() {
        return this.f86920a;
    }

    public final String b() {
        return this.f86921b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f86920a, r52.f86920a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86921b, r52.f86921b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f86920a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86921b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SnkRewardStock(lot=" + this.f86920a + ", stockCode=" + this.f86921b + ')';
    }
}
