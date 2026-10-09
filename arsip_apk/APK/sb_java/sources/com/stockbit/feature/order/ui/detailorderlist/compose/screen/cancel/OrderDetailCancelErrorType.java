package com.stockbit.feature.order.ui.detailorderlist.compose.screen.cancel;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/order/ui/detailorderlist/compose/screen/cancel/OrderDetailCancelErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "NON_CANCELLATION_PERIOD", "OTHERS", "order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum OrderDetailCancelErrorType extends Enum<OrderDetailCancelErrorType> {
    public static final OrderDetailCancelErrorType NON_CANCELLATION_PERIOD = null;
    public static final OrderDetailCancelErrorType OTHERS = null;
    public static final OrderDetailCancelErrorType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderDetailCancelErrorType[] f102599a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102600b = null;

    static {
        UNSPECIFIED = new OrderDetailCancelErrorType("UNSPECIFIED", 0);
        NON_CANCELLATION_PERIOD = new OrderDetailCancelErrorType("NON_CANCELLATION_PERIOD", 1);
        OTHERS = new OrderDetailCancelErrorType("OTHERS", 2);
        OrderDetailCancelErrorType[] r02 = a();
        f102599a = r02;
        f102600b = kotlin.enums.b.a(r02);
    }

    OrderDetailCancelErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderDetailCancelErrorType[] a() {
        return new OrderDetailCancelErrorType[]{UNSPECIFIED, NON_CANCELLATION_PERIOD, OTHERS};
    }

    public static kotlin.enums.a getEntries() {
        return f102600b;
    }

    public static OrderDetailCancelErrorType valueOf(String r1) {
        return (OrderDetailCancelErrorType) Enum.valueOf(OrderDetailCancelErrorType.class, r1);
    }

    public static OrderDetailCancelErrorType[] values() {
        return (OrderDetailCancelErrorType[]) f102599a.clone();
    }
}
