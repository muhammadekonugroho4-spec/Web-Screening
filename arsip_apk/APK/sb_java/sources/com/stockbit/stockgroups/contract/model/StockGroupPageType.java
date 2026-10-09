package com.stockbit.stockgroups.contract.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/stockgroups/contract/model/StockGroupPageType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "GROUP_LIST", "GROUP_DETAIL", "stock-groups-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StockGroupPageType extends Enum<StockGroupPageType> {
    public static final StockGroupPageType DEFAULT = null;
    public static final StockGroupPageType GROUP_DETAIL = null;
    public static final StockGroupPageType GROUP_LIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupPageType[] f138889a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138890b = null;

    static {
        DEFAULT = new StockGroupPageType("DEFAULT", 0);
        GROUP_LIST = new StockGroupPageType("GROUP_LIST", 1);
        GROUP_DETAIL = new StockGroupPageType("GROUP_DETAIL", 2);
        StockGroupPageType[] r02 = a();
        f138889a = r02;
        f138890b = b.a(r02);
    }

    StockGroupPageType(String r1, int r2) {
    }

    public static final /* synthetic */ StockGroupPageType[] a() {
        return new StockGroupPageType[]{DEFAULT, GROUP_LIST, GROUP_DETAIL};
    }

    public static kotlin.enums.a getEntries() {
        return f138890b;
    }

    public static StockGroupPageType valueOf(String r1) {
        return (StockGroupPageType) Enum.valueOf(StockGroupPageType.class, r1);
    }

    public static StockGroupPageType[] values() {
        return (StockGroupPageType[]) f138889a.clone();
    }
}
