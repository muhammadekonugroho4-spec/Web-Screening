package com.stockbit.feature.transaction.contract.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transaction/contract/model/type/OrderNegoScreenType;", "", "<init>", "(Ljava/lang/String;I)V", "Buy", "Sell", "transaction-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum OrderNegoScreenType extends Enum<OrderNegoScreenType> {
    public static final OrderNegoScreenType Buy = null;
    public static final OrderNegoScreenType Sell = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderNegoScreenType[] f107444a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f107445b = null;

    static {
        Buy = new OrderNegoScreenType("Buy", 0);
        Sell = new OrderNegoScreenType("Sell", 1);
        OrderNegoScreenType[] r02 = a();
        f107444a = r02;
        f107445b = b.a(r02);
    }

    OrderNegoScreenType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderNegoScreenType[] a() {
        return new OrderNegoScreenType[]{Buy, Sell};
    }

    public static a getEntries() {
        return f107445b;
    }

    public static OrderNegoScreenType valueOf(String r1) {
        return (OrderNegoScreenType) Enum.valueOf(OrderNegoScreenType.class, r1);
    }

    public static OrderNegoScreenType[] values() {
        return (OrderNegoScreenType[]) f107444a.clone();
    }
}
