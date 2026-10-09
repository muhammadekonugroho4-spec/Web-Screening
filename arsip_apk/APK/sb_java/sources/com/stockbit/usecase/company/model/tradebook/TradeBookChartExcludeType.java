package com.stockbit.usecase.company.model.tradebook;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/company/model/tradebook/TradeBookChartExcludeType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "TRADE_BOOK_DATA_MODE_EXCLUDE_PRE", "TRADE_BOOK_DATA_MODE_EXCLUDE_POST", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TradeBookChartExcludeType extends Enum<TradeBookChartExcludeType> {
    public static final TradeBookChartExcludeType TRADE_BOOK_DATA_MODE_EXCLUDE_POST = null;
    public static final TradeBookChartExcludeType TRADE_BOOK_DATA_MODE_EXCLUDE_PRE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradeBookChartExcludeType[] f156586a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156587b = null;
    private final String label;

    static {
        TRADE_BOOK_DATA_MODE_EXCLUDE_PRE = new TradeBookChartExcludeType("TRADE_BOOK_DATA_MODE_EXCLUDE_PRE", 0, "Exclude Pre Opening");
        TRADE_BOOK_DATA_MODE_EXCLUDE_POST = new TradeBookChartExcludeType("TRADE_BOOK_DATA_MODE_EXCLUDE_POST", 1, "Exclude Post Closing");
        TradeBookChartExcludeType[] r02 = a();
        f156586a = r02;
        f156587b = kotlin.enums.b.a(r02);
    }

    TradeBookChartExcludeType(String r1, int r2, String r3) {
        this.label = r3;
    }

    public static final /* synthetic */ TradeBookChartExcludeType[] a() {
        return new TradeBookChartExcludeType[]{TRADE_BOOK_DATA_MODE_EXCLUDE_PRE, TRADE_BOOK_DATA_MODE_EXCLUDE_POST};
    }

    public static kotlin.enums.a getEntries() {
        return f156587b;
    }

    public static TradeBookChartExcludeType valueOf(String r1) {
        return (TradeBookChartExcludeType) Enum.valueOf(TradeBookChartExcludeType.class, r1);
    }

    public static TradeBookChartExcludeType[] values() {
        return (TradeBookChartExcludeType[]) f156586a.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
