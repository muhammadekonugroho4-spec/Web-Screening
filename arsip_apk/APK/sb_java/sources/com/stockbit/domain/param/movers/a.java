package com.stockbit.domain.param.movers;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87426b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87427c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87428e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87429f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87430g;

    public a(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        this.f87425a = r1;
        this.f87426b = r2;
        this.f87427c = r3;
        this.d = r4;
        this.f87428e = r5;
        this.f87429f = r6;
        this.f87430g = r7;
    }

    public final boolean a() {
        return this.f87427c;
    }

    public final boolean b() {
        return this.f87426b;
    }

    public final boolean c() {
        return this.f87425a;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.f87430g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f87425a == r52.f87425a) goto L12;
        return false;
    L12:
        if (this.f87426b == r52.f87426b) goto L15;
        return false;
    L15:
        if (this.f87427c == r52.f87427c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f87428e == r52.f87428e) goto L24;
        return false;
    L24:
        if (this.f87429f == r52.f87429f) goto L27;
        return false;
    L27:
        if (this.f87430g == r52.f87430g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f87428e;
    }

    public final boolean g() {
        return this.f87429f;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f87425a) * 31) + Boolean.hashCode(this.f87426b)) * 31) + Boolean.hashCode(this.f87427c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f87428e)) * 31) + Boolean.hashCode(this.f87429f)) * 31) + Boolean.hashCode(this.f87430g);
    }

    public String toString() {
        return "MoversFilterDomainParam(isBoardMainChecked=" + this.f87425a + ", isBoardDevelopmentChecked=" + this.f87426b + ", isBoardAccelerationChecked=" + this.f87427c + ", isBoardNewEconomicChecked=" + this.d + ", isSpecialMonitoringChecked=" + this.f87428e + ", isWarrantOrRightChecked=" + this.f87429f + ", isShariaOnlyChecked=" + this.f87430g + ")";
    }
}
