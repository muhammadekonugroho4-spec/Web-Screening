package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ BigDecimal a(BigDecimal r2) {
        if (r2.signum() != 0) goto L7;
        return new BigDecimal(BigInteger.ZERO, 0);
    L7:
        return r2.stripTrailingZeros();
    }
}
