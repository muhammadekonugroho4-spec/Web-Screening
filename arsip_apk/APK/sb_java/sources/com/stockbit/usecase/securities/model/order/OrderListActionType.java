package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/OrderListActionType;", "", "value", "", "requestValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getRequestValue", "()I", "Unspecified", "Buy", "Sell", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderListActionType extends Enum<OrderListActionType> {
    public static final OrderListActionType Buy = null;
    public static final OrderListActionType Sell = null;
    public static final OrderListActionType Unspecified = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderListActionType[] f161182a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161183b = null;
    private final int requestValue;
    private final String value;

    static {
        Unspecified = new OrderListActionType("Unspecified", 0, "ACTION_TYPE_UNSPECIFIED", 0);
        Buy = new OrderListActionType("Buy", 1, "ACTION_TYPE_BUY", 1);
        Sell = new OrderListActionType("Sell", 2, "ACTION_TYPE_SELL", 2);
        OrderListActionType[] r02 = a();
        f161182a = r02;
        f161183b = kotlin.enums.b.a(r02);
    }

    OrderListActionType(String r1, int r2, String r3, int r4) {
        this.value = r3;
        this.requestValue = r4;
    }

    public static final /* synthetic */ OrderListActionType[] a() {
        return new OrderListActionType[]{Unspecified, Buy, Sell};
    }

    public static kotlin.enums.a getEntries() {
        return f161183b;
    }

    public static OrderListActionType valueOf(String r1) {
        return (OrderListActionType) Enum.valueOf(OrderListActionType.class, r1);
    }

    public static OrderListActionType[] values() {
        return (OrderListActionType[]) f161182a.clone();
    }

    public final int getRequestValue() {
        return this.requestValue;
    }

    public final String getValue() {
        return this.value;
    }
}
