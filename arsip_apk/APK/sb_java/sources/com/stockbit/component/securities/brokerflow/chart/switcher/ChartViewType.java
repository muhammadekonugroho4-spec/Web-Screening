package com.stockbit.component.securities.brokerflow.chart.switcher;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/securities/brokerflow/chart/switcher/ChartViewType;", "", "<init>", "(Ljava/lang/String;I)V", "CANDLE", "LINE", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ChartViewType extends Enum<ChartViewType> {
    public static final ChartViewType CANDLE = null;
    public static final ChartViewType LINE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChartViewType[] f75739a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75740b = null;

    static {
        CANDLE = new ChartViewType("CANDLE", 0);
        LINE = new ChartViewType("LINE", 1);
        ChartViewType[] r02 = a();
        f75739a = r02;
        f75740b = kotlin.enums.b.a(r02);
    }

    ChartViewType(String r1, int r2) {
    }

    public static final /* synthetic */ ChartViewType[] a() {
        return new ChartViewType[]{CANDLE, LINE};
    }

    public static kotlin.enums.a getEntries() {
        return f75740b;
    }

    public static ChartViewType valueOf(String r1) {
        return (ChartViewType) Enum.valueOf(ChartViewType.class, r1);
    }

    public static ChartViewType[] values() {
        return (ChartViewType[]) f75739a.clone();
    }
}
