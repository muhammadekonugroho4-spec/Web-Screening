package com.stockbit.usecase.brokeractivity.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/brokeractivity/model/type/BrokerDailyNetValueIntervalType;", "", "<init>", "(Ljava/lang/String;I)V", "INTERVAL_UNSPECIFIED", "INTERVAL_DAILY", "INTERVAL_WEEKLY", "INTERVAL_MONTHLY", "INTERVAL_YEARLY", "INTERVAL_CUSTOM_DATE", "usecase-brokeractivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerDailyNetValueIntervalType extends Enum<BrokerDailyNetValueIntervalType> {
    public static final BrokerDailyNetValueIntervalType INTERVAL_CUSTOM_DATE = null;
    public static final BrokerDailyNetValueIntervalType INTERVAL_DAILY = null;
    public static final BrokerDailyNetValueIntervalType INTERVAL_MONTHLY = null;
    public static final BrokerDailyNetValueIntervalType INTERVAL_UNSPECIFIED = null;
    public static final BrokerDailyNetValueIntervalType INTERVAL_WEEKLY = null;
    public static final BrokerDailyNetValueIntervalType INTERVAL_YEARLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerDailyNetValueIntervalType[] f154899a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f154900b = null;

    static {
        INTERVAL_UNSPECIFIED = new BrokerDailyNetValueIntervalType("INTERVAL_UNSPECIFIED", 0);
        INTERVAL_DAILY = new BrokerDailyNetValueIntervalType("INTERVAL_DAILY", 1);
        INTERVAL_WEEKLY = new BrokerDailyNetValueIntervalType("INTERVAL_WEEKLY", 2);
        INTERVAL_MONTHLY = new BrokerDailyNetValueIntervalType("INTERVAL_MONTHLY", 3);
        INTERVAL_YEARLY = new BrokerDailyNetValueIntervalType("INTERVAL_YEARLY", 4);
        INTERVAL_CUSTOM_DATE = new BrokerDailyNetValueIntervalType("INTERVAL_CUSTOM_DATE", 5);
        BrokerDailyNetValueIntervalType[] r02 = a();
        f154899a = r02;
        f154900b = b.a(r02);
    }

    BrokerDailyNetValueIntervalType(String r1, int r2) {
    }

    public static final /* synthetic */ BrokerDailyNetValueIntervalType[] a() {
        return new BrokerDailyNetValueIntervalType[]{INTERVAL_UNSPECIFIED, INTERVAL_DAILY, INTERVAL_WEEKLY, INTERVAL_MONTHLY, INTERVAL_YEARLY, INTERVAL_CUSTOM_DATE};
    }

    public static a getEntries() {
        return f154900b;
    }

    public static BrokerDailyNetValueIntervalType valueOf(String r1) {
        return (BrokerDailyNetValueIntervalType) Enum.valueOf(BrokerDailyNetValueIntervalType.class, r1);
    }

    public static BrokerDailyNetValueIntervalType[] values() {
        return (BrokerDailyNetValueIntervalType[]) f154899a.clone();
    }
}
