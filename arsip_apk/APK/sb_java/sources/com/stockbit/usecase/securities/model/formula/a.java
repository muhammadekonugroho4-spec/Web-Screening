package com.stockbit.usecase.securities.model.formula;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f160578a;

    /* renamed from: b, reason: collision with root package name */
    public final double f160579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f160580c;

    public a(String r2, double r3, int r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f160578a = r2;
        this.f160579b = r3;
        this.f160580c = r5;
    }

    public final String a() {
        return this.f160578a;
    }

    public final int b() {
        return this.f160580c;
    }

    public final double c() {
        return this.f160579b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f160578a, r82.f160578a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f160579b, r82.f160579b) == 0) goto L15;
        return false;
    L15:
        if (this.f160580c == r82.f160580c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160578a.hashCode() * 31) + Double.hashCode(this.f160579b)) * 31) + Integer.hashCode(this.f160580c);
    }

    public String toString() {
        return "CompositionUIState(name=" + this.f160578a + ", value=" + this.f160579b + ", type=" + this.f160580c + ")";
    }
}
