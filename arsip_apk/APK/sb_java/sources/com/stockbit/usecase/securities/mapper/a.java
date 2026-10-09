package com.stockbit.usecase.securities.mapper;

import com.stockbit.usecase.securities.model.SellSmartOrderType;

/* loaded from: classes2.dex */
public abstract class a {
    public static final SellSmartOrderType a(String r1) {
        if (kotlin.jvm.internal.p.g(r1, "PLATFORM_ORDER_TYPE_LIMIT_DAY") == false) goto L7;
        return SellSmartOrderType.ORDER_TYPE_LIMIT;
    L7:
        if (kotlin.jvm.internal.p.g(r1, "PLATFORM_ORDER_TYPE_MARKET_FAK") == false) goto L11;
        return SellSmartOrderType.ORDER_TYPE_MARKET;
    L11:
        return SellSmartOrderType.ORDER_TYPE_UNSPECIFIED;
    }
}
