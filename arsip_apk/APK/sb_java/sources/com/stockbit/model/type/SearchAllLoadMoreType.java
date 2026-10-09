package com.stockbit.model.type;

import com.clevertap.android.sdk.Constants;
import com.stockbit.search.SearchEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/model/type/SearchAllLoadMoreType;", "", "value", "", Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getTitle", "Sector", "Company", "People", "Insider", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SearchAllLoadMoreType extends Enum<SearchAllLoadMoreType> {
    public static final a Companion = null;
    public static final SearchAllLoadMoreType Company = null;
    public static final SearchAllLoadMoreType Insider = null;
    public static final SearchAllLoadMoreType People = null;
    public static final SearchAllLoadMoreType Sector = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SearchAllLoadMoreType[] f122210a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122211b = null;
    private final String title;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        Sector = new SearchAllLoadMoreType("Sector", 0, SearchEntryPoint.KEY_SECTOR, "More Catalog…");
        Company = new SearchAllLoadMoreType("Company", 1, "stock", "More Stocks…");
        People = new SearchAllLoadMoreType("People", 2, "people", "More People…");
        Insider = new SearchAllLoadMoreType("Insider", 3, "insider", "More Insider…");
        SearchAllLoadMoreType[] r02 = a();
        f122210a = r02;
        f122211b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SearchAllLoadMoreType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.title = r4;
    }

    public static final /* synthetic */ SearchAllLoadMoreType[] a() {
        return new SearchAllLoadMoreType[]{Sector, Company, People, Insider};
    }

    public static kotlin.enums.a getEntries() {
        return f122211b;
    }

    public static SearchAllLoadMoreType valueOf(String r1) {
        return (SearchAllLoadMoreType) Enum.valueOf(SearchAllLoadMoreType.class, r1);
    }

    public static SearchAllLoadMoreType[] values() {
        return (SearchAllLoadMoreType[]) f122210a.clone();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
