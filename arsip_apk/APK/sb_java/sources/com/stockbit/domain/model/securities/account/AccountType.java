package com.stockbit.domain.model.securities.account;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/securities/account/AccountType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TYPE_UNSPECIFIED", "ACCOUNT_TYPE_EQUITY", "ACCOUNT_TYPE_BOND", "ACCOUNT_TYPE_MULTI_PORTO", "ACCOUNT_TYPE_SYARIAH", "ACCOUNT_TYPE_DAY_TRADING", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AccountType extends Enum<AccountType> {
    public static final AccountType ACCOUNT_TYPE_BOND = null;
    public static final AccountType ACCOUNT_TYPE_DAY_TRADING = null;
    public static final AccountType ACCOUNT_TYPE_EQUITY = null;
    public static final AccountType ACCOUNT_TYPE_MULTI_PORTO = null;
    public static final AccountType ACCOUNT_TYPE_SYARIAH = null;
    public static final AccountType ACCOUNT_TYPE_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AccountType[] f85006a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85007b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AccountType a(String r4) {
            Iterator<E> r02 = AccountType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((AccountType) r1).name(), r4) == false) goto L4;
        L9:
            AccountType r12 = (AccountType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return AccountType.ACCOUNT_TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ACCOUNT_TYPE_UNSPECIFIED = new AccountType("ACCOUNT_TYPE_UNSPECIFIED", 0);
        ACCOUNT_TYPE_EQUITY = new AccountType("ACCOUNT_TYPE_EQUITY", 1);
        ACCOUNT_TYPE_BOND = new AccountType("ACCOUNT_TYPE_BOND", 2);
        ACCOUNT_TYPE_MULTI_PORTO = new AccountType("ACCOUNT_TYPE_MULTI_PORTO", 3);
        ACCOUNT_TYPE_SYARIAH = new AccountType("ACCOUNT_TYPE_SYARIAH", 4);
        ACCOUNT_TYPE_DAY_TRADING = new AccountType("ACCOUNT_TYPE_DAY_TRADING", 5);
        AccountType[] r02 = a();
        f85006a = r02;
        f85007b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    AccountType(String r1, int r2) {
    }

    public static final /* synthetic */ AccountType[] a() {
        return new AccountType[]{ACCOUNT_TYPE_UNSPECIFIED, ACCOUNT_TYPE_EQUITY, ACCOUNT_TYPE_BOND, ACCOUNT_TYPE_MULTI_PORTO, ACCOUNT_TYPE_SYARIAH, ACCOUNT_TYPE_DAY_TRADING};
    }

    public static kotlin.enums.a getEntries() {
        return f85007b;
    }

    public static AccountType valueOf(String r1) {
        return (AccountType) Enum.valueOf(AccountType.class, r1);
    }

    public static AccountType[] values() {
        return (AccountType[]) f85006a.clone();
    }
}
