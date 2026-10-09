package com.stockbit.component.foreignflow.utils.dialog;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/component/foreignflow/utils/dialog/ForeignFlowDialogType;", "", "<init>", "(Ljava/lang/String;I)V", "SUMMARY_MARKET", "SUMMARY_VALUE_KIND", "SUMMARY_DATE", "HISTORICAL_DATE", "foreign-flow_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ForeignFlowDialogType extends Enum<ForeignFlowDialogType> {
    public static final ForeignFlowDialogType HISTORICAL_DATE = null;
    public static final ForeignFlowDialogType SUMMARY_DATE = null;
    public static final ForeignFlowDialogType SUMMARY_MARKET = null;
    public static final ForeignFlowDialogType SUMMARY_VALUE_KIND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForeignFlowDialogType[] f72163a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f72164b = null;

    static {
        SUMMARY_MARKET = new ForeignFlowDialogType("SUMMARY_MARKET", 0);
        SUMMARY_VALUE_KIND = new ForeignFlowDialogType("SUMMARY_VALUE_KIND", 1);
        SUMMARY_DATE = new ForeignFlowDialogType("SUMMARY_DATE", 2);
        HISTORICAL_DATE = new ForeignFlowDialogType("HISTORICAL_DATE", 3);
        ForeignFlowDialogType[] r02 = a();
        f72163a = r02;
        f72164b = b.a(r02);
    }

    ForeignFlowDialogType(String r1, int r2) {
    }

    public static final /* synthetic */ ForeignFlowDialogType[] a() {
        return new ForeignFlowDialogType[]{SUMMARY_MARKET, SUMMARY_VALUE_KIND, SUMMARY_DATE, HISTORICAL_DATE};
    }

    public static a getEntries() {
        return f72164b;
    }

    public static ForeignFlowDialogType valueOf(String r1) {
        return (ForeignFlowDialogType) Enum.valueOf(ForeignFlowDialogType.class, r1);
    }

    public static ForeignFlowDialogType[] values() {
        return (ForeignFlowDialogType[]) f72163a.clone();
    }
}
