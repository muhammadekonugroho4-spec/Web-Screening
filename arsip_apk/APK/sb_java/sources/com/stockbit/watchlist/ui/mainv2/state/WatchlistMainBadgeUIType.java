package com.stockbit.watchlist.ui.mainv2.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/state/WatchlistMainBadgeUIType;", "", "<init>", "(Ljava/lang/String;I)V", "PORTFOLIO", "NOTASI_KHUSUS", "CORP_ACTION", "DAY_TRADE", "TRADING_LIMIT", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistMainBadgeUIType extends Enum<WatchlistMainBadgeUIType> {
    public static final WatchlistMainBadgeUIType CORP_ACTION = null;
    public static final WatchlistMainBadgeUIType DAY_TRADE = null;
    public static final WatchlistMainBadgeUIType NOTASI_KHUSUS = null;
    public static final WatchlistMainBadgeUIType PORTFOLIO = null;
    public static final WatchlistMainBadgeUIType TRADING_LIMIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WatchlistMainBadgeUIType[] f170869a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170870b = null;

    static {
        PORTFOLIO = new WatchlistMainBadgeUIType("PORTFOLIO", 0);
        NOTASI_KHUSUS = new WatchlistMainBadgeUIType("NOTASI_KHUSUS", 1);
        CORP_ACTION = new WatchlistMainBadgeUIType("CORP_ACTION", 2);
        DAY_TRADE = new WatchlistMainBadgeUIType("DAY_TRADE", 3);
        TRADING_LIMIT = new WatchlistMainBadgeUIType("TRADING_LIMIT", 4);
        WatchlistMainBadgeUIType[] r02 = a();
        f170869a = r02;
        f170870b = kotlin.enums.b.a(r02);
    }

    WatchlistMainBadgeUIType(String r1, int r2) {
    }

    public static final /* synthetic */ WatchlistMainBadgeUIType[] a() {
        return new WatchlistMainBadgeUIType[]{PORTFOLIO, NOTASI_KHUSUS, CORP_ACTION, DAY_TRADE, TRADING_LIMIT};
    }

    public static kotlin.enums.a getEntries() {
        return f170870b;
    }

    public static WatchlistMainBadgeUIType valueOf(String r1) {
        return (WatchlistMainBadgeUIType) Enum.valueOf(WatchlistMainBadgeUIType.class, r1);
    }

    public static WatchlistMainBadgeUIType[] values() {
        return (WatchlistMainBadgeUIType[]) f170869a.clone();
    }
}
