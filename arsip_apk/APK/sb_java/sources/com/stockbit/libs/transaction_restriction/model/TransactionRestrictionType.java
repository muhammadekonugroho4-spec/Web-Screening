package com.stockbit.libs.transaction_restriction.model;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/libs/transaction_restriction/model/TransactionRestrictionType;", "", "<init>", "(Ljava/lang/String;I)V", "SHARIA", "IFA", "NEGO_SUSPENDED", "MARGIN", DebugCoroutineInfoImplKt.SUSPENDED, "RIGHT_SESSION_LIMITED", "transaction-restriction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum TransactionRestrictionType extends Enum<TransactionRestrictionType> {
    public static final TransactionRestrictionType IFA = null;
    public static final TransactionRestrictionType MARGIN = null;
    public static final TransactionRestrictionType NEGO_SUSPENDED = null;
    public static final TransactionRestrictionType RIGHT_SESSION_LIMITED = null;
    public static final TransactionRestrictionType SHARIA = null;
    public static final TransactionRestrictionType SUSPENDED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransactionRestrictionType[] f120798a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120799b = null;

    static {
        SHARIA = new TransactionRestrictionType("SHARIA", 0);
        IFA = new TransactionRestrictionType("IFA", 1);
        NEGO_SUSPENDED = new TransactionRestrictionType("NEGO_SUSPENDED", 2);
        MARGIN = new TransactionRestrictionType("MARGIN", 3);
        SUSPENDED = new TransactionRestrictionType(DebugCoroutineInfoImplKt.SUSPENDED, 4);
        RIGHT_SESSION_LIMITED = new TransactionRestrictionType("RIGHT_SESSION_LIMITED", 5);
        TransactionRestrictionType[] r02 = a();
        f120798a = r02;
        f120799b = b.a(r02);
    }

    TransactionRestrictionType(String r1, int r2) {
    }

    public static final /* synthetic */ TransactionRestrictionType[] a() {
        return new TransactionRestrictionType[]{SHARIA, IFA, NEGO_SUSPENDED, MARGIN, SUSPENDED, RIGHT_SESSION_LIMITED};
    }

    public static kotlin.enums.a getEntries() {
        return f120799b;
    }

    public static TransactionRestrictionType valueOf(String r1) {
        return (TransactionRestrictionType) Enum.valueOf(TransactionRestrictionType.class, r1);
    }

    public static TransactionRestrictionType[] values() {
        return (TransactionRestrictionType[]) f120798a.clone();
    }
}
