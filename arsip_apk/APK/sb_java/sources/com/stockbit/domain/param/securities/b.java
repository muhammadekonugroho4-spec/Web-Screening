package com.stockbit.domain.param.securities;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f87460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87462c;
    public final int d;

    public b(int r1, int r2, int r3, int r4) {
        this.f87460a = r1;
        this.f87461b = r2;
        this.f87462c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.f87461b;
    }

    public final int b() {
        return this.f87462c;
    }

    public final int c() {
        return this.f87460a;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f87460a == r52.f87460a) goto L12;
        return false;
    L12:
        if (this.f87461b == r52.f87461b) goto L15;
        return false;
    L15:
        if (this.f87462c == r52.f87462c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f87460a) * 31) + Integer.hashCode(this.f87461b)) * 31) + Integer.hashCode(this.f87462c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "GetOrderListDomainParam(price=" + this.f87460a + ", action=" + this.f87461b + ", boardType=" + this.f87462c + ", status=" + this.d + ")";
    }
}
