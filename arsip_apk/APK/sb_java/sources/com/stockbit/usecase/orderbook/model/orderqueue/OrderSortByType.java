package com.stockbit.usecase.orderbook.model.orderqueue;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/orderbook/model/orderqueue/OrderSortByType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SORT_BY_TIME", "SORT_BY_OPEN", "SORT_BY_LOT", "SORT_BY_QUEUE", "SORT_BY_PRICE", "SORT_BY_EXCHANGE_ORDER_NUMBER", "Companion", "usecase-orderbook"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderSortByType extends Enum<OrderSortByType> {
    public static final a Companion = null;
    public static final OrderSortByType SORT_BY_EXCHANGE_ORDER_NUMBER = null;
    public static final OrderSortByType SORT_BY_LOT = null;
    public static final OrderSortByType SORT_BY_OPEN = null;
    public static final OrderSortByType SORT_BY_PRICE = null;
    public static final OrderSortByType SORT_BY_QUEUE = null;
    public static final OrderSortByType SORT_BY_TIME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderSortByType[] f158874a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158875b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        SORT_BY_TIME = new OrderSortByType("SORT_BY_TIME", 0, "SORT_BY_TIME");
        SORT_BY_OPEN = new OrderSortByType("SORT_BY_OPEN", 1, "SORT_BY_OPEN");
        SORT_BY_LOT = new OrderSortByType("SORT_BY_LOT", 2, "SORT_BY_LOT");
        SORT_BY_QUEUE = new OrderSortByType("SORT_BY_QUEUE", 3, "SORT_BY_QUEUE");
        SORT_BY_PRICE = new OrderSortByType("SORT_BY_PRICE", 4, "SORT_BY_PRICE");
        SORT_BY_EXCHANGE_ORDER_NUMBER = new OrderSortByType("SORT_BY_EXCHANGE_ORDER_NUMBER", 5, "SORT_BY_EXCHANGE_ORDER_NUMBER");
        OrderSortByType[] r02 = a();
        f158874a = r02;
        f158875b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderSortByType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OrderSortByType[] a() {
        return new OrderSortByType[]{SORT_BY_TIME, SORT_BY_OPEN, SORT_BY_LOT, SORT_BY_QUEUE, SORT_BY_PRICE, SORT_BY_EXCHANGE_ORDER_NUMBER};
    }

    public static kotlin.enums.a getEntries() {
        return f158875b;
    }

    public static OrderSortByType valueOf(String r1) {
        return (OrderSortByType) Enum.valueOf(OrderSortByType.class, r1);
    }

    public static OrderSortByType[] values() {
        return (OrderSortByType[]) f158874a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
