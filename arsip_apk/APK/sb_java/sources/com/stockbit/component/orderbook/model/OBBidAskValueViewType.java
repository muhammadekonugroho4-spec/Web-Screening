package com.stockbit.component.orderbook.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/component/orderbook/model/OBBidAskValueViewType;", "", "<init>", "(Ljava/lang/String;I)V", "HIGH", "LOW", "NORMAL", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OBBidAskValueViewType extends Enum<OBBidAskValueViewType> {
    public static final OBBidAskValueViewType HIGH = null;
    public static final OBBidAskValueViewType LOW = null;
    public static final OBBidAskValueViewType NORMAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OBBidAskValueViewType[] f73007a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f73008b = null;

    static {
        HIGH = new OBBidAskValueViewType("HIGH", 0);
        LOW = new OBBidAskValueViewType("LOW", 1);
        NORMAL = new OBBidAskValueViewType("NORMAL", 2);
        OBBidAskValueViewType[] r02 = a();
        f73007a = r02;
        f73008b = kotlin.enums.b.a(r02);
    }

    OBBidAskValueViewType(String r1, int r2) {
    }

    public static final /* synthetic */ OBBidAskValueViewType[] a() {
        return new OBBidAskValueViewType[]{HIGH, LOW, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f73008b;
    }

    public static OBBidAskValueViewType valueOf(String r1) {
        return (OBBidAskValueViewType) Enum.valueOf(OBBidAskValueViewType.class, r1);
    }

    public static OBBidAskValueViewType[] values() {
        return (OBBidAskValueViewType[]) f73007a.clone();
    }
}
