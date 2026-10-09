package com.stockbit.component.securities.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/component/securities/model/CompanyInfoSymbolTextType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADING_LARGE", "HEADING_REGULAR", "securities_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CompanyInfoSymbolTextType extends Enum<CompanyInfoSymbolTextType> {
    public static final CompanyInfoSymbolTextType HEADING_LARGE = null;
    public static final CompanyInfoSymbolTextType HEADING_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyInfoSymbolTextType[] f76363a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f76364b = null;

    static {
        HEADING_LARGE = new CompanyInfoSymbolTextType("HEADING_LARGE", 0);
        HEADING_REGULAR = new CompanyInfoSymbolTextType("HEADING_REGULAR", 1);
        CompanyInfoSymbolTextType[] r02 = a();
        f76363a = r02;
        f76364b = kotlin.enums.b.a(r02);
    }

    CompanyInfoSymbolTextType(String r1, int r2) {
    }

    public static final /* synthetic */ CompanyInfoSymbolTextType[] a() {
        return new CompanyInfoSymbolTextType[]{HEADING_LARGE, HEADING_REGULAR};
    }

    public static kotlin.enums.a getEntries() {
        return f76364b;
    }

    public static CompanyInfoSymbolTextType valueOf(String r1) {
        return (CompanyInfoSymbolTextType) Enum.valueOf(CompanyInfoSymbolTextType.class, r1);
    }

    public static CompanyInfoSymbolTextType[] values() {
        return (CompanyInfoSymbolTextType[]) f76363a.clone();
    }
}
