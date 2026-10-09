package com.stockbit.domain.model.entity.securities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/DomainPortfolioType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "REGULAR", "MARGIN", "DAY_TRADE", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum DomainPortfolioType extends Enum<DomainPortfolioType> {
    public static final DomainPortfolioType DAY_TRADE = null;
    public static final DomainPortfolioType MARGIN = null;
    public static final DomainPortfolioType REGULAR = null;
    public static final DomainPortfolioType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DomainPortfolioType[] f83110a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83111b = null;
    private final String value;

    static {
        UNSPECIFIED = new DomainPortfolioType("UNSPECIFIED", 0, "Unspecified");
        REGULAR = new DomainPortfolioType("REGULAR", 1, "Regular");
        MARGIN = new DomainPortfolioType("MARGIN", 2, "Margin");
        DAY_TRADE = new DomainPortfolioType("DAY_TRADE", 3, "Day Trade");
        DomainPortfolioType[] r02 = a();
        f83110a = r02;
        f83111b = kotlin.enums.b.a(r02);
    }

    DomainPortfolioType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ DomainPortfolioType[] a() {
        return new DomainPortfolioType[]{UNSPECIFIED, REGULAR, MARGIN, DAY_TRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f83111b;
    }

    public static DomainPortfolioType valueOf(String r1) {
        return (DomainPortfolioType) Enum.valueOf(DomainPortfolioType.class, r1);
    }

    public static DomainPortfolioType[] values() {
        return (DomainPortfolioType[]) f83110a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
