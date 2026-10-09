package com.stockbit.component.orderbook.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/component/orderbook/model/OrderBookViewType;", "", "count", "", "<init>", "(Ljava/lang/String;II)V", "getCount", "()I", "ALL", "PARTIAL", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderBookViewType extends Enum<OrderBookViewType> {
    public static final OrderBookViewType ALL = null;
    public static final OrderBookViewType PARTIAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookViewType[] f73013a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f73014b = null;
    private final int count;

    static {
        ALL = new OrderBookViewType("ALL", 0, 50);
        PARTIAL = new OrderBookViewType("PARTIAL", 1, 10);
        OrderBookViewType[] r02 = a();
        f73013a = r02;
        f73014b = kotlin.enums.b.a(r02);
    }

    OrderBookViewType(String r1, int r2, int r3) {
        this.count = r3;
    }

    public static final /* synthetic */ OrderBookViewType[] a() {
        return new OrderBookViewType[]{ALL, PARTIAL};
    }

    public static kotlin.enums.a getEntries() {
        return f73014b;
    }

    public static OrderBookViewType valueOf(String r1) {
        return (OrderBookViewType) Enum.valueOf(OrderBookViewType.class, r1);
    }

    public static OrderBookViewType[] values() {
        return (OrderBookViewType[]) f73013a.clone();
    }

    public final int getCount() {
        return this.count;
    }
}
