package com.stockbit.usecase.ktur.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f158177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158178b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158179c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158180e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158181f;

    public b(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "logo");
        p.l(r3, "symbol");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "rupsDate");
        p.l(r6, "venue");
        p.l(r7, "pdfUrl");
        this.f158177a = r2;
        this.f158178b = r3;
        this.f158179c = r4;
        this.d = r5;
        this.f158180e = r6;
        this.f158181f = r7;
    }

    public final String a() {
        return this.f158177a;
    }

    public final String b() {
        return this.f158179c;
    }

    public final String c() {
        return this.f158181f;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f158178b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f158177a, r52.f158177a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158178b, r52.f158178b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158179c, r52.f158179c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158180e, r52.f158180e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158181f, r52.f158181f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f158180e;
    }

    public int hashCode() {
        return (((((((((this.f158177a.hashCode() * 31) + this.f158178b.hashCode()) * 31) + this.f158179c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158180e.hashCode()) * 31) + this.f158181f.hashCode();
    }

    public String toString() {
        return "KTURUIState(logo=" + this.f158177a + ", symbol=" + this.f158178b + ", name=" + this.f158179c + ", rupsDate=" + this.d + ", venue=" + this.f158180e + ", pdfUrl=" + this.f158181f + ")";
    }
}
