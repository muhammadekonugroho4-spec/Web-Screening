package com.stockbit.domain.model.tradingperformance.allocation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f85999a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86000b;

    public f(String r2, String r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "iconUrl");
        this.f85999a = r2;
        this.f86000b = r3;
    }

    public final String a() {
        return this.f86000b;
    }

    public final String b() {
        return this.f85999a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f85999a, r52.f85999a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86000b, r52.f86000b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85999a.hashCode() * 31) + this.f86000b.hashCode();
    }

    public String toString() {
        return "StockAllocationCompanyEntity(name=" + this.f85999a + ", iconUrl=" + this.f86000b + ")";
    }

    public /* synthetic */ f(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
