package com.stockbit.domain.model.securities.formula;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f85185a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85186b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85187c;

    public e(double r1, double r3, double r5) {
        this.f85185a = r1;
        this.f85186b = r3;
        this.f85187c = r5;
    }

    public final double a() {
        return this.f85185a;
    }

    public final double b() {
        return this.f85187c;
    }

    public final double c() {
        return this.f85186b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f85185a, r82.f85185a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85186b, r82.f85186b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85187c, r82.f85187c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f85185a) * 31) + Double.hashCode(this.f85186b)) * 31) + Double.hashCode(this.f85187c);
    }

    public String toString() {
        return "FeeNegoEntity(buy=" + this.f85185a + ", sell=" + this.f85186b + ", otc=" + this.f85187c + ")";
    }
}
