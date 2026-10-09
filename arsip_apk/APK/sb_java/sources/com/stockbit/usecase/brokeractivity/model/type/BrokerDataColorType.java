package com.stockbit.usecase.brokeractivity.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/brokeractivity/model/type/BrokerDataColorType;", "", "<init>", "(Ljava/lang/String;I)V", "PURPLE", "GREEN", "RED", "PRIMARY", "usecase-brokeractivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BrokerDataColorType extends Enum<BrokerDataColorType> {
    public static final BrokerDataColorType GREEN = null;
    public static final BrokerDataColorType PRIMARY = null;
    public static final BrokerDataColorType PURPLE = null;
    public static final BrokerDataColorType RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerDataColorType[] f154901a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f154902b = null;

    static {
        PURPLE = new BrokerDataColorType("PURPLE", 0);
        GREEN = new BrokerDataColorType("GREEN", 1);
        RED = new BrokerDataColorType("RED", 2);
        PRIMARY = new BrokerDataColorType("PRIMARY", 3);
        BrokerDataColorType[] r02 = a();
        f154901a = r02;
        f154902b = b.a(r02);
    }

    BrokerDataColorType(String r1, int r2) {
    }

    public static final /* synthetic */ BrokerDataColorType[] a() {
        return new BrokerDataColorType[]{PURPLE, GREEN, RED, PRIMARY};
    }

    public static a getEntries() {
        return f154902b;
    }

    public static BrokerDataColorType valueOf(String r1) {
        return (BrokerDataColorType) Enum.valueOf(BrokerDataColorType.class, r1);
    }

    public static BrokerDataColorType[] values() {
        return (BrokerDataColorType[]) f154901a.clone();
    }
}
