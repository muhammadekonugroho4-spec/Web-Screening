package com.stockbit.domain.model.type.securities;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/stockbit/domain/model/type/securities/TradingTrackerType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AMEND_BUY_LOT", "AMEND_BUY_PRICE", "AMEND_BUY_ADD", "AMEND_BUY_SUBTRACT", "AMEND_BUY_TYPE_IN", "PRICE_EXERCISE_ADD", "PRICE_EXERCISE_SUBTRACT", "PRICE_EXERCISE_TYPE_IN", "OTHER", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingTrackerType extends Enum<TradingTrackerType> {
    public static final TradingTrackerType AMEND_BUY_ADD = null;
    public static final TradingTrackerType AMEND_BUY_LOT = null;
    public static final TradingTrackerType AMEND_BUY_PRICE = null;
    public static final TradingTrackerType AMEND_BUY_SUBTRACT = null;
    public static final TradingTrackerType AMEND_BUY_TYPE_IN = null;
    public static final a Companion = null;
    public static final TradingTrackerType OTHER = null;
    public static final TradingTrackerType PRICE_EXERCISE_ADD = null;
    public static final TradingTrackerType PRICE_EXERCISE_SUBTRACT = null;
    public static final TradingTrackerType PRICE_EXERCISE_TYPE_IN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingTrackerType[] f86451a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86452b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TradingTrackerType a(int r4) {
            Iterator<E> r02 = TradingTrackerType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L9;
            TradingTrackerType r1 = (TradingTrackerType) r02.next();
            if (r1.getValue() != r4) goto L4;
            return r1;
        L9:
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        public a() {
        }
    }

    static {
        AMEND_BUY_LOT = new TradingTrackerType("AMEND_BUY_LOT", 0, 1);
        AMEND_BUY_PRICE = new TradingTrackerType("AMEND_BUY_PRICE", 1, 2);
        AMEND_BUY_ADD = new TradingTrackerType("AMEND_BUY_ADD", 2, 3);
        AMEND_BUY_SUBTRACT = new TradingTrackerType("AMEND_BUY_SUBTRACT", 3, 4);
        AMEND_BUY_TYPE_IN = new TradingTrackerType("AMEND_BUY_TYPE_IN", 4, 5);
        PRICE_EXERCISE_ADD = new TradingTrackerType("PRICE_EXERCISE_ADD", 5, 6);
        PRICE_EXERCISE_SUBTRACT = new TradingTrackerType("PRICE_EXERCISE_SUBTRACT", 6, 7);
        PRICE_EXERCISE_TYPE_IN = new TradingTrackerType("PRICE_EXERCISE_TYPE_IN", 7, 8);
        OTHER = new TradingTrackerType("OTHER", 8, 0);
        TradingTrackerType[] r02 = a();
        f86451a = r02;
        f86452b = b.a(r02);
        Companion = new a(null);
    }

    TradingTrackerType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingTrackerType[] a() {
        return new TradingTrackerType[]{AMEND_BUY_LOT, AMEND_BUY_PRICE, AMEND_BUY_ADD, AMEND_BUY_SUBTRACT, AMEND_BUY_TYPE_IN, PRICE_EXERCISE_ADD, PRICE_EXERCISE_SUBTRACT, PRICE_EXERCISE_TYPE_IN, OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f86452b;
    }

    public static TradingTrackerType valueOf(String r1) {
        return (TradingTrackerType) Enum.valueOf(TradingTrackerType.class, r1);
    }

    public static TradingTrackerType[] values() {
        return (TradingTrackerType[]) f86451a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
