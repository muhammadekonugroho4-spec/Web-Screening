package com.stockbit.cryptodomain;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/cryptodomain/CryptoError;", "", "<init>", "(Ljava/lang/String;I)V", "UNAUTHORIZED", "NETWORK", "MAINTENANCE", "ERROR_SYSTEM", "NOT_FOUND", GrsBaseInfo.CountryCodeSource.UNKNOWN, "crypto-domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoError extends Enum<CryptoError> {
    public static final CryptoError ERROR_SYSTEM = null;
    public static final CryptoError MAINTENANCE = null;
    public static final CryptoError NETWORK = null;
    public static final CryptoError NOT_FOUND = null;
    public static final CryptoError UNAUTHORIZED = null;
    public static final CryptoError UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoError[] f79779a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f79780b = null;

    static {
        UNAUTHORIZED = new CryptoError("UNAUTHORIZED", 0);
        NETWORK = new CryptoError("NETWORK", 1);
        MAINTENANCE = new CryptoError("MAINTENANCE", 2);
        ERROR_SYSTEM = new CryptoError("ERROR_SYSTEM", 3);
        NOT_FOUND = new CryptoError("NOT_FOUND", 4);
        UNKNOWN = new CryptoError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        CryptoError[] r02 = a();
        f79779a = r02;
        f79780b = b.a(r02);
    }

    CryptoError(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoError[] a() {
        return new CryptoError[]{UNAUTHORIZED, NETWORK, MAINTENANCE, ERROR_SYSTEM, NOT_FOUND, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f79780b;
    }

    public static CryptoError valueOf(String r1) {
        return (CryptoError) Enum.valueOf(CryptoError.class, r1);
    }

    public static CryptoError[] values() {
        return (CryptoError[]) f79779a.clone();
    }
}
