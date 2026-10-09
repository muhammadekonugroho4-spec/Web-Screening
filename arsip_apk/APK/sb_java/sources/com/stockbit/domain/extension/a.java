package com.stockbit.domain.extension;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {
    public static final boolean a(Boolean r02) {
        if (r02 != null) goto L4;
        return false;
    L4:
        return r02.booleanValue();
    }

    public static final boolean b(Boolean r02) {
        if (r02 != null) goto L4;
        return true;
    L4:
        return r02.booleanValue();
    }

    public static final int c(Boolean r1) {
        return p.g(r1, Boolean.TRUE) ? 1 : 0;
    }
}
