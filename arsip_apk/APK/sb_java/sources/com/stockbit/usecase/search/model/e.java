package com.stockbit.usecase.search.model;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f160001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160002b;

    /* renamed from: c, reason: collision with root package name */
    public final float f160003c;

    public e(float r2, String r3, float r4) {
        kotlin.jvm.internal.p.l(r3, "valueString");
        this.f160001a = r2;
        this.f160002b = r3;
        this.f160003c = r4;
    }

    public final float a() {
        return this.f160003c;
    }

    public final String b() {
        return this.f160002b;
    }

    public final float c() {
        return this.f160001a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (Float.compare(this.f160001a, r52.f160001a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160002b, r52.f160002b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f160003c, r52.f160003c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f160001a) * 31) + this.f160002b.hashCode()) * 31) + Float.hashCode(this.f160003c);
    }

    public String toString() {
        return "MarketChartPriceUIState(xLabel=" + this.f160001a + ", valueString=" + this.f160002b + ", valueFloat=" + this.f160003c + ")";
    }
}
