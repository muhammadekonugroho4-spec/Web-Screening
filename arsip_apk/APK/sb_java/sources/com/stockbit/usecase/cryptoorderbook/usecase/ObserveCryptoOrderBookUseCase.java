package com.stockbit.usecase.cryptoorderbook.usecase;

import com.stockbit.usecase.cryptoorderbook.contract.repository.a;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class ObserveCryptoOrderBookUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final a f157312a;

    public ObserveCryptoOrderBookUseCase(a r2) {
        p.l(r2, "repository");
        this.f157312a = r2;
    }

    public final Flow a(String r2) {
        p.l(r2, "symbol");
        final Flow r22 = this.f157312a.a(r2);
        return new ObserveCryptoOrderBookUseCase$invoke$$inlined$map$1(r22);
    }
}
