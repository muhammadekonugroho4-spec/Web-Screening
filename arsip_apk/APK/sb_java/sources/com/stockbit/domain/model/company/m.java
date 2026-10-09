package com.stockbit.domain.model.company;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f81683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81685c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81686e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81687f;

    public m(String r2, String r3, String r4, String r5, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, "companyName");
        kotlin.jvm.internal.p.l(r3, "businessType");
        kotlin.jvm.internal.p.l(r4, FirebaseAnalytics.Param.LOCATION);
        kotlin.jvm.internal.p.l(r5, "commercialYear");
        kotlin.jvm.internal.p.l(r6, "totalAssets");
        kotlin.jvm.internal.p.l(r7, "percentage");
        this.f81683a = r2;
        this.f81684b = r3;
        this.f81685c = r4;
        this.d = r5;
        this.f81686e = r6;
        this.f81687f = r7;
    }

    public final String a() {
        return this.f81684b;
    }

    public final String b() {
        return this.f81683a;
    }

    public final String c() {
        return this.f81687f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f81683a, r52.f81683a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81684b, r52.f81684b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81685c, r52.f81685c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f81686e, r52.f81686e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f81687f, r52.f81687f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f81683a.hashCode() * 31) + this.f81684b.hashCode()) * 31) + this.f81685c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81686e.hashCode()) * 31) + this.f81687f.hashCode();
    }

    public String toString() {
        return "CompanySubsidiaryEntity(companyName=" + this.f81683a + ", businessType=" + this.f81684b + ", location=" + this.f81685c + ", commercialYear=" + this.d + ", totalAssets=" + this.f81686e + ", percentage=" + this.f81687f + ")";
    }
}
