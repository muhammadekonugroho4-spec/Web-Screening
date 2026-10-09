package com.stockbit.usecase.securities.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/securities/model/PeriodType;", "", "<init>", "(Ljava/lang/String;I)V", "PERIOD_UNSPECIFIED", "PERIOD_1W", "PERIOD_1M", "PERIOD_3M", "PERIOD_YTD", "PERIOD_1Y", "PERIOD_2Y", "PERIOD_3Y", "PERIOD_ALL", "PERIOD_CUSTOM", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PeriodType extends Enum<PeriodType> {
    public static final a Companion = null;
    public static final PeriodType PERIOD_1M = null;
    public static final PeriodType PERIOD_1W = null;
    public static final PeriodType PERIOD_1Y = null;
    public static final PeriodType PERIOD_2Y = null;
    public static final PeriodType PERIOD_3M = null;
    public static final PeriodType PERIOD_3Y = null;
    public static final PeriodType PERIOD_ALL = null;
    public static final PeriodType PERIOD_CUSTOM = null;
    public static final PeriodType PERIOD_UNSPECIFIED = null;
    public static final PeriodType PERIOD_YTD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PeriodType[] f160328a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160329b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        PERIOD_UNSPECIFIED = new PeriodType("PERIOD_UNSPECIFIED", 0);
        PERIOD_1W = new PeriodType("PERIOD_1W", 1);
        PERIOD_1M = new PeriodType("PERIOD_1M", 2);
        PERIOD_3M = new PeriodType("PERIOD_3M", 3);
        PERIOD_YTD = new PeriodType("PERIOD_YTD", 4);
        PERIOD_1Y = new PeriodType("PERIOD_1Y", 5);
        PERIOD_2Y = new PeriodType("PERIOD_2Y", 6);
        PERIOD_3Y = new PeriodType("PERIOD_3Y", 7);
        PERIOD_ALL = new PeriodType("PERIOD_ALL", 8);
        PERIOD_CUSTOM = new PeriodType("PERIOD_CUSTOM", 9);
        PeriodType[] r02 = a();
        f160328a = r02;
        f160329b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PeriodType(String r1, int r2) {
    }

    public static final /* synthetic */ PeriodType[] a() {
        return new PeriodType[]{PERIOD_UNSPECIFIED, PERIOD_1W, PERIOD_1M, PERIOD_3M, PERIOD_YTD, PERIOD_1Y, PERIOD_2Y, PERIOD_3Y, PERIOD_ALL, PERIOD_CUSTOM};
    }

    public static kotlin.enums.a getEntries() {
        return f160329b;
    }

    public static PeriodType valueOf(String r1) {
        return (PeriodType) Enum.valueOf(PeriodType.class, r1);
    }

    public static PeriodType[] values() {
        return (PeriodType[]) f160328a.clone();
    }
}
