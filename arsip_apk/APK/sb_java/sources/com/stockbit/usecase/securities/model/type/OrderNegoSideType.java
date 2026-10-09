package com.stockbit.usecase.securities.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/OrderNegoSideType;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_SIDE_UNSPECIFIED", "ORDER_SIDE_BUY", "ORDER_SIDE_SELL", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderNegoSideType extends Enum<OrderNegoSideType> {
    public static final OrderNegoSideType ORDER_SIDE_BUY = null;
    public static final OrderNegoSideType ORDER_SIDE_SELL = null;
    public static final OrderNegoSideType ORDER_SIDE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderNegoSideType[] f161901a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f161902b = null;

    static {
        ORDER_SIDE_UNSPECIFIED = new OrderNegoSideType("ORDER_SIDE_UNSPECIFIED", 0);
        ORDER_SIDE_BUY = new OrderNegoSideType("ORDER_SIDE_BUY", 1);
        ORDER_SIDE_SELL = new OrderNegoSideType("ORDER_SIDE_SELL", 2);
        OrderNegoSideType[] r02 = a();
        f161901a = r02;
        f161902b = b.a(r02);
    }

    OrderNegoSideType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderNegoSideType[] a() {
        return new OrderNegoSideType[]{ORDER_SIDE_UNSPECIFIED, ORDER_SIDE_BUY, ORDER_SIDE_SELL};
    }

    public static a getEntries() {
        return f161902b;
    }

    public static OrderNegoSideType valueOf(String r1) {
        return (OrderNegoSideType) Enum.valueOf(OrderNegoSideType.class, r1);
    }

    public static OrderNegoSideType[] values() {
        return (OrderNegoSideType[]) f161901a.clone();
    }
}
