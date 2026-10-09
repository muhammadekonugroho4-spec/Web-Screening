package com.stockbit.domain.model.stream.notes;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f85848a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85849b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85850c;

    public b(String r2, String r3, String r4) {
        p.l(r2, "iconUrl");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        this.f85848a = r2;
        this.f85849b = r3;
        this.f85850c = r4;
    }

    public final String a() {
        return this.f85848a;
    }

    public final String b() {
        return this.f85849b;
    }

    public final String c() {
        return this.f85850c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85848a, r52.f85848a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85849b, r52.f85849b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85850c, r52.f85850c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85848a.hashCode() * 31) + this.f85849b.hashCode()) * 31) + this.f85850c.hashCode();
    }

    public String toString() {
        return "CompanyNoteCompanyEntity(iconUrl=" + this.f85848a + ", name=" + this.f85849b + ", symbol=" + this.f85850c + ")";
    }
}
