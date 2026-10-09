package com.stockbit.tradingcommunity.contract;

import com.stockbit.navigation.container.ModularNavParam;

/* loaded from: classes11.dex */
public interface a {
    static /* synthetic */ ModularNavParam a(a r02, TradingCommunityEntryPointSource r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = TradingCommunityEntryPointSource.SETTINGS;
    L7:
        return r02.getTradingCommunityMemberNavParam(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradingCommunityMemberNavParam");
    }

    static /* synthetic */ ModularNavParam b(a r02, String r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = null;
    L7:
        return r02.getTradingCommunityLeaderNavParam(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradingCommunityLeaderNavParam");
    }

    ModularNavParam getTradingCommunityExistingMemberTnCNavParam(TradingCommunityEntryPointSource r1, String r2, String r3, String r4, String r5);

    ModularNavParam getTradingCommunityLeaderNavParam(String r1);

    ModularNavParam getTradingCommunityMemberNavParam(TradingCommunityEntryPointSource r1);
}
