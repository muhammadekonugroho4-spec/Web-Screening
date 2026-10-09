package com.stockbit.feature.transaction.ui.fasttrade.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/transaction/ui/fasttrade/model/TradingLimitTnCSourceFromType;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_METHOD", "MAX_LIMIT_SECTION_LOT", "MAX_LIMIT_CALCULATOR", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TradingLimitTnCSourceFromType extends Enum<TradingLimitTnCSourceFromType> {
    public static final TradingLimitTnCSourceFromType MAX_LIMIT_CALCULATOR = null;
    public static final TradingLimitTnCSourceFromType MAX_LIMIT_SECTION_LOT = null;
    public static final TradingLimitTnCSourceFromType PAYMENT_METHOD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingLimitTnCSourceFromType[] f114042a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114043b = null;

    static {
        PAYMENT_METHOD = new TradingLimitTnCSourceFromType("PAYMENT_METHOD", 0);
        MAX_LIMIT_SECTION_LOT = new TradingLimitTnCSourceFromType("MAX_LIMIT_SECTION_LOT", 1);
        MAX_LIMIT_CALCULATOR = new TradingLimitTnCSourceFromType("MAX_LIMIT_CALCULATOR", 2);
        TradingLimitTnCSourceFromType[] r02 = a();
        f114042a = r02;
        f114043b = kotlin.enums.b.a(r02);
    }

    TradingLimitTnCSourceFromType(String r1, int r2) {
    }

    public static final /* synthetic */ TradingLimitTnCSourceFromType[] a() {
        return new TradingLimitTnCSourceFromType[]{PAYMENT_METHOD, MAX_LIMIT_SECTION_LOT, MAX_LIMIT_CALCULATOR};
    }

    public static kotlin.enums.a getEntries() {
        return f114043b;
    }

    public static TradingLimitTnCSourceFromType valueOf(String r1) {
        return (TradingLimitTnCSourceFromType) Enum.valueOf(TradingLimitTnCSourceFromType.class, r1);
    }

    public static TradingLimitTnCSourceFromType[] values() {
        return (TradingLimitTnCSourceFromType[]) f114042a.clone();
    }
}
