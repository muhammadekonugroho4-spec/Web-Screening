package com.stockbit.domain.model.follower;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84055b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84056c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84057e;

    public a(String r2, int r3, String r4, String r5, String r6) {
        p.l(r2, "userId");
        p.l(r4, "avatar");
        p.l(r5, "username");
        p.l(r6, "fullname");
        this.f84054a = r2;
        this.f84055b = r3;
        this.f84056c = r4;
        this.d = r5;
        this.f84057e = r6;
    }

    public final int a() {
        return this.f84055b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84054a, r52.f84054a) == true) goto L12;
        return false;
    L12:
        if (this.f84055b == r52.f84055b) goto L15;
        return false;
    L15:
        if (p.g(this.f84056c, r52.f84056c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84057e, r52.f84057e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f84054a.hashCode() * 31) + Integer.hashCode(this.f84055b)) * 31) + this.f84056c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84057e.hashCode();
    }

    public String toString() {
        return "FollowPeopleEntity(userId=" + this.f84054a + ", alert=" + this.f84055b + ", avatar=" + this.f84056c + ", username=" + this.d + ", fullname=" + this.f84057e + ")";
    }
}
