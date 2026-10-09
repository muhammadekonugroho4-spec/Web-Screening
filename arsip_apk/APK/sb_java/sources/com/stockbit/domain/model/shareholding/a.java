package com.stockbit.domain.model.shareholding;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85745b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85746c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85747e;

    /* renamed from: f, reason: collision with root package name */
    public final List f85748f;

    public a(String r2, String r3, String r4, String r5, String r6, List r7) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "symbol");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "iconUrl");
        p.l(r6, "reportDate");
        p.l(r7, "holders");
        this.f85744a = r2;
        this.f85745b = r3;
        this.f85746c = r4;
        this.d = r5;
        this.f85747e = r6;
        this.f85748f = r7;
    }

    public final List a() {
        return this.f85748f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f85744a;
    }

    public final String d() {
        return this.f85746c;
    }

    public final String e() {
        return this.f85747e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85744a, r52.f85744a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85745b, r52.f85745b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85746c, r52.f85746c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85747e, r52.f85747e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85748f, r52.f85748f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f85745b;
    }

    public int hashCode() {
        return (((((((((this.f85744a.hashCode() * 31) + this.f85745b.hashCode()) * 31) + this.f85746c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85747e.hashCode()) * 31) + this.f85748f.hashCode();
    }

    public String toString() {
        return "ShareholdingCompaniesEntity(id=" + this.f85744a + ", symbol=" + this.f85745b + ", name=" + this.f85746c + ", iconUrl=" + this.d + ", reportDate=" + this.f85747e + ", holders=" + this.f85748f + ")";
    }
}
