package com.stockbit.tradingcommunity.contract;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/tradingcommunity/contract/TradingCommunityEntryPointSource;", "", "<init>", "(Ljava/lang/String;I)V", "SETTINGS", "WATCHLIST", "tradingcommunity-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum TradingCommunityEntryPointSource extends Enum<TradingCommunityEntryPointSource> {
    public static final TradingCommunityEntryPointSource SETTINGS = null;
    public static final TradingCommunityEntryPointSource WATCHLIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingCommunityEntryPointSource[] f148943a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f148944b = null;

    static {
        SETTINGS = new TradingCommunityEntryPointSource("SETTINGS", 0);
        WATCHLIST = new TradingCommunityEntryPointSource("WATCHLIST", 1);
        TradingCommunityEntryPointSource[] r02 = a();
        f148943a = r02;
        f148944b = b.a(r02);
    }

    TradingCommunityEntryPointSource(String r1, int r2) {
    }

    public static final /* synthetic */ TradingCommunityEntryPointSource[] a() {
        return new TradingCommunityEntryPointSource[]{SETTINGS, WATCHLIST};
    }

    public static kotlin.enums.a getEntries() {
        return f148944b;
    }

    public static TradingCommunityEntryPointSource valueOf(String r1) {
        return (TradingCommunityEntryPointSource) Enum.valueOf(TradingCommunityEntryPointSource.class, r1);
    }

    public static TradingCommunityEntryPointSource[] values() {
        return (TradingCommunityEntryPointSource[]) f148943a.clone();
    }
}
