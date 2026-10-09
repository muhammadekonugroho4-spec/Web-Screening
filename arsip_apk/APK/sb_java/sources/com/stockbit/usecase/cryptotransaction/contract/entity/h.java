package com.stockbit.usecase.cryptotransaction.contract.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f157412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157413b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157414c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f157415e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157416f;

    /* renamed from: g, reason: collision with root package name */
    public final double f157417g;

    public h(String r2, String r3, String r4, String r5, double r6, double r8, double r10) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "logoUrl");
        p.l(r5, "pair");
        this.f157412a = r2;
        this.f157413b = r3;
        this.f157414c = r4;
        this.d = r5;
        this.f157415e = r6;
        this.f157416f = r8;
        this.f157417g = r10;
    }

    public final String a() {
        return this.f157413b;
    }

    public final String b() {
        return this.f157412a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f157412a, r82.f157412a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157413b, r82.f157413b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157414c, r82.f157414c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f157415e, r82.f157415e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157416f, r82.f157416f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f157417g, r82.f157417g) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f157412a.hashCode() * 31) + this.f157413b.hashCode()) * 31) + this.f157414c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f157415e)) * 31) + Double.hashCode(this.f157416f)) * 31) + Double.hashCode(this.f157417g);
    }

    public String toString() {
        return "CryptoCoinEntity(symbol=" + this.f157412a + ", name=" + this.f157413b + ", logoUrl=" + this.f157414c + ", pair=" + this.d + ", tickSize=" + this.f157415e + ", lotSize=" + this.f157416f + ", minOrderIdr=" + this.f157417g + ")";
    }
}
