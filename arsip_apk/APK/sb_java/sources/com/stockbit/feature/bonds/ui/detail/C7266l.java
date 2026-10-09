package com.stockbit.feature.bonds.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.feature.bonds.ui.detail.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7266l implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f92902c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f92903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92904b;

    /* renamed from: com.stockbit.feature.bonds.ui.detail.l$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C7266l a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(C7266l.class.getClassLoader());
            if (r4.containsKey("productId") == false) goto L15;
            String r02 = r4.getString("productId");
            if (r02 == null) goto L13;
            if (r4.containsKey("shouldBuy") == false) goto L9;
            boolean r42 = r4.getBoolean("shouldBuy");
        L11:
            return new C7266l(r02, r42);
        L9:
            r42 = false;
            goto L11
        L13:
            throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f92902c = new a(null);
    }

    public C7266l(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "productId");
        this.f92903a = r2;
        this.f92904b = r3;
    }

    public static final C7266l fromBundle(Bundle r1) {
        return f92902c.a(r1);
    }

    public final String a() {
        return this.f92903a;
    }

    public final boolean b() {
        return this.f92904b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("productId", this.f92903a);
        r02.putBoolean("shouldBuy", this.f92904b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C7266l) == true) goto L8;
        return false;
    L8:
        C7266l r52 = (C7266l) r5;
        if (kotlin.jvm.internal.p.g(this.f92903a, r52.f92903a) == true) goto L12;
        return false;
    L12:
        if (this.f92904b == r52.f92904b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f92903a.hashCode() * 31) + Boolean.hashCode(this.f92904b);
    }

    public String toString() {
        return "BondDetailComposeFragmentArgs(productId=" + this.f92903a + ", shouldBuy=" + this.f92904b + ')';
    }

    public /* synthetic */ C7266l(String r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        this(r1, r2);
    }
}
