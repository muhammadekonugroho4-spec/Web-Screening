package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/OrderListStatusType;", "", "value", "", "requestValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getRequestValue", "()I", "Unspecified", "Open", "PartiallyFilled", "Filled", "Cancelled", "Replaced", "Rejected", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderListStatusType extends Enum<OrderListStatusType> {
    public static final OrderListStatusType Cancelled = null;
    public static final OrderListStatusType Filled = null;
    public static final OrderListStatusType Open = null;
    public static final OrderListStatusType PartiallyFilled = null;
    public static final OrderListStatusType Rejected = null;
    public static final OrderListStatusType Replaced = null;
    public static final OrderListStatusType Unspecified = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderListStatusType[] f161186a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161187b = null;
    private final int requestValue;
    private final String value;

    static {
        Unspecified = new OrderListStatusType("Unspecified", 0, "STATUS_UNSPECIFIED", 0);
        Open = new OrderListStatusType("Open", 1, "STATUS_OPEN", 1);
        PartiallyFilled = new OrderListStatusType("PartiallyFilled", 2, "STATUS_PARTIALLY_FILLED", 2);
        Filled = new OrderListStatusType("Filled", 3, "STATUS_FILLED", 3);
        Cancelled = new OrderListStatusType("Cancelled", 4, "STATUS_CANCELLED", 4);
        Replaced = new OrderListStatusType("Replaced", 5, "STATUS_REPLACED", 5);
        Rejected = new OrderListStatusType("Rejected", 6, "STATUS_REJECTED", 6);
        OrderListStatusType[] r02 = a();
        f161186a = r02;
        f161187b = kotlin.enums.b.a(r02);
    }

    OrderListStatusType(String r1, int r2, String r3, int r4) {
        this.value = r3;
        this.requestValue = r4;
    }

    public static final /* synthetic */ OrderListStatusType[] a() {
        return new OrderListStatusType[]{Unspecified, Open, PartiallyFilled, Filled, Cancelled, Replaced, Rejected};
    }

    public static kotlin.enums.a getEntries() {
        return f161187b;
    }

    public static OrderListStatusType valueOf(String r1) {
        return (OrderListStatusType) Enum.valueOf(OrderListStatusType.class, r1);
    }

    public static OrderListStatusType[] values() {
        return (OrderListStatusType[]) f161186a.clone();
    }

    public final int getRequestValue() {
        return this.requestValue;
    }

    public final String getValue() {
        return this.value;
    }
}
