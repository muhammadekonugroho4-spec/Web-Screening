package com.stockbit.feature.insider.ui.company;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f98634c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98636b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(g.class.getClassLoader());
            if (r4.containsKey("EXTRA_SYMBOL") == false) goto L9;
            String r02 = r4.getString("EXTRA_SYMBOL");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"EXTRA_SYMBOL\" is marked as non-null but was passed a null value.");
        L11:
            if (r4.containsKey("EXTRA_PAYWALL_ELIGIBILITY") == false) goto L15;
            return new g(r4.getBoolean("EXTRA_PAYWALL_ELIGIBILITY"), r02);
        L15:
            throw new IllegalArgumentException("Required argument \"EXTRA_PAYWALL_ELIGIBILITY\" is missing and does not have an android:defaultValue");
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f98634c = new a(null);
    }

    public g(boolean r2, String r3) {
        kotlin.jvm.internal.p.l(r3, "EXTRASYMBOL");
        this.f98635a = r2;
        this.f98636b = r3;
    }

    public static final g fromBundle(Bundle r1) {
        return f98634c.a(r1);
    }

    public final boolean a() {
        return this.f98635a;
    }

    public final String b() {
        return this.f98636b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f98635a == r52.f98635a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f98636b, r52.f98636b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f98635a) * 31) + this.f98636b.hashCode();
    }

    public String toString() {
        return "InsiderCompanyFragmentArgs(EXTRAPAYWALLELIGIBILITY=" + this.f98635a + ", EXTRASYMBOL=" + this.f98636b + ')';
    }
}
