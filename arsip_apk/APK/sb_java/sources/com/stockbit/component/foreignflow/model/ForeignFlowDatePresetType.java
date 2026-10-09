package com.stockbit.component.foreignflow.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/component/foreignflow/model/ForeignFlowDatePresetType;", "", "<init>", "(Ljava/lang/String;I)V", "LATEST", "PREVIOUS_DAY", "LAST_SEVEN_DAYS", "THIS_MONTH", "PREVIOUS_MONTH", "LAST_ONE_MONTH", "LAST_THREE_MONTHS", "LAST_SIX_MONTHS", "YEAR_TO_DATE", "LAST_ONE_YEAR", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ForeignFlowDatePresetType extends Enum<ForeignFlowDatePresetType> {
    public static final ForeignFlowDatePresetType LAST_ONE_MONTH = null;
    public static final ForeignFlowDatePresetType LAST_ONE_YEAR = null;
    public static final ForeignFlowDatePresetType LAST_SEVEN_DAYS = null;
    public static final ForeignFlowDatePresetType LAST_SIX_MONTHS = null;
    public static final ForeignFlowDatePresetType LAST_THREE_MONTHS = null;
    public static final ForeignFlowDatePresetType LATEST = null;
    public static final ForeignFlowDatePresetType PREVIOUS_DAY = null;
    public static final ForeignFlowDatePresetType PREVIOUS_MONTH = null;
    public static final ForeignFlowDatePresetType THIS_MONTH = null;
    public static final ForeignFlowDatePresetType YEAR_TO_DATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowDatePresetType[] f71925a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f71926b = null;

    static {
        LATEST = new ForeignFlowDatePresetType("LATEST", 0);
        PREVIOUS_DAY = new ForeignFlowDatePresetType("PREVIOUS_DAY", 1);
        LAST_SEVEN_DAYS = new ForeignFlowDatePresetType("LAST_SEVEN_DAYS", 2);
        THIS_MONTH = new ForeignFlowDatePresetType("THIS_MONTH", 3);
        PREVIOUS_MONTH = new ForeignFlowDatePresetType("PREVIOUS_MONTH", 4);
        LAST_ONE_MONTH = new ForeignFlowDatePresetType("LAST_ONE_MONTH", 5);
        LAST_THREE_MONTHS = new ForeignFlowDatePresetType("LAST_THREE_MONTHS", 6);
        LAST_SIX_MONTHS = new ForeignFlowDatePresetType("LAST_SIX_MONTHS", 7);
        YEAR_TO_DATE = new ForeignFlowDatePresetType("YEAR_TO_DATE", 8);
        LAST_ONE_YEAR = new ForeignFlowDatePresetType("LAST_ONE_YEAR", 9);
        ForeignFlowDatePresetType[] r02 = a();
        f71925a = r02;
        f71926b = kotlin.enums.b.a(r02);
    }

    ForeignFlowDatePresetType(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowDatePresetType[] a() {
        return new ForeignFlowDatePresetType[]{LATEST, PREVIOUS_DAY, LAST_SEVEN_DAYS, THIS_MONTH, PREVIOUS_MONTH, LAST_ONE_MONTH, LAST_THREE_MONTHS, LAST_SIX_MONTHS, YEAR_TO_DATE, LAST_ONE_YEAR};
    }

    public static kotlin.enums.a getEntries() {
        return f71926b;
    }

    public static ForeignFlowDatePresetType valueOf(String r1) {
        return (ForeignFlowDatePresetType) Enum.valueOf(ForeignFlowDatePresetType.class, r1);
    }

    public static ForeignFlowDatePresetType[] values() {
        return (ForeignFlowDatePresetType[]) f71925a.clone();
    }
}
