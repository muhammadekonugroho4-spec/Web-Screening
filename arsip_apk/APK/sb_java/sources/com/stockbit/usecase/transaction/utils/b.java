package com.stockbit.usecase.transaction.utils;

import kotlin.jvm.internal.p;
import kotlin.text.w;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f164017a = null;

    static {
        f164017a = new b();
    }

    public b() {
    }

    public static /* synthetic */ String e(b r02, String r1, boolean r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = 9999999;
    L6:
        return r02.d(r1, r2, r3);
    }

    public final double a(double r7) {
        return b(r7, g(r7), false);
    }

    public final double b(double r5, double r7, boolean r9) {
        if (r7 <= 0.0d) goto L5;
        double r2 = r5 % r7;
    L6:
        if (r9 == false) goto L10;
        return (r5 - r2) + r7;
    L10:
        if (r2 <= 0.0d) goto L12;
        double r02 = r7 - r2;
    L14:
        if (r02 != r7) goto L18;
        return r5 + ((r7 - r02) - r7);
    L18:
        return r5 - r2;
    L12:
        r02 = r7;
        goto L14
    L5:
        r2 = 0.0d;
        goto L6
    }

    public final double c(double r6) {
        double r02 = g(r6);
        if (r02 <= 0.0d) goto L5;
        double r03 = r6 % r02;
    L7:
        if (r03 != 0.0d) goto L10;
        return r6;
    L10:
        return r6 - r03;
    L5:
        r03 = 0.0d;
        goto L7
    }

    public final String d(String r5, boolean r6, int r7) {
        p.l(r5, "rawPrice");
        Double r02 = w.u(r5);
        if (r02 == null) goto L12;
        double r03 = r02.doubleValue();
        if (r03 <= 0.0d) goto L13;
        if (r6 == false) goto L9;
        double r52 = f(r03);
    L11:
        return String.valueOf(Math.min((int) r52, r7));
    L9:
        r52 = c(r03);
        goto L11
    L13:
        return r5;
    L12:
        return r5;
    }

    public final double f(double r7) {
        double r02 = h(r7);
        if (r02 <= 0.0d) goto L5;
        double r4 = r7 % r02;
    L7:
        if (r4 != 0.0d) goto L10;
        return r7;
    L10:
        return (r7 - r4) + r02;
    L5:
        r4 = 0.0d;
        goto L7
    }

    public final double g(double r3) {
        if (r3 <= 5000.0d) goto L7;
        return 25.0d;
    L7:
        if (r3 <= 2000.0d) goto L11;
        return 10.0d;
    L11:
        if (r3 <= 500.0d) goto L15;
        return 5.0d;
    L15:
        if (r3 <= 200.0d) goto L19;
        return 2.0d;
    L19:
        if (r3 <= 0.0d) goto L22;
        return 1.0d;
    L22:
        return 0.0d;
    }

    public final double h(double r3) {
        if (r3 < 5000.0d) goto L7;
        return 25.0d;
    L7:
        if (r3 < 2000.0d) goto L11;
        return 10.0d;
    L11:
        if (r3 < 500.0d) goto L15;
        return 5.0d;
    L15:
        if (r3 < 200.0d) goto L19;
        return 2.0d;
    L19:
        if (r3 < 0.0d) goto L22;
        return 1.0d;
    L22:
        return 0.0d;
    }

    public final double i(double r7) {
        return b(r7, h(r7), true);
    }
}
