package io.sentry.util;

import io.sentry.N3;

/* loaded from: classes3.dex */
public abstract class z {
    public static N3 a(N3 r9) {
        if (r9.c() == null) goto L5;
        return r9;
    L5:
        Double r6 = b(null, r9.d(), r9.e());
        return new N3(r9.e(), r9.d(), r6, r9.b(), r9.a());
    }

    public static Double b(Double r6, Double r7, Boolean r8) {
        if (r6 == null) goto L4;
        return r6;
    L4:
        double r02 = A.a().c();
        if (r7 == null) goto L14;
        if (r8 == null) goto L14;
        if (r8.booleanValue() == false) goto L12;
        return Double.valueOf(r02 * r7.doubleValue());
    L12:
        return Double.valueOf(r7.doubleValue() + (r02 * (1.0d - r7.doubleValue())));
    L14:
        return Double.valueOf(r02);
    }

    public static boolean c(Double r1) {
        return e(r1, true);
    }

    public static boolean d(Double r1) {
        return e(r1, true);
    }

    public static boolean e(Double r4, boolean r5) {
        if (r4 != null) goto L5;
        return r5;
    L5:
        if (r4.isNaN() == false) goto L7;
        return false;
    L7:
        if (r4.doubleValue() >= 0.0d) goto L9;
        return false;
    L9:
        if (r4.doubleValue() > 1.0d) goto L15;
        return true;
    L15:
        return false;
    }

    public static boolean f(Double r1) {
        return e(r1, true);
    }

    public static boolean g(Double r1) {
        return h(r1, true);
    }

    public static boolean h(Double r02, boolean r1) {
        return e(r02, r1);
    }
}
