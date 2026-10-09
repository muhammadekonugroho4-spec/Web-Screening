package com.stockbit.watchlist.ui.mainv2.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/state/WatchlistMainFontSizeUIType;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "DEFAULT", "LARGE", "EXTRA_LARGE", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistMainFontSizeUIType extends Enum<WatchlistMainFontSizeUIType> {
    public static final WatchlistMainFontSizeUIType DEFAULT = null;
    public static final WatchlistMainFontSizeUIType EXTRA_LARGE = null;
    public static final WatchlistMainFontSizeUIType LARGE = null;
    public static final WatchlistMainFontSizeUIType SMALL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WatchlistMainFontSizeUIType[] f170871a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170872b = null;

    static {
        SMALL = new WatchlistMainFontSizeUIType("SMALL", 0);
        DEFAULT = new WatchlistMainFontSizeUIType("DEFAULT", 1);
        LARGE = new WatchlistMainFontSizeUIType("LARGE", 2);
        EXTRA_LARGE = new WatchlistMainFontSizeUIType("EXTRA_LARGE", 3);
        WatchlistMainFontSizeUIType[] r02 = a();
        f170871a = r02;
        f170872b = kotlin.enums.b.a(r02);
    }

    WatchlistMainFontSizeUIType(String r1, int r2) {
    }

    public static final /* synthetic */ WatchlistMainFontSizeUIType[] a() {
        return new WatchlistMainFontSizeUIType[]{SMALL, DEFAULT, LARGE, EXTRA_LARGE};
    }

    public static kotlin.enums.a getEntries() {
        return f170872b;
    }

    public static WatchlistMainFontSizeUIType valueOf(String r1) {
        return (WatchlistMainFontSizeUIType) Enum.valueOf(WatchlistMainFontSizeUIType.class, r1);
    }

    public static WatchlistMainFontSizeUIType[] values() {
        return (WatchlistMainFontSizeUIType[]) f170871a.clone();
    }
}
