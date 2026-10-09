package com.stockbit.watchlist.ui.mainv2.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/state/WatchlistMainOaProgressUIType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ACCEPTED", "REJECTED", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistMainOaProgressUIType extends Enum<WatchlistMainOaProgressUIType> {
    public static final WatchlistMainOaProgressUIType ACCEPTED = null;
    public static final WatchlistMainOaProgressUIType DEFAULT = null;
    public static final WatchlistMainOaProgressUIType REJECTED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WatchlistMainOaProgressUIType[] f170877a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170878b = null;

    static {
        DEFAULT = new WatchlistMainOaProgressUIType("DEFAULT", 0);
        ACCEPTED = new WatchlistMainOaProgressUIType("ACCEPTED", 1);
        REJECTED = new WatchlistMainOaProgressUIType("REJECTED", 2);
        WatchlistMainOaProgressUIType[] r02 = a();
        f170877a = r02;
        f170878b = kotlin.enums.b.a(r02);
    }

    WatchlistMainOaProgressUIType(String r1, int r2) {
    }

    public static final /* synthetic */ WatchlistMainOaProgressUIType[] a() {
        return new WatchlistMainOaProgressUIType[]{DEFAULT, ACCEPTED, REJECTED};
    }

    public static kotlin.enums.a getEntries() {
        return f170878b;
    }

    public static WatchlistMainOaProgressUIType valueOf(String r1) {
        return (WatchlistMainOaProgressUIType) Enum.valueOf(WatchlistMainOaProgressUIType.class, r1);
    }

    public static WatchlistMainOaProgressUIType[] values() {
        return (WatchlistMainOaProgressUIType[]) f170877a.clone();
    }
}
