package com.stockbit.feature.bonds.ui.buy;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* renamed from: com.stockbit.feature.bonds.ui.buy.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7244y implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f92659a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92660b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92661c;

    /* renamed from: com.stockbit.feature.bonds.ui.buy.y$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C7244y a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(C7244y.class.getClassLoader());
            if (r5.containsKey("productId") == false) goto L23;
            String r02 = r5.getString("productId");
            if (r02 == null) goto L21;
            if (r5.containsKey("sourcePage") == false) goto L19;
            String r1 = r5.getString("sourcePage");
            if (r1 == null) goto L17;
            if (r5.containsKey("yield") == false) goto L15;
            return new C7244y(r02, r1, r5.getString("yield"));
        L15:
            throw new IllegalArgumentException("Required argument \"yield\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"sourcePage\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"sourcePage\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public C7244y(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "productId");
        kotlin.jvm.internal.p.l(r3, "sourcePage");
        this.f92659a = r2;
        this.f92660b = r3;
        this.f92661c = r4;
    }

    public static final C7244y fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f92659a;
    }

    public final String b() {
        return this.f92660b;
    }

    public final String c() {
        return this.f92661c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("productId", this.f92659a);
        r02.putString("sourcePage", this.f92660b);
        r02.putString("yield", this.f92661c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C7244y) == true) goto L8;
        return false;
    L8:
        C7244y r52 = (C7244y) r5;
        if (kotlin.jvm.internal.p.g(this.f92659a, r52.f92659a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f92660b, r52.f92660b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f92661c, r52.f92661c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f92659a.hashCode() * 31) + this.f92660b.hashCode()) * 31;
        String r1 = this.f92661c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "BondBuyComposeFragmentArgs(productId=" + this.f92659a + ", sourcePage=" + this.f92660b + ", yield=" + this.f92661c + ')';
    }
}
