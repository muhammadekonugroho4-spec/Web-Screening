package com.stockbit.component.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/component/order/OrderItemSecondaryIcon;", "", "<init>", "(Ljava/lang/String;I)V", "DAY_TRADE_FORCE_SELL", "MARGIN_FORCE_SELL", "SL", "TP", "LIT", "BO", "DT", "TS", "VTO", "AB", "order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderItemSecondaryIcon extends Enum<OrderItemSecondaryIcon> {
    public static final OrderItemSecondaryIcon AB = null;
    public static final OrderItemSecondaryIcon BO = null;
    public static final OrderItemSecondaryIcon DAY_TRADE_FORCE_SELL = null;
    public static final OrderItemSecondaryIcon DT = null;
    public static final OrderItemSecondaryIcon LIT = null;
    public static final OrderItemSecondaryIcon MARGIN_FORCE_SELL = null;
    public static final OrderItemSecondaryIcon SL = null;
    public static final OrderItemSecondaryIcon TP = null;
    public static final OrderItemSecondaryIcon TS = null;
    public static final OrderItemSecondaryIcon VTO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderItemSecondaryIcon[] f72371a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f72372b = null;

    static {
        DAY_TRADE_FORCE_SELL = new OrderItemSecondaryIcon("DAY_TRADE_FORCE_SELL", 0);
        MARGIN_FORCE_SELL = new OrderItemSecondaryIcon("MARGIN_FORCE_SELL", 1);
        SL = new OrderItemSecondaryIcon("SL", 2);
        TP = new OrderItemSecondaryIcon("TP", 3);
        LIT = new OrderItemSecondaryIcon("LIT", 4);
        BO = new OrderItemSecondaryIcon("BO", 5);
        DT = new OrderItemSecondaryIcon("DT", 6);
        TS = new OrderItemSecondaryIcon("TS", 7);
        VTO = new OrderItemSecondaryIcon("VTO", 8);
        AB = new OrderItemSecondaryIcon("AB", 9);
        OrderItemSecondaryIcon[] r02 = a();
        f72371a = r02;
        f72372b = kotlin.enums.b.a(r02);
    }

    OrderItemSecondaryIcon(String r1, int r2) {
    }

    public static final /* synthetic */ OrderItemSecondaryIcon[] a() {
        return new OrderItemSecondaryIcon[]{DAY_TRADE_FORCE_SELL, MARGIN_FORCE_SELL, SL, TP, LIT, BO, DT, TS, VTO, AB};
    }

    public static kotlin.enums.a getEntries() {
        return f72372b;
    }

    public static OrderItemSecondaryIcon valueOf(String r1) {
        return (OrderItemSecondaryIcon) Enum.valueOf(OrderItemSecondaryIcon.class, r1);
    }

    public static OrderItemSecondaryIcon[] values() {
        return (OrderItemSecondaryIcon[]) f72371a.clone();
    }
}
