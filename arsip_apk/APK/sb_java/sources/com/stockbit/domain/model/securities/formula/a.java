package com.stockbit.domain.model.securities.formula;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85169a;

    /* renamed from: b, reason: collision with root package name */
    public final double f85170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85171c;

    public a(String r2, double r3, int r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f85169a = r2;
        this.f85170b = r3;
        this.f85171c = r5;
    }

    public final String a() {
        return this.f85169a;
    }

    public final int b() {
        return this.f85171c;
    }

    public final double c() {
        return this.f85170b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f85169a, r82.f85169a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f85170b, r82.f85170b) == 0) goto L15;
        return false;
    L15:
        if (this.f85171c == r82.f85171c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85169a.hashCode() * 31) + Double.hashCode(this.f85170b)) * 31) + Integer.hashCode(this.f85171c);
    }

    public String toString() {
        return "CompositionEntity(name=" + this.f85169a + ", value=" + this.f85170b + ", type=" + this.f85171c + ")";
    }
}
