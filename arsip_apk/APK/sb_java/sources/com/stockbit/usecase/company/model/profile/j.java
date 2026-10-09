package com.stockbit.usecase.company.model.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f156507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156508b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156509c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156510e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f156511f;

    public j(String r2, String r3, String r4, List r5, String r6, boolean r7) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "totalShare");
        p.l(r4, "percentage");
        p.l(r5, "badges");
        p.l(r6, "insiderId");
        this.f156507a = r2;
        this.f156508b = r3;
        this.f156509c = r4;
        this.d = r5;
        this.f156510e = r6;
        this.f156511f = r7;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f156510e;
    }

    public final String c() {
        return this.f156507a;
    }

    public final String d() {
        return this.f156509c;
    }

    public final String e() {
        return this.f156508b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f156507a, r52.f156507a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156508b, r52.f156508b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156509c, r52.f156509c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156510e, r52.f156510e) == true) goto L24;
        return false;
    L24:
        if (this.f156511f == r52.f156511f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f156511f;
    }

    public int hashCode() {
        return (((((((((this.f156507a.hashCode() * 31) + this.f156508b.hashCode()) * 31) + this.f156509c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156510e.hashCode()) * 31) + Boolean.hashCode(this.f156511f);
    }

    public String toString() {
        return "CompanyProfileShareHolderUIState(name=" + this.f156507a + ", totalShare=" + this.f156508b + ", percentage=" + this.f156509c + ", badges=" + this.d + ", insiderId=" + this.f156510e + ", isInsider=" + this.f156511f + ")";
    }
}
