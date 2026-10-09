package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract class w {
    public static final long a(float r02, long r1) {
        return k(r1, r02);
    }

    public static final void b(long r2) {
        if (v.f(r2) != 0) goto L5;
        boolean r22 = true;
    L6:
        if (r22 == false) goto L9;
        n.a("Cannot perform operation for Unspecified type.");
        return;
    L9:
        return;
    L5:
        r22 = false;
        goto L6
    }

    public static final void c(long r4, long r6) {
        if (v.f(r4) != 0) goto L6;
    L7:
        boolean r02 = false;
    L9:
        if (r02 == true) goto L12;
        n.a("Cannot perform operation for Unspecified type.");
    L12:
        if (x.g(v.g(r4), v.g(r6)) == true) goto L15;
        n.a("Cannot perform operation for " + x.i(v.g(r4)) + " and " + x.i(v.g(r6)));
        return;
    L15:
        return;
    L6:
        if (v.f(r6) == 0) goto L7;
        r02 = true;
        goto L9
    }

    public static final long d(double r2) {
        return k(8589934592L, (float) r2);
    }

    public static final long e(float r2) {
        return k(8589934592L, r2);
    }

    public static final long f(int r2) {
        return k(8589934592L, r2);
    }

    public static final long g(double r2) {
        return k(4294967296L, (float) r2);
    }

    public static final long h(float r2) {
        return k(4294967296L, r2);
    }

    public static final long i(int r2) {
        return k(4294967296L, r2);
    }

    public static final long j(long r2, long r4, float r6) {
        c(r2, r4);
        return k(v.f(r2), androidx.compose.ui.util.d.b(v.h(r2), v.h(r4), r6));
    }

    public static final long k(long r4, float r6) {
        return v.c(r4 | (Float.floatToRawIntBits(r6) & 4294967295L));
    }
}
