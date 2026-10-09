package com.stockbit.domain.model.search;

import com.stockbit.domain.model.profile.VerifiedStatusType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84916c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84917e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84918f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f84919g;

    /* renamed from: h, reason: collision with root package name */
    public final VerifiedStatusType f84920h;

    public a(String r2, String r3, String r4, String r5, int r6, boolean r7, Boolean r8, VerifiedStatusType r9) {
        p.l(r2, "userId");
        p.l(r3, "fullName");
        p.l(r4, "userName");
        p.l(r5, "avatar");
        p.l(r9, "verifiedStatusType");
        this.f84914a = r2;
        this.f84915b = r3;
        this.f84916c = r4;
        this.d = r5;
        this.f84917e = r6;
        this.f84918f = r7;
        this.f84919g = r8;
        this.f84920h = r9;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.f84917e;
    }

    public final String c() {
        return this.f84915b;
    }

    public final String d() {
        return this.f84914a;
    }

    public final String e() {
        return this.f84916c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84914a, r52.f84914a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84915b, r52.f84915b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84916c, r52.f84916c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f84917e == r52.f84917e) goto L24;
        return false;
    L24:
        if (this.f84918f == r52.f84918f) goto L27;
        return false;
    L27:
        if (p.g(this.f84919g, r52.f84919g) == true) goto L30;
        return false;
    L30:
        if (this.f84920h == r52.f84920h) goto L32;
        return false;
    L32:
        return true;
    }

    public final VerifiedStatusType f() {
        return this.f84920h;
    }

    public final Boolean g() {
        return this.f84919g;
    }

    public final boolean h() {
        return this.f84918f;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f84914a.hashCode() * 31) + this.f84915b.hashCode()) * 31) + this.f84916c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f84917e)) * 31) + Boolean.hashCode(this.f84918f)) * 31;
        Boolean r1 = this.f84919g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f84920h.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DiscoverTrendingEntity(userId=" + this.f84914a + ", fullName=" + this.f84915b + ", userName=" + this.f84916c + ", avatar=" + this.d + ", followerCount=" + this.f84917e + ", isVerified=" + this.f84918f + ", isFollowing=" + this.f84919g + ", verifiedStatusType=" + this.f84920h + ")";
    }
}
