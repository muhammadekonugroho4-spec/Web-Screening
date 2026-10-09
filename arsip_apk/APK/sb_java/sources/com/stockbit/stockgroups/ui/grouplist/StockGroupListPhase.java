package com.stockbit.stockgroups.ui.grouplist;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/stockgroups/ui/grouplist/StockGroupListPhase;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "EMPTY", "CONTENT", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
enum StockGroupListPhase extends Enum<StockGroupListPhase> {
    public static final StockGroupListPhase CONTENT = null;
    public static final StockGroupListPhase EMPTY = null;
    public static final StockGroupListPhase ERROR = null;
    public static final StockGroupListPhase LOADING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupListPhase[] f139082a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f139083b = null;

    static {
        LOADING = new StockGroupListPhase("LOADING", 0);
        ERROR = new StockGroupListPhase("ERROR", 1);
        EMPTY = new StockGroupListPhase("EMPTY", 2);
        CONTENT = new StockGroupListPhase("CONTENT", 3);
        StockGroupListPhase[] r02 = a();
        f139082a = r02;
        f139083b = kotlin.enums.b.a(r02);
    }

    StockGroupListPhase(String r1, int r2) {
    }

    public static final /* synthetic */ StockGroupListPhase[] a() {
        return new StockGroupListPhase[]{LOADING, ERROR, EMPTY, CONTENT};
    }

    public static kotlin.enums.a getEntries() {
        return f139083b;
    }

    public static StockGroupListPhase valueOf(String r1) {
        return (StockGroupListPhase) Enum.valueOf(StockGroupListPhase.class, r1);
    }

    public static StockGroupListPhase[] values() {
        return (StockGroupListPhase[]) f139082a.clone();
    }
}
