package com.stockbit.usecase.orderbook.model.orderqueue;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/orderbook/model/orderqueue/OrderSortDirectionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SORT_DIRECTION_ASC", "SORT_DIRECTION_DESC", "Companion", "usecase-orderbook"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderSortDirectionType extends Enum<OrderSortDirectionType> {
    public static final a Companion = null;
    public static final OrderSortDirectionType SORT_DIRECTION_ASC = null;
    public static final OrderSortDirectionType SORT_DIRECTION_DESC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderSortDirectionType[] f158876a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158877b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        SORT_DIRECTION_ASC = new OrderSortDirectionType("SORT_DIRECTION_ASC", 0, "SORT_DIRECTION_ASC");
        SORT_DIRECTION_DESC = new OrderSortDirectionType("SORT_DIRECTION_DESC", 1, "SORT_DIRECTION_DESC");
        OrderSortDirectionType[] r02 = a();
        f158876a = r02;
        f158877b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderSortDirectionType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OrderSortDirectionType[] a() {
        return new OrderSortDirectionType[]{SORT_DIRECTION_ASC, SORT_DIRECTION_DESC};
    }

    public static kotlin.enums.a getEntries() {
        return f158877b;
    }

    public static OrderSortDirectionType valueOf(String r1) {
        return (OrderSortDirectionType) Enum.valueOf(OrderSortDirectionType.class, r1);
    }

    public static OrderSortDirectionType[] values() {
        return (OrderSortDirectionType[]) f158876a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
