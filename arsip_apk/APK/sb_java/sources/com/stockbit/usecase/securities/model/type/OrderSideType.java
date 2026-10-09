package com.stockbit.usecase.securities.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/OrderSideType;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_SIDE_BUY", "ORDER_SIDE_SELL", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderSideType extends Enum<OrderSideType> {
    public static final OrderSideType ORDER_SIDE_BUY = null;
    public static final OrderSideType ORDER_SIDE_SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderSideType[] f161905a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f161906b = null;

    static {
        ORDER_SIDE_BUY = new OrderSideType("ORDER_SIDE_BUY", 0);
        ORDER_SIDE_SELL = new OrderSideType("ORDER_SIDE_SELL", 1);
        OrderSideType[] r02 = a();
        f161905a = r02;
        f161906b = b.a(r02);
    }

    OrderSideType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderSideType[] a() {
        return new OrderSideType[]{ORDER_SIDE_BUY, ORDER_SIDE_SELL};
    }

    public static a getEntries() {
        return f161906b;
    }

    public static OrderSideType valueOf(String r1) {
        return (OrderSideType) Enum.valueOf(OrderSideType.class, r1);
    }

    public static OrderSideType[] values() {
        return (OrderSideType[]) f161905a.clone();
    }
}
