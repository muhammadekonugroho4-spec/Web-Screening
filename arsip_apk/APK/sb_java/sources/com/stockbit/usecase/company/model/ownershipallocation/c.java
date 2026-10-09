package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f156403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156404b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f156405c;
    public final double d;

    public c(String r2, String r3, InvestorType r4, double r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "investorType");
        this.f156403a = r2;
        this.f156404b = r3;
        this.f156405c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f156403a;
    }

    public final InvestorType b() {
        return this.f156405c;
    }

    public final String c() {
        return this.f156404b;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f156403a, r82.f156403a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156404b, r82.f156404b) == true) goto L15;
        return false;
    L15:
        if (this.f156405c == r82.f156405c) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156403a.hashCode() * 31) + this.f156404b.hashCode()) * 31) + this.f156405c.hashCode()) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "EmittenRelatedInvestorInfoUIState(id=" + this.f156403a + ", name=" + this.f156404b + ", investorType=" + this.f156405c + ", percentage=" + this.d + ")";
    }
}
