package com.stockbit.usecase.search.type;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/search/type/PercentageType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NORMAL", "usecase-search"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PercentageType extends Enum<PercentageType> {
    public static final PercentageType DOWN = null;
    public static final PercentageType NORMAL = null;
    public static final PercentageType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PercentageType[] f160154a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160155b = null;

    static {
        UP = new PercentageType("UP", 0);
        DOWN = new PercentageType("DOWN", 1);
        NORMAL = new PercentageType("NORMAL", 2);
        PercentageType[] r02 = a();
        f160154a = r02;
        f160155b = b.a(r02);
    }

    PercentageType(String r1, int r2) {
    }

    public static final /* synthetic */ PercentageType[] a() {
        return new PercentageType[]{UP, DOWN, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f160155b;
    }

    public static PercentageType valueOf(String r1) {
        return (PercentageType) Enum.valueOf(PercentageType.class, r1);
    }

    public static PercentageType[] values() {
        return (PercentageType[]) f160154a.clone();
    }
}
