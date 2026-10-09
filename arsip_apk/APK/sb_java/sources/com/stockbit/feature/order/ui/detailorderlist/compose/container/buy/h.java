package com.stockbit.feature.order.ui.detailorderlist.compose.container.buy;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f102260h = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f102261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102262b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102263c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102264e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f102265f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f102266g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r11) {
            kotlin.jvm.internal.p.l(r11, "bundle");
            r11.setClassLoader(h.class.getClassLoader());
            if (r11.containsKey("orderId") == false) goto L50;
            String r3 = r11.getString("orderId");
            if (r3 == null) goto L48;
            if (r11.containsKey("companySymbol") == false) goto L46;
            String r4 = r11.getString("companySymbol");
            if (r4 == null) goto L44;
            if (r11.containsKey("companyName") == false) goto L42;
            String r5 = r11.getString("companyName");
            if (r5 == null) goto L40;
            if (r11.containsKey("companyIconUrl") == false) goto L38;
            String r6 = r11.getString("companyIconUrl");
            if (r6 == null) goto L36;
            if (r11.containsKey("bracketParentStatus") == false) goto L25;
            String r02 = r11.getString("bracketParentStatus");
            if (r02 == null) goto L24;
        L22:
            String r7 = r02;
            boolean r2 = false;
            if (r11.containsKey("isFromPendingOrderList") == false) goto L29;
            boolean r8 = r11.getBoolean("isFromPendingOrderList");
        L31:
            if (r11.containsKey("isFromBuySell") == false) goto L34;
            r2 = r11.getBoolean("isFromBuySell");
        L34:
            return new h(r3, r4, r5, r6, r7, r8, r2);
        L29:
            r8 = false;
            goto L31
        L24:
            throw new IllegalArgumentException("Argument \"bracketParentStatus\" is marked as non-null but was passed a null value.");
        L25:
            r02 = "";
            goto L22
        L36:
            throw new IllegalArgumentException("Argument \"companyIconUrl\" is marked as non-null but was passed a null value.");
        L38:
            throw new IllegalArgumentException("Required argument \"companyIconUrl\" is missing and does not have an android:defaultValue");
        L40:
            throw new IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.");
        L42:
            throw new IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue");
        L44:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L46:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        L48:
            throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
        L50:
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f102260h = new a(null);
    }

    public h(String r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "companySymbol");
        kotlin.jvm.internal.p.l(r4, "companyName");
        kotlin.jvm.internal.p.l(r5, "companyIconUrl");
        kotlin.jvm.internal.p.l(r6, "bracketParentStatus");
        this.f102261a = r2;
        this.f102262b = r3;
        this.f102263c = r4;
        this.d = r5;
        this.f102264e = r6;
        this.f102265f = r7;
        this.f102266g = r8;
    }

    public static final h fromBundle(Bundle r1) {
        return f102260h.a(r1);
    }

    public final String a() {
        return this.f102264e;
    }

    public final String b() {
        return this.f102263c;
    }

    public final String c() {
        return this.f102262b;
    }

    public final String d() {
        return this.f102261a;
    }

    public final boolean e() {
        return this.f102266g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f102261a, r52.f102261a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f102262b, r52.f102262b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f102263c, r52.f102263c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f102264e, r52.f102264e) == true) goto L24;
        return false;
    L24:
        if (this.f102265f == r52.f102265f) goto L27;
        return false;
    L27:
        if (this.f102266g == r52.f102266g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f102265f;
    }

    public final Bundle g() {
        Bundle r02 = new Bundle();
        r02.putString("orderId", this.f102261a);
        r02.putString("companySymbol", this.f102262b);
        r02.putString("companyName", this.f102263c);
        r02.putString("companyIconUrl", this.d);
        r02.putString("bracketParentStatus", this.f102264e);
        r02.putBoolean("isFromPendingOrderList", this.f102265f);
        r02.putBoolean("isFromBuySell", this.f102266g);
        return r02;
    }

    public int hashCode() {
        return (((((((((((this.f102261a.hashCode() * 31) + this.f102262b.hashCode()) * 31) + this.f102263c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f102264e.hashCode()) * 31) + Boolean.hashCode(this.f102265f)) * 31) + Boolean.hashCode(this.f102266g);
    }

    public String toString() {
        return "BuyOrderDetailComposeFragmentArgs(orderId=" + this.f102261a + ", companySymbol=" + this.f102262b + ", companyName=" + this.f102263c + ", companyIconUrl=" + this.d + ", bracketParentStatus=" + this.f102264e + ", isFromPendingOrderList=" + this.f102265f + ", isFromBuySell=" + this.f102266g + ')';
    }
}
