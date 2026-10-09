package com.stockbit.domain.model.cashsweep;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f81151a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81152b;

    public m(String r2, String r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "fileUrl");
        this.f81151a = r2;
        this.f81152b = r3;
    }

    public final String a() {
        return this.f81152b;
    }

    public final String b() {
        return this.f81151a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f81151a, r52.f81151a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81152b, r52.f81152b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81151a.hashCode() * 31) + this.f81152b.hashCode();
    }

    public String toString() {
        return "ProspectusEntity(name=" + this.f81151a + ", fileUrl=" + this.f81152b + ")";
    }
}
