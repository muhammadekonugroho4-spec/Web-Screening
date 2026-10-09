package com.stockbit.feature.cryptohistory.ui.list.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/cryptohistory/ui/list/state/CryptoHistoryListChip;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "REALIZED", "crypto-history_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoHistoryListChip extends Enum<CryptoHistoryListChip> {
    public static final CryptoHistoryListChip ALL = null;
    public static final CryptoHistoryListChip REALIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoHistoryListChip[] f94046a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f94047b = null;

    static {
        ALL = new CryptoHistoryListChip("ALL", 0);
        REALIZED = new CryptoHistoryListChip("REALIZED", 1);
        CryptoHistoryListChip[] r02 = a();
        f94046a = r02;
        f94047b = kotlin.enums.b.a(r02);
    }

    CryptoHistoryListChip(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoHistoryListChip[] a() {
        return new CryptoHistoryListChip[]{ALL, REALIZED};
    }

    public static kotlin.enums.a getEntries() {
        return f94047b;
    }

    public static CryptoHistoryListChip valueOf(String r1) {
        return (CryptoHistoryListChip) Enum.valueOf(CryptoHistoryListChip.class, r1);
    }

    public static CryptoHistoryListChip[] values() {
        return (CryptoHistoryListChip[]) f94046a.clone();
    }
}
