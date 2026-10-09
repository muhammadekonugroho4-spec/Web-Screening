package com.stockbit.usecase.company.model.orderbook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/company/model/orderbook/OrderBookColorType;", "", "<init>", "(Ljava/lang/String;I)V", "RED", "GREEN", "DEFAULT", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderBookColorType extends Enum<OrderBookColorType> {
    public static final OrderBookColorType DEFAULT = null;
    public static final OrderBookColorType GREEN = null;
    public static final OrderBookColorType RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookColorType[] f156344a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156345b = null;

    static {
        RED = new OrderBookColorType("RED", 0);
        GREEN = new OrderBookColorType("GREEN", 1);
        DEFAULT = new OrderBookColorType("DEFAULT", 2);
        OrderBookColorType[] r02 = a();
        f156344a = r02;
        f156345b = kotlin.enums.b.a(r02);
    }

    OrderBookColorType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderBookColorType[] a() {
        return new OrderBookColorType[]{RED, GREEN, DEFAULT};
    }

    public static kotlin.enums.a getEntries() {
        return f156345b;
    }

    public static OrderBookColorType valueOf(String r1) {
        return (OrderBookColorType) Enum.valueOf(OrderBookColorType.class, r1);
    }

    public static OrderBookColorType[] values() {
        return (OrderBookColorType[]) f156344a.clone();
    }
}
