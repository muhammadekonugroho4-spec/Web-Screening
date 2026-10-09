package com.stockbit.usecase.company.model.ownershipallocation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f156409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156411c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156412e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156413f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f156414g;

    public e(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "companyName");
        p.l(r4, "iconUrl");
        p.l(r5, "totalShares");
        p.l(r6, "percentage");
        p.l(r7, "navigationId");
        this.f156409a = r2;
        this.f156410b = r3;
        this.f156411c = r4;
        this.d = r5;
        this.f156412e = r6;
        this.f156413f = r7;
        this.f156414g = r8;
    }

    public final String a() {
        return this.f156410b;
    }

    public final String b() {
        return this.f156411c;
    }

    public final String c() {
        return this.f156409a;
    }

    public final String d() {
        return this.f156413f;
    }

    public final String e() {
        return this.f156412e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f156409a, r52.f156409a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156410b, r52.f156410b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156411c, r52.f156411c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156412e, r52.f156412e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156413f, r52.f156413f) == true) goto L27;
        return false;
    L27:
        if (this.f156414g == r52.f156414g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f156414g;
    }

    public int hashCode() {
        return (((((((((((this.f156409a.hashCode() * 31) + this.f156410b.hashCode()) * 31) + this.f156411c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156412e.hashCode()) * 31) + this.f156413f.hashCode()) * 31) + Boolean.hashCode(this.f156414g);
    }

    public String toString() {
        return "HoldingItemUIState(name=" + this.f156409a + ", companyName=" + this.f156410b + ", iconUrl=" + this.f156411c + ", totalShares=" + this.d + ", percentage=" + this.f156412e + ", navigationId=" + this.f156413f + ", isInvestor=" + this.f156414g + ")";
    }
}
