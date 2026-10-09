package androidx.collection;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f6426a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final S f6427b = null;

    static {
        f6426a = new long[]{-9187201950435737345L, -1};
        f6427b = new S(0);
    }

    public static final int a(int r1) {
        if (r1 != 7) goto L7;
        return 6;
    L7:
        return r1 - (r1 / 8);
    }

    public static final S b() {
        int r3 = 0;
        return new S(r3, 1, null);
    }

    public static final int c(int r02) {
        if (r02 != 0) goto L6;
        return 6;
    L6:
        return (r02 * 2) + 1;
    }

    public static final int d(int r1) {
        if (r1 > 0) goto L4;
        return 0;
    L4:
        return (-1) >>> Integer.numberOfLeadingZeros(r1);
    }

    public static final int e(int r2) {
        if (r2 != 7) goto L7;
        return 8;
    L7:
        return r2 + ((r2 - 1) / 7);
    }
}
