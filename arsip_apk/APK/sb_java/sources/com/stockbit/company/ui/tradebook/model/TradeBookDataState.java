package com.stockbit.company.ui.tradebook.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/company/ui/tradebook/model/TradeBookDataState;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "EMPTY", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum TradeBookDataState extends Enum<TradeBookDataState> {
    public static final TradeBookDataState EMPTY = null;
    public static final TradeBookDataState ERROR = null;
    public static final TradeBookDataState LOADING = null;
    public static final TradeBookDataState SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradeBookDataState[] f68622a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f68623b = null;

    static {
        SUCCESS = new TradeBookDataState("SUCCESS", 0);
        ERROR = new TradeBookDataState("ERROR", 1);
        LOADING = new TradeBookDataState("LOADING", 2);
        EMPTY = new TradeBookDataState("EMPTY", 3);
        TradeBookDataState[] r02 = a();
        f68622a = r02;
        f68623b = kotlin.enums.b.a(r02);
    }

    TradeBookDataState(String r1, int r2) {
    }

    public static final /* synthetic */ TradeBookDataState[] a() {
        return new TradeBookDataState[]{SUCCESS, ERROR, LOADING, EMPTY};
    }

    public static kotlin.enums.a getEntries() {
        return f68623b;
    }

    public static TradeBookDataState valueOf(String r1) {
        return (TradeBookDataState) Enum.valueOf(TradeBookDataState.class, r1);
    }

    public static TradeBookDataState[] values() {
        return (TradeBookDataState[]) f68622a.clone();
    }
}
