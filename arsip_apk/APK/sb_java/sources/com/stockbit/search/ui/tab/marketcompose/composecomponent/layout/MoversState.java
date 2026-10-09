package com.stockbit.search.ui.tab.marketcompose.composecomponent.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0083\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/search/ui/tab/marketcompose/composecomponent/layout/MoversState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "SUCCESS", "EMPTY", "ERROR", "search_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
enum MoversState extends Enum<MoversState> {
    public static final MoversState EMPTY = null;
    public static final MoversState ERROR = null;
    public static final MoversState LOADING = null;
    public static final MoversState SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MoversState[] f135082a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f135083b = null;

    static {
        LOADING = new MoversState("LOADING", 0);
        SUCCESS = new MoversState("SUCCESS", 1);
        EMPTY = new MoversState("EMPTY", 2);
        ERROR = new MoversState("ERROR", 3);
        MoversState[] r02 = a();
        f135082a = r02;
        f135083b = kotlin.enums.b.a(r02);
    }

    MoversState(String r1, int r2) {
    }

    public static final /* synthetic */ MoversState[] a() {
        return new MoversState[]{LOADING, SUCCESS, EMPTY, ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f135083b;
    }

    public static MoversState valueOf(String r1) {
        return (MoversState) Enum.valueOf(MoversState.class, r1);
    }

    public static MoversState[] values() {
        return (MoversState[]) f135082a.clone();
    }
}
