package kotlin.internal;

/* loaded from: classes3.dex */
public abstract class c {
    public static final int a(int r02, int r1, int r2) {
        return e(e(r02, r2) - e(r1, r2), r2);
    }

    public static final long b(long r02, long r2, long r4) {
        return f(f(r02, r4) - f(r2, r4), r4);
    }

    public static final int c(int r02, int r1, int r2) {
        if (r2 <= 0) goto L7;
        if (r02 < r1) goto L6;
    L9:
        return r1;
    L6:
        return r1 - a(r1, r02, r2);
    L7:
        if (r2 >= 0) goto L13;
        if (r02 <= r1) goto L9;
        return r1 + a(r02, r1, -r2);
    L13:
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long d(long r4, long r6, long r8) {
        if (r8 <= 0) goto L10;
        if (r4 < r6) goto L8;
        return r6;
    L8:
        return r6 - b(r6, r4, r8);
    L10:
        if (r8 >= 0) goto L17;
        if (r4 > r6) goto L15;
        return r6;
    L15:
        return r6 + b(r4, r6, -r8);
    L17:
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int e(int r02, int r1) {
        int r03 = r02 % r1;
        if (r03 < 0) goto L6;
        return r03;
    L6:
        return r03 + r1;
    }

    public static final long f(long r2, long r4) {
        long r22 = r2 % r4;
        if (r22 < 0) goto L6;
        return r22;
    L6:
        return r22 + r4;
    }
}
