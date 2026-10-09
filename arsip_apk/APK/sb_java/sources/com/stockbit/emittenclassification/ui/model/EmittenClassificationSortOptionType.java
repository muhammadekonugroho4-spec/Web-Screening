package com.stockbit.emittenclassification.ui.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/emittenclassification/ui/model/EmittenClassificationSortOptionType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TOP_GAINER", "TOP_LOSER", "HIGHEST_PRICE", "LOWEST_PRICE", "HIGHEST_MARKET_CAP", "HIGHEST_LIQUIDITY", "emitten-classification_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum EmittenClassificationSortOptionType extends Enum<EmittenClassificationSortOptionType> {
    public static final EmittenClassificationSortOptionType HIGHEST_LIQUIDITY = null;
    public static final EmittenClassificationSortOptionType HIGHEST_MARKET_CAP = null;
    public static final EmittenClassificationSortOptionType HIGHEST_PRICE = null;
    public static final EmittenClassificationSortOptionType LOWEST_PRICE = null;
    public static final EmittenClassificationSortOptionType NONE = null;
    public static final EmittenClassificationSortOptionType TOP_GAINER = null;
    public static final EmittenClassificationSortOptionType TOP_LOSER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EmittenClassificationSortOptionType[] f91352a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f91353b = null;

    static {
        NONE = new EmittenClassificationSortOptionType("NONE", 0);
        TOP_GAINER = new EmittenClassificationSortOptionType("TOP_GAINER", 1);
        TOP_LOSER = new EmittenClassificationSortOptionType("TOP_LOSER", 2);
        HIGHEST_PRICE = new EmittenClassificationSortOptionType("HIGHEST_PRICE", 3);
        LOWEST_PRICE = new EmittenClassificationSortOptionType("LOWEST_PRICE", 4);
        HIGHEST_MARKET_CAP = new EmittenClassificationSortOptionType("HIGHEST_MARKET_CAP", 5);
        HIGHEST_LIQUIDITY = new EmittenClassificationSortOptionType("HIGHEST_LIQUIDITY", 6);
        EmittenClassificationSortOptionType[] r02 = a();
        f91352a = r02;
        f91353b = b.a(r02);
    }

    EmittenClassificationSortOptionType(String r1, int r2) {
    }

    public static final /* synthetic */ EmittenClassificationSortOptionType[] a() {
        return new EmittenClassificationSortOptionType[]{NONE, TOP_GAINER, TOP_LOSER, HIGHEST_PRICE, LOWEST_PRICE, HIGHEST_MARKET_CAP, HIGHEST_LIQUIDITY};
    }

    public static a getEntries() {
        return f91353b;
    }

    public static EmittenClassificationSortOptionType valueOf(String r1) {
        return (EmittenClassificationSortOptionType) Enum.valueOf(EmittenClassificationSortOptionType.class, r1);
    }

    public static EmittenClassificationSortOptionType[] values() {
        return (EmittenClassificationSortOptionType[]) f91352a.clone();
    }
}
