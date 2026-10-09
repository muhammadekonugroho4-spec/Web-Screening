package com.stockbit.domain.model.type.trading;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/trading/TradingPinType;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "LOGIN_WO_BROKER", "VALIDATION", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingPinType extends Enum<TradingPinType> {
    public static final TradingPinType LOGIN = null;
    public static final TradingPinType LOGIN_WO_BROKER = null;
    public static final TradingPinType VALIDATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingPinType[] f86504a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86505b = null;

    static {
        LOGIN = new TradingPinType("LOGIN", 0);
        LOGIN_WO_BROKER = new TradingPinType("LOGIN_WO_BROKER", 1);
        VALIDATION = new TradingPinType("VALIDATION", 2);
        TradingPinType[] r02 = a();
        f86504a = r02;
        f86505b = b.a(r02);
    }

    TradingPinType(String r1, int r2) {
    }

    public static final /* synthetic */ TradingPinType[] a() {
        return new TradingPinType[]{LOGIN, LOGIN_WO_BROKER, VALIDATION};
    }

    public static kotlin.enums.a getEntries() {
        return f86505b;
    }

    public static TradingPinType valueOf(String r1) {
        return (TradingPinType) Enum.valueOf(TradingPinType.class, r1);
    }

    public static TradingPinType[] values() {
        return (TradingPinType[]) f86504a.clone();
    }
}
