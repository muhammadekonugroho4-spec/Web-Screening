package com.stockbit.domain.model.shareholding;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f85771a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85772b;

    /* renamed from: c, reason: collision with root package name */
    public final d f85773c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final d f85774e;

    /* renamed from: f, reason: collision with root package name */
    public final d f85775f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85776g;

    /* renamed from: h, reason: collision with root package name */
    public final List f85777h;

    public g(long r2, String r4, d r5, d r6, d r7, d r8, String r9, List r10) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "investorClassification");
        p.l(r6, FirebaseAnalytics.Param.LOCATION);
        p.l(r7, "nationality");
        p.l(r8, "domicile");
        p.l(r9, "reportDate");
        p.l(r10, "holdings");
        this.f85771a = r2;
        this.f85772b = r4;
        this.f85773c = r5;
        this.d = r6;
        this.f85774e = r7;
        this.f85775f = r8;
        this.f85776g = r9;
        this.f85777h = r10;
    }

    public final List a() {
        return this.f85777h;
    }

    public final long b() {
        return this.f85771a;
    }

    public final d c() {
        return this.f85773c;
    }

    public final d d() {
        return this.d;
    }

    public final String e() {
        return this.f85772b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (this.f85771a == r82.f85771a) goto L12;
        return false;
    L12:
        if (p.g(this.f85772b, r82.f85772b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85773c, r82.f85773c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85774e, r82.f85774e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85775f, r82.f85775f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85776g, r82.f85776g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85777h, r82.f85777h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f85776g;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f85771a) * 31) + this.f85772b.hashCode()) * 31) + this.f85773c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85774e.hashCode()) * 31) + this.f85775f.hashCode()) * 31) + this.f85776g.hashCode()) * 31) + this.f85777h.hashCode();
    }

    public String toString() {
        return "ShareholdingInvestorEntity(id=" + this.f85771a + ", name=" + this.f85772b + ", investorClassification=" + this.f85773c + ", location=" + this.d + ", nationality=" + this.f85774e + ", domicile=" + this.f85775f + ", reportDate=" + this.f85776g + ", holdings=" + this.f85777h + ")";
    }
}
