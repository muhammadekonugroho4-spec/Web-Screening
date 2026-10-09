package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f69945a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69946b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f69947c;
    public final List d;

    static {
    }

    public h(String r2, String r3, InvestorType r4, List r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "investorType");
        kotlin.jvm.internal.p.l(r5, "holdings");
        this.f69945a = r2;
        this.f69946b = r3;
        this.f69947c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f69945a;
    }

    public final InvestorType c() {
        return this.f69947c;
    }

    public final String d() {
        return this.f69946b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f69945a, r52.f69945a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69946b, r52.f69946b) == true) goto L15;
        return false;
    L15:
        if (this.f69947c == r52.f69947c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f69945a.hashCode() * 31) + this.f69946b.hashCode()) * 31) + this.f69947c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MainInvestorNode(id=" + this.f69945a + ", name=" + this.f69946b + ", investorType=" + this.f69947c + ", holdings=" + this.d + ')';
    }
}
