package androidx.compose.ui.unit;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public abstract class d {
    public static final long a(int r4, int r5, int r6, int r7) {
        boolean r02 = false;
        if (r5 < r4) goto L5;
        boolean r2 = true;
    L6:
        if (r7 < r6) goto L8;
        boolean r3 = true;
    L9:
        boolean r22 = r2 & r3;
        if (r4 < 0) goto L12;
        boolean r32 = true;
    L13:
        boolean r23 = r22 & r32;
        if (r6 < 0) goto L17;
        r02 = true;
    L17:
        if ((r02 & r23) == true) goto L20;
        n.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
    L20:
        return h(r4, r5, r6, r7);
    L12:
        r32 = false;
        goto L13
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    public static /* synthetic */ long b(int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = Integer.MAX_VALUE;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r5 = Integer.MAX_VALUE;
    L15:
        return a(r2, r3, r4, r5);
    }

    public static final int c(int r1) {
        if (r1 >= 8191) goto L7;
        return 13;
    L7:
        if (r1 >= 32767) goto L11;
        return 15;
    L11:
        if (r1 >= 65535) goto L15;
        return 16;
    L15:
        if (r1 >= 262143) goto L18;
        return 18;
    L18:
        return Constants.MAX_HOST_LENGTH;
    }

    public static final long d(long r5, long r7) {
        int r1 = (int) (r7 >> 32);
        int r2 = c.n(r5);
        int r3 = c.l(r5);
        if (r1 >= r2) goto L5;
        r1 = r2;
    L5:
        if (r1 > r3) goto L8;
        r3 = r1;
    L8:
        int r72 = (int) (r7 & 4294967295L);
        int r8 = c.m(r5);
        int r52 = c.k(r5);
        if (r72 >= r8) goto L11;
        r72 = r8;
    L11:
        if (r72 > r52) goto L15;
        r52 = r72;
    L15:
        return s.c((r3 << 32) | (r52 & 4294967295L));
    }

    public static final long e(long r4, long r6) {
        int r02 = c.n(r4);
        int r1 = c.l(r4);
        int r2 = c.m(r4);
        int r42 = c.k(r4);
        int r5 = c.n(r6);
        if (r5 >= r02) goto L5;
        r5 = r02;
    L5:
        if (r5 <= r1) goto L7;
        r5 = r1;
    L7:
        int r3 = c.l(r6);
        if (r3 < r02) goto L11;
        r02 = r3;
    L11:
        if (r02 > r1) goto L14;
        r1 = r02;
    L14:
        int r03 = c.m(r6);
        if (r03 >= r2) goto L17;
        r03 = r2;
    L17:
        if (r03 <= r42) goto L19;
        r03 = r42;
    L19:
        int r62 = c.k(r6);
        if (r62 < r2) goto L23;
        r2 = r62;
    L23:
        if (r2 > r42) goto L27;
        r42 = r2;
    L27:
        return a(r5, r1, r03, r42);
    }

    public static final int f(long r1, int r3) {
        int r02 = c.m(r1);
        int r12 = c.k(r1);
        if (r3 >= r02) goto L5;
        r3 = r02;
    L5:
        if (r3 <= r12) goto L7;
        return r12;
    L7:
        return r3;
    }

    public static final int g(long r1, int r3) {
        int r02 = c.n(r1);
        int r12 = c.l(r1);
        if (r3 >= r02) goto L5;
        r3 = r02;
    L5:
        if (r3 <= r12) goto L7;
        return r12;
    L7:
        return r3;
    }

    public static final long h(int r6, int r7, int r8, int r9) {
        if (r9 != Integer.MAX_VALUE) goto L5;
        int r1 = r8;
    L6:
        int r2 = c(r1);
        if (r7 != Integer.MAX_VALUE) goto L9;
        int r02 = r6;
    L10:
        int r3 = c(r02);
        if ((r2 + r3) <= 31) goto L13;
        k(r02, r1);
    L13:
        int r72 = r7 + 1;
        int r73 = r72 & (~(r72 >> 31));
        int r92 = r9 + 1;
        int r03 = r3 - 13;
        int r12 = (r03 >> 1) + (r03 & 1);
        long r13 = r12 | (r6 << 2);
        return c.b((((r73 << 33) | r13) | (r8 << (r3 + 2))) | ((r92 & (~(r92 >> 31))) << (r3 + 33)));
    L9:
        r02 = r7;
        goto L10
    L5:
        r1 = r9;
        goto L6
    }

    public static final long i(long r4, int r6, int r7) {
        int r02 = c.n(r4) + r6;
        int r1 = 0;
        if (r02 >= 0) goto L5;
        r02 = 0;
    L5:
        int r2 = c.l(r4);
        if (r2 == Integer.MAX_VALUE) goto L11;
        r2 = r2 + r6;
        if (r2 >= 0) goto L11;
        r2 = 0;
    L11:
        int r62 = c.m(r4) + r7;
        if (r62 >= 0) goto L14;
        r62 = 0;
    L14:
        int r42 = c.k(r4);
        if (r42 != Integer.MAX_VALUE) goto L17;
    L16:
        r1 = r42;
    L20:
        return a(r02, r2, r62, r1);
    L17:
        r42 = r42 + r7;
        if (r42 >= 0) goto L16;
        goto L16
    }

    public static /* synthetic */ long j(long r1, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        return i(r1, r3, r4);
    }

    public static final void k(int r3, int r4) {
        throw new IllegalArgumentException("Can't represent a width of " + r3 + " and height of " + r4 + " in Constraints");
    }

    public static final Void l(int r3) {
        throw new IllegalArgumentException("Can't represent a size of " + r3 + " in Constraints");
    }
}
