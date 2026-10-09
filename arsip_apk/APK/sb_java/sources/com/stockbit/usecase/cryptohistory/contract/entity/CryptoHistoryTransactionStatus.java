package com.stockbit.usecase.cryptohistory.contract.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.B;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/cryptohistory/contract/entity/CryptoHistoryTransactionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PENDING", "FAILED", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "usecase-crypto-history-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CryptoHistoryTransactionStatus extends Enum<CryptoHistoryTransactionStatus> {
    public static final a Companion = null;
    public static final CryptoHistoryTransactionStatus FAILED = null;
    public static final CryptoHistoryTransactionStatus PENDING = null;
    public static final CryptoHistoryTransactionStatus SUCCESS = null;
    public static final CryptoHistoryTransactionStatus UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoHistoryTransactionStatus[] f157134a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157135b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CryptoHistoryTransactionStatus a(String r3) {
            if (r3 == null) goto L6;
            String r32 = B.D1(r3).toString();
            if (r32 == null) goto L6;
            String r33 = r32.toUpperCase(Locale.ROOT);
            p.k(r33, "toUpperCase(...)");
        L7:
            if (r33 == null) goto L31;
            int r02 = r33.hashCode();
            if (r02 == (-1149187101)) goto L26;
            if (r02 == 35394935) goto L21;
            if (r02 != 2066319421) goto L31;
            if (r33.equals("FAILED") == false) goto L31;
            return CryptoHistoryTransactionStatus.FAILED;
        L21:
            if (r33.equals("PENDING") == false) goto L31;
            return CryptoHistoryTransactionStatus.PENDING;
        L26:
            if (r33.equals("SUCCESS") == false) goto L31;
            return CryptoHistoryTransactionStatus.SUCCESS;
        L31:
            return CryptoHistoryTransactionStatus.UNKNOWN;
        L6:
            r33 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        SUCCESS = new CryptoHistoryTransactionStatus("SUCCESS", 0);
        PENDING = new CryptoHistoryTransactionStatus("PENDING", 1);
        FAILED = new CryptoHistoryTransactionStatus("FAILED", 2);
        UNKNOWN = new CryptoHistoryTransactionStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        CryptoHistoryTransactionStatus[] r02 = a();
        f157134a = r02;
        f157135b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CryptoHistoryTransactionStatus(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoHistoryTransactionStatus[] a() {
        return new CryptoHistoryTransactionStatus[]{SUCCESS, PENDING, FAILED, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f157135b;
    }

    public static CryptoHistoryTransactionStatus valueOf(String r1) {
        return (CryptoHistoryTransactionStatus) Enum.valueOf(CryptoHistoryTransactionStatus.class, r1);
    }

    public static CryptoHistoryTransactionStatus[] values() {
        return (CryptoHistoryTransactionStatus[]) f157134a.clone();
    }
}
