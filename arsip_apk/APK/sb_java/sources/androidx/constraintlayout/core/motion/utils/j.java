package androidx.constraintlayout.core.motion.utils;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public b f21136a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f21137b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f21138c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f21139e;

    public static class a {
        public static void a(int[] r7, float[] r8, int r9, int r10) {
            int[] r02 = new int[r7.length + 10];
            r02[0] = r10;
            r02[1] = r9;
            int r92 = 2;
        L3:
            if (r92 <= 0) goto L8;
            int r1 = r02[r92 - 1];
            int r2 = r92 - 2;
            int r3 = r02[r2];
            if (r1 < r3) goto L6;
            r92 = r2;
            goto L3
        L6:
            int r4 = b(r7, r8, r1, r3);
            r02[r2] = r4 - 1;
            r02[r92 - 1] = r1;
            int r12 = r92 + 1;
            r02[r92] = r3;
            r92 = r92 + 2;
            r02[r12] = r4 + 1;
            goto L3
        }

        public static int b(int[] r3, float[] r4, int r5, int r6) {
            int r02 = r3[r6];
            int r1 = r5;
        L3:
            if (r5 >= r6) goto L8;
            if (r3[r5] > r02) goto L7;
            c(r3, r4, r1, r5);
            r1 = r1 + 1;
        L7:
            r5 = r5 + 1;
            goto L3
        L8:
            c(r3, r4, r1, r6);
            return r1;
        }

        public static void c(int[] r2, float[] r3, int r4, int r5) {
            int r02 = r2[r4];
            r2[r4] = r2[r5];
            r2[r5] = r02;
            float r22 = r3[r4];
            r3[r4] = r3[r5];
            r3[r5] = r22;
        }
    }

    public j() {
        this.f21137b = new int[10];
        this.f21138c = new float[10];
    }

    public float a(float r4) {
        return (float) this.f21136a.c(r4, 0);
    }

    public float b(float r4) {
        return (float) this.f21136a.f(r4, 0);
    }

    public void c(int r4, float r5) {
        int[] r02 = this.f21137b;
        if (r02.length >= (this.d + 1)) goto L5;
        this.f21137b = Arrays.copyOf(r02, r02.length * 2);
        float[] r03 = this.f21138c;
        this.f21138c = Arrays.copyOf(r03, r03.length * 2);
    L5:
        int[] r04 = this.f21137b;
        int r1 = this.d;
        r04[r1] = r4;
        this.f21138c[r1] = r5;
        this.d = r1 + 1;
    }

    public void d(String r1) {
        this.f21139e = r1;
    }

    public void e(int r10) {
        int r02 = this.d;
        if (r02 != 0) goto L5;
        return;
    L5:
        a.a(this.f21137b, this.f21138c, 0, r02 - 1);
        int r03 = 1;
        int r1 = 1;
    L7:
        if (r03 >= this.d) goto L12;
        int[] r2 = this.f21137b;
        if (r2[r03 - 1] == r2[r03]) goto L11;
        r1 = r1 + 1;
    L11:
        r03 = r03 + 1;
        goto L7
    L12:
        double[] r04 = new double[r1];
        double[][] r12 = (double[][]) Array.newInstance(Double.TYPE, new int[]{r1, 1});
        int r22 = 0;
        int r3 = 0;
    L14:
        if (r22 >= this.d) goto L21;
        if (r22 <= 0) goto L19;
        int[] r5 = this.f21137b;
        if (r5[r22] != r5[r22 - 1]) goto L19;
    L20:
        r22 = r22 + 1;
    L19:
        r04[r3] = this.f21137b[r22] * 0.01d;
        r12[r3][0] = this.f21138c[r22];
        r3 = r3 + 1;
        goto L20
    L21:
        this.f21136a = b.a(r10, r04, r12);
    }

    public String toString() {
        String r02 = this.f21139e;
        DecimalFormat r1 = new DecimalFormat("##.##");
        int r2 = 0;
    L4:
        if (r2 >= this.d) goto L6;
        r02 = r02 + Constants.AES_PREFIX + this.f21137b[r2] + " , " + r1.format(this.f21138c[r2]) + "] ";
        r2 = r2 + 1;
        goto L4
    L6:
        return r02;
    }
}
