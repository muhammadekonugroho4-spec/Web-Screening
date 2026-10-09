package com.stockbit.tradingcommunity.ui.error;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/tradingcommunity/ui/error/ErrorTradingCommunityType;", "", "<init>", "(Ljava/lang/String;I)V", "NETWORK", "SERVER", "tradingcommunity_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum ErrorTradingCommunityType extends Enum<ErrorTradingCommunityType> {
    public static final ErrorTradingCommunityType NETWORK = null;
    public static final ErrorTradingCommunityType SERVER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ErrorTradingCommunityType[] f149536a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f149537b = null;

    static {
        NETWORK = new ErrorTradingCommunityType("NETWORK", 0);
        SERVER = new ErrorTradingCommunityType("SERVER", 1);
        ErrorTradingCommunityType[] r02 = a();
        f149536a = r02;
        f149537b = kotlin.enums.b.a(r02);
    }

    ErrorTradingCommunityType(String r1, int r2) {
    }

    public static final /* synthetic */ ErrorTradingCommunityType[] a() {
        return new ErrorTradingCommunityType[]{NETWORK, SERVER};
    }

    public static kotlin.enums.a getEntries() {
        return f149537b;
    }

    public static ErrorTradingCommunityType valueOf(String r1) {
        return (ErrorTradingCommunityType) Enum.valueOf(ErrorTradingCommunityType.class, r1);
    }

    public static ErrorTradingCommunityType[] values() {
        return (ErrorTradingCommunityType[]) f149536a.clone();
    }
}
