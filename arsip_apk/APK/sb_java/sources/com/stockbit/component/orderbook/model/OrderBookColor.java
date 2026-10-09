package com.stockbit.component.orderbook.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/component/orderbook/model/OrderBookColor;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN", "RED", "PERIWINKLE", "PRIMARY", "SECONDARY", "ICON", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderBookColor extends Enum<OrderBookColor> {
    public static final OrderBookColor GREEN = null;
    public static final OrderBookColor ICON = null;
    public static final OrderBookColor PERIWINKLE = null;
    public static final OrderBookColor PRIMARY = null;
    public static final OrderBookColor RED = null;
    public static final OrderBookColor SECONDARY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookColor[] f73009a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f73010b = null;

    static {
        GREEN = new OrderBookColor("GREEN", 0);
        RED = new OrderBookColor("RED", 1);
        PERIWINKLE = new OrderBookColor("PERIWINKLE", 2);
        PRIMARY = new OrderBookColor("PRIMARY", 3);
        SECONDARY = new OrderBookColor("SECONDARY", 4);
        ICON = new OrderBookColor("ICON", 5);
        OrderBookColor[] r02 = a();
        f73009a = r02;
        f73010b = kotlin.enums.b.a(r02);
    }

    OrderBookColor(String r1, int r2) {
    }

    public static final /* synthetic */ OrderBookColor[] a() {
        return new OrderBookColor[]{GREEN, RED, PERIWINKLE, PRIMARY, SECONDARY, ICON};
    }

    public static kotlin.enums.a getEntries() {
        return f73010b;
    }

    public static OrderBookColor valueOf(String r1) {
        return (OrderBookColor) Enum.valueOf(OrderBookColor.class, r1);
    }

    public static OrderBookColor[] values() {
        return (OrderBookColor[]) f73009a.clone();
    }
}
