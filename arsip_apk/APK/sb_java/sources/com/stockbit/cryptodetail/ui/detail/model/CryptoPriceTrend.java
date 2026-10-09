package com.stockbit.cryptodetail.ui.detail.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/cryptodetail/ui/detail/model/CryptoPriceTrend;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NEUTRAL", "crypto-detail_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoPriceTrend extends Enum<CryptoPriceTrend> {
    public static final CryptoPriceTrend DOWN = null;
    public static final CryptoPriceTrend NEUTRAL = null;
    public static final CryptoPriceTrend UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoPriceTrend[] f79665a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f79666b = null;

    static {
        UP = new CryptoPriceTrend("UP", 0);
        DOWN = new CryptoPriceTrend("DOWN", 1);
        NEUTRAL = new CryptoPriceTrend("NEUTRAL", 2);
        CryptoPriceTrend[] r02 = a();
        f79665a = r02;
        f79666b = b.a(r02);
    }

    CryptoPriceTrend(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoPriceTrend[] a() {
        return new CryptoPriceTrend[]{UP, DOWN, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f79666b;
    }

    public static CryptoPriceTrend valueOf(String r1) {
        return (CryptoPriceTrend) Enum.valueOf(CryptoPriceTrend.class, r1);
    }

    public static CryptoPriceTrend[] values() {
        return (CryptoPriceTrend[]) f79665a.clone();
    }
}
