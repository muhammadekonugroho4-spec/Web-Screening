package kotlin.math;

/* loaded from: classes3.dex */
public abstract class d extends c {
    public static int a(int r02) {
        return Integer.signum(r02);
    }

    public static int b(long r02) {
        return Long.signum(r02);
    }

    public static double c(double r2) {
        return Math.log(r2) / a.f177511b;
    }

    public static int d(double r2) {
        if (Double.isNaN(r2) == true) goto L15;
        if (r2 <= 2.147483647E9d) goto L9;
        return Integer.MAX_VALUE;
    L9:
        if (r2 >= (-2.147483648E9d)) goto L13;
        return Integer.MIN_VALUE;
    L13:
        return (int) Math.round(r2);
    L15:
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int e(float r1) {
        if (Float.isNaN(r1) == true) goto L7;
        return Math.round(r1);
    L7:
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long f(double r1) {
        if (Double.isNaN(r1) == true) goto L7;
        return Math.round(r1);
    L7:
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long g(float r2) {
        return f(r2);
    }

    public static double h(double r2) {
        if (Double.isNaN(r2) == false) goto L5;
        return r2;
    L5:
        if (Double.isInfinite(r2) == false) goto L8;
        return r2;
    L8:
        if (r2 <= 0.0d) goto L12;
        return Math.floor(r2);
    L12:
        return Math.ceil(r2);
    }
}
