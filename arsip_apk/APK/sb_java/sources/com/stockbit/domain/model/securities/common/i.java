package com.stockbit.domain.model.securities.common;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f85093a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85094b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85095c;
    public final int d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f85096a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85097b;

        public a(int r1, int r2) {
            this.f85096a = r1;
            this.f85097b = r2;
        }

        public final int a() {
            return this.f85096a;
        }

        public final int b() {
            return this.f85097b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f85096a == r52.f85096a) goto L12;
            return false;
        L12:
            if (this.f85097b == r52.f85097b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f85096a) * 31) + Integer.hashCode(this.f85097b);
        }

        public String toString() {
            return "SoftLimit(phaseOne=" + this.f85096a + ", phaseTwo=" + this.f85097b + ")";
        }
    }

    public i(a r2, int r3, int r4, int r5) {
        p.l(r2, "softLimit");
        this.f85093a = r2;
        this.f85094b = r3;
        this.f85095c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f85094b;
    }

    public final a b() {
        return this.f85093a;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.f85095c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f85093a, r52.f85093a) == true) goto L12;
        return false;
    L12:
        if (this.f85094b == r52.f85094b) goto L15;
        return false;
    L15:
        if (this.f85095c == r52.f85095c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85093a.hashCode() * 31) + Integer.hashCode(this.f85094b)) * 31) + Integer.hashCode(this.f85095c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "OrderCountLimitEntity(softLimit=" + this.f85093a + ", hardLimit=" + this.f85094b + ", userOrderCount=" + this.f85095c + ", userDayTradeOrderCount=" + this.d + ")";
    }
}
