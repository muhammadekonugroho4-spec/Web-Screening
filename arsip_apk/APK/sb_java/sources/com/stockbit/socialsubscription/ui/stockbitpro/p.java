package com.stockbit.socialsubscription.ui.stockbitpro;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class p implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f137944e = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f137945a;

    /* renamed from: b, reason: collision with root package name */
    public final String f137946b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f137947c;
    public final boolean d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final p a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(p.class.getClassLoader());
            boolean r2 = false;
            if (r6.containsKey("is_new_user") == false) goto L5;
            boolean r02 = r6.getBoolean("is_new_user");
        L7:
            if (r6.containsKey("product_enum") == false) goto L13;
            String r1 = r6.getString("product_enum");
            if (r1 != null) goto L15;
            throw new IllegalArgumentException("Argument \"product_enum\" is marked as non-null but was passed a null value.");
        L15:
            if (r6.containsKey("is_from_stockbit_pro_profile") == false) goto L18;
            r2 = r6.getBoolean("is_from_stockbit_pro_profile");
        L18:
            if (r6.containsKey("is_google_payment_available") == false) goto L20;
            boolean r62 = r6.getBoolean("is_google_payment_available");
        L22:
            return new p(r02, r1, r2, r62);
        L20:
            r62 = true;
            goto L22
        L13:
            r1 = "";
            goto L15
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f137944e = new a(null);
    }

    public p(boolean r2, String r3, boolean r4, boolean r5) {
        kotlin.jvm.internal.p.l(r3, "productEnum");
        this.f137945a = r2;
        this.f137946b = r3;
        this.f137947c = r4;
        this.d = r5;
    }

    public static final p fromBundle(Bundle r1) {
        return f137944e.a(r1);
    }

    public final String a() {
        return this.f137946b;
    }

    public final boolean b() {
        return this.f137947c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f137945a;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putBoolean("is_new_user", this.f137945a);
        r02.putString("product_enum", this.f137946b);
        r02.putBoolean("is_from_stockbit_pro_profile", this.f137947c);
        r02.putBoolean("is_google_payment_available", this.d);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (this.f137945a == r52.f137945a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f137946b, r52.f137946b) == true) goto L15;
        return false;
    L15:
        if (this.f137947c == r52.f137947c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f137945a) * 31) + this.f137946b.hashCode()) * 31) + Boolean.hashCode(this.f137947c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "StockbitProShopFragmentArgs(isNewUser=" + this.f137945a + ", productEnum=" + this.f137946b + ", isFromStockbitProProfile=" + this.f137947c + ", isGooglePaymentAvailable=" + this.d + ')';
    }

    public /* synthetic */ p(boolean r2, String r3, boolean r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = true;
    L14:
        this(r2, r3, r4, r5);
    }
}
