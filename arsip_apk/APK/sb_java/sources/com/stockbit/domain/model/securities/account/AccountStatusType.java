package com.stockbit.domain.model.securities.account;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/securities/account/AccountStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_STATUS_UNSPECIFIED", "ACCOUNT_STATUS_PENDING", "ACCOUNT_STATUS_APPROVED", "ACCOUNT_STATUS_REJECTED", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AccountStatusType extends Enum<AccountStatusType> {
    public static final AccountStatusType ACCOUNT_STATUS_APPROVED = null;
    public static final AccountStatusType ACCOUNT_STATUS_PENDING = null;
    public static final AccountStatusType ACCOUNT_STATUS_REJECTED = null;
    public static final AccountStatusType ACCOUNT_STATUS_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AccountStatusType[] f85004a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85005b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AccountStatusType a(String r4) {
            Iterator<E> r02 = AccountStatusType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((AccountStatusType) r1).name(), r4) == false) goto L4;
        L9:
            AccountStatusType r12 = (AccountStatusType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return AccountStatusType.ACCOUNT_STATUS_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ACCOUNT_STATUS_UNSPECIFIED = new AccountStatusType("ACCOUNT_STATUS_UNSPECIFIED", 0);
        ACCOUNT_STATUS_PENDING = new AccountStatusType("ACCOUNT_STATUS_PENDING", 1);
        ACCOUNT_STATUS_APPROVED = new AccountStatusType("ACCOUNT_STATUS_APPROVED", 2);
        ACCOUNT_STATUS_REJECTED = new AccountStatusType("ACCOUNT_STATUS_REJECTED", 3);
        AccountStatusType[] r02 = a();
        f85004a = r02;
        f85005b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    AccountStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ AccountStatusType[] a() {
        return new AccountStatusType[]{ACCOUNT_STATUS_UNSPECIFIED, ACCOUNT_STATUS_PENDING, ACCOUNT_STATUS_APPROVED, ACCOUNT_STATUS_REJECTED};
    }

    public static kotlin.enums.a getEntries() {
        return f85005b;
    }

    public static AccountStatusType valueOf(String r1) {
        return (AccountStatusType) Enum.valueOf(AccountStatusType.class, r1);
    }

    public static AccountStatusType[] values() {
        return (AccountStatusType[]) f85004a.clone();
    }
}
