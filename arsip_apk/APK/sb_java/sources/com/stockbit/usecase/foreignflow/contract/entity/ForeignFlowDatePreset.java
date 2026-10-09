package com.stockbit.usecase.foreignflow.contract.entity;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/foreignflow/contract/entity/ForeignFlowDatePreset;", "", "<init>", "(Ljava/lang/String;I)V", "LATEST", "PREVIOUS_DAY", "LAST_7_DAYS", "THIS_MONTH", "PREVIOUS_MONTH", "LAST_1_MONTH", "LAST_3_MONTHS", "LAST_6_MONTHS", "YEAR_TO_DATE", "LAST_1_YEAR", "usecase-foreign-flow-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ForeignFlowDatePreset extends Enum<ForeignFlowDatePreset> {
    public static final ForeignFlowDatePreset LAST_1_MONTH = null;
    public static final ForeignFlowDatePreset LAST_1_YEAR = null;
    public static final ForeignFlowDatePreset LAST_3_MONTHS = null;
    public static final ForeignFlowDatePreset LAST_6_MONTHS = null;
    public static final ForeignFlowDatePreset LAST_7_DAYS = null;
    public static final ForeignFlowDatePreset LATEST = null;
    public static final ForeignFlowDatePreset PREVIOUS_DAY = null;
    public static final ForeignFlowDatePreset PREVIOUS_MONTH = null;
    public static final ForeignFlowDatePreset THIS_MONTH = null;
    public static final ForeignFlowDatePreset YEAR_TO_DATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowDatePreset[] f157864a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157865b = null;

    static {
        LATEST = new ForeignFlowDatePreset("LATEST", 0);
        PREVIOUS_DAY = new ForeignFlowDatePreset("PREVIOUS_DAY", 1);
        LAST_7_DAYS = new ForeignFlowDatePreset("LAST_7_DAYS", 2);
        THIS_MONTH = new ForeignFlowDatePreset("THIS_MONTH", 3);
        PREVIOUS_MONTH = new ForeignFlowDatePreset("PREVIOUS_MONTH", 4);
        LAST_1_MONTH = new ForeignFlowDatePreset("LAST_1_MONTH", 5);
        LAST_3_MONTHS = new ForeignFlowDatePreset("LAST_3_MONTHS", 6);
        LAST_6_MONTHS = new ForeignFlowDatePreset("LAST_6_MONTHS", 7);
        YEAR_TO_DATE = new ForeignFlowDatePreset("YEAR_TO_DATE", 8);
        LAST_1_YEAR = new ForeignFlowDatePreset("LAST_1_YEAR", 9);
        ForeignFlowDatePreset[] r02 = a();
        f157864a = r02;
        f157865b = kotlin.enums.b.a(r02);
    }

    ForeignFlowDatePreset(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowDatePreset[] a() {
        return new ForeignFlowDatePreset[]{LATEST, PREVIOUS_DAY, LAST_7_DAYS, THIS_MONTH, PREVIOUS_MONTH, LAST_1_MONTH, LAST_3_MONTHS, LAST_6_MONTHS, YEAR_TO_DATE, LAST_1_YEAR};
    }

    public static kotlin.enums.a getEntries() {
        return f157865b;
    }

    public static ForeignFlowDatePreset valueOf(String r1) {
        return (ForeignFlowDatePreset) Enum.valueOf(ForeignFlowDatePreset.class, r1);
    }

    public static ForeignFlowDatePreset[] values() {
        return (ForeignFlowDatePreset[]) f157864a.clone();
    }
}
