package com.stockbit.feature.history.contract;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/history/contract/DividendDetailType;", "", "<init>", "(Ljava/lang/String;I)V", "CASH", "STOCK_DIVIDEND", "BONUS_STOCK", "history-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum DividendDetailType extends Enum<DividendDetailType> {
    public static final DividendDetailType BONUS_STOCK = null;
    public static final DividendDetailType CASH = null;
    public static final DividendDetailType STOCK_DIVIDEND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DividendDetailType[] f96664a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f96665b = null;

    static {
        CASH = new DividendDetailType("CASH", 0);
        STOCK_DIVIDEND = new DividendDetailType("STOCK_DIVIDEND", 1);
        BONUS_STOCK = new DividendDetailType("BONUS_STOCK", 2);
        DividendDetailType[] r02 = a();
        f96664a = r02;
        f96665b = kotlin.enums.b.a(r02);
    }

    DividendDetailType(String r1, int r2) {
    }

    public static final /* synthetic */ DividendDetailType[] a() {
        return new DividendDetailType[]{CASH, STOCK_DIVIDEND, BONUS_STOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f96665b;
    }

    public static DividendDetailType valueOf(String r1) {
        return (DividendDetailType) Enum.valueOf(DividendDetailType.class, r1);
    }

    public static DividendDetailType[] values() {
        return (DividendDetailType[]) f96664a.clone();
    }
}
