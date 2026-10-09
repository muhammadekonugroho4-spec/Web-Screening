package com.stockbit.feature.transaction.ui.amend.buy.compose.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stockbit/feature/transaction/ui/amend/buy/compose/model/AmendBuyStockValidationError;", "", "isPriceError", "", "isLotError", "disablesButton", "<init>", "(Ljava/lang/String;IZZZ)V", "()Z", "getDisablesButton", "ONLY_INCREASE_QUANTITY", "INVALID_PRICE_FRACTION", "POST_CLOSING", "PRICE_HIGHER_THAN_ARA", "PRICE_LOWER_THAN_ARB", "QUANTITY_LOWER_THAN_MATCH", "QUANTITY_EXCEEDED_MAX_LOT", "PRICE_OR_QUANTITY_NOT_CHANGED", "INSUFFICIENT_FUNDS", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum AmendBuyStockValidationError extends Enum<AmendBuyStockValidationError> {
    public static final AmendBuyStockValidationError INSUFFICIENT_FUNDS = null;
    public static final AmendBuyStockValidationError INVALID_PRICE_FRACTION = null;
    public static final AmendBuyStockValidationError ONLY_INCREASE_QUANTITY = null;
    public static final AmendBuyStockValidationError POST_CLOSING = null;
    public static final AmendBuyStockValidationError PRICE_HIGHER_THAN_ARA = null;
    public static final AmendBuyStockValidationError PRICE_LOWER_THAN_ARB = null;
    public static final AmendBuyStockValidationError PRICE_OR_QUANTITY_NOT_CHANGED = null;
    public static final AmendBuyStockValidationError QUANTITY_EXCEEDED_MAX_LOT = null;
    public static final AmendBuyStockValidationError QUANTITY_LOWER_THAN_MATCH = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AmendBuyStockValidationError[] f109176a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f109177b = null;
    private final boolean disablesButton;
    private final boolean isLotError;
    private final boolean isPriceError;

    static {
        String r1 = "ONLY_INCREASE_QUANTITY";
        int r2 = 0;
        boolean r3 = true;
        boolean r4 = false;
        boolean r5 = false;
        ONLY_INCREASE_QUANTITY = new AmendBuyStockValidationError(r1, r2, r3, r4, r5, 6, null);
        String r22 = "INVALID_PRICE_FRACTION";
        boolean r42 = true;
        boolean r6 = false;
        char r32 = 1 == true ? 1 : 0;
        INVALID_PRICE_FRACTION = new AmendBuyStockValidationError(r22, r32, r42, r5, r6, 6, null);
        String r33 = "POST_CLOSING";
        int r43 = 2;
        boolean r52 = true;
        boolean r7 = false;
        POST_CLOSING = new AmendBuyStockValidationError(r33, r43, r52, r6, r7, 6, null);
        String r44 = "PRICE_HIGHER_THAN_ARA";
        int r53 = 3;
        boolean r62 = true;
        boolean r8 = false;
        PRICE_HIGHER_THAN_ARA = new AmendBuyStockValidationError(r44, r53, r62, r7, r8, 6, null);
        String r54 = "PRICE_LOWER_THAN_ARB";
        int r63 = 4;
        boolean r72 = true;
        boolean r9 = false;
        PRICE_LOWER_THAN_ARB = new AmendBuyStockValidationError(r54, r63, r72, r8, r9, 6, null);
        String r64 = "QUANTITY_LOWER_THAN_MATCH";
        int r73 = 5;
        boolean r92 = true;
        boolean r10 = false;
        QUANTITY_LOWER_THAN_MATCH = new AmendBuyStockValidationError(r64, r73, r8, r92, r10, 5, null);
        String r74 = "QUANTITY_EXCEEDED_MAX_LOT";
        int r82 = 6;
        boolean r93 = false;
        boolean r102 = true;
        boolean r11 = true;
        QUANTITY_EXCEEDED_MAX_LOT = new AmendBuyStockValidationError(r74, r82, r93, r102, r11, 1, null);
        String r83 = "PRICE_OR_QUANTITY_NOT_CHANGED";
        int r94 = 7;
        boolean r103 = false;
        boolean r112 = false;
        char r12 = 1 == true ? 1 : 0;
        PRICE_OR_QUANTITY_NOT_CHANGED = new AmendBuyStockValidationError(r83, r94, r103, r112, r12, 3, null);
        String r95 = "INSUFFICIENT_FUNDS";
        int r104 = 8;
        boolean r122 = false;
        boolean r13 = true;
        INSUFFICIENT_FUNDS = new AmendBuyStockValidationError(r95, r104, r112, r122, r13, 3, null);
        AmendBuyStockValidationError[] r02 = a();
        f109176a = r02;
        f109177b = kotlin.enums.b.a(r02);
    }

    AmendBuyStockValidationError(String r1, int r2, boolean r3, boolean r4, boolean r5) {
        this.isPriceError = r3;
        this.isLotError = r4;
        this.disablesButton = r5;
    }

    public static final /* synthetic */ AmendBuyStockValidationError[] a() {
        return new AmendBuyStockValidationError[]{ONLY_INCREASE_QUANTITY, INVALID_PRICE_FRACTION, POST_CLOSING, PRICE_HIGHER_THAN_ARA, PRICE_LOWER_THAN_ARB, QUANTITY_LOWER_THAN_MATCH, QUANTITY_EXCEEDED_MAX_LOT, PRICE_OR_QUANTITY_NOT_CHANGED, INSUFFICIENT_FUNDS};
    }

    public static kotlin.enums.a getEntries() {
        return f109177b;
    }

    public static AmendBuyStockValidationError valueOf(String r1) {
        return (AmendBuyStockValidationError) Enum.valueOf(AmendBuyStockValidationError.class, r1);
    }

    public static AmendBuyStockValidationError[] values() {
        return (AmendBuyStockValidationError[]) f109176a.clone();
    }

    public final boolean getDisablesButton() {
        return this.disablesButton;
    }

    public final boolean isLotError() {
        return this.isLotError;
    }

    public final boolean isPriceError() {
        return this.isPriceError;
    }

    /* synthetic */ AmendBuyStockValidationError(String r2, int r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r4 = false;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r5 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        boolean r72 = false;
    L13:
        this(r2, r3, r4, r5, r72);
        return;
    L12:
        r72 = r6;
        goto L13
    }
}
