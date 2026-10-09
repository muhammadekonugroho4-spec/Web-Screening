package com.stockbit.domain.model.type.withdrawal;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/type/withdrawal/WithdrawalType;", "", "<init>", "(Ljava/lang/String;I)V", "WITHDRAW_TYPE_UNSPECIFIED", "WITHDRAW_TYPE_RDN", "WITHDRAW_TYPE_RDPU", "WITHDRAW_TYPE_DEBT", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum WithdrawalType extends Enum<WithdrawalType> {
    public static final WithdrawalType WITHDRAW_TYPE_DEBT = null;
    public static final WithdrawalType WITHDRAW_TYPE_RDN = null;
    public static final WithdrawalType WITHDRAW_TYPE_RDPU = null;
    public static final WithdrawalType WITHDRAW_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WithdrawalType[] f86548a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86549b = null;

    static {
        WITHDRAW_TYPE_UNSPECIFIED = new WithdrawalType("WITHDRAW_TYPE_UNSPECIFIED", 0);
        WITHDRAW_TYPE_RDN = new WithdrawalType("WITHDRAW_TYPE_RDN", 1);
        WITHDRAW_TYPE_RDPU = new WithdrawalType("WITHDRAW_TYPE_RDPU", 2);
        WITHDRAW_TYPE_DEBT = new WithdrawalType("WITHDRAW_TYPE_DEBT", 3);
        WithdrawalType[] r02 = a();
        f86548a = r02;
        f86549b = b.a(r02);
    }

    WithdrawalType(String r1, int r2) {
    }

    public static final /* synthetic */ WithdrawalType[] a() {
        return new WithdrawalType[]{WITHDRAW_TYPE_UNSPECIFIED, WITHDRAW_TYPE_RDN, WITHDRAW_TYPE_RDPU, WITHDRAW_TYPE_DEBT};
    }

    public static a getEntries() {
        return f86549b;
    }

    public static WithdrawalType valueOf(String r1) {
        return (WithdrawalType) Enum.valueOf(WithdrawalType.class, r1);
    }

    public static WithdrawalType[] values() {
        return (WithdrawalType[]) f86548a.clone();
    }
}
