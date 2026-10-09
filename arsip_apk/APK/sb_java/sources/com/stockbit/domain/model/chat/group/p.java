package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81244a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81245b;

    public p(boolean r1, long r2) {
        this.f81244a = r1;
        this.f81245b = r2;
    }

    public final long a() {
        return this.f81245b;
    }

    public final boolean b() {
        return this.f81244a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof p) == true) goto L8;
        return false;
    L8:
        p r82 = (p) r8;
        if (this.f81244a == r82.f81244a) goto L12;
        return false;
    L12:
        if (this.f81245b == r82.f81245b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81244a) * 31) + Long.hashCode(this.f81245b);
    }

    public String toString() {
        return "MinimumPortfolioEquityEntity(isEnabled=" + this.f81244a + ", value=" + this.f81245b + ")";
    }
}
