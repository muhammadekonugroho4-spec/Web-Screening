package com.stockbit.usecase.cryptoheader.usecase;

import com.stockbit.usecase.cryptoheader.contract.repository.a;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class ObserveCryptoHeaderUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final a f157128a;

    public ObserveCryptoHeaderUseCase(a r2) {
        p.l(r2, "repository");
        this.f157128a = r2;
    }

    public final Flow a(String r2) {
        p.l(r2, "symbol");
        final Flow r22 = this.f157128a.a(r2);
        return new ObserveCryptoHeaderUseCase$invoke$$inlined$map$1(r22);
    }
}
