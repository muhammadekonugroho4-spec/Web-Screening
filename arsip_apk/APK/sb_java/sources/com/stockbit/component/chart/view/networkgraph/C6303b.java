package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.stockbit.component.chart.view.networkgraph.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6303b {

    /* renamed from: a, reason: collision with root package name */
    public final String f69924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69925b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f69926c;
    public final double d;

    static {
    }

    public C6303b(String r2, String r3, InvestorType r4, double r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "investorType");
        this.f69924a = r2;
        this.f69925b = r3;
        this.f69926c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f69924a;
    }

    public final InvestorType b() {
        return this.f69926c;
    }

    public final String c() {
        return this.f69925b;
    }

    public final double d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C6303b) == true) goto L8;
        return false;
    L8:
        C6303b r82 = (C6303b) r8;
        if (kotlin.jvm.internal.p.g(this.f69924a, r82.f69924a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69925b, r82.f69925b) == true) goto L15;
        return false;
    L15:
        if (this.f69926c == r82.f69926c) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f69924a.hashCode() * 31) + this.f69925b.hashCode()) * 31) + this.f69926c.hashCode()) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "EmittenRelatedInvestorInfo(id=" + this.f69924a + ", name=" + this.f69925b + ", investorType=" + this.f69926c + ", percentage=" + this.d + ')';
    }
}
