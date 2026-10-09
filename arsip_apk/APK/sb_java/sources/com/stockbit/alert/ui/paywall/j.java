package com.stockbit.alert.ui.paywall;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class j implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f45796f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f45797a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45798b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45799c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45800e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(Bundle r10) {
            p.l(r10, "bundle");
            r10.setClassLoader(j.class.getClassLoader());
            String r2 = null;
            if (r10.containsKey("subscriptionDesc") == false) goto L5;
            String r5 = r10.getString("subscriptionDesc");
        L7:
            if (r10.containsKey("subscriptionValue") == false) goto L9;
            String r6 = r10.getString("subscriptionValue");
        L11:
            if (r10.containsKey("product_id") == false) goto L23;
            int r4 = r10.getInt("product_id");
            if (r10.containsKey("company_id") == false) goto L15;
            r2 = r10.getString("company_id");
        L15:
            String r7 = r2;
            if (r10.containsKey("is_new_user") == false) goto L19;
            boolean r102 = r10.getBoolean("is_new_user");
        L21:
            return new j(r4, r5, r6, r7, r102);
        L19:
            r102 = false;
            goto L21
        L23:
            throw new IllegalArgumentException("Required argument \"product_id\" is missing and does not have an android:defaultValue");
        L9:
            r6 = null;
            goto L11
        L5:
            r5 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f45796f = new a(null);
    }

    public j(int r1, String r2, String r3, String r4, boolean r5) {
        this.f45797a = r1;
        this.f45798b = r2;
        this.f45799c = r3;
        this.d = r4;
        this.f45800e = r5;
    }

    public static final j fromBundle(Bundle r1) {
        return f45796f.a(r1);
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.f45797a;
    }

    public final String c() {
        return this.f45798b;
    }

    public final String d() {
        return this.f45799c;
    }

    public final boolean e() {
        return this.f45800e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f45797a == r52.f45797a) goto L12;
        return false;
    L12:
        if (p.g(this.f45798b, r52.f45798b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f45799c, r52.f45799c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f45800e == r52.f45800e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f45797a) * 31;
        String r1 = this.f45798b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f45799c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((r04 + r2) * 31) + Boolean.hashCode(this.f45800e);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "PaywallPriceAlertDialogFragmentArgs(productId=" + this.f45797a + ", subscriptionDesc=" + this.f45798b + ", subscriptionValue=" + this.f45799c + ", companyId=" + this.d + ", isNewUser=" + this.f45800e + ')';
    }
}
