package com.stockbit.runningtrade.ui.chartfilter;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f131373b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f131374a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(d.class.getClassLoader());
            if (r3.containsKey("initialSearch") == false) goto L11;
            String r32 = r3.getString("initialSearch");
            if (r32 == null) goto L9;
            return new d(r32);
        L9:
            throw new IllegalArgumentException("Argument \"initialSearch\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"initialSearch\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f131373b = new a(null);
    }

    public d(String r2) {
        kotlin.jvm.internal.p.l(r2, "initialSearch");
        this.f131374a = r2;
    }

    public static final d fromBundle(Bundle r1) {
        return f131373b.a(r1);
    }

    public final String a() {
        return this.f131374a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("initialSearch", this.f131374a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f131374a, ((d) r4).f131374a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f131374a.hashCode();
    }

    public String toString() {
        return "ChartStockFilterFragmentArgs(initialSearch=" + this.f131374a + ')';
    }
}
