package com.stockbit.component.dialog.ordertype;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/component/dialog/ordertype/AccountKindType;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "REGULAR", "MARGIN", "DAY_TRADE", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum AccountKindType extends Enum<AccountKindType> {
    public static final AccountKindType DAY_TRADE = null;
    public static final AccountKindType MARGIN = null;
    public static final AccountKindType REGULAR = null;
    public static final AccountKindType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AccountKindType[] f70310a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70311b = null;

    static {
        UNSPECIFIED = new AccountKindType("UNSPECIFIED", 0);
        REGULAR = new AccountKindType("REGULAR", 1);
        MARGIN = new AccountKindType("MARGIN", 2);
        DAY_TRADE = new AccountKindType("DAY_TRADE", 3);
        AccountKindType[] r02 = a();
        f70310a = r02;
        f70311b = kotlin.enums.b.a(r02);
    }

    AccountKindType(String r1, int r2) {
    }

    public static final /* synthetic */ AccountKindType[] a() {
        return new AccountKindType[]{UNSPECIFIED, REGULAR, MARGIN, DAY_TRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f70311b;
    }

    public static AccountKindType valueOf(String r1) {
        return (AccountKindType) Enum.valueOf(AccountKindType.class, r1);
    }

    public static AccountKindType[] values() {
        return (AccountKindType[]) f70310a.clone();
    }
}
