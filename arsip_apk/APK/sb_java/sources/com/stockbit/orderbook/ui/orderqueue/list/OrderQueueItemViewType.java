package com.stockbit.orderbook.ui.orderqueue.list;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/orderbook/ui/orderqueue/list/OrderQueueItemViewType;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "OrderNormal", "OrderAllPrice", "LoadMore", "ErrorLoadMore", "Shimmer", "Companion", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum OrderQueueItemViewType extends Enum<OrderQueueItemViewType> {
    public static final a Companion = null;
    public static final OrderQueueItemViewType ErrorLoadMore = null;
    public static final OrderQueueItemViewType LoadMore = null;
    public static final OrderQueueItemViewType OrderAllPrice = null;
    public static final OrderQueueItemViewType OrderNormal = null;
    public static final OrderQueueItemViewType Shimmer = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderQueueItemViewType[] f124665a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f124666b = null;
    private final int raw;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        OrderNormal = new OrderQueueItemViewType("OrderNormal", 0, 0);
        OrderAllPrice = new OrderQueueItemViewType("OrderAllPrice", 1, 1);
        LoadMore = new OrderQueueItemViewType("LoadMore", 2, 2);
        ErrorLoadMore = new OrderQueueItemViewType("ErrorLoadMore", 3, 3);
        Shimmer = new OrderQueueItemViewType("Shimmer", 4, 4);
        OrderQueueItemViewType[] r02 = a();
        f124665a = r02;
        f124666b = b.a(r02);
        Companion = new a(null);
    }

    OrderQueueItemViewType(String r1, int r2, int r3) {
        this.raw = r3;
    }

    public static final /* synthetic */ OrderQueueItemViewType[] a() {
        return new OrderQueueItemViewType[]{OrderNormal, OrderAllPrice, LoadMore, ErrorLoadMore, Shimmer};
    }

    public static kotlin.enums.a getEntries() {
        return f124666b;
    }

    public static OrderQueueItemViewType valueOf(String r1) {
        return (OrderQueueItemViewType) Enum.valueOf(OrderQueueItemViewType.class, r1);
    }

    public static OrderQueueItemViewType[] values() {
        return (OrderQueueItemViewType[]) f124665a.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
