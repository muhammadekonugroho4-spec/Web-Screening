package com.stockbit.feature.transaction.ui.fasttrade.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/stockbit/feature/transaction/ui/fasttrade/model/FTOrderBookType;", "", "<init>", "(Ljava/lang/String;I)V", "BID", "ASK", "BEST_BID", "BEST_ASK", "isBestBidAsk", "", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum FTOrderBookType extends Enum<FTOrderBookType> {
    public static final FTOrderBookType ASK = null;
    public static final FTOrderBookType BEST_ASK = null;
    public static final FTOrderBookType BEST_BID = null;
    public static final FTOrderBookType BID = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FTOrderBookType[] f114038a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114039b = null;

    static {
        BID = new FTOrderBookType("BID", 0);
        ASK = new FTOrderBookType("ASK", 1);
        BEST_BID = new FTOrderBookType("BEST_BID", 2);
        BEST_ASK = new FTOrderBookType("BEST_ASK", 3);
        FTOrderBookType[] r02 = a();
        f114038a = r02;
        f114039b = kotlin.enums.b.a(r02);
    }

    FTOrderBookType(String r1, int r2) {
    }

    public static final /* synthetic */ FTOrderBookType[] a() {
        return new FTOrderBookType[]{BID, ASK, BEST_BID, BEST_ASK};
    }

    public static kotlin.enums.a getEntries() {
        return f114039b;
    }

    public static FTOrderBookType valueOf(String r1) {
        return (FTOrderBookType) Enum.valueOf(FTOrderBookType.class, r1);
    }

    public static FTOrderBookType[] values() {
        return (FTOrderBookType[]) f114038a.clone();
    }

    public final boolean isBestBidAsk() {
        if (this != BEST_BID) goto L5;
        return true;
    L5:
        if (this == BEST_ASK) goto L11;
        return false;
    L11:
        return true;
    }
}
