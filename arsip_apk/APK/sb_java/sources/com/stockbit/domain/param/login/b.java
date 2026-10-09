package com.stockbit.domain.param.login;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87405a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87406b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87407c;

    public b(String r2, String r3, String r4) {
        p.l(r2, "googleId");
        p.l(r3, "googleToken");
        this.f87405a = r2;
        this.f87406b = r3;
        this.f87407c = r4;
    }

    public final String a() {
        return this.f87405a;
    }

    public final String b() {
        return this.f87406b;
    }

    public final String c() {
        return this.f87407c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87405a, r52.f87405a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87406b, r52.f87406b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87407c, r52.f87407c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87405a.hashCode() * 31) + this.f87406b.hashCode()) * 31;
        String r1 = this.f87407c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LoginGoogleDomainParam(googleId=" + this.f87405a + ", googleToken=" + this.f87406b + ", playerId=" + this.f87407c + ")";
    }
}
