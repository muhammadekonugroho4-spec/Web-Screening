package com.stockbit.usecase.brokeractivity.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/brokeractivity/model/type/BrokerDailyColorType;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN_MEDIUM", "GREEN_LOW", "GREEN", "RED_MEDIUM", "RED_LOW", "RED", "PRIMARY", "usecase-brokeractivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerDailyColorType extends Enum<BrokerDailyColorType> {
    public static final BrokerDailyColorType GREEN = null;
    public static final BrokerDailyColorType GREEN_LOW = null;
    public static final BrokerDailyColorType GREEN_MEDIUM = null;
    public static final BrokerDailyColorType PRIMARY = null;
    public static final BrokerDailyColorType RED = null;
    public static final BrokerDailyColorType RED_LOW = null;
    public static final BrokerDailyColorType RED_MEDIUM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerDailyColorType[] f154895a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f154896b = null;

    static {
        GREEN_MEDIUM = new BrokerDailyColorType("GREEN_MEDIUM", 0);
        GREEN_LOW = new BrokerDailyColorType("GREEN_LOW", 1);
        GREEN = new BrokerDailyColorType("GREEN", 2);
        RED_MEDIUM = new BrokerDailyColorType("RED_MEDIUM", 3);
        RED_LOW = new BrokerDailyColorType("RED_LOW", 4);
        RED = new BrokerDailyColorType("RED", 5);
        PRIMARY = new BrokerDailyColorType("PRIMARY", 6);
        BrokerDailyColorType[] r02 = a();
        f154895a = r02;
        f154896b = b.a(r02);
    }

    BrokerDailyColorType(String r1, int r2) {
    }

    public static final /* synthetic */ BrokerDailyColorType[] a() {
        return new BrokerDailyColorType[]{GREEN_MEDIUM, GREEN_LOW, GREEN, RED_MEDIUM, RED_LOW, RED, PRIMARY};
    }

    public static a getEntries() {
        return f154896b;
    }

    public static BrokerDailyColorType valueOf(String r1) {
        return (BrokerDailyColorType) Enum.valueOf(BrokerDailyColorType.class, r1);
    }

    public static BrokerDailyColorType[] values() {
        return (BrokerDailyColorType[]) f154895a.clone();
    }
}
