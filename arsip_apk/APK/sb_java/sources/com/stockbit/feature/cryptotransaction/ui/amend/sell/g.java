package com.stockbit.feature.cryptotransaction.ui.amend.sell;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f95311c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f95312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95313b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(g.class.getClassLoader());
            if (r4.containsKey("orderId") == false) goto L19;
            String r02 = r4.getString("orderId");
            if (r02 == null) goto L17;
            if (r4.containsKey("coinSymbol") == false) goto L15;
            String r42 = r4.getString("coinSymbol");
            if (r42 == null) goto L13;
            return new g(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"coinSymbol\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"coinSymbol\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f95311c = new a(null);
    }

    public g(String r2, String r3) {
        p.l(r2, "orderId");
        p.l(r3, "coinSymbol");
        this.f95312a = r2;
        this.f95313b = r3;
    }

    public static final g fromBundle(Bundle r1) {
        return f95311c.a(r1);
    }

    public final String a() {
        return this.f95313b;
    }

    public final String b() {
        return this.f95312a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f95312a, r52.f95312a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f95313b, r52.f95313b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f95312a.hashCode() * 31) + this.f95313b.hashCode();
    }

    public String toString() {
        return "CryptoAmendSellFragmentArgs(orderId=" + this.f95312a + ", coinSymbol=" + this.f95313b + ')';
    }
}
