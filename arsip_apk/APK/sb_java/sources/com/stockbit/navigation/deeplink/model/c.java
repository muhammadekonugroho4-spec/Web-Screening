package com.stockbit.navigation.deeplink.model;

import kotlin.jvm.functions.r;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.navigation.deeplink.annotation.a f122460a;

    /* renamed from: b, reason: collision with root package name */
    public final r f122461b;

    public c(com.stockbit.navigation.deeplink.annotation.a r2, r r3) {
        p.l(r2, "deeplink");
        p.l(r3, "closure");
        this.f122460a = r2;
        this.f122461b = r3;
    }

    public final r a() {
        return this.f122461b;
    }

    public final com.stockbit.navigation.deeplink.annotation.a b() {
        return this.f122460a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f122460a, r52.f122460a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122461b, r52.f122461b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f122460a.hashCode() * 31) + this.f122461b.hashCode();
    }

    public String toString() {
        return "DeeplinkSignal(deeplink=" + this.f122460a + ", closure=" + this.f122461b + ')';
    }
}
