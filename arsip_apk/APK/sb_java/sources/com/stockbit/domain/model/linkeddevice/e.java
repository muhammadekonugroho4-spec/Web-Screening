package com.stockbit.domain.model.linkeddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f84231a;

    /* renamed from: b, reason: collision with root package name */
    public final double f84232b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84233c;
    public final String d;

    public e(double r2, double r4, String r6, String r7) {
        p.l(r6, "city");
        p.l(r7, "region");
        this.f84231a = r2;
        this.f84232b = r4;
        this.f84233c = r6;
        this.d = r7;
    }

    public final String a() {
        return this.f84233c;
    }

    public final String b() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f84231a, r82.f84231a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f84232b, r82.f84232b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f84233c, r82.f84233c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f84231a) * 31) + Double.hashCode(this.f84232b)) * 31) + this.f84233c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "GeoLocationEntity(latitude=" + this.f84231a + ", longitude=" + this.f84232b + ", city=" + this.f84233c + ", region=" + this.d + ")";
    }
}
