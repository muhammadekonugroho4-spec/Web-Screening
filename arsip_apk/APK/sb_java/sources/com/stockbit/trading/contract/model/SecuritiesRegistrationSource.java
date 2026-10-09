package com.stockbit.trading.contract.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/trading/contract/model/SecuritiesRegistrationSource;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFY_NUMBER", "VERIFY_EMAIL", "VERIFY_EMAIL_NOT_FINISHED", "OTHER", "trading-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum SecuritiesRegistrationSource extends Enum<SecuritiesRegistrationSource> {
    public static final SecuritiesRegistrationSource OTHER = null;
    public static final SecuritiesRegistrationSource VERIFY_EMAIL = null;
    public static final SecuritiesRegistrationSource VERIFY_EMAIL_NOT_FINISHED = null;
    public static final SecuritiesRegistrationSource VERIFY_NUMBER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SecuritiesRegistrationSource[] f146239a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f146240b = null;

    static {
        VERIFY_NUMBER = new SecuritiesRegistrationSource("VERIFY_NUMBER", 0);
        VERIFY_EMAIL = new SecuritiesRegistrationSource("VERIFY_EMAIL", 1);
        VERIFY_EMAIL_NOT_FINISHED = new SecuritiesRegistrationSource("VERIFY_EMAIL_NOT_FINISHED", 2);
        OTHER = new SecuritiesRegistrationSource("OTHER", 3);
        SecuritiesRegistrationSource[] r02 = a();
        f146239a = r02;
        f146240b = kotlin.enums.b.a(r02);
    }

    SecuritiesRegistrationSource(String r1, int r2) {
    }

    public static final /* synthetic */ SecuritiesRegistrationSource[] a() {
        return new SecuritiesRegistrationSource[]{VERIFY_NUMBER, VERIFY_EMAIL, VERIFY_EMAIL_NOT_FINISHED, OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f146240b;
    }

    public static SecuritiesRegistrationSource valueOf(String r1) {
        return (SecuritiesRegistrationSource) Enum.valueOf(SecuritiesRegistrationSource.class, r1);
    }

    public static SecuritiesRegistrationSource[] values() {
        return (SecuritiesRegistrationSource[]) f146239a.clone();
    }
}
