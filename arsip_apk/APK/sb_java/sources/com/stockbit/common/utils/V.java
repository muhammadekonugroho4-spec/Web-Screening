package com.stockbit.common.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes7.dex */
public abstract class V {
    public static final double a(BigDecimal r3) {
        kotlin.jvm.internal.p.l(r3, "amountLot");
        if (r3.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) goto L5;
        return 1.0d;
    L5:
        return r3.divide(new BigDecimal(Integer.MAX_VALUE), 2, RoundingMode.UP).doubleValue();
    }
}
