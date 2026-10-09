package com.stockbit.feature.transaction.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/feature/transaction/util/SplitOrderErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "QUANTITY_MUST_LARGER_THAN_ONE", "QUANTITY_BIGGER_THAN_LOT", "MIN_RANGE_HIGHER_THAN_MAX_RANGE", "MIN_RANGE_HIGHER_THAN_LOT", "TOTAL_SPLIT_MIN_HIGHER_THAN_LOT", "TOTAL_SPLIT_MAX_LESSER_THAN_LOT", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum SplitOrderErrorType extends Enum<SplitOrderErrorType> {
    public static final SplitOrderErrorType MIN_RANGE_HIGHER_THAN_LOT = null;
    public static final SplitOrderErrorType MIN_RANGE_HIGHER_THAN_MAX_RANGE = null;
    public static final SplitOrderErrorType QUANTITY_BIGGER_THAN_LOT = null;
    public static final SplitOrderErrorType QUANTITY_MUST_LARGER_THAN_ONE = null;
    public static final SplitOrderErrorType TOTAL_SPLIT_MAX_LESSER_THAN_LOT = null;
    public static final SplitOrderErrorType TOTAL_SPLIT_MIN_HIGHER_THAN_LOT = null;
    public static final SplitOrderErrorType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SplitOrderErrorType[] f116606a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116607b = null;

    static {
        UNSPECIFIED = new SplitOrderErrorType("UNSPECIFIED", 0);
        QUANTITY_MUST_LARGER_THAN_ONE = new SplitOrderErrorType("QUANTITY_MUST_LARGER_THAN_ONE", 1);
        QUANTITY_BIGGER_THAN_LOT = new SplitOrderErrorType("QUANTITY_BIGGER_THAN_LOT", 2);
        MIN_RANGE_HIGHER_THAN_MAX_RANGE = new SplitOrderErrorType("MIN_RANGE_HIGHER_THAN_MAX_RANGE", 3);
        MIN_RANGE_HIGHER_THAN_LOT = new SplitOrderErrorType("MIN_RANGE_HIGHER_THAN_LOT", 4);
        TOTAL_SPLIT_MIN_HIGHER_THAN_LOT = new SplitOrderErrorType("TOTAL_SPLIT_MIN_HIGHER_THAN_LOT", 5);
        TOTAL_SPLIT_MAX_LESSER_THAN_LOT = new SplitOrderErrorType("TOTAL_SPLIT_MAX_LESSER_THAN_LOT", 6);
        SplitOrderErrorType[] r02 = a();
        f116606a = r02;
        f116607b = kotlin.enums.b.a(r02);
    }

    SplitOrderErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ SplitOrderErrorType[] a() {
        return new SplitOrderErrorType[]{UNSPECIFIED, QUANTITY_MUST_LARGER_THAN_ONE, QUANTITY_BIGGER_THAN_LOT, MIN_RANGE_HIGHER_THAN_MAX_RANGE, MIN_RANGE_HIGHER_THAN_LOT, TOTAL_SPLIT_MIN_HIGHER_THAN_LOT, TOTAL_SPLIT_MAX_LESSER_THAN_LOT};
    }

    public static kotlin.enums.a getEntries() {
        return f116607b;
    }

    public static SplitOrderErrorType valueOf(String r1) {
        return (SplitOrderErrorType) Enum.valueOf(SplitOrderErrorType.class, r1);
    }

    public static SplitOrderErrorType[] values() {
        return (SplitOrderErrorType[]) f116606a.clone();
    }
}
