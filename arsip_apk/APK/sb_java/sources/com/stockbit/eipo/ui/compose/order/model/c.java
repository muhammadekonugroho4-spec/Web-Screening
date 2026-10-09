package com.stockbit.eipo.ui.compose.order.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f90514a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90515b;

    /* renamed from: c, reason: collision with root package name */
    public final a f90516c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90517e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90518f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f90519g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f90520h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90521i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f90522j;

    static {
    }

    public c(double r2, boolean r4, a r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        p.l(r5, "orderForm");
        this.f90514a = r2;
        this.f90515b = r4;
        this.f90516c = r5;
        this.d = r6;
        this.f90517e = r7;
        this.f90518f = r8;
        this.f90519g = r9;
        this.f90520h = r10;
        this.f90521i = r11;
        this.f90522j = r12;
    }

    public static /* synthetic */ c b(c r12, double r13, boolean r15, a r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24, Object r25) {
        if ((r24 & 1) == 0) goto L5;
        r13 = r12.f90514a;
    L5:
        double r1 = r13;
        if ((r24 & 2) == 0) goto L8;
        r15 = r12.f90515b;
    L8:
        boolean r3 = r15;
        if ((r24 & 4) == 0) goto L11;
        a r4 = r12.f90516c;
    L13:
        if ((r24 & 8) == 0) goto L15;
        boolean r5 = r12.d;
    L17:
        if ((r24 & 16) == 0) goto L19;
        boolean r6 = r12.f90517e;
    L21:
        if ((r24 & 32) == 0) goto L23;
        boolean r7 = r12.f90518f;
    L25:
        if ((r24 & 64) == 0) goto L27;
        boolean r8 = r12.f90519g;
    L29:
        if ((r24 & 128) == 0) goto L31;
        boolean r9 = r12.f90520h;
    L33:
        if ((r24 & 256) == 0) goto L35;
        boolean r10 = r12.f90521i;
    L37:
        if ((r24 & 512) == 0) goto L40;
        boolean r11 = r12.f90522j;
    L42:
        return r12.a(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    L40:
        r11 = r23;
        goto L42
    L35:
        r10 = r22;
        goto L37
    L31:
        r9 = r21;
        goto L33
    L27:
        r8 = r20;
        goto L29
    L23:
        r7 = r19;
        goto L25
    L19:
        r6 = r18;
        goto L21
    L15:
        r5 = r17;
        goto L17
    L11:
        r4 = r16;
        goto L13
    }

    public final c a(double r14, boolean r16, a r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        p.l(r17, "orderForm");
        return new c(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public final double c() {
        return this.f90514a;
    }

    public final a d() {
        return this.f90516c;
    }

    public final boolean e() {
        return this.f90520h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f90514a, r82.f90514a) == 0) goto L12;
        return false;
    L12:
        if (this.f90515b == r82.f90515b) goto L15;
        return false;
    L15:
        if (p.g(this.f90516c, r82.f90516c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f90517e == r82.f90517e) goto L24;
        return false;
    L24:
        if (this.f90518f == r82.f90518f) goto L27;
        return false;
    L27:
        if (this.f90519g == r82.f90519g) goto L30;
        return false;
    L30:
        if (this.f90520h == r82.f90520h) goto L33;
        return false;
    L33:
        if (this.f90521i == r82.f90521i) goto L36;
        return false;
    L36:
        if (this.f90522j == r82.f90522j) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean f() {
        return this.f90521i;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.f90518f;
    }

    public int hashCode() {
        return (((((((((((((((((Double.hashCode(this.f90514a) * 31) + Boolean.hashCode(this.f90515b)) * 31) + this.f90516c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f90517e)) * 31) + Boolean.hashCode(this.f90518f)) * 31) + Boolean.hashCode(this.f90519g)) * 31) + Boolean.hashCode(this.f90520h)) * 31) + Boolean.hashCode(this.f90521i)) * 31) + Boolean.hashCode(this.f90522j);
    }

    public final boolean i() {
        return this.f90517e;
    }

    public final boolean j() {
        return this.f90522j;
    }

    public final boolean k() {
        return this.f90519g;
    }

    public final boolean l() {
        return this.f90515b;
    }

    public String toString() {
        return "EIpoOrderUIState(cashOnHand=" + this.f90514a + ", isWarrant=" + this.f90515b + ", orderForm=" + this.f90516c + ", isAffiliateSelected=" + this.d + ", isEmployeeSelected=" + this.f90517e + ", isEmployeeAllocationSelected=" + this.f90518f + ", isTnCSelected=" + this.f90519g + ", shouldEnableButtonOrder=" + this.f90520h + ", shouldEnableButtonReview=" + this.f90521i + ", isSubmittingOrder=" + this.f90522j + ')';
    }

    public /* synthetic */ c(double r39, boolean r41, a r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, i r51) {
        if ((r50 & 1) == 0) goto L5;
        double r1 = 0.0d;
    L7:
        if ((r50 & 2) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r50 & 4) == 0) goto L13;
        a r6 = new a(0, 0, 0, false, false, 0, 0, 0, false, false, 0, 0, 0.0d, 0.0d, false, 0.0d, 0.0d, false, 0.0d, 524287, null);
    L15:
        if ((r50 & 8) == 0) goto L17;
        boolean r5 = false;
    L19:
        if ((r50 & 16) == 0) goto L21;
        boolean r7 = false;
    L23:
        if ((r50 & 32) == 0) goto L25;
        boolean r8 = false;
    L27:
        if ((r50 & 64) == 0) goto L29;
        boolean r9 = false;
    L31:
        if ((r50 & 128) == 0) goto L33;
        boolean r10 = false;
    L35:
        if ((r50 & 256) == 0) goto L37;
        boolean r11 = false;
    L39:
        if ((r50 & 512) == 0) goto L42;
        boolean r502 = false;
    L43:
        this(r1, r3, r6, r5, r7, r8, r9, r10, r11, r502);
        return;
    L42:
        r502 = r49;
        goto L43
    L37:
        r11 = r48;
        goto L39
    L33:
        r10 = r47;
        goto L35
    L29:
        r9 = r46;
        goto L31
    L25:
        r8 = r45;
        goto L27
    L21:
        r7 = r44;
        goto L23
    L17:
        r5 = r43;
        goto L19
    L13:
        r6 = r42;
        goto L15
    L9:
        r3 = r41;
        goto L11
    L5:
        r1 = r39;
        goto L7
    }
}
