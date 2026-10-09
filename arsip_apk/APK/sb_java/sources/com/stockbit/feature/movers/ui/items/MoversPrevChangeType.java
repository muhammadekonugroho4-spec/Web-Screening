package com.stockbit.feature.movers.ui.items;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/movers/ui/items/MoversPrevChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NORMAL", "movers_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum MoversPrevChangeType extends Enum<MoversPrevChangeType> {
    public static final MoversPrevChangeType DOWN = null;
    public static final MoversPrevChangeType NORMAL = null;
    public static final MoversPrevChangeType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MoversPrevChangeType[] f100148a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100149b = null;

    static {
        UP = new MoversPrevChangeType("UP", 0);
        DOWN = new MoversPrevChangeType("DOWN", 1);
        NORMAL = new MoversPrevChangeType("NORMAL", 2);
        MoversPrevChangeType[] r02 = a();
        f100148a = r02;
        f100149b = kotlin.enums.b.a(r02);
    }

    MoversPrevChangeType(String r1, int r2) {
    }

    public static final /* synthetic */ MoversPrevChangeType[] a() {
        return new MoversPrevChangeType[]{UP, DOWN, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f100149b;
    }

    public static MoversPrevChangeType valueOf(String r1) {
        return (MoversPrevChangeType) Enum.valueOf(MoversPrevChangeType.class, r1);
    }

    public static MoversPrevChangeType[] values() {
        return (MoversPrevChangeType[]) f100148a.clone();
    }
}
