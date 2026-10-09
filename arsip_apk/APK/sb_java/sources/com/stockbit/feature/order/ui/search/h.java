package com.stockbit.feature.order.ui.search;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f103356c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f103357a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f103358b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(h.class.getClassLoader());
            if (r4.containsKey("skipShariaCheck") == false) goto L5;
            boolean r02 = r4.getBoolean("skipShariaCheck");
        L7:
            if (r4.containsKey("isBuyOrder") == false) goto L9;
            boolean r42 = r4.getBoolean("isBuyOrder");
        L11:
            return new h(r02, r42);
        L9:
            r42 = true;
            goto L11
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f103356c = new a(null);
    }

    public h(boolean r1, boolean r2) {
        this.f103357a = r1;
        this.f103358b = r2;
    }

    public static final h fromBundle(Bundle r1) {
        return f103356c.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putBoolean("skipShariaCheck", this.f103357a);
        r02.putBoolean("isBuyOrder", this.f103358b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f103357a == r52.f103357a) goto L12;
        return false;
    L12:
        if (this.f103358b == r52.f103358b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f103357a) * 31) + Boolean.hashCode(this.f103358b);
    }

    public String toString() {
        return "OrderSearchCompanyComposeFragmentArgs(skipShariaCheck=" + this.f103357a + ", isBuyOrder=" + this.f103358b + ')';
    }
}
