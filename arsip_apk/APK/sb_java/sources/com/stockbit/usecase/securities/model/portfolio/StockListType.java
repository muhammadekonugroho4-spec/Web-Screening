package com.stockbit.usecase.securities.model.portfolio;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/securities/model/portfolio/StockListType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR_ONLY", "DAY_TRADE_ONLY", "BOTH", "MARGIN", "NONE", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum StockListType extends Enum<StockListType> {
    public static final StockListType BOTH = null;
    public static final StockListType DAY_TRADE_ONLY = null;
    public static final StockListType MARGIN = null;
    public static final StockListType NONE = null;
    public static final StockListType REGULAR_ONLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockListType[] f161713a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161714b = null;

    static {
        REGULAR_ONLY = new StockListType("REGULAR_ONLY", 0);
        DAY_TRADE_ONLY = new StockListType("DAY_TRADE_ONLY", 1);
        BOTH = new StockListType("BOTH", 2);
        MARGIN = new StockListType("MARGIN", 3);
        NONE = new StockListType("NONE", 4);
        StockListType[] r02 = a();
        f161713a = r02;
        f161714b = kotlin.enums.b.a(r02);
    }

    StockListType(String r1, int r2) {
    }

    public static final /* synthetic */ StockListType[] a() {
        return new StockListType[]{REGULAR_ONLY, DAY_TRADE_ONLY, BOTH, MARGIN, NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f161714b;
    }

    public static StockListType valueOf(String r1) {
        return (StockListType) Enum.valueOf(StockListType.class, r1);
    }

    public static StockListType[] values() {
        return (StockListType[]) f161713a.clone();
    }
}
