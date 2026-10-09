package com.stockbit.usecase.transaction.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0000J\u0006\u0010\u0016\u001a\u00020\u0000J\u0006\u0010\u0017\u001a\u00020\u0000J\u0006\u0010\u0018\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/usecase/transaction/model/type/CounterPartyActiveSortType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "QUEUE_ASCENDING", "QUEUE_DESCENDING", "OPEN_ASCENDING", "OPEN_DESCENDING", "LOT_ASCENDING", "LOT_DESCENDING", "TIME_ASCENDING", "TIME_DESCENDING", "isQueue", "", "isOpen", "isLot", "isTime", "getSortByQueue", "getSortByOpen", "getSortByLot", "getSortByTime", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CounterPartyActiveSortType extends Enum<CounterPartyActiveSortType> {
    public static final CounterPartyActiveSortType LOT_ASCENDING = null;
    public static final CounterPartyActiveSortType LOT_DESCENDING = null;
    public static final CounterPartyActiveSortType OPEN_ASCENDING = null;
    public static final CounterPartyActiveSortType OPEN_DESCENDING = null;
    public static final CounterPartyActiveSortType QUEUE_ASCENDING = null;
    public static final CounterPartyActiveSortType QUEUE_DESCENDING = null;
    public static final CounterPartyActiveSortType TIME_ASCENDING = null;
    public static final CounterPartyActiveSortType TIME_DESCENDING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CounterPartyActiveSortType[] f163944a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f163945b = null;
    private final String value;

    static {
        QUEUE_ASCENDING = new CounterPartyActiveSortType("QUEUE_ASCENDING", 0, "QUEUE_ASCENDING");
        QUEUE_DESCENDING = new CounterPartyActiveSortType("QUEUE_DESCENDING", 1, "QUEUE_DESCENDING");
        OPEN_ASCENDING = new CounterPartyActiveSortType("OPEN_ASCENDING", 2, "OPEN_ASCENDING");
        OPEN_DESCENDING = new CounterPartyActiveSortType("OPEN_DESCENDING", 3, "OPEN_DESCENDING");
        LOT_ASCENDING = new CounterPartyActiveSortType("LOT_ASCENDING", 4, "LOT_ASCENDING");
        LOT_DESCENDING = new CounterPartyActiveSortType("LOT_DESCENDING", 5, "LOT_DESCENDING");
        TIME_ASCENDING = new CounterPartyActiveSortType("TIME_ASCENDING", 6, "TIME_ASCENDING");
        TIME_DESCENDING = new CounterPartyActiveSortType("TIME_DESCENDING", 7, "TIME_DESCENDING");
        CounterPartyActiveSortType[] r02 = a();
        f163944a = r02;
        f163945b = b.a(r02);
    }

    CounterPartyActiveSortType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ CounterPartyActiveSortType[] a() {
        return new CounterPartyActiveSortType[]{QUEUE_ASCENDING, QUEUE_DESCENDING, OPEN_ASCENDING, OPEN_DESCENDING, LOT_ASCENDING, LOT_DESCENDING, TIME_ASCENDING, TIME_DESCENDING};
    }

    public static a getEntries() {
        return f163945b;
    }

    public static CounterPartyActiveSortType valueOf(String r1) {
        return (CounterPartyActiveSortType) Enum.valueOf(CounterPartyActiveSortType.class, r1);
    }

    public static CounterPartyActiveSortType[] values() {
        return (CounterPartyActiveSortType[]) f163944a.clone();
    }

    public final CounterPartyActiveSortType getSortByLot() {
        CounterPartyActiveSortType r02 = LOT_ASCENDING;
        if (this == r02) goto L5;
        return r02;
    L5:
        return LOT_DESCENDING;
    }

    public final CounterPartyActiveSortType getSortByOpen() {
        CounterPartyActiveSortType r02 = OPEN_ASCENDING;
        if (this == r02) goto L5;
        return r02;
    L5:
        return OPEN_DESCENDING;
    }

    public final CounterPartyActiveSortType getSortByQueue() {
        CounterPartyActiveSortType r02 = QUEUE_ASCENDING;
        if (this == r02) goto L5;
        return r02;
    L5:
        return QUEUE_DESCENDING;
    }

    public final CounterPartyActiveSortType getSortByTime() {
        CounterPartyActiveSortType r02 = TIME_ASCENDING;
        if (this == r02) goto L5;
        return r02;
    L5:
        return TIME_DESCENDING;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isLot() {
        if (this != LOT_DESCENDING) goto L5;
        return true;
    L5:
        if (this == LOT_ASCENDING) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isOpen() {
        if (this != OPEN_DESCENDING) goto L5;
        return true;
    L5:
        if (this == OPEN_ASCENDING) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isQueue() {
        if (this != QUEUE_DESCENDING) goto L5;
        return true;
    L5:
        if (this == QUEUE_ASCENDING) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isTime() {
        if (this != TIME_DESCENDING) goto L5;
        return true;
    L5:
        if (this == TIME_ASCENDING) goto L11;
        return false;
    L11:
        return true;
    }
}
