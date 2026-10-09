package com.stockbit.brokeractivity.ui.compose.ui.chart;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f48966h = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f48967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48968b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48969c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f48970e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48971f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48972g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r11) {
            p.l(r11, "bundle");
            r11.setClassLoader(e.class.getClassLoader());
            if (r11.containsKey("brokerCode") == false) goto L31;
            String r3 = r11.getString("brokerCode");
            String r2 = null;
            if (r11.containsKey("startDate") == false) goto L7;
            String r4 = r11.getString("startDate");
        L9:
            if (r11.containsKey("endDate") == false) goto L11;
            String r5 = r11.getString("endDate");
        L13:
            if (r11.containsKey("marketType") == false) goto L15;
            String r6 = r11.getString("marketType");
        L17:
            if (r11.containsKey("investorType") == false) goto L19;
            String r7 = r11.getString("investorType");
        L21:
            if (r11.containsKey("isDateChangedFromDatePicker") == false) goto L24;
            boolean r02 = r11.getBoolean("isDateChangedFromDatePicker");
        L23:
            boolean r8 = r02;
            if (r11.containsKey("periodType") == false) goto L29;
            r2 = r11.getString("periodType");
        L29:
            return new e(r3, r4, r5, r6, r7, r8, r2);
        L24:
            r02 = false;
            goto L23
        L19:
            r7 = null;
            goto L21
        L15:
            r6 = null;
            goto L17
        L11:
            r5 = null;
            goto L13
        L7:
            r4 = null;
            goto L9
        L31:
            throw new IllegalArgumentException("Required argument \"brokerCode\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f48966h = new a(null);
    }

    public e(String r1, String r2, String r3, String r4, String r5, boolean r6, String r7) {
        this.f48967a = r1;
        this.f48968b = r2;
        this.f48969c = r3;
        this.d = r4;
        this.f48970e = r5;
        this.f48971f = r6;
        this.f48972g = r7;
    }

    public static final e fromBundle(Bundle r1) {
        return f48966h.a(r1);
    }

    public final String a() {
        return this.f48967a;
    }

    public final String b() {
        return this.f48969c;
    }

    public final String c() {
        return this.f48970e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f48972g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f48967a, r52.f48967a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f48968b, r52.f48968b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f48969c, r52.f48969c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f48970e, r52.f48970e) == true) goto L24;
        return false;
    L24:
        if (this.f48971f == r52.f48971f) goto L27;
        return false;
    L27:
        if (p.g(this.f48972g, r52.f48972g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f48968b;
    }

    public final Bundle g() {
        Bundle r02 = new Bundle();
        r02.putString("brokerCode", this.f48967a);
        r02.putString("startDate", this.f48968b);
        r02.putString("endDate", this.f48969c);
        r02.putString("marketType", this.d);
        r02.putString("investorType", this.f48970e);
        r02.putBoolean("isDateChangedFromDatePicker", this.f48971f);
        r02.putString("periodType", this.f48972g);
        return r02;
    }

    public int hashCode() {
        String r02 = this.f48967a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f48968b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f48969c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f48970e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (((r07 + r28) * 31) + Boolean.hashCode(this.f48971f)) * 31;
        String r29 = this.f48972g;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
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

    public String toString() {
        return "BrokerActivityChartComposeFragmentArgs(brokerCode=" + this.f48967a + ", startDate=" + this.f48968b + ", endDate=" + this.f48969c + ", marketType=" + this.d + ", investorType=" + this.f48970e + ", isDateChangedFromDatePicker=" + this.f48971f + ", periodType=" + this.f48972g + ')';
    }
}
