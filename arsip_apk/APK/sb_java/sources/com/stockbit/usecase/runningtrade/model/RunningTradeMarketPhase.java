package com.stockbit.usecase.runningtrade.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/runningtrade/model/RunningTradeMarketPhase;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "PRECLOSING_OPENING_FCA", "usecase-runningtrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RunningTradeMarketPhase extends Enum<RunningTradeMarketPhase> {
    public static final RunningTradeMarketPhase PRECLOSING_OPENING_FCA = null;
    public static final RunningTradeMarketPhase REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RunningTradeMarketPhase[] f159576a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159577b = null;

    static {
        REGULAR = new RunningTradeMarketPhase("REGULAR", 0);
        PRECLOSING_OPENING_FCA = new RunningTradeMarketPhase("PRECLOSING_OPENING_FCA", 1);
        RunningTradeMarketPhase[] r02 = a();
        f159576a = r02;
        f159577b = kotlin.enums.b.a(r02);
    }

    RunningTradeMarketPhase(String r1, int r2) {
    }

    public static final /* synthetic */ RunningTradeMarketPhase[] a() {
        return new RunningTradeMarketPhase[]{REGULAR, PRECLOSING_OPENING_FCA};
    }

    public static kotlin.enums.a getEntries() {
        return f159577b;
    }

    public static RunningTradeMarketPhase valueOf(String r1) {
        return (RunningTradeMarketPhase) Enum.valueOf(RunningTradeMarketPhase.class, r1);
    }

    public static RunningTradeMarketPhase[] values() {
        return (RunningTradeMarketPhase[]) f159576a.clone();
    }
}
