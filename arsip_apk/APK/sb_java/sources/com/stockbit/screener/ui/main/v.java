package com.stockbit.screener.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class v implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f132657e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f132658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132660c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final v a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(v.class.getClassLoader());
            String r2 = null;
            if (r6.containsKey("subscriptionDesc") == false) goto L5;
            String r02 = r6.getString("subscriptionDesc");
        L7:
            if (r6.containsKey("subscriptionValue") == false) goto L10;
            r2 = r6.getString("subscriptionValue");
        L10:
            if (r6.containsKey("product_id") == false) goto L18;
            int r1 = r6.getInt("product_id");
            if (r6.containsKey("is_new_user") == false) goto L14;
            boolean r62 = r6.getBoolean("is_new_user");
        L16:
            return new v(r1, r02, r2, r62);
        L14:
            r62 = false;
            goto L16
        L18:
            throw new IllegalArgumentException("Required argument \"product_id\" is missing and does not have an android:defaultValue");
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f132657e = new a(null);
    }

    public v(int r1, String r2, String r3, boolean r4) {
        this.f132658a = r1;
        this.f132659b = r2;
        this.f132660c = r3;
        this.d = r4;
    }

    public static final v fromBundle(Bundle r1) {
        return f132657e.a(r1);
    }

    public final int a() {
        return this.f132658a;
    }

    public final String b() {
        return this.f132659b;
    }

    public final String c() {
        return this.f132660c;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (this.f132658a == r52.f132658a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f132659b, r52.f132659b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f132660c, r52.f132660c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f132658a) * 31;
        String r1 = this.f132659b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f132660c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Boolean.hashCode(this.d);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ScreenerPaywallDialogFragmentArgs(productId=" + this.f132658a + ", subscriptionDesc=" + this.f132659b + ", subscriptionValue=" + this.f132660c + ", isNewUser=" + this.d + ')';
    }
}
