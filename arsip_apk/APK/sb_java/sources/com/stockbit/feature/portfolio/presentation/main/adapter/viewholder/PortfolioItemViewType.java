package com.stockbit.feature.portfolio.presentation.main.adapter.viewholder;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/stockbit/feature/portfolio/presentation/main/adapter/viewholder/PortfolioItemViewType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "HEADER_PERFORMANCE", "DAY_TRADE_BANNER", "HEADER_COMPLETE_VIEW", "EMPTY", "STOCK", "STOCK_COMPLETE_VIEW", "BOND", "BOND_COMPLETE_VIEW", "WARRANT", "WARRANT_COMPLETE_VIEW", "MARGIN", "MARGIN_COMPLETE_VIEW", "DAY_TRADE_SEPARATOR", "MARGIN_TRADE_SEPARATOR", "BONDS_SEPARATOR", "FR_BONDS", "FR_BONDS_COMPLETE_VIEW", "REGULAR_SEPARATOR", "CREATE_NEW_PORTFOLIO", "portfolio_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum PortfolioItemViewType extends Enum<PortfolioItemViewType> {
    public static final PortfolioItemViewType BOND = null;
    public static final PortfolioItemViewType BONDS_SEPARATOR = null;
    public static final PortfolioItemViewType BOND_COMPLETE_VIEW = null;
    public static final PortfolioItemViewType CREATE_NEW_PORTFOLIO = null;
    public static final PortfolioItemViewType DAY_TRADE_BANNER = null;
    public static final PortfolioItemViewType DAY_TRADE_SEPARATOR = null;
    public static final PortfolioItemViewType EMPTY = null;
    public static final PortfolioItemViewType FR_BONDS = null;
    public static final PortfolioItemViewType FR_BONDS_COMPLETE_VIEW = null;
    public static final PortfolioItemViewType HEADER = null;
    public static final PortfolioItemViewType HEADER_COMPLETE_VIEW = null;
    public static final PortfolioItemViewType HEADER_PERFORMANCE = null;
    public static final PortfolioItemViewType MARGIN = null;
    public static final PortfolioItemViewType MARGIN_COMPLETE_VIEW = null;
    public static final PortfolioItemViewType MARGIN_TRADE_SEPARATOR = null;
    public static final PortfolioItemViewType REGULAR_SEPARATOR = null;
    public static final PortfolioItemViewType STOCK = null;
    public static final PortfolioItemViewType STOCK_COMPLETE_VIEW = null;
    public static final PortfolioItemViewType WARRANT = null;
    public static final PortfolioItemViewType WARRANT_COMPLETE_VIEW = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioItemViewType[] f105526a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f105527b = null;

    static {
        HEADER = new PortfolioItemViewType("HEADER", 0);
        HEADER_PERFORMANCE = new PortfolioItemViewType("HEADER_PERFORMANCE", 1);
        DAY_TRADE_BANNER = new PortfolioItemViewType("DAY_TRADE_BANNER", 2);
        HEADER_COMPLETE_VIEW = new PortfolioItemViewType("HEADER_COMPLETE_VIEW", 3);
        EMPTY = new PortfolioItemViewType("EMPTY", 4);
        STOCK = new PortfolioItemViewType("STOCK", 5);
        STOCK_COMPLETE_VIEW = new PortfolioItemViewType("STOCK_COMPLETE_VIEW", 6);
        BOND = new PortfolioItemViewType("BOND", 7);
        BOND_COMPLETE_VIEW = new PortfolioItemViewType("BOND_COMPLETE_VIEW", 8);
        WARRANT = new PortfolioItemViewType("WARRANT", 9);
        WARRANT_COMPLETE_VIEW = new PortfolioItemViewType("WARRANT_COMPLETE_VIEW", 10);
        MARGIN = new PortfolioItemViewType("MARGIN", 11);
        MARGIN_COMPLETE_VIEW = new PortfolioItemViewType("MARGIN_COMPLETE_VIEW", 12);
        DAY_TRADE_SEPARATOR = new PortfolioItemViewType("DAY_TRADE_SEPARATOR", 13);
        MARGIN_TRADE_SEPARATOR = new PortfolioItemViewType("MARGIN_TRADE_SEPARATOR", 14);
        BONDS_SEPARATOR = new PortfolioItemViewType("BONDS_SEPARATOR", 15);
        FR_BONDS = new PortfolioItemViewType("FR_BONDS", 16);
        FR_BONDS_COMPLETE_VIEW = new PortfolioItemViewType("FR_BONDS_COMPLETE_VIEW", 17);
        REGULAR_SEPARATOR = new PortfolioItemViewType("REGULAR_SEPARATOR", 18);
        CREATE_NEW_PORTFOLIO = new PortfolioItemViewType("CREATE_NEW_PORTFOLIO", 19);
        PortfolioItemViewType[] r02 = a();
        f105526a = r02;
        f105527b = kotlin.enums.b.a(r02);
    }

    PortfolioItemViewType(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioItemViewType[] a() {
        return new PortfolioItemViewType[]{HEADER, HEADER_PERFORMANCE, DAY_TRADE_BANNER, HEADER_COMPLETE_VIEW, EMPTY, STOCK, STOCK_COMPLETE_VIEW, BOND, BOND_COMPLETE_VIEW, WARRANT, WARRANT_COMPLETE_VIEW, MARGIN, MARGIN_COMPLETE_VIEW, DAY_TRADE_SEPARATOR, MARGIN_TRADE_SEPARATOR, BONDS_SEPARATOR, FR_BONDS, FR_BONDS_COMPLETE_VIEW, REGULAR_SEPARATOR, CREATE_NEW_PORTFOLIO};
    }

    public static kotlin.enums.a getEntries() {
        return f105527b;
    }

    public static PortfolioItemViewType valueOf(String r1) {
        return (PortfolioItemViewType) Enum.valueOf(PortfolioItemViewType.class, r1);
    }

    public static PortfolioItemViewType[] values() {
        return (PortfolioItemViewType[]) f105526a.clone();
    }
}
