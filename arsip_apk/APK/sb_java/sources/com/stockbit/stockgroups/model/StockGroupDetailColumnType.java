package com.stockbit.stockgroups.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/stockgroups/model/StockGroupDetailColumnType;", "", "headerTitle", "", "<init>", "(Ljava/lang/String;II)V", "getHeaderTitle", "()I", "SYMBOL", "PRICE", "VALUE", "VOLUME", "FREQ", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StockGroupDetailColumnType extends Enum<StockGroupDetailColumnType> {
    public static final StockGroupDetailColumnType FREQ = null;
    public static final StockGroupDetailColumnType PRICE = null;
    public static final StockGroupDetailColumnType SYMBOL = null;
    public static final StockGroupDetailColumnType VALUE = null;
    public static final StockGroupDetailColumnType VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockGroupDetailColumnType[] f138899a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f138900b = null;
    private final int headerTitle;

    static {
        SYMBOL = new StockGroupDetailColumnType("SYMBOL", 0, com.stockbit.component.stockgroups.b.f77300k);
        PRICE = new StockGroupDetailColumnType("PRICE", 1, com.stockbit.component.stockgroups.b.f77295f);
        VALUE = new StockGroupDetailColumnType("VALUE", 2, com.stockbit.component.stockgroups.b.f77296g);
        VOLUME = new StockGroupDetailColumnType("VOLUME", 3, com.stockbit.component.stockgroups.b.f77297h);
        FREQ = new StockGroupDetailColumnType("FREQ", 4, com.stockbit.component.stockgroups.b.d);
        StockGroupDetailColumnType[] r02 = a();
        f138899a = r02;
        f138900b = kotlin.enums.b.a(r02);
    }

    StockGroupDetailColumnType(String r1, int r2, int r3) {
        this.headerTitle = r3;
    }

    public static final /* synthetic */ StockGroupDetailColumnType[] a() {
        return new StockGroupDetailColumnType[]{SYMBOL, PRICE, VALUE, VOLUME, FREQ};
    }

    public static kotlin.enums.a getEntries() {
        return f138900b;
    }

    public static StockGroupDetailColumnType valueOf(String r1) {
        return (StockGroupDetailColumnType) Enum.valueOf(StockGroupDetailColumnType.class, r1);
    }

    public static StockGroupDetailColumnType[] values() {
        return (StockGroupDetailColumnType[]) f138899a.clone();
    }

    public final int getHeaderTitle() {
        return this.headerTitle;
    }
}
