package com.stockbit.feature.transaction.ui.amend.buy.compose.model;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f109375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f109376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f109377c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f109378e;

    static {
    }

    public i(int r1, int r2, int r3, int r4, int r5) {
        this.f109375a = r1;
        this.f109376b = r2;
        this.f109377c = r3;
        this.d = r4;
        this.f109378e = r5;
    }

    public final int a() {
        return this.f109378e;
    }

    public final int b() {
        return this.f109377c;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.f109376b;
    }

    public final int e() {
        return this.f109375a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f109375a == r52.f109375a) goto L12;
        return false;
    L12:
        if (this.f109376b == r52.f109376b) goto L15;
        return false;
    L15:
        if (this.f109377c == r52.f109377c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f109378e == r52.f109378e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f109375a) * 31) + Integer.hashCode(this.f109376b)) * 31) + Integer.hashCode(this.f109377c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f109378e);
    }

    public String toString() {
        return "OrderCountInfo(userOrderCount=" + this.f109375a + ", userDayTradeOrderCount=" + this.f109376b + ", softLimitPhaseOne=" + this.f109377c + ", softLimitPhaseTwo=" + this.d + ", hardLimit=" + this.f109378e + ')';
    }

    public /* synthetic */ i(int r2, int r3, int r4, int r5, int r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = Integer.MAX_VALUE;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = Integer.MAX_VALUE;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r72 = Integer.MAX_VALUE;
    L17:
        int r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
