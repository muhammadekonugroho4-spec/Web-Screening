package com.stockbit.usecase.emittenclassification.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/emittenclassification/model/EmittenClassificationSortOrder;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "TOP_GAINER", "TOP_LOSER", "HIGHEST_PRICE", "LOWEST_PRICE", "HIGHEST_MARKET_CAP", "TOP_LIQUIDITY", "usecase-emitten-classification"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum EmittenClassificationSortOrder extends Enum<EmittenClassificationSortOrder> {
    public static final EmittenClassificationSortOrder HIGHEST_MARKET_CAP = null;
    public static final EmittenClassificationSortOrder HIGHEST_PRICE = null;
    public static final EmittenClassificationSortOrder LOWEST_PRICE = null;
    public static final EmittenClassificationSortOrder TOP_GAINER = null;
    public static final EmittenClassificationSortOrder TOP_LIQUIDITY = null;
    public static final EmittenClassificationSortOrder TOP_LOSER = null;
    public static final EmittenClassificationSortOrder UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EmittenClassificationSortOrder[] f157574a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157575b = null;
    private final String value;

    static {
        UNSPECIFIED = new EmittenClassificationSortOrder("UNSPECIFIED", 0, "SORT_ORDER_UNSPECIFIED");
        TOP_GAINER = new EmittenClassificationSortOrder("TOP_GAINER", 1, "SORT_ORDER_TOP_GAINER");
        TOP_LOSER = new EmittenClassificationSortOrder("TOP_LOSER", 2, "SORT_ORDER_TOP_LOSER");
        HIGHEST_PRICE = new EmittenClassificationSortOrder("HIGHEST_PRICE", 3, "SORT_ORDER_HIGHEST_PRICE");
        LOWEST_PRICE = new EmittenClassificationSortOrder("LOWEST_PRICE", 4, "SORT_ORDER_LOWEST_PRICE");
        HIGHEST_MARKET_CAP = new EmittenClassificationSortOrder("HIGHEST_MARKET_CAP", 5, "SORT_ORDER_HIGHEST_MARKET_CAP");
        TOP_LIQUIDITY = new EmittenClassificationSortOrder("TOP_LIQUIDITY", 6, "SORT_ORDER_TOP_LIQUIDITY");
        EmittenClassificationSortOrder[] r02 = a();
        f157574a = r02;
        f157575b = b.a(r02);
    }

    EmittenClassificationSortOrder(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ EmittenClassificationSortOrder[] a() {
        return new EmittenClassificationSortOrder[]{UNSPECIFIED, TOP_GAINER, TOP_LOSER, HIGHEST_PRICE, LOWEST_PRICE, HIGHEST_MARKET_CAP, TOP_LIQUIDITY};
    }

    public static kotlin.enums.a getEntries() {
        return f157575b;
    }

    public static EmittenClassificationSortOrder valueOf(String r1) {
        return (EmittenClassificationSortOrder) Enum.valueOf(EmittenClassificationSortOrder.class, r1);
    }

    public static EmittenClassificationSortOrder[] values() {
        return (EmittenClassificationSortOrder[]) f157574a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
