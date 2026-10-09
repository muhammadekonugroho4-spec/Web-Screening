package com.stockbit.domain.model.tradingperformance.allocation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f86022a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86023b;

    public o(String r2, String r3) {
        p.l(r2, "identifier");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f86022a = r2;
        this.f86023b = r3;
    }

    public final String a() {
        return this.f86023b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (p.g(this.f86022a, r52.f86022a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86023b, r52.f86023b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86022a.hashCode() * 31) + this.f86023b.hashCode();
    }

    public String toString() {
        return "SubSectorAllocationSubSectorEntity(identifier=" + this.f86022a + ", name=" + this.f86023b + ")";
    }
}
