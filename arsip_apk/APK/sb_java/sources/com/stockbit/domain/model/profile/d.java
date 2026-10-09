package com.stockbit.domain.model.profile;

import java.util.List;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f84645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84646b;

    public d(List r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "user");
        this.f84645a = r2;
        this.f84646b = r3;
    }

    public final int a() {
        return this.f84646b;
    }

    public final List b() {
        return this.f84645a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f84645a, r52.f84645a) == true) goto L12;
        return false;
    L12:
        if (this.f84646b == r52.f84646b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84645a.hashCode() * 31) + Integer.hashCode(this.f84646b);
    }

    public String toString() {
        return "FollowedBysEntity(user=" + this.f84645a + ", totalFollower=" + this.f84646b + ")";
    }
}
