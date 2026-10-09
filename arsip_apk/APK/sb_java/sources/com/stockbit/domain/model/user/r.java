package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86673a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86675c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86676e;

    public r(boolean r2, boolean r3, boolean r4, boolean r5, String r6) {
        kotlin.jvm.internal.p.l(r6, "verifiedStatus");
        this.f86673a = r2;
        this.f86674b = r3;
        this.f86675c = r4;
        this.d = r5;
        this.f86676e = r6;
    }

    public final String a() {
        return this.f86676e;
    }

    public final boolean b() {
        return this.f86674b;
    }

    public final boolean c() {
        return this.f86675c;
    }

    public final boolean d() {
        return this.f86673a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (this.f86673a == r52.f86673a) goto L12;
        return false;
    L12:
        if (this.f86674b == r52.f86674b) goto L15;
        return false;
    L15:
        if (this.f86675c == r52.f86675c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86676e, r52.f86676e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f86673a) * 31) + Boolean.hashCode(this.f86674b)) * 31) + Boolean.hashCode(this.f86675c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f86676e.hashCode();
    }

    public String toString() {
        return "UserSocialBadgeEntity(isVerified=" + this.f86673a + ", isTop=" + this.f86674b + ", isTrending=" + this.f86675c + ", isAdmin=" + this.d + ", verifiedStatus=" + this.f86676e + ")";
    }

    public /* synthetic */ r(boolean r2, boolean r3, boolean r4, boolean r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = "";
    L17:
        String r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72);
    }
}
