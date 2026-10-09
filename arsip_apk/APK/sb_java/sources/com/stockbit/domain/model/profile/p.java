package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f84729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84730b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84731c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84732e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84733f;

    public p(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.f84729a = r1;
        this.f84730b = r2;
        this.f84731c = r3;
        this.d = r4;
        this.f84732e = r5;
        this.f84733f = r6;
    }

    public final int a() {
        return this.f84729a;
    }

    public final int b() {
        return this.f84730b;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.f84731c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (this.f84729a == r52.f84729a) goto L12;
        return false;
    L12:
        if (this.f84730b == r52.f84730b) goto L15;
        return false;
    L15:
        if (this.f84731c == r52.f84731c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f84732e == r52.f84732e) goto L24;
        return false;
    L24:
        if (this.f84733f == r52.f84733f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f84729a) * 31) + Integer.hashCode(this.f84730b)) * 31) + Integer.hashCode(this.f84731c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f84732e)) * 31) + Integer.hashCode(this.f84733f);
    }

    public String toString() {
        return "ProfileStatisticsEntity(followerCount=" + this.f84729a + ", followingCount=" + this.f84730b + ", reputationCount=" + this.f84731c + ", ideaCount=" + this.d + ", likeCount=" + this.f84732e + ", viewCount=" + this.f84733f + ")";
    }

    public /* synthetic */ p(int r2, int r3, int r4, int r5, int r6, int r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r82 = 0;
    L20:
        int r72 = r6;
        int r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
