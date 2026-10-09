package com.stockbit.feature.cryptohistory.ui.detail.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/cryptohistory/ui/detail/state/CryptoHistoryValueTone;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "POSITIVE", "PENDING", "NEGATIVE", "crypto-history_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoHistoryValueTone extends Enum<CryptoHistoryValueTone> {
    public static final CryptoHistoryValueTone DEFAULT = null;
    public static final CryptoHistoryValueTone NEGATIVE = null;
    public static final CryptoHistoryValueTone PENDING = null;
    public static final CryptoHistoryValueTone POSITIVE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoHistoryValueTone[] f93779a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f93780b = null;

    static {
        DEFAULT = new CryptoHistoryValueTone("DEFAULT", 0);
        POSITIVE = new CryptoHistoryValueTone("POSITIVE", 1);
        PENDING = new CryptoHistoryValueTone("PENDING", 2);
        NEGATIVE = new CryptoHistoryValueTone("NEGATIVE", 3);
        CryptoHistoryValueTone[] r02 = a();
        f93779a = r02;
        f93780b = kotlin.enums.b.a(r02);
    }

    CryptoHistoryValueTone(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoHistoryValueTone[] a() {
        return new CryptoHistoryValueTone[]{DEFAULT, POSITIVE, PENDING, NEGATIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f93780b;
    }

    public static CryptoHistoryValueTone valueOf(String r1) {
        return (CryptoHistoryValueTone) Enum.valueOf(CryptoHistoryValueTone.class, r1);
    }

    public static CryptoHistoryValueTone[] values() {
        return (CryptoHistoryValueTone[]) f93779a.clone();
    }
}
