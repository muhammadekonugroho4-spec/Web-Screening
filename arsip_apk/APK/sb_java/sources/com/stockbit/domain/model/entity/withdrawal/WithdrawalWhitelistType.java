package com.stockbit.domain.model.entity.withdrawal;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/WithdrawalWhitelistType;", "", "<init>", "(Ljava/lang/String;I)V", "WITHDRAWAL_WHITELIST_STATUS_UNSPECIFIED", "WITHDRAWAL_WHITELIST_STATUS_PENDING", "WITHDRAWAL_WHITELIST_STATUS_WHITELISTED", "WITHDRAWAL_WHITELIST_STATUS_REJECTED", "WITHDRAWAL_WHITELIST_STATUS_NOT_WHITELISTED", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum WithdrawalWhitelistType extends Enum<WithdrawalWhitelistType> {
    public static final WithdrawalWhitelistType WITHDRAWAL_WHITELIST_STATUS_NOT_WHITELISTED = null;
    public static final WithdrawalWhitelistType WITHDRAWAL_WHITELIST_STATUS_PENDING = null;
    public static final WithdrawalWhitelistType WITHDRAWAL_WHITELIST_STATUS_REJECTED = null;
    public static final WithdrawalWhitelistType WITHDRAWAL_WHITELIST_STATUS_UNSPECIFIED = null;
    public static final WithdrawalWhitelistType WITHDRAWAL_WHITELIST_STATUS_WHITELISTED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WithdrawalWhitelistType[] f83893a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f83894b = null;

    static {
        WITHDRAWAL_WHITELIST_STATUS_UNSPECIFIED = new WithdrawalWhitelistType("WITHDRAWAL_WHITELIST_STATUS_UNSPECIFIED", 0);
        WITHDRAWAL_WHITELIST_STATUS_PENDING = new WithdrawalWhitelistType("WITHDRAWAL_WHITELIST_STATUS_PENDING", 1);
        WITHDRAWAL_WHITELIST_STATUS_WHITELISTED = new WithdrawalWhitelistType("WITHDRAWAL_WHITELIST_STATUS_WHITELISTED", 2);
        WITHDRAWAL_WHITELIST_STATUS_REJECTED = new WithdrawalWhitelistType("WITHDRAWAL_WHITELIST_STATUS_REJECTED", 3);
        WITHDRAWAL_WHITELIST_STATUS_NOT_WHITELISTED = new WithdrawalWhitelistType("WITHDRAWAL_WHITELIST_STATUS_NOT_WHITELISTED", 4);
        WithdrawalWhitelistType[] r02 = a();
        f83893a = r02;
        f83894b = b.a(r02);
    }

    WithdrawalWhitelistType(String r1, int r2) {
    }

    public static final /* synthetic */ WithdrawalWhitelistType[] a() {
        return new WithdrawalWhitelistType[]{WITHDRAWAL_WHITELIST_STATUS_UNSPECIFIED, WITHDRAWAL_WHITELIST_STATUS_PENDING, WITHDRAWAL_WHITELIST_STATUS_WHITELISTED, WITHDRAWAL_WHITELIST_STATUS_REJECTED, WITHDRAWAL_WHITELIST_STATUS_NOT_WHITELISTED};
    }

    public static a getEntries() {
        return f83894b;
    }

    public static WithdrawalWhitelistType valueOf(String r1) {
        return (WithdrawalWhitelistType) Enum.valueOf(WithdrawalWhitelistType.class, r1);
    }

    public static WithdrawalWhitelistType[] values() {
        return (WithdrawalWhitelistType[]) f83893a.clone();
    }
}
