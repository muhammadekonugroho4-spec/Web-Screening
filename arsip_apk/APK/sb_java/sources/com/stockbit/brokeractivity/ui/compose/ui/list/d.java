package com.stockbit.brokeractivity.ui.compose.ui.list;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: k, reason: collision with root package name */
    public static final a f49024k = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f49025a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49026b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49027c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49028e;

    /* renamed from: f, reason: collision with root package name */
    public final String f49029f;

    /* renamed from: g, reason: collision with root package name */
    public final String f49030g;

    /* renamed from: h, reason: collision with root package name */
    public final String f49031h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f49032i;

    /* renamed from: j, reason: collision with root package name */
    public final String f49033j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r14) {
            p.l(r14, "bundle");
            r14.setClassLoader(d.class.getClassLoader());
            if (r14.containsKey("brokerCode") == false) goto L41;
            String r3 = r14.getString("brokerCode");
            String r2 = null;
            if (r14.containsKey("brokerTitle") == false) goto L7;
            String r4 = r14.getString("brokerTitle");
        L9:
            if (r14.containsKey("brokerType") == false) goto L11;
            String r5 = r14.getString("brokerType");
        L12:
            boolean r6 = false;
            if (r14.containsKey("isFromDeeplink") == false) goto L15;
            boolean r02 = r14.getBoolean("isFromDeeplink");
        L17:
            if (r14.containsKey("startDate") == false) goto L19;
            String r7 = r14.getString("startDate");
        L21:
            if (r14.containsKey("endDate") == false) goto L23;
            String r8 = r14.getString("endDate");
        L25:
            if (r14.containsKey("marketType") == false) goto L27;
            String r9 = r14.getString("marketType");
        L29:
            if (r14.containsKey("investorType") == false) goto L31;
            String r10 = r14.getString("investorType");
        L33:
            if (r14.containsKey("isDateChangedFromDatePicker") == false) goto L35;
            r6 = r14.getBoolean("isDateChangedFromDatePicker");
        L35:
            boolean r11 = r6;
            if (r14.containsKey("periodType") == false) goto L39;
            r2 = r14.getString("periodType");
        L39:
            return new d(r3, r4, r5, r02, r7, r8, r9, r10, r11, r2);
        L31:
            r10 = null;
            goto L33
        L27:
            r9 = null;
            goto L29
        L23:
            r8 = null;
            goto L25
        L19:
            r7 = null;
            goto L21
        L15:
            r02 = false;
            goto L17
        L11:
            r5 = null;
            goto L12
        L7:
            r4 = null;
            goto L9
        L41:
            throw new IllegalArgumentException("Required argument \"brokerCode\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f49024k = new a(null);
    }

    public d(String r1, String r2, String r3, boolean r4, String r5, String r6, String r7, String r8, boolean r9, String r10) {
        this.f49025a = r1;
        this.f49026b = r2;
        this.f49027c = r3;
        this.d = r4;
        this.f49028e = r5;
        this.f49029f = r6;
        this.f49030g = r7;
        this.f49031h = r8;
        this.f49032i = r9;
        this.f49033j = r10;
    }

    public static final d fromBundle(Bundle r1) {
        return f49024k.a(r1);
    }

    public final String a() {
        return this.f49025a;
    }

    public final String b() {
        return this.f49026b;
    }

    public final String c() {
        return this.f49027c;
    }

    public final String d() {
        return this.f49029f;
    }

    public final String e() {
        return this.f49031h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f49025a, r52.f49025a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f49026b, r52.f49026b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f49027c, r52.f49027c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f49028e, r52.f49028e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f49029f, r52.f49029f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f49030g, r52.f49030g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f49031h, r52.f49031h) == true) goto L33;
        return false;
    L33:
        if (this.f49032i == r52.f49032i) goto L36;
        return false;
    L36:
        if (p.g(this.f49033j, r52.f49033j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f49030g;
    }

    public final String g() {
        return this.f49033j;
    }

    public final String h() {
        return this.f49028e;
    }

    public int hashCode() {
        String r02 = this.f49025a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f49026b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f49027c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (((r05 + r24) * 31) + Boolean.hashCode(this.d)) * 31;
        String r25 = this.f49028e;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f49029f;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f49030g;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f49031h;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (((r09 + r212) * 31) + Boolean.hashCode(this.f49032i)) * 31;
        String r213 = this.f49033j;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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

    public final boolean i() {
        return this.f49032i;
    }

    public final boolean j() {
        return this.d;
    }

    public final Bundle k() {
        Bundle r02 = new Bundle();
        r02.putString("brokerCode", this.f49025a);
        r02.putString("brokerTitle", this.f49026b);
        r02.putString("brokerType", this.f49027c);
        r02.putBoolean("isFromDeeplink", this.d);
        r02.putString("startDate", this.f49028e);
        r02.putString("endDate", this.f49029f);
        r02.putString("marketType", this.f49030g);
        r02.putString("investorType", this.f49031h);
        r02.putBoolean("isDateChangedFromDatePicker", this.f49032i);
        r02.putString("periodType", this.f49033j);
        return r02;
    }

    public String toString() {
        return "BrokerActivityListComposeFragmentArgs(brokerCode=" + this.f49025a + ", brokerTitle=" + this.f49026b + ", brokerType=" + this.f49027c + ", isFromDeeplink=" + this.d + ", startDate=" + this.f49028e + ", endDate=" + this.f49029f + ", marketType=" + this.f49030g + ", investorType=" + this.f49031h + ", isDateChangedFromDatePicker=" + this.f49032i + ", periodType=" + this.f49033j + ')';
    }

    public /* synthetic */ d(String r3, String r4, String r5, boolean r6, String r7, String r8, String r9, String r10, boolean r11, String r12, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 2) == 0) goto L6;
        r4 = null;
    L6:
        if ((r13 & 4) == 0) goto L9;
        r5 = null;
    L9:
        if ((r13 & 8) == 0) goto L12;
        r6 = false;
    L12:
        if ((r13 & 16) == 0) goto L15;
        r7 = null;
    L15:
        if ((r13 & 32) == 0) goto L18;
        r8 = null;
    L18:
        if ((r13 & 64) == 0) goto L21;
        r9 = null;
    L21:
        if ((r13 & 128) == 0) goto L24;
        r10 = null;
    L24:
        if ((r13 & 256) == 0) goto L27;
        r11 = false;
    L27:
        if ((r13 & 512) == 0) goto L30;
        String r132 = null;
    L29:
        boolean r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        boolean r72 = r6;
        this(r3, r4, r5, r72, r82, r92, r102, r112, r122, r132);
        return;
    L30:
        r132 = r12;
        goto L29
    }
}
