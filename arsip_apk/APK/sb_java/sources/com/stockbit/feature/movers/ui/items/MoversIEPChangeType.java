package com.stockbit.feature.movers.ui.items;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/movers/ui/items/MoversIEPChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NORMAL", "movers_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum MoversIEPChangeType extends Enum<MoversIEPChangeType> {
    public static final MoversIEPChangeType DOWN = null;
    public static final MoversIEPChangeType NORMAL = null;
    public static final MoversIEPChangeType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MoversIEPChangeType[] f100146a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100147b = null;

    static {
        UP = new MoversIEPChangeType("UP", 0);
        DOWN = new MoversIEPChangeType("DOWN", 1);
        NORMAL = new MoversIEPChangeType("NORMAL", 2);
        MoversIEPChangeType[] r02 = a();
        f100146a = r02;
        f100147b = kotlin.enums.b.a(r02);
    }

    MoversIEPChangeType(String r1, int r2) {
    }

    public static final /* synthetic */ MoversIEPChangeType[] a() {
        return new MoversIEPChangeType[]{UP, DOWN, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f100147b;
    }

    public static MoversIEPChangeType valueOf(String r1) {
        return (MoversIEPChangeType) Enum.valueOf(MoversIEPChangeType.class, r1);
    }

    public static MoversIEPChangeType[] values() {
        return (MoversIEPChangeType[]) f100146a.clone();
    }
}
