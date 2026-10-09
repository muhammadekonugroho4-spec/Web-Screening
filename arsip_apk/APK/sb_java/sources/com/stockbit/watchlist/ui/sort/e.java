package com.stockbit.watchlist.ui.sort;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f171115c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f171116a;

    /* renamed from: b, reason: collision with root package name */
    public final String f171117b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final e a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(e.class.getClassLoader());
            String r2 = null;
            if (r5.containsKey("watchlistSortBy") == false) goto L5;
            String r02 = r5.getString("watchlistSortBy");
        L7:
            if (r5.containsKey("watchlistSortDirection") == false) goto L10;
            r2 = r5.getString("watchlistSortDirection");
        L10:
            return new e(r02, r2);
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f171115c = new a(null);
    }

    public e(String r1, String r2) {
        this.f171116a = r1;
        this.f171117b = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f171115c.a(r1);
    }

    public final String a() {
        return this.f171116a;
    }

    public final String b() {
        return this.f171117b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f171116a, r52.f171116a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f171117b, r52.f171117b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f171116a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f171117b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "WatchlistSortDialogArgs(watchlistSortBy=" + this.f171116a + ", watchlistSortDirection=" + this.f171117b + ')';
    }
}
