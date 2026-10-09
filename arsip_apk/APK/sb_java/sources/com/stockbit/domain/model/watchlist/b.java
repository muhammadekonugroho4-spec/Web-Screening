package com.stockbit.domain.model.watchlist;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f87228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87229b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87230c;
    public final int d;

    public b(long r2, String r4, List r5, int r6) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "symbols");
        this.f87228a = r2;
        this.f87229b = r4;
        this.f87230c = r5;
        this.d = r6;
    }

    public final List a() {
        return this.f87230c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f87228a == r82.f87228a) goto L12;
        return false;
    L12:
        if (p.g(this.f87229b, r82.f87229b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87230c, r82.f87230c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f87228a) * 31) + this.f87229b.hashCode()) * 31) + this.f87230c.hashCode()) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "WatchlistSymbolListEntity(id=" + this.f87228a + ", name=" + this.f87229b + ", symbols=" + this.f87230c + ", totalSymbol=" + this.d + ")";
    }
}
