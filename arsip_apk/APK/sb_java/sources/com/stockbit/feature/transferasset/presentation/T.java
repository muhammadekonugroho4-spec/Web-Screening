package com.stockbit.feature.transferasset.presentation;

/* loaded from: classes9.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final String f116994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116995b;

    /* renamed from: c, reason: collision with root package name */
    public final double f116996c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116997e;

    static {
    }

    public T(String r2, String r3, double r4, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "iconUrl");
        kotlin.jvm.internal.p.l(r6, "tradingEnd");
        kotlin.jvm.internal.p.l(r7, "exerciseEnd");
        this.f116994a = r2;
        this.f116995b = r3;
        this.f116996c = r4;
        this.d = r6;
        this.f116997e = r7;
    }

    public final String a() {
        return this.f116997e;
    }

    public final String b() {
        return this.f116995b;
    }

    public final double c() {
        return this.f116996c;
    }

    public final String d() {
        return this.f116994a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof T) == true) goto L8;
        return false;
    L8:
        T r82 = (T) r8;
        if (kotlin.jvm.internal.p.g(this.f116994a, r82.f116994a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f116995b, r82.f116995b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f116996c, r82.f116996c) == 0) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f116997e, r82.f116997e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f116994a.hashCode() * 31) + this.f116995b.hashCode()) * 31) + Double.hashCode(this.f116996c)) * 31) + this.d.hashCode()) * 31) + this.f116997e.hashCode();
    }

    public String toString() {
        return "TransferRightWarrantCompanyInformationUIData(symbol=" + this.f116994a + ", iconUrl=" + this.f116995b + ", lot=" + this.f116996c + ", tradingEnd=" + this.d + ", exerciseEnd=" + this.f116997e + ')';
    }
}
