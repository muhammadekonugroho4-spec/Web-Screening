package com.stockbit.usecase.cryptowithdrawal.usecase;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class SubmitCryptoCashoutUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.cryptowithdrawal.contract.repository.a f157512a;

    public SubmitCryptoCashoutUseCase(com.stockbit.usecase.cryptowithdrawal.contract.repository.a r2) {
        p.l(r2, "repository");
        this.f157512a = r2;
    }

    public final Flow a(String r7, String r8) {
        p.l(r7, "amount");
        p.l(r8, "toAccNo");
        com.stockbit.usecase.cryptowithdrawal.contract.repository.a r02 = this.f157512a;
        StringBuilder r1 = new StringBuilder();
        int r2 = r7.length();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        char r4 = r7.charAt(r3);
        if (Character.isDigit(r4) == false) goto L7;
        r1.append(r4);
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        final Flow r72 = r02.a(r1.toString(), r8);
        return new SubmitCryptoCashoutUseCase$invoke$$inlined$map$1(r72);
    }
}
