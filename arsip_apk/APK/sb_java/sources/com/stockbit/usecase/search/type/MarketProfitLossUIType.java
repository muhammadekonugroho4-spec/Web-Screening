package com.stockbit.usecase.search.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/search/type/MarketProfitLossUIType;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "PROFIT", "LOSS", "Companion", "usecase-search"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MarketProfitLossUIType extends Enum<MarketProfitLossUIType> {
    public static final a Companion = null;
    public static final MarketProfitLossUIType LOSS = null;
    public static final MarketProfitLossUIType NEUTRAL = null;
    public static final MarketProfitLossUIType PROFIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MarketProfitLossUIType[] f160150a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160151b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final MarketProfitLossUIType a(double r4) {
            if (r4 <= 0.0d) goto L7;
            return MarketProfitLossUIType.PROFIT;
        L7:
            if (r4 >= 0.0d) goto L11;
            return MarketProfitLossUIType.LOSS;
        L11:
            return MarketProfitLossUIType.NEUTRAL;
        }

        public a() {
        }
    }

    static {
        NEUTRAL = new MarketProfitLossUIType("NEUTRAL", 0);
        PROFIT = new MarketProfitLossUIType("PROFIT", 1);
        LOSS = new MarketProfitLossUIType("LOSS", 2);
        MarketProfitLossUIType[] r02 = a();
        f160150a = r02;
        f160151b = b.a(r02);
        Companion = new a(null);
    }

    MarketProfitLossUIType(String r1, int r2) {
    }

    public static final /* synthetic */ MarketProfitLossUIType[] a() {
        return new MarketProfitLossUIType[]{NEUTRAL, PROFIT, LOSS};
    }

    public static kotlin.enums.a getEntries() {
        return f160151b;
    }

    public static MarketProfitLossUIType valueOf(String r1) {
        return (MarketProfitLossUIType) Enum.valueOf(MarketProfitLossUIType.class, r1);
    }

    public static MarketProfitLossUIType[] values() {
        return (MarketProfitLossUIType[]) f160150a.clone();
    }
}
