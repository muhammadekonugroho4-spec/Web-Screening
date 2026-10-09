package com.stockbit.usecase.securities.param;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/securities/param/StockTradeableType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "NEGO", "RIGHT", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum StockTradeableType extends Enum<StockTradeableType> {
    public static final StockTradeableType NEGO = null;
    public static final StockTradeableType REGULAR = null;
    public static final StockTradeableType RIGHT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockTradeableType[] f161914a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161915b = null;

    static {
        REGULAR = new StockTradeableType("REGULAR", 0);
        NEGO = new StockTradeableType("NEGO", 1);
        RIGHT = new StockTradeableType("RIGHT", 2);
        StockTradeableType[] r02 = a();
        f161914a = r02;
        f161915b = kotlin.enums.b.a(r02);
    }

    StockTradeableType(String r1, int r2) {
    }

    public static final /* synthetic */ StockTradeableType[] a() {
        return new StockTradeableType[]{REGULAR, NEGO, RIGHT};
    }

    public static kotlin.enums.a getEntries() {
        return f161915b;
    }

    public static StockTradeableType valueOf(String r1) {
        return (StockTradeableType) Enum.valueOf(StockTradeableType.class, r1);
    }

    public static StockTradeableType[] values() {
        return (StockTradeableType[]) f161914a.clone();
    }
}
