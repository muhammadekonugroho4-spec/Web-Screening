package com.stockbit.domains.usecase.stockgroups.contract.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f88426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88427b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88428c;

    public f(String r2, String r3, String r4) {
        p.l(r2, "code");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "catalogId");
        this.f88426a = r2;
        this.f88427b = r3;
        this.f88428c = r4;
    }

    public final String a() {
        return this.f88428c;
    }

    public final String b() {
        return this.f88426a;
    }

    public final String c() {
        return this.f88427b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f88426a, r52.f88426a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88427b, r52.f88427b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88428c, r52.f88428c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f88426a.hashCode() * 31) + this.f88427b.hashCode()) * 31) + this.f88428c.hashCode();
    }

    public String toString() {
        return "StockGroupTabEntity(code=" + this.f88426a + ", name=" + this.f88427b + ", catalogId=" + this.f88428c + ")";
    }
}
