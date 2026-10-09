package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/transaction/model/SellProfitLossColorState;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "GREY", "GREEN", "RED", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SellProfitLossColorState extends Enum<SellProfitLossColorState> {
    public static final SellProfitLossColorState GREEN = null;
    public static final SellProfitLossColorState GREY = null;
    public static final SellProfitLossColorState NEUTRAL = null;
    public static final SellProfitLossColorState RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SellProfitLossColorState[] f163768a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163769b = null;

    static {
        NEUTRAL = new SellProfitLossColorState("NEUTRAL", 0);
        GREY = new SellProfitLossColorState("GREY", 1);
        GREEN = new SellProfitLossColorState("GREEN", 2);
        RED = new SellProfitLossColorState("RED", 3);
        SellProfitLossColorState[] r02 = a();
        f163768a = r02;
        f163769b = kotlin.enums.b.a(r02);
    }

    SellProfitLossColorState(String r1, int r2) {
    }

    public static final /* synthetic */ SellProfitLossColorState[] a() {
        return new SellProfitLossColorState[]{NEUTRAL, GREY, GREEN, RED};
    }

    public static kotlin.enums.a getEntries() {
        return f163769b;
    }

    public static SellProfitLossColorState valueOf(String r1) {
        return (SellProfitLossColorState) Enum.valueOf(SellProfitLossColorState.class, r1);
    }

    public static SellProfitLossColorState[] values() {
        return (SellProfitLossColorState[]) f163768a.clone();
    }
}
