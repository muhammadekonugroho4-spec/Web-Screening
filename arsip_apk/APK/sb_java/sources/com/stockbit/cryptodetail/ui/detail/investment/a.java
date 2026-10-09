package com.stockbit.cryptodetail.ui.detail.investment;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f79648a = null;

    static {
        f79648a = new a();
    }

    public a() {
    }

    public final b a(String r13, BigDecimal r14, BigDecimal r15, double r16) {
        p.l(r13, "symbol");
        p.l(r14, "position");
        p.l(r15, "avgPrice");
        if (r14.compareTo(BigDecimal.ZERO) > 0) goto L5;
        return null;
    L5:
        double r02 = r14.doubleValue();
        double r8 = r15.doubleValue();
        double r5 = r02 * r8;
        if (r5 != 0.0d) goto L8;
        return null;
    L8:
        double r03 = r02 * r16;
        double r10 = r03 - r5;
        return new b(r13, r03, r10 / r5, r8, r10);
    }
}
