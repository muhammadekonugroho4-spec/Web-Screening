package com.stockbit.networktroubleshoot.model;

import java.util.Map;
import kotlin.collections.S;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f122671a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f122672b;

    public b(Map r2, Map r3) {
        p.l(r2, "endpointLoads");
        p.l(r3, "pingResults");
        this.f122671a = r2;
        this.f122672b = r3;
    }

    public static /* synthetic */ b b(b r02, Map r1, Map r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f122671a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f122672b;
    L9:
        return r02.a(r1, r2);
    }

    public final b a(Map r2, Map r3) {
        p.l(r2, "endpointLoads");
        p.l(r3, "pingResults");
        return new b(r2, r3);
    }

    public final Map c() {
        return this.f122671a;
    }

    public final Map d() {
        return this.f122672b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f122671a, r52.f122671a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122672b, r52.f122672b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f122671a.hashCode() * 31) + this.f122672b.hashCode();
    }

    public String toString() {
        return "ScreenNetworkData(endpointLoads=" + this.f122671a + ", pingResults=" + this.f122672b + ')';
    }

    public /* synthetic */ b(Map r1, Map r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = S.j();
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = S.j();
    L8:
        this(r1, r2);
    }
}
