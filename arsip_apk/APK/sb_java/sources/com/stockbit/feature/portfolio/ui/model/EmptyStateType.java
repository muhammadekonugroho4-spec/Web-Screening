package com.stockbit.feature.portfolio.ui.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/portfolio/ui/model/EmptyStateType;", "", "<init>", "(Ljava/lang/String;I)V", "STOCKS", "BONDS", "PORTFOLIO", "SUB_ACCOUNT", "portfolio_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum EmptyStateType extends Enum<EmptyStateType> {
    public static final EmptyStateType BONDS = null;
    public static final EmptyStateType PORTFOLIO = null;
    public static final EmptyStateType STOCKS = null;
    public static final EmptyStateType SUB_ACCOUNT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EmptyStateType[] f106376a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f106377b = null;

    static {
        STOCKS = new EmptyStateType("STOCKS", 0);
        BONDS = new EmptyStateType("BONDS", 1);
        PORTFOLIO = new EmptyStateType("PORTFOLIO", 2);
        SUB_ACCOUNT = new EmptyStateType("SUB_ACCOUNT", 3);
        EmptyStateType[] r02 = a();
        f106376a = r02;
        f106377b = kotlin.enums.b.a(r02);
    }

    EmptyStateType(String r1, int r2) {
    }

    public static final /* synthetic */ EmptyStateType[] a() {
        return new EmptyStateType[]{STOCKS, BONDS, PORTFOLIO, SUB_ACCOUNT};
    }

    public static kotlin.enums.a getEntries() {
        return f106377b;
    }

    public static EmptyStateType valueOf(String r1) {
        return (EmptyStateType) Enum.valueOf(EmptyStateType.class, r1);
    }

    public static EmptyStateType[] values() {
        return (EmptyStateType[]) f106376a.clone();
    }
}
