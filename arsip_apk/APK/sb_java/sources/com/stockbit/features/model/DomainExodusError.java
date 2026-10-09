package com.stockbit.features.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/features/model/DomainExodusError;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_SYSTEM", "MAINTENANCE", "UNAUTHORIZED", "NETWORK", "NOT_FOUND", GrsBaseInfo.CountryCodeSource.UNKNOWN, "PAYMENT_REQUIRED", "model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum DomainExodusError extends Enum<DomainExodusError> {
    public static final DomainExodusError ERROR_SYSTEM = null;
    public static final DomainExodusError MAINTENANCE = null;
    public static final DomainExodusError NETWORK = null;
    public static final DomainExodusError NOT_FOUND = null;
    public static final DomainExodusError PAYMENT_REQUIRED = null;
    public static final DomainExodusError UNAUTHORIZED = null;
    public static final DomainExodusError UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DomainExodusError[] f119101a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119102b = null;

    static {
        ERROR_SYSTEM = new DomainExodusError("ERROR_SYSTEM", 0);
        MAINTENANCE = new DomainExodusError("MAINTENANCE", 1);
        UNAUTHORIZED = new DomainExodusError("UNAUTHORIZED", 2);
        NETWORK = new DomainExodusError("NETWORK", 3);
        NOT_FOUND = new DomainExodusError("NOT_FOUND", 4);
        UNKNOWN = new DomainExodusError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        PAYMENT_REQUIRED = new DomainExodusError("PAYMENT_REQUIRED", 6);
        DomainExodusError[] r02 = a();
        f119101a = r02;
        f119102b = kotlin.enums.b.a(r02);
    }

    DomainExodusError(String r1, int r2) {
    }

    public static final /* synthetic */ DomainExodusError[] a() {
        return new DomainExodusError[]{ERROR_SYSTEM, MAINTENANCE, UNAUTHORIZED, NETWORK, NOT_FOUND, UNKNOWN, PAYMENT_REQUIRED};
    }

    public static kotlin.enums.a getEntries() {
        return f119102b;
    }

    public static DomainExodusError valueOf(String r1) {
        return (DomainExodusError) Enum.valueOf(DomainExodusError.class, r1);
    }

    public static DomainExodusError[] values() {
        return (DomainExodusError[]) f119101a.clone();
    }
}
