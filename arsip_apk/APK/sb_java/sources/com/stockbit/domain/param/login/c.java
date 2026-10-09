package com.stockbit.domain.param.login;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f87408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87409b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87410c;

    public c(String r2, String r3, String r4) {
        p.l(r2, "username");
        p.l(r3, "password");
        this.f87408a = r2;
        this.f87409b = r3;
        this.f87410c = r4;
    }

    public final String a() {
        return this.f87409b;
    }

    public final String b() {
        return this.f87410c;
    }

    public final String c() {
        return this.f87408a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f87408a, r52.f87408a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87409b, r52.f87409b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87410c, r52.f87410c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87408a.hashCode() * 31) + this.f87409b.hashCode()) * 31;
        String r1 = this.f87410c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LoginUsernamePasswordDomainParam(username=" + this.f87408a + ", password=" + this.f87409b + ", playerId=" + this.f87410c + ")";
    }
}
