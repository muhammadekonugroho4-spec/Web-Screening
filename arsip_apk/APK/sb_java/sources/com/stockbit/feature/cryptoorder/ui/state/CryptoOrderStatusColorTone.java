package com.stockbit.feature.cryptoorder.ui.state;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/cryptoorder/ui/state/CryptoOrderStatusColorTone;", "", "<init>", "(Ljava/lang/String;I)V", "GREEN", "RED", "PRIMARY", "crypto-order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum CryptoOrderStatusColorTone extends Enum<CryptoOrderStatusColorTone> {
    public static final CryptoOrderStatusColorTone GREEN = null;
    public static final CryptoOrderStatusColorTone PRIMARY = null;
    public static final CryptoOrderStatusColorTone RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoOrderStatusColorTone[] f94576a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f94577b = null;

    static {
        GREEN = new CryptoOrderStatusColorTone("GREEN", 0);
        RED = new CryptoOrderStatusColorTone("RED", 1);
        PRIMARY = new CryptoOrderStatusColorTone("PRIMARY", 2);
        CryptoOrderStatusColorTone[] r02 = a();
        f94576a = r02;
        f94577b = kotlin.enums.b.a(r02);
    }

    CryptoOrderStatusColorTone(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoOrderStatusColorTone[] a() {
        return new CryptoOrderStatusColorTone[]{GREEN, RED, PRIMARY};
    }

    public static kotlin.enums.a getEntries() {
        return f94577b;
    }

    public static CryptoOrderStatusColorTone valueOf(String r1) {
        return (CryptoOrderStatusColorTone) Enum.valueOf(CryptoOrderStatusColorTone.class, r1);
    }

    public static CryptoOrderStatusColorTone[] values() {
        return (CryptoOrderStatusColorTone[]) f94576a.clone();
    }
}
