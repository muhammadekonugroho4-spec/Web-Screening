package com.stockbit.domain.model.type.virtual;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/virtual/VirtualTradingType;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "DETAIL_PORTFOLIO", "DETAIL_ORDERLIST", "BUY", "SELL", "AMEND_BUY", "AMEND_SELL", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum VirtualTradingType extends Enum<VirtualTradingType> {
    public static final VirtualTradingType AMEND_BUY = null;
    public static final VirtualTradingType AMEND_SELL = null;
    public static final VirtualTradingType BUY = null;
    public static final VirtualTradingType DETAIL_ORDERLIST = null;
    public static final VirtualTradingType DETAIL_PORTFOLIO = null;
    public static final VirtualTradingType MAIN = null;
    public static final VirtualTradingType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ VirtualTradingType[] f86546a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86547b = null;

    static {
        MAIN = new VirtualTradingType("MAIN", 0);
        DETAIL_PORTFOLIO = new VirtualTradingType("DETAIL_PORTFOLIO", 1);
        DETAIL_ORDERLIST = new VirtualTradingType("DETAIL_ORDERLIST", 2);
        BUY = new VirtualTradingType("BUY", 3);
        SELL = new VirtualTradingType("SELL", 4);
        AMEND_BUY = new VirtualTradingType("AMEND_BUY", 5);
        AMEND_SELL = new VirtualTradingType("AMEND_SELL", 6);
        VirtualTradingType[] r02 = a();
        f86546a = r02;
        f86547b = b.a(r02);
    }

    VirtualTradingType(String r1, int r2) {
    }

    public static final /* synthetic */ VirtualTradingType[] a() {
        return new VirtualTradingType[]{MAIN, DETAIL_PORTFOLIO, DETAIL_ORDERLIST, BUY, SELL, AMEND_BUY, AMEND_SELL};
    }

    public static a getEntries() {
        return f86547b;
    }

    public static VirtualTradingType valueOf(String r1) {
        return (VirtualTradingType) Enum.valueOf(VirtualTradingType.class, r1);
    }

    public static VirtualTradingType[] values() {
        return (VirtualTradingType[]) f86546a.clone();
    }
}
