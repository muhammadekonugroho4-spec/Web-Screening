package com.stockbit.domain.model.mapper.trading;

import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import com.stockbit.domain.model.valueobject.trading.TradingStockbitToken;
import com.stockbit.model.entity.TradingStockbitTokenResponseData;

/* loaded from: classes8.dex */
public final class c implements com.stockbit.domain.model.mapper.base.a {
    public c() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradingStockbitTokenResponseData) r1);
    }

    public TradingStockbitToken b(TradingStockbitTokenResponseData r4) {
        String r1 = null;
        if (r4 == null) goto L5;
        String r2 = r4.c();
    L6:
        if (r4 == null) goto L8;
        r1 = r4.a();
    L8:
        if (r1 != null) goto L10;
        r1 = "";
    L10:
        if (r4 == null) goto L13;
        String r42 = r4.b();
        if (r42 == null) goto L13;
    L15:
        return new TradingStockbitToken(r2, r1, r42);
    L13:
        r42 = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A;
        goto L15
    L5:
        r2 = null;
        goto L6
    }
}
