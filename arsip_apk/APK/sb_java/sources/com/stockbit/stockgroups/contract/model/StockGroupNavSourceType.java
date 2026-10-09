package com.stockbit.stockgroups.contract.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/stockgroups/contract/model/StockGroupNavSourceType;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH_FEED", "STOCK_GROUP_LIST", "stock-groups-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StockGroupNavSourceType extends Enum<StockGroupNavSourceType> {
    public static final StockGroupNavSourceType SEARCH_FEED = null;
    public static final StockGroupNavSourceType STOCK_GROUP_LIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupNavSourceType[] f138887a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138888b = null;

    static {
        SEARCH_FEED = new StockGroupNavSourceType("SEARCH_FEED", 0);
        STOCK_GROUP_LIST = new StockGroupNavSourceType("STOCK_GROUP_LIST", 1);
        StockGroupNavSourceType[] r02 = a();
        f138887a = r02;
        f138888b = b.a(r02);
    }

    StockGroupNavSourceType(String r1, int r2) {
    }

    public static final /* synthetic */ StockGroupNavSourceType[] a() {
        return new StockGroupNavSourceType[]{SEARCH_FEED, STOCK_GROUP_LIST};
    }

    public static kotlin.enums.a getEntries() {
        return f138888b;
    }

    public static StockGroupNavSourceType valueOf(String r1) {
        return (StockGroupNavSourceType) Enum.valueOf(StockGroupNavSourceType.class, r1);
    }

    public static StockGroupNavSourceType[] values() {
        return (StockGroupNavSourceType[]) f138887a.clone();
    }
}
