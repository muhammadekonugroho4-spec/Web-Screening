package androidx.graphics.shapes;

import androidx.collection.C2343g;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final long f25507a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25508b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25509c = 0.0f;

    static {
        f25507a = C2343g.b(0.0f, 0.0f);
        f25508b = 3.1415927f;
        f25509c = 6.2831855f;
    }

    public static final float a(float r2, float r3) {
        float r22 = (float) Math.atan2(r3, r2);
        float r32 = f25509c;
        return (r22 + r32) % r32;
    }

    public static final long b(float r4) {
        double r02 = r4;
        return C2343g.b((float) Math.cos(r02), (float) Math.sin(r02));
    }

    public static final long c(float r2, float r3) {
        float r02 = d(r2, r3);
        if (r02 <= 0.0f) goto L7;
        return C2343g.b(r2 / r02, r3 / r02);
    L7:
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float d(float r02, float r1) {
        return (float) Math.sqrt((r02 * r02) + (r1 * r1));
    }

    public static final float e(float r02, float r1) {
        return (r02 * r02) + (r1 * r1);
    }

    public static final float f(float r4, float r5, float r6, i r7) {
        kotlin.jvm.internal.p.l(r7, "f");
    L4:
        if ((r5 - r4) <= r6) goto L10;
        float r02 = 2;
        float r2 = 3;
        float r1 = ((r02 * r4) + r5) / r2;
        float r03 = ((r02 * r5) + r4) / r2;
        if (r7.a(r1) < r7.a(r03)) goto L7;
        r4 = r1;
        goto L4
    L7:
        r5 = r03;
        goto L4
    L10:
        return (r4 + r5) / 2;
    }

    public static final float g() {
        return f25508b;
    }

    public static final float h() {
        return f25509c;
    }

    public static final float i(float r1, float r2, float r3) {
        return ((1 - r3) * r1) + (r3 * r2);
    }

    public static final float j(float r02, float r1) {
        return ((r02 % r1) + r1) % r1;
    }

    public static final long k(float r2, float r3, long r4) {
        return p.k(p.l(b(r3), r2), r4);
    }

    public static /* synthetic */ long l(float r02, float r1, long r2, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r2 = f25507a;
    L6:
        return k(r02, r1, r2);
    }

    public static final long m(long r1) {
        return C2343g.b(-p.h(r1), p.g(r1));
    }

    public static final float n(float r02) {
        return r02 * r02;
    }
}
