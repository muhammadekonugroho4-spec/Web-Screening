package com.stockbit.domain.param.login;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87403b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87404c;

    public a(String r2, String r3, String r4) {
        p.l(r2, "facebookId");
        p.l(r3, "facebookAccessToken");
        this.f87402a = r2;
        this.f87403b = r3;
        this.f87404c = r4;
    }

    public final String a() {
        return this.f87403b;
    }

    public final String b() {
        return this.f87402a;
    }

    public final String c() {
        return this.f87404c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87402a, r52.f87402a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87403b, r52.f87403b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87404c, r52.f87404c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87402a.hashCode() * 31) + this.f87403b.hashCode()) * 31;
        String r1 = this.f87404c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LoginFacebookDomainParam(facebookId=" + this.f87402a + ", facebookAccessToken=" + this.f87403b + ", playerId=" + this.f87404c + ")";
    }
}
