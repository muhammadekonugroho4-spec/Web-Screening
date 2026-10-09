package com.stockbit.usecase.chat.model.group;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f155545a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155547c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155548e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f155549f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f155550g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f155551h;

    public f(int r2, String r3, String r4, String r5, int r6, boolean r7, boolean r8, boolean r9) {
        p.l(r3, "username");
        p.l(r4, "fullName");
        p.l(r5, "avatar");
        this.f155545a = r2;
        this.f155546b = r3;
        this.f155547c = r4;
        this.d = r5;
        this.f155548e = r6;
        this.f155549f = r7;
        this.f155550g = r8;
        this.f155551h = r9;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f155547c;
    }

    public final int c() {
        return this.f155548e;
    }

    public final int d() {
        return this.f155545a;
    }

    public final String e() {
        return this.f155546b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f155545a == r52.f155545a) goto L12;
        return false;
    L12:
        if (p.g(this.f155546b, r52.f155546b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155547c, r52.f155547c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155548e == r52.f155548e) goto L24;
        return false;
    L24:
        if (this.f155549f == r52.f155549f) goto L27;
        return false;
    L27:
        if (this.f155550g == r52.f155550g) goto L30;
        return false;
    L30:
        if (this.f155551h == r52.f155551h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f155550g;
    }

    public final boolean g() {
        return this.f155551h;
    }

    public final boolean h() {
        return this.f155549f;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f155545a) * 31) + this.f155546b.hashCode()) * 31) + this.f155547c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f155548e)) * 31) + Boolean.hashCode(this.f155549f)) * 31) + Boolean.hashCode(this.f155550g)) * 31) + Boolean.hashCode(this.f155551h);
    }

    public String toString() {
        return "GroupUserUIState(userId=" + this.f155545a + ", username=" + this.f155546b + ", fullName=" + this.f155547c + ", avatar=" + this.d + ", memberId=" + this.f155548e + ", isVerified=" + this.f155549f + ", isAdmin=" + this.f155550g + ", isMe=" + this.f155551h + ")";
    }
}
