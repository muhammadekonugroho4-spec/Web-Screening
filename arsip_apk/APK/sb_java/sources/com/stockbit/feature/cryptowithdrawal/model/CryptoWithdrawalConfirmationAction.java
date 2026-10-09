package com.stockbit.feature.cryptowithdrawal.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/cryptowithdrawal/model/CryptoWithdrawalConfirmationAction;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "CONFIRM", "crypto-withdrawal_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum CryptoWithdrawalConfirmationAction extends Enum<CryptoWithdrawalConfirmationAction> {
    public static final CryptoWithdrawalConfirmationAction CANCEL = null;
    public static final CryptoWithdrawalConfirmationAction CONFIRM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoWithdrawalConfirmationAction[] f96238a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f96239b = null;

    static {
        CANCEL = new CryptoWithdrawalConfirmationAction("CANCEL", 0);
        CONFIRM = new CryptoWithdrawalConfirmationAction("CONFIRM", 1);
        CryptoWithdrawalConfirmationAction[] r02 = a();
        f96238a = r02;
        f96239b = kotlin.enums.b.a(r02);
    }

    CryptoWithdrawalConfirmationAction(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoWithdrawalConfirmationAction[] a() {
        return new CryptoWithdrawalConfirmationAction[]{CANCEL, CONFIRM};
    }

    public static kotlin.enums.a getEntries() {
        return f96239b;
    }

    public static CryptoWithdrawalConfirmationAction valueOf(String r1) {
        return (CryptoWithdrawalConfirmationAction) Enum.valueOf(CryptoWithdrawalConfirmationAction.class, r1);
    }

    public static CryptoWithdrawalConfirmationAction[] values() {
        return (CryptoWithdrawalConfirmationAction[]) f96238a.clone();
    }
}
