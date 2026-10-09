package com.stockbit.feature.transaction.util.compose;

import com.clevertap.android.sdk.Constants;
import com.stockbit.feature.transaction.util.compose.j;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class k {
    public static final j.a a(Object r1) {
        return new j.a(r1);
    }

    public static final j.b b(Object r1) {
        return new j.b(r1);
    }

    public static final j c(j r1, j r2) {
        p.l(r1, Constants.KEY_NEW_VALUE);
        p.l(r2, Constants.KEY_OLD_VALUE);
        if ((r1 instanceof j.b) == false) goto L5;
        return r1;
    L5:
        if ((r2 instanceof j.a) == false) goto L7;
        return r1;
    L7:
        return r2;
    }
}
