package com.stockbit.usecase.brokeractivity.model.type;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/brokeractivity/model/type/BrokerActivitySortType;", "", "value", "", "param", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getParam", "ASC", "DESC", "usecase-brokeractivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerActivitySortType extends Enum<BrokerActivitySortType> {
    public static final BrokerActivitySortType ASC = null;
    public static final BrokerActivitySortType DESC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerActivitySortType[] f154893a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f154894b = null;
    private final String param;
    private final String value;

    static {
        ASC = new BrokerActivitySortType("ASC", 0, "asc", "ORDER_BY_ASC");
        DESC = new BrokerActivitySortType("DESC", 1, CompanyEntryPoint.EXTRA_DESC, "ORDER_BY_DESC");
        BrokerActivitySortType[] r02 = a();
        f154893a = r02;
        f154894b = b.a(r02);
    }

    BrokerActivitySortType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.param = r4;
    }

    public static final /* synthetic */ BrokerActivitySortType[] a() {
        return new BrokerActivitySortType[]{ASC, DESC};
    }

    public static a getEntries() {
        return f154894b;
    }

    public static BrokerActivitySortType valueOf(String r1) {
        return (BrokerActivitySortType) Enum.valueOf(BrokerActivitySortType.class, r1);
    }

    public static BrokerActivitySortType[] values() {
        return (BrokerActivitySortType[]) f154893a.clone();
    }

    public final String getParam() {
        return this.param;
    }

    public final String getValue() {
        return this.value;
    }
}
