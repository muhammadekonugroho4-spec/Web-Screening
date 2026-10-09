package com.stockbit.usecase.securities.param;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/securities/param/GetTradingInfoTypeParam;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURE_UNSPECIFIED", "FEATURE_DAY_TRADE", "FEATURE_SPLIT_ORDER", "FEATURE_CASH_SWEEP", "FEATURE_MARKET_CYCLE", "FEATURE_ORDER_COUNT_LIMIT", "FEATURE_MARGIN_TRADING", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum GetTradingInfoTypeParam extends Enum<GetTradingInfoTypeParam> {
    public static final a Companion = null;
    public static final GetTradingInfoTypeParam FEATURE_CASH_SWEEP = null;
    public static final GetTradingInfoTypeParam FEATURE_DAY_TRADE = null;
    public static final GetTradingInfoTypeParam FEATURE_MARGIN_TRADING = null;
    public static final GetTradingInfoTypeParam FEATURE_MARKET_CYCLE = null;
    public static final GetTradingInfoTypeParam FEATURE_ORDER_COUNT_LIMIT = null;
    public static final GetTradingInfoTypeParam FEATURE_SPLIT_ORDER = null;
    public static final GetTradingInfoTypeParam FEATURE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GetTradingInfoTypeParam[] f161912a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161913b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        FEATURE_UNSPECIFIED = new GetTradingInfoTypeParam("FEATURE_UNSPECIFIED", 0);
        FEATURE_DAY_TRADE = new GetTradingInfoTypeParam("FEATURE_DAY_TRADE", 1);
        FEATURE_SPLIT_ORDER = new GetTradingInfoTypeParam("FEATURE_SPLIT_ORDER", 2);
        FEATURE_CASH_SWEEP = new GetTradingInfoTypeParam("FEATURE_CASH_SWEEP", 3);
        FEATURE_MARKET_CYCLE = new GetTradingInfoTypeParam("FEATURE_MARKET_CYCLE", 4);
        FEATURE_ORDER_COUNT_LIMIT = new GetTradingInfoTypeParam("FEATURE_ORDER_COUNT_LIMIT", 5);
        FEATURE_MARGIN_TRADING = new GetTradingInfoTypeParam("FEATURE_MARGIN_TRADING", 6);
        GetTradingInfoTypeParam[] r02 = a();
        f161912a = r02;
        f161913b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    GetTradingInfoTypeParam(String r1, int r2) {
    }

    public static final /* synthetic */ GetTradingInfoTypeParam[] a() {
        return new GetTradingInfoTypeParam[]{FEATURE_UNSPECIFIED, FEATURE_DAY_TRADE, FEATURE_SPLIT_ORDER, FEATURE_CASH_SWEEP, FEATURE_MARKET_CYCLE, FEATURE_ORDER_COUNT_LIMIT, FEATURE_MARGIN_TRADING};
    }

    public static kotlin.enums.a getEntries() {
        return f161913b;
    }

    public static GetTradingInfoTypeParam valueOf(String r1) {
        return (GetTradingInfoTypeParam) Enum.valueOf(GetTradingInfoTypeParam.class, r1);
    }

    public static GetTradingInfoTypeParam[] values() {
        return (GetTradingInfoTypeParam[]) f161912a.clone();
    }
}
