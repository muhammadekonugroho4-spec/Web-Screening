package androidx.core.content.res;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f22749a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f22750b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f22751c = null;
    public static final float[][] d = null;

    static {
        f22749a = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        f22750b = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        f22751c = new float[]{95.047f, 100.0f, 108.883f};
        d = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    }

    public static int a(float r15) {
        if (r15 >= 1.0f) goto L7;
        return -16777216;
    L7:
        if (r15 <= 99.0f) goto L10;
        return -1;
    L10:
        float r1 = (r15 + 16.0f) / 116.0f;
        if (r15 <= 8.0f) goto L13;
        float r152 = (r1 * r1) * r1;
    L14:
        float r3 = (r1 * r1) * r1;
        if (r3 <= 0.008856452f) goto L17;
        boolean r5 = true;
    L18:
        if (r5 == false) goto L20;
        float r8 = r3;
    L21:
        if (r5 == true) goto L24;
        r3 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
    L24:
        float[] r02 = f22751c;
        return androidx.core.graphics.d.c(r8 * r02[0], r152 * r02[1], r3 * r02[2]);
    L20:
        r8 = ((r1 * 116.0f) - 16.0f) / 903.2963f;
        goto L21
    L17:
        r5 = false;
        goto L18
    L13:
        r152 = r15 / 903.2963f;
        goto L14
    }

    public static float b(int r02) {
        return c(g(r02));
    }

    public static float c(float r2) {
        float r22 = r2 / 100.0f;
        if (r22 > 0.008856452f) goto L7;
        return r22 * 903.2963f;
    L7:
        return (((float) Math.cbrt(r22)) * 116.0f) - 16.0f;
    }

    public static float d(float r02, float r1, float r2) {
        return r02 + ((r1 - r02) * r2);
    }

    public static float e(int r6) {
        float r62 = r6 / 255.0f;
        if (r62 > 0.04045f) goto L7;
        float r63 = r62 / 12.92f;
    L6:
        return r63 * 100.0f;
    L7:
        r63 = (float) Math.pow((r62 + 0.055f) / 1.055f, 2.4000000953674316d);
        goto L6
    }

    public static void f(int r9, float[] r10) {
        float r02 = e(Color.red(r9));
        float r1 = e(Color.green(r9));
        float r92 = e(Color.blue(r9));
        float[][] r2 = d;
        float[] r4 = r2[0];
        r10[0] = ((r4[0] * r02) + (r4[1] * r1)) + (r4[2] * r92);
        float[] r42 = r2[1];
        r10[1] = ((r42[0] * r02) + (r42[1] * r1)) + (r42[2] * r92);
        float[] r22 = r2[2];
        r10[2] = ((r02 * r22[0]) + (r1 * r22[1])) + (r92 * r22[2]);
    }

    public static float g(int r5) {
        float r02 = e(Color.red(r5));
        float r1 = e(Color.green(r5));
        float r52 = e(Color.blue(r5));
        float[] r2 = d[1];
        return ((r02 * r2[0]) + (r1 * r2[1])) + (r52 * r2[2]);
    }

    public static float h(float r6) {
        if (r6 <= 8.0f) goto L7;
        float r62 = (float) Math.pow((r6 + 16.0d) / 116.0d, 3.0d);
    L6:
        return r62 * 100.0f;
    L7:
        r62 = r6 / 903.2963f;
        goto L6
    }
}
