package androidx.collection.internal;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6448a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f6449b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6450c = null;

    static {
        f6448a = new int[0];
        f6449b = new long[0];
        f6450c = new Object[0];
    }

    public static final int a(int[] r3, int r4, int r5) {
        p.l(r3, "array");
        int r42 = r4 - 1;
        int r02 = 0;
    L3:
        if (r02 > r42) goto L11;
        int r1 = (r02 + r42) >>> 1;
        int r2 = r3[r1];
        if (r2 < r5) goto L6;
        if (r2 <= r5) goto L9;
        r42 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r02 = r1 + 1;
        goto L3
    L11:
        return ~r02;
    }

    public static final int b(long[] r4, int r5, long r6) {
        p.l(r4, "array");
        int r52 = r5 - 1;
        int r02 = 0;
    L3:
        if (r02 > r52) goto L11;
        int r1 = (r02 + r52) >>> 1;
        long r2 = r4[r1];
        if (r2 < r6) goto L6;
        if (r2 <= r6) goto L9;
        r52 = r1 - 1;
        goto L3
    L9:
        return r1;
    L6:
        r02 = r1 + 1;
        goto L3
    L11:
        return ~r02;
    }

    public static final boolean c(Object r02, Object r1) {
        return p.g(r02, r1);
    }

    public static final int d(int r2) {
        int r02 = 4;
    L4:
        if (r02 >= 32) goto L9;
        int r1 = (1 << r02) - 12;
        if (r2 <= r1) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r1;
    L9:
        return r2;
    }

    public static final int e(int r02) {
        return d(r02 * 4) / 4;
    }

    public static final int f(int r02) {
        return d(r02 * 8) / 8;
    }
}
