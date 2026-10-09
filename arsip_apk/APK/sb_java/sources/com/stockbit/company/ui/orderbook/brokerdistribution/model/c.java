package com.stockbit.company.ui.orderbook.brokerdistribution.model;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f67216a;

    /* renamed from: b, reason: collision with root package name */
    public final float f67217b;

    /* renamed from: c, reason: collision with root package name */
    public final float f67218c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f67219e;

    /* renamed from: f, reason: collision with root package name */
    public final float f67220f;

    /* renamed from: g, reason: collision with root package name */
    public final float f67221g;

    static {
    }

    public c(float r1, float r2, float r3, float r4, float r5, float r6, float r7) {
        this.f67216a = r1;
        this.f67217b = r2;
        this.f67218c = r3;
        this.d = r4;
        this.f67219e = r5;
        this.f67220f = r6;
        this.f67221g = r7;
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.f67217b;
    }

    public final float c() {
        return this.f67221g;
    }

    public final float d() {
        return this.f67220f;
    }

    public final float e() {
        return this.f67219e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (Float.compare(this.f67216a, r52.f67216a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f67217b, r52.f67217b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f67218c, r52.f67218c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f67219e, r52.f67219e) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.f67220f, r52.f67220f) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.f67221g, r52.f67221g) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final float f() {
        return this.f67216a;
    }

    public final float g() {
        return this.f67218c;
    }

    public int hashCode() {
        return (((((((((((Float.hashCode(this.f67216a) * 31) + Float.hashCode(this.f67217b)) * 31) + Float.hashCode(this.f67218c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f67219e)) * 31) + Float.hashCode(this.f67220f)) * 31) + Float.hashCode(this.f67221g);
    }

    public String toString() {
        return "LayoutConfig(nodeWidth=" + this.f67216a + ", horizontalPadding=" + this.f67217b + ", verticalPadding=" + this.f67218c + ", flowHorizontalPadding=" + this.d + ", nodeVerticalSpacing=" + this.f67219e + ", minNodeHeight=" + this.f67220f + ", minFlowHeight=" + this.f67221g + ')';
    }
}
