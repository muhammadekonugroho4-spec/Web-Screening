package com.stockbit.feature.cryptowithdrawal.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/cryptowithdrawal/model/CryptoWithdrawalErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "PORTFOLIO", "BALANCE", "crypto-withdrawal_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum CryptoWithdrawalErrorType extends Enum<CryptoWithdrawalErrorType> {
    public static final CryptoWithdrawalErrorType BALANCE = null;
    public static final CryptoWithdrawalErrorType PORTFOLIO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoWithdrawalErrorType[] f96240a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f96241b = null;

    static {
        PORTFOLIO = new CryptoWithdrawalErrorType("PORTFOLIO", 0);
        BALANCE = new CryptoWithdrawalErrorType("BALANCE", 1);
        CryptoWithdrawalErrorType[] r02 = a();
        f96240a = r02;
        f96241b = kotlin.enums.b.a(r02);
    }

    CryptoWithdrawalErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoWithdrawalErrorType[] a() {
        return new CryptoWithdrawalErrorType[]{PORTFOLIO, BALANCE};
    }

    public static kotlin.enums.a getEntries() {
        return f96241b;
    }

    public static CryptoWithdrawalErrorType valueOf(String r1) {
        return (CryptoWithdrawalErrorType) Enum.valueOf(CryptoWithdrawalErrorType.class, r1);
    }

    public static CryptoWithdrawalErrorType[] values() {
        return (CryptoWithdrawalErrorType[]) f96240a.clone();
    }
}
