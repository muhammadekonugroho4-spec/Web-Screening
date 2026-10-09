package com.stockbit.common.utils;

import java.math.BigDecimal;

/* loaded from: classes7.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f61898a = null;

    static {
        f61898a = new G();
    }

    public G() {
    }

    public final BigDecimal a(BigDecimal r3) {
        kotlin.jvm.internal.p.l(r3, "lot");
        return b(r3, c(r3), false);
    }

    public final BigDecimal b(BigDecimal r5, BigDecimal r6, boolean r7) {
        BigDecimal r02 = BigDecimal.ZERO;
        if (r6.compareTo(r02) <= 0) goto L5;
        BigDecimal r1 = r5.remainder(r6);
        kotlin.jvm.internal.p.k(r1, "remainder(...)");
    L7:
        if (r7 == false) goto L11;
        kotlin.jvm.internal.p.i(r1);
        BigDecimal r52 = r5.subtract(r1);
        kotlin.jvm.internal.p.k(r52, "subtract(...)");
        BigDecimal r53 = r52.add(r6);
        kotlin.jvm.internal.p.k(r53, "add(...)");
        return r53;
    L11:
        if (r1.compareTo(r02) <= 0) goto L13;
        kotlin.jvm.internal.p.i(r1);
        BigDecimal r72 = r6.subtract(r1);
        kotlin.jvm.internal.p.k(r72, "subtract(...)");
    L14:
        BigDecimal r73 = r6.subtract(r72);
        kotlin.jvm.internal.p.k(r73, "subtract(...)");
        BigDecimal r54 = r5.add(r73);
        kotlin.jvm.internal.p.k(r54, "add(...)");
        BigDecimal r55 = r54.subtract(r6);
        kotlin.jvm.internal.p.k(r55, "subtract(...)");
        return r55;
    L13:
        r72 = r6;
        goto L14
    L5:
        r1 = r02;
        goto L7
    }

    public final BigDecimal c(BigDecimal r2) {
        BigDecimal r02 = BigDecimal.ZERO;
        if (r2.compareTo(r02) <= 0) goto L6;
        BigDecimal r22 = BigDecimal.ONE;
        kotlin.jvm.internal.p.i(r22);
        return r22;
    L6:
        kotlin.jvm.internal.p.i(r02);
        return r02;
    }

    public final BigDecimal d(BigDecimal r2) {
        BigDecimal r02 = BigDecimal.ZERO;
        if (r2.compareTo(r02) < 0) goto L6;
        BigDecimal r22 = BigDecimal.ONE;
        kotlin.jvm.internal.p.i(r22);
        return r22;
    L6:
        kotlin.jvm.internal.p.i(r02);
        return r02;
    }

    public final BigDecimal e(BigDecimal r3) {
        kotlin.jvm.internal.p.l(r3, "lot");
        return b(r3, d(r3), true);
    }
}
