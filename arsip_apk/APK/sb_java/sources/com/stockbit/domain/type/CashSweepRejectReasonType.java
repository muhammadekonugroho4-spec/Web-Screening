package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/type/CashSweepRejectReasonType;", "", "<init>", "(Ljava/lang/String;I)V", "REJECT_REASON_TYPE_UNSPECIFIED", "REJECT_REASON_TYPE_REJECTED_BY_BIBIT", "REJECT_REASON_TYPE_DIFFERENT_IDENTITY", "REJECT_REASON_TYPE_OTHER", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CashSweepRejectReasonType extends Enum<CashSweepRejectReasonType> {
    public static final a Companion = null;
    public static final CashSweepRejectReasonType REJECT_REASON_TYPE_DIFFERENT_IDENTITY = null;
    public static final CashSweepRejectReasonType REJECT_REASON_TYPE_OTHER = null;
    public static final CashSweepRejectReasonType REJECT_REASON_TYPE_REJECTED_BY_BIBIT = null;
    public static final CashSweepRejectReasonType REJECT_REASON_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CashSweepRejectReasonType[] f87642a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87643b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CashSweepRejectReasonType a(String r7) {
            CashSweepRejectReasonType[] r02 = CashSweepRejectReasonType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CashSweepRejectReasonType r3 = r02[r2];
            if (y.J(r3.name(), r7, true) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CashSweepRejectReasonType.REJECT_REASON_TYPE_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        REJECT_REASON_TYPE_UNSPECIFIED = new CashSweepRejectReasonType("REJECT_REASON_TYPE_UNSPECIFIED", 0);
        REJECT_REASON_TYPE_REJECTED_BY_BIBIT = new CashSweepRejectReasonType("REJECT_REASON_TYPE_REJECTED_BY_BIBIT", 1);
        REJECT_REASON_TYPE_DIFFERENT_IDENTITY = new CashSweepRejectReasonType("REJECT_REASON_TYPE_DIFFERENT_IDENTITY", 2);
        REJECT_REASON_TYPE_OTHER = new CashSweepRejectReasonType("REJECT_REASON_TYPE_OTHER", 3);
        CashSweepRejectReasonType[] r02 = a();
        f87642a = r02;
        f87643b = b.a(r02);
        Companion = new a(null);
    }

    CashSweepRejectReasonType(String r1, int r2) {
    }

    public static final /* synthetic */ CashSweepRejectReasonType[] a() {
        return new CashSweepRejectReasonType[]{REJECT_REASON_TYPE_UNSPECIFIED, REJECT_REASON_TYPE_REJECTED_BY_BIBIT, REJECT_REASON_TYPE_DIFFERENT_IDENTITY, REJECT_REASON_TYPE_OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f87643b;
    }

    public static CashSweepRejectReasonType valueOf(String r1) {
        return (CashSweepRejectReasonType) Enum.valueOf(CashSweepRejectReasonType.class, r1);
    }

    public static CashSweepRejectReasonType[] values() {
        return (CashSweepRejectReasonType[]) f87642a.clone();
    }
}
