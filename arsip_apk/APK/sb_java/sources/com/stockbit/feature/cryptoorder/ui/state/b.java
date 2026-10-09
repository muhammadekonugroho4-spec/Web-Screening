package com.stockbit.feature.cryptoorder.ui.state;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f94580a;

    /* renamed from: b, reason: collision with root package name */
    public final d f94581b;

    /* renamed from: c, reason: collision with root package name */
    public final i f94582c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94583e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f94584f;

    static {
    }

    public b(j r2, d r3, i r4, boolean r5, String r6, boolean r7) {
        p.l(r2, "orderSection");
        p.l(r4, "portfolio");
        this.f94580a = r2;
        this.f94581b = r3;
        this.f94582c = r4;
        this.d = r5;
        this.f94583e = r6;
        this.f94584f = r7;
    }

    public static /* synthetic */ b b(b r02, j r1, d r2, i r3, boolean r4, String r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f94580a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f94581b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f94582c;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.f94583e;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.f94584f;
    L20:
        String r72 = r5;
        boolean r82 = r6;
        i r52 = r3;
        boolean r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82);
    }

    public final b a(j r9, d r10, i r11, boolean r12, String r13, boolean r14) {
        p.l(r9, "orderSection");
        p.l(r11, "portfolio");
        return new b(r9, r10, r11, r12, r13, r14);
    }

    public final d c() {
        return this.f94581b;
    }

    public final j d() {
        return this.f94580a;
    }

    public final i e() {
        return this.f94582c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f94580a, r52.f94580a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94581b, r52.f94581b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94582c, r52.f94582c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f94583e, r52.f94583e) == true) goto L24;
        return false;
    L24:
        if (this.f94584f == r52.f94584f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f94583e;
    }

    public final boolean g() {
        return this.f94584f;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = this.f94580a.hashCode() * 31;
        d r1 = this.f94581b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((((r02 + r12) * 31) + this.f94582c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
        String r13 = this.f94583e;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Boolean.hashCode(this.f94584f);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoOrderDetailUIData(orderSection=" + this.f94580a + ", doneSection=" + this.f94581b + ", portfolio=" + this.f94582c + ", isRejected=" + this.d + ", rejectReason=" + this.f94583e + ", showBottomButtons=" + this.f94584f + ')';
    }
}
