package com.stockbit.trading.contract.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/trading/contract/model/BannerInfoSourceType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PORTFOLIO", "ORDER_LIST", "trading-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum BannerInfoSourceType extends Enum<BannerInfoSourceType> {
    public static final BannerInfoSourceType ORDER_LIST = null;
    public static final BannerInfoSourceType PORTFOLIO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BannerInfoSourceType[] f146237a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f146238b = null;
    private final String value;

    static {
        PORTFOLIO = new BannerInfoSourceType("PORTFOLIO", 0, "PORTFOLIO");
        ORDER_LIST = new BannerInfoSourceType("ORDER_LIST", 1, "ORDER_LIST");
        BannerInfoSourceType[] r02 = a();
        f146237a = r02;
        f146238b = kotlin.enums.b.a(r02);
    }

    BannerInfoSourceType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BannerInfoSourceType[] a() {
        return new BannerInfoSourceType[]{PORTFOLIO, ORDER_LIST};
    }

    public static kotlin.enums.a getEntries() {
        return f146238b;
    }

    public static BannerInfoSourceType valueOf(String r1) {
        return (BannerInfoSourceType) Enum.valueOf(BannerInfoSourceType.class, r1);
    }

    public static BannerInfoSourceType[] values() {
        return (BannerInfoSourceType[]) f146237a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
