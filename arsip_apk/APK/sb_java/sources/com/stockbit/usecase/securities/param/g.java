package com.stockbit.usecase.securities.param;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f161962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f161963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f161964c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161965e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161966f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161967g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161968h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161969i;

    public g(String r2, int r3, int r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "period");
        p.l(r5, "start");
        p.l(r6, "end");
        this.f161962a = r2;
        this.f161963b = r3;
        this.f161964c = r4;
        this.d = r5;
        this.f161965e = r6;
        this.f161966f = r7;
        this.f161967g = r8;
        this.f161968h = r9;
        this.f161969i = r10;
    }

    public static /* synthetic */ g b(g r02, String r1, int r2, int r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f161962a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f161963b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.f161964c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r02.f161965e;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r02.f161966f;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r02.f161967g;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r02.f161968h;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r02.f161969i;
    L29:
        String r102 = r8;
        String r112 = r9;
        String r82 = r6;
        String r92 = r7;
        String r62 = r4;
        String r72 = r5;
        int r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112);
    }

    public final g a(String r12, int r13, int r14, String r15, String r16, String r17, String r18, String r19, String r20) {
        p.l(r12, "period");
        p.l(r15, "start");
        p.l(r16, "end");
        return new g(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public final String c() {
        return this.f161966f;
    }

    public final String d() {
        return this.f161968h;
    }

    public final String e() {
        return this.f161965e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f161962a, r52.f161962a) == true) goto L12;
        return false;
    L12:
        if (this.f161963b == r52.f161963b) goto L15;
        return false;
    L15:
        if (this.f161964c == r52.f161964c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f161965e, r52.f161965e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f161966f, r52.f161966f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f161967g, r52.f161967g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f161968h, r52.f161968h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f161969i, r52.f161969i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f161967g;
    }

    public final int g() {
        return this.f161963b;
    }

    public final int h() {
        return this.f161964c;
    }

    public int hashCode() {
        int r02 = ((((((((this.f161962a.hashCode() * 31) + Integer.hashCode(this.f161963b)) * 31) + Integer.hashCode(this.f161964c)) * 31) + this.d.hashCode()) * 31) + this.f161965e.hashCode()) * 31;
        String r1 = this.f161966f;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f161967g;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f161968h;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f161969i;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f161962a;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f161969i;
    }

    public String toString() {
        return "GetTradingHistoryParam(period=" + this.f161962a + ", limit=" + this.f161963b + ", page=" + this.f161964c + ", start=" + this.d + ", end=" + this.f161965e + ", action=" + this.f161966f + ", keyword=" + this.f161967g + ", cursor=" + this.f161968h + ", stock=" + this.f161969i + ")";
    }

    public /* synthetic */ g(String r2, int r3, int r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 25;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = null;
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
