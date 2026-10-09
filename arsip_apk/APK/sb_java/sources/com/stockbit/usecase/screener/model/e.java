package com.stockbit.usecase.screener.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f159730a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159731b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159732c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159733e;

    public e(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "type");
        p.l(r5, "order");
        p.l(r6, "valueType");
        this.f159730a = r2;
        this.f159731b = r3;
        this.f159732c = r4;
        this.d = r5;
        this.f159733e = r6;
    }

    public final String a() {
        return this.f159730a;
    }

    public final String b() {
        return this.f159731b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f159732c;
    }

    public final String e() {
        return this.f159733e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f159730a, r52.f159730a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159731b, r52.f159731b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159732c, r52.f159732c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159733e, r52.f159733e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f159730a.hashCode() * 31) + this.f159731b.hashCode()) * 31) + this.f159732c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159733e.hashCode();
    }

    public String toString() {
        return "ScreenerFavoriteUIState(id=" + this.f159730a + ", name=" + this.f159731b + ", type=" + this.f159732c + ", order=" + this.d + ", valueType=" + this.f159733e + ")";
    }
}
