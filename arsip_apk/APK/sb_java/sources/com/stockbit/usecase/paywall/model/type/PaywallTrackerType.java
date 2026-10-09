package com.stockbit.usecase.paywall.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/paywall/model/type/PaywallTrackerType;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_ACCESS", "EXTEND_SUBSCRIBE", "usecase-paywall"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PaywallTrackerType extends Enum<PaywallTrackerType> {
    public static final PaywallTrackerType EXTEND_SUBSCRIBE = null;
    public static final PaywallTrackerType OPEN_ACCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PaywallTrackerType[] f158975a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f158976b = null;

    static {
        OPEN_ACCESS = new PaywallTrackerType("OPEN_ACCESS", 0);
        EXTEND_SUBSCRIBE = new PaywallTrackerType("EXTEND_SUBSCRIBE", 1);
        PaywallTrackerType[] r02 = a();
        f158975a = r02;
        f158976b = b.a(r02);
    }

    PaywallTrackerType(String r1, int r2) {
    }

    public static final /* synthetic */ PaywallTrackerType[] a() {
        return new PaywallTrackerType[]{OPEN_ACCESS, EXTEND_SUBSCRIBE};
    }

    public static a getEntries() {
        return f158976b;
    }

    public static PaywallTrackerType valueOf(String r1) {
        return (PaywallTrackerType) Enum.valueOf(PaywallTrackerType.class, r1);
    }

    public static PaywallTrackerType[] values() {
        return (PaywallTrackerType[]) f158975a.clone();
    }
}
