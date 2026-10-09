package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18811a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long f18812b = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public static final /* synthetic */ int a(a r02, long r1, int r3) {
            return r02.e(r1, r3);
        }

        public final long b() {
            return r0.a();
        }

        public final long c(int r3, int r4, int r5, int r6, boolean r7) {
            long r02 = d(r3, 0);
            long r32 = ((d(r4, 1) | r02) | d(r5, 2)) | d(r6, 3);
            if (r7 == false) goto L5;
            long r52 = Long.MIN_VALUE;
        L7:
            return r32 | r52;
        L5:
            r52 = 0;
            goto L7
        }

        public final long d(int r3, int r4) {
            return (r3 & 32767) << (r4 * 15);
        }

        public final int e(long r1, int r3) {
            return ((int) (r1 >> (r3 * 15))) & 32767;
        }

        public a() {
        }
    }

    static {
        f18811a = new a(null);
        f18812b = s0.c(0, 0, 0, 0, 14, null);
    }

    public static final /* synthetic */ long a() {
        return f18812b;
    }

    public static final int b(long r1, LayoutDirection r3) {
        if (i(r1) == false) goto L10;
        if (r3 == LayoutDirection.Ltr) goto L10;
        return f(r1);
    L10:
        return g(r1);
    }

    public static final int c(long r1, LayoutDirection r3) {
        if (i(r1) == false) goto L10;
        if (r3 == LayoutDirection.Ltr) goto L10;
        return g(r1);
    L10:
        return f(r1);
    }

    public static long d(long r02) {
        return r02;
    }

    public static final int e(long r2) {
        return a.a(f18811a, r2, 3);
    }

    public static final int f(long r2) {
        return a.a(f18811a, r2, 2);
    }

    public static final int g(long r2) {
        return a.a(f18811a, r2, 0);
    }

    public static final int h(long r2) {
        return a.a(f18811a, r2, 1);
    }

    public static final boolean i(long r2) {
        if ((r2 & Long.MIN_VALUE) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
