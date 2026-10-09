package com.stockbit.usecase.tradingperformance.model;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/stockbit/usecase/tradingperformance/model/StockAllocationColorUIType;", "", "<init>", "(Ljava/lang/String;I)V", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5", "Rank6", "Rank7", "Rank8", "Rank9", "Rank10", "Rank11", "Rank12", "Rank13", "Rank14", "Rank15", "Rank16", "Rank17", "Rank18", "Rank19", "Rank20", "Other", "Companion", "usecase-tradingperformance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum StockAllocationColorUIType extends Enum<StockAllocationColorUIType> {
    public static final a Companion = null;
    public static final StockAllocationColorUIType Other = null;
    public static final StockAllocationColorUIType Rank1 = null;
    public static final StockAllocationColorUIType Rank10 = null;
    public static final StockAllocationColorUIType Rank11 = null;
    public static final StockAllocationColorUIType Rank12 = null;
    public static final StockAllocationColorUIType Rank13 = null;
    public static final StockAllocationColorUIType Rank14 = null;
    public static final StockAllocationColorUIType Rank15 = null;
    public static final StockAllocationColorUIType Rank16 = null;
    public static final StockAllocationColorUIType Rank17 = null;
    public static final StockAllocationColorUIType Rank18 = null;
    public static final StockAllocationColorUIType Rank19 = null;
    public static final StockAllocationColorUIType Rank2 = null;
    public static final StockAllocationColorUIType Rank20 = null;
    public static final StockAllocationColorUIType Rank3 = null;
    public static final StockAllocationColorUIType Rank4 = null;
    public static final StockAllocationColorUIType Rank5 = null;
    public static final StockAllocationColorUIType Rank6 = null;
    public static final StockAllocationColorUIType Rank7 = null;
    public static final StockAllocationColorUIType Rank8 = null;
    public static final StockAllocationColorUIType Rank9 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockAllocationColorUIType[] f163441a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163442b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final StockAllocationColorUIType a(int r4) {
            Iterator<E> r02 = StockAllocationColorUIType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((StockAllocationColorUIType) r1).ordinal() != r4) goto L4;
        L9:
            StockAllocationColorUIType r12 = (StockAllocationColorUIType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return StockAllocationColorUIType.Other;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        Rank1 = new StockAllocationColorUIType("Rank1", 0);
        Rank2 = new StockAllocationColorUIType("Rank2", 1);
        Rank3 = new StockAllocationColorUIType("Rank3", 2);
        Rank4 = new StockAllocationColorUIType("Rank4", 3);
        Rank5 = new StockAllocationColorUIType("Rank5", 4);
        Rank6 = new StockAllocationColorUIType("Rank6", 5);
        Rank7 = new StockAllocationColorUIType("Rank7", 6);
        Rank8 = new StockAllocationColorUIType("Rank8", 7);
        Rank9 = new StockAllocationColorUIType("Rank9", 8);
        Rank10 = new StockAllocationColorUIType("Rank10", 9);
        Rank11 = new StockAllocationColorUIType("Rank11", 10);
        Rank12 = new StockAllocationColorUIType("Rank12", 11);
        Rank13 = new StockAllocationColorUIType("Rank13", 12);
        Rank14 = new StockAllocationColorUIType("Rank14", 13);
        Rank15 = new StockAllocationColorUIType("Rank15", 14);
        Rank16 = new StockAllocationColorUIType("Rank16", 15);
        Rank17 = new StockAllocationColorUIType("Rank17", 16);
        Rank18 = new StockAllocationColorUIType("Rank18", 17);
        Rank19 = new StockAllocationColorUIType("Rank19", 18);
        Rank20 = new StockAllocationColorUIType("Rank20", 19);
        Other = new StockAllocationColorUIType("Other", 20);
        StockAllocationColorUIType[] r02 = a();
        f163441a = r02;
        f163442b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    StockAllocationColorUIType(String r1, int r2) {
    }

    public static final /* synthetic */ StockAllocationColorUIType[] a() {
        return new StockAllocationColorUIType[]{Rank1, Rank2, Rank3, Rank4, Rank5, Rank6, Rank7, Rank8, Rank9, Rank10, Rank11, Rank12, Rank13, Rank14, Rank15, Rank16, Rank17, Rank18, Rank19, Rank20, Other};
    }

    public static kotlin.enums.a getEntries() {
        return f163442b;
    }

    public static StockAllocationColorUIType valueOf(String r1) {
        return (StockAllocationColorUIType) Enum.valueOf(StockAllocationColorUIType.class, r1);
    }

    public static StockAllocationColorUIType[] values() {
        return (StockAllocationColorUIType[]) f163441a.clone();
    }
}
