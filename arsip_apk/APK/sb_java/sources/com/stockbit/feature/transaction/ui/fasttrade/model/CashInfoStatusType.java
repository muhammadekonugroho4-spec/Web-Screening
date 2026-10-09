package com.stockbit.feature.transaction.ui.fasttrade.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/transaction/ui/fasttrade/model/CashInfoStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum CashInfoStatusType extends Enum<CashInfoStatusType> {
    public static final CashInfoStatusType ERROR = null;
    public static final CashInfoStatusType LOADING = null;
    public static final CashInfoStatusType SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CashInfoStatusType[] f114034a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114035b = null;

    static {
        SUCCESS = new CashInfoStatusType("SUCCESS", 0);
        ERROR = new CashInfoStatusType("ERROR", 1);
        LOADING = new CashInfoStatusType("LOADING", 2);
        CashInfoStatusType[] r02 = a();
        f114034a = r02;
        f114035b = kotlin.enums.b.a(r02);
    }

    CashInfoStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ CashInfoStatusType[] a() {
        return new CashInfoStatusType[]{SUCCESS, ERROR, LOADING};
    }

    public static kotlin.enums.a getEntries() {
        return f114035b;
    }

    public static CashInfoStatusType valueOf(String r1) {
        return (CashInfoStatusType) Enum.valueOf(CashInfoStatusType.class, r1);
    }

    public static CashInfoStatusType[] values() {
        return (CashInfoStatusType[]) f114034a.clone();
    }
}
