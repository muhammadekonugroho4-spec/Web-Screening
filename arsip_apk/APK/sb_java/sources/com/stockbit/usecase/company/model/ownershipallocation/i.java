package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f156424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156425b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f156426c;
    public final List d;

    public i(String r2, String r3, InvestorType r4, List r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "investorType");
        p.l(r5, "holdings");
        this.f156424a = r2;
        this.f156425b = r3;
        this.f156426c = r4;
        this.d = r5;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f156424a;
    }

    public final InvestorType c() {
        return this.f156426c;
    }

    public final String d() {
        return this.f156425b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f156424a, r52.f156424a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156425b, r52.f156425b) == true) goto L15;
        return false;
    L15:
        if (this.f156426c == r52.f156426c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156424a.hashCode() * 31) + this.f156425b.hashCode()) * 31) + this.f156426c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MainInvestorNodeUIState(id=" + this.f156424a + ", name=" + this.f156425b + ", investorType=" + this.f156426c + ", holdings=" + this.d + ")";
    }
}
