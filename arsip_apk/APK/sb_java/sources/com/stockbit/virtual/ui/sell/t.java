package com.stockbit.virtual.ui.sell;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes2.dex */
public final class t implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f167245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f167246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f167247c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final t a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(t.class.getClassLoader());
            if (r5.containsKey("EXTRA_SYMBOL") == false) goto L15;
            String r02 = r5.getString("EXTRA_SYMBOL");
            if (r5.containsKey("EXTRA_PRICE") == false) goto L13;
            String r1 = r5.getString("EXTRA_PRICE");
            if (r5.containsKey("EXTRA_SELL_PATH") == false) goto L11;
            return new t(r02, r1, r5.getString("EXTRA_SELL_PATH"));
        L11:
            throw new IllegalArgumentException("Required argument \"EXTRA_SELL_PATH\" is missing and does not have an android:defaultValue");
        L13:
            throw new IllegalArgumentException("Required argument \"EXTRA_PRICE\" is missing and does not have an android:defaultValue");
        L15:
            throw new IllegalArgumentException("Required argument \"EXTRA_SYMBOL\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public t(String r1, String r2, String r3) {
        this.f167245a = r1;
        this.f167246b = r2;
        this.f167247c = r3;
    }

    public static final t fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f167246b;
    }

    public final String b() {
        return this.f167247c;
    }

    public final String c() {
        return this.f167245a;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("EXTRA_SYMBOL", this.f167245a);
        r02.putString("EXTRA_PRICE", this.f167246b);
        r02.putString("EXTRA_SELL_PATH", this.f167247c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f167245a, r52.f167245a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f167246b, r52.f167246b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f167247c, r52.f167247c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f167245a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f167246b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f167247c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VirtualSellFragmentArgs(EXTRASYMBOL=" + this.f167245a + ", EXTRAPRICE=" + this.f167246b + ", EXTRASELLPATH=" + this.f167247c + ')';
    }
}
