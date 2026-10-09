package com.stockbit.feature.transaction.ui.amend.sell.compose.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/stockbit/feature/transaction/ui/amend/sell/compose/model/AmendSellStockValidationError;", "", "isPriceError", "", "isLotError", "disablesButton", "<init>", "(Ljava/lang/String;IZZZ)V", "()Z", "getDisablesButton", "PRICE_OR_QUANTITY_NOT_CHANGED", "ONLY_INCREASE_QUANTITY", "QUANTITY_LOWER_THAN_MATCH", "INVALID_PRICE_FRACTION", "POST_CLOSING", "PRICE_HIGHER_THAN_ARA", "PRICE_LOWER_THAN_ARB", "PRICE_HIGHER_THAN_BUY", "PRICE_LOWER_THAN_BUY", "QUANTITY_EXCEEDED_MAX_LOT", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum AmendSellStockValidationError extends Enum<AmendSellStockValidationError> {
    public static final AmendSellStockValidationError INVALID_PRICE_FRACTION = null;
    public static final AmendSellStockValidationError ONLY_INCREASE_QUANTITY = null;
    public static final AmendSellStockValidationError POST_CLOSING = null;
    public static final AmendSellStockValidationError PRICE_HIGHER_THAN_ARA = null;
    public static final AmendSellStockValidationError PRICE_HIGHER_THAN_BUY = null;
    public static final AmendSellStockValidationError PRICE_LOWER_THAN_ARB = null;
    public static final AmendSellStockValidationError PRICE_LOWER_THAN_BUY = null;
    public static final AmendSellStockValidationError PRICE_OR_QUANTITY_NOT_CHANGED = null;
    public static final AmendSellStockValidationError QUANTITY_EXCEEDED_MAX_LOT = null;
    public static final AmendSellStockValidationError QUANTITY_LOWER_THAN_MATCH = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AmendSellStockValidationError[] f110094a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f110095b = null;
    private final boolean disablesButton;
    private final boolean isLotError;
    private final boolean isPriceError;

    static {
        PRICE_OR_QUANTITY_NOT_CHANGED = new AmendSellStockValidationError("PRICE_OR_QUANTITY_NOT_CHANGED", 0, false, false, true);
        ONLY_INCREASE_QUANTITY = new AmendSellStockValidationError("ONLY_INCREASE_QUANTITY", 1, true, false, false);
        QUANTITY_LOWER_THAN_MATCH = new AmendSellStockValidationError("QUANTITY_LOWER_THAN_MATCH", 2, false, true, false);
        INVALID_PRICE_FRACTION = new AmendSellStockValidationError("INVALID_PRICE_FRACTION", 3, true, false, false);
        POST_CLOSING = new AmendSellStockValidationError("POST_CLOSING", 4, true, false, false);
        PRICE_HIGHER_THAN_ARA = new AmendSellStockValidationError("PRICE_HIGHER_THAN_ARA", 5, true, false, false);
        PRICE_LOWER_THAN_ARB = new AmendSellStockValidationError("PRICE_LOWER_THAN_ARB", 6, true, false, false);
        PRICE_HIGHER_THAN_BUY = new AmendSellStockValidationError("PRICE_HIGHER_THAN_BUY", 7, false, false, true);
        PRICE_LOWER_THAN_BUY = new AmendSellStockValidationError("PRICE_LOWER_THAN_BUY", 8, false, false, true);
        QUANTITY_EXCEEDED_MAX_LOT = new AmendSellStockValidationError("QUANTITY_EXCEEDED_MAX_LOT", 9, false, true, true);
        AmendSellStockValidationError[] r02 = a();
        f110094a = r02;
        f110095b = kotlin.enums.b.a(r02);
    }

    AmendSellStockValidationError(String r1, int r2, boolean r3, boolean r4, boolean r5) {
        this.isPriceError = r3;
        this.isLotError = r4;
        this.disablesButton = r5;
    }

    public static final /* synthetic */ AmendSellStockValidationError[] a() {
        return new AmendSellStockValidationError[]{PRICE_OR_QUANTITY_NOT_CHANGED, ONLY_INCREASE_QUANTITY, QUANTITY_LOWER_THAN_MATCH, INVALID_PRICE_FRACTION, POST_CLOSING, PRICE_HIGHER_THAN_ARA, PRICE_LOWER_THAN_ARB, PRICE_HIGHER_THAN_BUY, PRICE_LOWER_THAN_BUY, QUANTITY_EXCEEDED_MAX_LOT};
    }

    public static kotlin.enums.a getEntries() {
        return f110095b;
    }

    public static AmendSellStockValidationError valueOf(String r1) {
        return (AmendSellStockValidationError) Enum.valueOf(AmendSellStockValidationError.class, r1);
    }

    public static AmendSellStockValidationError[] values() {
        return (AmendSellStockValidationError[]) f110094a.clone();
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
}
