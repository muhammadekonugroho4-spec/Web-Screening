package com.stockbit.domain.model.company;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f81640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81641b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81642c;

    public k(List r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "subsidiaries");
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.CURRENCY);
        kotlin.jvm.internal.p.l(r4, "lastUpdatedPeriod");
        this.f81640a = r2;
        this.f81641b = r3;
        this.f81642c = r4;
    }

    public final String a() {
        return this.f81642c;
    }

    public final List b() {
        return this.f81640a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f81640a, r52.f81640a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81641b, r52.f81641b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81642c, r52.f81642c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81640a.hashCode() * 31) + this.f81641b.hashCode()) * 31) + this.f81642c.hashCode();
    }

    public String toString() {
        return "CompanyProfileSubsidiaryEntity(subsidiaries=" + this.f81640a + ", currency=" + this.f81641b + ", lastUpdatedPeriod=" + this.f81642c + ")";
    }
}
