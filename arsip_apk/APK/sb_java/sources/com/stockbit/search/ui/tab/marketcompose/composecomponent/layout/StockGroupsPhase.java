package com.stockbit.search.ui.tab.marketcompose.composecomponent.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/search/ui/tab/marketcompose/composecomponent/layout/StockGroupsPhase;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "LOADING", "ERROR", "EMPTY", "CONTENT", "search_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
enum StockGroupsPhase extends Enum<StockGroupsPhase> {
    public static final StockGroupsPhase CONTENT = null;
    public static final StockGroupsPhase DISABLED = null;
    public static final StockGroupsPhase EMPTY = null;
    public static final StockGroupsPhase ERROR = null;
    public static final StockGroupsPhase LOADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupsPhase[] f135132a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135133b = null;

    static {
        DISABLED = new StockGroupsPhase("DISABLED", 0);
        LOADING = new StockGroupsPhase("LOADING", 1);
        ERROR = new StockGroupsPhase("ERROR", 2);
        EMPTY = new StockGroupsPhase("EMPTY", 3);
        CONTENT = new StockGroupsPhase("CONTENT", 4);
        StockGroupsPhase[] r02 = a();
        f135132a = r02;
        f135133b = kotlin.enums.b.a(r02);
    }

    StockGroupsPhase(String r1, int r2) {
    }

    public static final /* synthetic */ StockGroupsPhase[] a() {
        return new StockGroupsPhase[]{DISABLED, LOADING, ERROR, EMPTY, CONTENT};
    }

    public static kotlin.enums.a getEntries() {
        return f135133b;
    }

    public static StockGroupsPhase valueOf(String r1) {
        return (StockGroupsPhase) Enum.valueOf(StockGroupsPhase.class, r1);
    }

    public static StockGroupsPhase[] values() {
        return (StockGroupsPhase[]) f135132a.clone();
    }
}
