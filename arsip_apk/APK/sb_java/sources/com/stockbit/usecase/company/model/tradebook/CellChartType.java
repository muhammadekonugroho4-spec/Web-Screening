package com.stockbit.usecase.company.model.tradebook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/company/model/tradebook/CellChartType;", "", "<init>", "(Ljava/lang/String;I)V", "MORE_BUY", "MORE_SELL", "NEUTRAL", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CellChartType extends Enum<CellChartType> {
    public static final CellChartType MORE_BUY = null;
    public static final CellChartType MORE_SELL = null;
    public static final CellChartType NEUTRAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CellChartType[] f156582a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156583b = null;

    static {
        MORE_BUY = new CellChartType("MORE_BUY", 0);
        MORE_SELL = new CellChartType("MORE_SELL", 1);
        NEUTRAL = new CellChartType("NEUTRAL", 2);
        CellChartType[] r02 = a();
        f156582a = r02;
        f156583b = kotlin.enums.b.a(r02);
    }

    CellChartType(String r1, int r2) {
    }

    public static final /* synthetic */ CellChartType[] a() {
        return new CellChartType[]{MORE_BUY, MORE_SELL, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f156583b;
    }

    public static CellChartType valueOf(String r1) {
        return (CellChartType) Enum.valueOf(CellChartType.class, r1);
    }

    public static CellChartType[] values() {
        return (CellChartType[]) f156582a.clone();
    }
}
