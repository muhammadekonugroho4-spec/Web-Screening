package com.stockbit.userauthcontract.email;

import com.stockbit.userauthcontract.base.c;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b extends com.stockbit.userauthcontract.base.b {
    @Override // com.stockbit.userauthcontract.base.b
    default void b(c r2) {
        p.j(r2, "null cannot be cast to non-null type com.stockbit.userauthcontract.result.OTPEmailResult");
        o3((com.stockbit.userauthcontract.result.a) r2);
    }

    void o3(com.stockbit.userauthcontract.result.a r1);
}
