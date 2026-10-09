package com.stockbit.feature.transaction.param;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/feature/transaction/param/OrderBalanceToggleType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TRADING_BALANCE", "TRADING_LIMIT", "DAY_TRADE", "MARGIN", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum OrderBalanceToggleType extends Enum<OrderBalanceToggleType> {
    public static final OrderBalanceToggleType DAY_TRADE = null;
    public static final OrderBalanceToggleType MARGIN = null;
    public static final OrderBalanceToggleType TRADING_BALANCE = null;
    public static final OrderBalanceToggleType TRADING_LIMIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBalanceToggleType[] f108418a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f108419b = null;
    private final String value;

    static {
        TRADING_BALANCE = new OrderBalanceToggleType("TRADING_BALANCE", 0, "Trading Balance");
        TRADING_LIMIT = new OrderBalanceToggleType("TRADING_LIMIT", 1, "Trading Limit");
        DAY_TRADE = new OrderBalanceToggleType("DAY_TRADE", 2, "Day Trade");
        MARGIN = new OrderBalanceToggleType("MARGIN", 3, "Margin");
        OrderBalanceToggleType[] r02 = a();
        f108418a = r02;
        f108419b = b.a(r02);
    }

    OrderBalanceToggleType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OrderBalanceToggleType[] a() {
        return new OrderBalanceToggleType[]{TRADING_BALANCE, TRADING_LIMIT, DAY_TRADE, MARGIN};
    }

    public static a getEntries() {
        return f108419b;
    }

    public static OrderBalanceToggleType valueOf(String r1) {
        return (OrderBalanceToggleType) Enum.valueOf(OrderBalanceToggleType.class, r1);
    }

    public static OrderBalanceToggleType[] values() {
        return (OrderBalanceToggleType[]) f108418a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
