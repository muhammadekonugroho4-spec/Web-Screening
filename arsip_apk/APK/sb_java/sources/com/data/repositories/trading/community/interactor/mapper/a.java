package com.data.repositories.trading.community.interactor.mapper;

import com.stockbit.dto.tradingcommunity.TradingCommunityAcceptTnCExistingMemberDTO;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements com.stockbit.repository.interactor.helper.b {
    public a() {
    }

    @Override // com.stockbit.repository.interactor.helper.b
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((TradingCommunityAcceptTnCExistingMemberDTO) r1);
    }

    public String b(TradingCommunityAcceptTnCExistingMemberDTO r2) {
        p.l(r2, "dataModel");
        String r22 = r2.a();
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }
}
