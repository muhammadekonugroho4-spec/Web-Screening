package com.stockbit.tradingcommunity.contract;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/tradingcommunity/contract/TradingCommunityDestinationFragment;", "", "<init>", "(Ljava/lang/String;I)V", "MEMBER", "LEADER_DASHBOARD", "tradingcommunity-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum TradingCommunityDestinationFragment extends Enum<TradingCommunityDestinationFragment> {
    public static final TradingCommunityDestinationFragment LEADER_DASHBOARD = null;
    public static final TradingCommunityDestinationFragment MEMBER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingCommunityDestinationFragment[] f148941a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f148942b = null;

    static {
        MEMBER = new TradingCommunityDestinationFragment("MEMBER", 0);
        LEADER_DASHBOARD = new TradingCommunityDestinationFragment("LEADER_DASHBOARD", 1);
        TradingCommunityDestinationFragment[] r02 = a();
        f148941a = r02;
        f148942b = b.a(r02);
    }

    TradingCommunityDestinationFragment(String r1, int r2) {
    }

    public static final /* synthetic */ TradingCommunityDestinationFragment[] a() {
        return new TradingCommunityDestinationFragment[]{MEMBER, LEADER_DASHBOARD};
    }

    public static kotlin.enums.a getEntries() {
        return f148942b;
    }

    public static TradingCommunityDestinationFragment valueOf(String r1) {
        return (TradingCommunityDestinationFragment) Enum.valueOf(TradingCommunityDestinationFragment.class, r1);
    }

    public static TradingCommunityDestinationFragment[] values() {
        return (TradingCommunityDestinationFragment[]) f148941a.clone();
    }
}
