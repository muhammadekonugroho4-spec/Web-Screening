package com.stockbit.feature.trusteddevice.base.waitingapproval;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/trusteddevice/base/waitingapproval/ApprovalStatus;", "", "<init>", "(Ljava/lang/String;I)V", "WAITING", "REJECTED", "EXPIRED", "BLOCKED", "trusteddevice_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum ApprovalStatus extends Enum<ApprovalStatus> {
    public static final ApprovalStatus BLOCKED = null;
    public static final ApprovalStatus EXPIRED = null;
    public static final ApprovalStatus REJECTED = null;
    public static final ApprovalStatus WAITING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ApprovalStatus[] f117689a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f117690b = null;

    static {
        WAITING = new ApprovalStatus("WAITING", 0);
        REJECTED = new ApprovalStatus("REJECTED", 1);
        EXPIRED = new ApprovalStatus("EXPIRED", 2);
        BLOCKED = new ApprovalStatus("BLOCKED", 3);
        ApprovalStatus[] r02 = a();
        f117689a = r02;
        f117690b = kotlin.enums.b.a(r02);
    }

    ApprovalStatus(String r1, int r2) {
    }

    public static final /* synthetic */ ApprovalStatus[] a() {
        return new ApprovalStatus[]{WAITING, REJECTED, EXPIRED, BLOCKED};
    }

    public static kotlin.enums.a getEntries() {
        return f117690b;
    }

    public static ApprovalStatus valueOf(String r1) {
        return (ApprovalStatus) Enum.valueOf(ApprovalStatus.class, r1);
    }

    public static ApprovalStatus[] values() {
        return (ApprovalStatus[]) f117689a.clone();
    }
}
