package com.stockbit.usecase.cryptoorder.contract.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/cryptoorder/contract/entity/CryptoOrderExpiry;", "", "<init>", "(Ljava/lang/String;I)V", "GOOD_TILL_CANCEL", "DAY", "FILL_AND_KILL", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "usecase-crypto-order-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CryptoOrderExpiry extends Enum<CryptoOrderExpiry> {
    public static final a Companion = null;
    public static final CryptoOrderExpiry DAY = null;
    public static final CryptoOrderExpiry FILL_AND_KILL = null;
    public static final CryptoOrderExpiry GOOD_TILL_CANCEL = null;
    public static final CryptoOrderExpiry UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoOrderExpiry[] f157228a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157229b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GOOD_TILL_CANCEL = new CryptoOrderExpiry("GOOD_TILL_CANCEL", 0);
        DAY = new CryptoOrderExpiry("DAY", 1);
        FILL_AND_KILL = new CryptoOrderExpiry("FILL_AND_KILL", 2);
        UNKNOWN = new CryptoOrderExpiry(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        CryptoOrderExpiry[] r02 = a();
        f157228a = r02;
        f157229b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CryptoOrderExpiry(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoOrderExpiry[] a() {
        return new CryptoOrderExpiry[]{GOOD_TILL_CANCEL, DAY, FILL_AND_KILL, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f157229b;
    }

    public static CryptoOrderExpiry valueOf(String r1) {
        return (CryptoOrderExpiry) Enum.valueOf(CryptoOrderExpiry.class, r1);
    }

    public static CryptoOrderExpiry[] values() {
        return (CryptoOrderExpiry[]) f157228a.clone();
    }
}
