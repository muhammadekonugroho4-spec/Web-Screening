package com.stockbit.watchlist.ui.more;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f171055g = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f171056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f171057b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f171058c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f171059e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f171060f;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r9) {
            p.l(r9, "bundle");
            r9.setClassLoader(c.class.getClassLoader());
            String r2 = "";
            if (r9.containsKey("watchlistId") == false) goto L9;
            String r02 = r9.getString("watchlistId");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"watchlistId\" is marked as non-null but was passed a null value.");
        L11:
            if (r9.containsKey("watchlistGroupName") == false) goto L14;
            r2 = r9.getString("watchlistGroupName");
            if (r2 != null) goto L14;
            throw new IllegalArgumentException("Argument \"watchlistGroupName\" is marked as non-null but was passed a null value.");
        L14:
            String r3 = r2;
            boolean r4 = false;
            if (r9.containsKey("watchlistGroupIsDefault") == false) goto L20;
            boolean r1 = r9.getBoolean("watchlistGroupIsDefault");
        L22:
            if (r9.containsKey("isWatchlistPortfolio") == false) goto L24;
            boolean r5 = r9.getBoolean("isWatchlistPortfolio");
        L26:
            if (r9.containsKey("isShowArrangeFavorite") == false) goto L28;
            boolean r6 = r9.getBoolean("isShowArrangeFavorite");
        L30:
            if (r9.containsKey("isCompleteView") == false) goto L33;
            r4 = r9.getBoolean("isCompleteView");
        L33:
            return new c(r02, r3, r1, r5, r6, r4);
        L28:
            r6 = false;
            goto L30
        L24:
            r5 = false;
            goto L26
        L20:
            r1 = false;
            goto L22
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f171055g = new a(null);
    }

    public c(String r2, String r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        p.l(r2, "watchlistId");
        p.l(r3, "watchlistGroupName");
        this.f171056a = r2;
        this.f171057b = r3;
        this.f171058c = r4;
        this.d = r5;
        this.f171059e = r6;
        this.f171060f = r7;
    }

    public static final c fromBundle(Bundle r1) {
        return f171055g.a(r1);
    }

    public final boolean a() {
        return this.f171058c;
    }

    public final String b() {
        return this.f171057b;
    }

    public final String c() {
        return this.f171056a;
    }

    public final boolean d() {
        return this.f171060f;
    }

    public final boolean e() {
        return this.f171059e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f171056a, r52.f171056a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f171057b, r52.f171057b) == true) goto L15;
        return false;
    L15:
        if (this.f171058c == r52.f171058c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f171059e == r52.f171059e) goto L24;
        return false;
    L24:
        if (this.f171060f == r52.f171060f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.f171056a.hashCode() * 31) + this.f171057b.hashCode()) * 31) + Boolean.hashCode(this.f171058c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f171059e)) * 31) + Boolean.hashCode(this.f171060f);
    }

    public String toString() {
        return "WatchlistMoreDialogArgs(watchlistId=" + this.f171056a + ", watchlistGroupName=" + this.f171057b + ", watchlistGroupIsDefault=" + this.f171058c + ", isWatchlistPortfolio=" + this.d + ", isShowArrangeFavorite=" + this.f171059e + ", isCompleteView=" + this.f171060f + ')';
    }
}
