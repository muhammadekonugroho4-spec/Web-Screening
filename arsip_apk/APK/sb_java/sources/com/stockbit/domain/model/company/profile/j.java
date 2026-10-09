package com.stockbit.domain.model.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f81833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81834b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81835c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f81836e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81837f;

    public j(String r2, String r3, String r4, String r5, List r6, String r7) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "value");
        p.l(r4, "valueFormatted");
        p.l(r5, "percentage");
        p.l(r6, "badges");
        p.l(r7, Constants.KEY_ID);
        this.f81833a = r2;
        this.f81834b = r3;
        this.f81835c = r4;
        this.d = r5;
        this.f81836e = r6;
        this.f81837f = r7;
    }

    public final List a() {
        return this.f81836e;
    }

    public final String b() {
        return this.f81837f;
    }

    public final String c() {
        return this.f81833a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f81834b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f81833a, r52.f81833a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81834b, r52.f81834b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81835c, r52.f81835c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81836e, r52.f81836e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81837f, r52.f81837f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f81835c;
    }

    public int hashCode() {
        return (((((((((this.f81833a.hashCode() * 31) + this.f81834b.hashCode()) * 31) + this.f81835c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81836e.hashCode()) * 31) + this.f81837f.hashCode();
    }

    public String toString() {
        return "CompanyProfileShareHolderEntity(name=" + this.f81833a + ", value=" + this.f81834b + ", valueFormatted=" + this.f81835c + ", percentage=" + this.d + ", badges=" + this.f81836e + ", id=" + this.f81837f + ")";
    }
}
