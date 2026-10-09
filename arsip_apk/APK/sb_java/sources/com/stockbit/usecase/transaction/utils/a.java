package com.stockbit.usecase.transaction.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f164016a = null;

    static {
        f164016a = new a();
    }

    public a() {
    }

    public final BigDecimal a(BigDecimal r3) {
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        return b(r3, e(r3), false);
    }

    public final BigDecimal b(BigDecimal r5, BigDecimal r6, boolean r7) {
        BigDecimal r02 = BigDecimal.ZERO;
        if (r6.compareTo(r02) <= 0) goto L5;
        BigDecimal r1 = r5.remainder(r6);
        p.k(r1, "remainder(...)");
    L7:
        if (r7 == false) goto L11;
        p.i(r1);
        BigDecimal r52 = r5.subtract(r1);
        p.k(r52, "subtract(...)");
        BigDecimal r53 = r52.add(r6);
        p.k(r53, "add(...)");
        return r53;
    L11:
        if (r1.compareTo(r02) <= 0) goto L13;
        p.i(r1);
        BigDecimal r72 = r6.subtract(r1);
        p.k(r72, "subtract(...)");
    L15:
        if (p.g(r72, r6) == false) goto L18;
        BigDecimal r73 = r6.subtract(r72);
        p.k(r73, "subtract(...)");
        BigDecimal r62 = r73.subtract(r6);
        p.k(r62, "subtract(...)");
        BigDecimal r54 = r5.add(r62);
        p.k(r54, "add(...)");
        return r54;
    L18:
        p.i(r1);
        BigDecimal r55 = r5.subtract(r1);
        p.k(r55, "subtract(...)");
        return r55;
    L13:
        r72 = r6;
        goto L15
    L5:
        r1 = r02;
        goto L7
    }

    public final BigDecimal c(BigDecimal r4) {
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        BigDecimal r02 = e(r4);
        BigDecimal r1 = BigDecimal.ZERO;
        if (r02.compareTo(r1) <= 0) goto L5;
        BigDecimal r03 = r4.remainder(r02);
        p.k(r03, "remainder(...)");
    L7:
        if (p.g(r03, r1) == false) goto L9;
        return r4;
    L9:
        p.i(r03);
        BigDecimal r42 = r4.subtract(r03);
        p.k(r42, "subtract(...)");
        return r42;
    L5:
        r03 = r1;
        goto L7
    }

    public final BigDecimal d(BigDecimal r5) {
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        BigDecimal r02 = f(r5);
        BigDecimal r1 = BigDecimal.ZERO;
        if (r02.compareTo(r1) <= 0) goto L5;
        BigDecimal r2 = r5.remainder(r02);
        p.k(r2, "remainder(...)");
    L7:
        if (p.g(r2, r1) == false) goto L9;
        return r5;
    L9:
        p.i(r2);
        BigDecimal r52 = r5.subtract(r2);
        p.k(r52, "subtract(...)");
        BigDecimal r53 = r52.add(r02);
        p.k(r53, "add(...)");
        return r53;
    L5:
        r2 = r1;
        goto L7
    }

    public final BigDecimal e(BigDecimal r3) {
        if (r3.compareTo(new BigDecimal(5000)) <= 0) goto L7;
        return new BigDecimal(25);
    L7:
        if (r3.compareTo(new BigDecimal(2000)) <= 0) goto L11;
        return new BigDecimal(10);
    L11:
        if (r3.compareTo(new BigDecimal(500)) <= 0) goto L15;
        return new BigDecimal(5);
    L15:
        if (r3.compareTo(new BigDecimal(200)) > 0) goto L17;
        BigDecimal r02 = BigDecimal.ZERO;
        if (r3.compareTo(r02) > 0) goto L21;
        p.i(r02);
        return r02;
    L21:
        return new BigDecimal(1);
    L17:
        return new BigDecimal(2);
    }

    public final BigDecimal f(BigDecimal r3) {
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        if (r3.compareTo(new BigDecimal(5000)) < 0) goto L7;
        return new BigDecimal(25);
    L7:
        if (r3.compareTo(new BigDecimal(2000)) < 0) goto L11;
        return new BigDecimal(10);
    L11:
        if (r3.compareTo(new BigDecimal(500)) < 0) goto L15;
        return new BigDecimal(5);
    L15:
        if (r3.compareTo(new BigDecimal(200)) >= 0) goto L17;
        BigDecimal r02 = BigDecimal.ZERO;
        if (r3.compareTo(r02) >= 0) goto L21;
        p.i(r02);
        return r02;
    L21:
        return new BigDecimal(1);
    L17:
        return new BigDecimal(2);
    }

    public final BigDecimal g(BigDecimal r3) {
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        return b(r3, f(r3), true);
    }
}
