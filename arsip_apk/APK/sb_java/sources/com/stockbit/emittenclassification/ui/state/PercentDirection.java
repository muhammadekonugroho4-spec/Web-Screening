package com.stockbit.emittenclassification.ui.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/emittenclassification/ui/state/PercentDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "FLAT", "emitten-classification_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PercentDirection extends Enum<PercentDirection> {
    public static final PercentDirection DOWN = null;
    public static final PercentDirection FLAT = null;
    public static final PercentDirection UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PercentDirection[] f91363a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f91364b = null;

    static {
        UP = new PercentDirection("UP", 0);
        DOWN = new PercentDirection("DOWN", 1);
        FLAT = new PercentDirection("FLAT", 2);
        PercentDirection[] r02 = a();
        f91363a = r02;
        f91364b = kotlin.enums.b.a(r02);
    }

    PercentDirection(String r1, int r2) {
    }

    public static final /* synthetic */ PercentDirection[] a() {
        return new PercentDirection[]{UP, DOWN, FLAT};
    }

    public static kotlin.enums.a getEntries() {
        return f91364b;
    }

    public static PercentDirection valueOf(String r1) {
        return (PercentDirection) Enum.valueOf(PercentDirection.class, r1);
    }

    public static PercentDirection[] values() {
        return (PercentDirection[]) f91363a.clone();
    }
}
