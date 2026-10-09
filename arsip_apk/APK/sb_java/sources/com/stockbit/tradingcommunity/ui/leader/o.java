package com.stockbit.tradingcommunity.ui.leader;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class o implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f149747b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f149748a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final o a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(o.class.getClassLoader());
            if (r3.containsKey("username") == false) goto L5;
            String r32 = r3.getString("username");
        L7:
            return new o(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f149747b = new a(null);
    }

    public o(String r1) {
        this.f149748a = r1;
    }

    public static final o fromBundle(Bundle r1) {
        return f149747b.a(r1);
    }

    public final String a() {
        return this.f149748a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("username", this.f149748a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f149748a, ((o) r4).f149748a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f149748a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "TradingCommunityLeaderDashboardFragmentArgs(username=" + this.f149748a + ')';
    }
}
