package com.stockbit.search.ui.searchcompany;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/search/ui/searchcompany/SearchCompanyState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "SUCCESS", "EMPTY", "ERROR", "RECENT", "search_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
enum SearchCompanyState extends Enum<SearchCompanyState> {
    public static final SearchCompanyState EMPTY = null;
    public static final SearchCompanyState ERROR = null;
    public static final SearchCompanyState LOADING = null;
    public static final SearchCompanyState RECENT = null;
    public static final SearchCompanyState SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SearchCompanyState[] f134505a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f134506b = null;

    static {
        LOADING = new SearchCompanyState("LOADING", 0);
        SUCCESS = new SearchCompanyState("SUCCESS", 1);
        EMPTY = new SearchCompanyState("EMPTY", 2);
        ERROR = new SearchCompanyState("ERROR", 3);
        RECENT = new SearchCompanyState("RECENT", 4);
        SearchCompanyState[] r02 = a();
        f134505a = r02;
        f134506b = kotlin.enums.b.a(r02);
    }

    SearchCompanyState(String r1, int r2) {
    }

    public static final /* synthetic */ SearchCompanyState[] a() {
        return new SearchCompanyState[]{LOADING, SUCCESS, EMPTY, ERROR, RECENT};
    }

    public static kotlin.enums.a getEntries() {
        return f134506b;
    }

    public static SearchCompanyState valueOf(String r1) {
        return (SearchCompanyState) Enum.valueOf(SearchCompanyState.class, r1);
    }

    public static SearchCompanyState[] values() {
        return (SearchCompanyState[]) f134505a.clone();
    }
}
