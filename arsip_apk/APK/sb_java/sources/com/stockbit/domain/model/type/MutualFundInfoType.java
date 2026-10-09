package com.stockbit.domain.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/domain/model/type/MutualFundInfoType;", "", "tag", "", Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getTitle", "CAGR", "MAX_DRAWDOWN", "EXPENSE_RATIO", "TOTAL_AUM", "PRODUCT_TYPE", "RISK_LEVEL", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum MutualFundInfoType extends Enum<MutualFundInfoType> {
    public static final MutualFundInfoType CAGR = null;
    public static final MutualFundInfoType EXPENSE_RATIO = null;
    public static final MutualFundInfoType MAX_DRAWDOWN = null;
    public static final MutualFundInfoType PRODUCT_TYPE = null;
    public static final MutualFundInfoType RISK_LEVEL = null;
    public static final MutualFundInfoType TOTAL_AUM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MutualFundInfoType[] f86215a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86216b = null;
    private final String tag;
    private final String title;

    static {
        CAGR = new MutualFundInfoType("CAGR", 0, "dialog-cagr-info", "CAGR 5 yrs");
        MAX_DRAWDOWN = new MutualFundInfoType("MAX_DRAWDOWN", 1, "dialog-max-drawdown-info", "Max Drawdown");
        EXPENSE_RATIO = new MutualFundInfoType("EXPENSE_RATIO", 2, "dialog-expense-ratio-info", "Expense Ratio");
        TOTAL_AUM = new MutualFundInfoType("TOTAL_AUM", 3, "dialog-total-aum-info", "Total AUM");
        PRODUCT_TYPE = new MutualFundInfoType("PRODUCT_TYPE", 4, "dialog-product-type-info", "Jenis Produk");
        RISK_LEVEL = new MutualFundInfoType("RISK_LEVEL", 5, "dialog-risk-level-info", "Tingkat Resiko");
        MutualFundInfoType[] r02 = a();
        f86215a = r02;
        f86216b = kotlin.enums.b.a(r02);
    }

    MutualFundInfoType(String r1, int r2, String r3, String r4) {
        this.tag = r3;
        this.title = r4;
    }

    public static final /* synthetic */ MutualFundInfoType[] a() {
        return new MutualFundInfoType[]{CAGR, MAX_DRAWDOWN, EXPENSE_RATIO, TOTAL_AUM, PRODUCT_TYPE, RISK_LEVEL};
    }

    public static kotlin.enums.a getEntries() {
        return f86216b;
    }

    public static MutualFundInfoType valueOf(String r1) {
        return (MutualFundInfoType) Enum.valueOf(MutualFundInfoType.class, r1);
    }

    public static MutualFundInfoType[] values() {
        return (MutualFundInfoType[]) f86215a.clone();
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }
}
