package com.stockbit.stockgroups.ui.groupdetail;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/stockgroups/ui/groupdetail/StockGroupDetailPhase;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "EMPTY", "CONTENT", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
enum StockGroupDetailPhase extends Enum<StockGroupDetailPhase> {
    public static final StockGroupDetailPhase CONTENT = null;
    public static final StockGroupDetailPhase EMPTY = null;
    public static final StockGroupDetailPhase ERROR = null;
    public static final StockGroupDetailPhase LOADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupDetailPhase[] f138948a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138949b = null;

    static {
        LOADING = new StockGroupDetailPhase("LOADING", 0);
        ERROR = new StockGroupDetailPhase("ERROR", 1);
        EMPTY = new StockGroupDetailPhase("EMPTY", 2);
        CONTENT = new StockGroupDetailPhase("CONTENT", 3);
        StockGroupDetailPhase[] r02 = a();
        f138948a = r02;
        f138949b = kotlin.enums.b.a(r02);
    }

    StockGroupDetailPhase(String r1, int r2) {
    }

    public static final /* synthetic */ StockGroupDetailPhase[] a() {
        return new StockGroupDetailPhase[]{LOADING, ERROR, EMPTY, CONTENT};
    }

    public static kotlin.enums.a getEntries() {
        return f138949b;
    }

    public static StockGroupDetailPhase valueOf(String r1) {
        return (StockGroupDetailPhase) Enum.valueOf(StockGroupDetailPhase.class, r1);
    }

    public static StockGroupDetailPhase[] values() {
        return (StockGroupDetailPhase[]) f138948a.clone();
    }
}
