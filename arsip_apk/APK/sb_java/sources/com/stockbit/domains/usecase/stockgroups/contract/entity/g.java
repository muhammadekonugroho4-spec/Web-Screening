package com.stockbit.domains.usecase.stockgroups.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f88429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88431c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88432e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88433f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88434g;

    /* renamed from: h, reason: collision with root package name */
    public final double f88435h;

    /* renamed from: i, reason: collision with root package name */
    public final String f88436i;

    /* renamed from: j, reason: collision with root package name */
    public final String f88437j;

    public g(String r2, String r3, String r4, int r5, int r6, String r7, String r8, double r9, String r11, String r12) {
        p.l(r2, "code");
        p.l(r3, "imageUrl");
        p.l(r4, "groupName");
        p.l(r7, "value");
        p.l(r8, "catalogId");
        p.l(r11, "volume");
        p.l(r12, "freq");
        this.f88429a = r2;
        this.f88430b = r3;
        this.f88431c = r4;
        this.d = r5;
        this.f88432e = r6;
        this.f88433f = r7;
        this.f88434g = r8;
        this.f88435h = r9;
        this.f88436i = r11;
        this.f88437j = r12;
    }

    public static /* synthetic */ g b(g r02, String r1, String r2, String r3, int r4, int r5, String r6, String r7, double r8, String r10, String r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r02.f88429a;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r02.f88430b;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r02.f88431c;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r02.f88432e;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r02.f88433f;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r02.f88434g;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r02.f88435h;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = r02.f88436i;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = r02.f88437j;
    L32:
        double r102 = r8;
        String r82 = r6;
        String r9 = r7;
        int r62 = r4;
        int r72 = r5;
        String r42 = r2;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r42, r52, r62, r72, r82, r9, r102, r10, r11);
    }

    public final g a(String r14, String r15, String r16, int r17, int r18, String r19, String r20, double r21, String r23, String r24) {
        p.l(r14, "code");
        p.l(r15, "imageUrl");
        p.l(r16, "groupName");
        p.l(r19, "value");
        p.l(r20, "catalogId");
        p.l(r23, "volume");
        p.l(r24, "freq");
        return new g(r14, r15, r16, r17, r18, r19, r20, r21, r23, r24);
    }

    public final String c() {
        return this.f88434g;
    }

    public final String d() {
        return this.f88429a;
    }

    public final String e() {
        return this.f88437j;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (p.g(this.f88429a, r82.f88429a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88430b, r82.f88430b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88431c, r82.f88431c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f88432e == r82.f88432e) goto L24;
        return false;
    L24:
        if (p.g(this.f88433f, r82.f88433f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f88434g, r82.f88434g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f88435h, r82.f88435h) == 0) goto L33;
        return false;
    L33:
        if (p.g(this.f88436i, r82.f88436i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f88437j, r82.f88437j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f88431c;
    }

    public final String g() {
        return this.f88430b;
    }

    public final double h() {
        return this.f88435h;
    }

    public int hashCode() {
        return (((((((((((((((((this.f88429a.hashCode() * 31) + this.f88430b.hashCode()) * 31) + this.f88431c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f88432e)) * 31) + this.f88433f.hashCode()) * 31) + this.f88434g.hashCode()) * 31) + Double.hashCode(this.f88435h)) * 31) + this.f88436i.hashCode()) * 31) + this.f88437j.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final int j() {
        return this.f88432e;
    }

    public final String k() {
        return this.f88433f;
    }

    public final String l() {
        return this.f88436i;
    }

    public String toString() {
        return "StockGroupsSectionItemEntity(code=" + this.f88429a + ", imageUrl=" + this.f88430b + ", groupName=" + this.f88431c + ", totalGainerStocks=" + this.d + ", totalLoserStocks=" + this.f88432e + ", value=" + this.f88433f + ", catalogId=" + this.f88434g + ", marketCapPercentage=" + this.f88435h + ", volume=" + this.f88436i + ", freq=" + this.f88437j + ")";
    }

    public /* synthetic */ g(String r2, String r3, String r4, int r5, int r6, String r7, String r8, double r9, String r11, String r12, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 256) == 0) goto L6;
        r11 = "";
    L6:
        if ((r13 & 512) == 0) goto L9;
        String r132 = "";
    L10:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r11, r132);
        return;
    L9:
        r132 = r12;
        goto L10
    }
}
