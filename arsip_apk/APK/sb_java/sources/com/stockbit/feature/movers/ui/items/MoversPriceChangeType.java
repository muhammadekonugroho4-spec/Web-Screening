package com.stockbit.feature.movers.ui.items;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/movers/ui/items/MoversPriceChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NORMAL", "movers_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum MoversPriceChangeType extends Enum<MoversPriceChangeType> {
    public static final MoversPriceChangeType DOWN = null;
    public static final MoversPriceChangeType NORMAL = null;
    public static final MoversPriceChangeType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MoversPriceChangeType[] f100150a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100151b = null;

    static {
        UP = new MoversPriceChangeType("UP", 0);
        DOWN = new MoversPriceChangeType("DOWN", 1);
        NORMAL = new MoversPriceChangeType("NORMAL", 2);
        MoversPriceChangeType[] r02 = a();
        f100150a = r02;
        f100151b = kotlin.enums.b.a(r02);
    }

    MoversPriceChangeType(String r1, int r2) {
    }

    public static final /* synthetic */ MoversPriceChangeType[] a() {
        return new MoversPriceChangeType[]{UP, DOWN, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f100151b;
    }

    public static MoversPriceChangeType valueOf(String r1) {
        return (MoversPriceChangeType) Enum.valueOf(MoversPriceChangeType.class, r1);
    }

    public static MoversPriceChangeType[] values() {
        return (MoversPriceChangeType[]) f100150a.clone();
    }
}
