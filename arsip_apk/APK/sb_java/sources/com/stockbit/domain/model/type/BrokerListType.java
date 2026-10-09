package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/BrokerListType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ALL", "DEFAULT", "OTHERS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BrokerListType extends Enum<BrokerListType> {
    public static final BrokerListType ALL = null;
    public static final BrokerListType DEFAULT = null;
    public static final BrokerListType OTHERS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BrokerListType[] f86160a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86161b = null;
    private final int value;

    static {
        ALL = new BrokerListType("ALL", 0, 1);
        DEFAULT = new BrokerListType("DEFAULT", 1, 2);
        OTHERS = new BrokerListType("OTHERS", 2, 3);
        BrokerListType[] r02 = a();
        f86160a = r02;
        f86161b = kotlin.enums.b.a(r02);
    }

    BrokerListType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BrokerListType[] a() {
        return new BrokerListType[]{ALL, DEFAULT, OTHERS};
    }

    public static kotlin.enums.a getEntries() {
        return f86161b;
    }

    public static BrokerListType valueOf(String r1) {
        return (BrokerListType) Enum.valueOf(BrokerListType.class, r1);
    }

    public static BrokerListType[] values() {
        return (BrokerListType[]) f86160a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
