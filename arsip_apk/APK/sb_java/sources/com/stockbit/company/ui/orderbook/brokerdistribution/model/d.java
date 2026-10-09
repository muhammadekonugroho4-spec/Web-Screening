package com.stockbit.company.ui.orderbook.brokerdistribution.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.company.model.brokerdistribution.e f67222a;

    /* renamed from: b, reason: collision with root package name */
    public final float f67223b;

    /* renamed from: c, reason: collision with root package name */
    public final float f67224c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f67225e;

    static {
    }

    public d(com.stockbit.usecase.company.model.brokerdistribution.e r2, float r3, float r4, float r5, float r6) {
        p.l(r2, "node");
        this.f67222a = r2;
        this.f67223b = r3;
        this.f67224c = r4;
        this.d = r5;
        this.f67225e = r6;
    }

    public final boolean a(float r3, float r4, float r5) {
        float r02 = this.f67223b;
        if (r3 >= (r02 - r5)) goto L5;
        return false;
    L5:
        if (r3 > ((r02 + this.d) + r5)) goto L14;
        float r32 = this.f67224c;
        if (r4 >= (r32 - r5)) goto L9;
        return false;
    L9:
        if (r4 > ((r32 + this.f67225e) + r5)) goto L16;
        return true;
    L16:
        return false;
    L14:
        return false;
    }

    public final float b() {
        return this.f67224c + (this.f67225e / 2.0f);
    }

    public final float c() {
        return this.f67225e;
    }

    public final com.stockbit.usecase.company.model.brokerdistribution.e d() {
        return this.f67222a;
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f67222a, r52.f67222a) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.f67223b, r52.f67223b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f67224c, r52.f67224c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f67225e, r52.f67225e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public final float f() {
        return this.f67223b;
    }

    public final float g() {
        return this.f67224c;
    }

    public int hashCode() {
        return (((((((this.f67222a.hashCode() * 31) + Float.hashCode(this.f67223b)) * 31) + Float.hashCode(this.f67224c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f67225e);
    }

    public String toString() {
        return "NodePosition(node=" + this.f67222a + ", x=" + this.f67223b + ", y=" + this.f67224c + ", width=" + this.d + ", height=" + this.f67225e + ')';
    }
}
