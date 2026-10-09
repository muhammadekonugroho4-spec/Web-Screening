package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f116221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116223c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116224e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116225f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f116226g;

    static {
    }

    public j(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8) {
        p.l(r2, "orderId");
        p.l(r3, "orderPrice");
        p.l(r4, "triggerPrice");
        p.l(r5, "symbol");
        p.l(r6, "orderedAmount");
        p.l(r7, "lot");
        this.f116221a = r2;
        this.f116222b = r3;
        this.f116223c = r4;
        this.d = r5;
        this.f116224e = r6;
        this.f116225f = r7;
        this.f116226g = r8;
    }

    public static /* synthetic */ j b(j r02, String r1, String r2, String r3, String r4, String r5, String r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f116221a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f116222b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f116223c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f116224e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f116225f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f116226g;
    L23:
        String r82 = r6;
        boolean r92 = r7;
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final j a(String r10, String r11, String r12, String r13, String r14, String r15, boolean r16) {
        p.l(r10, "orderId");
        p.l(r11, "orderPrice");
        p.l(r12, "triggerPrice");
        p.l(r13, "symbol");
        p.l(r14, "orderedAmount");
        p.l(r15, "lot");
        return new j(r10, r11, r12, r13, r14, r15, r16);
    }

    public final String c() {
        return this.f116225f;
    }

    public final String d() {
        return this.f116221a;
    }

    public final String e() {
        return this.f116222b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f116221a, r52.f116221a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f116222b, r52.f116222b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f116223c, r52.f116223c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f116224e, r52.f116224e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f116225f, r52.f116225f) == true) goto L27;
        return false;
    L27:
        if (this.f116226g == r52.f116226g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f116224e;
    }

    public final boolean g() {
        return this.f116226g;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.f116221a.hashCode() * 31) + this.f116222b.hashCode()) * 31) + this.f116223c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f116224e.hashCode()) * 31) + this.f116225f.hashCode()) * 31) + Boolean.hashCode(this.f116226g);
    }

    public final String i() {
        return this.f116223c;
    }

    public String toString() {
        return "SellShareTradeUiState(orderId=" + this.f116221a + ", orderPrice=" + this.f116222b + ", triggerPrice=" + this.f116223c + ", symbol=" + this.d + ", orderedAmount=" + this.f116224e + ", lot=" + this.f116225f + ", sendPrice=" + this.f116226g + ')';
    }

    public /* synthetic */ j(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = true;
    L23:
        boolean r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92);
    }
}
