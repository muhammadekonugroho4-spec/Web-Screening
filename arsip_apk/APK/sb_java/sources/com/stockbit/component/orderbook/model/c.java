package com.stockbit.component.orderbook.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f73044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73045b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73046c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final float f73047e;

    /* renamed from: f, reason: collision with root package name */
    public final OrderBookColor f73048f;

    /* renamed from: g, reason: collision with root package name */
    public final double f73049g;

    /* renamed from: h, reason: collision with root package name */
    public final double f73050h;

    static {
    }

    public c(String r2, String r3, String r4, double r5, float r7, OrderBookColor r8, double r9, double r11) {
        p.l(r2, "freq");
        p.l(r3, "lot");
        p.l(r4, "value");
        p.l(r8, Constants.KEY_COLOR);
        this.f73044a = r2;
        this.f73045b = r3;
        this.f73046c = r4;
        this.d = r5;
        this.f73047e = r7;
        this.f73048f = r8;
        this.f73049g = r9;
        this.f73050h = r11;
    }

    public static /* synthetic */ c b(c r02, String r1, String r2, String r3, double r4, float r6, OrderBookColor r7, double r8, double r10, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r02.f73044a;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r02.f73045b;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r02.f73046c;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = r02.f73047e;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = r02.f73048f;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = r02.f73049g;
    L24:
        if ((r12 & 128) == 0) goto L26;
        r10 = r02.f73050h;
    L26:
        double r122 = r10;
        double r102 = r8;
        double r62 = r4;
        String r42 = r2;
        String r5 = r3;
        String r32 = r1;
        return r02.a(r32, r42, r5, r62, r6, r7, r102, r122);
    }

    public final c a(String r14, String r15, String r16, double r17, float r19, OrderBookColor r20, double r21, double r23) {
        p.l(r14, "freq");
        p.l(r15, "lot");
        p.l(r16, "value");
        p.l(r20, Constants.KEY_COLOR);
        return new c(r14, r15, r16, r17, r19, r20, r21, r23);
    }

    public final OrderBookColor c() {
        return this.f73048f;
    }

    public final String d() {
        return this.f73044a;
    }

    public final double e() {
        return this.f73049g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f73044a, r82.f73044a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f73045b, r82.f73045b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73046c, r82.f73046c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f73047e, r82.f73047e) == 0) goto L24;
        return false;
    L24:
        if (this.f73048f == r82.f73048f) goto L27;
        return false;
    L27:
        if (Double.compare(this.f73049g, r82.f73049g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f73050h, r82.f73050h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final float f() {
        return this.f73047e;
    }

    public final String g() {
        return this.f73045b;
    }

    public final double h() {
        return this.f73050h;
    }

    public int hashCode() {
        return (((((((((((((this.f73044a.hashCode() * 31) + this.f73045b.hashCode()) * 31) + this.f73046c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + Float.hashCode(this.f73047e)) * 31) + this.f73048f.hashCode()) * 31) + Double.hashCode(this.f73049g)) * 31) + Double.hashCode(this.f73050h);
    }

    public final String i() {
        return this.f73046c;
    }

    public final double j() {
        return this.d;
    }

    public String toString() {
        return "OrderBookComposeBidAskUIState(freq=" + this.f73044a + ", lot=" + this.f73045b + ", value=" + this.f73046c + ", valueDouble=" + this.d + ", indicator=" + this.f73047e + ", color=" + this.f73048f + ", freqDouble=" + this.f73049g + ", lotDouble=" + this.f73050h + ')';
    }

    public /* synthetic */ c(String r3, String r4, String r5, double r6, float r8, OrderBookColor r9, double r10, double r12, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 8) == 0) goto L6;
        r6 = 0.0d;
    L6:
        if ((r14 & 64) == 0) goto L9;
        r10 = 0.0d;
    L9:
        if ((r14 & 128) == 0) goto L12;
        double r13 = 0.0d;
    L13:
        this(r3, r4, r5, r6, r8, r9, r10, r13);
        return;
    L12:
        r13 = r12;
        goto L13
    }
}
