package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f86666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86668c;
    public final int d;

    public o(int r1, int r2, int r3, int r4) {
        this.f86666a = r1;
        this.f86667b = r2;
        this.f86668c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.f86667b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f86668c;
    }

    public final int d() {
        return this.f86666a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (this.f86666a == r52.f86666a) goto L12;
        return false;
    L12:
        if (this.f86667b == r52.f86667b) goto L15;
        return false;
    L15:
        if (this.f86668c == r52.f86668c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f86666a) * 31) + Integer.hashCode(this.f86667b)) * 31) + Integer.hashCode(this.f86668c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "UserAdditionalInfoEntity(reputations=" + this.f86666a + ", followers=" + this.f86667b + ", ideas=" + this.f86668c + ", followings=" + this.d + ")";
    }

    public /* synthetic */ o(int r2, int r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
