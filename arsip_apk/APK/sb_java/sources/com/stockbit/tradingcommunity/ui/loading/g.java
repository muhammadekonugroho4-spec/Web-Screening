package com.stockbit.tradingcommunity.ui.loading;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f149793c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f149794a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149795b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(g.class.getClassLoader());
            if (r4.containsKey("communityCode") == false) goto L5;
            String r02 = r4.getString("communityCode");
        L7:
            if (r4.containsKey("entryPoint") == false) goto L13;
            String r42 = r4.getString("entryPoint");
            if (r42 != null) goto L15;
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        L15:
            return new g(r02, r42);
        L13:
            r42 = "SETTINGS";
            goto L15
        L5:
            r02 = "";
            goto L7
        }

        public a() {
        }
    }

    static {
        f149793c = new a(null);
    }

    public g(String r2, String r3) {
        p.l(r3, "entryPoint");
        this.f149794a = r2;
        this.f149795b = r3;
    }

    public static final g fromBundle(Bundle r1) {
        return f149793c.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("communityCode", this.f149794a);
        r02.putString("entryPoint", this.f149795b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f149794a, r52.f149794a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f149795b, r52.f149795b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f149794a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f149795b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "LoadingTradingCommunityFragmentArgs(communityCode=" + this.f149794a + ", entryPoint=" + this.f149795b + ')';
    }

    public /* synthetic */ g(String r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "SETTINGS";
    L8:
        this(r1, r2);
    }
}
