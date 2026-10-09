package com.stockbit.feature.bonds.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.bonds.model.BondChartTimeframeAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f92333a;

    /* renamed from: b, reason: collision with root package name */
    public final List f92334b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92335c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f92336e;

    /* renamed from: f, reason: collision with root package name */
    public final double f92337f;

    /* renamed from: g, reason: collision with root package name */
    public final double f92338g;

    /* renamed from: h, reason: collision with root package name */
    public final double f92339h;

    /* renamed from: i, reason: collision with root package name */
    public final double f92340i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f92341j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f92342k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f92343l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f92344m;

    /* renamed from: n, reason: collision with root package name */
    public final BondChartTimeframeAction f92345n;

    static {
    }

    public c(List r3, List r4, boolean r5, List r6, List r7, double r8, double r10, double r12, double r14, boolean r16, boolean r17, boolean r18, boolean r19, BondChartTimeframeAction r20) {
        p.l(r3, "chartEntry");
        p.l(r4, "yieldEntry");
        p.l(r6, "buyPriceEntry");
        p.l(r7, "sellPriceEntry");
        p.l(r20, "selectedTimeFrame");
        this.f92333a = r3;
        this.f92334b = r4;
        this.f92335c = r5;
        this.d = r6;
        this.f92336e = r7;
        this.f92337f = r8;
        this.f92338g = r10;
        this.f92339h = r12;
        this.f92340i = r14;
        this.f92341j = r16;
        this.f92342k = r17;
        this.f92343l = r18;
        this.f92344m = r19;
        this.f92345n = r20;
    }

    public static /* synthetic */ c b(c r16, List r17, List r18, boolean r19, List r20, List r21, double r22, double r24, double r26, double r28, boolean r30, boolean r31, boolean r32, boolean r33, BondChartTimeframeAction r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        List r2 = r16.f92333a;
    L7:
        if ((r35 & 2) == 0) goto L9;
        List r3 = r16.f92334b;
    L11:
        if ((r35 & 4) == 0) goto L13;
        boolean r4 = r16.f92335c;
    L15:
        if ((r35 & 8) == 0) goto L17;
        List r5 = r16.d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        List r6 = r16.f92336e;
    L23:
        if ((r35 & 32) == 0) goto L25;
        double r7 = r16.f92337f;
    L27:
        if ((r35 & 64) == 0) goto L29;
        double r9 = r16.f92338g;
    L31:
        if ((r35 & 128) == 0) goto L33;
        double r11 = r16.f92339h;
    L35:
        if ((r35 & 256) == 0) goto L37;
        double r13 = r16.f92340i;
    L39:
        if ((r35 & 512) == 0) goto L41;
        boolean r15 = r16.f92341j;
    L42:
        List r172 = r2;
        if ((r35 & 1024) == 0) goto L45;
        boolean r23 = r16.f92342k;
    L46:
        boolean r182 = r23;
        if ((r35 & 2048) == 0) goto L49;
        boolean r25 = r16.f92343l;
    L50:
        boolean r192 = r25;
        if ((r35 & 4096) == 0) goto L53;
        boolean r27 = r16.f92344m;
    L55:
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        BondChartTimeframeAction r352 = r16.f92345n;
    L60:
        return r16.a(r172, r3, r4, r5, r6, r7, r9, r11, r13, r15, r182, r192, r27, r352);
    L58:
        r352 = r34;
        goto L60
    L53:
        r27 = r33;
        goto L55
    L49:
        r25 = r32;
        goto L50
    L45:
        r23 = r31;
        goto L46
    L41:
        r15 = r30;
        goto L42
    L37:
        r13 = r28;
        goto L39
    L33:
        r11 = r26;
        goto L35
    L29:
        r9 = r24;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final c a(List r21, List r22, boolean r23, List r24, List r25, double r26, double r28, double r30, double r32, boolean r34, boolean r35, boolean r36, boolean r37, BondChartTimeframeAction r38) {
        p.l(r21, "chartEntry");
        p.l(r22, "yieldEntry");
        p.l(r24, "buyPriceEntry");
        p.l(r25, "sellPriceEntry");
        p.l(r38, "selectedTimeFrame");
        return new c(r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r35, r36, r37, r38);
    }

    public final double c() {
        return this.f92339h;
    }

    public final List d() {
        return this.d;
    }

    public final double e() {
        return this.f92337f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f92333a, r82.f92333a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f92334b, r82.f92334b) == true) goto L15;
        return false;
    L15:
        if (this.f92335c == r82.f92335c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f92336e, r82.f92336e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f92337f, r82.f92337f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f92338g, r82.f92338g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f92339h, r82.f92339h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f92340i, r82.f92340i) == 0) goto L36;
        return false;
    L36:
        if (this.f92341j == r82.f92341j) goto L39;
        return false;
    L39:
        if (this.f92342k == r82.f92342k) goto L42;
        return false;
    L42:
        if (this.f92343l == r82.f92343l) goto L45;
        return false;
    L45:
        if (this.f92344m == r82.f92344m) goto L48;
        return false;
    L48:
        if (this.f92345n == r82.f92345n) goto L50;
        return false;
    L50:
        return true;
    }

    public final List f() {
        return this.f92333a;
    }

    public final BondChartTimeframeAction g() {
        return this.f92345n;
    }

    public final double h() {
        return this.f92340i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f92333a.hashCode() * 31) + this.f92334b.hashCode()) * 31) + Boolean.hashCode(this.f92335c)) * 31) + this.d.hashCode()) * 31) + this.f92336e.hashCode()) * 31) + Double.hashCode(this.f92337f)) * 31) + Double.hashCode(this.f92338g)) * 31) + Double.hashCode(this.f92339h)) * 31) + Double.hashCode(this.f92340i)) * 31) + Boolean.hashCode(this.f92341j)) * 31) + Boolean.hashCode(this.f92342k)) * 31) + Boolean.hashCode(this.f92343l)) * 31) + Boolean.hashCode(this.f92344m)) * 31) + this.f92345n.hashCode();
    }

    public final List i() {
        return this.f92336e;
    }

    public final boolean j() {
        return this.f92335c;
    }

    public final boolean k() {
        return this.f92343l;
    }

    public final boolean l() {
        return this.f92344m;
    }

    public final boolean m() {
        return this.f92342k;
    }

    public final double n() {
        return this.f92338g;
    }

    public final List o() {
        return this.f92334b;
    }

    public final boolean p() {
        return this.f92341j;
    }

    public String toString() {
        return "BondDetailChartUIState(chartEntry=" + this.f92333a + ", yieldEntry=" + this.f92334b + ", showMinMax=" + this.f92335c + ", buyPriceEntry=" + this.d + ", sellPriceEntry=" + this.f92336e + ", changePriceChart=" + this.f92337f + ", yieldChange=" + this.f92338g + ", buyPriceChange=" + this.f92339h + ", sellPriceChange=" + this.f92340i + ", isChartLoading=" + this.f92341j + ", showMinMaxYield=" + this.f92342k + ", showMinMaxBuy=" + this.f92343l + ", showMinMaxSell=" + this.f92344m + ", selectedTimeFrame=" + this.f92345n + ')';
    }

    public /* synthetic */ c(List r17, List r18, boolean r19, List r20, List r21, double r22, double r24, double r26, double r28, boolean r30, boolean r31, boolean r32, boolean r33, BondChartTimeframeAction r34, int r35, kotlin.jvm.internal.i r36) {
        if ((r35 & 1) == 0) goto L5;
        List r1 = new ArrayList();
    L7:
        if ((r35 & 2) == 0) goto L9;
        List r2 = new ArrayList();
    L11:
        if ((r35 & 4) == 0) goto L13;
        boolean r3 = false;
    L15:
        if ((r35 & 8) == 0) goto L17;
        List r5 = new ArrayList();
    L19:
        if ((r35 & 16) == 0) goto L21;
        List r6 = new ArrayList();
    L22:
        double r8 = 0.0d;
        if ((r35 & 32) == 0) goto L25;
        double r10 = 0.0d;
    L27:
        if ((r35 & 64) == 0) goto L29;
        double r12 = 0.0d;
    L31:
        if ((r35 & 128) == 0) goto L33;
        double r14 = 0.0d;
    L35:
        if ((r35 & 256) != 0) goto L39;
        r8 = r28;
    L39:
        if ((r35 & 512) == 0) goto L41;
        boolean r7 = false;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        boolean r4 = false;
    L46:
        List r362 = r1;
        if ((r35 & 2048) == 0) goto L49;
        boolean r13 = false;
    L50:
        boolean r182 = r13;
        if ((r35 & 4096) == 0) goto L53;
        boolean r15 = false;
    L55:
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        BondChartTimeframeAction r352 = BondChartTimeframeAction.ONE_YEAR;
    L59:
        this(r362, r2, r3, r5, r6, r10, r12, r14, r8, r7, r4, r182, r15, r352);
        return;
    L58:
        r352 = r34;
        goto L59
    L53:
        r15 = r33;
        goto L55
    L49:
        r13 = r32;
        goto L50
    L45:
        r4 = r31;
        goto L46
    L41:
        r7 = r30;
        goto L43
    L33:
        r14 = r26;
        goto L35
    L29:
        r12 = r24;
        goto L31
    L25:
        r10 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L22
    L17:
        r5 = r20;
        goto L19
    L13:
        r3 = r19;
        goto L15
    L9:
        r2 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
