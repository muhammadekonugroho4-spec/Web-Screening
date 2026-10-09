package com.stockbit.usecase.cryptotransaction.contract.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/cryptotransaction/contract/entity/CryptoOrderStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "PARTIALLY_FILLED", "FILLED", "CANCELLED", "REJECTED", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "usecase-crypto-transaction-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CryptoOrderStatus extends Enum<CryptoOrderStatus> {
    public static final CryptoOrderStatus CANCELLED = null;
    public static final a Companion = null;
    public static final CryptoOrderStatus FILLED = null;
    public static final CryptoOrderStatus OPEN = null;
    public static final CryptoOrderStatus PARTIALLY_FILLED = null;
    public static final CryptoOrderStatus REJECTED = null;
    public static final CryptoOrderStatus UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoOrderStatus[] f157377a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157378b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final CryptoOrderStatus a(String r2) {
            if (r2 == null) goto L4;
            String r22 = r2.toUpperCase(Locale.ROOT);
            p.k(r22, "toUpperCase(...)");
        L5:
            if (r22 == null) goto L38;
            switch(r22.hashCode()) {
                case -1367321581: goto L33;
                case -1031784143: goto L28;
                case 2432586: goto L23;
                case 174130302: goto L18;
                case 659453081: goto L15;
                case 2073796962: goto L10;
                default: goto L38;
            };
        L10:
            if (r22.equals("FILLED") == false) goto L38;
            return CryptoOrderStatus.FILLED;
        L15:
            if (r22.equals("CANCELED") == false) goto L38;
        L31:
            return CryptoOrderStatus.CANCELLED;
        L18:
            if (r22.equals("REJECTED") == false) goto L38;
            return CryptoOrderStatus.REJECTED;
        L23:
            if (r22.equals("OPEN") == false) goto L38;
            return CryptoOrderStatus.OPEN;
        L28:
            if (r22.equals("CANCELLED") == true) goto L31;
        L33:
            if (r22.equals("PARTIALLY_FILLED") == false) goto L38;
            return CryptoOrderStatus.PARTIALLY_FILLED;
        L38:
            return CryptoOrderStatus.UNKNOWN;
        L4:
            r22 = null;
            goto L5
        }

        public a() {
        }
    }

    static {
        OPEN = new CryptoOrderStatus("OPEN", 0);
        PARTIALLY_FILLED = new CryptoOrderStatus("PARTIALLY_FILLED", 1);
        FILLED = new CryptoOrderStatus("FILLED", 2);
        CANCELLED = new CryptoOrderStatus("CANCELLED", 3);
        REJECTED = new CryptoOrderStatus("REJECTED", 4);
        UNKNOWN = new CryptoOrderStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        CryptoOrderStatus[] r02 = a();
        f157377a = r02;
        f157378b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CryptoOrderStatus(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoOrderStatus[] a() {
        return new CryptoOrderStatus[]{OPEN, PARTIALLY_FILLED, FILLED, CANCELLED, REJECTED, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f157378b;
    }

    public static CryptoOrderStatus valueOf(String r1) {
        return (CryptoOrderStatus) Enum.valueOf(CryptoOrderStatus.class, r1);
    }

    public static CryptoOrderStatus[] values() {
        return (CryptoOrderStatus[]) f157377a.clone();
    }
}
