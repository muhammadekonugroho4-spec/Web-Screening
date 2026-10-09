package com.stockbit.usecase.company.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/company/model/type/ProfitLossUIType;", "", "<init>", "(Ljava/lang/String;I)V", "PROFIT", "LOSS", "NEUTRAL", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ProfitLossUIType extends Enum<ProfitLossUIType> {
    public static final ProfitLossUIType LOSS = null;
    public static final ProfitLossUIType NEUTRAL = null;
    public static final ProfitLossUIType PROFIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ProfitLossUIType[] f156669a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f156670b = null;

    static {
        PROFIT = new ProfitLossUIType("PROFIT", 0);
        LOSS = new ProfitLossUIType("LOSS", 1);
        NEUTRAL = new ProfitLossUIType("NEUTRAL", 2);
        ProfitLossUIType[] r02 = a();
        f156669a = r02;
        f156670b = b.a(r02);
    }

    ProfitLossUIType(String r1, int r2) {
    }

    public static final /* synthetic */ ProfitLossUIType[] a() {
        return new ProfitLossUIType[]{PROFIT, LOSS, NEUTRAL};
    }

    public static a getEntries() {
        return f156670b;
    }

    public static ProfitLossUIType valueOf(String r1) {
        return (ProfitLossUIType) Enum.valueOf(ProfitLossUIType.class, r1);
    }

    public static ProfitLossUIType[] values() {
        return (ProfitLossUIType[]) f156669a.clone();
    }
}
