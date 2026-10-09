package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/transaction/model/LimitTriggerPriceType;", "", "<init>", "(Ljava/lang/String;I)V", "GREATER_EQUAL_THAN", "LESS_EQUAL_THAN", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum LimitTriggerPriceType extends Enum<LimitTriggerPriceType> {
    public static final LimitTriggerPriceType GREATER_EQUAL_THAN = null;
    public static final LimitTriggerPriceType LESS_EQUAL_THAN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LimitTriggerPriceType[] f163766a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163767b = null;

    static {
        GREATER_EQUAL_THAN = new LimitTriggerPriceType("GREATER_EQUAL_THAN", 0);
        LESS_EQUAL_THAN = new LimitTriggerPriceType("LESS_EQUAL_THAN", 1);
        LimitTriggerPriceType[] r02 = a();
        f163766a = r02;
        f163767b = kotlin.enums.b.a(r02);
    }

    LimitTriggerPriceType(String r1, int r2) {
    }

    public static final /* synthetic */ LimitTriggerPriceType[] a() {
        return new LimitTriggerPriceType[]{GREATER_EQUAL_THAN, LESS_EQUAL_THAN};
    }

    public static kotlin.enums.a getEntries() {
        return f163767b;
    }

    public static LimitTriggerPriceType valueOf(String r1) {
        return (LimitTriggerPriceType) Enum.valueOf(LimitTriggerPriceType.class, r1);
    }

    public static LimitTriggerPriceType[] values() {
        return (LimitTriggerPriceType[]) f163766a.clone();
    }
}
