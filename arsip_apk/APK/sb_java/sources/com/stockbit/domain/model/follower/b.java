package com.stockbit.domain.model.follower;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f84058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84059b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84060c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84061e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84062f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84063g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84064h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84065i;

    /* renamed from: j, reason: collision with root package name */
    public final FollowerUIType f84066j;

    public b(long r2, String r4, String r5, String r6, boolean r7, boolean r8, String r9, int r10, boolean r11, FollowerUIType r12) {
        p.l(r4, "username");
        p.l(r5, "fullname");
        p.l(r6, "avatar");
        p.l(r9, "about");
        p.l(r12, "uiType");
        this.f84058a = r2;
        this.f84059b = r4;
        this.f84060c = r5;
        this.d = r6;
        this.f84061e = r7;
        this.f84062f = r8;
        this.f84063g = r9;
        this.f84064h = r10;
        this.f84065i = r11;
        this.f84066j = r12;
    }

    public final String a() {
        return this.f84063g;
    }

    public final boolean b() {
        return this.f84062f;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f84061e;
    }

    public final String e() {
        return this.f84060c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f84058a == r82.f84058a) goto L12;
        return false;
    L12:
        if (p.g(this.f84059b, r82.f84059b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84060c, r82.f84060c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f84061e == r82.f84061e) goto L24;
        return false;
    L24:
        if (this.f84062f == r82.f84062f) goto L27;
        return false;
    L27:
        if (p.g(this.f84063g, r82.f84063g) == true) goto L30;
        return false;
    L30:
        if (this.f84064h == r82.f84064h) goto L33;
        return false;
    L33:
        if (this.f84065i == r82.f84065i) goto L36;
        return false;
    L36:
        if (this.f84066j == r82.f84066j) goto L38;
        return false;
    L38:
        return true;
    }

    public final long f() {
        return this.f84058a;
    }

    public final int g() {
        return this.f84064h;
    }

    public final FollowerUIType h() {
        return this.f84066j;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.f84058a) * 31) + this.f84059b.hashCode()) * 31) + this.f84060c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f84061e)) * 31) + Boolean.hashCode(this.f84062f)) * 31) + this.f84063g.hashCode()) * 31) + Integer.hashCode(this.f84064h)) * 31) + Boolean.hashCode(this.f84065i)) * 31) + this.f84066j.hashCode();
    }

    public final String i() {
        return this.f84059b;
    }

    public final boolean j() {
        return this.f84065i;
    }

    public String toString() {
        return "FollowerEntity(id=" + this.f84058a + ", username=" + this.f84059b + ", fullname=" + this.f84060c + ", avatar=" + this.d + ", followed=" + this.f84061e + ", alert=" + this.f84062f + ", about=" + this.f84063g + ", official=" + this.f84064h + ", isVerified=" + this.f84065i + ", uiType=" + this.f84066j + ")";
    }
}
