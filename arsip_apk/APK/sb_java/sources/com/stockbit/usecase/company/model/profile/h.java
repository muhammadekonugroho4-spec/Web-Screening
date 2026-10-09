package com.stockbit.usecase.company.model.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f156501a;

    /* renamed from: b, reason: collision with root package name */
    public final DirectorCommissioner f156502b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156503c;

    public h(String r2, DirectorCommissioner r3, String r4) {
        p.l(r2, "initialName");
        p.l(r3, "position");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f156501a = r2;
        this.f156502b = r3;
        this.f156503c = r4;
    }

    public final String a() {
        return this.f156501a;
    }

    public final String b() {
        return this.f156503c;
    }

    public final DirectorCommissioner c() {
        return this.f156502b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f156501a, r52.f156501a) == true) goto L12;
        return false;
    L12:
        if (this.f156502b == r52.f156502b) goto L15;
        return false;
    L15:
        if (p.g(this.f156503c, r52.f156503c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156501a.hashCode() * 31) + this.f156502b.hashCode()) * 31) + this.f156503c.hashCode();
    }

    public String toString() {
        return "CompanyProfilePersonUIState(initialName=" + this.f156501a + ", position=" + this.f156502b + ", name=" + this.f156503c + ")";
    }
}
