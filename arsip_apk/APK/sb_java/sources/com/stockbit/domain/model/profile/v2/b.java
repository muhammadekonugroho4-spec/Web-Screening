package com.stockbit.domain.model.profile.v2;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84800a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84801b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84802c;
    public final String d;

    public b(boolean r2, boolean r3, boolean r4, String r5) {
        p.l(r5, "trendingLabel");
        this.f84800a = r2;
        this.f84801b = r3;
        this.f84802c = r4;
        this.d = r5;
    }

    public final boolean a() {
        return this.f84801b;
    }

    public final boolean b() {
        return this.f84802c;
    }

    public final boolean c() {
        return this.f84800a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f84800a == r52.f84800a) goto L12;
        return false;
    L12:
        if (this.f84801b == r52.f84801b) goto L15;
        return false;
    L15:
        if (this.f84802c == r52.f84802c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f84800a) * 31) + Boolean.hashCode(this.f84801b)) * 31) + Boolean.hashCode(this.f84802c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MyProfileBadgeEntity(isVerified=" + this.f84800a + ", isTop=" + this.f84801b + ", isTrending=" + this.f84802c + ", trendingLabel=" + this.d + ")";
    }

    public /* synthetic */ b(boolean r2, boolean r3, boolean r4, String r5, int r6, kotlin.jvm.internal.i r7) {
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
