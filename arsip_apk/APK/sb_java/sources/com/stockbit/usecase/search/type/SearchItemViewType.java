package com.stockbit.usecase.search.type;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/stockbit/usecase/search/type/SearchItemViewType;", "", "value", "", "requestType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/String;", "getRequestType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "USER_VIEW_TYPE", "STOCK_VIEW_TYPE", "INSIDER_VIEW_TYPE", "SECTOR_VIEW_TYPE", "ALL_TYPE", "Companion", "usecase-search"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SearchItemViewType extends Enum<SearchItemViewType> {
    public static final SearchItemViewType ALL_TYPE = null;
    public static final a Companion = null;
    public static final SearchItemViewType INSIDER_VIEW_TYPE = null;
    public static final SearchItemViewType SECTOR_VIEW_TYPE = null;
    public static final SearchItemViewType STOCK_VIEW_TYPE = null;
    public static final SearchItemViewType USER_VIEW_TYPE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SearchItemViewType[] f160158a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160159b = null;
    private final Integer requestType;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final SearchItemViewType a(String r8) {
            p.l(r8, "string");
            SearchItemViewType[] r02 = SearchItemViewType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            SearchItemViewType r3 = r02[r2];
            String r4 = r3.getValue();
            Locale r5 = Locale.ROOT;
            String r42 = r4.toLowerCase(r5);
            p.k(r42, "toLowerCase(...)");
            String r52 = r8.toLowerCase(r5);
            p.k(r52, "toLowerCase(...)");
            if (p.g(r42, r52) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return SearchItemViewType.STOCK_VIEW_TYPE;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        USER_VIEW_TYPE = new SearchItemViewType("USER_VIEW_TYPE", 0, "User", 1);
        STOCK_VIEW_TYPE = new SearchItemViewType("STOCK_VIEW_TYPE", 1, "Saham", 2);
        String r6 = "INSIDER_VIEW_TYPE";
        int r7 = 2;
        String r8 = "Insider";
        Integer r9 = null;
        INSIDER_VIEW_TYPE = new SearchItemViewType(r6, r7, r8, r9, 2, null);
        String r72 = "SECTOR_VIEW_TYPE";
        int r82 = 3;
        String r92 = "Sector";
        Integer r10 = null;
        SECTOR_VIEW_TYPE = new SearchItemViewType(r72, r82, r92, r10, 2, null);
        ALL_TYPE = new SearchItemViewType("ALL_TYPE", 4, "", null);
        SearchItemViewType[] r02 = a();
        f160158a = r02;
        f160159b = b.a(r02);
        Companion = new a(null);
    }

    SearchItemViewType(String r1, int r2, String r3, Integer r4) {
        this.value = r3;
        this.requestType = r4;
    }

    public static final /* synthetic */ SearchItemViewType[] a() {
        return new SearchItemViewType[]{USER_VIEW_TYPE, STOCK_VIEW_TYPE, INSIDER_VIEW_TYPE, SECTOR_VIEW_TYPE, ALL_TYPE};
    }

    public static kotlin.enums.a getEntries() {
        return f160159b;
    }

    public static SearchItemViewType valueOf(String r1) {
        return (SearchItemViewType) Enum.valueOf(SearchItemViewType.class, r1);
    }

    public static SearchItemViewType[] values() {
        return (SearchItemViewType[]) f160158a.clone();
    }

    public final Integer getRequestType() {
        return this.requestType;
    }

    public final String getValue() {
        return this.value;
    }

    /* synthetic */ SearchItemViewType(String r1, int r2, String r3, Integer r4, int r5, i r6) {
        if ((r5 & 2) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
