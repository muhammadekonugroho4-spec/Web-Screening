package com.stockbit.domain.model.requestparam;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f84862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84863b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84864c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84865e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84866f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84867g;

    public a(int r2, int r3, String r4, int r5, int r6, boolean r7, boolean r8) {
        p.l(r4, "reason");
        this.f84862a = r2;
        this.f84863b = r3;
        this.f84864c = r4;
        this.d = r5;
        this.f84865e = r6;
        this.f84866f = r7;
        this.f84867g = r8;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.f84864c;
    }

    public final int c() {
        return this.f84865e;
    }

    public final int d() {
        return this.f84862a;
    }

    public final int e() {
        return this.f84863b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f84862a == r52.f84862a) goto L12;
        return false;
    L12:
        if (this.f84863b == r52.f84863b) goto L15;
        return false;
    L15:
        if (p.g(this.f84864c, r52.f84864c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f84865e == r52.f84865e) goto L24;
        return false;
    L24:
        if (this.f84866f == r52.f84866f) goto L27;
        return false;
    L27:
        if (this.f84867g == r52.f84867g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f84867g;
    }

    public final boolean g() {
        return this.f84866f;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f84862a) * 31) + Integer.hashCode(this.f84863b)) * 31) + this.f84864c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f84865e)) * 31) + Boolean.hashCode(this.f84866f)) * 31) + Boolean.hashCode(this.f84867g);
    }

    public String toString() {
        return "UserSuspendRequestParams(type=" + this.f84862a + ", userId=" + this.f84863b + ", reason=" + this.f84864c + ", days=" + this.d + ", streamId=" + this.f84865e + ", isSendEmail=" + this.f84866f + ", isBlockIp=" + this.f84867g + ')';
    }
}
