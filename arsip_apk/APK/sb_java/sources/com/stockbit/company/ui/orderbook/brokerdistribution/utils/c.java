package com.stockbit.company.ui.orderbook.brokerdistribution.utils;

import kotlin.jvm.internal.i;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f67255a;

    /* renamed from: b, reason: collision with root package name */
    public final float f67256b;

    /* renamed from: c, reason: collision with root package name */
    public final float f67257c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f67258e;

    /* renamed from: f, reason: collision with root package name */
    public final float f67259f;

    /* renamed from: g, reason: collision with root package name */
    public final float f67260g;

    /* renamed from: h, reason: collision with root package name */
    public final float f67261h;

    /* renamed from: i, reason: collision with root package name */
    public final float f67262i;

    /* renamed from: j, reason: collision with root package name */
    public final int f67263j;

    /* renamed from: k, reason: collision with root package name */
    public final float f67264k;

    /* renamed from: l, reason: collision with root package name */
    public final float f67265l;

    /* renamed from: m, reason: collision with root package name */
    public final float f67266m;

    static {
    }

    public /* synthetic */ c(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, int r10, float r11, float r12, float r13, i r14) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
    }

    public final int a() {
        return this.f67263j;
    }

    public final float b() {
        return this.f67262i;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.f67256b;
    }

    public final float e() {
        return this.f67260g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (androidx.compose.ui.unit.i.j(this.f67255a, r52.f67255a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f67256b, r52.f67256b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.unit.i.j(this.f67257c, r52.f67257c) == true) goto L18;
        return false;
    L18:
        if (androidx.compose.ui.unit.i.j(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (androidx.compose.ui.unit.i.j(this.f67258e, r52.f67258e) == true) goto L24;
        return false;
    L24:
        if (androidx.compose.ui.unit.i.j(this.f67259f, r52.f67259f) == true) goto L27;
        return false;
    L27:
        if (androidx.compose.ui.unit.i.j(this.f67260g, r52.f67260g) == true) goto L30;
        return false;
    L30:
        if (androidx.compose.ui.unit.i.j(this.f67261h, r52.f67261h) == true) goto L33;
        return false;
    L33:
        if (Float.compare(this.f67262i, r52.f67262i) == 0) goto L36;
        return false;
    L36:
        if (this.f67263j == r52.f67263j) goto L39;
        return false;
    L39:
        if (androidx.compose.ui.unit.i.j(this.f67264k, r52.f67264k) == true) goto L42;
        return false;
    L42:
        if (androidx.compose.ui.unit.i.j(this.f67265l, r52.f67265l) == true) goto L45;
        return false;
    L45:
        if (Float.compare(this.f67266m, r52.f67266m) == 0) goto L47;
        return false;
    L47:
        return true;
    }

    public final float f() {
        return this.f67265l;
    }

    public final float g() {
        return this.f67264k;
    }

    public final float h() {
        return this.f67259f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((androidx.compose.ui.unit.i.k(this.f67255a) * 31) + androidx.compose.ui.unit.i.k(this.f67256b)) * 31) + androidx.compose.ui.unit.i.k(this.f67257c)) * 31) + androidx.compose.ui.unit.i.k(this.d)) * 31) + androidx.compose.ui.unit.i.k(this.f67258e)) * 31) + androidx.compose.ui.unit.i.k(this.f67259f)) * 31) + androidx.compose.ui.unit.i.k(this.f67260g)) * 31) + androidx.compose.ui.unit.i.k(this.f67261h)) * 31) + Float.hashCode(this.f67262i)) * 31) + Integer.hashCode(this.f67263j)) * 31) + androidx.compose.ui.unit.i.k(this.f67264k)) * 31) + androidx.compose.ui.unit.i.k(this.f67265l)) * 31) + Float.hashCode(this.f67266m);
    }

    public final float i() {
        return this.f67258e;
    }

    public final float j() {
        return this.f67255a;
    }

    public final float k() {
        return this.f67257c;
    }

    public String toString() {
        return "SankeyDiagramConfig(nodeWidth=" + androidx.compose.ui.unit.i.l(this.f67255a) + ", horizontalPadding=" + androidx.compose.ui.unit.i.l(this.f67256b) + ", verticalPadding=" + androidx.compose.ui.unit.i.l(this.f67257c) + ", flowHorizontalPadding=" + androidx.compose.ui.unit.i.l(this.d) + ", nodeVerticalSpacing=" + androidx.compose.ui.unit.i.l(this.f67258e) + ", nodeCornerRadius=" + androidx.compose.ui.unit.i.l(this.f67259f) + ", labelOffset=" + androidx.compose.ui.unit.i.l(this.f67260g) + ", labelPadding=" + androidx.compose.ui.unit.i.l(this.f67261h) + ", clickPadding=" + this.f67262i + ", animationDuration=" + this.f67263j + ", minNodeHeight=" + androidx.compose.ui.unit.i.l(this.f67264k) + ", minFlowHeight=" + androidx.compose.ui.unit.i.l(this.f67265l) + ", dimmedAlpha=" + this.f67266m + ')';
    }

    public c(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, int r10, float r11, float r12, float r13) {
        this.f67255a = r1;
        this.f67256b = r2;
        this.f67257c = r3;
        this.d = r4;
        this.f67258e = r5;
        this.f67259f = r6;
        this.f67260g = r7;
        this.f67261h = r8;
        this.f67262i = r9;
        this.f67263j = r10;
        this.f67264k = r11;
        this.f67265l = r12;
        this.f67266m = r13;
    }

    public /* synthetic */ c(float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, int r24, float r25, float r26, float r27, int r28, i r29) {
        if ((r28 & 1) == 0) goto L5;
        float r1 = androidx.compose.ui.unit.i.h(8);
    L7:
        if ((r28 & 2) == 0) goto L9;
        float r3 = androidx.compose.ui.unit.i.h(0);
    L11:
        if ((r28 & 4) == 0) goto L13;
        float r4 = androidx.compose.ui.unit.i.h(0);
    L15:
        if ((r28 & 8) == 0) goto L17;
        float r5 = androidx.compose.ui.unit.i.h(4);
    L19:
        if ((r28 & 16) == 0) goto L21;
        float r6 = androidx.compose.ui.unit.i.h(8);
    L23:
        if ((r28 & 32) == 0) goto L25;
        float r7 = androidx.compose.ui.unit.i.h(2);
    L27:
        if ((r28 & 64) == 0) goto L29;
        float r8 = r1;
    L31:
        if ((r28 & 128) == 0) goto L33;
        float r2 = androidx.compose.ui.unit.i.h(8);
    L35:
        if ((r28 & 256) == 0) goto L37;
        float r9 = 20.0f;
    L39:
        if ((r28 & 512) == 0) goto L41;
        int r10 = 500;
    L43:
        if ((r28 & 1024) == 0) goto L45;
        float r11 = androidx.compose.ui.unit.i.h(16);
    L47:
        if ((r28 & 2048) == 0) goto L49;
        float r12 = androidx.compose.ui.unit.i.h(1);
    L51:
        if ((r28 & 4096) == 0) goto L53;
        float r02 = 0.05f;
    L54:
        float r162 = r1;
        float r232 = r2;
        float r172 = r3;
        float r182 = r4;
        float r192 = r5;
        float r202 = r6;
        float r212 = r7;
        float r222 = r8;
        float r242 = r9;
        int r252 = r10;
        float r262 = r11;
        float r272 = r12;
        this(r162, r172, r182, r192, r202, r212, r222, r232, r242, r252, r262, r272, r02, null);
        return;
    L53:
        r02 = r27;
        goto L54
    L49:
        r12 = r26;
        goto L51
    L45:
        r11 = r25;
        goto L47
    L41:
        r10 = r24;
        goto L43
    L37:
        r9 = r23;
        goto L39
    L33:
        r2 = r22;
        goto L35
    L29:
        r8 = r21;
        goto L31
    L25:
        r7 = r20;
        goto L27
    L21:
        r6 = r19;
        goto L23
    L17:
        r5 = r18;
        goto L19
    L13:
        r4 = r17;
        goto L15
    L9:
        r3 = r16;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }
}
