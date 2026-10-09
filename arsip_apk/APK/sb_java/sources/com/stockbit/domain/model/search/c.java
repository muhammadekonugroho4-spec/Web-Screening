package com.stockbit.domain.model.search;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84925b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84926c;
    public final String d;

    public c(String r2, String r3, String r4, String r5) {
        p.l(r2, "originalSymbol");
        p.l(r3, "negoSymbol");
        p.l(r4, "logo");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f84924a = r2;
        this.f84925b = r3;
        this.f84926c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f84926c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f84925b;
    }

    public final String d() {
        return this.f84924a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84924a, r52.f84924a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84925b, r52.f84925b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84926c, r52.f84926c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84924a.hashCode() * 31) + this.f84925b.hashCode()) * 31) + this.f84926c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RecentNegoSearchEntity(originalSymbol=" + this.f84924a + ", negoSymbol=" + this.f84925b + ", logo=" + this.f84926c + ", name=" + this.d + ")";
    }
}
