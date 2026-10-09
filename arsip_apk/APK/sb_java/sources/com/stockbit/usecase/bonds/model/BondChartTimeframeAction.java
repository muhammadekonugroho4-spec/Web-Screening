package com.stockbit.usecase.bonds.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/bonds/model/BondChartTimeframeAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ONE_DAY", "ONE_MONTH", "THREE_MONTH", "YEAR_TO_DATE", "ONE_YEAR", "THREE_YEAR", "FIVE_YEAR", "ALL", "usecase-bonds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BondChartTimeframeAction extends Enum<BondChartTimeframeAction> {
    public static final BondChartTimeframeAction ALL = null;
    public static final BondChartTimeframeAction FIVE_YEAR = null;
    public static final BondChartTimeframeAction ONE_DAY = null;
    public static final BondChartTimeframeAction ONE_MONTH = null;
    public static final BondChartTimeframeAction ONE_YEAR = null;
    public static final BondChartTimeframeAction THREE_MONTH = null;
    public static final BondChartTimeframeAction THREE_YEAR = null;
    public static final BondChartTimeframeAction YEAR_TO_DATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BondChartTimeframeAction[] f154469a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f154470b = null;
    private final String value;

    static {
        ONE_DAY = new BondChartTimeframeAction("ONE_DAY", 0, "1D");
        ONE_MONTH = new BondChartTimeframeAction("ONE_MONTH", 1, "1M");
        THREE_MONTH = new BondChartTimeframeAction("THREE_MONTH", 2, "3M");
        YEAR_TO_DATE = new BondChartTimeframeAction("YEAR_TO_DATE", 3, "YTD");
        ONE_YEAR = new BondChartTimeframeAction("ONE_YEAR", 4, "1Y");
        THREE_YEAR = new BondChartTimeframeAction("THREE_YEAR", 5, "3Y");
        FIVE_YEAR = new BondChartTimeframeAction("FIVE_YEAR", 6, "5Y");
        ALL = new BondChartTimeframeAction("ALL", 7, "All");
        BondChartTimeframeAction[] r02 = a();
        f154469a = r02;
        f154470b = kotlin.enums.b.a(r02);
    }

    BondChartTimeframeAction(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BondChartTimeframeAction[] a() {
        return new BondChartTimeframeAction[]{ONE_DAY, ONE_MONTH, THREE_MONTH, YEAR_TO_DATE, ONE_YEAR, THREE_YEAR, FIVE_YEAR, ALL};
    }

    public static kotlin.enums.a getEntries() {
        return f154470b;
    }

    public static BondChartTimeframeAction valueOf(String r1) {
        return (BondChartTimeframeAction) Enum.valueOf(BondChartTimeframeAction.class, r1);
    }

    public static BondChartTimeframeAction[] values() {
        return (BondChartTimeframeAction[]) f154469a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
