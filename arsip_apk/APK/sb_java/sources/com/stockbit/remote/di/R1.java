package com.stockbit.remote.di;

import kotlin.Pair;

/* loaded from: classes10.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f129392a;

    /* renamed from: b, reason: collision with root package name */
    public final Pair f129393b;

    public R1(String r2, Pair r3) {
        kotlin.jvm.internal.p.l(r2, "endpoint");
        kotlin.jvm.internal.p.l(r3, "duration");
        this.f129392a = r2;
        this.f129393b = r3;
    }

    public final Pair a() {
        return this.f129393b;
    }

    public final String b() {
        return this.f129392a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof R1) == true) goto L8;
        return false;
    L8:
        R1 r52 = (R1) r5;
        if (kotlin.jvm.internal.p.g(this.f129392a, r52.f129392a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f129393b, r52.f129393b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f129392a.hashCode() * 31) + this.f129393b.hashCode();
    }

    public String toString() {
        return "EndpointCacheConfig(endpoint=" + this.f129392a + ", duration=" + this.f129393b + ')';
    }
}
