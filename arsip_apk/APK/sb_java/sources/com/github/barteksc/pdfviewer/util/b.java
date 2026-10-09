package com.github.barteksc.pdfviewer.util;

/* loaded from: classes4.dex */
public abstract class b {
    public static int a(float r4) {
        return ((int) (r4 + 16384.999999999996d)) - 16384;
    }

    public static int b(float r4) {
        return ((int) (r4 + 16384.0d)) - 16384;
    }

    public static float c(float r1, float r2, float r3) {
        if (r1 > r2) goto L6;
        return r2;
    L6:
        if (r1 < r3) goto L8;
        return r3;
    L8:
        return r1;
    }

    public static float d(float r1, float r2) {
        if (r1 <= r2) goto L5;
        return r2;
    L5:
        return r1;
    }

    public static float e(float r1, float r2) {
        if (r1 >= r2) goto L5;
        return r2;
    L5:
        return r1;
    }
}
