package com.stockbit.feature.bonds.ui.sell;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes8.dex */
public final class s implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f93537f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f93538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93539b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93540c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f93541e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final s a(Bundle r9) {
            kotlin.jvm.internal.p.l(r9, "bundle");
            r9.setClassLoader(s.class.getClassLoader());
            if (r9.containsKey("productId") == false) goto L39;
            String r3 = r9.getString("productId");
            if (r3 == null) goto L37;
            if (r9.containsKey("productName") == false) goto L35;
            String r4 = r9.getString("productName");
            if (r4 == null) goto L33;
            if (r9.containsKey("acquisitionOrderId") == false) goto L31;
            String r5 = r9.getString("acquisitionOrderId");
            if (r5 == null) goto L29;
            if (r9.containsKey("sourcePage") == false) goto L27;
            String r6 = r9.getString("sourcePage");
            if (r6 == null) goto L25;
            if (r9.containsKey("yield") == false) goto L23;
            return new s(r3, r4, r5, r6, r9.getString("yield"));
        L23:
            throw new IllegalArgumentException("Required argument \"yield\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"sourcePage\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"sourcePage\" is missing and does not have an android:defaultValue");
        L29:
            throw new IllegalArgumentException("Argument \"acquisitionOrderId\" is marked as non-null but was passed a null value.");
        L31:
            throw new IllegalArgumentException("Required argument \"acquisitionOrderId\" is missing and does not have an android:defaultValue");
        L33:
            throw new IllegalArgumentException("Argument \"productName\" is marked as non-null but was passed a null value.");
        L35:
            throw new IllegalArgumentException("Required argument \"productName\" is missing and does not have an android:defaultValue");
        L37:
            throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
        L39:
            throw new IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f93537f = new a(null);
    }

    public s(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "productId");
        kotlin.jvm.internal.p.l(r3, "productName");
        kotlin.jvm.internal.p.l(r4, "acquisitionOrderId");
        kotlin.jvm.internal.p.l(r5, "sourcePage");
        this.f93538a = r2;
        this.f93539b = r3;
        this.f93540c = r4;
        this.d = r5;
        this.f93541e = r6;
    }

    public static final s fromBundle(Bundle r1) {
        return f93537f.a(r1);
    }

    public final String a() {
        return this.f93540c;
    }

    public final String b() {
        return this.f93538a;
    }

    public final String c() {
        return this.f93539b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f93541e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f93538a, r52.f93538a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f93539b, r52.f93539b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f93540c, r52.f93540c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f93541e, r52.f93541e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final Bundle f() {
        Bundle r02 = new Bundle();
        r02.putString("productId", this.f93538a);
        r02.putString("productName", this.f93539b);
        r02.putString("acquisitionOrderId", this.f93540c);
        r02.putString("sourcePage", this.d);
        r02.putString("yield", this.f93541e);
        return r02;
    }

    public int hashCode() {
        int r02 = ((((((this.f93538a.hashCode() * 31) + this.f93539b.hashCode()) * 31) + this.f93540c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String r1 = this.f93541e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "BondsSellComposeFragmentArgs(productId=" + this.f93538a + ", productName=" + this.f93539b + ", acquisitionOrderId=" + this.f93540c + ", sourcePage=" + this.d + ", yield=" + this.f93541e + ')';
    }
}
