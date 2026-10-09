package com.stockbit.component.foreignflow.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.time.LocalDate;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f71933a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71934b;

    /* renamed from: c, reason: collision with root package name */
    public final float f71935c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final b f71936e;

    /* renamed from: f, reason: collision with root package name */
    public final float f71937f;

    /* renamed from: g, reason: collision with root package name */
    public final String f71938g;

    static {
    }

    public a(LocalDate r2, String r3, float r4, String r5, b r6, float r7, String r8) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "dateLabel");
        kotlin.jvm.internal.p.l(r5, "netValueText");
        kotlin.jvm.internal.p.l(r6, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r8, "cumulativeForeignFlowText");
        this.f71933a = r2;
        this.f71934b = r3;
        this.f71935c = r4;
        this.d = r5;
        this.f71936e = r6;
        this.f71937f = r7;
        this.f71938g = r8;
    }

    public final float a() {
        return this.f71937f;
    }

    public final String b() {
        return this.f71938g;
    }

    public final LocalDate c() {
        return this.f71933a;
    }

    public final String d() {
        return this.f71934b;
    }

    public final float e() {
        return this.f71935c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f71933a, r52.f71933a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f71934b, r52.f71934b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f71935c, r52.f71935c) == 0) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f71936e, r52.f71936e) == true) goto L24;
        return false;
    L24:
        if (Float.compare(this.f71937f, r52.f71937f) == 0) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f71938g, r52.f71938g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final b g() {
        return this.f71936e;
    }

    public int hashCode() {
        return (((((((((((this.f71933a.hashCode() * 31) + this.f71934b.hashCode()) * 31) + Float.hashCode(this.f71935c)) * 31) + this.d.hashCode()) * 31) + this.f71936e.hashCode()) * 31) + Float.hashCode(this.f71937f)) * 31) + this.f71938g.hashCode();
    }

    public String toString() {
        return "ForeignFlowChartPointUIState(date=" + this.f71933a + ", dateLabel=" + this.f71934b + ", netValueRaw=" + this.f71935c + ", netValueText=" + this.d + ", price=" + this.f71936e + ", cumulativeForeignFlowRaw=" + this.f71937f + ", cumulativeForeignFlowText=" + this.f71938g + ')';
    }
}
