package com.stockbit.component.securities.dialog.subaccount;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/component/securities/dialog/subaccount/SwitchAccountEntryPoint;", "", "<init>", "(Ljava/lang/String;I)V", "Watchlist", "Stream", "Company", "PortfolioList", "SideMenu", "LongPressBottomNav", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SwitchAccountEntryPoint extends Enum<SwitchAccountEntryPoint> {
    public static final SwitchAccountEntryPoint Company = null;
    public static final SwitchAccountEntryPoint LongPressBottomNav = null;
    public static final SwitchAccountEntryPoint PortfolioList = null;
    public static final SwitchAccountEntryPoint SideMenu = null;
    public static final SwitchAccountEntryPoint Stream = null;
    public static final SwitchAccountEntryPoint Watchlist = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SwitchAccountEntryPoint[] f76262a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f76263b = null;

    static {
        Watchlist = new SwitchAccountEntryPoint("Watchlist", 0);
        Stream = new SwitchAccountEntryPoint("Stream", 1);
        Company = new SwitchAccountEntryPoint("Company", 2);
        PortfolioList = new SwitchAccountEntryPoint("PortfolioList", 3);
        SideMenu = new SwitchAccountEntryPoint("SideMenu", 4);
        LongPressBottomNav = new SwitchAccountEntryPoint("LongPressBottomNav", 5);
        SwitchAccountEntryPoint[] r02 = a();
        f76262a = r02;
        f76263b = kotlin.enums.b.a(r02);
    }

    SwitchAccountEntryPoint(String r1, int r2) {
    }

    public static final /* synthetic */ SwitchAccountEntryPoint[] a() {
        return new SwitchAccountEntryPoint[]{Watchlist, Stream, Company, PortfolioList, SideMenu, LongPressBottomNav};
    }

    public static kotlin.enums.a getEntries() {
        return f76263b;
    }

    public static SwitchAccountEntryPoint valueOf(String r1) {
        return (SwitchAccountEntryPoint) Enum.valueOf(SwitchAccountEntryPoint.class, r1);
    }

    public static SwitchAccountEntryPoint[] values() {
        return (SwitchAccountEntryPoint[]) f76262a.clone();
    }
}
