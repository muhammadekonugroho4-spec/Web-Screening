package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class A {
    public static String a(int r1) {
        if (r1 != 1) goto L5;
        return "CONCURRENT_CAMERA";
    L5:
        if (r1 == 2) goto L8;
        return "DEFAULT";
    L8:
        return "ULTRA_HIGH_RESOLUTION_CAMERA";
    }
}
