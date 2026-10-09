package com.shockwave.pdfium.util;

/* loaded from: classes6.dex */
public class Size {

    /* renamed from: a, reason: collision with root package name */
    public final int f43925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43926b;

    public Size(int r1, int r2) {
        this.f43925a = r1;
        this.f43926b = r2;
    }

    public int a() {
        return this.f43926b;
    }

    public int b() {
        return this.f43925a;
    }

    public boolean equals(Object r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this != r5) goto L9;
        return true;
    L9:
        if ((r5 instanceof Size) == false) goto L15;
        Size r52 = (Size) r5;
        if (this.f43925a != r52.f43925a) goto L15;
        if (this.f43926b != r52.f43926b) goto L15;
        return true;
    L15:
        return false;
    }

    public int hashCode() {
        int r02 = this.f43926b;
        int r1 = this.f43925a;
        int r2 = r1 << 16;
        return r02 ^ ((r1 >>> 16) | r2);
    }

    public String toString() {
        return this.f43925a + "x" + this.f43926b;
    }
}
