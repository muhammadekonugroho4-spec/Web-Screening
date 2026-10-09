package com.stockbit.virtual.ui.buy;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class r implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f166831c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f166832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f166833b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final r a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(r.class.getClassLoader());
            if (r4.containsKey("EXTRA_SYMBOL") == false) goto L11;
            String r02 = r4.getString("EXTRA_SYMBOL");
            if (r4.containsKey("EXTRA_BUY_PATH") == false) goto L9;
            return new r(r02, r4.getString("EXTRA_BUY_PATH"));
        L9:
            throw new IllegalArgumentException("Required argument \"EXTRA_BUY_PATH\" is missing and does not have an android:defaultValue");
        L11:
            throw new IllegalArgumentException("Required argument \"EXTRA_SYMBOL\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f166831c = new a(null);
    }

    public r(String r1, String r2) {
        this.f166832a = r1;
        this.f166833b = r2;
    }

    public static final r fromBundle(Bundle r1) {
        return f166831c.a(r1);
    }

    public final String a() {
        return this.f166833b;
    }

    public final String b() {
        return this.f166832a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("EXTRA_SYMBOL", this.f166832a);
        r02.putString("EXTRA_BUY_PATH", this.f166833b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f166832a, r52.f166832a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f166833b, r52.f166833b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f166832a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f166833b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VirtualBuyFragmentArgs(EXTRASYMBOL=" + this.f166832a + ", EXTRABUYPATH=" + this.f166833b + ')';
    }
}
