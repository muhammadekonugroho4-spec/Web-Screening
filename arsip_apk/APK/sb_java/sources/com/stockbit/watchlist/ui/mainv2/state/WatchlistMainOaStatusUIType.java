package com.stockbit.watchlist.ui.mainv2.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/state/WatchlistMainOaStatusUIType;", "", "<init>", "(Ljava/lang/String;I)V", "UNREGISTERED", "INCOMPLETE", "CS_PROGRESS", "KSEI_PROGRESS", "RDN_PROGRESS", "DOCUMENT_PROGRESS", "REJECTED", "COMPLETED", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistMainOaStatusUIType extends Enum<WatchlistMainOaStatusUIType> {
    public static final WatchlistMainOaStatusUIType COMPLETED = null;
    public static final WatchlistMainOaStatusUIType CS_PROGRESS = null;
    public static final WatchlistMainOaStatusUIType DOCUMENT_PROGRESS = null;
    public static final WatchlistMainOaStatusUIType INCOMPLETE = null;
    public static final WatchlistMainOaStatusUIType KSEI_PROGRESS = null;
    public static final WatchlistMainOaStatusUIType RDN_PROGRESS = null;
    public static final WatchlistMainOaStatusUIType REJECTED = null;
    public static final WatchlistMainOaStatusUIType UNREGISTERED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WatchlistMainOaStatusUIType[] f170879a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170880b = null;

    static {
        UNREGISTERED = new WatchlistMainOaStatusUIType("UNREGISTERED", 0);
        INCOMPLETE = new WatchlistMainOaStatusUIType("INCOMPLETE", 1);
        CS_PROGRESS = new WatchlistMainOaStatusUIType("CS_PROGRESS", 2);
        KSEI_PROGRESS = new WatchlistMainOaStatusUIType("KSEI_PROGRESS", 3);
        RDN_PROGRESS = new WatchlistMainOaStatusUIType("RDN_PROGRESS", 4);
        DOCUMENT_PROGRESS = new WatchlistMainOaStatusUIType("DOCUMENT_PROGRESS", 5);
        REJECTED = new WatchlistMainOaStatusUIType("REJECTED", 6);
        COMPLETED = new WatchlistMainOaStatusUIType("COMPLETED", 7);
        WatchlistMainOaStatusUIType[] r02 = a();
        f170879a = r02;
        f170880b = kotlin.enums.b.a(r02);
    }

    WatchlistMainOaStatusUIType(String r1, int r2) {
    }

    public static final /* synthetic */ WatchlistMainOaStatusUIType[] a() {
        return new WatchlistMainOaStatusUIType[]{UNREGISTERED, INCOMPLETE, CS_PROGRESS, KSEI_PROGRESS, RDN_PROGRESS, DOCUMENT_PROGRESS, REJECTED, COMPLETED};
    }

    public static kotlin.enums.a getEntries() {
        return f170880b;
    }

    public static WatchlistMainOaStatusUIType valueOf(String r1) {
        return (WatchlistMainOaStatusUIType) Enum.valueOf(WatchlistMainOaStatusUIType.class, r1);
    }

    public static WatchlistMainOaStatusUIType[] values() {
        return (WatchlistMainOaStatusUIType[]) f170879a.clone();
    }
}
