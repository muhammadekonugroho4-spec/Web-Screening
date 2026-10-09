package com.stockbit.usecase.search.type;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/search/type/RecentSearchPlacement;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "ORDER_PAGE", "usecase-search"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RecentSearchPlacement extends Enum<RecentSearchPlacement> {
    public static final RecentSearchPlacement MAIN = null;
    public static final RecentSearchPlacement ORDER_PAGE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RecentSearchPlacement[] f160156a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160157b = null;

    static {
        MAIN = new RecentSearchPlacement("MAIN", 0);
        ORDER_PAGE = new RecentSearchPlacement("ORDER_PAGE", 1);
        RecentSearchPlacement[] r02 = a();
        f160156a = r02;
        f160157b = b.a(r02);
    }

    RecentSearchPlacement(String r1, int r2) {
    }

    public static final /* synthetic */ RecentSearchPlacement[] a() {
        return new RecentSearchPlacement[]{MAIN, ORDER_PAGE};
    }

    public static kotlin.enums.a getEntries() {
        return f160157b;
    }

    public static RecentSearchPlacement valueOf(String r1) {
        return (RecentSearchPlacement) Enum.valueOf(RecentSearchPlacement.class, r1);
    }

    public static RecentSearchPlacement[] values() {
        return (RecentSearchPlacement[]) f160156a.clone();
    }
}
