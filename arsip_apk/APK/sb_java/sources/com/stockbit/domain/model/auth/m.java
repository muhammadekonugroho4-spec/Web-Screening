package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f80686a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80687b;

    public m(String r2, String r3) {
        p.l(r2, "token");
        p.l(r3, "expiredAt");
        this.f80686a = r2;
        this.f80687b = r3;
    }

    public final String a() {
        return this.f80687b;
    }

    public final String b() {
        return this.f80686a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f80686a, r52.f80686a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80687b, r52.f80687b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80686a.hashCode() * 31) + this.f80687b.hashCode();
    }

    public String toString() {
        return "TokenEntity(token=" + this.f80686a + ", expiredAt=" + this.f80687b + ")";
    }
}
