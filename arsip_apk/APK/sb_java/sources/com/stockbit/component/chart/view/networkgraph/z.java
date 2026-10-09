package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f70057a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70058b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f70059c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final List f70060e;

    /* renamed from: f, reason: collision with root package name */
    public final List f70061f;

    static {
    }

    public z(String r2, String r3, InvestorType r4, double r5, List r7, List r8) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "investorType");
        kotlin.jvm.internal.p.l(r7, "otherEmittens");
        kotlin.jvm.internal.p.l(r8, "holdings");
        this.f70057a = r2;
        this.f70058b = r3;
        this.f70059c = r4;
        this.d = r5;
        this.f70060e = r7;
        this.f70061f = r8;
    }

    public final List a() {
        return this.f70061f;
    }

    public final String b() {
        return this.f70057a;
    }

    public final InvestorType c() {
        return this.f70059c;
    }

    public final String d() {
        return this.f70058b;
    }

    public final List e() {
        return this.f70060e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof z) == true) goto L8;
        return false;
    L8:
        z r82 = (z) r8;
        if (kotlin.jvm.internal.p.g(this.f70057a, r82.f70057a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f70058b, r82.f70058b) == true) goto L15;
        return false;
    L15:
        if (this.f70059c == r82.f70059c) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f70060e, r82.f70060e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f70061f, r82.f70061f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final double f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.f70057a.hashCode() * 31) + this.f70058b.hashCode()) * 31) + this.f70059c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f70060e.hashCode()) * 31) + this.f70061f.hashCode();
    }

    public String toString() {
        return "RelatedInvestorForEmittenNode(id=" + this.f70057a + ", name=" + this.f70058b + ", investorType=" + this.f70059c + ", ownershipPercentage=" + this.d + ", otherEmittens=" + this.f70060e + ", holdings=" + this.f70061f + ')';
    }
}
