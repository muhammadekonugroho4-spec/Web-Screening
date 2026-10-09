package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/DebtStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "CAUTION", "FORCE_SELLING", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum DebtStatusType extends Enum<DebtStatusType> {
    public static final DebtStatusType CAUTION = null;
    public static final DebtStatusType FORCE_SELLING = null;
    public static final DebtStatusType NORMAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DebtStatusType[] f160982a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160983b = null;

    static {
        NORMAL = new DebtStatusType("NORMAL", 0);
        CAUTION = new DebtStatusType("CAUTION", 1);
        FORCE_SELLING = new DebtStatusType("FORCE_SELLING", 2);
        DebtStatusType[] r02 = a();
        f160982a = r02;
        f160983b = kotlin.enums.b.a(r02);
    }

    DebtStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ DebtStatusType[] a() {
        return new DebtStatusType[]{NORMAL, CAUTION, FORCE_SELLING};
    }

    public static kotlin.enums.a getEntries() {
        return f160983b;
    }

    public static DebtStatusType valueOf(String r1) {
        return (DebtStatusType) Enum.valueOf(DebtStatusType.class, r1);
    }

    public static DebtStatusType[] values() {
        return (DebtStatusType[]) f160982a.clone();
    }
}
