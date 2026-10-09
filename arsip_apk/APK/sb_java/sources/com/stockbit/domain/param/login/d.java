package com.stockbit.domain.param.login;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f87411a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87412b;

    public d(String r2, String r3) {
        p.l(r2, "loginToken");
        p.l(r3, "appCheckToken");
        this.f87411a = r2;
        this.f87412b = r3;
    }

    public final String a() {
        return this.f87412b;
    }

    public final String b() {
        return this.f87411a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f87411a, r52.f87411a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87412b, r52.f87412b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f87411a.hashCode() * 31) + this.f87412b.hashCode();
    }

    public String toString() {
        return "VerifyUnfreezeDomainParam(loginToken=" + this.f87411a + ", appCheckToken=" + this.f87412b + ")";
    }
}
