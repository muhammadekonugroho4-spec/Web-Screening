package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/transaction/model/BracketInputType;", "", "segmentedIndex", "", "<init>", "(Ljava/lang/String;II)V", "getSegmentedIndex", "()I", "PERCENTAGE", "PRICE", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BracketInputType extends Enum<BracketInputType> {
    public static final BracketInputType PERCENTAGE = null;
    public static final BracketInputType PRICE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BracketInputType[] f163758a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163759b = null;
    private final int segmentedIndex;

    static {
        PERCENTAGE = new BracketInputType("PERCENTAGE", 0, 0);
        PRICE = new BracketInputType("PRICE", 1, 1);
        BracketInputType[] r02 = a();
        f163758a = r02;
        f163759b = kotlin.enums.b.a(r02);
    }

    BracketInputType(String r1, int r2, int r3) {
        this.segmentedIndex = r3;
    }

    public static final /* synthetic */ BracketInputType[] a() {
        return new BracketInputType[]{PERCENTAGE, PRICE};
    }

    public static kotlin.enums.a getEntries() {
        return f163759b;
    }

    public static BracketInputType valueOf(String r1) {
        return (BracketInputType) Enum.valueOf(BracketInputType.class, r1);
    }

    public static BracketInputType[] values() {
        return (BracketInputType[]) f163758a.clone();
    }

    public final int getSegmentedIndex() {
        return this.segmentedIndex;
    }
}
