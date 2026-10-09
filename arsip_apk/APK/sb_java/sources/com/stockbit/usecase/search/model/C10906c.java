package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.search.type.MarketProfitLossUIType;

/* renamed from: com.stockbit.usecase.search.model.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10906c {

    /* renamed from: a, reason: collision with root package name */
    public final String f159987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159989c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f159990e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159991f;

    /* renamed from: g, reason: collision with root package name */
    public final double f159992g;

    /* renamed from: h, reason: collision with root package name */
    public final double f159993h;

    /* renamed from: i, reason: collision with root package name */
    public final String f159994i;

    /* renamed from: j, reason: collision with root package name */
    public final String f159995j;

    /* renamed from: k, reason: collision with root package name */
    public final String f159996k;

    /* renamed from: l, reason: collision with root package name */
    public final String f159997l;

    /* renamed from: m, reason: collision with root package name */
    public final MarketProfitLossUIType f159998m;

    public C10906c(String r7, String r8, String r9, String r10, double r11, String r13, double r14, double r16, String r18, String r19, String r20, String r21, MarketProfitLossUIType r22) {
        kotlin.jvm.internal.p.l(r7, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r8, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r9, "symbol");
        kotlin.jvm.internal.p.l(r10, "indexFormatted");
        kotlin.jvm.internal.p.l(r13, "changeAndPercentageFormatted");
        kotlin.jvm.internal.p.l(r18, "percentageFormatted");
        kotlin.jvm.internal.p.l(r19, "lastIndex");
        kotlin.jvm.internal.p.l(r20, "marketCap");
        kotlin.jvm.internal.p.l(r21, "valueMa20");
        kotlin.jvm.internal.p.l(r22, "marketProfitLossType");
        this.f159987a = r7;
        this.f159988b = r8;
        this.f159989c = r9;
        this.d = r10;
        this.f159990e = r11;
        this.f159991f = r13;
        this.f159992g = r14;
        this.f159993h = r16;
        this.f159994i = r18;
        this.f159995j = r19;
        this.f159996k = r20;
        this.f159997l = r21;
        this.f159998m = r22;
    }

    public final double a() {
        return this.f159992g;
    }

    public final String b() {
        return this.f159987a;
    }

    public final String c() {
        return this.f159995j;
    }

    public final String d() {
        return this.f159996k;
    }

    public final MarketProfitLossUIType e() {
        return this.f159998m;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10906c) == true) goto L8;
        return false;
    L8:
        C10906c r82 = (C10906c) r8;
        if (kotlin.jvm.internal.p.g(this.f159987a, r82.f159987a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f159988b, r82.f159988b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f159989c, r82.f159989c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f159990e, r82.f159990e) == 0) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f159991f, r82.f159991f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f159992g, r82.f159992g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f159993h, r82.f159993h) == 0) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f159994i, r82.f159994i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f159995j, r82.f159995j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f159996k, r82.f159996k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f159997l, r82.f159997l) == true) goto L45;
        return false;
    L45:
        if (this.f159998m == r82.f159998m) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f159988b;
    }

    public final double g() {
        return this.f159993h;
    }

    public final String h() {
        return this.f159994i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f159987a.hashCode() * 31) + this.f159988b.hashCode()) * 31) + this.f159989c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f159990e)) * 31) + this.f159991f.hashCode()) * 31) + Double.hashCode(this.f159992g)) * 31) + Double.hashCode(this.f159993h)) * 31) + this.f159994i.hashCode()) * 31) + this.f159995j.hashCode()) * 31) + this.f159996k.hashCode()) * 31) + this.f159997l.hashCode()) * 31) + this.f159998m.hashCode();
    }

    public final String i() {
        return this.f159989c;
    }

    public final String j() {
        return this.f159997l;
    }

    public String toString() {
        return "EmittenIndexItemUIState(id=" + this.f159987a + ", name=" + this.f159988b + ", symbol=" + this.f159989c + ", indexFormatted=" + this.d + ", indexRaw=" + this.f159990e + ", changeAndPercentageFormatted=" + this.f159991f + ", changes=" + this.f159992g + ", percentage=" + this.f159993h + ", percentageFormatted=" + this.f159994i + ", lastIndex=" + this.f159995j + ", marketCap=" + this.f159996k + ", valueMa20=" + this.f159997l + ", marketProfitLossType=" + this.f159998m + ")";
    }
}
