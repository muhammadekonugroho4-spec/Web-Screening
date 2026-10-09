package com.stockbit.domain.model.securities.common;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f85098a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85099b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85100c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85101e;

    /* renamed from: f, reason: collision with root package name */
    public final long f85102f;

    public j(int r2, int r3, String r4, String r5, int r6, long r7) {
        p.l(r4, "tradingClose");
        p.l(r5, "tradingOpen");
        this.f85098a = r2;
        this.f85099b = r3;
        this.f85100c = r4;
        this.d = r5;
        this.f85101e = r6;
        this.f85102f = r7;
    }

    public final long a() {
        return this.f85102f;
    }

    public final int b() {
        return this.f85101e;
    }

    public final int c() {
        return this.f85098a;
    }

    public final int d() {
        return this.f85099b;
    }

    public final String e() {
        return this.f85100c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof j) == true) goto L8;
        return false;
    L8:
        j r82 = (j) r8;
        if (this.f85098a == r82.f85098a) goto L12;
        return false;
    L12:
        if (this.f85099b == r82.f85099b) goto L15;
        return false;
    L15:
        if (p.g(this.f85100c, r82.f85100c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f85101e == r82.f85101e) goto L24;
        return false;
    L24:
        if (this.f85102f == r82.f85102f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f85098a) * 31) + Integer.hashCode(this.f85099b)) * 31) + this.f85100c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f85101e)) * 31) + Long.hashCode(this.f85102f);
    }

    public String toString() {
        return "SplitOrderInfoEntity(remainingTradingClose=" + this.f85098a + ", remainingTradingOpen=" + this.f85099b + ", tradingClose=" + this.f85100c + ", tradingOpen=" + this.d + ", maxOrder=" + this.f85101e + ", maxLotPerOrder=" + this.f85102f + ")";
    }
}
