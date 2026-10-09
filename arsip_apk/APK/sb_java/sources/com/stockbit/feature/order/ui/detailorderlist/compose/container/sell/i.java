package com.stockbit.feature.order.ui.detailorderlist.compose.container.sell;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class i implements InterfaceC4094y {

    /* renamed from: i, reason: collision with root package name */
    public static final a f102333i = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f102334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102335b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102336c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102337e;

    /* renamed from: f, reason: collision with root package name */
    public final String f102338f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f102339g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f102340h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r12) {
            kotlin.jvm.internal.p.l(r12, "bundle");
            r12.setClassLoader(i.class.getClassLoader());
            if (r12.containsKey("orderId") == false) goto L54;
            String r3 = r12.getString("orderId");
            if (r3 == null) goto L52;
            if (r12.containsKey("companySymbol") == false) goto L50;
            String r4 = r12.getString("companySymbol");
            if (r4 == null) goto L48;
            if (r12.containsKey("companyName") == false) goto L46;
            String r5 = r12.getString("companyName");
            if (r5 == null) goto L44;
            if (r12.containsKey("companyIconUrl") == false) goto L42;
            String r6 = r12.getString("companyIconUrl");
            if (r6 == null) goto L40;
            if (r12.containsKey("isDayTrade") == false) goto L38;
            boolean r7 = r12.getBoolean("isDayTrade");
            boolean r2 = false;
            if (r12.containsKey("isFromPendingOrderList") == false) goto L23;
            boolean r9 = r12.getBoolean("isFromPendingOrderList");
        L25:
            if (r12.containsKey("isFromBuySell") == false) goto L27;
            r2 = r12.getBoolean("isFromBuySell");
        L27:
            boolean r10 = r2;
            if (r12.containsKey("bracketParentStatus") == false) goto L36;
            String r8 = r12.getString("bracketParentStatus");
            if (r8 == null) goto L34;
            return new i(r3, r4, r5, r6, r7, r8, r9, r10);
        L34:
            throw new IllegalArgumentException("Argument \"bracketParentStatus\" is marked as non-null but was passed a null value.");
        L36:
            throw new IllegalArgumentException("Required argument \"bracketParentStatus\" is missing and does not have an android:defaultValue");
        L23:
            r9 = false;
            goto L25
        L38:
            throw new IllegalArgumentException("Required argument \"isDayTrade\" is missing and does not have an android:defaultValue");
        L40:
            throw new IllegalArgumentException("Argument \"companyIconUrl\" is marked as non-null but was passed a null value.");
        L42:
            throw new IllegalArgumentException("Required argument \"companyIconUrl\" is missing and does not have an android:defaultValue");
        L44:
            throw new IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.");
        L46:
            throw new IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue");
        L48:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L50:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        L52:
            throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
        L54:
            throw new IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f102333i = new a(null);
    }

    public i(String r2, String r3, String r4, String r5, boolean r6, String r7, boolean r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "companySymbol");
        kotlin.jvm.internal.p.l(r4, "companyName");
        kotlin.jvm.internal.p.l(r5, "companyIconUrl");
        kotlin.jvm.internal.p.l(r7, "bracketParentStatus");
        this.f102334a = r2;
        this.f102335b = r3;
        this.f102336c = r4;
        this.d = r5;
        this.f102337e = r6;
        this.f102338f = r7;
        this.f102339g = r8;
        this.f102340h = r9;
    }

    public static final i fromBundle(Bundle r1) {
        return f102333i.a(r1);
    }

    public final String a() {
        return this.f102338f;
    }

    public final String b() {
        return this.f102336c;
    }

    public final String c() {
        return this.f102335b;
    }

    public final String d() {
        return this.f102334a;
    }

    public final boolean e() {
        return this.f102337e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f102334a, r52.f102334a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f102335b, r52.f102335b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f102336c, r52.f102336c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f102337e == r52.f102337e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f102338f, r52.f102338f) == true) goto L27;
        return false;
    L27:
        if (this.f102339g == r52.f102339g) goto L30;
        return false;
    L30:
        if (this.f102340h == r52.f102340h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f102340h;
    }

    public final boolean g() {
        return this.f102339g;
    }

    public final Bundle h() {
        Bundle r02 = new Bundle();
        r02.putString("orderId", this.f102334a);
        r02.putString("companySymbol", this.f102335b);
        r02.putString("companyName", this.f102336c);
        r02.putString("companyIconUrl", this.d);
        r02.putBoolean("isDayTrade", this.f102337e);
        r02.putBoolean("isFromPendingOrderList", this.f102339g);
        r02.putBoolean("isFromBuySell", this.f102340h);
        r02.putString("bracketParentStatus", this.f102338f);
        return r02;
    }

    public int hashCode() {
        return (((((((((((((this.f102334a.hashCode() * 31) + this.f102335b.hashCode()) * 31) + this.f102336c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f102337e)) * 31) + this.f102338f.hashCode()) * 31) + Boolean.hashCode(this.f102339g)) * 31) + Boolean.hashCode(this.f102340h);
    }

    public String toString() {
        return "SellOrderDetailComposeFragmentArgs(orderId=" + this.f102334a + ", companySymbol=" + this.f102335b + ", companyName=" + this.f102336c + ", companyIconUrl=" + this.d + ", isDayTrade=" + this.f102337e + ", bracketParentStatus=" + this.f102338f + ", isFromPendingOrderList=" + this.f102339g + ", isFromBuySell=" + this.f102340h + ')';
    }
}
