package com.stockbit.usecase.securities.model.portfolio;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/stockbit/usecase/securities/model/portfolio/StockSortType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NameAscending", "NameDescending", "InvestedHighToLow", "InvestedLowToHigh", "MarketHighToLow", "MarketLowToHigh", "PlHighToLow", "PlLowToHigh", "GainHighToLow", "GainLowToHigh", "Custom", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum StockSortType extends Enum<StockSortType> {
    public static final a Companion = null;
    public static final StockSortType Custom = null;
    public static final StockSortType GainHighToLow = null;
    public static final StockSortType GainLowToHigh = null;
    public static final StockSortType InvestedHighToLow = null;
    public static final StockSortType InvestedLowToHigh = null;
    public static final StockSortType MarketHighToLow = null;
    public static final StockSortType MarketLowToHigh = null;
    public static final StockSortType NameAscending = null;
    public static final StockSortType NameDescending = null;
    public static final StockSortType PlHighToLow = null;
    public static final StockSortType PlLowToHigh = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockSortType[] f161715a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161716b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final StockSortType a(Integer r7) {
            StockSortType[] r02 = StockSortType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            StockSortType r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return StockSortType.NameAscending;
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
        NameAscending = new StockSortType("NameAscending", 0, 0);
        NameDescending = new StockSortType("NameDescending", 1, 1);
        InvestedHighToLow = new StockSortType("InvestedHighToLow", 2, 2);
        InvestedLowToHigh = new StockSortType("InvestedLowToHigh", 3, 3);
        MarketHighToLow = new StockSortType("MarketHighToLow", 4, 4);
        MarketLowToHigh = new StockSortType("MarketLowToHigh", 5, 5);
        PlHighToLow = new StockSortType("PlHighToLow", 6, 6);
        PlLowToHigh = new StockSortType("PlLowToHigh", 7, 7);
        GainHighToLow = new StockSortType("GainHighToLow", 8, 8);
        GainLowToHigh = new StockSortType("GainLowToHigh", 9, 9);
        Custom = new StockSortType("Custom", 10, 10);
        StockSortType[] r02 = a();
        f161715a = r02;
        f161716b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    StockSortType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StockSortType[] a() {
        return new StockSortType[]{NameAscending, NameDescending, InvestedHighToLow, InvestedLowToHigh, MarketHighToLow, MarketLowToHigh, PlHighToLow, PlLowToHigh, GainHighToLow, GainLowToHigh, Custom};
    }

    public static kotlin.enums.a getEntries() {
        return f161716b;
    }

    public static StockSortType valueOf(String r1) {
        return (StockSortType) Enum.valueOf(StockSortType.class, r1);
    }

    public static StockSortType[] values() {
        return (StockSortType[]) f161715a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
