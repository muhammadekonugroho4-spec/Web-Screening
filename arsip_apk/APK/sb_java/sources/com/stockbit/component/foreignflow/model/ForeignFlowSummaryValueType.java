package com.stockbit.component.foreignflow.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/foreignflow/model/ForeignFlowSummaryValueType;", "", "<init>", "(Ljava/lang/String;I)V", "VALUE", "VOLUME", "FREQUENCY", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ForeignFlowSummaryValueType extends Enum<ForeignFlowSummaryValueType> {
    public static final ForeignFlowSummaryValueType FREQUENCY = null;
    public static final ForeignFlowSummaryValueType VALUE = null;
    public static final ForeignFlowSummaryValueType VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowSummaryValueType[] f71929a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f71930b = null;

    static {
        VALUE = new ForeignFlowSummaryValueType("VALUE", 0);
        VOLUME = new ForeignFlowSummaryValueType("VOLUME", 1);
        FREQUENCY = new ForeignFlowSummaryValueType("FREQUENCY", 2);
        ForeignFlowSummaryValueType[] r02 = a();
        f71929a = r02;
        f71930b = kotlin.enums.b.a(r02);
    }

    ForeignFlowSummaryValueType(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowSummaryValueType[] a() {
        return new ForeignFlowSummaryValueType[]{VALUE, VOLUME, FREQUENCY};
    }

    public static kotlin.enums.a getEntries() {
        return f71930b;
    }

    public static ForeignFlowSummaryValueType valueOf(String r1) {
        return (ForeignFlowSummaryValueType) Enum.valueOf(ForeignFlowSummaryValueType.class, r1);
    }

    public static ForeignFlowSummaryValueType[] values() {
        return (ForeignFlowSummaryValueType[]) f71929a.clone();
    }
}
