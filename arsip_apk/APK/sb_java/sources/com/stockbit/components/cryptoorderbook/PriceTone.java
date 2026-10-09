package com.stockbit.components.cryptoorderbook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/components/cryptoorderbook/PriceTone;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NEUTRAL", "crypto-orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PriceTone extends Enum<PriceTone> {
    public static final PriceTone DOWN = null;
    public static final PriceTone NEUTRAL = null;
    public static final PriceTone UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PriceTone[] f78342a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f78343b = null;

    static {
        UP = new PriceTone("UP", 0);
        DOWN = new PriceTone("DOWN", 1);
        NEUTRAL = new PriceTone("NEUTRAL", 2);
        PriceTone[] r02 = a();
        f78342a = r02;
        f78343b = kotlin.enums.b.a(r02);
    }

    PriceTone(String r1, int r2) {
    }

    public static final /* synthetic */ PriceTone[] a() {
        return new PriceTone[]{UP, DOWN, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f78343b;
    }

    public static PriceTone valueOf(String r1) {
        return (PriceTone) Enum.valueOf(PriceTone.class, r1);
    }

    public static PriceTone[] values() {
        return (PriceTone[]) f78342a.clone();
    }
}
