package com.stockbit.usecase.cryptowithdrawal.usecase;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class GetCryptoWithdrawalBalanceUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.cryptowithdrawal.contract.repository.a f157506a;

    public GetCryptoWithdrawalBalanceUseCase(com.stockbit.usecase.cryptowithdrawal.contract.repository.a r2) {
        p.l(r2, "repository");
        this.f157506a = r2;
    }

    public final Flow a() {
        final Flow r02 = this.f157506a.c();
        return new GetCryptoWithdrawalBalanceUseCase$invoke$$inlined$map$1(r02);
    }
}
