package androidx.core.graphics;

import android.graphics.Color;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22866a = null;

    static {
        f22866a = new ThreadLocal();
    }

    public static void a(int r7, int r8, int r9, float[] r10) {
        float r72 = r7 / 255.0f;
        float r82 = r8 / 255.0f;
        float r92 = r9 / 255.0f;
        float r02 = Math.max(r72, Math.max(r82, r92));
        float r1 = Math.min(r72, Math.min(r82, r92));
        float r2 = r02 - r1;
        float r3 = (r02 + r1) / 2.0f;
        if (r02 != r1) goto L6;
        float r83 = 0.0f;
        float r22 = 0.0f;
    L13:
        float r84 = (r83 * 60.0f) % 360.0f;
        if (r84 >= 0.0f) goto L16;
        r84 = r84 + 360.0f;
    L16:
        r10[0] = m(r84, 0.0f, 360.0f);
        r10[1] = m(r22, 0.0f, 1.0f);
        r10[2] = m(r3, 0.0f, 1.0f);
        return;
    L6:
        if (r02 != r72) goto L9;
        r83 = ((r82 - r92) / r2) % 6.0f;
    L12:
        r22 = r2 / (1.0f - Math.abs((2.0f * r3) - 1.0f));
        goto L13
    L9:
        if (r02 != r82) goto L11;
        r83 = ((r92 - r72) / r2) + 2.0f;
        goto L12
    L11:
        r83 = 4.0f + ((r72 - r82) / r2);
        goto L12
    }

    public static void b(int r20, int r21, int r22, double[] r23) {
        if (r23.length != 3) goto L21;
        double r1 = r20 / 255.0d;
        if (r1 >= 0.04045d) goto L8;
        double r12 = r1 / 12.92d;
    L9:
        double r3 = r21 / 255.0d;
        if (r3 >= 0.04045d) goto L13;
        double r32 = r3 / 12.92d;
    L14:
        double r5 = r22 / 255.0d;
        if (r5 >= 0.04045d) goto L17;
        double r52 = r5 / 12.92d;
    L18:
        r23[0] = (((0.4124d * r12) + (0.3576d * r32)) + (0.1805d * r52)) * 100.0d;
        r23[1] = (((0.2126d * r12) + (0.7152d * r32)) + (0.0722d * r52)) * 100.0d;
        r23[2] = (((r12 * 0.0193d) + (r32 * 0.1192d)) + (r52 * 0.9505d)) * 100.0d;
        return;
    L17:
        r52 = Math.pow((r5 + 0.055d) / 1.055d, 2.4d);
        goto L18
    L13:
        r32 = Math.pow((r3 + 0.055d) / 1.055d, 2.4d);
        goto L14
    L8:
        r12 = Math.pow((r1 + 0.055d) / 1.055d, 2.4d);
        goto L9
    L21:
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int c(double r17, double r19, double r21) {
        double r02 = (((3.2406d * r17) + ((-1.5372d) * r19)) + ((-0.4986d) * r21)) / 100.0d;
        double r4 = ((((-0.9689d) * r17) + (1.8758d * r19)) + (0.0415d * r21)) / 100.0d;
        double r6 = (((0.0557d * r17) + ((-0.204d) * r19)) + (1.057d * r21)) / 100.0d;
        if (r02 <= 0.0031308d) goto L5;
        double r03 = (Math.pow(r02, 0.4166666666666667d) * 1.055d) - 0.055d;
    L7:
        if (r4 <= 0.0031308d) goto L9;
        double r42 = (Math.pow(r4, 0.4166666666666667d) * 1.055d) - 0.055d;
    L11:
        if (r6 <= 0.0031308d) goto L13;
        double r2 = (Math.pow(r6, 0.4166666666666667d) * 1.055d) - 0.055d;
    L15:
        return Color.rgb(n((int) Math.round(r03 * 255.0d), 0, Constants.MAX_HOST_LENGTH), n((int) Math.round(r42 * 255.0d), 0, Constants.MAX_HOST_LENGTH), n((int) Math.round(r2 * 255.0d), 0, Constants.MAX_HOST_LENGTH));
    L13:
        r2 = r6 * 12.92d;
        goto L15
    L9:
        r42 = r4 * 12.92d;
        goto L11
    L5:
        r03 = r02 * 12.92d;
        goto L7
    }

    public static int d(int r5, int r6, float r7) {
        float r02 = 1.0f - r7;
        return Color.argb((int) ((Color.alpha(r5) * r02) + (Color.alpha(r6) * r7)), (int) ((Color.red(r5) * r02) + (Color.red(r6) * r7)), (int) ((Color.green(r5) * r02) + (Color.green(r6) * r7)), (int) ((Color.blue(r5) * r02) + (Color.blue(r6) * r7)));
    }

    public static double e(int r4, int r5) {
        if (Color.alpha(r5) != 255) goto L10;
        if (Color.alpha(r4) >= 255) goto L7;
        r4 = k(r4, r5);
    L7:
        double r02 = f(r4) + 0.05d;
        double r42 = f(r5) + 0.05d;
        return Math.max(r02, r42) / Math.min(r02, r42);
    L10:
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(r5));
    }

    public static double f(int r5) {
        double[] r02 = o();
        i(r5, r02);
        return r02[1] / 100.0d;
    }

    public static int g(int r8, int r9, float r10) {
        int r02 = Color.alpha(r9);
        int r1 = Constants.MAX_HOST_LENGTH;
        if (r02 != 255) goto L20;
        double r4 = r10;
        if (e(p(r8, Constants.MAX_HOST_LENGTH), r9) >= r4) goto L8;
        return -1;
    L8:
        int r102 = 0;
        int r03 = 0;
    L10:
        if (r102 > 10) goto L18;
        if ((r1 - r03) <= 1) goto L18;
        int r2 = (r03 + r1) / 2;
        if (e(p(r8, r2), r9) >= r4) goto L16;
        r03 = r2;
    L17:
        r102 = r102 + 1;
        goto L10
    L16:
        r1 = r2;
    L18:
        return r1;
    L20:
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(r9));
    }

    public static void h(int r2, float[] r3) {
        a(Color.red(r2), Color.green(r2), Color.blue(r2), r3);
    }

    public static void i(int r2, double[] r3) {
        b(Color.red(r2), Color.green(r2), Color.blue(r2), r3);
    }

    public static int j(int r02, int r1) {
        return 255 - (((255 - r1) * (255 - r02)) / Constants.MAX_HOST_LENGTH);
    }

    public static int k(int r6, int r7) {
        int r02 = Color.alpha(r7);
        int r1 = Color.alpha(r6);
        int r2 = j(r1, r02);
        return Color.argb(r2, l(Color.red(r6), r1, Color.red(r7), r02, r2), l(Color.green(r6), r1, Color.green(r7), r02, r2), l(Color.blue(r6), r1, Color.blue(r7), r02, r2));
    }

    public static int l(int r02, int r1, int r2, int r3, int r4) {
        if (r4 != 0) goto L6;
        return 0;
    L6:
        return (((r02 * Constants.MAX_HOST_LENGTH) * r1) + ((r2 * r3) * (255 - r1))) / (r4 * Constants.MAX_HOST_LENGTH);
    }

    public static float m(float r1, float r2, float r3) {
        if (r1 >= r2) goto L6;
        return r2;
    L6:
        return Math.min(r1, r3);
    }

    public static int n(int r02, int r1, int r2) {
        if (r02 >= r1) goto L5;
        return r1;
    L5:
        return Math.min(r02, r2);
    }

    public static double[] o() {
        ThreadLocal r02 = f22866a;
        double[] r1 = (double[]) r02.get();
        if (r1 != null) goto L6;
        double[] r12 = new double[3];
        r02.set(r12);
        return r12;
    L6:
        return r1;
    }

    public static int p(int r1, int r2) {
        if (r2 < 0) goto L8;
        if (r2 > 255) goto L8;
        return (r1 & FlexItem.MAX_SIZE) | (r2 << 24);
    L8:
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
