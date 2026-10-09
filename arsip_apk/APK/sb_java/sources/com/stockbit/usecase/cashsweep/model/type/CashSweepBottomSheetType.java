package com.stockbit.usecase.cashsweep.model.type;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/cashsweep/model/type/CashSweepBottomSheetType;", "", "<init>", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CASH_SWEEP_INACTIVE_USER", "CASH_SWEEP_INVALID_SELECTED_RDN", "CASH_SWEEP_INVALID_MIN_AMOUNT", "CASH_SWEEP_MISMATCH_USER_IDENTITY", "CASH_SWEEP_SUSPENDED_USER_BIBIT", "CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA", "CASH_SWEEP_INSUFFICIENT_UNITS", "CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS", "CASH_SWEEP_INACTIVE_NETBUY_BLOCK", "CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK", "Companion", "usecase-cashsweep"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum CashSweepBottomSheetType extends Enum<CashSweepBottomSheetType> {
    public static final CashSweepBottomSheetType CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_INACTIVE_NETBUY_BLOCK = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_INACTIVE_USER = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_INSUFFICIENT_UNITS = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_INVALID_MIN_AMOUNT = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_INVALID_SELECTED_RDN = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_MISMATCH_USER_IDENTITY = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_SUSPENDED_USER_BIBIT = null;
    public static final CashSweepBottomSheetType CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA = null;
    public static final a Companion = null;
    public static final CashSweepBottomSheetType UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CashSweepBottomSheetType[] f155087a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155088b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CashSweepBottomSheetType a(String r7) {
            CashSweepBottomSheetType[] r02 = CashSweepBottomSheetType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CashSweepBottomSheetType r3 = r02[r2];
            if (y.J(r3.name(), r7, true) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CashSweepBottomSheetType.UNKNOWN;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNKNOWN = new CashSweepBottomSheetType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        CASH_SWEEP_INACTIVE_USER = new CashSweepBottomSheetType("CASH_SWEEP_INACTIVE_USER", 1);
        CASH_SWEEP_INVALID_SELECTED_RDN = new CashSweepBottomSheetType("CASH_SWEEP_INVALID_SELECTED_RDN", 2);
        CASH_SWEEP_INVALID_MIN_AMOUNT = new CashSweepBottomSheetType("CASH_SWEEP_INVALID_MIN_AMOUNT", 3);
        CASH_SWEEP_MISMATCH_USER_IDENTITY = new CashSweepBottomSheetType("CASH_SWEEP_MISMATCH_USER_IDENTITY", 4);
        CASH_SWEEP_SUSPENDED_USER_BIBIT = new CashSweepBottomSheetType("CASH_SWEEP_SUSPENDED_USER_BIBIT", 5);
        CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA = new CashSweepBottomSheetType("CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA", 6);
        CASH_SWEEP_INSUFFICIENT_UNITS = new CashSweepBottomSheetType("CASH_SWEEP_INSUFFICIENT_UNITS", 7);
        CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS = new CashSweepBottomSheetType("CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS", 8);
        CASH_SWEEP_INACTIVE_NETBUY_BLOCK = new CashSweepBottomSheetType("CASH_SWEEP_INACTIVE_NETBUY_BLOCK", 9);
        CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK = new CashSweepBottomSheetType("CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK", 10);
        CashSweepBottomSheetType[] r02 = a();
        f155087a = r02;
        f155088b = b.a(r02);
        Companion = new a(null);
    }

    CashSweepBottomSheetType(String r1, int r2) {
    }

    public static final /* synthetic */ CashSweepBottomSheetType[] a() {
        return new CashSweepBottomSheetType[]{UNKNOWN, CASH_SWEEP_INACTIVE_USER, CASH_SWEEP_INVALID_SELECTED_RDN, CASH_SWEEP_INVALID_MIN_AMOUNT, CASH_SWEEP_MISMATCH_USER_IDENTITY, CASH_SWEEP_SUSPENDED_USER_BIBIT, CASH_SWEEP_UNAVAILABLE_DUE_TO_SHARIA, CASH_SWEEP_INSUFFICIENT_UNITS, CASH_SWEEP_INACTIVATE_BLOCKED_PENDING_UNITS, CASH_SWEEP_INACTIVE_NETBUY_BLOCK, CASH_SWEEP_INACTIVE_NETBUY_AND_PENDING_BLOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f155088b;
    }

    public static CashSweepBottomSheetType valueOf(String r1) {
        return (CashSweepBottomSheetType) Enum.valueOf(CashSweepBottomSheetType.class, r1);
    }

    public static CashSweepBottomSheetType[] values() {
        return (CashSweepBottomSheetType[]) f155087a.clone();
    }
}
