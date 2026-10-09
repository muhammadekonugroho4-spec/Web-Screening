package com.stockbit.feature.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transaction/model/BracketType;", "", "<init>", "(Ljava/lang/String;I)V", "STOP_LOSS", "TAKE_PROFIT", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum BracketType extends Enum<BracketType> {
    public static final BracketType STOP_LOSS = null;
    public static final BracketType TAKE_PROFIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BracketType[] f108242a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f108243b = null;

    static {
        STOP_LOSS = new BracketType("STOP_LOSS", 0);
        TAKE_PROFIT = new BracketType("TAKE_PROFIT", 1);
        BracketType[] r02 = a();
        f108242a = r02;
        f108243b = kotlin.enums.b.a(r02);
    }

    BracketType(String r1, int r2) {
    }

    public static final /* synthetic */ BracketType[] a() {
        return new BracketType[]{STOP_LOSS, TAKE_PROFIT};
    }

    public static kotlin.enums.a getEntries() {
        return f108243b;
    }

    public static BracketType valueOf(String r1) {
        return (BracketType) Enum.valueOf(BracketType.class, r1);
    }

    public static BracketType[] values() {
        return (BracketType[]) f108242a.clone();
    }
}
