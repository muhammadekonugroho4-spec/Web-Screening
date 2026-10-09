package com.stockbit.tipping.contract;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/tipping/contract/TippingType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_STREAM", "TYPE_GROUP_CHAT_MEMBER", "tipping-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum TippingType extends Enum<TippingType> {
    public static final TippingType TYPE_GROUP_CHAT_MEMBER = null;
    public static final TippingType TYPE_STREAM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TippingType[] f145625a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f145626b = null;

    static {
        TYPE_STREAM = new TippingType("TYPE_STREAM", 0);
        TYPE_GROUP_CHAT_MEMBER = new TippingType("TYPE_GROUP_CHAT_MEMBER", 1);
        TippingType[] r02 = a();
        f145625a = r02;
        f145626b = kotlin.enums.b.a(r02);
    }

    TippingType(String r1, int r2) {
    }

    public static final /* synthetic */ TippingType[] a() {
        return new TippingType[]{TYPE_STREAM, TYPE_GROUP_CHAT_MEMBER};
    }

    public static kotlin.enums.a getEntries() {
        return f145626b;
    }

    public static TippingType valueOf(String r1) {
        return (TippingType) Enum.valueOf(TippingType.class, r1);
    }

    public static TippingType[] values() {
        return (TippingType[]) f145625a.clone();
    }
}
