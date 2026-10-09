package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85727a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85728b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85729c;

    public q(boolean r1, boolean r2, boolean r3) {
        this.f85727a = r1;
        this.f85728b = r2;
        this.f85729c = r3;
    }

    public final boolean a() {
        return this.f85729c;
    }

    public final boolean b() {
        return this.f85727a;
    }

    public final boolean c() {
        return this.f85728b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f85727a == r52.f85727a) goto L12;
        return false;
    L12:
        if (this.f85728b == r52.f85728b) goto L15;
        return false;
    L15:
        if (this.f85729c == r52.f85729c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f85727a) * 31) + Boolean.hashCode(this.f85728b)) * 31) + Boolean.hashCode(this.f85729c);
    }

    public String toString() {
        return "StockBoardTradableEntity(isRegular=" + this.f85727a + ", isTunai=" + this.f85728b + ", isNego=" + this.f85729c + ")";
    }
}
