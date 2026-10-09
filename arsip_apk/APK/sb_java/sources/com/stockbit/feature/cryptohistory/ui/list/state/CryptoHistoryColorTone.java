package com.stockbit.feature.cryptohistory.ui.list.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/cryptohistory/ui/list/state/CryptoHistoryColorTone;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN", "RED", "PRIMARY", "COBALT", "crypto-history_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoHistoryColorTone extends Enum<CryptoHistoryColorTone> {
    public static final CryptoHistoryColorTone COBALT = null;
    public static final CryptoHistoryColorTone GREEN = null;
    public static final CryptoHistoryColorTone PRIMARY = null;
    public static final CryptoHistoryColorTone RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoHistoryColorTone[] f94044a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f94045b = null;

    static {
        GREEN = new CryptoHistoryColorTone("GREEN", 0);
        RED = new CryptoHistoryColorTone("RED", 1);
        PRIMARY = new CryptoHistoryColorTone("PRIMARY", 2);
        COBALT = new CryptoHistoryColorTone("COBALT", 3);
        CryptoHistoryColorTone[] r02 = a();
        f94044a = r02;
        f94045b = kotlin.enums.b.a(r02);
    }

    CryptoHistoryColorTone(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoHistoryColorTone[] a() {
        return new CryptoHistoryColorTone[]{GREEN, RED, PRIMARY, COBALT};
    }

    public static kotlin.enums.a getEntries() {
        return f94045b;
    }

    public static CryptoHistoryColorTone valueOf(String r1) {
        return (CryptoHistoryColorTone) Enum.valueOf(CryptoHistoryColorTone.class, r1);
    }

    public static CryptoHistoryColorTone[] values() {
        return (CryptoHistoryColorTone[]) f94044a.clone();
    }
}
