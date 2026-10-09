package com.stockbit.watchlist.ui.mainv2.state;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f171017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f171018b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f171019c;

    static {
    }

    public t(String r1, int r2, boolean r3) {
        this.f171017a = r1;
        this.f171018b = r2;
        this.f171019c = r3;
    }

    public final String a() {
        return this.f171017a;
    }

    public final int b() {
        return this.f171018b;
    }

    public final boolean c() {
        return this.f171019c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f171017a, r52.f171017a) == true) goto L12;
        return false;
    L12:
        if (this.f171018b == r52.f171018b) goto L15;
        return false;
    L15:
        if (this.f171019c == r52.f171019c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f171017a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((r03 * 31) + Integer.hashCode(this.f171018b)) * 31) + Boolean.hashCode(this.f171019c);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "WatchlistMainTopBarUIData(avatarUrl=" + this.f171017a + ", unreadNotificationCount=" + this.f171018b + ", isUpdateBadgeVisible=" + this.f171019c + ')';
    }

    public /* synthetic */ t(String r2, int r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
