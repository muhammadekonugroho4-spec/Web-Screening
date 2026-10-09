package com.stockbit.usecase.company.model.tradebook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/company/model/tradebook/TradeBookChartType;", "", "<init>", "(Ljava/lang/String;I)V", "BAR", "LINE", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TradeBookChartType extends Enum<TradeBookChartType> {
    public static final TradeBookChartType BAR = null;
    public static final TradeBookChartType LINE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradeBookChartType[] f156588a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156589b = null;

    static {
        BAR = new TradeBookChartType("BAR", 0);
        LINE = new TradeBookChartType("LINE", 1);
        TradeBookChartType[] r02 = a();
        f156588a = r02;
        f156589b = kotlin.enums.b.a(r02);
    }

    TradeBookChartType(String r1, int r2) {
    }

    public static final /* synthetic */ TradeBookChartType[] a() {
        return new TradeBookChartType[]{BAR, LINE};
    }

    public static kotlin.enums.a getEntries() {
        return f156589b;
    }

    public static TradeBookChartType valueOf(String r1) {
        return (TradeBookChartType) Enum.valueOf(TradeBookChartType.class, r1);
    }

    public static TradeBookChartType[] values() {
        return (TradeBookChartType[]) f156588a.clone();
    }
}
