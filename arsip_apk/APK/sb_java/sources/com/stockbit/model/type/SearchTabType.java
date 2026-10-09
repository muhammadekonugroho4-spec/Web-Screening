package com.stockbit.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/stockbit/model/type/SearchTabType;", "", "position", "", "value", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getPosition", "()I", "getValue", "()Ljava/lang/String;", "All", "Stocks", "People", "Insider", "Catalog", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SearchTabType extends Enum<SearchTabType> {
    public static final SearchTabType All = null;
    public static final SearchTabType Catalog = null;
    public static final a Companion = null;
    public static final SearchTabType Insider = null;
    public static final SearchTabType People = null;
    public static final SearchTabType Stocks = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SearchTabType[] f122212a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122213b = null;
    private final int position;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        All = new SearchTabType("All", 0, 0, "All");
        Stocks = new SearchTabType("Stocks", 1, 1, "Stocks");
        People = new SearchTabType("People", 2, 2, "People");
        Insider = new SearchTabType("Insider", 3, 3, "Insider");
        Catalog = new SearchTabType("Catalog", 4, 4, "Catalog");
        SearchTabType[] r02 = a();
        f122212a = r02;
        f122213b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SearchTabType(String r1, int r2, int r3, String r4) {
        this.position = r3;
        this.value = r4;
    }

    public static final /* synthetic */ SearchTabType[] a() {
        return new SearchTabType[]{All, Stocks, People, Insider, Catalog};
    }

    public static kotlin.enums.a getEntries() {
        return f122213b;
    }

    public static SearchTabType valueOf(String r1) {
        return (SearchTabType) Enum.valueOf(SearchTabType.class, r1);
    }

    public static SearchTabType[] values() {
        return (SearchTabType[]) f122212a.clone();
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getValue() {
        return this.value;
    }
}
