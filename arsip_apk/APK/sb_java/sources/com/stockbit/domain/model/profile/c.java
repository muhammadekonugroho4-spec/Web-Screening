package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84639a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84640b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84641c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84642e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84643f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84644g;

    public c(boolean r2, boolean r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r4, "realPhone");
        kotlin.jvm.internal.p.l(r5, "userAvatar");
        kotlin.jvm.internal.p.l(r6, "userFullname");
        kotlin.jvm.internal.p.l(r7, "userId");
        kotlin.jvm.internal.p.l(r8, "username");
        this.f84639a = r2;
        this.f84640b = r3;
        this.f84641c = r4;
        this.d = r5;
        this.f84642e = r6;
        this.f84643f = r7;
        this.f84644g = r8;
    }

    public final boolean a() {
        return this.f84639a;
    }

    public final String b() {
        return this.f84641c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f84642e;
    }

    public final String e() {
        return this.f84643f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f84639a == r52.f84639a) goto L12;
        return false;
    L12:
        if (this.f84640b == r52.f84640b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84641c, r52.f84641c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84642e, r52.f84642e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84643f, r52.f84643f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f84644g, r52.f84644g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f84644g;
    }

    public final boolean g() {
        return this.f84640b;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f84639a) * 31) + Boolean.hashCode(this.f84640b)) * 31) + this.f84641c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84642e.hashCode()) * 31) + this.f84643f.hashCode()) * 31) + this.f84644g.hashCode();
    }

    public String toString() {
        return "FollowedByEntity(follow=" + this.f84639a + ", isVerified=" + this.f84640b + ", realPhone=" + this.f84641c + ", userAvatar=" + this.d + ", userFullname=" + this.f84642e + ", userId=" + this.f84643f + ", username=" + this.f84644g + ")";
    }
}
