package com.stockbit.usecase.cryptodetail.usecase;

import com.stockbit.usecase.cryptodetail.contract.repository.a;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class GetCryptoSeasonalityUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final a f157105a;

    public GetCryptoSeasonalityUseCase(a r2) {
        p.l(r2, "repository");
        this.f157105a = r2;
    }

    public final Flow a(String r2, int r3, int r4) {
        p.l(r2, "symbol");
        final Flow r22 = this.f157105a.d(r2, r3, r4);
        return new GetCryptoSeasonalityUseCase$invoke$$inlined$map$1(r22);
    }
}
