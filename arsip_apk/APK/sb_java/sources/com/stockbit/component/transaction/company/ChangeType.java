package com.stockbit.component.transaction.company;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/transaction/company/ChangeType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NORMAL", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ChangeType extends Enum<ChangeType> {
    public static final ChangeType DOWN = null;
    public static final ChangeType NORMAL = null;
    public static final ChangeType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChangeType[] f77437a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f77438b = null;

    static {
        UP = new ChangeType("UP", 0);
        DOWN = new ChangeType("DOWN", 1);
        NORMAL = new ChangeType("NORMAL", 2);
        ChangeType[] r02 = a();
        f77437a = r02;
        f77438b = kotlin.enums.b.a(r02);
    }

    ChangeType(String r1, int r2) {
    }

    public static final /* synthetic */ ChangeType[] a() {
        return new ChangeType[]{UP, DOWN, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f77438b;
    }

    public static ChangeType valueOf(String r1) {
        return (ChangeType) Enum.valueOf(ChangeType.class, r1);
    }

    public static ChangeType[] values() {
        return (ChangeType[]) f77437a.clone();
    }
}
