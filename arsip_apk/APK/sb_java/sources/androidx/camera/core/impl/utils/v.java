package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f5631a = null;

    static {
        f5631a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
    }

    public static float a(float r4, float r5, float r6, float r7) {
        float r02 = (r4 * r6) + (r5 * r7);
        float r1 = (r4 * r7) - (r5 * r6);
        double r42 = Math.sqrt((r4 * r4) + (r5 * r5)) * Math.sqrt((r6 * r6) + (r7 * r7));
        return (float) Math.toDegrees(Math.atan2(r1 / r42, r02 / r42));
    }

    public static Matrix b(Rect r1) {
        return c(new RectF(r1));
    }

    public static Matrix c(RectF r3) {
        Matrix r02 = new Matrix();
        r02.setRectToRect(f5631a, r3, Matrix.ScaleToFit.FILL);
        return r02;
    }

    public static Matrix d(RectF r1, RectF r2, int r3) {
        return e(r1, r2, r3, false);
    }

    public static Matrix e(RectF r3, RectF r4, int r5, boolean r6) {
        Matrix r02 = new Matrix();
        r02.setRectToRect(r3, f5631a, Matrix.ScaleToFit.FILL);
        r02.postRotate(r5);
        if (r6 == false) goto L5;
        r02.postScale(-1.0f, 1.0f);
    L5:
        r02.postConcat(c(r4));
        return r02;
    }

    public static Size f(Rect r02, int r1) {
        return o(m(r02), r1);
    }

    public static int g(Matrix r4) {
        float[] r02 = new float[9];
        r4.getValues(r02);
        return u((int) Math.round(Math.atan2(r02[3], r02[0]) * 57.29577951308232d));
    }

    public static boolean h(Rect r2, Size r3) {
        if (r2.left == 0) goto L5;
        return true;
    L5:
        if (r2.top == 0) goto L7;
        return true;
    L7:
        if (r2.width() == r3.getWidth()) goto L9;
        return true;
    L9:
        if (r2.height() != r3.getHeight()) goto L17;
        return false;
    L17:
        return true;
    }

    public static boolean i(int r3) {
        if (r3 != 90) goto L5;
        return true;
    L5:
        if (r3 == 270) goto L18;
        if (r3 != 0) goto L9;
        return false;
    L9:
        if (r3 != 180) goto L12;
        return false;
    L12:
        throw new IllegalArgumentException("Invalid rotation degrees: " + r3);
    L18:
        return true;
    }

    public static boolean j(Size r1, Size r2) {
        return k(r1, false, r2, false);
    }

    public static boolean k(Size r3, boolean r4, Size r5, boolean r6) {
        if (r4 == false) goto L5;
        float r42 = r3.getWidth() / r3.getHeight();
        float r32 = r42;
    L6:
        if (r6 == false) goto L8;
        float r62 = r5.getWidth() / r5.getHeight();
        float r52 = r62;
    L10:
        if (r42 >= r62) goto L12;
        return false;
    L12:
        if (r52 < r32) goto L17;
        return true;
    L17:
        return false;
    L8:
        r62 = (r5.getWidth() - 1.0f) / (r5.getHeight() + 1.0f);
        r52 = (r5.getWidth() + 1.0f) / (r5.getHeight() - 1.0f);
        goto L10
    L5:
        r42 = (r3.getWidth() + 1.0f) / (r3.getHeight() - 1.0f);
        r32 = (r3.getWidth() - 1.0f) / (r3.getHeight() + 1.0f);
        goto L6
    }

    public static boolean l(Matrix r7) {
        float[] r1 = {0.0f, 1.0f, 1.0f, 0.0f};
        r7.mapVectors(r1);
        if (a(r1[0], r1[1], r1[2], r1[3]) <= 0.0f) goto L5;
        return true;
    L5:
        return false;
    }

    public static Size m(Rect r2) {
        return new Size(r2.width(), r2.height());
    }

    public static Size n(Size r2) {
        return new Size(r2.getHeight(), r2.getWidth());
    }

    public static Size o(Size r3, int r4) {
        if ((r4 % 90) != 0) goto L5;
        boolean r02 = true;
    L6:
        androidx.core.util.h.b(r02, "Invalid rotation degrees: " + r4);
        if (i(u(r4)) == true) goto L9;
        return r3;
    L9:
        return n(r3);
    L5:
        r02 = false;
        goto L6
    }

    public static Rect p(Size r1) {
        return q(r1, 0, 0);
    }

    public static Rect q(Size r2, int r3, int r4) {
        return new Rect(r3, r4, r2.getWidth() + r3, r2.getHeight() + r4);
    }

    public static RectF r(Size r1) {
        return s(r1, 0, 0);
    }

    public static RectF s(Size r4, int r5, int r6) {
        return new RectF(r5, r6, r5 + r4.getWidth(), r6 + r4.getHeight());
    }

    public static Matrix t(Matrix r1, Rect r2) {
        Matrix r02 = new Matrix(r1);
        r02.postTranslate(-r2.left, -r2.top);
        return r02;
    }

    public static int u(int r02) {
        return ((r02 % 360) + 360) % 360;
    }
}
