package com.stockbit.features.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00066"}, d2 = {"Lcom/stockbit/features/model/DomainSecuritiesError;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_SYSTEM", "MAINTENANCE", "MAINTENANCE_MODE", "NETWORK", GrsBaseInfo.CountryCodeSource.UNKNOWN, "UNAUTHORIZED", "MOCK_TRADING", "DAILY_MAINTENANCE_MODE", "USER_SUSPEND", "USER_SUSPEND_BACK_OFFICE", "USER_SUSPEND_FORCED_SELL", "DAY_TRADE_EXCEED_TIME_LIMIT", "DAY_TRADE_DISABLED", "INVALID_MULTIPLIER_STOCKCODE", "INVALID_AMEND_MULTIPLIER_STOCKCODE", "FR_BONDS_MARKET_CLOSED", "FR_UNAVAILABLE_DUE_TO_SHARIA_RDN", "FR_UNAVAILABLE_DUE_TO_SHARIA_PREFERENCE", "PRICE_RATE_NOT_FOUND", "FR_IN_RECORD_DATE_PERIOD", "PRODUCT_NOT_FOUND", "PRICE_HAS_CHANGED", "STOCKBIT_GET_ACCOUNT_NOT_FOUND", "TRADING_ACCOUNT_SUSPENDED", "FR_EXISTING_ORDER_INPROGRESS", "PORTFOLIO_NOT_EXIST", "REDEEM_AMOUNT_GREATER_THAN_REDEEMABLE_AMOUNT", "NOT_IN_SECONDARY_MARKET_PERIOD", "SELL_ORDER_INPROGRESS", "STABLE_EARN_CANNOT_BE_SOLD_OUTSIDE_BIBIT", "USER_SHARIA_VALIDATION", "MAX_ACTIVE_ORDER_PER_ASSET_REACHED", "INVALID_SESSION", "CASH_SWEEP_INACTIVE_USER", "CASH_SWEEP_INVALID_SELECTED_RDN", "CASH_SWEEP_INVALID_MIN_AMOUNT", "CASH_SWEEP_MISMATCH_USER_IDENTITY", "CASH_SWEEP_SUSPENDED_USER_BIBIT", "CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA", "CASH_SWEEP_INSUFFICIENT_UNITS", "CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS", "CASH_SWEEP_INACTIVE_NETBUY_BLOCK", "CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK", "MARKET_CLOSE_HOLIDAYS", "CANT_CANCEL_ORDER_PRE_OPENING", "CANT_CANCEL_ORDER_PRE_CLOSING", "isErrorSuspend", "", "isErrorNonCancellationPeriod", "Companion", "model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum DomainSecuritiesError extends Enum<DomainSecuritiesError> {
    public static final DomainSecuritiesError CANT_CANCEL_ORDER_PRE_CLOSING = null;
    public static final DomainSecuritiesError CANT_CANCEL_ORDER_PRE_OPENING = null;
    public static final DomainSecuritiesError CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS = null;
    public static final DomainSecuritiesError CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK = null;
    public static final DomainSecuritiesError CASH_SWEEP_INACTIVE_NETBUY_BLOCK = null;
    public static final DomainSecuritiesError CASH_SWEEP_INACTIVE_USER = null;
    public static final DomainSecuritiesError CASH_SWEEP_INSUFFICIENT_UNITS = null;
    public static final DomainSecuritiesError CASH_SWEEP_INVALID_MIN_AMOUNT = null;
    public static final DomainSecuritiesError CASH_SWEEP_INVALID_SELECTED_RDN = null;
    public static final DomainSecuritiesError CASH_SWEEP_MISMATCH_USER_IDENTITY = null;
    public static final DomainSecuritiesError CASH_SWEEP_SUSPENDED_USER_BIBIT = null;
    public static final DomainSecuritiesError CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA = null;
    public static final a Companion = null;
    public static final DomainSecuritiesError DAILY_MAINTENANCE_MODE = null;
    public static final DomainSecuritiesError DAY_TRADE_DISABLED = null;
    public static final DomainSecuritiesError DAY_TRADE_EXCEED_TIME_LIMIT = null;
    public static final DomainSecuritiesError ERROR_SYSTEM = null;
    public static final DomainSecuritiesError FR_BONDS_MARKET_CLOSED = null;
    public static final DomainSecuritiesError FR_EXISTING_ORDER_INPROGRESS = null;
    public static final DomainSecuritiesError FR_IN_RECORD_DATE_PERIOD = null;
    public static final DomainSecuritiesError FR_UNAVAILABLE_DUE_TO_SHARIA_PREFERENCE = null;
    public static final DomainSecuritiesError FR_UNAVAILABLE_DUE_TO_SHARIA_RDN = null;
    public static final DomainSecuritiesError INVALID_AMEND_MULTIPLIER_STOCKCODE = null;
    public static final DomainSecuritiesError INVALID_MULTIPLIER_STOCKCODE = null;
    public static final DomainSecuritiesError INVALID_SESSION = null;
    public static final DomainSecuritiesError MAINTENANCE = null;
    public static final DomainSecuritiesError MAINTENANCE_MODE = null;
    public static final DomainSecuritiesError MARKET_CLOSE_HOLIDAYS = null;
    public static final DomainSecuritiesError MAX_ACTIVE_ORDER_PER_ASSET_REACHED = null;
    public static final DomainSecuritiesError MOCK_TRADING = null;
    public static final DomainSecuritiesError NETWORK = null;
    public static final DomainSecuritiesError NOT_IN_SECONDARY_MARKET_PERIOD = null;
    public static final DomainSecuritiesError PORTFOLIO_NOT_EXIST = null;
    public static final DomainSecuritiesError PRICE_HAS_CHANGED = null;
    public static final DomainSecuritiesError PRICE_RATE_NOT_FOUND = null;
    public static final DomainSecuritiesError PRODUCT_NOT_FOUND = null;
    public static final DomainSecuritiesError REDEEM_AMOUNT_GREATER_THAN_REDEEMABLE_AMOUNT = null;
    public static final DomainSecuritiesError SELL_ORDER_INPROGRESS = null;
    public static final DomainSecuritiesError STABLE_EARN_CANNOT_BE_SOLD_OUTSIDE_BIBIT = null;
    public static final DomainSecuritiesError STOCKBIT_GET_ACCOUNT_NOT_FOUND = null;
    public static final DomainSecuritiesError TRADING_ACCOUNT_SUSPENDED = null;
    public static final DomainSecuritiesError UNAUTHORIZED = null;
    public static final DomainSecuritiesError UNKNOWN = null;
    public static final DomainSecuritiesError USER_SHARIA_VALIDATION = null;
    public static final DomainSecuritiesError USER_SUSPEND = null;
    public static final DomainSecuritiesError USER_SUSPEND_BACK_OFFICE = null;
    public static final DomainSecuritiesError USER_SUSPEND_FORCED_SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DomainSecuritiesError[] f119103a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119104b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final DomainSecuritiesError a(String r4) {
            p.l(r4, "value");
            Iterator<E> r02 = DomainSecuritiesError.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((DomainSecuritiesError) r1).name(), r4) == false) goto L4;
        L9:
            DomainSecuritiesError r12 = (DomainSecuritiesError) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return DomainSecuritiesError.UNKNOWN;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ERROR_SYSTEM = new DomainSecuritiesError("ERROR_SYSTEM", 0);
        MAINTENANCE = new DomainSecuritiesError("MAINTENANCE", 1);
        MAINTENANCE_MODE = new DomainSecuritiesError("MAINTENANCE_MODE", 2);
        NETWORK = new DomainSecuritiesError("NETWORK", 3);
        UNKNOWN = new DomainSecuritiesError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        UNAUTHORIZED = new DomainSecuritiesError("UNAUTHORIZED", 5);
        MOCK_TRADING = new DomainSecuritiesError("MOCK_TRADING", 6);
        DAILY_MAINTENANCE_MODE = new DomainSecuritiesError("DAILY_MAINTENANCE_MODE", 7);
        USER_SUSPEND = new DomainSecuritiesError("USER_SUSPEND", 8);
        USER_SUSPEND_BACK_OFFICE = new DomainSecuritiesError("USER_SUSPEND_BACK_OFFICE", 9);
        USER_SUSPEND_FORCED_SELL = new DomainSecuritiesError("USER_SUSPEND_FORCED_SELL", 10);
        DAY_TRADE_EXCEED_TIME_LIMIT = new DomainSecuritiesError("DAY_TRADE_EXCEED_TIME_LIMIT", 11);
        DAY_TRADE_DISABLED = new DomainSecuritiesError("DAY_TRADE_DISABLED", 12);
        INVALID_MULTIPLIER_STOCKCODE = new DomainSecuritiesError("INVALID_MULTIPLIER_STOCKCODE", 13);
        INVALID_AMEND_MULTIPLIER_STOCKCODE = new DomainSecuritiesError("INVALID_AMEND_MULTIPLIER_STOCKCODE", 14);
        FR_BONDS_MARKET_CLOSED = new DomainSecuritiesError("FR_BONDS_MARKET_CLOSED", 15);
        FR_UNAVAILABLE_DUE_TO_SHARIA_RDN = new DomainSecuritiesError("FR_UNAVAILABLE_DUE_TO_SHARIA_RDN", 16);
        FR_UNAVAILABLE_DUE_TO_SHARIA_PREFERENCE = new DomainSecuritiesError("FR_UNAVAILABLE_DUE_TO_SHARIA_PREFERENCE", 17);
        PRICE_RATE_NOT_FOUND = new DomainSecuritiesError("PRICE_RATE_NOT_FOUND", 18);
        FR_IN_RECORD_DATE_PERIOD = new DomainSecuritiesError("FR_IN_RECORD_DATE_PERIOD", 19);
        PRODUCT_NOT_FOUND = new DomainSecuritiesError("PRODUCT_NOT_FOUND", 20);
        PRICE_HAS_CHANGED = new DomainSecuritiesError("PRICE_HAS_CHANGED", 21);
        STOCKBIT_GET_ACCOUNT_NOT_FOUND = new DomainSecuritiesError("STOCKBIT_GET_ACCOUNT_NOT_FOUND", 22);
        TRADING_ACCOUNT_SUSPENDED = new DomainSecuritiesError("TRADING_ACCOUNT_SUSPENDED", 23);
        FR_EXISTING_ORDER_INPROGRESS = new DomainSecuritiesError("FR_EXISTING_ORDER_INPROGRESS", 24);
        PORTFOLIO_NOT_EXIST = new DomainSecuritiesError("PORTFOLIO_NOT_EXIST", 25);
        REDEEM_AMOUNT_GREATER_THAN_REDEEMABLE_AMOUNT = new DomainSecuritiesError("REDEEM_AMOUNT_GREATER_THAN_REDEEMABLE_AMOUNT", 26);
        NOT_IN_SECONDARY_MARKET_PERIOD = new DomainSecuritiesError("NOT_IN_SECONDARY_MARKET_PERIOD", 27);
        SELL_ORDER_INPROGRESS = new DomainSecuritiesError("SELL_ORDER_INPROGRESS", 28);
        STABLE_EARN_CANNOT_BE_SOLD_OUTSIDE_BIBIT = new DomainSecuritiesError("STABLE_EARN_CANNOT_BE_SOLD_OUTSIDE_BIBIT", 29);
        USER_SHARIA_VALIDATION = new DomainSecuritiesError("USER_SHARIA_VALIDATION", 30);
        MAX_ACTIVE_ORDER_PER_ASSET_REACHED = new DomainSecuritiesError("MAX_ACTIVE_ORDER_PER_ASSET_REACHED", 31);
        INVALID_SESSION = new DomainSecuritiesError("INVALID_SESSION", 32);
        CASH_SWEEP_INACTIVE_USER = new DomainSecuritiesError("CASH_SWEEP_INACTIVE_USER", 33);
        CASH_SWEEP_INVALID_SELECTED_RDN = new DomainSecuritiesError("CASH_SWEEP_INVALID_SELECTED_RDN", 34);
        CASH_SWEEP_INVALID_MIN_AMOUNT = new DomainSecuritiesError("CASH_SWEEP_INVALID_MIN_AMOUNT", 35);
        CASH_SWEEP_MISMATCH_USER_IDENTITY = new DomainSecuritiesError("CASH_SWEEP_MISMATCH_USER_IDENTITY", 36);
        CASH_SWEEP_SUSPENDED_USER_BIBIT = new DomainSecuritiesError("CASH_SWEEP_SUSPENDED_USER_BIBIT", 37);
        CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA = new DomainSecuritiesError("CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA", 38);
        CASH_SWEEP_INSUFFICIENT_UNITS = new DomainSecuritiesError("CASH_SWEEP_INSUFFICIENT_UNITS", 39);
        CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS = new DomainSecuritiesError("CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS", 40);
        CASH_SWEEP_INACTIVE_NETBUY_BLOCK = new DomainSecuritiesError("CASH_SWEEP_INACTIVE_NETBUY_BLOCK", 41);
        CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK = new DomainSecuritiesError("CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK", 42);
        MARKET_CLOSE_HOLIDAYS = new DomainSecuritiesError("MARKET_CLOSE_HOLIDAYS", 43);
        CANT_CANCEL_ORDER_PRE_OPENING = new DomainSecuritiesError("CANT_CANCEL_ORDER_PRE_OPENING", 44);
        CANT_CANCEL_ORDER_PRE_CLOSING = new DomainSecuritiesError("CANT_CANCEL_ORDER_PRE_CLOSING", 45);
        DomainSecuritiesError[] r02 = a();
        f119103a = r02;
        f119104b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    DomainSecuritiesError(String r1, int r2) {
    }

    public static final /* synthetic */ DomainSecuritiesError[] a() {
        return new DomainSecuritiesError[]{ERROR_SYSTEM, MAINTENANCE, MAINTENANCE_MODE, NETWORK, UNKNOWN, UNAUTHORIZED, MOCK_TRADING, DAILY_MAINTENANCE_MODE, USER_SUSPEND, USER_SUSPEND_BACK_OFFICE, USER_SUSPEND_FORCED_SELL, DAY_TRADE_EXCEED_TIME_LIMIT, DAY_TRADE_DISABLED, INVALID_MULTIPLIER_STOCKCODE, INVALID_AMEND_MULTIPLIER_STOCKCODE, FR_BONDS_MARKET_CLOSED, FR_UNAVAILABLE_DUE_TO_SHARIA_RDN, FR_UNAVAILABLE_DUE_TO_SHARIA_PREFERENCE, PRICE_RATE_NOT_FOUND, FR_IN_RECORD_DATE_PERIOD, PRODUCT_NOT_FOUND, PRICE_HAS_CHANGED, STOCKBIT_GET_ACCOUNT_NOT_FOUND, TRADING_ACCOUNT_SUSPENDED, FR_EXISTING_ORDER_INPROGRESS, PORTFOLIO_NOT_EXIST, REDEEM_AMOUNT_GREATER_THAN_REDEEMABLE_AMOUNT, NOT_IN_SECONDARY_MARKET_PERIOD, SELL_ORDER_INPROGRESS, STABLE_EARN_CANNOT_BE_SOLD_OUTSIDE_BIBIT, USER_SHARIA_VALIDATION, MAX_ACTIVE_ORDER_PER_ASSET_REACHED, INVALID_SESSION, CASH_SWEEP_INACTIVE_USER, CASH_SWEEP_INVALID_SELECTED_RDN, CASH_SWEEP_INVALID_MIN_AMOUNT, CASH_SWEEP_MISMATCH_USER_IDENTITY, CASH_SWEEP_SUSPENDED_USER_BIBIT, CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA, CASH_SWEEP_INSUFFICIENT_UNITS, CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS, CASH_SWEEP_INACTIVE_NETBUY_BLOCK, CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK, MARKET_CLOSE_HOLIDAYS, CANT_CANCEL_ORDER_PRE_OPENING, CANT_CANCEL_ORDER_PRE_CLOSING};
    }

    public static kotlin.enums.a getEntries() {
        return f119104b;
    }

    public static DomainSecuritiesError valueOf(String r1) {
        return (DomainSecuritiesError) Enum.valueOf(DomainSecuritiesError.class, r1);
    }

    public static DomainSecuritiesError[] values() {
        return (DomainSecuritiesError[]) f119103a.clone();
    }

    public final boolean isErrorNonCancellationPeriod() {
        if (this != CANT_CANCEL_ORDER_PRE_OPENING) goto L5;
        return true;
    L5:
        if (this == CANT_CANCEL_ORDER_PRE_CLOSING) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isErrorSuspend() {
        if (this != USER_SUSPEND) goto L5;
        return true;
    L5:
        if (this != USER_SUSPEND_BACK_OFFICE) goto L7;
        return true;
    L7:
        if (this == USER_SUSPEND_FORCED_SELL) goto L14;
        return false;
    L14:
        return true;
    }
}
