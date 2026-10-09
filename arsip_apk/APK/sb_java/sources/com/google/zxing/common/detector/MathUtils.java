package com.google.zxing.common.detector;

/* loaded from: classes6.dex */
public final class MathUtils {
    private MathUtils() {
    }

    public static float distance(float r02, float r1, float r2, float r3) {
        float r03 = r02 - r2;
        float r12 = r1 - r3;
        return (float) Math.sqrt((r03 * r03) + (r12 * r12));
    }

    public static int round(float r1) {
        if (r1 >= 0.0f) goto L5;
        float r02 = -0.5f;
    L7:
        return (int) (r1 + r02);
    L5:
        r02 = 0.5f;
        goto L7
    }

    public static int sum(int[] r4) {
        int r02 = r4.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r02) goto L5;
        r2 = r2 + r4[r1];
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    public static float distance(int r02, int r1, int r2, int r3) {
        int r03 = r02 - r2;
        int r12 = r1 - r3;
        return (float) Math.sqrt((r03 * r03) + (r12 * r12));
    }
}
