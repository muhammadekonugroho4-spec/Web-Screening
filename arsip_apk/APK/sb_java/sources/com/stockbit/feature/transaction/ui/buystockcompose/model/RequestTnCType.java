package com.stockbit.feature.transaction.ui.buystockcompose.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/transaction/ui/buystockcompose/model/RequestTnCType;", "", "<init>", "(Ljava/lang/String;I)V", "DAY_TRADE", "TRADING_LIMIT", "AUTO_ORDER", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum RequestTnCType extends Enum<RequestTnCType> {
    public static final RequestTnCType AUTO_ORDER = null;
    public static final RequestTnCType DAY_TRADE = null;
    public static final RequestTnCType TRADING_LIMIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RequestTnCType[] f111487a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f111488b = null;

    static {
        DAY_TRADE = new RequestTnCType("DAY_TRADE", 0);
        TRADING_LIMIT = new RequestTnCType("TRADING_LIMIT", 1);
        AUTO_ORDER = new RequestTnCType("AUTO_ORDER", 2);
        RequestTnCType[] r02 = a();
        f111487a = r02;
        f111488b = kotlin.enums.b.a(r02);
    }

    RequestTnCType(String r1, int r2) {
    }

    public static final /* synthetic */ RequestTnCType[] a() {
        return new RequestTnCType[]{DAY_TRADE, TRADING_LIMIT, AUTO_ORDER};
    }

    public static kotlin.enums.a getEntries() {
        return f111488b;
    }

    public static RequestTnCType valueOf(String r1) {
        return (RequestTnCType) Enum.valueOf(RequestTnCType.class, r1);
    }

    public static RequestTnCType[] values() {
        return (RequestTnCType[]) f111487a.clone();
    }
}
