package com.stockbit.domain.model.type.securities;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\b\u0086\u0081\u0002\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, d2 = {"Lcom/stockbit/domain/model/type/securities/TradingActionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BUY", "SELL", "BUY_FR", "SELL_FR", "REFUND_FR", "COUPON_FR", "EXERCISE", "AMEND_BUY", "AMEND_SELL", "WITHDRAW", "DEPOSIT", "DIVIDEND", "STOCK_BONUS", "IPO", "REFUND", "STOCK_DIVIDEN", "CASH_DIVIDEN", "WARRAN", "RIGHT", "EIPO_LOCK", "EIPO_REFUND", "METERAI", "CASHBACK_STOCKBIT", "CASHBACK_BROKER_FEE", "CONVERSION", "DATA_FEE", "COUPON_KAEF01CB", "COUPON_SBN", "LATE_FEE", "FORCE_SELL_DAY_TRADE", "STAMP_DUTY_WITHDRAW", "IFA_WITHDRAW", "SBN_WITHDRAW", "CAPITAL_REDUCTION", "INTRA_MOVE_STOCK", "INTRA_MOVE_STOCK_INCREASE", "SWEEP_IN", "SWEEP_OUT", "OTC_FEE", "SELL_MUTUAL_FUND", "TENDER_OFFER", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingActionType extends Enum<TradingActionType> {
    public static final TradingActionType AMEND_BUY = null;
    public static final TradingActionType AMEND_SELL = null;
    public static final TradingActionType BUY = null;
    public static final TradingActionType BUY_FR = null;
    public static final TradingActionType CAPITAL_REDUCTION = null;
    public static final TradingActionType CASHBACK_BROKER_FEE = null;
    public static final TradingActionType CASHBACK_STOCKBIT = null;
    public static final TradingActionType CASH_DIVIDEN = null;
    public static final TradingActionType CONVERSION = null;
    public static final TradingActionType COUPON_FR = null;
    public static final TradingActionType COUPON_KAEF01CB = null;
    public static final TradingActionType COUPON_SBN = null;
    public static final a Companion = null;
    public static final TradingActionType DATA_FEE = null;
    public static final TradingActionType DEPOSIT = null;
    public static final TradingActionType DIVIDEND = null;
    public static final TradingActionType EIPO_LOCK = null;
    public static final TradingActionType EIPO_REFUND = null;
    public static final TradingActionType EXERCISE = null;
    public static final TradingActionType FORCE_SELL_DAY_TRADE = null;
    public static final TradingActionType IFA_WITHDRAW = null;
    public static final TradingActionType INTRA_MOVE_STOCK = null;
    public static final TradingActionType INTRA_MOVE_STOCK_INCREASE = null;
    public static final TradingActionType IPO = null;
    public static final TradingActionType LATE_FEE = null;
    public static final TradingActionType METERAI = null;
    public static final TradingActionType OTC_FEE = null;
    public static final TradingActionType REFUND = null;
    public static final TradingActionType REFUND_FR = null;
    public static final TradingActionType RIGHT = null;
    public static final TradingActionType SBN_WITHDRAW = null;
    public static final TradingActionType SELL = null;
    public static final TradingActionType SELL_FR = null;
    public static final TradingActionType SELL_MUTUAL_FUND = null;
    public static final TradingActionType STAMP_DUTY_WITHDRAW = null;
    public static final TradingActionType STOCK_BONUS = null;
    public static final TradingActionType STOCK_DIVIDEN = null;
    public static final TradingActionType SWEEP_IN = null;
    public static final TradingActionType SWEEP_OUT = null;
    public static final TradingActionType TENDER_OFFER = null;
    public static final TradingActionType WARRAN = null;
    public static final TradingActionType WITHDRAW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingActionType[] f86439a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86440b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TradingActionType a(String r4) {
            Iterator<E> r02 = TradingActionType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((TradingActionType) r1).getValue(), r4) == false) goto L4;
        L10:
            return (TradingActionType) r1;
        L8:
            r1 = null;
            goto L10
        }

        public a() {
        }
    }

    static {
        BUY = new TradingActionType("BUY", 0, "BUY");
        SELL = new TradingActionType("SELL", 1, "SELL");
        BUY_FR = new TradingActionType("BUY_FR", 2, "BUY_FR");
        SELL_FR = new TradingActionType("SELL_FR", 3, "SELL_FR");
        REFUND_FR = new TradingActionType("REFUND_FR", 4, "REFUND_FR");
        COUPON_FR = new TradingActionType("COUPON_FR", 5, "COUPON_FR");
        EXERCISE = new TradingActionType("EXERCISE", 6, "EXC");
        AMEND_BUY = new TradingActionType("AMEND_BUY", 7, "AMEND_BUY");
        AMEND_SELL = new TradingActionType("AMEND_SELL", 8, "AMEND_SELL");
        WITHDRAW = new TradingActionType("WITHDRAW", 9, "WITHDRAW");
        DEPOSIT = new TradingActionType("DEPOSIT", 10, "DEPOSIT");
        DIVIDEND = new TradingActionType("DIVIDEND", 11, "DIV");
        STOCK_BONUS = new TradingActionType("STOCK_BONUS", 12, "STOCK_BONUS");
        IPO = new TradingActionType("IPO", 13, "IPO");
        REFUND = new TradingActionType("REFUND", 14, "REFUND");
        STOCK_DIVIDEN = new TradingActionType("STOCK_DIVIDEN", 15, "STOCKDIVIDEN");
        CASH_DIVIDEN = new TradingActionType("CASH_DIVIDEN", 16, "CASHDIVIDEN");
        WARRAN = new TradingActionType("WARRAN", 17, "WARRAN");
        RIGHT = new TradingActionType("RIGHT", 18, "RIGHT");
        EIPO_LOCK = new TradingActionType("EIPO_LOCK", 19, "EIPOLOCK");
        EIPO_REFUND = new TradingActionType("EIPO_REFUND", 20, "EIPOREFUND");
        METERAI = new TradingActionType("METERAI", 21, "METERAI");
        CASHBACK_STOCKBIT = new TradingActionType("CASHBACK_STOCKBIT", 22, "CASHBACK STOCKBIT");
        CASHBACK_BROKER_FEE = new TradingActionType("CASHBACK_BROKER_FEE", 23, "CASHBACK BROKER FEE");
        CONVERSION = new TradingActionType("CONVERSION", 24, "CONVERSION");
        DATA_FEE = new TradingActionType("DATA_FEE", 25, "DATA FEE");
        COUPON_KAEF01CB = new TradingActionType("COUPON_KAEF01CB", 26, "COUPON_KAEF01CB");
        COUPON_SBN = new TradingActionType("COUPON_SBN", 27, "COUPON_SBN");
        LATE_FEE = new TradingActionType("LATE_FEE", 28, "LATE FEE");
        FORCE_SELL_DAY_TRADE = new TradingActionType("FORCE_SELL_DAY_TRADE", 29, "FORCE SELL DAY TRADE");
        STAMP_DUTY_WITHDRAW = new TradingActionType("STAMP_DUTY_WITHDRAW", 30, "STAMP_DUTY_WITHDRAW");
        IFA_WITHDRAW = new TradingActionType("IFA_WITHDRAW", 31, "IFA_WITHDRAW");
        SBN_WITHDRAW = new TradingActionType("SBN_WITHDRAW", 32, "SBN_WITHDRAW");
        CAPITAL_REDUCTION = new TradingActionType("CAPITAL_REDUCTION", 33, "CAPITAL_REDUCTION");
        INTRA_MOVE_STOCK = new TradingActionType("INTRA_MOVE_STOCK", 34, "INTRA_MOVE_STOCK");
        INTRA_MOVE_STOCK_INCREASE = new TradingActionType("INTRA_MOVE_STOCK_INCREASE", 35, "INTRA_MOVE_STOCK_INCREASE");
        SWEEP_IN = new TradingActionType("SWEEP_IN", 36, "SWEEP_IN");
        SWEEP_OUT = new TradingActionType("SWEEP_OUT", 37, "SWEEP_OUT");
        OTC_FEE = new TradingActionType("OTC_FEE", 38, "OTC_FEE");
        SELL_MUTUAL_FUND = new TradingActionType("SELL_MUTUAL_FUND", 39, "SELL_MUTUAL_FUND");
        TENDER_OFFER = new TradingActionType("TENDER_OFFER", 40, "TENDER_OFFER");
        TradingActionType[] r02 = a();
        f86439a = r02;
        f86440b = b.a(r02);
        Companion = new a(null);
    }

    TradingActionType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingActionType[] a() {
        return new TradingActionType[]{BUY, SELL, BUY_FR, SELL_FR, REFUND_FR, COUPON_FR, EXERCISE, AMEND_BUY, AMEND_SELL, WITHDRAW, DEPOSIT, DIVIDEND, STOCK_BONUS, IPO, REFUND, STOCK_DIVIDEN, CASH_DIVIDEN, WARRAN, RIGHT, EIPO_LOCK, EIPO_REFUND, METERAI, CASHBACK_STOCKBIT, CASHBACK_BROKER_FEE, CONVERSION, DATA_FEE, COUPON_KAEF01CB, COUPON_SBN, LATE_FEE, FORCE_SELL_DAY_TRADE, STAMP_DUTY_WITHDRAW, IFA_WITHDRAW, SBN_WITHDRAW, CAPITAL_REDUCTION, INTRA_MOVE_STOCK, INTRA_MOVE_STOCK_INCREASE, SWEEP_IN, SWEEP_OUT, OTC_FEE, SELL_MUTUAL_FUND, TENDER_OFFER};
    }

    public static kotlin.enums.a getEntries() {
        return f86440b;
    }

    public static TradingActionType valueOf(String r1) {
        return (TradingActionType) Enum.valueOf(TradingActionType.class, r1);
    }

    public static TradingActionType[] values() {
        return (TradingActionType[]) f86439a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
