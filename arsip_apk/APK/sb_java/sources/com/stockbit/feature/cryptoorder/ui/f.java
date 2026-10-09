package com.stockbit.feature.cryptoorder.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f94300e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f94301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94303c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r7) {
            kotlin.jvm.internal.p.l(r7, "bundle");
            r7.setClassLoader(f.class.getClassLoader());
            if (r7.containsKey("orderId") == false) goto L34;
            String r02 = r7.getString("orderId");
            if (r02 == null) goto L32;
            if (r7.containsKey("coinSymbol") == false) goto L30;
            String r1 = r7.getString("coinSymbol");
            if (r1 == null) goto L28;
            String r4 = "";
            if (r7.containsKey("coinName") == false) goto L17;
            String r2 = r7.getString("coinName");
            if (r2 != null) goto L19;
            throw new IllegalArgumentException("Argument \"coinName\" is marked as non-null but was passed a null value.");
        L19:
            if (r7.containsKey("coinLogo") == false) goto L26;
            r4 = r7.getString("coinLogo");
            if (r4 != null) goto L26;
            throw new IllegalArgumentException("Argument \"coinLogo\" is marked as non-null but was passed a null value.");
        L26:
            return new f(r02, r1, r2, r4);
        L17:
            r2 = "";
            goto L19
        L28:
            throw new IllegalArgumentException("Argument \"coinSymbol\" is marked as non-null but was passed a null value.");
        L30:
            throw new IllegalArgumentException("Required argument \"coinSymbol\" is missing and does not have an android:defaultValue");
        L32:
            throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
        L34:
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f94300e = new a(null);
    }

    public f(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "coinSymbol");
        kotlin.jvm.internal.p.l(r4, "coinName");
        kotlin.jvm.internal.p.l(r5, "coinLogo");
        this.f94301a = r2;
        this.f94302b = r3;
        this.f94303c = r4;
        this.d = r5;
    }

    public static final f fromBundle(Bundle r1) {
        return f94300e.a(r1);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f94303c;
    }

    public final String c() {
        return this.f94302b;
    }

    public final String d() {
        return this.f94301a;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putString("orderId", this.f94301a);
        r02.putString("coinSymbol", this.f94302b);
        r02.putString("coinName", this.f94303c);
        r02.putString("coinLogo", this.d);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f94301a, r52.f94301a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f94302b, r52.f94302b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f94303c, r52.f94303c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f94301a.hashCode() * 31) + this.f94302b.hashCode()) * 31) + this.f94303c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CryptoOrderDetailFragmentArgs(orderId=" + this.f94301a + ", coinSymbol=" + this.f94302b + ", coinName=" + this.f94303c + ", coinLogo=" + this.d + ')';
    }
}
