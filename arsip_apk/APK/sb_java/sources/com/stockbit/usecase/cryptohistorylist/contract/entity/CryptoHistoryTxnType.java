package com.stockbit.usecase.cryptohistorylist.contract.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.B;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/cryptohistorylist/contract/entity/CryptoHistoryTxnType;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER", "DEPOSIT", "CASH_IN", "CASH_OUT", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "usecase-crypto-history-list-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CryptoHistoryTxnType extends Enum<CryptoHistoryTxnType> {
    public static final CryptoHistoryTxnType CASH_IN = null;
    public static final CryptoHistoryTxnType CASH_OUT = null;
    public static final a Companion = null;
    public static final CryptoHistoryTxnType DEPOSIT = null;
    public static final CryptoHistoryTxnType ORDER = null;
    public static final CryptoHistoryTxnType UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoHistoryTxnType[] f157204a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157205b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CryptoHistoryTxnType a(String r2) {
            if (r2 == null) goto L6;
            String r22 = B.D1(r2).toString();
            if (r22 == null) goto L6;
            String r23 = r22.toUpperCase(Locale.ROOT);
            p.k(r23, "toUpperCase(...)");
        L7:
            if (r23 == null) goto L32;
            switch(r23.hashCode()) {
                case -2022530434: goto L27;
                case 75468590: goto L22;
                case 807994402: goto L17;
                case 1272990129: goto L12;
                default: goto L32;
            };
        L12:
            if (r23.equals("CASH_IN") == false) goto L32;
            return CryptoHistoryTxnType.CASH_IN;
        L17:
            if (r23.equals("CASH_OUT") == false) goto L32;
            return CryptoHistoryTxnType.CASH_OUT;
        L22:
            if (r23.equals("ORDER") == false) goto L32;
            return CryptoHistoryTxnType.ORDER;
        L27:
            if (r23.equals("DEPOSIT") == false) goto L32;
            return CryptoHistoryTxnType.DEPOSIT;
        L32:
            return CryptoHistoryTxnType.UNKNOWN;
        L6:
            r23 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        ORDER = new CryptoHistoryTxnType("ORDER", 0);
        DEPOSIT = new CryptoHistoryTxnType("DEPOSIT", 1);
        CASH_IN = new CryptoHistoryTxnType("CASH_IN", 2);
        CASH_OUT = new CryptoHistoryTxnType("CASH_OUT", 3);
        UNKNOWN = new CryptoHistoryTxnType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        CryptoHistoryTxnType[] r02 = a();
        f157204a = r02;
        f157205b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CryptoHistoryTxnType(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoHistoryTxnType[] a() {
        return new CryptoHistoryTxnType[]{ORDER, DEPOSIT, CASH_IN, CASH_OUT, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f157205b;
    }

    public static CryptoHistoryTxnType valueOf(String r1) {
        return (CryptoHistoryTxnType) Enum.valueOf(CryptoHistoryTxnType.class, r1);
    }

    public static CryptoHistoryTxnType[] values() {
        return (CryptoHistoryTxnType[]) f157204a.clone();
    }
}
