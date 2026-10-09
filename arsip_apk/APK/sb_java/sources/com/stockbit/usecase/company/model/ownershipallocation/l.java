package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f156443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156444b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f156445c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final List f156446e;

    /* renamed from: f, reason: collision with root package name */
    public final List f156447f;

    public l(String r2, String r3, InvestorType r4, double r5, List r7, List r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "investorType");
        p.l(r7, "otherEmittens");
        p.l(r8, "allHoldings");
        this.f156443a = r2;
        this.f156444b = r3;
        this.f156445c = r4;
        this.d = r5;
        this.f156446e = r7;
        this.f156447f = r8;
    }

    public final List a() {
        return this.f156447f;
    }

    public final String b() {
        return this.f156443a;
    }

    public final InvestorType c() {
        return this.f156445c;
    }

    public final String d() {
        return this.f156444b;
    }

    public final List e() {
        return this.f156446e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof l) == true) goto L8;
        return false;
    L8:
        l r82 = (l) r8;
        if (p.g(this.f156443a, r82.f156443a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156444b, r82.f156444b) == true) goto L15;
        return false;
    L15:
        if (this.f156445c == r82.f156445c) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f156446e, r82.f156446e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156447f, r82.f156447f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final double f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.f156443a.hashCode() * 31) + this.f156444b.hashCode()) * 31) + this.f156445c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f156446e.hashCode()) * 31) + this.f156447f.hashCode();
    }

    public String toString() {
        return "RelatedInvestorForEmittenNodeUIState(id=" + this.f156443a + ", name=" + this.f156444b + ", investorType=" + this.f156445c + ", ownershipPercentage=" + this.d + ", otherEmittens=" + this.f156446e + ", allHoldings=" + this.f156447f + ")";
    }
}
