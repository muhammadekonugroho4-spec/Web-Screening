package com.stockbit.component.foreignflow.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/foreignflow/model/ForeignFlowChartStyleType;", "", "<init>", "(Ljava/lang/String;I)V", "BAR", "CANDLE", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ForeignFlowChartStyleType extends Enum<ForeignFlowChartStyleType> {
    public static final ForeignFlowChartStyleType BAR = null;
    public static final ForeignFlowChartStyleType CANDLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowChartStyleType[] f71923a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f71924b = null;

    static {
        BAR = new ForeignFlowChartStyleType("BAR", 0);
        CANDLE = new ForeignFlowChartStyleType("CANDLE", 1);
        ForeignFlowChartStyleType[] r02 = a();
        f71923a = r02;
        f71924b = kotlin.enums.b.a(r02);
    }

    ForeignFlowChartStyleType(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowChartStyleType[] a() {
        return new ForeignFlowChartStyleType[]{BAR, CANDLE};
    }

    public static kotlin.enums.a getEntries() {
        return f71924b;
    }

    public static ForeignFlowChartStyleType valueOf(String r1) {
        return (ForeignFlowChartStyleType) Enum.valueOf(ForeignFlowChartStyleType.class, r1);
    }

    public static ForeignFlowChartStyleType[] values() {
        return (ForeignFlowChartStyleType[]) f71923a.clone();
    }
}
