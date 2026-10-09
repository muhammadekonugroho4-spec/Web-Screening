package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final String f69890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69891b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f69892c;
    public final List d;

    static {
    }

    public A(String r2, String r3, InvestorType r4, List r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "investorType");
        kotlin.jvm.internal.p.l(r5, "holdings");
        this.f69890a = r2;
        this.f69891b = r3;
        this.f69892c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f69890a;
    }

    public final InvestorType c() {
        return this.f69892c;
    }

    public final String d() {
        return this.f69891b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (kotlin.jvm.internal.p.g(this.f69890a, r52.f69890a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69891b, r52.f69891b) == true) goto L15;
        return false;
    L15:
        if (this.f69892c == r52.f69892c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f69890a.hashCode() * 31) + this.f69891b.hashCode()) * 31) + this.f69892c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RelatedInvestorNode(id=" + this.f69890a + ", name=" + this.f69891b + ", investorType=" + this.f69892c + ", holdings=" + this.d + ')';
    }
}
