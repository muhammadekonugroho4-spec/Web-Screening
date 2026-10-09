package com.stockbit.brokerdailyactivity.ui.compose.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: k, reason: collision with root package name */
    public static final a f49673k = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f49674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49676c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49677e;

    /* renamed from: f, reason: collision with root package name */
    public final String f49678f;

    /* renamed from: g, reason: collision with root package name */
    public final String f49679g;

    /* renamed from: h, reason: collision with root package name */
    public final String f49680h;

    /* renamed from: i, reason: collision with root package name */
    public final String f49681i;

    /* renamed from: j, reason: collision with root package name */
    public final String f49682j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r15) {
            p.l(r15, "bundle");
            r15.setClassLoader(d.class.getClassLoader());
            String r2 = null;
            if (r15.containsKey("brokerCode") == false) goto L5;
            String r4 = r15.getString("brokerCode");
        L7:
            if (r15.containsKey("stockCode") == false) goto L9;
            String r5 = r15.getString("stockCode");
        L11:
            if (r15.containsKey("marketType") == false) goto L13;
            String r6 = r15.getString("marketType");
        L15:
            if (r15.containsKey("investorType") == false) goto L17;
            String r7 = r15.getString("investorType");
        L19:
            if (r15.containsKey("intervalType") == false) goto L21;
            String r8 = r15.getString("intervalType");
        L23:
            if (r15.containsKey("periodType") == false) goto L25;
            String r9 = r15.getString("periodType");
        L27:
            if (r15.containsKey("year") == false) goto L29;
            String r10 = r15.getString("year");
        L31:
            if (r15.containsKey("month") == false) goto L33;
            String r11 = r15.getString("month");
        L35:
            if (r15.containsKey("startDate") == false) goto L37;
            String r12 = r15.getString("startDate");
        L39:
            if (r15.containsKey("endDate") == false) goto L42;
            r2 = r15.getString("endDate");
        L42:
            return new d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r2);
        L37:
            r12 = null;
            goto L39
        L33:
            r11 = null;
            goto L35
        L29:
            r10 = null;
            goto L31
        L25:
            r9 = null;
            goto L27
        L21:
            r8 = null;
            goto L23
        L17:
            r7 = null;
            goto L19
        L13:
            r6 = null;
            goto L15
        L9:
            r5 = null;
            goto L11
        L5:
            r4 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f49673k = new a(null);
    }

    public d(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        this.f49674a = r1;
        this.f49675b = r2;
        this.f49676c = r3;
        this.d = r4;
        this.f49677e = r5;
        this.f49678f = r6;
        this.f49679g = r7;
        this.f49680h = r8;
        this.f49681i = r9;
        this.f49682j = r10;
    }

    public static final d fromBundle(Bundle r1) {
        return f49673k.a(r1);
    }

    public final String a() {
        return this.f49674a;
    }

    public final String b() {
        return this.f49682j;
    }

    public final String c() {
        return this.f49677e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f49676c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f49674a, r52.f49674a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f49675b, r52.f49675b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f49676c, r52.f49676c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f49677e, r52.f49677e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f49678f, r52.f49678f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f49679g, r52.f49679g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f49680h, r52.f49680h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f49681i, r52.f49681i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f49682j, r52.f49682j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f49680h;
    }

    public final String g() {
        return this.f49678f;
    }

    public final String h() {
        return this.f49681i;
    }

    public int hashCode() {
        String r02 = this.f49674a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f49675b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f49676c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f49677e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f49678f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f49679g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f49680h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f49681i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f49682j;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.f49675b;
    }

    public final String j() {
        return this.f49679g;
    }

    public final Bundle k() {
        Bundle r02 = new Bundle();
        r02.putString("brokerCode", this.f49674a);
        r02.putString("stockCode", this.f49675b);
        r02.putString("marketType", this.f49676c);
        r02.putString("investorType", this.d);
        r02.putString("intervalType", this.f49677e);
        r02.putString("periodType", this.f49678f);
        r02.putString("year", this.f49679g);
        r02.putString("month", this.f49680h);
        r02.putString("startDate", this.f49681i);
        r02.putString("endDate", this.f49682j);
        return r02;
    }

    public String toString() {
        return "BrokerDailyActivityFragmentArgs(brokerCode=" + this.f49674a + ", stockCode=" + this.f49675b + ", marketType=" + this.f49676c + ", investorType=" + this.d + ", intervalType=" + this.f49677e + ", periodType=" + this.f49678f + ", year=" + this.f49679g + ", month=" + this.f49680h + ", startDate=" + this.f49681i + ", endDate=" + this.f49682j + ')';
    }
}
