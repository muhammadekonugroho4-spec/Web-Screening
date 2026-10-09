package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/OrderDetailNegoInfoType;", "", "<init>", "(Ljava/lang/String;I)V", "NEGO_INFO_UNDER_RISK_MANAGEMENT_REVIEW", "NEGO_INFO_UNDER_COUNTER_PARTY_REVIEW", "NEGO_INFO_UNSPECIFIED", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderDetailNegoInfoType extends Enum<OrderDetailNegoInfoType> {
    public static final OrderDetailNegoInfoType NEGO_INFO_UNDER_COUNTER_PARTY_REVIEW = null;
    public static final OrderDetailNegoInfoType NEGO_INFO_UNDER_RISK_MANAGEMENT_REVIEW = null;
    public static final OrderDetailNegoInfoType NEGO_INFO_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderDetailNegoInfoType[] f161176a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161177b = null;

    static {
        NEGO_INFO_UNDER_RISK_MANAGEMENT_REVIEW = new OrderDetailNegoInfoType("NEGO_INFO_UNDER_RISK_MANAGEMENT_REVIEW", 0);
        NEGO_INFO_UNDER_COUNTER_PARTY_REVIEW = new OrderDetailNegoInfoType("NEGO_INFO_UNDER_COUNTER_PARTY_REVIEW", 1);
        NEGO_INFO_UNSPECIFIED = new OrderDetailNegoInfoType("NEGO_INFO_UNSPECIFIED", 2);
        OrderDetailNegoInfoType[] r02 = a();
        f161176a = r02;
        f161177b = kotlin.enums.b.a(r02);
    }

    OrderDetailNegoInfoType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderDetailNegoInfoType[] a() {
        return new OrderDetailNegoInfoType[]{NEGO_INFO_UNDER_RISK_MANAGEMENT_REVIEW, NEGO_INFO_UNDER_COUNTER_PARTY_REVIEW, NEGO_INFO_UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f161177b;
    }

    public static OrderDetailNegoInfoType valueOf(String r1) {
        return (OrderDetailNegoInfoType) Enum.valueOf(OrderDetailNegoInfoType.class, r1);
    }

    public static OrderDetailNegoInfoType[] values() {
        return (OrderDetailNegoInfoType[]) f161176a.clone();
    }
}
