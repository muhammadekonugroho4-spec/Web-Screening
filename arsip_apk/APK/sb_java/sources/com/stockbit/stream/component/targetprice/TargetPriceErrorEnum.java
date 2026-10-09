package com.stockbit.stream.component.targetprice;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/stream/component/targetprice/TargetPriceErrorEnum;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_TARGET_PRICE", "ERROR_COMPANY_EMPTY", "ERROR_TARGET_PRICE_MIN_1", "ERROR_TARGET_PERIOD_EMPTY", "stream_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum TargetPriceErrorEnum extends Enum<TargetPriceErrorEnum> {
    public static final TargetPriceErrorEnum ERROR_COMPANY_EMPTY = null;
    public static final TargetPriceErrorEnum ERROR_TARGET_PERIOD_EMPTY = null;
    public static final TargetPriceErrorEnum ERROR_TARGET_PRICE = null;
    public static final TargetPriceErrorEnum ERROR_TARGET_PRICE_MIN_1 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TargetPriceErrorEnum[] f139538a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f139539b = null;

    static {
        ERROR_TARGET_PRICE = new TargetPriceErrorEnum("ERROR_TARGET_PRICE", 0);
        ERROR_COMPANY_EMPTY = new TargetPriceErrorEnum("ERROR_COMPANY_EMPTY", 1);
        ERROR_TARGET_PRICE_MIN_1 = new TargetPriceErrorEnum("ERROR_TARGET_PRICE_MIN_1", 2);
        ERROR_TARGET_PERIOD_EMPTY = new TargetPriceErrorEnum("ERROR_TARGET_PERIOD_EMPTY", 3);
        TargetPriceErrorEnum[] r02 = a();
        f139538a = r02;
        f139539b = kotlin.enums.b.a(r02);
    }

    TargetPriceErrorEnum(String r1, int r2) {
    }

    public static final /* synthetic */ TargetPriceErrorEnum[] a() {
        return new TargetPriceErrorEnum[]{ERROR_TARGET_PRICE, ERROR_COMPANY_EMPTY, ERROR_TARGET_PRICE_MIN_1, ERROR_TARGET_PERIOD_EMPTY};
    }

    public static kotlin.enums.a getEntries() {
        return f139539b;
    }

    public static TargetPriceErrorEnum valueOf(String r1) {
        return (TargetPriceErrorEnum) Enum.valueOf(TargetPriceErrorEnum.class, r1);
    }

    public static TargetPriceErrorEnum[] values() {
        return (TargetPriceErrorEnum[]) f139538a.clone();
    }
}
