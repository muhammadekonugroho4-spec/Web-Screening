package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f81238a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81240c;
    public final int d;

    public n(int r1, int r2, int r3, int r4) {
        this.f81238a = r1;
        this.f81239b = r2;
        this.f81240c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.f81240c;
    }

    public final int c() {
        return this.f81238a;
    }

    public final int d() {
        return this.f81239b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (this.f81238a == r52.f81238a) goto L12;
        return false;
    L12:
        if (this.f81239b == r52.f81239b) goto L15;
        return false;
    L15:
        if (this.f81240c == r52.f81240c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f81238a) * 31) + Integer.hashCode(this.f81239b)) * 31) + Integer.hashCode(this.f81240c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "MemberStatsEntity(capacity=" + this.f81238a + ", current=" + this.f81239b + ", available=" + this.f81240c + ", active=" + this.d + ")";
    }
}
