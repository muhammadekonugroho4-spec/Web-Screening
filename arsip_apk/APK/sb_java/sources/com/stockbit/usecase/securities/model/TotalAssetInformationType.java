package com.stockbit.usecase.securities.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/securities/model/TotalAssetInformationType;", "", "<init>", "(Ljava/lang/String;I)V", "TRADING_BALANCE", "EQUITY", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TotalAssetInformationType extends Enum<TotalAssetInformationType> {
    public static final TotalAssetInformationType EQUITY = null;
    public static final TotalAssetInformationType TRADING_BALANCE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TotalAssetInformationType[] f160334a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160335b = null;

    static {
        TRADING_BALANCE = new TotalAssetInformationType("TRADING_BALANCE", 0);
        EQUITY = new TotalAssetInformationType("EQUITY", 1);
        TotalAssetInformationType[] r02 = a();
        f160334a = r02;
        f160335b = kotlin.enums.b.a(r02);
    }

    TotalAssetInformationType(String r1, int r2) {
    }

    public static final /* synthetic */ TotalAssetInformationType[] a() {
        return new TotalAssetInformationType[]{TRADING_BALANCE, EQUITY};
    }

    public static kotlin.enums.a getEntries() {
        return f160335b;
    }

    public static TotalAssetInformationType valueOf(String r1) {
        return (TotalAssetInformationType) Enum.valueOf(TotalAssetInformationType.class, r1);
    }

    public static TotalAssetInformationType[] values() {
        return (TotalAssetInformationType[]) f160334a.clone();
    }
}
