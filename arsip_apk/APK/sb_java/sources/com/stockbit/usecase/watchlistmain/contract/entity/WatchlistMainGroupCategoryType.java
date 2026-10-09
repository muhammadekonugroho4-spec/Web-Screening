package com.stockbit.usecase.watchlistmain.contract.entity;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/watchlistmain/contract/entity/WatchlistMainGroupCategoryType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NORMAL", "ALL_WATCHLIST", "PORTFOLIO", "NEW_WATCHLIST", "Companion", "usecase-watchlist-main-contract"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum WatchlistMainGroupCategoryType extends Enum<WatchlistMainGroupCategoryType> {
    public static final WatchlistMainGroupCategoryType ALL_WATCHLIST = null;
    public static final a Companion = null;
    public static final WatchlistMainGroupCategoryType NEW_WATCHLIST = null;
    public static final WatchlistMainGroupCategoryType NORMAL = null;
    public static final WatchlistMainGroupCategoryType PORTFOLIO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WatchlistMainGroupCategoryType[] f164630a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f164631b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final WatchlistMainGroupCategoryType a(String r5) {
            Iterator<E> r02 = WatchlistMainGroupCategoryType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (y.J(((WatchlistMainGroupCategoryType) r1).getValue(), r5, true) == false) goto L4;
        L9:
            WatchlistMainGroupCategoryType r12 = (WatchlistMainGroupCategoryType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return WatchlistMainGroupCategoryType.NORMAL;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        NORMAL = new WatchlistMainGroupCategoryType("NORMAL", 0, "CATEGORY_TYPE_NORMAL");
        ALL_WATCHLIST = new WatchlistMainGroupCategoryType("ALL_WATCHLIST", 1, "CATEGORY_TYPE_ALL_WATCHLIST");
        PORTFOLIO = new WatchlistMainGroupCategoryType("PORTFOLIO", 2, "CATEGORY_TYPE_PORTFOLIO");
        NEW_WATCHLIST = new WatchlistMainGroupCategoryType("NEW_WATCHLIST", 3, "CATEGORY_TYPE_NEW_WATCHLIST");
        WatchlistMainGroupCategoryType[] r02 = a();
        f164630a = r02;
        f164631b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    WatchlistMainGroupCategoryType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ WatchlistMainGroupCategoryType[] a() {
        return new WatchlistMainGroupCategoryType[]{NORMAL, ALL_WATCHLIST, PORTFOLIO, NEW_WATCHLIST};
    }

    public static kotlin.enums.a getEntries() {
        return f164631b;
    }

    public static WatchlistMainGroupCategoryType valueOf(String r1) {
        return (WatchlistMainGroupCategoryType) Enum.valueOf(WatchlistMainGroupCategoryType.class, r1);
    }

    public static WatchlistMainGroupCategoryType[] values() {
        return (WatchlistMainGroupCategoryType[]) f164630a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
