package com.clevertap.android.sdk.inapp.evaluation;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public double f34191a;

    /* renamed from: b, reason: collision with root package name */
    public double f34192b;

    /* renamed from: c, reason: collision with root package name */
    public double f34193c;

    public k(double r1, double r3, double r5) {
        this.f34191a = r1;
        this.f34192b = r3;
        this.f34193c = r5;
    }

    public final double a() {
        return this.f34191a;
    }

    public final double b() {
        return this.f34192b;
    }

    public final double c() {
        return this.f34193c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (Double.compare(this.f34191a, r82.f34191a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f34192b, r82.f34192b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f34193c, r82.f34193c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f34191a) * 31) + Double.hashCode(this.f34192b)) * 31) + Double.hashCode(this.f34193c);
    }

    public String toString() {
        return "TriggerGeoRadius(latitude=" + this.f34191a + ", longitude=" + this.f34192b + ", radius=" + this.f34193c + ')';
    }
}
