package com.stockbit.component.foreignflow.utils.chart;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f72082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f72083b;

    static {
    }

    public a(float r1, float r2) {
        this.f72082a = r1;
        this.f72083b = r2;
    }

    public final float a() {
        return this.f72083b;
    }

    public final float b() {
        return this.f72082a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (Float.compare(this.f72082a, r52.f72082a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f72083b, r52.f72083b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f72082a) * 31) + Float.hashCode(this.f72083b);
    }

    public String toString() {
        return "AxisRange(minimum=" + this.f72082a + ", maximum=" + this.f72083b + ')';
    }
}
