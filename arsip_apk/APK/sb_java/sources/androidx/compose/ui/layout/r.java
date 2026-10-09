package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public interface r {
    static /* synthetic */ long c0(r r02, r r1, long r2, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r2 = androidx.compose.ui.geometry.e.f17050b.c();
    L7:
        if ((r5 & 4) == 0) goto L10;
        r4 = true;
    L10:
        return r02.v(r1, r2, r4);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
    }

    static /* synthetic */ androidx.compose.ui.geometry.g w(r r02, r r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = true;
    L7:
        return r02.H(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    long A(long r1);

    androidx.compose.ui.geometry.g H(r r1, boolean r2);

    r L();

    long O(long r1);

    long T(r r1, long r2);

    long X(long r1);

    long a();

    void a0(r r1, float[] r2);

    long d(long r1);

    boolean f();

    void g0(float[] r1);

    long j(long r1);

    long v(r r1, long r2, boolean r4);
}
