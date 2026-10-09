package com.stockbit.domain.model.bond.portfolio;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.stockbit.domain.model.bond.portfolio.detail.e;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80774b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80775c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final e f80776e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80777f;

    public b(String r2, String r3, boolean r4, String r5, e r6, String r7) {
        p.l(r2, "iconUrl");
        p.l(r3, "identifier");
        p.l(r5, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r6, "meta");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f80773a = r2;
        this.f80774b = r3;
        this.f80775c = r4;
        this.d = r5;
        this.f80776e = r6;
        this.f80777f = r7;
    }

    public final String a() {
        return this.f80773a;
    }

    public final String b() {
        return this.f80774b;
    }

    public final String c() {
        return this.d;
    }

    public final e d() {
        return this.f80776e;
    }

    public final String e() {
        return this.f80777f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f80773a, r52.f80773a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80774b, r52.f80774b) == true) goto L15;
        return false;
    L15:
        if (this.f80775c == r52.f80775c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80776e, r52.f80776e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80777f, r52.f80777f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f80773a.hashCode() * 31) + this.f80774b.hashCode()) * 31) + Boolean.hashCode(this.f80775c)) * 31) + this.d.hashCode()) * 31) + this.f80776e.hashCode()) * 31) + this.f80777f.hashCode();
    }

    public String toString() {
        return "BondsPortfolioProductEntity(iconUrl=" + this.f80773a + ", identifier=" + this.f80774b + ", isSharia=" + this.f80775c + ", label=" + this.d + ", meta=" + this.f80776e + ", name=" + this.f80777f + ")";
    }
}
