package com.stockbit.navigation.deeplink.model;

import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f122458a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f122459b;

    public b(boolean r2, Map r3) {
        p.l(r3, "dynamicPaths");
        this.f122458a = r2;
        this.f122459b = r3;
    }

    public final Map a() {
        return this.f122459b;
    }

    public final boolean b() {
        return this.f122458a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f122458a == r52.f122458a) goto L12;
        return false;
    L12:
        if (p.g(this.f122459b, r52.f122459b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f122458a) * 31) + this.f122459b.hashCode();
    }

    public String toString() {
        return "DeeplinkMatcher(isMatch=" + this.f122458a + ", dynamicPaths=" + this.f122459b + ')';
    }
}
