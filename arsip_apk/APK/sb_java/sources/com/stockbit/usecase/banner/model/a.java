package com.stockbit.usecase.banner.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f154395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154396b;

    public a(String r2, String r3) {
        p.l(r2, "heading");
        p.l(r3, "body");
        this.f154395a = r2;
        this.f154396b = r3;
    }

    public final String a() {
        return this.f154396b;
    }

    public final String b() {
        return this.f154395a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f154395a, r52.f154395a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154396b, r52.f154396b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154395a.hashCode() * 31) + this.f154396b.hashCode();
    }

    public String toString() {
        return "BannerContentUIState(heading=" + this.f154395a + ", body=" + this.f154396b + ")";
    }
}
