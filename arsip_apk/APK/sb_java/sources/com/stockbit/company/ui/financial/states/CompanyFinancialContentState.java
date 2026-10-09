package com.stockbit.company.ui.financial.states;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/company/ui/financial/states/CompanyFinancialContentState;", "", "<init>", "(Ljava/lang/String;I)V", "DATA_CHART", "DATA_TABLE", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum CompanyFinancialContentState extends Enum<CompanyFinancialContentState> {
    public static final CompanyFinancialContentState DATA_CHART = null;
    public static final CompanyFinancialContentState DATA_TABLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyFinancialContentState[] f65905a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f65906b = null;

    static {
        DATA_CHART = new CompanyFinancialContentState("DATA_CHART", 0);
        DATA_TABLE = new CompanyFinancialContentState("DATA_TABLE", 1);
        CompanyFinancialContentState[] r02 = a();
        f65905a = r02;
        f65906b = b.a(r02);
    }

    CompanyFinancialContentState(String r1, int r2) {
    }

    public static final /* synthetic */ CompanyFinancialContentState[] a() {
        return new CompanyFinancialContentState[]{DATA_CHART, DATA_TABLE};
    }

    public static kotlin.enums.a getEntries() {
        return f65906b;
    }

    public static CompanyFinancialContentState valueOf(String r1) {
        return (CompanyFinancialContentState) Enum.valueOf(CompanyFinancialContentState.class, r1);
    }

    public static CompanyFinancialContentState[] values() {
        return (CompanyFinancialContentState[]) f65905a.clone();
    }
}
