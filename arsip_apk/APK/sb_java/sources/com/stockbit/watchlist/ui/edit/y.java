package com.stockbit.watchlist.ui.edit;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class y implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f168940e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f168941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f168942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f168943c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final y a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(y.class.getClassLoader());
            if (r6.containsKey("watchlistId") == false) goto L27;
            String r02 = r6.getString("watchlistId");
            if (r02 == null) goto L25;
            if (r6.containsKey("watchlistGroupName") == false) goto L23;
            String r1 = r6.getString("watchlistGroupName");
            if (r1 == null) goto L21;
            if (r6.containsKey("watchlistGroupIsDefault") == false) goto L19;
            boolean r2 = r6.getBoolean("watchlistGroupIsDefault");
            if (r6.containsKey("watchlistGroupIsPortfolio") == false) goto L17;
            return new y(r02, r1, r2, r6.getBoolean("watchlistGroupIsPortfolio"));
        L17:
            throw new IllegalArgumentException("Required argument \"watchlistGroupIsPortfolio\" is missing and does not have an android:defaultValue");
        L19:
            throw new IllegalArgumentException("Required argument \"watchlistGroupIsDefault\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"watchlistGroupName\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"watchlistGroupName\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"watchlistId\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"watchlistId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f168940e = new a(null);
    }

    public y(String r2, String r3, boolean r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "watchlistId");
        kotlin.jvm.internal.p.l(r3, "watchlistGroupName");
        this.f168941a = r2;
        this.f168942b = r3;
        this.f168943c = r4;
        this.d = r5;
    }

    public static final y fromBundle(Bundle r1) {
        return f168940e.a(r1);
    }

    public final boolean a() {
        return this.f168943c;
    }

    public final boolean b() {
        return this.d;
    }

    public final String c() {
        return this.f168942b;
    }

    public final String d() {
        return this.f168941a;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putString("watchlistId", this.f168941a);
        r02.putString("watchlistGroupName", this.f168942b);
        r02.putBoolean("watchlistGroupIsDefault", this.f168943c);
        r02.putBoolean("watchlistGroupIsPortfolio", this.d);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof y) == true) goto L8;
        return false;
    L8:
        y r52 = (y) r5;
        if (kotlin.jvm.internal.p.g(this.f168941a, r52.f168941a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f168942b, r52.f168942b) == true) goto L15;
        return false;
    L15:
        if (this.f168943c == r52.f168943c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f168941a.hashCode() * 31) + this.f168942b.hashCode()) * 31) + Boolean.hashCode(this.f168943c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "WatchlistEditFragmentArgs(watchlistId=" + this.f168941a + ", watchlistGroupName=" + this.f168942b + ", watchlistGroupIsDefault=" + this.f168943c + ", watchlistGroupIsPortfolio=" + this.d + ')';
    }
}
