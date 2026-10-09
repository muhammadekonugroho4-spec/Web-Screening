package com.stockbit.feature.order.ui.detailnego;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class l implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f101643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f101644b;

    /* renamed from: c, reason: collision with root package name */
    public final String f101645c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(l.class.getClassLoader());
            if (r5.containsKey("negoId") == false) goto L27;
            String r02 = r5.getString("negoId");
            if (r02 == null) goto L25;
            if (r5.containsKey("orderType") == false) goto L23;
            String r1 = r5.getString("orderType");
            if (r1 == null) goto L21;
            if (r5.containsKey("companySymbol") == false) goto L19;
            String r52 = r5.getString("companySymbol");
            if (r52 == null) goto L17;
            return new l(r02, r1, r52);
        L17:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"orderType\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"orderType\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"negoId\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"negoId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public l(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "negoId");
        kotlin.jvm.internal.p.l(r3, "orderType");
        kotlin.jvm.internal.p.l(r4, "companySymbol");
        this.f101643a = r2;
        this.f101644b = r3;
        this.f101645c = r4;
    }

    public static final l fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f101645c;
    }

    public final String b() {
        return this.f101643a;
    }

    public final String c() {
        return this.f101644b;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("negoId", this.f101643a);
        r02.putString("orderType", this.f101644b);
        r02.putString("companySymbol", this.f101645c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f101643a, r52.f101643a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f101644b, r52.f101644b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f101645c, r52.f101645c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f101643a.hashCode() * 31) + this.f101644b.hashCode()) * 31) + this.f101645c.hashCode();
    }

    public String toString() {
        return "OrderNegoDetailFragmentArgs(negoId=" + this.f101643a + ", orderType=" + this.f101644b + ", companySymbol=" + this.f101645c + ')';
    }
}
