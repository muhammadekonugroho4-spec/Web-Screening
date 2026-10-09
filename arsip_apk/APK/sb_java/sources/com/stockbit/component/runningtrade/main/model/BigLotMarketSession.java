package com.stockbit.component.runningtrade.main.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/runningtrade/main/model/BigLotMarketSession;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSED", "runningtrade_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum BigLotMarketSession extends Enum<BigLotMarketSession> {
    public static final BigLotMarketSession CLOSED = null;
    public static final BigLotMarketSession OPEN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BigLotMarketSession[] f75036a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f75037b = null;

    static {
        OPEN = new BigLotMarketSession("OPEN", 0);
        CLOSED = new BigLotMarketSession("CLOSED", 1);
        BigLotMarketSession[] r02 = a();
        f75036a = r02;
        f75037b = b.a(r02);
    }

    BigLotMarketSession(String r1, int r2) {
    }

    public static final /* synthetic */ BigLotMarketSession[] a() {
        return new BigLotMarketSession[]{OPEN, CLOSED};
    }

    public static a getEntries() {
        return f75037b;
    }

    public static BigLotMarketSession valueOf(String r1) {
        return (BigLotMarketSession) Enum.valueOf(BigLotMarketSession.class, r1);
    }

    public static BigLotMarketSession[] values() {
        return (BigLotMarketSession[]) f75036a.clone();
    }
}
