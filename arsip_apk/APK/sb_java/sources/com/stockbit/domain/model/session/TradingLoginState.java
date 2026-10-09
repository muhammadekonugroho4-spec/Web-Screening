package com.stockbit.domain.model.session;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/session/TradingLoginState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EMPTY", "VIRTUAL", "STOCKBIT", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingLoginState extends Enum<TradingLoginState> {
    public static final a Companion = null;
    public static final TradingLoginState EMPTY = null;
    public static final TradingLoginState STOCKBIT = null;
    public static final TradingLoginState VIRTUAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingLoginState[] f85742a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85743b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TradingLoginState a(Integer r7) {
            TradingLoginState[] r02 = TradingLoginState.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            TradingLoginState r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return TradingLoginState.EMPTY;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            r3 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        EMPTY = new TradingLoginState("EMPTY", 0, 0);
        VIRTUAL = new TradingLoginState("VIRTUAL", 1, 1);
        STOCKBIT = new TradingLoginState("STOCKBIT", 2, 3);
        TradingLoginState[] r02 = a();
        f85742a = r02;
        f85743b = b.a(r02);
        Companion = new a(null);
    }

    TradingLoginState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingLoginState[] a() {
        return new TradingLoginState[]{EMPTY, VIRTUAL, STOCKBIT};
    }

    public static kotlin.enums.a getEntries() {
        return f85743b;
    }

    public static TradingLoginState valueOf(String r1) {
        return (TradingLoginState) Enum.valueOf(TradingLoginState.class, r1);
    }

    public static TradingLoginState[] values() {
        return (TradingLoginState[]) f85742a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
