package com.stockbit.company.ui.financial.states;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001d"}, d2 = {"Lcom/stockbit/company/ui/financial/states/CompanyFinancialStatementState;", "", "type", "", Constants.KEY_TITLE, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getType", "()I", "setType", "(I)V", "getTitle", "()Ljava/lang/String;", "REPORT_QUARTER", "REPORT_ANNUAL", "TTM", "INTERIM_YTD", "Q1", "Q2", "Q3", "Q4", "QOQ_GROWTH", "QUARTER_YOY_GROWTH", "YTD_YOY_GROWTH", "ANNUAL_YOY_GROWTH", "THREE_YEAR_CAGR", "isHideToggle", "", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum CompanyFinancialStatementState extends Enum<CompanyFinancialStatementState> {
    public static final CompanyFinancialStatementState ANNUAL_YOY_GROWTH = null;
    public static final CompanyFinancialStatementState INTERIM_YTD = null;
    public static final CompanyFinancialStatementState Q1 = null;
    public static final CompanyFinancialStatementState Q2 = null;
    public static final CompanyFinancialStatementState Q3 = null;
    public static final CompanyFinancialStatementState Q4 = null;
    public static final CompanyFinancialStatementState QOQ_GROWTH = null;
    public static final CompanyFinancialStatementState QUARTER_YOY_GROWTH = null;
    public static final CompanyFinancialStatementState REPORT_ANNUAL = null;
    public static final CompanyFinancialStatementState REPORT_QUARTER = null;
    public static final CompanyFinancialStatementState THREE_YEAR_CAGR = null;
    public static final CompanyFinancialStatementState TTM = null;
    public static final CompanyFinancialStatementState YTD_YOY_GROWTH = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyFinancialStatementState[] f65909a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f65910b = null;
    private final String title;
    private int type;

    static {
        REPORT_QUARTER = new CompanyFinancialStatementState("REPORT_QUARTER", 0, 1, "Quarter");
        REPORT_ANNUAL = new CompanyFinancialStatementState("REPORT_ANNUAL", 1, 2, "Annual");
        TTM = new CompanyFinancialStatementState("TTM", 2, 3, "TTM");
        INTERIM_YTD = new CompanyFinancialStatementState("INTERIM_YTD", 3, 4, "Interim YTD");
        Q1 = new CompanyFinancialStatementState("Q1", 4, 5, "Q1");
        Q2 = new CompanyFinancialStatementState("Q2", 5, 6, "Q2");
        Q3 = new CompanyFinancialStatementState("Q3", 6, 7, "Q3");
        Q4 = new CompanyFinancialStatementState("Q4", 7, 8, "Q4");
        QOQ_GROWTH = new CompanyFinancialStatementState("QOQ_GROWTH", 8, 9, "QOQ Growth");
        QUARTER_YOY_GROWTH = new CompanyFinancialStatementState("QUARTER_YOY_GROWTH", 9, 10, "Quarter YoY Growth");
        YTD_YOY_GROWTH = new CompanyFinancialStatementState("YTD_YOY_GROWTH", 10, 11, "YTD YoY Growth");
        ANNUAL_YOY_GROWTH = new CompanyFinancialStatementState("ANNUAL_YOY_GROWTH", 11, 12, "Annual YoY Growth");
        THREE_YEAR_CAGR = new CompanyFinancialStatementState("THREE_YEAR_CAGR", 12, 13, "3 Year CAGR");
        CompanyFinancialStatementState[] r02 = a();
        f65909a = r02;
        f65910b = b.a(r02);
    }

    CompanyFinancialStatementState(String r1, int r2, int r3, String r4) {
        this.type = r3;
        this.title = r4;
    }

    public static final /* synthetic */ CompanyFinancialStatementState[] a() {
        return new CompanyFinancialStatementState[]{REPORT_QUARTER, REPORT_ANNUAL, TTM, INTERIM_YTD, Q1, Q2, Q3, Q4, QOQ_GROWTH, QUARTER_YOY_GROWTH, YTD_YOY_GROWTH, ANNUAL_YOY_GROWTH, THREE_YEAR_CAGR};
    }

    public static kotlin.enums.a getEntries() {
        return f65910b;
    }

    public static CompanyFinancialStatementState valueOf(String r1) {
        return (CompanyFinancialStatementState) Enum.valueOf(CompanyFinancialStatementState.class, r1);
    }

    public static CompanyFinancialStatementState[] values() {
        return (CompanyFinancialStatementState[]) f65909a.clone();
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isHideToggle() {
        if (this != QOQ_GROWTH) goto L5;
        return true;
    L5:
        if (this != QUARTER_YOY_GROWTH) goto L7;
        return true;
    L7:
        if (this != YTD_YOY_GROWTH) goto L9;
        return true;
    L9:
        if (this != ANNUAL_YOY_GROWTH) goto L11;
        return true;
    L11:
        if (this == THREE_YEAR_CAGR) goto L20;
        return false;
    L20:
        return true;
    }

    public final void setType(int r1) {
        this.type = r1;
    }
}
