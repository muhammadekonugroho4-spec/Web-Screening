package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85330a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85332c;

    public k(boolean r1, boolean r2, boolean r3) {
        this.f85330a = r1;
        this.f85331b = r2;
        this.f85332c = r3;
    }

    public final boolean a() {
        return this.f85330a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (this.f85330a == r52.f85330a) goto L12;
        return false;
    L12:
        if (this.f85331b == r52.f85331b) goto L15;
        return false;
    L15:
        if (this.f85332c == r52.f85332c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f85330a) * 31) + Boolean.hashCode(this.f85331b)) * 31) + Boolean.hashCode(this.f85332c);
    }

    public String toString() {
        return "MarginBoardTradableEntity(isRegular=" + this.f85330a + ", isTunai=" + this.f85331b + ", isNego=" + this.f85332c + ")";
    }
}
