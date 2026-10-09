package com.stockbit.usecase.movers.model.param;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f158540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158542c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f158543e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f158544f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f158545g;

    public a(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        this.f158540a = r1;
        this.f158541b = r2;
        this.f158542c = r3;
        this.d = r4;
        this.f158543e = r5;
        this.f158544f = r6;
        this.f158545g = r7;
    }

    public final boolean a() {
        return this.f158542c;
    }

    public final boolean b() {
        return this.f158541b;
    }

    public final boolean c() {
        return this.f158540a;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.f158545g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f158540a == r52.f158540a) goto L12;
        return false;
    L12:
        if (this.f158541b == r52.f158541b) goto L15;
        return false;
    L15:
        if (this.f158542c == r52.f158542c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f158543e == r52.f158543e) goto L24;
        return false;
    L24:
        if (this.f158544f == r52.f158544f) goto L27;
        return false;
    L27:
        if (this.f158545g == r52.f158545g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f158543e;
    }

    public final boolean g() {
        return this.f158544f;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f158540a) * 31) + Boolean.hashCode(this.f158541b)) * 31) + Boolean.hashCode(this.f158542c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f158543e)) * 31) + Boolean.hashCode(this.f158544f)) * 31) + Boolean.hashCode(this.f158545g);
    }

    public String toString() {
        return "MoversFilterParam(isBoardMainChecked=" + this.f158540a + ", isBoardDevelopmentChecked=" + this.f158541b + ", isBoardAccelerationChecked=" + this.f158542c + ", isBoardNewEconomicChecked=" + this.d + ", isSpecialMonitoringChecked=" + this.f158543e + ", isWarrantOrRightChecked=" + this.f158544f + ", isShariaOnlyChecked=" + this.f158545g + ")";
    }
}
