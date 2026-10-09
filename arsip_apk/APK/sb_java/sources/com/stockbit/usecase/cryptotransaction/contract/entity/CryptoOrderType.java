package com.stockbit.usecase.cryptotransaction.contract.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/cryptotransaction/contract/entity/CryptoOrderType;", "", "<init>", "(Ljava/lang/String;I)V", "MARKET", "LIMIT", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "usecase-crypto-transaction-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CryptoOrderType extends Enum<CryptoOrderType> {
    public static final a Companion = null;
    public static final CryptoOrderType LIMIT = null;
    public static final CryptoOrderType MARKET = null;
    public static final CryptoOrderType UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoOrderType[] f157379a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157380b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        MARKET = new CryptoOrderType("MARKET", 0);
        LIMIT = new CryptoOrderType("LIMIT", 1);
        UNKNOWN = new CryptoOrderType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        CryptoOrderType[] r02 = a();
        f157379a = r02;
        f157380b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CryptoOrderType(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoOrderType[] a() {
        return new CryptoOrderType[]{MARKET, LIMIT, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f157380b;
    }

    public static CryptoOrderType valueOf(String r1) {
        return (CryptoOrderType) Enum.valueOf(CryptoOrderType.class, r1);
    }

    public static CryptoOrderType[] values() {
        return (CryptoOrderType[]) f157379a.clone();
    }
}
