package com.stockbit.usecase.screener.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f159721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159723c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159724e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159725f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159726g;

    /* renamed from: h, reason: collision with root package name */
    public final String f159727h;

    /* renamed from: i, reason: collision with root package name */
    public final String f159728i;

    /* renamed from: j, reason: collision with root package name */
    public final a f159729j;

    public d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, a r11) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, "symbol3");
        p.l(r7, "country");
        p.l(r8, "exchange");
        p.l(r9, "type");
        p.l(r10, "iconUrl");
        p.l(r11, "badges");
        this.f159721a = r2;
        this.f159722b = r3;
        this.f159723c = r4;
        this.d = r5;
        this.f159724e = r6;
        this.f159725f = r7;
        this.f159726g = r8;
        this.f159727h = r9;
        this.f159728i = r10;
        this.f159729j = r11;
    }

    public final a a() {
        return this.f159729j;
    }

    public final String b() {
        return this.f159725f;
    }

    public final String c() {
        return this.f159726g;
    }

    public final String d() {
        return this.f159728i;
    }

    public final String e() {
        return this.f159721a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f159721a, r52.f159721a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159722b, r52.f159722b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159723c, r52.f159723c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159724e, r52.f159724e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f159725f, r52.f159725f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f159726g, r52.f159726g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f159727h, r52.f159727h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f159728i, r52.f159728i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f159729j, r52.f159729j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f159722b;
    }

    public final String g() {
        return this.f159723c;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((this.f159721a.hashCode() * 31) + this.f159722b.hashCode()) * 31) + this.f159723c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159724e.hashCode()) * 31) + this.f159725f.hashCode()) * 31) + this.f159726g.hashCode()) * 31) + this.f159727h.hashCode()) * 31) + this.f159728i.hashCode()) * 31) + this.f159729j.hashCode();
    }

    public final String i() {
        return this.f159724e;
    }

    public final String j() {
        return this.f159727h;
    }

    public String toString() {
        return "ScreenerCompanyBeanUIState(id=" + this.f159721a + ", name=" + this.f159722b + ", symbol=" + this.f159723c + ", symbol2=" + this.d + ", symbol3=" + this.f159724e + ", country=" + this.f159725f + ", exchange=" + this.f159726g + ", type=" + this.f159727h + ", iconUrl=" + this.f159728i + ", badges=" + this.f159729j + ")";
    }
}
