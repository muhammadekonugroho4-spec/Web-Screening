package com.stockbit.search.ui.tab.marketcompose.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/search/ui/tab/marketcompose/model/ExploreMarketRefreshType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "UNBOXING", "ACADEMY", "STOCK_GROUPS", "search_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ExploreMarketRefreshType extends Enum<ExploreMarketRefreshType> {
    public static final ExploreMarketRefreshType ACADEMY = null;
    public static final ExploreMarketRefreshType ALL = null;
    public static final ExploreMarketRefreshType STOCK_GROUPS = null;
    public static final ExploreMarketRefreshType UNBOXING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ExploreMarketRefreshType[] f135403a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135404b = null;

    static {
        ALL = new ExploreMarketRefreshType("ALL", 0);
        UNBOXING = new ExploreMarketRefreshType("UNBOXING", 1);
        ACADEMY = new ExploreMarketRefreshType("ACADEMY", 2);
        STOCK_GROUPS = new ExploreMarketRefreshType("STOCK_GROUPS", 3);
        ExploreMarketRefreshType[] r02 = a();
        f135403a = r02;
        f135404b = b.a(r02);
    }

    ExploreMarketRefreshType(String r1, int r2) {
    }

    public static final /* synthetic */ ExploreMarketRefreshType[] a() {
        return new ExploreMarketRefreshType[]{ALL, UNBOXING, ACADEMY, STOCK_GROUPS};
    }

    public static kotlin.enums.a getEntries() {
        return f135404b;
    }

    public static ExploreMarketRefreshType valueOf(String r1) {
        return (ExploreMarketRefreshType) Enum.valueOf(ExploreMarketRefreshType.class, r1);
    }

    public static ExploreMarketRefreshType[] values() {
        return (ExploreMarketRefreshType[]) f135403a.clone();
    }
}
