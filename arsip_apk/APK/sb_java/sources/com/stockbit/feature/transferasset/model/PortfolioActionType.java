package com.stockbit.feature.transferasset.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transferasset/model/PortfolioActionType;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT_FROM", "SELECT_TO", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum PortfolioActionType extends Enum<PortfolioActionType> {
    public static final PortfolioActionType SELECT_FROM = null;
    public static final PortfolioActionType SELECT_TO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioActionType[] f116862a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116863b = null;

    static {
        SELECT_FROM = new PortfolioActionType("SELECT_FROM", 0);
        SELECT_TO = new PortfolioActionType("SELECT_TO", 1);
        PortfolioActionType[] r02 = a();
        f116862a = r02;
        f116863b = kotlin.enums.b.a(r02);
    }

    PortfolioActionType(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioActionType[] a() {
        return new PortfolioActionType[]{SELECT_FROM, SELECT_TO};
    }

    public static kotlin.enums.a getEntries() {
        return f116863b;
    }

    public static PortfolioActionType valueOf(String r1) {
        return (PortfolioActionType) Enum.valueOf(PortfolioActionType.class, r1);
    }

    public static PortfolioActionType[] values() {
        return (PortfolioActionType[]) f116862a.clone();
    }
}
