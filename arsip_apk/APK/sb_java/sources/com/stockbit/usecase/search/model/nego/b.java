package com.stockbit.usecase.search.model.nego;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f160039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160041c;
    public final String d;

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, "originalSymbol");
        p.l(r3, "negoSymbol");
        p.l(r4, "logo");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f160039a = r2;
        this.f160040b = r3;
        this.f160041c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f160041c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f160040b;
    }

    public final String d() {
        return this.f160039a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f160039a, r52.f160039a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160040b, r52.f160040b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160041c, r52.f160041c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f160039a.hashCode() * 31) + this.f160040b.hashCode()) * 31) + this.f160041c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SearchItemPasarNegoCompanyUIState(originalSymbol=" + this.f160039a + ", negoSymbol=" + this.f160040b + ", logo=" + this.f160041c + ", name=" + this.d + ")";
    }
}
