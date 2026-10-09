package androidx.graphics.shapes;

import androidx.collection.C2343g;

/* loaded from: classes4.dex */
public abstract class p {
    public static final boolean a(long r2, long r4) {
        if (((g(r2) * h(r4)) - (h(r2) * g(r4))) <= 0.0f) goto L6;
        return true;
    L6:
        return false;
    }

    public static final long b(long r1, float r3) {
        return C2343g.b(g(r1) / r3, h(r1) / r3);
    }

    public static final float c(long r1, float r3, float r4) {
        return (g(r1) * r3) + (h(r1) * r4);
    }

    public static final float d(long r2, long r4) {
        return (g(r2) * g(r4)) + (h(r2) * h(r4));
    }

    public static final long e(long r2) {
        float r02 = f(r2);
        if (r02 <= 0.0f) goto L7;
        return b(r2, r02);
    L7:
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final float f(long r2) {
        return (float) Math.sqrt((g(r2) * g(r2)) + (h(r2) * h(r2)));
    }

    public static final float g(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final float h(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }

    public static final long i(long r2, long r4, float r6) {
        return C2343g.b(y.i(g(r2), g(r4), r6), y.i(h(r2), h(r4), r6));
    }

    public static final long j(long r2, long r4) {
        return C2343g.b(g(r2) - g(r4), h(r2) - h(r4));
    }

    public static final long k(long r2, long r4) {
        return C2343g.b(g(r2) + g(r4), h(r2) + h(r4));
    }

    public static final long l(long r1, float r3) {
        return C2343g.b(g(r1) * r3, h(r1) * r3);
    }

    public static final long m(long r2, q r4) {
        kotlin.jvm.internal.p.l(r4, "f");
        long r22 = r4.a(g(r2), h(r2));
        return C2343g.b(Float.intBitsToFloat((int) (r22 >> 32)), Float.intBitsToFloat((int) (r22 & 4294967295L)));
    }
}
