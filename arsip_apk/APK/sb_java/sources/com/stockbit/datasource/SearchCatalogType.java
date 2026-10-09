package com.stockbit.datasource;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/datasource/SearchCatalogType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SECTOR", "INDUSTRY", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SearchCatalogType extends Enum<SearchCatalogType> {
    public static final SearchCatalogType INDUSTRY = null;
    public static final SearchCatalogType SECTOR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SearchCatalogType[] f80064a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80065b = null;
    private final String value;

    static {
        SECTOR = new SearchCatalogType("SECTOR", 0, "CATALOG_TYPE_SECTOR");
        INDUSTRY = new SearchCatalogType("INDUSTRY", 1, "CATALOG_TYPE_INDUSTRY");
        SearchCatalogType[] r02 = a();
        f80064a = r02;
        f80065b = kotlin.enums.b.a(r02);
    }

    SearchCatalogType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SearchCatalogType[] a() {
        return new SearchCatalogType[]{SECTOR, INDUSTRY};
    }

    public static kotlin.enums.a getEntries() {
        return f80065b;
    }

    public static SearchCatalogType valueOf(String r1) {
        return (SearchCatalogType) Enum.valueOf(SearchCatalogType.class, r1);
    }

    public static SearchCatalogType[] values() {
        return (SearchCatalogType[]) f80064a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
