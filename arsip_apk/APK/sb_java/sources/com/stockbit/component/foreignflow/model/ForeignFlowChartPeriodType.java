package com.stockbit.component.foreignflow.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/component/foreignflow/model/ForeignFlowChartPeriodType;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_WEEK", "ONE_MONTH", "THREE_MONTHS", "YEAR_TO_DATE", "ONE_YEAR", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ForeignFlowChartPeriodType extends Enum<ForeignFlowChartPeriodType> {
    public static final ForeignFlowChartPeriodType ONE_MONTH = null;
    public static final ForeignFlowChartPeriodType ONE_WEEK = null;
    public static final ForeignFlowChartPeriodType ONE_YEAR = null;
    public static final ForeignFlowChartPeriodType THREE_MONTHS = null;
    public static final ForeignFlowChartPeriodType YEAR_TO_DATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowChartPeriodType[] f71921a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f71922b = null;

    static {
        ONE_WEEK = new ForeignFlowChartPeriodType("ONE_WEEK", 0);
        ONE_MONTH = new ForeignFlowChartPeriodType("ONE_MONTH", 1);
        THREE_MONTHS = new ForeignFlowChartPeriodType("THREE_MONTHS", 2);
        YEAR_TO_DATE = new ForeignFlowChartPeriodType("YEAR_TO_DATE", 3);
        ONE_YEAR = new ForeignFlowChartPeriodType("ONE_YEAR", 4);
        ForeignFlowChartPeriodType[] r02 = a();
        f71921a = r02;
        f71922b = kotlin.enums.b.a(r02);
    }

    ForeignFlowChartPeriodType(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowChartPeriodType[] a() {
        return new ForeignFlowChartPeriodType[]{ONE_WEEK, ONE_MONTH, THREE_MONTHS, YEAR_TO_DATE, ONE_YEAR};
    }

    public static kotlin.enums.a getEntries() {
        return f71922b;
    }

    public static ForeignFlowChartPeriodType valueOf(String r1) {
        return (ForeignFlowChartPeriodType) Enum.valueOf(ForeignFlowChartPeriodType.class, r1);
    }

    public static ForeignFlowChartPeriodType[] values() {
        return (ForeignFlowChartPeriodType[]) f71921a.clone();
    }
}
