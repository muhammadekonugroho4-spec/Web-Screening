package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f84351a;

    /* renamed from: b, reason: collision with root package name */
    public final double f84352b;

    public c(double r1, double r3) {
        this.f84351a = r1;
        this.f84352b = r3;
    }

    public final double a() {
        return this.f84352b;
    }

    public final double b() {
        return this.f84351a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f84351a, r82.f84351a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f84352b, r82.f84352b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f84351a) * 31) + Double.hashCode(this.f84352b);
    }

    public String toString() {
        return "MoversChangeEntity(value=" + this.f84351a + ", percentage=" + this.f84352b + ")";
    }
}
