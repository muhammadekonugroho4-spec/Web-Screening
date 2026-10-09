package com.stockbit.domain.model.type.search;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/type/search/CatalogSortType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "SORT_ORDER_TOP_CONCENTRATION", "SORT_ORDER_TOP_GAINER", "SORT_ORDER_TOP_LOSER", "SORT_ORDER_HIGHEST_PRICE", "SORT_ORDER_LOWEST_PRICE", "SORT_ORDER_HIGHEST_MARKET_CAP", "SORT_ORDER_TOP_LIQUIDITY", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CatalogSortType extends Enum<CatalogSortType> {
    public static final CatalogSortType SORT_ORDER_HIGHEST_MARKET_CAP = null;
    public static final CatalogSortType SORT_ORDER_HIGHEST_PRICE = null;
    public static final CatalogSortType SORT_ORDER_LOWEST_PRICE = null;
    public static final CatalogSortType SORT_ORDER_TOP_CONCENTRATION = null;
    public static final CatalogSortType SORT_ORDER_TOP_GAINER = null;
    public static final CatalogSortType SORT_ORDER_TOP_LIQUIDITY = null;
    public static final CatalogSortType SORT_ORDER_TOP_LOSER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CatalogSortType[] f86406a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86407b = null;
    private final String label;

    static {
        SORT_ORDER_TOP_CONCENTRATION = new CatalogSortType("SORT_ORDER_TOP_CONCENTRATION", 0, "Top Concentration");
        SORT_ORDER_TOP_GAINER = new CatalogSortType("SORT_ORDER_TOP_GAINER", 1, "Top Gainer");
        SORT_ORDER_TOP_LOSER = new CatalogSortType("SORT_ORDER_TOP_LOSER", 2, "Top Loser");
        SORT_ORDER_HIGHEST_PRICE = new CatalogSortType("SORT_ORDER_HIGHEST_PRICE", 3, "Highest Price");
        SORT_ORDER_LOWEST_PRICE = new CatalogSortType("SORT_ORDER_LOWEST_PRICE", 4, "Lowest Price");
        SORT_ORDER_HIGHEST_MARKET_CAP = new CatalogSortType("SORT_ORDER_HIGHEST_MARKET_CAP", 5, "Highest Market Cap");
        SORT_ORDER_TOP_LIQUIDITY = new CatalogSortType("SORT_ORDER_TOP_LIQUIDITY", 6, "Top Liquidity");
        CatalogSortType[] r02 = a();
        f86406a = r02;
        f86407b = b.a(r02);
    }

    CatalogSortType(String r1, int r2, String r3) {
        this.label = r3;
    }

    public static final /* synthetic */ CatalogSortType[] a() {
        return new CatalogSortType[]{SORT_ORDER_TOP_CONCENTRATION, SORT_ORDER_TOP_GAINER, SORT_ORDER_TOP_LOSER, SORT_ORDER_HIGHEST_PRICE, SORT_ORDER_LOWEST_PRICE, SORT_ORDER_HIGHEST_MARKET_CAP, SORT_ORDER_TOP_LIQUIDITY};
    }

    public static a getEntries() {
        return f86407b;
    }

    public static CatalogSortType valueOf(String r1) {
        return (CatalogSortType) Enum.valueOf(CatalogSortType.class, r1);
    }

    public static CatalogSortType[] values() {
        return (CatalogSortType[]) f86406a.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
