package com.stockbit.component.foreignflow.utils.chart;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f72145a;

    /* renamed from: b, reason: collision with root package name */
    public final float f72146b;

    /* renamed from: c, reason: collision with root package name */
    public final float f72147c;
    public final float d;

    static {
    }

    public j(float r1, float r2, float r3, float r4) {
        this.f72145a = r1;
        this.f72146b = r2;
        this.f72147c = r3;
        this.d = r4;
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.f72145a;
    }

    public final float c() {
        return this.f72147c;
    }

    public final float d() {
        return this.f72146b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (Float.compare(this.f72145a, r52.f72145a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f72146b, r52.f72146b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f72147c, r52.f72147c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f72145a) * 31) + Float.hashCode(this.f72146b)) * 31) + Float.hashCode(this.f72147c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "ForeignFlowChartMarkerBounds(left=" + this.f72145a + ", top=" + this.f72146b + ", right=" + this.f72147c + ", bottom=" + this.d + ')';
    }
}
