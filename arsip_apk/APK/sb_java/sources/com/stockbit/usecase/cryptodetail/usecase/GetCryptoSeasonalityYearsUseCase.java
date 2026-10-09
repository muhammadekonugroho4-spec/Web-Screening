package com.stockbit.usecase.cryptodetail.usecase;

import com.stockbit.usecase.cryptodetail.contract.repository.a;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class GetCryptoSeasonalityYearsUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final a f157108a;

    public GetCryptoSeasonalityYearsUseCase(a r2) {
        p.l(r2, "repository");
        this.f157108a = r2;
    }

    public final Flow a(String r2) {
        p.l(r2, "symbol");
        final Flow r22 = this.f157108a.b(r2);
        return new GetCryptoSeasonalityYearsUseCase$invoke$$inlined$map$1(r22);
    }
}
