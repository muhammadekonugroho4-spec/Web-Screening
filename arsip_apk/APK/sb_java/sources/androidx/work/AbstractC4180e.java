package androidx.work;

/* renamed from: androidx.work.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4180e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29141a = null;

    static {
        String r02 = r.i("Data");
        kotlin.jvm.internal.p.k(r02, "tagWithPrefix(\"Data\")");
        f29141a = r02;
    }

    public static final /* synthetic */ Boolean[] a(boolean[] r02) {
        return h(r02);
    }

    public static final /* synthetic */ Byte[] b(byte[] r02) {
        return i(r02);
    }

    public static final /* synthetic */ Double[] c(double[] r02) {
        return j(r02);
    }

    public static final /* synthetic */ Float[] d(float[] r02) {
        return k(r02);
    }

    public static final /* synthetic */ Integer[] e(int[] r02) {
        return l(r02);
    }

    public static final /* synthetic */ Long[] f(long[] r02) {
        return m(r02);
    }

    public static final /* synthetic */ String g() {
        return f29141a;
    }

    public static final Boolean[] h(boolean[] r4) {
        int r02 = r4.length;
        Boolean[] r1 = new Boolean[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = Boolean.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final Byte[] i(byte[] r4) {
        int r02 = r4.length;
        Byte[] r1 = new Byte[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = Byte.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final Double[] j(double[] r5) {
        int r02 = r5.length;
        Double[] r1 = new Double[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = Double.valueOf(r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final Float[] k(float[] r4) {
        int r02 = r4.length;
        Float[] r1 = new Float[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = Float.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final Integer[] l(int[] r4) {
        int r02 = r4.length;
        Integer[] r1 = new Integer[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = Integer.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final Long[] m(long[] r5) {
        int r02 = r5.length;
        Long[] r1 = new Long[r02];
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1[r2] = Long.valueOf(r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }
}
