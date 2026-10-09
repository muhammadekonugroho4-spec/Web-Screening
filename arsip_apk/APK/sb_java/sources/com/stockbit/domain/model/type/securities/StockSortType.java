package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/stockbit/domain/model/type/securities/StockSortType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NameAscending", "NameDescending", "InvestedHighToLow", "InvestedLowToHigh", "PlHighToLow", "PlLowToHigh", "GainHighToLow", "GainLowToHigh", "Custom", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StockSortType extends Enum<StockSortType> {
    public static final a Companion = null;
    public static final StockSortType Custom = null;
    public static final StockSortType GainHighToLow = null;
    public static final StockSortType GainLowToHigh = null;
    public static final StockSortType InvestedHighToLow = null;
    public static final StockSortType InvestedLowToHigh = null;
    public static final StockSortType NameAscending = null;
    public static final StockSortType NameDescending = null;
    public static final StockSortType PlHighToLow = null;
    public static final StockSortType PlLowToHigh = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockSortType[] f86433a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86434b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        NameAscending = new StockSortType("NameAscending", 0, 0);
        NameDescending = new StockSortType("NameDescending", 1, 1);
        InvestedHighToLow = new StockSortType("InvestedHighToLow", 2, 2);
        InvestedLowToHigh = new StockSortType("InvestedLowToHigh", 3, 3);
        PlHighToLow = new StockSortType("PlHighToLow", 4, 4);
        PlLowToHigh = new StockSortType("PlLowToHigh", 5, 5);
        GainHighToLow = new StockSortType("GainHighToLow", 6, 6);
        GainLowToHigh = new StockSortType("GainLowToHigh", 7, 7);
        Custom = new StockSortType("Custom", 8, 8);
        StockSortType[] r02 = a();
        f86433a = r02;
        f86434b = b.a(r02);
        Companion = new a(null);
    }

    StockSortType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StockSortType[] a() {
        return new StockSortType[]{NameAscending, NameDescending, InvestedHighToLow, InvestedLowToHigh, PlHighToLow, PlLowToHigh, GainHighToLow, GainLowToHigh, Custom};
    }

    public static kotlin.enums.a getEntries() {
        return f86434b;
    }

    public static StockSortType valueOf(String r1) {
        return (StockSortType) Enum.valueOf(StockSortType.class, r1);
    }

    public static StockSortType[] values() {
        return (StockSortType[]) f86433a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
