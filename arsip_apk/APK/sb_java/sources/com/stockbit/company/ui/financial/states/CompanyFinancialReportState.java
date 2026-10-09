package com.stockbit.company.ui.financial.states;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stockbit/company/ui/financial/states/CompanyFinancialReportState;", "", "type", "", Constants.KEY_TITLE, "", "flipperOrder", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "getType", "()I", "setType", "(I)V", "getTitle", "()Ljava/lang/String;", "getFlipperOrder", "INCOME_STATEMENT", "BALANCE_SHEET", "CASH_FLOW", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum CompanyFinancialReportState extends Enum<CompanyFinancialReportState> {
    public static final CompanyFinancialReportState BALANCE_SHEET = null;
    public static final CompanyFinancialReportState CASH_FLOW = null;
    public static final CompanyFinancialReportState INCOME_STATEMENT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyFinancialReportState[] f65907a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f65908b = null;
    private final int flipperOrder;
    private final String title;
    private int type;

    static {
        INCOME_STATEMENT = new CompanyFinancialReportState("INCOME_STATEMENT", 0, 1, "Income Statement", 0);
        BALANCE_SHEET = new CompanyFinancialReportState("BALANCE_SHEET", 1, 2, "Balance Sheet", 1);
        CASH_FLOW = new CompanyFinancialReportState("CASH_FLOW", 2, 3, "Cash Flow", 2);
        CompanyFinancialReportState[] r02 = a();
        f65907a = r02;
        f65908b = b.a(r02);
    }

    CompanyFinancialReportState(String r1, int r2, int r3, String r4, int r5) {
        this.type = r3;
        this.title = r4;
        this.flipperOrder = r5;
    }

    public static final /* synthetic */ CompanyFinancialReportState[] a() {
        return new CompanyFinancialReportState[]{INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW};
    }

    public static kotlin.enums.a getEntries() {
        return f65908b;
    }

    public static CompanyFinancialReportState valueOf(String r1) {
        return (CompanyFinancialReportState) Enum.valueOf(CompanyFinancialReportState.class, r1);
    }

    public static CompanyFinancialReportState[] values() {
        return (CompanyFinancialReportState[]) f65907a.clone();
    }

    public final int getFlipperOrder() {
        return this.flipperOrder;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int r1) {
        this.type = r1;
    }
}
