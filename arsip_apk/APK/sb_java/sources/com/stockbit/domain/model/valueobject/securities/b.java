package com.stockbit.domain.model.valueobject.securities;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f86996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86997b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86998c;
    public final String d;

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "email");
        p.l(r4, "nik");
        p.l(r5, "phoneNumber");
        this.f86996a = r2;
        this.f86997b = r3;
        this.f86998c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f86997b;
    }

    public final String b() {
        return this.f86996a;
    }

    public final String c() {
        return this.f86998c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f86996a, r52.f86996a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86997b, r52.f86997b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86998c, r52.f86998c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86996a.hashCode() * 31) + this.f86997b.hashCode()) * 31) + this.f86998c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "JagoLinkInformation(name=" + this.f86996a + ", email=" + this.f86997b + ", nik=" + this.f86998c + ", phoneNumber=" + this.d + ')';
    }
}
