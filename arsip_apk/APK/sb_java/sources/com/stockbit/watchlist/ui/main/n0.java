package com.stockbit.watchlist.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class n0 implements InterfaceC4094y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f169846h = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f169847a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f169848b;

    /* renamed from: c, reason: collision with root package name */
    public final String f169849c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f169850e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f169851f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f169852g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n0 a(Bundle r12) {
            kotlin.jvm.internal.p.l(r12, "bundle");
            r12.setClassLoader(n0.class.getClassLoader());
            String r2 = null;
            if (r12.containsKey("errorToastMessage") == false) goto L5;
            String r4 = r12.getString("errorToastMessage");
        L6:
            boolean r3 = false;
            if (r12.containsKey("showUnfreezeChangePasswordPin") == false) goto L9;
            boolean r5 = r12.getBoolean("showUnfreezeChangePasswordPin");
        L11:
            if (r12.containsKey("preselectedWatchlistId") == false) goto L13;
            String r6 = r12.getString("preselectedWatchlistId");
        L15:
            if (r12.containsKey("preselectedWatchlistName") == false) goto L17;
            r2 = r12.getString("preselectedWatchlistName");
        L17:
            String r7 = r2;
            if (r12.containsKey("preselectedWatchlistIsDefault") == false) goto L20;
            boolean r8 = r12.getBoolean("preselectedWatchlistIsDefault");
        L22:
            if (r12.containsKey("preselectedWatchlistIsFavorite") == false) goto L24;
            boolean r9 = r12.getBoolean("preselectedWatchlistIsFavorite");
        L26:
            if (r12.containsKey("preselectedWatchlistIsPortfolio") == false) goto L29;
            r3 = r12.getBoolean("preselectedWatchlistIsPortfolio");
        L29:
            return new n0(r4, r5, r6, r7, r8, r9, r3);
        L24:
            r9 = false;
            goto L26
        L20:
            r8 = false;
            goto L22
        L13:
            r6 = null;
            goto L15
        L9:
            r5 = false;
            goto L11
        L5:
            r4 = null;
            goto L6
        }

        public a() {
        }
    }

    static {
        f169846h = new a(null);
    }

    public n0(String r1, boolean r2, String r3, String r4, boolean r5, boolean r6, boolean r7) {
        this.f169847a = r1;
        this.f169848b = r2;
        this.f169849c = r3;
        this.d = r4;
        this.f169850e = r5;
        this.f169851f = r6;
        this.f169852g = r7;
    }

    public static final n0 fromBundle(Bundle r1) {
        return f169846h.a(r1);
    }

    public final String a() {
        return this.f169847a;
    }

    public final String b() {
        return this.f169849c;
    }

    public final boolean c() {
        return this.f169850e;
    }

    public final boolean d() {
        return this.f169851f;
    }

    public final boolean e() {
        return this.f169852g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n0) == true) goto L8;
        return false;
    L8:
        n0 r52 = (n0) r5;
        if (kotlin.jvm.internal.p.g(this.f169847a, r52.f169847a) == true) goto L12;
        return false;
    L12:
        if (this.f169848b == r52.f169848b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f169849c, r52.f169849c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f169850e == r52.f169850e) goto L24;
        return false;
    L24:
        if (this.f169851f == r52.f169851f) goto L27;
        return false;
    L27:
        if (this.f169852g == r52.f169852g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final Bundle g() {
        Bundle r02 = new Bundle();
        r02.putString("errorToastMessage", this.f169847a);
        r02.putBoolean("showUnfreezeChangePasswordPin", this.f169848b);
        r02.putString("preselectedWatchlistId", this.f169849c);
        r02.putString("preselectedWatchlistName", this.d);
        r02.putBoolean("preselectedWatchlistIsDefault", this.f169850e);
        r02.putBoolean("preselectedWatchlistIsFavorite", this.f169851f);
        r02.putBoolean("preselectedWatchlistIsPortfolio", this.f169852g);
        return r02;
    }

    public int hashCode() {
        String r02 = this.f169847a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + Boolean.hashCode(this.f169848b)) * 31;
        String r2 = this.f169849c;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.d;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((((((r05 + r1) * 31) + Boolean.hashCode(this.f169850e)) * 31) + Boolean.hashCode(this.f169851f)) * 31) + Boolean.hashCode(this.f169852g);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "WatchlistFragmentArgs(errorToastMessage=" + this.f169847a + ", showUnfreezeChangePasswordPin=" + this.f169848b + ", preselectedWatchlistId=" + this.f169849c + ", preselectedWatchlistName=" + this.d + ", preselectedWatchlistIsDefault=" + this.f169850e + ", preselectedWatchlistIsFavorite=" + this.f169851f + ", preselectedWatchlistIsPortfolio=" + this.f169852g + ')';
    }

    public /* synthetic */ n0(String r3, boolean r4, String r5, String r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r10 & 64) == 0) goto L24;
        boolean r102 = false;
    L23:
        boolean r92 = r8;
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102);
        return;
    L24:
        r102 = r9;
        goto L23
    }
}
