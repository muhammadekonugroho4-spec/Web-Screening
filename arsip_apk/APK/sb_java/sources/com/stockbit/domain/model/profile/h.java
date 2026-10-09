package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84673a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84675c;
    public final String d;

    public h(boolean r2, boolean r3, boolean r4, String r5) {
        kotlin.jvm.internal.p.l(r5, "trendingLabel");
        this.f84673a = r2;
        this.f84674b = r3;
        this.f84675c = r4;
        this.d = r5;
    }

    public final boolean a() {
        return this.f84674b;
    }

    public final boolean b() {
        return this.f84675c;
    }

    public final boolean c() {
        return this.f84673a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f84673a == r52.f84673a) goto L12;
        return false;
    L12:
        if (this.f84674b == r52.f84674b) goto L15;
        return false;
    L15:
        if (this.f84675c == r52.f84675c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f84673a) * 31) + Boolean.hashCode(this.f84674b)) * 31) + Boolean.hashCode(this.f84675c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ProfileBadgesEntity(isVerified=" + this.f84673a + ", isTop=" + this.f84674b + ", isTrending=" + this.f84675c + ", trendingLabel=" + this.d + ")";
    }

    public /* synthetic */ h(boolean r2, boolean r3, boolean r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
