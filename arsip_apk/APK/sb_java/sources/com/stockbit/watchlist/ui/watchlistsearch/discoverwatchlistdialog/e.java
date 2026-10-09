package com.stockbit.watchlist.ui.watchlistsearch.discoverwatchlistdialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f171287b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f171288a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final e a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("watchlistId") == false) goto L11;
            String r32 = r3.getString("watchlistId");
            if (r32 == null) goto L9;
            return new e(r32);
        L9:
            throw new IllegalArgumentException("Argument \"watchlistId\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"watchlistId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f171287b = new a(null);
    }

    public e(String r2) {
        p.l(r2, "watchlistId");
        this.f171288a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f171287b.a(r1);
    }

    public final String a() {
        return this.f171288a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f171288a, ((e) r4).f171288a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f171288a.hashCode();
    }

    public String toString() {
        return "DiscoverWatchlistItemDialogArgs(watchlistId=" + this.f171288a + ')';
    }
}
