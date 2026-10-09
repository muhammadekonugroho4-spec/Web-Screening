package com.stockbit.usecase.cryptoorder.contract.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/cryptoorder/contract/entity/CryptoOrderStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "PARTIAL", "MATCH", "PENDING", "PENDING_CANCEL", "PENDING_REPLACED", "AMENDED", "WITHDRAWN", "REJECTED", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "usecase-crypto-order-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CryptoOrderStatus extends Enum<CryptoOrderStatus> {
    public static final CryptoOrderStatus AMENDED = null;
    public static final a Companion = null;
    public static final CryptoOrderStatus MATCH = null;
    public static final CryptoOrderStatus OPEN = null;
    public static final CryptoOrderStatus PARTIAL = null;
    public static final CryptoOrderStatus PENDING = null;
    public static final CryptoOrderStatus PENDING_CANCEL = null;
    public static final CryptoOrderStatus PENDING_REPLACED = null;
    public static final CryptoOrderStatus REJECTED = null;
    public static final CryptoOrderStatus UNKNOWN = null;
    public static final CryptoOrderStatus WITHDRAWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoOrderStatus[] f157230a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157231b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CryptoOrderStatus a(String r2) {
            if (r2 == null) goto L4;
            String r22 = r2.toUpperCase(Locale.ROOT);
            p.k(r22, "toUpperCase(...)");
        L5:
            if (r22 == null) goto L75;
            switch(r22.hashCode()) {
                case -2143599038: goto L70;
                case -1785097198: goto L65;
                case -1031784143: goto L60;
                case -591108476: goto L57;
                case -171244050: goto L52;
                case -74951327: goto L47;
                case 2432586: goto L42;
                case 35394935: goto L39;
                case 73130405: goto L34;
                case 174130302: goto L29;
                case 352293936: goto L26;
                case 659453081: goto L23;
                case 1115874890: goto L18;
                case 1278469624: goto L13;
                case 2073796962: goto L10;
                default: goto L75;
            };
        L10:
            if (r22.equals("FILLED") == false) goto L75;
        L37:
            return CryptoOrderStatus.MATCH;
        L13:
            if (r22.equals("PENDING_REPLACED") == false) goto L75;
            return CryptoOrderStatus.PENDING_REPLACED;
        L18:
            if (r22.equals("STATUS_UNSPECIFIED") == false) goto L75;
            return CryptoOrderStatus.UNKNOWN;
        L23:
            if (r22.equals("CANCELED") == false) goto L75;
        L63:
            return CryptoOrderStatus.WITHDRAWN;
        L26:
            if (r22.equals("REPLACED") == false) goto L75;
        L55:
            return CryptoOrderStatus.AMENDED;
        L29:
            if (r22.equals("REJECTED") == false) goto L75;
            return CryptoOrderStatus.REJECTED;
        L34:
            if (r22.equals("MATCH") == true) goto L37;
        L39:
            if (r22.equals("PENDING") == false) goto L75;
        L68:
            return CryptoOrderStatus.PENDING;
        L42:
            if (r22.equals("OPEN") == false) goto L75;
            return CryptoOrderStatus.OPEN;
        L47:
            if (r22.equals("PARTIAL") == false) goto L75;
            return CryptoOrderStatus.PARTIAL;
        L52:
            if (r22.equals("AMENDED") == true) goto L55;
        L57:
            if (r22.equals("WITHDRAWN") == true) goto L63;
        L60:
            if (r22.equals("CANCELLED") == true) goto L63;
        L65:
            if (r22.equals("PENDING_OPEN") == true) goto L68;
        L70:
            if (r22.equals("PENDING_CANCEL") == false) goto L75;
            return CryptoOrderStatus.PENDING_CANCEL;
        L75:
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
        PARTIAL = new CryptoOrderStatus("PARTIAL", 1);
        MATCH = new CryptoOrderStatus("MATCH", 2);
        PENDING = new CryptoOrderStatus("PENDING", 3);
        PENDING_CANCEL = new CryptoOrderStatus("PENDING_CANCEL", 4);
        PENDING_REPLACED = new CryptoOrderStatus("PENDING_REPLACED", 5);
        AMENDED = new CryptoOrderStatus("AMENDED", 6);
        WITHDRAWN = new CryptoOrderStatus("WITHDRAWN", 7);
        REJECTED = new CryptoOrderStatus("REJECTED", 8);
        UNKNOWN = new CryptoOrderStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9);
        CryptoOrderStatus[] r02 = a();
        f157230a = r02;
        f157231b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CryptoOrderStatus(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoOrderStatus[] a() {
        return new CryptoOrderStatus[]{OPEN, PARTIAL, MATCH, PENDING, PENDING_CANCEL, PENDING_REPLACED, AMENDED, WITHDRAWN, REJECTED, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f157231b;
    }

    public static CryptoOrderStatus valueOf(String r1) {
        return (CryptoOrderStatus) Enum.valueOf(CryptoOrderStatus.class, r1);
    }

    public static CryptoOrderStatus[] values() {
        return (CryptoOrderStatus[]) f157230a.clone();
    }
}
