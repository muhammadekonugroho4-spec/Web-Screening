package com.stockbit.feature.history.ui.history.realized;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/feature/history/ui/history/realized/StateViewType;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "HISTORY_LIST", "HISTORY_EMPTY", "SEARCH_LIST", "SEARCH_EMPTY", "history_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum StateViewType extends Enum<StateViewType> {
    public static final StateViewType ERROR = null;
    public static final StateViewType HISTORY_EMPTY = null;
    public static final StateViewType HISTORY_LIST = null;
    public static final StateViewType LOADING = null;
    public static final StateViewType SEARCH_EMPTY = null;
    public static final StateViewType SEARCH_LIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StateViewType[] f98099a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98100b = null;

    static {
        LOADING = new StateViewType("LOADING", 0);
        ERROR = new StateViewType("ERROR", 1);
        HISTORY_LIST = new StateViewType("HISTORY_LIST", 2);
        HISTORY_EMPTY = new StateViewType("HISTORY_EMPTY", 3);
        SEARCH_LIST = new StateViewType("SEARCH_LIST", 4);
        SEARCH_EMPTY = new StateViewType("SEARCH_EMPTY", 5);
        StateViewType[] r02 = a();
        f98099a = r02;
        f98100b = kotlin.enums.b.a(r02);
    }

    StateViewType(String r1, int r2) {
    }

    public static final /* synthetic */ StateViewType[] a() {
        return new StateViewType[]{LOADING, ERROR, HISTORY_LIST, HISTORY_EMPTY, SEARCH_LIST, SEARCH_EMPTY};
    }

    public static kotlin.enums.a getEntries() {
        return f98100b;
    }

    public static StateViewType valueOf(String r1) {
        return (StateViewType) Enum.valueOf(StateViewType.class, r1);
    }

    public static StateViewType[] values() {
        return (StateViewType[]) f98099a.clone();
    }
}
