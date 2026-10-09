package com.stockbit.stockgroups.ui.components.table;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/stockgroups/ui/components/table/StockGroupPriceColorChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NORMAL", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StockGroupPriceColorChangeType extends Enum<StockGroupPriceColorChangeType> {
    public static final StockGroupPriceColorChangeType DOWN = null;
    public static final StockGroupPriceColorChangeType NORMAL = null;
    public static final StockGroupPriceColorChangeType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupPriceColorChangeType[] f138915a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138916b = null;

    static {
        UP = new StockGroupPriceColorChangeType("UP", 0);
        DOWN = new StockGroupPriceColorChangeType("DOWN", 1);
        NORMAL = new StockGroupPriceColorChangeType("NORMAL", 2);
        StockGroupPriceColorChangeType[] r02 = a();
        f138915a = r02;
        f138916b = kotlin.enums.b.a(r02);
    }

    StockGroupPriceColorChangeType(String r1, int r2) {
    }

    public static final /* synthetic */ StockGroupPriceColorChangeType[] a() {
        return new StockGroupPriceColorChangeType[]{UP, DOWN, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f138916b;
    }

    public static StockGroupPriceColorChangeType valueOf(String r1) {
        return (StockGroupPriceColorChangeType) Enum.valueOf(StockGroupPriceColorChangeType.class, r1);
    }

    public static StockGroupPriceColorChangeType[] values() {
        return (StockGroupPriceColorChangeType[]) f138915a.clone();
    }
}
