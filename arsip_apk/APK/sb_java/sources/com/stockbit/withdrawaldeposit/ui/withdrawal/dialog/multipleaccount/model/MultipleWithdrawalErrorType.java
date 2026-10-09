package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog.multipleaccount.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/withdrawaldeposit/ui/withdrawal/dialog/multipleaccount/model/MultipleWithdrawalErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDER_LIMIT", "OVER_LIMIT", "TRANSFER_METHOD_LIMIT", "RTGS_LIMIT", "withdrawaldeposit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MultipleWithdrawalErrorType extends Enum<MultipleWithdrawalErrorType> {
    public static final MultipleWithdrawalErrorType OVER_LIMIT = null;
    public static final MultipleWithdrawalErrorType RTGS_LIMIT = null;
    public static final MultipleWithdrawalErrorType TRANSFER_METHOD_LIMIT = null;
    public static final MultipleWithdrawalErrorType UNDER_LIMIT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MultipleWithdrawalErrorType[] f173084a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f173085b = null;

    static {
        UNDER_LIMIT = new MultipleWithdrawalErrorType("UNDER_LIMIT", 0);
        OVER_LIMIT = new MultipleWithdrawalErrorType("OVER_LIMIT", 1);
        TRANSFER_METHOD_LIMIT = new MultipleWithdrawalErrorType("TRANSFER_METHOD_LIMIT", 2);
        RTGS_LIMIT = new MultipleWithdrawalErrorType("RTGS_LIMIT", 3);
        MultipleWithdrawalErrorType[] r02 = a();
        f173084a = r02;
        f173085b = kotlin.enums.b.a(r02);
    }

    MultipleWithdrawalErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ MultipleWithdrawalErrorType[] a() {
        return new MultipleWithdrawalErrorType[]{UNDER_LIMIT, OVER_LIMIT, TRANSFER_METHOD_LIMIT, RTGS_LIMIT};
    }

    public static kotlin.enums.a getEntries() {
        return f173085b;
    }

    public static MultipleWithdrawalErrorType valueOf(String r1) {
        return (MultipleWithdrawalErrorType) Enum.valueOf(MultipleWithdrawalErrorType.class, r1);
    }

    public static MultipleWithdrawalErrorType[] values() {
        return (MultipleWithdrawalErrorType[]) f173084a.clone();
    }
}
