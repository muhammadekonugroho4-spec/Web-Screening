package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/type/CashSweepInfoStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "CASH_SWEEP_STATUS_UNSPECIFIED", "CASH_SWEEP_STATUS_NOT_ELIGIBLE", "CASH_SWEEP_STATUS_ELIGIBLE", "CASH_SWEEP_STATUS_ACTIVATED", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CashSweepInfoStatusType extends Enum<CashSweepInfoStatusType> {
    public static final CashSweepInfoStatusType CASH_SWEEP_STATUS_ACTIVATED = null;
    public static final CashSweepInfoStatusType CASH_SWEEP_STATUS_ELIGIBLE = null;
    public static final CashSweepInfoStatusType CASH_SWEEP_STATUS_NOT_ELIGIBLE = null;
    public static final CashSweepInfoStatusType CASH_SWEEP_STATUS_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CashSweepInfoStatusType[] f87640a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87641b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CashSweepInfoStatusType a(String r7) {
            CashSweepInfoStatusType[] r02 = CashSweepInfoStatusType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CashSweepInfoStatusType r3 = r02[r2];
            if (y.J(r3.name(), r7, true) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CashSweepInfoStatusType.CASH_SWEEP_STATUS_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        CASH_SWEEP_STATUS_UNSPECIFIED = new CashSweepInfoStatusType("CASH_SWEEP_STATUS_UNSPECIFIED", 0);
        CASH_SWEEP_STATUS_NOT_ELIGIBLE = new CashSweepInfoStatusType("CASH_SWEEP_STATUS_NOT_ELIGIBLE", 1);
        CASH_SWEEP_STATUS_ELIGIBLE = new CashSweepInfoStatusType("CASH_SWEEP_STATUS_ELIGIBLE", 2);
        CASH_SWEEP_STATUS_ACTIVATED = new CashSweepInfoStatusType("CASH_SWEEP_STATUS_ACTIVATED", 3);
        CashSweepInfoStatusType[] r02 = a();
        f87640a = r02;
        f87641b = b.a(r02);
        Companion = new a(null);
    }

    CashSweepInfoStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ CashSweepInfoStatusType[] a() {
        return new CashSweepInfoStatusType[]{CASH_SWEEP_STATUS_UNSPECIFIED, CASH_SWEEP_STATUS_NOT_ELIGIBLE, CASH_SWEEP_STATUS_ELIGIBLE, CASH_SWEEP_STATUS_ACTIVATED};
    }

    public static kotlin.enums.a getEntries() {
        return f87641b;
    }

    public static CashSweepInfoStatusType valueOf(String r1) {
        return (CashSweepInfoStatusType) Enum.valueOf(CashSweepInfoStatusType.class, r1);
    }

    public static CashSweepInfoStatusType[] values() {
        return (CashSweepInfoStatusType[]) f87640a.clone();
    }
}
