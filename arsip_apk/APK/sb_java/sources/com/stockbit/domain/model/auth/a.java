package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80634b;

    public a(String r2, int r3) {
        p.l(r2, "challengeToken");
        this.f80633a = r2;
        this.f80634b = r3;
    }

    public final String a() {
        return this.f80633a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80633a, r52.f80633a) == true) goto L12;
        return false;
    L12:
        if (this.f80634b == r52.f80634b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80633a.hashCode() * 31) + Integer.hashCode(this.f80634b);
    }

    public String toString() {
        return "BiometricChallengeEntity(challengeToken=" + this.f80633a + ", expireInSecond=" + this.f80634b + ")";
    }
}
