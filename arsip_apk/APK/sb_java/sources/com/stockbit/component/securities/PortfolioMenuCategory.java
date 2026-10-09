package com.stockbit.component.securities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/component/securities/PortfolioMenuCategory;", "", "textRes", "", "<init>", "(Ljava/lang/String;II)V", "getTextRes", "()I", "PORTFOLIO_DISPLAY", "TRANSFER_ASSET", "AUTO_SWEEP", "PORTFOLIO_SETTING", "MARGIN_TRADING", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PortfolioMenuCategory extends Enum<PortfolioMenuCategory> {
    public static final PortfolioMenuCategory AUTO_SWEEP = null;
    public static final PortfolioMenuCategory MARGIN_TRADING = null;
    public static final PortfolioMenuCategory PORTFOLIO_DISPLAY = null;
    public static final PortfolioMenuCategory PORTFOLIO_SETTING = null;
    public static final PortfolioMenuCategory TRANSFER_ASSET = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioMenuCategory[] f75230a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75231b = null;
    private final int textRes;

    static {
        PORTFOLIO_DISPLAY = new PortfolioMenuCategory("PORTFOLIO_DISPLAY", 0, z.f76722G0);
        TRANSFER_ASSET = new PortfolioMenuCategory("TRANSFER_ASSET", 1, z.f76726I0);
        AUTO_SWEEP = new PortfolioMenuCategory("AUTO_SWEEP", 2, z.f76718E0);
        PORTFOLIO_SETTING = new PortfolioMenuCategory("PORTFOLIO_SETTING", 3, z.f76724H0);
        MARGIN_TRADING = new PortfolioMenuCategory("MARGIN_TRADING", 4, z.f76720F0);
        PortfolioMenuCategory[] r02 = a();
        f75230a = r02;
        f75231b = kotlin.enums.b.a(r02);
    }

    PortfolioMenuCategory(String r1, int r2, int r3) {
        this.textRes = r3;
    }

    public static final /* synthetic */ PortfolioMenuCategory[] a() {
        return new PortfolioMenuCategory[]{PORTFOLIO_DISPLAY, TRANSFER_ASSET, AUTO_SWEEP, PORTFOLIO_SETTING, MARGIN_TRADING};
    }

    public static kotlin.enums.a getEntries() {
        return f75231b;
    }

    public static PortfolioMenuCategory valueOf(String r1) {
        return (PortfolioMenuCategory) Enum.valueOf(PortfolioMenuCategory.class, r1);
    }

    public static PortfolioMenuCategory[] values() {
        return (PortfolioMenuCategory[]) f75230a.clone();
    }

    public final int getTextRes() {
        return this.textRes;
    }
}
