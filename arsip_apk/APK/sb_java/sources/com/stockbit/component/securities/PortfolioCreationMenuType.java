package com.stockbit.component.securities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/component/securities/PortfolioCreationMenuType;", "", "<init>", "(Ljava/lang/String;I)V", "SORT_BY", "HIDE_BALANCE", "HIDE_ODD_LOT", "COMPLETE_VIEW", "TRANSFER_CASH", "TRANSFER_STOCK", "RENAME_PORTFOLIO", "CREATE_NEW_PORTFOLIO", "CASH_SWEEP", "MARGIN_TRADING", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PortfolioCreationMenuType extends Enum<PortfolioCreationMenuType> {
    public static final PortfolioCreationMenuType CASH_SWEEP = null;
    public static final PortfolioCreationMenuType COMPLETE_VIEW = null;
    public static final PortfolioCreationMenuType CREATE_NEW_PORTFOLIO = null;
    public static final PortfolioCreationMenuType HIDE_BALANCE = null;
    public static final PortfolioCreationMenuType HIDE_ODD_LOT = null;
    public static final PortfolioCreationMenuType MARGIN_TRADING = null;
    public static final PortfolioCreationMenuType RENAME_PORTFOLIO = null;
    public static final PortfolioCreationMenuType SORT_BY = null;
    public static final PortfolioCreationMenuType TRANSFER_CASH = null;
    public static final PortfolioCreationMenuType TRANSFER_STOCK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioCreationMenuType[] f75228a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75229b = null;

    static {
        SORT_BY = new PortfolioCreationMenuType("SORT_BY", 0);
        HIDE_BALANCE = new PortfolioCreationMenuType("HIDE_BALANCE", 1);
        HIDE_ODD_LOT = new PortfolioCreationMenuType("HIDE_ODD_LOT", 2);
        COMPLETE_VIEW = new PortfolioCreationMenuType("COMPLETE_VIEW", 3);
        TRANSFER_CASH = new PortfolioCreationMenuType("TRANSFER_CASH", 4);
        TRANSFER_STOCK = new PortfolioCreationMenuType("TRANSFER_STOCK", 5);
        RENAME_PORTFOLIO = new PortfolioCreationMenuType("RENAME_PORTFOLIO", 6);
        CREATE_NEW_PORTFOLIO = new PortfolioCreationMenuType("CREATE_NEW_PORTFOLIO", 7);
        CASH_SWEEP = new PortfolioCreationMenuType("CASH_SWEEP", 8);
        MARGIN_TRADING = new PortfolioCreationMenuType("MARGIN_TRADING", 9);
        PortfolioCreationMenuType[] r02 = a();
        f75228a = r02;
        f75229b = kotlin.enums.b.a(r02);
    }

    PortfolioCreationMenuType(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioCreationMenuType[] a() {
        return new PortfolioCreationMenuType[]{SORT_BY, HIDE_BALANCE, HIDE_ODD_LOT, COMPLETE_VIEW, TRANSFER_CASH, TRANSFER_STOCK, RENAME_PORTFOLIO, CREATE_NEW_PORTFOLIO, CASH_SWEEP, MARGIN_TRADING};
    }

    public static kotlin.enums.a getEntries() {
        return f75229b;
    }

    public static PortfolioCreationMenuType valueOf(String r1) {
        return (PortfolioCreationMenuType) Enum.valueOf(PortfolioCreationMenuType.class, r1);
    }

    public static PortfolioCreationMenuType[] values() {
        return (PortfolioCreationMenuType[]) f75228a.clone();
    }
}
