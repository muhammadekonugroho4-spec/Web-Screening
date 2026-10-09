package com.stockbit.userauthcontract.logout;

import com.stockbit.userauthcontract.base.c;
import com.stockbit.userauthcontract.result.d;

/* loaded from: classes2.dex */
public interface b extends com.stockbit.userauthcontract.base.b {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stockbit.userauthcontract.base.b
    default void b(c r2) {
        if ((r2 instanceof d) == false) goto L5;
        d r22 = (d) r2;
    L6:
        m3(r22);
        return;
    L5:
        r22 = null;
        goto L6
    }

    void m3(d r1);
}
