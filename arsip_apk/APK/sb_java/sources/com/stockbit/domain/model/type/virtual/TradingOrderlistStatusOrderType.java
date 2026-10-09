package com.stockbit.domain.model.type.virtual;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/stockbit/domain/model/type/virtual/TradingOrderlistStatusOrderType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPEN", "PARTIAL", "MATCH", "WITHDRAWN", "AMENDED", "REJECTED", "REQUEST_CANCEL", "REQUEST_AMEND", "PENDING", "APPROVED", "DONE", "OPEN_CHAR", "EMPTY", "SUCCESS", "PROCESSED", "ACTIVE", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingOrderlistStatusOrderType extends Enum<TradingOrderlistStatusOrderType> {
    public static final TradingOrderlistStatusOrderType ACTIVE = null;
    public static final TradingOrderlistStatusOrderType AMENDED = null;
    public static final TradingOrderlistStatusOrderType APPROVED = null;
    public static final a Companion = null;
    public static final TradingOrderlistStatusOrderType DONE = null;
    public static final TradingOrderlistStatusOrderType EMPTY = null;
    public static final TradingOrderlistStatusOrderType MATCH = null;
    public static final TradingOrderlistStatusOrderType OPEN = null;
    public static final TradingOrderlistStatusOrderType OPEN_CHAR = null;
    public static final TradingOrderlistStatusOrderType PARTIAL = null;
    public static final TradingOrderlistStatusOrderType PENDING = null;
    public static final TradingOrderlistStatusOrderType PROCESSED = null;
    public static final TradingOrderlistStatusOrderType REJECTED = null;
    public static final TradingOrderlistStatusOrderType REQUEST_AMEND = null;
    public static final TradingOrderlistStatusOrderType REQUEST_CANCEL = null;
    public static final TradingOrderlistStatusOrderType SUCCESS = null;
    public static final TradingOrderlistStatusOrderType WITHDRAWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingOrderlistStatusOrderType[] f86542a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86543b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        OPEN = new TradingOrderlistStatusOrderType("OPEN", 0, "OPEN");
        PARTIAL = new TradingOrderlistStatusOrderType("PARTIAL", 1, "PARTIAL");
        MATCH = new TradingOrderlistStatusOrderType("MATCH", 2, "MATCH");
        WITHDRAWN = new TradingOrderlistStatusOrderType("WITHDRAWN", 3, "WITHDRAWN");
        AMENDED = new TradingOrderlistStatusOrderType("AMENDED", 4, "AMENDED");
        REJECTED = new TradingOrderlistStatusOrderType("REJECTED", 5, "REJECTED");
        REQUEST_CANCEL = new TradingOrderlistStatusOrderType("REQUEST_CANCEL", 6, "REQUEST_CANCEL");
        REQUEST_AMEND = new TradingOrderlistStatusOrderType("REQUEST_AMEND", 7, "REQUEST_AMEND");
        PENDING = new TradingOrderlistStatusOrderType("PENDING", 8, "PENDING");
        APPROVED = new TradingOrderlistStatusOrderType("APPROVED", 9, "APPROVED");
        DONE = new TradingOrderlistStatusOrderType("DONE", 10, "DONE");
        OPEN_CHAR = new TradingOrderlistStatusOrderType("OPEN_CHAR", 11, "0");
        EMPTY = new TradingOrderlistStatusOrderType("EMPTY", 12, "");
        SUCCESS = new TradingOrderlistStatusOrderType("SUCCESS", 13, "SUCCESS");
        PROCESSED = new TradingOrderlistStatusOrderType("PROCESSED", 14, "PROCESSED");
        ACTIVE = new TradingOrderlistStatusOrderType("ACTIVE", 15, "ACTIVE");
        TradingOrderlistStatusOrderType[] r02 = a();
        f86542a = r02;
        f86543b = b.a(r02);
        Companion = new a(null);
    }

    TradingOrderlistStatusOrderType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingOrderlistStatusOrderType[] a() {
        return new TradingOrderlistStatusOrderType[]{OPEN, PARTIAL, MATCH, WITHDRAWN, AMENDED, REJECTED, REQUEST_CANCEL, REQUEST_AMEND, PENDING, APPROVED, DONE, OPEN_CHAR, EMPTY, SUCCESS, PROCESSED, ACTIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f86543b;
    }

    public static TradingOrderlistStatusOrderType valueOf(String r1) {
        return (TradingOrderlistStatusOrderType) Enum.valueOf(TradingOrderlistStatusOrderType.class, r1);
    }

    public static TradingOrderlistStatusOrderType[] values() {
        return (TradingOrderlistStatusOrderType[]) f86542a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
