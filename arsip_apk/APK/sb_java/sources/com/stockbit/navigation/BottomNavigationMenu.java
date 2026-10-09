package com.stockbit.navigation;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/stockbit/navigation/BottomNavigationMenu;", "", FirebaseAnalytics.Param.INDEX, "", "menuId", "destinationId", "trackerEventName", "", "trackerValue", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;)V", "getIndex", "()I", "getMenuId", "getDestinationId", "getTrackerEventName", "()Ljava/lang/String;", "getTrackerValue", "Watchlist", "Stream", "Search", "Chat", "Portfolio", "Companion", "navigation_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum BottomNavigationMenu extends Enum<BottomNavigationMenu> {
    public static final BottomNavigationMenu Chat = null;
    public static final a Companion = null;
    public static final BottomNavigationMenu Portfolio = null;
    public static final BottomNavigationMenu Search = null;
    public static final BottomNavigationMenu Stream = null;
    public static final BottomNavigationMenu Watchlist = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BottomNavigationMenu[] f122316a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122317b = null;
    private final int destinationId;
    private final int index;
    private final int menuId;
    private final String trackerEventName;
    private final String trackerValue;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final BottomNavigationMenu a(Integer r5) {
            Iterator<E> r02 = BottomNavigationMenu.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L11;
            Object r1 = r02.next();
            int r2 = ((BottomNavigationMenu) r1).getDestinationId();
            if (r5 == null) goto L4;
            if (r2 != r5.intValue()) goto L4;
        L13:
            return (BottomNavigationMenu) r1;
        L11:
            r1 = null;
            goto L13
        }

        public final BottomNavigationMenu b(int r4) {
            Iterator<E> r02 = BottomNavigationMenu.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((BottomNavigationMenu) r1).getMenuId() != r4) goto L4;
        L10:
            return (BottomNavigationMenu) r1;
        L8:
            r1 = null;
            goto L10
        }

        public final BottomNavigationMenu c(int r4) {
            Iterator<E> r02 = BottomNavigationMenu.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((BottomNavigationMenu) r1).getIndex() != r4) goto L4;
        L9:
            BottomNavigationMenu r12 = (BottomNavigationMenu) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return BottomNavigationMenu.Watchlist;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        Watchlist = new BottomNavigationMenu("Watchlist", 0, 0, D.f122332D, D.f122387q0, "Watchlist Navigation Clicked", "watchlist");
        Stream = new BottomNavigationMenu("Stream", 1, 1, D.f122330B, D.f122383o0, "Stream Navigation Clicked", "Stream");
        Search = new BottomNavigationMenu("Search", 2, 2, D.f122329A, D.f122384p, "Search Navigation Clicked", FirebaseAnalytics.Event.SEARCH);
        Chat = new BottomNavigationMenu("Chat", 3, 3, D.f122397z, D.f122362e, "Chat Navigation Clicked", "chat");
        Portfolio = new BottomNavigationMenu("Portfolio", 4, 4, D.f122331C, D.f122385p0, "Portfolio Navigation Clicked", "portfolio");
        BottomNavigationMenu[] r02 = a();
        f122316a = r02;
        f122317b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    BottomNavigationMenu(String r1, int r2, int r3, int r4, int r5, String r6, String r7) {
        this.index = r3;
        this.menuId = r4;
        this.destinationId = r5;
        this.trackerEventName = r6;
        this.trackerValue = r7;
    }

    public static final /* synthetic */ BottomNavigationMenu[] a() {
        return new BottomNavigationMenu[]{Watchlist, Stream, Search, Chat, Portfolio};
    }

    public static kotlin.enums.a getEntries() {
        return f122317b;
    }

    public static BottomNavigationMenu valueOf(String r1) {
        return (BottomNavigationMenu) Enum.valueOf(BottomNavigationMenu.class, r1);
    }

    public static BottomNavigationMenu[] values() {
        return (BottomNavigationMenu[]) f122316a.clone();
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMenuId() {
        return this.menuId;
    }

    public final String getTrackerEventName() {
        return this.trackerEventName;
    }

    public final String getTrackerValue() {
        return this.trackerValue;
    }
}
