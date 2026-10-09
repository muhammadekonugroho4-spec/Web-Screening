package com.shockwave.pdfium.util;

/* loaded from: classes6.dex */
public class SizeF {

    /* renamed from: a, reason: collision with root package name */
    public final float f43927a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43928b;

    public SizeF(float r1, float r2) {
        this.f43927a = r1;
        this.f43928b = r2;
    }

    public float a() {
        return this.f43928b;
    }

    public float b() {
        return this.f43927a;
    }

    public boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof SizeF) == false) goto L15;
        SizeF r52 = (SizeF) r5;
        if (this.f43927a != r52.f43927a) goto L15;
        if (this.f43928b != r52.f43928b) goto L15;
        return true;
    L15:
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f43927a) ^ Float.floatToIntBits(this.f43928b);
    }

    public String toString() {
        return this.f43927a + "x" + this.f43928b;
    }
}
