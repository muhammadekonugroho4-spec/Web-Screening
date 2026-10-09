package com.stockbit.usecase.cryptodetail.usecase;

import com.stockbit.usecase.cryptodetail.contract.repository.a;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes2.dex */
public final class ObserveCryptoChartUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final a f157111a;

    public ObserveCryptoChartUseCase(a r2) {
        p.l(r2, "repository");
        this.f157111a = r2;
    }

    public static /* synthetic */ Flow b(ObserveCryptoChartUseCase r1, String r2, String r3, String r4, String r5, String r6, boolean r7, int r8, Object r9) {
        if ((r8 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r8 & 16) == 0) goto L9;
        r6 = null;
    L9:
        if ((r8 & 32) == 0) goto L12;
        r7 = true;
    L12:
        return r1.a(r2, r3, r4, r5, r6, r7);
    }

    public final Flow a(String r9, String r10, String r11, String r12, String r13, boolean r14) {
        p.l(r9, "symbol");
        p.l(r10, "timeframe");
        p.l(r11, "chartType");
        final Flow r92 = this.f157111a.a(r9, r10, r11, r12, r13, r14);
        return new ObserveCryptoChartUseCase$invoke$$inlined$map$1(r92);
    }
}
