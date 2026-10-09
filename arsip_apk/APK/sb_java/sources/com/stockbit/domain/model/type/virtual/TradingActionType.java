package com.stockbit.domain.model.type.virtual;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/domain/model/type/virtual/TradingActionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BUY", "SELL", "EXERCISE", "AMEND_BUY", "AMEND_SELL", "WITHDRAW", "DEPOSIT", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingActionType extends Enum<TradingActionType> {
    public static final TradingActionType AMEND_BUY = null;
    public static final TradingActionType AMEND_SELL = null;
    public static final TradingActionType BUY = null;
    public static final a Companion = null;
    public static final TradingActionType DEPOSIT = null;
    public static final TradingActionType EXERCISE = null;
    public static final TradingActionType SELL = null;
    public static final TradingActionType WITHDRAW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingActionType[] f86538a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86539b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        BUY = new TradingActionType("BUY", 0, "BUY");
        SELL = new TradingActionType("SELL", 1, "SELL");
        EXERCISE = new TradingActionType("EXERCISE", 2, "EXC");
        AMEND_BUY = new TradingActionType("AMEND_BUY", 3, "AMEND_BUY");
        AMEND_SELL = new TradingActionType("AMEND_SELL", 4, "AMEND_SELL");
        WITHDRAW = new TradingActionType("WITHDRAW", 5, "WITHDRAW");
        DEPOSIT = new TradingActionType("DEPOSIT", 6, "DEPOSIT");
        TradingActionType[] r02 = a();
        f86538a = r02;
        f86539b = b.a(r02);
        Companion = new a(null);
    }

    TradingActionType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingActionType[] a() {
        return new TradingActionType[]{BUY, SELL, EXERCISE, AMEND_BUY, AMEND_SELL, WITHDRAW, DEPOSIT};
    }

    public static kotlin.enums.a getEntries() {
        return f86539b;
    }

    public static TradingActionType valueOf(String r1) {
        return (TradingActionType) Enum.valueOf(TradingActionType.class, r1);
    }

    public static TradingActionType[] values() {
        return (TradingActionType[]) f86538a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
