package com.stockbit.usecase.tradingperformance.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/tradingperformance/model/TradesPerformanceType;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "MOST_TRADED", "TOP_GAINER_BY_RUPIAH", "TOP_GAINER_BY_PERCENTAGE", "TOP_LOSS_BY_RUPIAH", "TOP_LOSS_BY_PERCENTAGE", "DIVIDEND_RECEIVED", "usecase-tradingperformance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TradesPerformanceType extends Enum<TradesPerformanceType> {
    public static final TradesPerformanceType DIVIDEND_RECEIVED = null;
    public static final TradesPerformanceType MOST_TRADED = null;
    public static final TradesPerformanceType TOP_GAINER_BY_PERCENTAGE = null;
    public static final TradesPerformanceType TOP_GAINER_BY_RUPIAH = null;
    public static final TradesPerformanceType TOP_LOSS_BY_PERCENTAGE = null;
    public static final TradesPerformanceType TOP_LOSS_BY_RUPIAH = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradesPerformanceType[] f163449a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163450b = null;
    private final String eventName;

    static {
        MOST_TRADED = new TradesPerformanceType("MOST_TRADED", 0, "Most Traded");
        TOP_GAINER_BY_RUPIAH = new TradesPerformanceType("TOP_GAINER_BY_RUPIAH", 1, "Top Gain Rp");
        TOP_GAINER_BY_PERCENTAGE = new TradesPerformanceType("TOP_GAINER_BY_PERCENTAGE", 2, "Top Gain %");
        TOP_LOSS_BY_RUPIAH = new TradesPerformanceType("TOP_LOSS_BY_RUPIAH", 3, "Top Loss Rp");
        TOP_LOSS_BY_PERCENTAGE = new TradesPerformanceType("TOP_LOSS_BY_PERCENTAGE", 4, "Top Loss %");
        DIVIDEND_RECEIVED = new TradesPerformanceType("DIVIDEND_RECEIVED", 5, "Dividend Received");
        TradesPerformanceType[] r02 = a();
        f163449a = r02;
        f163450b = kotlin.enums.b.a(r02);
    }

    TradesPerformanceType(String r1, int r2, String r3) {
        this.eventName = r3;
    }

    public static final /* synthetic */ TradesPerformanceType[] a() {
        return new TradesPerformanceType[]{MOST_TRADED, TOP_GAINER_BY_RUPIAH, TOP_GAINER_BY_PERCENTAGE, TOP_LOSS_BY_RUPIAH, TOP_LOSS_BY_PERCENTAGE, DIVIDEND_RECEIVED};
    }

    public static kotlin.enums.a getEntries() {
        return f163450b;
    }

    public static TradesPerformanceType valueOf(String r1) {
        return (TradesPerformanceType) Enum.valueOf(TradesPerformanceType.class, r1);
    }

    public static TradesPerformanceType[] values() {
        return (TradesPerformanceType[]) f163449a.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}
