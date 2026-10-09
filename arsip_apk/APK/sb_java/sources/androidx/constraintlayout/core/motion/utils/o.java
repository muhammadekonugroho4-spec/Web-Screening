package androidx.constraintlayout.core.motion.utils;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: k, reason: collision with root package name */
    public static float f21165k = 6.2831855f;

    /* renamed from: a, reason: collision with root package name */
    public b f21166a;

    /* renamed from: b, reason: collision with root package name */
    public int f21167b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f21168c;
    public float[][] d;

    /* renamed from: e, reason: collision with root package name */
    public int f21169e;

    /* renamed from: f, reason: collision with root package name */
    public String f21170f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f21171g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21172h;

    /* renamed from: i, reason: collision with root package name */
    public long f21173i;

    /* renamed from: j, reason: collision with root package name */
    public float f21174j;

    public static class a {
        public static void a(int[] r7, float[][] r8, int r9, int r10) {
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

        public static int b(int[] r3, float[][] r4, int r5, int r6) {
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

        public static void c(int[] r2, float[][] r3, int r4, int r5) {
            int r02 = r2[r4];
            r2[r4] = r2[r5];
            r2[r5] = r02;
            float[] r22 = r3[r4];
            r3[r4] = r3[r5];
            r3[r5] = r22;
        }
    }

    static {
    }

    public o() {
        this.f21167b = 0;
        this.f21168c = new int[10];
        this.d = (float[][]) Array.newInstance(Float.TYPE, new int[]{10, 3});
        this.f21171g = new float[3];
        this.f21172h = false;
        this.f21174j = Float.NaN;
    }

    public float a(float r4) {
        switch(this.f21167b) {
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        float r42 = 1.0f - Math.abs(((r4 * 4.0f) % 4.0f) - 2.0f);
        float r43 = r42 * r42;
    L8:
        return 1.0f - r43;
    L11:
        r43 = ((r4 * 2.0f) + 1.0f) % 2.0f;
        goto L8
    L14:
        r43 = Math.abs(r4);
        goto L8
    L5:
        return (float) Math.sin(r4 * f21165k);
    L10:
        return (float) Math.cos(r4 * f21165k);
    L13:
        return (((r4 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
    L16:
        return Math.signum(r4 * f21165k);
    }

    public void b(long r1) {
        this.f21173i = r1;
    }

    public void c(String r1) {
        this.f21170f = r1;
    }

    public void d(int r12) {
        int r02 = this.f21169e;
        if (r02 != 0) goto L6;
        System.err.println("Error no points added to " + this.f21170f);
        return;
    L6:
        a.a(this.f21168c, this.d, 0, r02 - 1);
        int r03 = 1;
        int r1 = 0;
    L7:
        int[] r2 = this.f21168c;
        if (r03 >= r2.length) goto L13;
        if (r2[r03] == r2[r03 - 1]) goto L12;
        r1 = r1 + 1;
    L12:
        r03 = r03 + 1;
        goto L7
    L13:
        if (r1 != 0) goto L15;
        r1 = 1;
    L15:
        double[] r04 = new double[r1];
        double[][] r13 = (double[][]) Array.newInstance(Double.TYPE, new int[]{r1, 3});
        int r5 = 0;
        int r6 = 0;
    L17:
        if (r5 >= this.f21169e) goto L24;
        if (r5 <= 0) goto L22;
        int[] r7 = this.f21168c;
        if (r7[r5] != r7[r5 - 1]) goto L22;
    L23:
        r5 = r5 + 1;
    L22:
        r04[r6] = this.f21168c[r5] * 0.01d;
        double[] r72 = r13[r6];
        float[] r8 = this.d[r5];
        r72[0] = r8[0];
        r72[1] = r8[1];
        r72[2] = r8[2];
        r6 = r6 + 1;
        goto L23
    L24:
        this.f21166a = b.a(r12, r04, r13);
    }

    public String toString() {
        String r02 = this.f21170f;
        DecimalFormat r1 = new DecimalFormat("##.##");
        int r2 = 0;
    L4:
        if (r2 >= this.f21169e) goto L6;
        r02 = r02 + Constants.AES_PREFIX + this.f21168c[r2] + " , " + r1.format(this.d[r2]) + "] ";
        r2 = r2 + 1;
        goto L4
    L6:
        return r02;
    }
}
