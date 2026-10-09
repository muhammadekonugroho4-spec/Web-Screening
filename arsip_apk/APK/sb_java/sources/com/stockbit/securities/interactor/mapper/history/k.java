package com.stockbit.securities.interactor.mapper.history;

import com.stockbit.domain.model.securities.o;
import com.stockbit.dto.securities.RealizedMoveStockCashDTO;

/* loaded from: classes11.dex */
public final class k implements com.stockbit.repository.interactor.helper.b {
    public k() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((RealizedMoveStockCashDTO) r1);
    }

    public o b(RealizedMoveStockCashDTO r7) {
        String r1 = null;
        if (r7 == null) goto L7;
        RealizedMoveStockCashDTO.RealizedMoveStockCashDetailDTO r2 = r7.b();
        if (r2 == null) goto L7;
        String r22 = r2.a();
    L8:
        String r3 = "";
        if (r22 != null) goto L11;
        r22 = "";
    L11:
        if (r7 == null) goto L15;
        RealizedMoveStockCashDTO.RealizedMoveStockCashDetailDTO r4 = r7.b();
        if (r4 == null) goto L15;
        String r42 = r4.b();
    L16:
        if (r42 != null) goto L18;
        r42 = "";
    L18:
        if (r7 == null) goto L22;
        RealizedMoveStockCashDTO.RealizedMoveStockCashDetailDTO r5 = r7.a();
        if (r5 == null) goto L22;
        String r52 = r5.a();
    L23:
        if (r52 != null) goto L25;
        r52 = "";
    L25:
        if (r7 == null) goto L29;
        RealizedMoveStockCashDTO.RealizedMoveStockCashDetailDTO r72 = r7.a();
        if (r72 == null) goto L29;
        r1 = r72.b();
    L29:
        if (r1 == null) goto L33;
        r3 = r1;
    L33:
        return new o(r22, r42, r52, r3);
    L22:
        r52 = null;
    L15:
        r42 = null;
    L7:
        r22 = null;
        goto L8
    }
}
