package com.stockbit.watchlist.ui.mainv2.state;

import kotlin.Metadata;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/state/WatchlistMainStatusBadgeUIType;", "", "<init>", "(Ljava/lang/String;I)V", DebugCoroutineInfoImplKt.SUSPENDED, "DELISTED", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistMainStatusBadgeUIType extends Enum<WatchlistMainStatusBadgeUIType> {
    public static final WatchlistMainStatusBadgeUIType DELISTED = null;
    public static final WatchlistMainStatusBadgeUIType SUSPENDED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WatchlistMainStatusBadgeUIType[] f170881a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170882b = null;

    static {
        SUSPENDED = new WatchlistMainStatusBadgeUIType(DebugCoroutineInfoImplKt.SUSPENDED, 0);
        DELISTED = new WatchlistMainStatusBadgeUIType("DELISTED", 1);
        WatchlistMainStatusBadgeUIType[] r02 = a();
        f170881a = r02;
        f170882b = kotlin.enums.b.a(r02);
    }

    WatchlistMainStatusBadgeUIType(String r1, int r2) {
    }

    public static final /* synthetic */ WatchlistMainStatusBadgeUIType[] a() {
        return new WatchlistMainStatusBadgeUIType[]{SUSPENDED, DELISTED};
    }

    public static kotlin.enums.a getEntries() {
        return f170882b;
    }

    public static WatchlistMainStatusBadgeUIType valueOf(String r1) {
        return (WatchlistMainStatusBadgeUIType) Enum.valueOf(WatchlistMainStatusBadgeUIType.class, r1);
    }

    public static WatchlistMainStatusBadgeUIType[] values() {
        return (WatchlistMainStatusBadgeUIType[]) f170881a.clone();
    }
}
