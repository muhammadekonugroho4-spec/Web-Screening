package com.stockbit.component.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/component/order/OrderStatusStyle;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN", "RED", "NEUTRAL", "GREY", "order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderStatusStyle extends Enum<OrderStatusStyle> {
    public static final OrderStatusStyle GREEN = null;
    public static final OrderStatusStyle GREY = null;
    public static final OrderStatusStyle NEUTRAL = null;
    public static final OrderStatusStyle RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderStatusStyle[] f72373a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f72374b = null;

    static {
        GREEN = new OrderStatusStyle("GREEN", 0);
        RED = new OrderStatusStyle("RED", 1);
        NEUTRAL = new OrderStatusStyle("NEUTRAL", 2);
        GREY = new OrderStatusStyle("GREY", 3);
        OrderStatusStyle[] r02 = a();
        f72373a = r02;
        f72374b = kotlin.enums.b.a(r02);
    }

    OrderStatusStyle(String r1, int r2) {
    }

    public static final /* synthetic */ OrderStatusStyle[] a() {
        return new OrderStatusStyle[]{GREEN, RED, NEUTRAL, GREY};
    }

    public static kotlin.enums.a getEntries() {
        return f72374b;
    }

    public static OrderStatusStyle valueOf(String r1) {
        return (OrderStatusStyle) Enum.valueOf(OrderStatusStyle.class, r1);
    }

    public static OrderStatusStyle[] values() {
        return (OrderStatusStyle[]) f72373a.clone();
    }
}
