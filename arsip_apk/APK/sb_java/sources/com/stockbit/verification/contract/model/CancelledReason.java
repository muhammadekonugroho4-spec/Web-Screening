package com.stockbit.verification.contract.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/verification/contract/model/CancelledReason;", "", "<init>", "(Ljava/lang/String;I)V", "FORGOT_PIN_SUCCESS", "OTHER", "verification-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CancelledReason extends Enum<CancelledReason> {
    public static final CancelledReason FORGOT_PIN_SUCCESS = null;
    public static final CancelledReason OTHER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CancelledReason[] f165746a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f165747b = null;

    static {
        FORGOT_PIN_SUCCESS = new CancelledReason("FORGOT_PIN_SUCCESS", 0);
        OTHER = new CancelledReason("OTHER", 1);
        CancelledReason[] r02 = a();
        f165746a = r02;
        f165747b = b.a(r02);
    }

    CancelledReason(String r1, int r2) {
    }

    public static final /* synthetic */ CancelledReason[] a() {
        return new CancelledReason[]{FORGOT_PIN_SUCCESS, OTHER};
    }

    public static a getEntries() {
        return f165747b;
    }

    public static CancelledReason valueOf(String r1) {
        return (CancelledReason) Enum.valueOf(CancelledReason.class, r1);
    }

    public static CancelledReason[] values() {
        return (CancelledReason[]) f165746a.clone();
    }
}
