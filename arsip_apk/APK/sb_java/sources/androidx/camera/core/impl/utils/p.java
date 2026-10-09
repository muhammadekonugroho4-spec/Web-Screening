package androidx.camera.core.impl.utils;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5627a = null;

    static {
        f5627a = new float[16];
    }

    public static void a(float[] r2, float r3, float r4) {
        Matrix.translateM(r2, 0, -r3, -r4, 0.0f);
    }

    public static void b(float[] r2, float r3, float r4) {
        Matrix.translateM(r2, 0, r3, r4, 0.0f);
    }

    public static void c(float[] r6, float r7, float r8, float r9) {
        b(r6, r8, r9);
        Matrix.rotateM(r6, 0, r7, 0.0f, 0.0f, 1.0f);
        a(r6, r8, r9);
    }

    public static void d(float[] r4, float r5) {
        b(r4, 0.0f, r5);
        Matrix.scaleM(r4, 0, 1.0f, -1.0f, 1.0f);
        a(r4, 0.0f, r5);
    }
}
