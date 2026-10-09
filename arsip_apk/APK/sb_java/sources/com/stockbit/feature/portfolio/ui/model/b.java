package com.stockbit.feature.portfolio.ui.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f106381a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106382b;

    static {
    }

    public b(String r2, boolean r3) {
        p.l(r2, "value");
        this.f106381a = r2;
        this.f106382b = r3;
    }

    public static /* synthetic */ b b(b r02, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f106381a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f106382b;
    L9:
        return r02.a(r1, r2);
    }

    public final b a(String r2, boolean r3) {
        p.l(r2, "value");
        return new b(r2, r3);
    }

    public final String c() {
        return this.f106381a;
    }

    public final boolean d() {
        return this.f106382b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f106381a, r52.f106381a) == true) goto L12;
        return false;
    L12:
        if (this.f106382b == r52.f106382b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f106381a.hashCode() * 31) + Boolean.hashCode(this.f106382b);
    }

    public String toString() {
        return "PortfolioFilterItem(value=" + this.f106381a + ", isActive=" + this.f106382b + ')';
    }

    public /* synthetic */ b(String r1, boolean r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
