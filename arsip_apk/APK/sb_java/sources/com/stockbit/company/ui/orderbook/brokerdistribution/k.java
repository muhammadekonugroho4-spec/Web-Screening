package com.stockbit.company.ui.orderbook.brokerdistribution;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class k implements InterfaceC4094y {

    /* renamed from: k, reason: collision with root package name */
    public static final a f67082k = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f67083a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67084b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67085c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f67086e;

    /* renamed from: f, reason: collision with root package name */
    public final String f67087f;

    /* renamed from: g, reason: collision with root package name */
    public final String f67088g;

    /* renamed from: h, reason: collision with root package name */
    public final String f67089h;

    /* renamed from: i, reason: collision with root package name */
    public final String f67090i;

    /* renamed from: j, reason: collision with root package name */
    public final String f67091j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final k a(Bundle r14) {
            kotlin.jvm.internal.p.l(r14, "bundle");
            r14.setClassLoader(k.class.getClassLoader());
            if (r14.containsKey("symbol") == false) goto L71;
            String r3 = r14.getString("symbol");
            if (r3 == null) goto L69;
            if (r14.containsKey("companyName") == false) goto L67;
            String r4 = r14.getString("companyName");
            if (r4 == null) goto L65;
            if (r14.containsKey("companyType") == false) goto L63;
            String r5 = r14.getString("companyType");
            if (r5 == null) goto L61;
            if (r14.containsKey("iconUrl") == false) goto L59;
            String r6 = r14.getString("iconUrl");
            if (r6 == null) goto L57;
            if (r14.containsKey("sortType") == false) goto L55;
            String r7 = r14.getString("sortType");
            if (r7 == null) goto L53;
            if (r14.containsKey("investorType") == false) goto L51;
            String r8 = r14.getString("investorType");
            if (r8 == null) goto L49;
            if (r14.containsKey("marketBoardType") == false) goto L47;
            String r9 = r14.getString("marketBoardType");
            if (r9 == null) goto L45;
            if (r14.containsKey("periodType") == false) goto L43;
            String r10 = r14.getString("periodType");
            if (r14.containsKey("startDate") == false) goto L41;
            String r11 = r14.getString("startDate");
            if (r14.containsKey("endDate") == false) goto L39;
            return new k(r3, r4, r5, r6, r7, r8, r9, r10, r11, r14.getString("endDate"));
        L39:
            throw new IllegalArgumentException("Required argument \"endDate\" is missing and does not have an android:defaultValue");
        L41:
            throw new IllegalArgumentException("Required argument \"startDate\" is missing and does not have an android:defaultValue");
        L43:
            throw new IllegalArgumentException("Required argument \"periodType\" is missing and does not have an android:defaultValue");
        L45:
            throw new IllegalArgumentException("Argument \"marketBoardType\" is marked as non-null but was passed a null value.");
        L47:
            throw new IllegalArgumentException("Required argument \"marketBoardType\" is missing and does not have an android:defaultValue");
        L49:
            throw new IllegalArgumentException("Argument \"investorType\" is marked as non-null but was passed a null value.");
        L51:
            throw new IllegalArgumentException("Required argument \"investorType\" is missing and does not have an android:defaultValue");
        L53:
            throw new IllegalArgumentException("Argument \"sortType\" is marked as non-null but was passed a null value.");
        L55:
            throw new IllegalArgumentException("Required argument \"sortType\" is missing and does not have an android:defaultValue");
        L57:
            throw new IllegalArgumentException("Argument \"iconUrl\" is marked as non-null but was passed a null value.");
        L59:
            throw new IllegalArgumentException("Required argument \"iconUrl\" is missing and does not have an android:defaultValue");
        L61:
            throw new IllegalArgumentException("Argument \"companyType\" is marked as non-null but was passed a null value.");
        L63:
            throw new IllegalArgumentException("Required argument \"companyType\" is missing and does not have an android:defaultValue");
        L65:
            throw new IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.");
        L67:
            throw new IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue");
        L69:
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L71:
            throw new IllegalArgumentException("Required argument \"symbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f67082k = new a(null);
    }

    public k(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "companyName");
        kotlin.jvm.internal.p.l(r4, "companyType");
        kotlin.jvm.internal.p.l(r5, "iconUrl");
        kotlin.jvm.internal.p.l(r6, "sortType");
        kotlin.jvm.internal.p.l(r7, "investorType");
        kotlin.jvm.internal.p.l(r8, "marketBoardType");
        this.f67083a = r2;
        this.f67084b = r3;
        this.f67085c = r4;
        this.d = r5;
        this.f67086e = r6;
        this.f67087f = r7;
        this.f67088g = r8;
        this.f67089h = r9;
        this.f67090i = r10;
        this.f67091j = r11;
    }

    public static final k fromBundle(Bundle r1) {
        return f67082k.a(r1);
    }

    public final String a() {
        return this.f67084b;
    }

    public final String b() {
        return this.f67085c;
    }

    public final String c() {
        return this.f67091j;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f67087f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f67083a, r52.f67083a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f67084b, r52.f67084b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f67085c, r52.f67085c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f67086e, r52.f67086e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f67087f, r52.f67087f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f67088g, r52.f67088g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f67089h, r52.f67089h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f67090i, r52.f67090i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f67091j, r52.f67091j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f67088g;
    }

    public final String g() {
        return this.f67089h;
    }

    public final String h() {
        return this.f67086e;
    }

    public int hashCode() {
        int r02 = ((((((((((((this.f67083a.hashCode() * 31) + this.f67084b.hashCode()) * 31) + this.f67085c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f67086e.hashCode()) * 31) + this.f67087f.hashCode()) * 31) + this.f67088g.hashCode()) * 31;
        String r1 = this.f67089h;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f67090i;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f67091j;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f67090i;
    }

    public final String j() {
        return this.f67083a;
    }

    public final Bundle k() {
        Bundle r02 = new Bundle();
        r02.putString("symbol", this.f67083a);
        r02.putString("companyName", this.f67084b);
        r02.putString("companyType", this.f67085c);
        r02.putString("iconUrl", this.d);
        r02.putString("sortType", this.f67086e);
        r02.putString("investorType", this.f67087f);
        r02.putString("marketBoardType", this.f67088g);
        r02.putString("periodType", this.f67089h);
        r02.putString("startDate", this.f67090i);
        r02.putString("endDate", this.f67091j);
        return r02;
    }

    public String toString() {
        return "BrokerDistributionDetailComposeFragmentArgs(symbol=" + this.f67083a + ", companyName=" + this.f67084b + ", companyType=" + this.f67085c + ", iconUrl=" + this.d + ", sortType=" + this.f67086e + ", investorType=" + this.f67087f + ", marketBoardType=" + this.f67088g + ", periodType=" + this.f67089h + ", startDate=" + this.f67090i + ", endDate=" + this.f67091j + ')';
    }
}
