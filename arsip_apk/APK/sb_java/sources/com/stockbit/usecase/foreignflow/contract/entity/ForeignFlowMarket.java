package com.stockbit.usecase.foreignflow.contract.entity;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/foreignflow/contract/entity/ForeignFlowMarket;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "REGULAR", "ALL", "usecase-foreign-flow-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ForeignFlowMarket extends Enum<ForeignFlowMarket> {
    public static final ForeignFlowMarket ALL = null;
    public static final ForeignFlowMarket REGULAR = null;
    public static final ForeignFlowMarket UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowMarket[] f157866a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157867b = null;

    static {
        UNSPECIFIED = new ForeignFlowMarket("UNSPECIFIED", 0);
        REGULAR = new ForeignFlowMarket("REGULAR", 1);
        ALL = new ForeignFlowMarket("ALL", 2);
        ForeignFlowMarket[] r02 = a();
        f157866a = r02;
        f157867b = kotlin.enums.b.a(r02);
    }

    ForeignFlowMarket(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowMarket[] a() {
        return new ForeignFlowMarket[]{UNSPECIFIED, REGULAR, ALL};
    }

    public static kotlin.enums.a getEntries() {
        return f157867b;
    }

    public static ForeignFlowMarket valueOf(String r1) {
        return (ForeignFlowMarket) Enum.valueOf(ForeignFlowMarket.class, r1);
    }

    public static ForeignFlowMarket[] values() {
        return (ForeignFlowMarket[]) f157866a.clone();
    }
}
