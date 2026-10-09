package com.stockbit.component.securities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/securities/PortfolioMenuTextColor;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "GREEN", "RED", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PortfolioMenuTextColor extends Enum<PortfolioMenuTextColor> {
    public static final PortfolioMenuTextColor DEFAULT = null;
    public static final PortfolioMenuTextColor GREEN = null;
    public static final PortfolioMenuTextColor RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioMenuTextColor[] f75232a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f75233b = null;

    static {
        DEFAULT = new PortfolioMenuTextColor("DEFAULT", 0);
        GREEN = new PortfolioMenuTextColor("GREEN", 1);
        RED = new PortfolioMenuTextColor("RED", 2);
        PortfolioMenuTextColor[] r02 = a();
        f75232a = r02;
        f75233b = kotlin.enums.b.a(r02);
    }

    PortfolioMenuTextColor(String r1, int r2) {
    }

    public static final /* synthetic */ PortfolioMenuTextColor[] a() {
        return new PortfolioMenuTextColor[]{DEFAULT, GREEN, RED};
    }

    public static kotlin.enums.a getEntries() {
        return f75233b;
    }

    public static PortfolioMenuTextColor valueOf(String r1) {
        return (PortfolioMenuTextColor) Enum.valueOf(PortfolioMenuTextColor.class, r1);
    }

    public static PortfolioMenuTextColor[] values() {
        return (PortfolioMenuTextColor[]) f75232a.clone();
    }
}
