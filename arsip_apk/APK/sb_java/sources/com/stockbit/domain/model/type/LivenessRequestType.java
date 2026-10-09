package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/LivenessRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "AMEND_BANK", "VERIFIED_BADGE", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LivenessRequestType extends Enum<LivenessRequestType> {
    public static final LivenessRequestType AMEND_BANK = null;
    public static final LivenessRequestType VERIFIED_BADGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LivenessRequestType[] f86205a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86206b = null;

    static {
        AMEND_BANK = new LivenessRequestType("AMEND_BANK", 0);
        VERIFIED_BADGE = new LivenessRequestType("VERIFIED_BADGE", 1);
        LivenessRequestType[] r02 = a();
        f86205a = r02;
        f86206b = kotlin.enums.b.a(r02);
    }

    LivenessRequestType(String r1, int r2) {
    }

    public static final /* synthetic */ LivenessRequestType[] a() {
        return new LivenessRequestType[]{AMEND_BANK, VERIFIED_BADGE};
    }

    public static kotlin.enums.a getEntries() {
        return f86206b;
    }

    public static LivenessRequestType valueOf(String r1) {
        return (LivenessRequestType) Enum.valueOf(LivenessRequestType.class, r1);
    }

    public static LivenessRequestType[] values() {
        return (LivenessRequestType[]) f86205a.clone();
    }
}
