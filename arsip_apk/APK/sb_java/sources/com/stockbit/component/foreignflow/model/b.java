package com.stockbit.component.foreignflow.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f71939a;

    /* renamed from: b, reason: collision with root package name */
    public final float f71940b;

    /* renamed from: c, reason: collision with root package name */
    public final float f71941c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f71942e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71943f;

    static {
    }

    public b(String r2, float r3, float r4, float r5, float r6, boolean r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        this.f71939a = r2;
        this.f71940b = r3;
        this.f71941c = r4;
        this.d = r5;
        this.f71942e = r6;
        this.f71943f = r7;
    }

    public final float a() {
        return this.f71942e;
    }

    public final boolean b() {
        return this.f71943f;
    }

    public final float c() {
        return this.f71941c;
    }

    public final float d() {
        return this.d;
    }

    public final float e() {
        return this.f71940b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f71939a, r52.f71939a) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.f71940b, r52.f71940b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f71941c, r52.f71941c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f71942e, r52.f71942e) == 0) goto L24;
        return false;
    L24:
        if (this.f71943f == r52.f71943f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f71939a;
    }

    public int hashCode() {
        return (((((((((this.f71939a.hashCode() * 31) + Float.hashCode(this.f71940b)) * 31) + Float.hashCode(this.f71941c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f71942e)) * 31) + Boolean.hashCode(this.f71943f);
    }

    public String toString() {
        return "ForeignFlowChartPriceUIState(text=" + this.f71939a + ", open=" + this.f71940b + ", high=" + this.f71941c + ", low=" + this.d + ", close=" + this.f71942e + ", hasCandle=" + this.f71943f + ')';
    }
}
