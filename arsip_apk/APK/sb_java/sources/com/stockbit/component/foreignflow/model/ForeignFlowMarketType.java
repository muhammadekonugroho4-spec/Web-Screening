package com.stockbit.component.foreignflow.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/foreignflow/model/ForeignFlowMarketType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "ALL", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ForeignFlowMarketType extends Enum<ForeignFlowMarketType> {
    public static final ForeignFlowMarketType ALL = null;
    public static final ForeignFlowMarketType REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowMarketType[] f71927a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f71928b = null;

    static {
        REGULAR = new ForeignFlowMarketType("REGULAR", 0);
        ALL = new ForeignFlowMarketType("ALL", 1);
        ForeignFlowMarketType[] r02 = a();
        f71927a = r02;
        f71928b = kotlin.enums.b.a(r02);
    }

    ForeignFlowMarketType(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowMarketType[] a() {
        return new ForeignFlowMarketType[]{REGULAR, ALL};
    }

    public static kotlin.enums.a getEntries() {
        return f71928b;
    }

    public static ForeignFlowMarketType valueOf(String r1) {
        return (ForeignFlowMarketType) Enum.valueOf(ForeignFlowMarketType.class, r1);
    }

    public static ForeignFlowMarketType[] values() {
        return (ForeignFlowMarketType[]) f71927a.clone();
    }
}
