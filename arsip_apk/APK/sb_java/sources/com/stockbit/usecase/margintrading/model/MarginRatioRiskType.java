package com.stockbit.usecase.margintrading.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/margintrading/model/MarginRatioRiskType;", "", "<init>", "(Ljava/lang/String;I)V", "SAFE", "AT_RISK", "MARGIN_CALL", "usecase-margintrading"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MarginRatioRiskType extends Enum<MarginRatioRiskType> {
    public static final MarginRatioRiskType AT_RISK = null;
    public static final MarginRatioRiskType MARGIN_CALL = null;
    public static final MarginRatioRiskType SAFE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MarginRatioRiskType[] f158396a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158397b = null;

    static {
        SAFE = new MarginRatioRiskType("SAFE", 0);
        AT_RISK = new MarginRatioRiskType("AT_RISK", 1);
        MARGIN_CALL = new MarginRatioRiskType("MARGIN_CALL", 2);
        MarginRatioRiskType[] r02 = a();
        f158396a = r02;
        f158397b = kotlin.enums.b.a(r02);
    }

    MarginRatioRiskType(String r1, int r2) {
    }

    public static final /* synthetic */ MarginRatioRiskType[] a() {
        return new MarginRatioRiskType[]{SAFE, AT_RISK, MARGIN_CALL};
    }

    public static kotlin.enums.a getEntries() {
        return f158397b;
    }

    public static MarginRatioRiskType valueOf(String r1) {
        return (MarginRatioRiskType) Enum.valueOf(MarginRatioRiskType.class, r1);
    }

    public static MarginRatioRiskType[] values() {
        return (MarginRatioRiskType[]) f158396a.clone();
    }
}
