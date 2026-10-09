package com.stockbit.feature.bonds.ui.portfolio;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes8.dex */
public final class s implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f93331c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f93332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93333b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final s a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(s.class.getClassLoader());
            if (r4.containsKey("symbol") == false) goto L15;
            String r02 = r4.getString("symbol");
            if (r02 == null) goto L13;
            if (r4.containsKey("yield") == false) goto L11;
            return new s(r02, r4.getString("yield"));
        L11:
            throw new IllegalArgumentException("Required argument \"yield\" is missing and does not have an android:defaultValue");
        L13:
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"symbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f93331c = new a(null);
    }

    public s(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        this.f93332a = r2;
        this.f93333b = r3;
    }

    public static final s fromBundle(Bundle r1) {
        return f93331c.a(r1);
    }

    public final String a() {
        return this.f93332a;
    }

    public final String b() {
        return this.f93333b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("symbol", this.f93332a);
        r02.putString("yield", this.f93333b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f93332a, r52.f93332a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f93333b, r52.f93333b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f93332a.hashCode() * 31;
        String r1 = this.f93333b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "BondsPortfolioDetailComposeFragmentArgs(symbol=" + this.f93332a + ", yield=" + this.f93333b + ')';
    }
}
