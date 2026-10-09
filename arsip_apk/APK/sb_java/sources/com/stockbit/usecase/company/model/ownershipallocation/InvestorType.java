package com.stockbit.usecase.company.model.ownershipallocation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/company/model/ownershipallocation/InvestorType;", "", "<init>", "(Ljava/lang/String;I)V", "FOREIGN", "DOMESTIC", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum InvestorType extends Enum<InvestorType> {
    public static final InvestorType DOMESTIC = null;
    public static final InvestorType FOREIGN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InvestorType[] f156390a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156391b = null;

    static {
        FOREIGN = new InvestorType("FOREIGN", 0);
        DOMESTIC = new InvestorType("DOMESTIC", 1);
        InvestorType[] r02 = a();
        f156390a = r02;
        f156391b = kotlin.enums.b.a(r02);
    }

    InvestorType(String r1, int r2) {
    }

    public static final /* synthetic */ InvestorType[] a() {
        return new InvestorType[]{FOREIGN, DOMESTIC};
    }

    public static kotlin.enums.a getEntries() {
        return f156391b;
    }

    public static InvestorType valueOf(String r1) {
        return (InvestorType) Enum.valueOf(InvestorType.class, r1);
    }

    public static InvestorType[] values() {
        return (InvestorType[]) f156390a.clone();
    }
}
