package com.stockbit.domain.model.tradingperformance.allocation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f86017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86018b;

    public m(String r2, String r3) {
        p.l(r2, "identifier");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f86017a = r2;
        this.f86018b = r3;
    }

    public final String a() {
        return this.f86017a;
    }

    public final String b() {
        return this.f86018b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f86017a, r52.f86017a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86018b, r52.f86018b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86017a.hashCode() * 31) + this.f86018b.hashCode();
    }

    public String toString() {
        return "StockAllocationSubSectorEntity(identifier=" + this.f86017a + ", name=" + this.f86018b + ")";
    }

    public /* synthetic */ m(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
