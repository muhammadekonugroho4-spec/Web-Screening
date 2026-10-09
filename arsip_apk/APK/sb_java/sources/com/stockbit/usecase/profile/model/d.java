package com.stockbit.usecase.profile.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f159468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f159469b;

    /* renamed from: c, reason: collision with root package name */
    public final List f159470c;

    public d(List r2, int r3, List r4) {
        p.l(r2, "users");
        p.l(r4, "followedByText");
        this.f159468a = r2;
        this.f159469b = r3;
        this.f159470c = r4;
    }

    public final List a() {
        return this.f159470c;
    }

    public final int b() {
        return this.f159469b;
    }

    public final List c() {
        return this.f159468a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f159468a, r52.f159468a) == true) goto L12;
        return false;
    L12:
        if (this.f159469b == r52.f159469b) goto L15;
        return false;
    L15:
        if (p.g(this.f159470c, r52.f159470c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f159468a.hashCode() * 31) + Integer.hashCode(this.f159469b)) * 31) + this.f159470c.hashCode();
    }

    public String toString() {
        return "FollowedByUIState(users=" + this.f159468a + ", totalFollower=" + this.f159469b + ", followedByText=" + this.f159470c + ')';
    }
}
