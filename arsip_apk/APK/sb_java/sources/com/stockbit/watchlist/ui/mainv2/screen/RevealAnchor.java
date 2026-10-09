package com.stockbit.watchlist.ui.mainv2.screen;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/watchlist/ui/mainv2/screen/RevealAnchor;", "", "<init>", "(Ljava/lang/String;I)V", "OpenBuy", "Closed", "OpenDelete", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
enum RevealAnchor extends Enum<RevealAnchor> {
    public static final RevealAnchor Closed = null;
    public static final RevealAnchor OpenBuy = null;
    public static final RevealAnchor OpenDelete = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RevealAnchor[] f170366a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f170367b = null;

    static {
        OpenBuy = new RevealAnchor("OpenBuy", 0);
        Closed = new RevealAnchor("Closed", 1);
        OpenDelete = new RevealAnchor("OpenDelete", 2);
        RevealAnchor[] r02 = a();
        f170366a = r02;
        f170367b = kotlin.enums.b.a(r02);
    }

    RevealAnchor(String r1, int r2) {
    }

    public static final /* synthetic */ RevealAnchor[] a() {
        return new RevealAnchor[]{OpenBuy, Closed, OpenDelete};
    }

    public static kotlin.enums.a getEntries() {
        return f170367b;
    }

    public static RevealAnchor valueOf(String r1) {
        return (RevealAnchor) Enum.valueOf(RevealAnchor.class, r1);
    }

    public static RevealAnchor[] values() {
        return (RevealAnchor[]) f170366a.clone();
    }
}
