package com.stockbit.eipo.ui.company.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/eipo/ui/company/model/UnderwriterSortByType;", "", "<init>", "(Ljava/lang/String;I)V", "ARAStreak", "IPO", "WinRate1D", "Avg1D", "Avg3D", "Avg5D", "Avg10D", "Avg15D", "Avg20D", "SinceIpo", "FundRaised", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UnderwriterSortByType extends Enum<UnderwriterSortByType> {
    public static final UnderwriterSortByType ARAStreak = null;
    public static final UnderwriterSortByType Avg10D = null;
    public static final UnderwriterSortByType Avg15D = null;
    public static final UnderwriterSortByType Avg1D = null;
    public static final UnderwriterSortByType Avg20D = null;
    public static final UnderwriterSortByType Avg3D = null;
    public static final UnderwriterSortByType Avg5D = null;
    public static final UnderwriterSortByType FundRaised = null;
    public static final UnderwriterSortByType IPO = null;
    public static final UnderwriterSortByType SinceIpo = null;
    public static final UnderwriterSortByType WinRate1D = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnderwriterSortByType[] f89528a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f89529b = null;

    static {
        ARAStreak = new UnderwriterSortByType("ARAStreak", 0);
        IPO = new UnderwriterSortByType("IPO", 1);
        WinRate1D = new UnderwriterSortByType("WinRate1D", 2);
        Avg1D = new UnderwriterSortByType("Avg1D", 3);
        Avg3D = new UnderwriterSortByType("Avg3D", 4);
        Avg5D = new UnderwriterSortByType("Avg5D", 5);
        Avg10D = new UnderwriterSortByType("Avg10D", 6);
        Avg15D = new UnderwriterSortByType("Avg15D", 7);
        Avg20D = new UnderwriterSortByType("Avg20D", 8);
        SinceIpo = new UnderwriterSortByType("SinceIpo", 9);
        FundRaised = new UnderwriterSortByType("FundRaised", 10);
        UnderwriterSortByType[] r02 = a();
        f89528a = r02;
        f89529b = b.a(r02);
    }

    UnderwriterSortByType(String r1, int r2) {
    }

    public static final /* synthetic */ UnderwriterSortByType[] a() {
        return new UnderwriterSortByType[]{ARAStreak, IPO, WinRate1D, Avg1D, Avg3D, Avg5D, Avg10D, Avg15D, Avg20D, SinceIpo, FundRaised};
    }

    public static a getEntries() {
        return f89529b;
    }

    public static UnderwriterSortByType valueOf(String r1) {
        return (UnderwriterSortByType) Enum.valueOf(UnderwriterSortByType.class, r1);
    }

    public static UnderwriterSortByType[] values() {
        return (UnderwriterSortByType[]) f89528a.clone();
    }
}
