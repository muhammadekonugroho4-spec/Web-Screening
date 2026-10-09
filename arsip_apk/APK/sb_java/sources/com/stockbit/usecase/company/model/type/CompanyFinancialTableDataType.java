package com.stockbit.usecase.company.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/company/model/type/CompanyFinancialTableDataType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "setType", "(I)V", "DATA_TYPE_UNSPECIFIED", "DATA_TYPE_REPORTED", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CompanyFinancialTableDataType extends Enum<CompanyFinancialTableDataType> {
    public static final CompanyFinancialTableDataType DATA_TYPE_REPORTED = null;
    public static final CompanyFinancialTableDataType DATA_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyFinancialTableDataType[] f156660a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f156661b = null;
    private int type;

    static {
        DATA_TYPE_UNSPECIFIED = new CompanyFinancialTableDataType("DATA_TYPE_UNSPECIFIED", 0, 0);
        DATA_TYPE_REPORTED = new CompanyFinancialTableDataType("DATA_TYPE_REPORTED", 1, 1);
        CompanyFinancialTableDataType[] r02 = a();
        f156660a = r02;
        f156661b = b.a(r02);
    }

    CompanyFinancialTableDataType(String r1, int r2, int r3) {
        this.type = r3;
    }

    public static final /* synthetic */ CompanyFinancialTableDataType[] a() {
        return new CompanyFinancialTableDataType[]{DATA_TYPE_UNSPECIFIED, DATA_TYPE_REPORTED};
    }

    public static a getEntries() {
        return f156661b;
    }

    public static CompanyFinancialTableDataType valueOf(String r1) {
        return (CompanyFinancialTableDataType) Enum.valueOf(CompanyFinancialTableDataType.class, r1);
    }

    public static CompanyFinancialTableDataType[] values() {
        return (CompanyFinancialTableDataType[]) f156660a.clone();
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int r1) {
        this.type = r1;
    }
}
