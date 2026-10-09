package com.stockbit.eipo.ui.compose.underwriter.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/eipo/ui/compose/underwriter/model/UnderwriterCompanySortByType;", "", "<init>", "(Ljava/lang/String;I)V", "ARAStreak", "R1D", "R3D", "R5D", "R10D", "R15D", "R20D", "SinceIpo", "FundRaised", "FundRaisedPct", "ListedDate", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UnderwriterCompanySortByType extends Enum<UnderwriterCompanySortByType> {
    public static final UnderwriterCompanySortByType ARAStreak = null;
    public static final UnderwriterCompanySortByType FundRaised = null;
    public static final UnderwriterCompanySortByType FundRaisedPct = null;
    public static final UnderwriterCompanySortByType ListedDate = null;
    public static final UnderwriterCompanySortByType R10D = null;
    public static final UnderwriterCompanySortByType R15D = null;
    public static final UnderwriterCompanySortByType R1D = null;
    public static final UnderwriterCompanySortByType R20D = null;
    public static final UnderwriterCompanySortByType R3D = null;
    public static final UnderwriterCompanySortByType R5D = null;
    public static final UnderwriterCompanySortByType SinceIpo = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnderwriterCompanySortByType[] f90927a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f90928b = null;

    static {
        ARAStreak = new UnderwriterCompanySortByType("ARAStreak", 0);
        R1D = new UnderwriterCompanySortByType("R1D", 1);
        R3D = new UnderwriterCompanySortByType("R3D", 2);
        R5D = new UnderwriterCompanySortByType("R5D", 3);
        R10D = new UnderwriterCompanySortByType("R10D", 4);
        R15D = new UnderwriterCompanySortByType("R15D", 5);
        R20D = new UnderwriterCompanySortByType("R20D", 6);
        SinceIpo = new UnderwriterCompanySortByType("SinceIpo", 7);
        FundRaised = new UnderwriterCompanySortByType("FundRaised", 8);
        FundRaisedPct = new UnderwriterCompanySortByType("FundRaisedPct", 9);
        ListedDate = new UnderwriterCompanySortByType("ListedDate", 10);
        UnderwriterCompanySortByType[] r02 = a();
        f90927a = r02;
        f90928b = kotlin.enums.b.a(r02);
    }

    UnderwriterCompanySortByType(String r1, int r2) {
    }

    public static final /* synthetic */ UnderwriterCompanySortByType[] a() {
        return new UnderwriterCompanySortByType[]{ARAStreak, R1D, R3D, R5D, R10D, R15D, R20D, SinceIpo, FundRaised, FundRaisedPct, ListedDate};
    }

    public static kotlin.enums.a getEntries() {
        return f90928b;
    }

    public static UnderwriterCompanySortByType valueOf(String r1) {
        return (UnderwriterCompanySortByType) Enum.valueOf(UnderwriterCompanySortByType.class, r1);
    }

    public static UnderwriterCompanySortByType[] values() {
        return (UnderwriterCompanySortByType[]) f90927a.clone();
    }
}
