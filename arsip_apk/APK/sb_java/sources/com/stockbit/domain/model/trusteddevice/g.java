package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f86138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86139b;

    public g(String r2, String r3) {
        p.l(r2, "loginToken");
        p.l(r3, "verificationToken");
        this.f86138a = r2;
        this.f86139b = r3;
    }

    public final String a() {
        return this.f86138a;
    }

    public final String b() {
        return this.f86139b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f86138a, r52.f86138a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86139b, r52.f86139b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86138a.hashCode() * 31) + this.f86139b.hashCode();
    }

    public String toString() {
        return "RecoveryInitiateEntity(loginToken=" + this.f86138a + ", verificationToken=" + this.f86139b + ")";
    }
}
