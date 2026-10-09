package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.k;
import com.airbnb.lottie.model.content.i;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f31625a = null;

    static {
        f31625a = new PointF();
    }

    public static PointF a(PointF r3, PointF r4) {
        return new PointF(r3.x + r4.x, r3.y + r4.y);
    }

    public static double b(double r02, double r2, double r4) {
        return Math.max(r2, Math.min(r4, r02));
    }

    public static float c(float r02, float r1, float r2) {
        return Math.max(r1, Math.min(r2, r02));
    }

    public static int d(int r02, int r1, int r2) {
        return Math.max(r1, Math.min(r2, r02));
    }

    public static boolean e(float r02, float r1, float r2) {
        if (r02 >= r1) goto L5;
        return false;
    L5:
        if (r02 > r2) goto L10;
        return true;
    L10:
        return false;
    }

    public static int f(int r2, int r3) {
        int r02 = r2 / r3;
        if ((r2 ^ r3) < 0) goto L5;
        boolean r1 = true;
    L6:
        int r22 = r2 % r3;
        if (r1 == true) goto L11;
        if (r22 != 0) goto L10;
        return r02;
    L10:
        return r02 - 1;
    L11:
        return r02;
    L5:
        r1 = false;
        goto L6
    }

    public static int g(float r02, float r1) {
        return h((int) r02, (int) r1);
    }

    public static int h(int r1, int r2) {
        return r1 - (r2 * f(r1, r2));
    }

    public static void i(i r12, Path r13) {
        r13.reset();
        PointF r02 = r12.b();
        r13.moveTo(r02.x, r02.y);
        f31625a.set(r02.x, r02.y);
        int r03 = 0;
    L4:
        if (r03 >= r12.a().size()) goto L12;
        com.airbnb.lottie.model.a r1 = (com.airbnb.lottie.model.a) r12.a().get(r03);
        PointF r2 = r1.a();
        PointF r3 = r1.b();
        PointF r14 = r1.c();
        PointF r4 = f31625a;
        if (r2.equals(r4) == true) goto L8;
    L10:
        Path r5 = r13;
        r5.cubicTo(r2.x, r2.y, r3.x, r3.y, r14.x, r14.y);
    L11:
        r4.set(r14.x, r14.y);
        r03 = r03 + 1;
        r13 = r5;
        goto L4
    L8:
        if (r3.equals(r14) == false) goto L10;
        r13.lineTo(r14.x, r14.y);
        r5 = r13;
        goto L11
    L12:
        Path r52 = r13;
        if (r12.d() == false) goto L19;
        r52.close();
        return;
    }

    public static double j(double r02, double r2, double r4) {
        return r02 + (r4 * (r2 - r02));
    }

    public static float k(float r02, float r1, float r2) {
        return r02 + (r2 * (r1 - r02));
    }

    public static int l(int r1, int r2, float r3) {
        return (int) (r1 + (r3 * (r2 - r1)));
    }

    public static void m(com.airbnb.lottie.model.d r1, int r2, List r3, com.airbnb.lottie.model.d r4, k r5) {
        if (r1.c(r5.getName(), r2) == false) goto L6;
        r3.add(r4.a(r5.getName()).i(r5));
        return;
    }
}
