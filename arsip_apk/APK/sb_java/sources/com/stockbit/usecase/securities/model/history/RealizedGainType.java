package com.stockbit.usecase.securities.model.history;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/securities/model/history/RealizedGainType;", "", "<init>", "(Ljava/lang/String;I)V", "GAIN", "LOSS", "NEUTRAL", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RealizedGainType extends Enum<RealizedGainType> {
    public static final RealizedGainType GAIN = null;
    public static final RealizedGainType LOSS = null;
    public static final RealizedGainType NEUTRAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RealizedGainType[] f160627a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160628b = null;

    static {
        GAIN = new RealizedGainType("GAIN", 0);
        LOSS = new RealizedGainType("LOSS", 1);
        NEUTRAL = new RealizedGainType("NEUTRAL", 2);
        RealizedGainType[] r02 = a();
        f160627a = r02;
        f160628b = kotlin.enums.b.a(r02);
    }

    RealizedGainType(String r1, int r2) {
    }

    public static final /* synthetic */ RealizedGainType[] a() {
        return new RealizedGainType[]{GAIN, LOSS, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f160628b;
    }

    public static RealizedGainType valueOf(String r1) {
        return (RealizedGainType) Enum.valueOf(RealizedGainType.class, r1);
    }

    public static RealizedGainType[] values() {
        return (RealizedGainType[]) f160627a.clone();
    }
}
