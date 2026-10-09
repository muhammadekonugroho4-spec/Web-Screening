package com.stockbit.tradingcommunity.ui.outcome;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/tradingcommunity/ui/outcome/TradingCommunityOutcomeType;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "REGISTRATION_IN_PROGRESS", "NIK_NOT_SUPPORTED", "ACCOUNT_SUSPENDED", "BIBIT_PLUS_UPGRADE_SUCCESS", "BIBIT_REGISTRATION_SUCCESS", "DEACTIVATED_ACCOUNT", "ACTIVATION_SUCCESS", "tradingcommunity_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum TradingCommunityOutcomeType extends Enum<TradingCommunityOutcomeType> {
    public static final TradingCommunityOutcomeType ACCOUNT_SUSPENDED = null;
    public static final TradingCommunityOutcomeType ACTIVATION_SUCCESS = null;
    public static final TradingCommunityOutcomeType BIBIT_PLUS_UPGRADE_SUCCESS = null;
    public static final TradingCommunityOutcomeType BIBIT_REGISTRATION_SUCCESS = null;
    public static final TradingCommunityOutcomeType DEACTIVATED_ACCOUNT = null;
    public static final TradingCommunityOutcomeType NIK_NOT_SUPPORTED = null;
    public static final TradingCommunityOutcomeType REGISTRATION_IN_PROGRESS = null;
    public static final TradingCommunityOutcomeType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingCommunityOutcomeType[] f149819a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f149820b = null;

    static {
        UNSPECIFIED = new TradingCommunityOutcomeType("UNSPECIFIED", 0);
        REGISTRATION_IN_PROGRESS = new TradingCommunityOutcomeType("REGISTRATION_IN_PROGRESS", 1);
        NIK_NOT_SUPPORTED = new TradingCommunityOutcomeType("NIK_NOT_SUPPORTED", 2);
        ACCOUNT_SUSPENDED = new TradingCommunityOutcomeType("ACCOUNT_SUSPENDED", 3);
        BIBIT_PLUS_UPGRADE_SUCCESS = new TradingCommunityOutcomeType("BIBIT_PLUS_UPGRADE_SUCCESS", 4);
        BIBIT_REGISTRATION_SUCCESS = new TradingCommunityOutcomeType("BIBIT_REGISTRATION_SUCCESS", 5);
        DEACTIVATED_ACCOUNT = new TradingCommunityOutcomeType("DEACTIVATED_ACCOUNT", 6);
        ACTIVATION_SUCCESS = new TradingCommunityOutcomeType("ACTIVATION_SUCCESS", 7);
        TradingCommunityOutcomeType[] r02 = a();
        f149819a = r02;
        f149820b = kotlin.enums.b.a(r02);
    }

    TradingCommunityOutcomeType(String r1, int r2) {
    }

    public static final /* synthetic */ TradingCommunityOutcomeType[] a() {
        return new TradingCommunityOutcomeType[]{UNSPECIFIED, REGISTRATION_IN_PROGRESS, NIK_NOT_SUPPORTED, ACCOUNT_SUSPENDED, BIBIT_PLUS_UPGRADE_SUCCESS, BIBIT_REGISTRATION_SUCCESS, DEACTIVATED_ACCOUNT, ACTIVATION_SUCCESS};
    }

    public static kotlin.enums.a getEntries() {
        return f149820b;
    }

    public static TradingCommunityOutcomeType valueOf(String r1) {
        return (TradingCommunityOutcomeType) Enum.valueOf(TradingCommunityOutcomeType.class, r1);
    }

    public static TradingCommunityOutcomeType[] values() {
        return (TradingCommunityOutcomeType[]) f149819a.clone();
    }
}
