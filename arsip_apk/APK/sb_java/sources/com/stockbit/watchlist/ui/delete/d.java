package com.stockbit.watchlist.ui.delete;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f168814c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f168815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f168816b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final d a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(d.class.getClassLoader());
            if (r4.containsKey("watchlistId") == false) goto L5;
            String r02 = r4.getString("watchlistId");
        L7:
            if (r4.containsKey("watchlistGroupName") == false) goto L13;
            String r42 = r4.getString("watchlistGroupName");
            if (r42 != null) goto L15;
            throw new IllegalArgumentException("Argument \"watchlistGroupName\" is marked as non-null but was passed a null value.");
        L15:
            return new d(r02, r42);
        L13:
            r42 = "";
            goto L15
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f168814c = new a(null);
    }

    public d(String r2, String r3) {
        p.l(r3, "watchlistGroupName");
        this.f168815a = r2;
        this.f168816b = r3;
    }

    public static final d fromBundle(Bundle r1) {
        return f168814c.a(r1);
    }

    public final String a() {
        return this.f168816b;
    }

    public final String b() {
        return this.f168815a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f168815a, r52.f168815a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f168816b, r52.f168816b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f168815a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f168816b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "WatchlistDeleteDialogArgs(watchlistId=" + this.f168815a + ", watchlistGroupName=" + this.f168816b + ')';
    }
}
