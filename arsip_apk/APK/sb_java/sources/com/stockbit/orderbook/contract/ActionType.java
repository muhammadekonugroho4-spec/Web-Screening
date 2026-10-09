package com.stockbit.orderbook.contract;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/orderbook/contract/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Buy", "Sell", "None", "orderbook-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ActionType extends Enum<ActionType> {
    public static final ActionType Buy = null;
    public static final ActionType None = null;
    public static final ActionType Sell = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f124302a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f124303b = null;

    static {
        Buy = new ActionType("Buy", 0);
        Sell = new ActionType("Sell", 1);
        None = new ActionType("None", 2);
        ActionType[] r02 = a();
        f124302a = r02;
        f124303b = b.a(r02);
    }

    ActionType(String r1, int r2) {
    }

    public static final /* synthetic */ ActionType[] a() {
        return new ActionType[]{Buy, Sell, None};
    }

    public static kotlin.enums.a getEntries() {
        return f124303b;
    }

    public static ActionType valueOf(String r1) {
        return (ActionType) Enum.valueOf(ActionType.class, r1);
    }

    public static ActionType[] values() {
        return (ActionType[]) f124302a.clone();
    }
}
