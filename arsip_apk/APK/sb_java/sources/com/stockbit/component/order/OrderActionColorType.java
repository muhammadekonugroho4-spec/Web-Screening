package com.stockbit.component.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/component/order/OrderActionColorType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL", "DIVIDEND", "BONUS", "order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderActionColorType extends Enum<OrderActionColorType> {
    public static final OrderActionColorType BONUS = null;
    public static final OrderActionColorType BUY = null;
    public static final OrderActionColorType DIVIDEND = null;
    public static final OrderActionColorType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderActionColorType[] f72369a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f72370b = null;

    static {
        BUY = new OrderActionColorType("BUY", 0);
        SELL = new OrderActionColorType("SELL", 1);
        DIVIDEND = new OrderActionColorType("DIVIDEND", 2);
        BONUS = new OrderActionColorType("BONUS", 3);
        OrderActionColorType[] r02 = a();
        f72369a = r02;
        f72370b = kotlin.enums.b.a(r02);
    }

    OrderActionColorType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderActionColorType[] a() {
        return new OrderActionColorType[]{BUY, SELL, DIVIDEND, BONUS};
    }

    public static kotlin.enums.a getEntries() {
        return f72370b;
    }

    public static OrderActionColorType valueOf(String r1) {
        return (OrderActionColorType) Enum.valueOf(OrderActionColorType.class, r1);
    }

    public static OrderActionColorType[] values() {
        return (OrderActionColorType[]) f72369a.clone();
    }
}
