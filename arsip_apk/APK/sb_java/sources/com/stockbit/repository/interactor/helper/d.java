package com.stockbit.repository.interactor.helper;

/* loaded from: classes10.dex */
public abstract class d {
    public static final double a(Double r2) {
        if (r2 != null) goto L4;
        return 0.0d;
    L4:
        return r2.doubleValue();
    }

    public static final int b(Integer r02) {
        if (r02 != null) goto L4;
        return 0;
    L4:
        return r02.intValue();
    }

    public static final long c(Long r2) {
        if (r2 != null) goto L4;
        return 0;
    L4:
        return r2.longValue();
    }
}
